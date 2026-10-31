package m4;

import java.util.List;
import v7.d8;
public final class x {
    public final e9.n0 f12986a;
    public final int f12987b;
    public final long f12988c;

    public x(List list, int i10, long j10) {
        this.f12986a = e9.n0.u(list);
        this.f12987b = i10;
        this.f12988c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f12986a.equals(xVar.f12986a) && this.f12987b == xVar.f12987b && this.f12988c == xVar.f12988c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return d8.b(this.f12988c) + (((this.f12986a.hashCode() * 31) + this.f12987b) * 31);
    }
}
