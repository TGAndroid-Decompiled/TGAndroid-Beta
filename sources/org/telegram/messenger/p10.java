package org.telegram.messenger;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.LruCache;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class p10 {
    public final int f25878a;
    public final LruCache f25879b = new LruCache(100);
    public final HashMap f25880c = new HashMap();

    public p10(int i7) {
        this.f25878a = i7;
    }

    public final l7 a(String str, String str2, z10 z10Var) {
        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername;
        if (TextUtils.isEmpty(str2)) {
            LruCache lruCache = this.f25879b;
            o10 o10Var = (o10) lruCache.get(str);
            if (o10Var != null) {
                long j3 = o10Var.f25704a;
                if (System.currentTimeMillis() - o10Var.f25705b < 3600000) {
                    z10Var.a(Long.valueOf(j3));
                    a8.b("resolve username from cache " + str + " " + j3);
                    return null;
                }
                lruCache.remove(str);
            }
        }
        HashMap hashMap = this.f25880c;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList != null) {
            arrayList.add(z10Var);
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(z10Var);
        hashMap.put(str, arrayList2);
        Typeface typeface = g0.f23583a;
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
        return new l7(this, str, ConnectionsManager.getInstance(this.f25878a).sendRequest(tL_contacts_resolveUsername, new r4(10, this, str)), 23);
    }

    public final void b(TLRPC.User user, TLRPC.User user2) {
        String str;
        if (user != null && user2 != null && (str = user.username) != null && !TextUtils.equals(str, user2.username)) {
            String str2 = user.username;
            LruCache lruCache = this.f25879b;
            lruCache.remove(str2);
            String str3 = user2.username;
            if (str3 != null) {
                lruCache.put(str3, new o10(user2.f28200id));
            }
        }
    }
}
