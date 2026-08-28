package j7;

import java.util.Arrays;
public final class i1 {
    public final gb f13962a;
    public final Boolean f13963b;
    public final ve f13964c;

    public i1(j4.c cVar) {
        this.f13962a = (gb) cVar.f13431b;
        this.f13963b = (Boolean) cVar.f13432c;
        this.f13964c = (ve) cVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (x5.l.l(this.f13962a, i1Var.f13962a) && x5.l.l(this.f13963b, i1Var.f13963b) && x5.l.l(null, null) && x5.l.l(this.f13964c, i1Var.f13964c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13962a, this.f13963b, null, this.f13964c});
    }
}
