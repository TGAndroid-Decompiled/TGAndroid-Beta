package defpackage;

import android.os.Bundle;
import j$.util.Objects;
public final class xw6 {
    public final ry6 a;
    public final int b;
    public final int c;
    public final boolean d;
    public final ww6 e;
    public final Bundle f;

    public xw6(ry6 ry6Var, int i, int i2, boolean z, ww6 ww6Var, Bundle bundle) {
        this.a = ry6Var;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = ww6Var;
        this.f = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xw6)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        xw6 xw6Var = (xw6) obj;
        ww6 ww6Var = xw6Var.e;
        ww6 ww6Var2 = this.e;
        if (ww6Var2 == null && ww6Var == null) {
            return this.a.equals(xw6Var.a);
        }
        return Objects.equals(ww6Var2, ww6Var);
    }

    public final int hashCode() {
        return Objects.hash(this.e, this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ControllerInfo {pkg=");
        ry6 ry6Var = this.a;
        sb.append(ry6Var.a.a);
        sb.append(", uid=");
        return uh9.l(sb, ry6Var.a.c, "}");
    }
}
