package c8;

import java.util.Arrays;
public final class qa {
    public final pa f4932a;
    public final Integer f4933b;

    public qa(wf.b bVar) {
        this.f4932a = (pa) bVar.f59672b;
        this.f4933b = (Integer) bVar.f59673c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qa)) {
            return false;
        }
        qa qaVar = (qa) obj;
        if (q6.m.l(this.f4932a, qaVar.f4932a) && q6.m.l(this.f4933b, qaVar.f4933b) && q6.m.l(null, null) && q6.m.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4932a, this.f4933b, null, null});
    }
}
