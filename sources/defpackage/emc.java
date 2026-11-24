package defpackage;

import java.util.Arrays;
public final class emc implements wo {
    public final byte a;

    public emc(d10 d10Var) {
        this.a = d10Var.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof emc) && fse.a(Integer.valueOf(this.a), Integer.valueOf(((emc) obj).a)) && fse.a(1, 1) && fse.a(null, null)) {
            Boolean bool = Boolean.TRUE;
            if (fse.a(bool, bool)) {
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
