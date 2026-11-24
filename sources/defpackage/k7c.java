package defpackage;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.LruCache;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class k7c {
    public final int a;
    public final LruCache b = new LruCache(100);
    public final HashMap c = new HashMap();

    public k7c(int i) {
        this.a = i;
    }

    public final t79 a(String str, String str2, p8c p8cVar) {
        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername;
        if (TextUtils.isEmpty(str2)) {
            LruCache lruCache = this.b;
            j7c j7cVar = (j7c) lruCache.get(str);
            if (j7cVar != null) {
                long j = j7cVar.a;
                if (System.currentTimeMillis() - j7cVar.b < 3600000) {
                    p8cVar.a(Long.valueOf(j));
                    fa4.b("resolve username from cache " + str + " " + j);
                    return null;
                }
                lruCache.remove(str);
            }
        }
        HashMap hashMap = this.c;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList != null) {
            arrayList.add(p8cVar);
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(p8cVar);
        hashMap.put(str, arrayList2);
        Typeface typeface = gl.a;
        try {
            Double.parseDouble(str);
            TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
            tL_contacts_resolvePhone.phone = str;
            tL_contacts_resolveUsername = tL_contacts_resolvePhone;
        } catch (NumberFormatException unused) {
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername2 = new TLRPC.TL_contacts_resolveUsername();
            tL_contacts_resolveUsername2.username = str;
            if (!TextUtils.isEmpty(str2)) {
                tL_contacts_resolveUsername2.flags |= 1;
                tL_contacts_resolveUsername2.referer = str2;
            }
            tL_contacts_resolveUsername = tL_contacts_resolveUsername2;
        }
        return new t79(this, str, ConnectionsManager.getInstance(this.a).sendRequest(tL_contacts_resolveUsername, new apa(this, str, (byte) 20)), (byte) 28);
    }

    public final void b(TLRPC.User user, TLRPC.User user2) {
        String str;
        if (user != null && user2 != null && (str = user.username) != null && !TextUtils.equals(str, user2.username)) {
            String str2 = user.username;
            LruCache lruCache = this.b;
            lruCache.remove(str2);
            String str3 = user2.username;
            if (str3 != null) {
                lruCache.put(str3, new j7c(user2.id));
            }
        }
    }
}
