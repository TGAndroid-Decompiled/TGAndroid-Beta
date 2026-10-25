package m4;

import a8.fd;
import java.util.List;
public final class x {
    public final f9.i0 f18295a;
    public final int f18296b;
    public final long f18297c;

    public x(long j10, int i10, List list) {
        this.f18295a = f9.i0.u(list);
        this.f18296b = i10;
        this.f18297c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f18295a.equals(xVar.f18295a) && this.f18296b == xVar.f18296b && this.f18297c == xVar.f18297c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return fd.b(this.f18297c) + (((this.f18295a.hashCode() * 31) + this.f18296b) * 31);
    }
}
