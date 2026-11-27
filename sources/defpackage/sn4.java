package defpackage;

import j$.util.Objects;
import java.util.List;
public final class sn4 {
    public String a;
    public String b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn4)) {
            return false;
        }
        sn4 sn4Var = (sn4) obj;
        if (Objects.equals(this.a, sn4Var.a) && Objects.equals(this.b, sn4Var.b) && Objects.equals(this.c, sn4Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
