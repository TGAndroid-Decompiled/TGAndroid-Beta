package defpackage;

import java.util.Arrays;
public final class lm5 {
    public static final lm5 b;
    public final float a;

    static {
        ?? obj = new Object();
        obj.a = 0.5f;
        b = new lm5(obj);
    }

    public lm5(xk4 xk4Var) {
        this.a = xk4Var.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lm5)) {
            return false;
        }
        lm5 lm5Var = (lm5) obj;
        if (lm5.class.equals(lm5.class) && Float.compare(this.a, lm5Var.a) == 0 && vue.a(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{lm5.class, Float.valueOf(this.a), null});
    }
}
