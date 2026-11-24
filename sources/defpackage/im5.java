package defpackage;

import java.util.Arrays;
public final class im5 {
    public static final im5 b;
    public final float a;

    static {
        ?? obj = new Object();
        obj.a = 0.5f;
        b = new im5(obj);
    }

    public im5(xk4 xk4Var) {
        this.a = xk4Var.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof im5)) {
            return false;
        }
        im5 im5Var = (im5) obj;
        if (im5.class.equals(im5.class) && Float.compare(this.a, im5Var.a) == 0 && fse.a(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{im5.class, Float.valueOf(this.a), null});
    }
}
