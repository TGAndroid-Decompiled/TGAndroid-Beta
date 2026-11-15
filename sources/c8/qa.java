package c8;

import java.util.Arrays;
public final class qa {
    public final pa f4645a;
    public final Integer f4646b;

    public qa(wf.b bVar) {
        this.f4645a = (pa) bVar.f59107b;
        this.f4646b = (Integer) bVar.f59108c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qa)) {
            return false;
        }
        qa qaVar = (qa) obj;
        if (q6.m.k(this.f4645a, qaVar.f4645a) && q6.m.k(this.f4646b, qaVar.f4646b) && q6.m.k(null, null) && q6.m.k(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4645a, this.f4646b, null, null});
    }
}
