package l7;

import java.util.Arrays;
public final class k7 {
    public final j7 f11632a;
    public final Integer f11633b;

    public k7(f7.b bVar) {
        this.f11632a = (j7) bVar.f6001b;
        this.f11633b = (Integer) bVar.f6002c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k7)) {
            return false;
        }
        k7 k7Var = (k7) obj;
        if (b6.m.l(this.f11632a, k7Var.f11632a) && b6.m.l(this.f11633b, k7Var.f11633b) && b6.m.l(null, null) && b6.m.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11632a, this.f11633b, null, null});
    }
}
