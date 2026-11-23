package org.telegram.messenger;

import android.content.SharedPreferences;
public final class c {
    public static volatile c[] f23165b = new c[4];
    public int f23166a;

    public static c a(int i7) {
        c cVar;
        c cVar2 = f23165b[i7];
        if (cVar2 == null) {
            synchronized (c.class) {
                try {
                    cVar = f23165b[i7];
                    if (cVar == null) {
                        c[] cVarArr = f23165b;
                        ?? obj = new Object();
                        obj.f23166a = i7;
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

    public final np b() {
        return np.u1(this.f23166a);
    }

    public final ls c() {
        return ls.f(this.f23166a);
    }

    public final SharedPreferences d() {
        return np.u1(this.f23166a).f25821g7;
    }

    public final k10 e() {
        return k10.i(this.f23166a);
    }
}
