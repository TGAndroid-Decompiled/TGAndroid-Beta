package l7;

import java.util.Arrays;
public final class k7 {
    public final j7 f11911a;
    public final Integer f11912b;

    public k7(f7.b bVar) {
        this.f11911a = (j7) bVar.f6120b;
        this.f11912b = (Integer) bVar.f6121c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k7)) {
            return false;
        }
        k7 k7Var = (k7) obj;
        if (b6.m.l(this.f11911a, k7Var.f11911a) && b6.m.l(this.f11912b, k7Var.f11912b) && b6.m.l(null, null) && b6.m.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11911a, this.f11912b, null, null});
    }
}
