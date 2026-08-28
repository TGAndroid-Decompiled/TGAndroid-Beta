package h7;

import java.util.Arrays;
public final class j7 {
    public final i7 f9979a;
    public final Integer f9980b;

    public j7(g5.b bVar) {
        this.f9979a = (i7) bVar.f7111b;
        this.f9980b = (Integer) bVar.f7112c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j7)) {
            return false;
        }
        j7 j7Var = (j7) obj;
        if (x5.l.l(this.f9979a, j7Var.f9979a) && x5.l.l(this.f9980b, j7Var.f9980b) && x5.l.l(null, null) && x5.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9979a, this.f9980b, null, null});
    }
}
