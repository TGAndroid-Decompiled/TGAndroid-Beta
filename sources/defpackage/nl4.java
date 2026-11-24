package defpackage;

import j$.util.Objects;
import java.util.List;
public final class nl4 {
    public String a;
    public String b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl4)) {
            return false;
        }
        nl4 nl4Var = (nl4) obj;
        if (Objects.equals(this.a, nl4Var.a) && Objects.equals(this.b, nl4Var.b) && Objects.equals(this.c, nl4Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
