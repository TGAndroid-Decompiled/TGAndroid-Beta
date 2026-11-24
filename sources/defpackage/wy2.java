package defpackage;

import j$.util.Objects;
public final class wy2 {
    public String a;
    public String b;
    public String c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wy2.class == obj.getClass()) {
            wy2 wy2Var = (wy2) obj;
            if (Objects.equals(this.a, wy2Var.a) && Objects.equals(this.c, wy2Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.c);
    }
}
