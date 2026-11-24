package defpackage;

import j$.util.Objects;
public final class mx2 {
    public String a;
    public String b;
    public String c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mx2.class == obj.getClass()) {
            mx2 mx2Var = (mx2) obj;
            if (Objects.equals(this.a, mx2Var.a) && Objects.equals(this.c, mx2Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.c);
    }
}
