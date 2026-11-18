package org.telegram.messenger;

import android.content.SharedPreferences;
public final class c {
    public static volatile c[] f23220b = new c[4];
    public int f23221a;

    public static c a(int i7) {
        c cVar;
        c cVar2 = f23220b[i7];
        if (cVar2 == null) {
            synchronized (c.class) {
                try {
                    cVar = f23220b[i7];
                    if (cVar == null) {
                        c[] cVarArr = f23220b;
                        ?? obj = new Object();
                        obj.f23221a = i7;
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

    public final mp b() {
        return mp.u1(this.f23221a);
    }

    public final ks c() {
        return ks.f(this.f23221a);
    }

    public final SharedPreferences d() {
        return mp.u1(this.f23221a).f25660g7;
    }

    public final j10 e() {
        return j10.i(this.f23221a);
    }
}
