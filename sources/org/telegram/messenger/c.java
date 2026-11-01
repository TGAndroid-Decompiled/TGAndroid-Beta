package org.telegram.messenger;

import android.content.SharedPreferences;
public final class c {
    public static volatile c[] f15042b = new c[4];
    public int f15043a;

    public static c a(int i10) {
        c cVar;
        c cVar2 = f15042b[i10];
        if (cVar2 == null) {
            synchronized (c.class) {
                try {
                    cVar = f15042b[i10];
                    if (cVar == null) {
                        c[] cVarArr = f15042b;
                        ?? obj = new Object();
                        obj.f15043a = i10;
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

    public final at b() {
        return at.f(this.f15043a);
    }

    public final SharedPreferences c() {
        return wp.r1(this.f15043a).e7;
    }

    public final e20 d() {
        return e20.i(this.f15043a);
    }
}
