package a8;

import java.util.Arrays;
public final class p7 {
    public final o7 f576a;
    public final Integer f577b;

    public p7(wf.b bVar) {
        this.f576a = (o7) bVar.f57538b;
        this.f577b = (Integer) bVar.f57539c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p7)) {
            return false;
        }
        p7 p7Var = (p7) obj;
        if (q6.m.k(this.f576a, p7Var.f576a) && q6.m.k(this.f577b, p7Var.f577b) && q6.m.k(null, null) && q6.m.k(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f576a, this.f577b, null, null});
    }
}
