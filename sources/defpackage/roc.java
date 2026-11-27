package defpackage;

import java.util.Arrays;
public final class roc implements wn {
    public final byte a;

    public roc(e00 e00Var) {
        this.a = e00Var.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof roc) && vue.a(Integer.valueOf(this.a), Integer.valueOf(((roc) obj).a)) && vue.a(1, 1) && vue.a(null, null)) {
            Boolean bool = Boolean.TRUE;
            if (vue.a(bool, bool)) {
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
