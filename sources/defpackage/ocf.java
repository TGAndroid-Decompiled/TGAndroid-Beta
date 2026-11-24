package defpackage;

import java.util.Arrays;
public final class ocf {
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;

    public ocf(gl2 gl2Var) {
        this.a = (Boolean) gl2Var.b;
        this.b = (Boolean) gl2Var.c;
        this.c = (Boolean) gl2Var.d;
        this.d = (Boolean) gl2Var.e;
        this.e = (Boolean) gl2Var.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ocf)) {
            return false;
        }
        ocf ocfVar = (ocf) obj;
        if (cqe.a(this.a, ocfVar.a) && cqe.a(this.b, ocfVar.b) && cqe.a(this.c, ocfVar.c) && cqe.a(this.d, ocfVar.d) && cqe.a(this.e, ocfVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }
}
