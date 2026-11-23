package c8;

import java.util.Arrays;
public final class qa {
    public final pa f4961a;
    public final Integer f4962b;

    public qa(wf.b bVar) {
        this.f4961a = (pa) bVar.f59715b;
        this.f4962b = (Integer) bVar.f59716c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qa)) {
            return false;
        }
        qa qaVar = (qa) obj;
        if (q6.m.l(this.f4961a, qaVar.f4961a) && q6.m.l(this.f4962b, qaVar.f4962b) && q6.m.l(null, null) && q6.m.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4961a, this.f4962b, null, null});
    }
}
