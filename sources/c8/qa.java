package c8;

import java.util.Arrays;
public final class qa {
    public final pa f4958a;
    public final Integer f4959b;

    public qa(wf.b bVar) {
        this.f4958a = (pa) bVar.f59711b;
        this.f4959b = (Integer) bVar.f59712c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qa)) {
            return false;
        }
        qa qaVar = (qa) obj;
        if (q6.m.l(this.f4958a, qaVar.f4958a) && q6.m.l(this.f4959b, qaVar.f4959b) && q6.m.l(null, null) && q6.m.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4958a, this.f4959b, null, null});
    }
}
