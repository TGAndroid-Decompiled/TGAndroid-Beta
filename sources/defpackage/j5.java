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

    public final na7 b() {
        return na7.q1(this.a);
    }

    public final kk7 c() {
        return kk7.f(this.a);
    }

    public final SharedPreferences d() {
        return na7.q1(this.a).W3;
    }

    public final y6c e() {
        return y6c.h(this.a);
    }
}
