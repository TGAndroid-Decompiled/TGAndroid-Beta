package org.telegram.messenger;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.LruCache;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class s10 {
    public final int f25408a;
    public final LruCache f25409b = new LruCache(100);
    public final HashMap f25410c = new HashMap();

    public s10(int i7) {
        this.f25408a = i7;
    }

    public final l7 a(String str, String str2, c20 c20Var) {
        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername;
        if (TextUtils.isEmpty(str2)) {
            LruCache lruCache = this.f25409b;
            r10 r10Var = (r10) lruCache.get(str);
            if (r10Var != null) {
                long j3 = r10Var.f25214a;
                if (System.currentTimeMillis() - r10Var.f25215b < 3600000) {
                    c20Var.a(Long.valueOf(j3));
                    a8.b("resolve username from cache " + str + " " + j3);
                    return null;
                }
                lruCache.remove(str);
            }
        }
        HashMap hashMap = this.f25410c;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList != null) {
            arrayList.add(c20Var);
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(c20Var);
        hashMap.put(str, arrayList2);
        Typeface typeface = g0.f22539a;
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
        return new l7(this, str, ConnectionsManager.getInstance(this.f25408a).sendRequest(tL_contacts_resolveUsername, new r4(10, this, str)), 23);
    }

    public final void b(TLRPC.User user, TLRPC.User user2) {
        String str;
        if (user != null && user2 != null && (str = user.username) != null && !TextUtils.equals(str, user2.username)) {
            String str2 = user.username;
            LruCache lruCache = this.f25409b;
            lruCache.remove(str2);
            String str3 = user2.username;
            if (str3 != null) {
                lruCache.put(str3, new r10(user2.f27109id));
            }
        }
    }
}
