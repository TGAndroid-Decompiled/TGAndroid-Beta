package i7;

import java.util.Arrays;

public final class j7 {

    public final i7 f10688a;

    public final Integer f10689b;

    public j7(g5.b bVar) {
        this.f10688a = (i7) bVar.f6389b;
        this.f10689b = (Integer) bVar.f6390c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j7)) {
            return false;
        }
        j7 j7Var = (j7) obj;
        return y5.l.l(this.f10688a, j7Var.f10688a) && y5.l.l(this.f10689b, j7Var.f10689b) && y5.l.l(null, null) && y5.l.l(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10688a, this.f10689b, null, null});
    }
}
