package i7;

import java.util.Arrays;

public final class m8 {

    public final Float f10738a;

    public m8(ga.c cVar) {
        this.f10738a = (Float) cVar.f6834b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m8) {
            return y5.l.l(null, null) && y5.l.l(this.f10738a, ((m8) obj).f10738a) && y5.l.l(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, this.f10738a, null});
    }
}
