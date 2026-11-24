package defpackage;

import android.os.Bundle;
import j$.util.Objects;
public final class su6 {
    public final mw6 a;
    public final int b;
    public final int c;
    public final boolean d;
    public final ru6 e;
    public final Bundle f;

    public su6(mw6 mw6Var, int i, int i2, boolean z, ru6 ru6Var, Bundle bundle) {
        this.a = mw6Var;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = ru6Var;
        this.f = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof su6)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        su6 su6Var = (su6) obj;
        ru6 ru6Var = su6Var.e;
        ru6 ru6Var2 = this.e;
        if (ru6Var2 == null && ru6Var == null) {
            return this.a.equals(su6Var.a);
        }
        return Objects.equals(ru6Var2, ru6Var);
    }

    public final int hashCode() {
        return Objects.hash(this.e, this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ControllerInfo {pkg=");
        mw6 mw6Var = this.a;
        sb.append(mw6Var.a.a);
        sb.append(", uid=");
        return de9.l(sb, mw6Var.a.c, "}");
    }
}
