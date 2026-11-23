package c8;

import java.util.Arrays;
public final class qa {
    public final pa f4926a;
    public final Integer f4927b;

    public qa(wf.b bVar) {
        this.f4926a = (pa) bVar.f59680b;
        this.f4927b = (Integer) bVar.f59681c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qa)) {
            return false;
        }
        qa qaVar = (qa) obj;
        if (q6.m.l(this.f4926a, qaVar.f4926a) && q6.m.l(this.f4927b, qaVar.f4927b) && q6.m.l(null, null) && q6.m.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4926a, this.f4927b, null, null});
    }
}
