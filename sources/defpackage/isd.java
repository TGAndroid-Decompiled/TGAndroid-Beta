package defpackage;

import java.util.Arrays;
public final class isd {
    public final m5f a;
    public final Boolean b;
    public final ocf c;

    public isd(rod rodVar) {
        this.a = (m5f) rodVar.b;
        this.b = (Boolean) rodVar.c;
        this.c = (ocf) rodVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof isd)) {
            return false;
        }
        isd isdVar = (isd) obj;
        if (cqe.a(this.a, isdVar.a) && cqe.a(this.b, isdVar.b) && cqe.a(null, null) && cqe.a(this.c, isdVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, this.c});
    }
}
