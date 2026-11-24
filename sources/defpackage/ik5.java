package defpackage;

import java.util.Arrays;
public final class ik5 {
    public static final ik5 b;
    public final float a;

    static {
        ?? obj = new Object();
        obj.a = 0.5f;
        b = new ik5(obj);
    }

    public ik5(ti4 ti4Var) {
        this.a = ti4Var.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ik5)) {
            return false;
        }
        ik5 ik5Var = (ik5) obj;
        if (ik5.class.equals(ik5.class) && Float.compare(this.a, ik5Var.a) == 0 && cqe.a(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{ik5.class, Float.valueOf(this.a), null});
    }
}
