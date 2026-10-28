package m4;

import a8.fd;
import java.util.List;
public final class x {
    public final f9.i0 f18294a;
    public final int f18295b;
    public final long f18296c;

    public x(long j10, int i10, List list) {
        this.f18294a = f9.i0.u(list);
        this.f18295b = i10;
        this.f18296c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f18294a.equals(xVar.f18294a) && this.f18295b == xVar.f18295b && this.f18296c == xVar.f18296c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return fd.b(this.f18296c) + (((this.f18294a.hashCode() * 31) + this.f18295b) * 31);
    }
}
