package defpackage;

import android.os.Bundle;
import j$.util.Objects;
public final class sw6 {
    public final my6 a;
    public final int b;
    public final int c;
    public final boolean d;
    public final rw6 e;
    public final Bundle f;

    public sw6(my6 my6Var, int i, int i2, boolean z, rw6 rw6Var, Bundle bundle) {
        this.a = my6Var;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = rw6Var;
        this.f = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sw6)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        sw6 sw6Var = (sw6) obj;
        rw6 rw6Var = sw6Var.e;
        rw6 rw6Var2 = this.e;
        if (rw6Var2 == null && rw6Var == null) {
            return this.a.equals(sw6Var.a);
        }
        return Objects.equals(rw6Var2, rw6Var);
    }

    public final int hashCode() {
        return Objects.hash(this.e, this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ControllerInfo {pkg=");
        my6 my6Var = this.a;
        sb.append(my6Var.a.a);
        sb.append(", uid=");
        return hg9.k(sb, my6Var.a.c, "}");
    }
}
