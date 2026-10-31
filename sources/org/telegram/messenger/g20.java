package org.telegram.messenger;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.LruCache;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class g20 {
    public final int f15662a;
    public final LruCache f15663b = new LruCache(100);
    public final HashMap f15664c = new HashMap();

    public g20(int i10) {
        this.f15662a = i10;
    }

    public final o7 a(String str, String str2, q20 q20Var) {
        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername;
        if (TextUtils.isEmpty(str2)) {
            LruCache lruCache = this.f15663b;
            f20 f20Var = (f20) lruCache.get(str);
            if (f20Var != null) {
                long j10 = f20Var.f15502a;
                if (System.currentTimeMillis() - f20Var.f15503b < 3600000) {
                    q20Var.a(Long.valueOf(j10));
                    f8.b("resolve username from cache " + str + " " + j10);
                    return null;
                }
                lruCache.remove(str);
            }
        }
        HashMap hashMap = this.f15664c;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList != null) {
            arrayList.add(q20Var);
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(q20Var);
        hashMap.put(str, arrayList2);
        Typeface typeface = i0.f15999a;
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
        return new o7(this, str, ConnectionsManager.getInstance(this.f15662a).sendRequest(tL_contacts_resolveUsername, new v4(11, this, str)), 23);
    }

    public final void b(TLRPC.User user, TLRPC.User user2) {
        String str;
        if (user != null && user2 != null && (str = user.username) != null && !TextUtils.equals(str, user2.username)) {
            String str2 = user.username;
            LruCache lruCache = this.f15663b;
            lruCache.remove(str2);
            String str3 = user2.username;
            if (str3 != null) {
                lruCache.put(str3, new f20(user2.f19942id));
            }
        }
    }
}
