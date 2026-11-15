package org.telegram.messenger;

import android.content.SharedPreferences;
public final class c {
    public static volatile c[] f22777b = new c[4];
    public int f22778a;

    public static c a(int i7) {
        c cVar;
        c cVar2 = f22777b[i7];
        if (cVar2 == null) {
            synchronized (c.class) {
                try {
                    cVar = f22777b[i7];
                    if (cVar == null) {
                        c[] cVarArr = f22777b;
                        ?? obj = new Object();
                        obj.f22778a = i7;
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
        return np.s1(this.f22778a);
    }

    public final ns c() {
        return ns.f(this.f22778a);
    }

    public final SharedPreferences d() {
        return np.s1(this.f22778a).f25270e7;
    }

    public final m10 e() {
        return m10.i(this.f22778a);
    }
}
