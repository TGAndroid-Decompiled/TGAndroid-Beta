package defpackage;

import j$.util.Objects;
public final class gy2 {
    public String a;
    public String b;
    public String c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gy2.class == obj.getClass()) {
            gy2 gy2Var = (gy2) obj;
            if (Objects.equals(this.a, gy2Var.a) && Objects.equals(this.c, gy2Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.c);
    }
}
