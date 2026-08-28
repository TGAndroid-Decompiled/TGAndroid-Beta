package j7;

import java.util.Arrays;
public final class ra {
    public final qa f14087a;
    public final Integer f14088b;

    public ra(g5.b bVar) {
        this.f14087a = (qa) bVar.f7111b;
        this.f14088b = (Integer) bVar.f7112c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        if (x5.l.l(this.f14087a, raVar.f14087a) && x5.l.l(this.f14088b, raVar.f14088b) && x5.l.l(null, null) && x5.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14087a, this.f14088b, null, null});
    }
}
