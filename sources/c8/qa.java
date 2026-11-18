package c8;

import java.util.Arrays;
public final class qa {
    public final pa f4929a;
    public final Integer f4930b;

    public qa(wf.b bVar) {
        this.f4929a = (pa) bVar.f59673b;
        this.f4930b = (Integer) bVar.f59674c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qa)) {
            return false;
        }
        qa qaVar = (qa) obj;
        if (q6.m.l(this.f4929a, qaVar.f4929a) && q6.m.l(this.f4930b, qaVar.f4930b) && q6.m.l(null, null) && q6.m.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4929a, this.f4930b, null, null});
    }
}
