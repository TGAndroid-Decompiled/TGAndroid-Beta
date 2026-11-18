package a8;

import java.util.Arrays;
public final class p7 {
    public final o7 f580a;
    public final Integer f581b;

    public p7(wf.b bVar) {
        this.f580a = (o7) bVar.f59672b;
        this.f581b = (Integer) bVar.f59673c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p7)) {
            return false;
        }
        p7 p7Var = (p7) obj;
        if (q6.m.l(this.f580a, p7Var.f580a) && q6.m.l(this.f581b, p7Var.f581b) && q6.m.l(null, null) && q6.m.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f580a, this.f581b, null, null});
    }
}
