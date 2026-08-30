package l7;

import java.util.Arrays;
public final class k7 {
    public final j7 f11522a;
    public final Integer f11523b;

    public k7(f7.b bVar) {
        this.f11522a = (j7) bVar.f6012b;
        this.f11523b = (Integer) bVar.f6013c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k7)) {
            return false;
        }
        k7 k7Var = (k7) obj;
        if (b6.m.l(this.f11522a, k7Var.f11522a) && b6.m.l(this.f11523b, k7Var.f11523b) && b6.m.l(null, null) && b6.m.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11522a, this.f11523b, null, null});
    }
}
