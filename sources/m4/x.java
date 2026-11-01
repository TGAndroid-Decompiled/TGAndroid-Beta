package m4;

import java.util.List;
import v7.d8;
public final class x {
    public final e9.n0 f12987a;
    public final int f12988b;
    public final long f12989c;

    public x(List list, int i10, long j10) {
        this.f12987a = e9.n0.u(list);
        this.f12988b = i10;
        this.f12989c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f12987a.equals(xVar.f12987a) && this.f12988b == xVar.f12988b && this.f12989c == xVar.f12989c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return d8.b(this.f12989c) + (((this.f12987a.hashCode() * 31) + this.f12988b) * 31);
    }
}
