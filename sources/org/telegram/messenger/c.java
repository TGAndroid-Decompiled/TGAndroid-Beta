package org.telegram.messenger;

import android.content.SharedPreferences;
public final class c {
    public static volatile c[] f14862b = new c[4];
    public int f14863a;

    public static c a(int i10) {
        c cVar;
        c cVar2 = f14862b[i10];
        if (cVar2 == null) {
            synchronized (c.class) {
                try {
                    cVar = f14862b[i10];
                    if (cVar == null) {
                        c[] cVarArr = f14862b;
                        ?? obj = new Object();
                        obj.f14863a = i10;
                        cVarArr[i10] = obj;
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

    public final zs b() {
        return zs.f(this.f14863a);
    }

    public final SharedPreferences c() {
        return vp.r1(this.f14863a).e7;
    }

    public final d20 d() {
        return d20.i(this.f14863a);
    }
}
