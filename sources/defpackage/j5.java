package defpackage;

import android.content.SharedPreferences;
public final class j5 {
    public static volatile j5[] b = new j5[4];
    public int a;

    public static j5 a(int i) {
        j5 j5Var;
        j5 j5Var2 = b[i];
        if (j5Var2 == null) {
            synchronized (j5.class) {
                j5Var = b[i];
                if (j5Var == null) {
                    j5[] j5VarArr = b;
                    ?? obj = new Object();
                    obj.a = i;
                    j5VarArr[i] = obj;
                    j5Var = obj;
                }
            }
            return j5Var;
        }
        return j5Var2;
    }

    public final oc7 b() {
        return oc7.r1(this.a);
    }

    public final nm7 c() {
        return nm7.f(this.a);
    }

    public final SharedPreferences d() {
        return oc7.r1(this.a).W3;
    }

    public final z8c e() {
        return z8c.h(this.a);
    }
}
