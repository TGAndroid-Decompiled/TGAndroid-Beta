package defpackage;

import android.content.SharedPreferences;
public final class k5 {
    public static volatile k5[] b = new k5[4];
    public int a;

    public static k5 a(int i) {
        k5 k5Var;
        k5 k5Var2 = b[i];
        if (k5Var2 == null) {
            synchronized (k5.class) {
                k5Var = b[i];
                if (k5Var == null) {
                    k5[] k5VarArr = b;
                    ?? obj = new Object();
                    obj.a = i;
                    k5VarArr[i] = obj;
                    k5Var = obj;
                }
            }
            return k5Var;
        }
        return k5Var2;
    }

    public final uc7 b() {
        return uc7.s1(this.a);
    }

    public final jn7 c() {
        return jn7.f(this.a);
    }

    public final SharedPreferences d() {
        return uc7.s1(this.a).X3;
    }

    public final yac e() {
        return yac.h(this.a);
    }
}
