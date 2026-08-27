package k7;

import java.util.Arrays;

public final class ra {

    public final qa f14941a;

    public final Integer f14942b;

    public ra(g5.b bVar) {
        this.f14941a = (qa) bVar.f6389b;
        this.f14942b = (Integer) bVar.f6390c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        return y5.l.l(this.f14941a, raVar.f14941a) && y5.l.l(this.f14942b, raVar.f14942b) && y5.l.l(null, null) && y5.l.l(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14941a, this.f14942b, null, null});
    }
}
