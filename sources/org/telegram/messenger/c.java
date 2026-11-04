package org.telegram.messenger;

import android.content.SharedPreferences;
public final class c {
    public static volatile c[] f21918b = new c[4];
    public int f21919a;

    public static c a(int i3) {
        c cVar;
        c cVar2 = f21918b[i3];
        if (cVar2 == null) {
            synchronized (c.class) {
                try {
                    cVar = f21918b[i3];
                    if (cVar == null) {
                        c[] cVarArr = f21918b;
                        ?? obj = new Object();
                        obj.f21919a = i3;
                        cVarArr[i3] = obj;
                        cVar = obj;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return cVar;
        }
        return cVar2;
    }

    public final hs b() {
        return hs.f(this.f21919a);
    }

    public final SharedPreferences c() {
        return hp.s1(this.f21919a).f22989d7;
    }

    public final h10 d() {
        return h10.i(this.f21919a);
    }
}
