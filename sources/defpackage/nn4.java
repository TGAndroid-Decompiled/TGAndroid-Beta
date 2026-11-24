package defpackage;

import j$.util.Objects;
import java.util.List;
public final class nn4 {
    public String a;
    public String b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn4)) {
            return false;
        }
        nn4 nn4Var = (nn4) obj;
        if (Objects.equals(this.a, nn4Var.a) && Objects.equals(this.b, nn4Var.b) && Objects.equals(this.c, nn4Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
