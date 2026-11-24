package defpackage;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.LruCache;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class l9c {
    public final int a;
    public final LruCache b = new LruCache(100);
    public final HashMap c = new HashMap();

    public l9c(int i) {
        this.a = i;
    }

    public final v99 a(String str, String str2, qac qacVar) {
        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername;
        if (TextUtils.isEmpty(str2)) {
            LruCache lruCache = this.b;
            k9c k9cVar = (k9c) lruCache.get(str);
            if (k9cVar != null) {
                long j = k9cVar.a;
                if (System.currentTimeMillis() - k9cVar.b < 3600000) {
                    qacVar.a(Long.valueOf(j));
                    fc4.b("resolve username from cache " + str + " " + j);
                    return null;
                }
                lruCache.remove(str);
            }
        }
        HashMap hashMap = this.c;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList != null) {
            arrayList.add(qacVar);
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(qacVar);
        hashMap.put(str, arrayList2);
        Typeface typeface = gm.a;
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
        return new v99(this, str, ConnectionsManager.getInstance(this.a).sendRequest(tL_contacts_resolveUsername, new ara(this, str, (byte) 20)), (byte) 28);
    }

    public final void b(TLRPC.User user, TLRPC.User user2) {
        String str;
        if (user != null && user2 != null && (str = user.username) != null && !TextUtils.equals(str, user2.username)) {
            String str2 = user.username;
            LruCache lruCache = this.b;
            lruCache.remove(str2);
            String str3 = user2.username;
            if (str3 != null) {
                lruCache.put(str3, new k9c(user2.id));
            }
        }
    }
}
