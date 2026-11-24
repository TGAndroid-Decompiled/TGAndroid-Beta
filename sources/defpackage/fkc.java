package defpackage;

import java.util.Arrays;
public final class fkc implements vn {
    public final byte a;

    public fkc(d00 d00Var) {
        this.a = d00Var.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof fkc) && cqe.a(Integer.valueOf(this.a), Integer.valueOf(((fkc) obj).a)) && cqe.a(1, 1) && cqe.a(null, null)) {
            Boolean bool = Boolean.TRUE;
            if (cqe.a(bool, bool)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), 1, null, Boolean.TRUE});
    }
}
