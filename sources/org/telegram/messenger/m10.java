package org.telegram.messenger;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.LruCache;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class m10 {
    public final int f25515a;
    public final LruCache f25516b = new LruCache(100);
    public final HashMap f25517c = new HashMap();

    public m10(int i7) {
        this.f25515a = i7;
    }

    public final l7 a(String str, String str2, x10 x10Var) {
        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername;
        if (TextUtils.isEmpty(str2)) {
            LruCache lruCache = this.f25516b;
            l10 l10Var = (l10) lruCache.get(str);
            if (l10Var != null) {
                long j3 = l10Var.f25322a;
                if (System.currentTimeMillis() - l10Var.f25323b < 3600000) {
                    x10Var.a(Long.valueOf(j3));
                    a8.b("resolve username from cache " + str + " " + j3);
                    return null;
                }
                lruCache.remove(str);
            }
        }
        HashMap hashMap = this.f25517c;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList != null) {
            arrayList.add(x10Var);
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(x10Var);
        hashMap.put(str, arrayList2);
        Typeface typeface = g0.f24093a;
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
        return new l7(this, str, ConnectionsManager.getInstance(this.f25515a).sendRequest(tL_contacts_resolveUsername, new t4(10, this, str)), 23);
    }

    public final void b(TLRPC.User user, TLRPC.User user2) {
        String str;
        if (user != null && user2 != null && (str = user.username) != null && !TextUtils.equals(str, user2.username)) {
            String str2 = user.username;
            LruCache lruCache = this.f25516b;
            lruCache.remove(str2);
            String str3 = user2.username;
            if (str3 != null) {
                lruCache.put(str3, new l10(user2.f28554id));
            }
        }
    }
}
