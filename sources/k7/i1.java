package k7;

import java.util.Arrays;

public final class i1 {

    public final gb f14816a;

    public final Boolean f14817b;

    public final ve f14818c;

    public i1(j9.a aVar) {
        this.f14816a = (gb) aVar.f12863b;
        this.f14817b = (Boolean) aVar.f12864c;
        this.f14818c = (ve) aVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return y5.l.l(this.f14816a, i1Var.f14816a) && y5.l.l(this.f14817b, i1Var.f14817b) && y5.l.l(null, null) && y5.l.l(this.f14818c, i1Var.f14818c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14816a, this.f14817b, null, this.f14818c});
    }
}
