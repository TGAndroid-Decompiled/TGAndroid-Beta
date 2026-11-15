package c8;

import java.util.Arrays;
public final class qa {
    public final pa f4648a;
    public final Integer f4649b;

    public qa(wf.b bVar) {
        this.f4648a = (pa) bVar.f59107b;
        this.f4649b = (Integer) bVar.f59108c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qa)) {
            return false;
        }
        qa qaVar = (qa) obj;
        if (q6.m.k(this.f4648a, qaVar.f4648a) && q6.m.k(this.f4649b, qaVar.f4649b) && q6.m.k(null, null) && q6.m.k(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4648a, this.f4649b, null, null});
    }
}
