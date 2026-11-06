package org.telegram.messenger;

import android.content.SharedPreferences;
public final class c {
    public static volatile c[] f21722b = new c[4];
    public int f21723a;

    public static c a(int i7) {
        c cVar;
        c cVar2 = f21722b[i7];
        if (cVar2 == null) {
            synchronized (c.class) {
                try {
                    cVar = f21722b[i7];
                    if (cVar == null) {
                        c[] cVarArr = f21722b;
                        ?? obj = new Object();
                        obj.f21723a = i7;
                        cVarArr[i7] = obj;
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

    public final qs b() {
        return qs.f(this.f21723a);
    }

    public final SharedPreferences c() {
        return qp.s1(this.f21723a).f24749d7;
    }

    public final p10 d() {
        return p10.i(this.f21723a);
    }
}
