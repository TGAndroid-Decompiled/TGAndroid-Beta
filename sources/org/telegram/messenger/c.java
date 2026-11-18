package org.telegram.messenger;

import android.content.SharedPreferences;
public final class c {
    public static volatile c[] f23217b = new c[4];
    public int f23218a;

    public static c a(int i7) {
        c cVar;
        c cVar2 = f23217b[i7];
        if (cVar2 == null) {
            synchronized (c.class) {
                try {
                    cVar = f23217b[i7];
                    if (cVar == null) {
                        c[] cVarArr = f23217b;
                        ?? obj = new Object();
                        obj.f23218a = i7;
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
        return mp.u1(this.f23218a);
    }

    public final ks c() {
        return ks.f(this.f23218a);
    }

    public final SharedPreferences d() {
        return mp.u1(this.f23218a).f25658g7;
    }

    public final j10 e() {
        return j10.i(this.f23218a);
    }
}
