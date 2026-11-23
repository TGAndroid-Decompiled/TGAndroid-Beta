package org.telegram.messenger;

import android.content.SharedPreferences;
public final class c {
    public static volatile c[] f23342b = new c[4];
    public int f23343a;

    public static c a(int i7) {
        c cVar;
        c cVar2 = f23342b[i7];
        if (cVar2 == null) {
            synchronized (c.class) {
                try {
                    cVar = f23342b[i7];
                    if (cVar == null) {
                        c[] cVarArr = f23342b;
                        ?? obj = new Object();
                        obj.f23343a = i7;
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
        return mp.u1(this.f23343a);
    }

    public final ks c() {
        return ks.f(this.f23343a);
    }

    public final SharedPreferences d() {
        return mp.u1(this.f23343a).f25753g7;
    }

    public final i10 e() {
        return i10.i(this.f23343a);
    }
}
