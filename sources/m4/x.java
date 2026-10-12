package m4;

import java.util.List;
import v7.c8;
public final class x {
    public final e9.n0 f15674a;
    public final int f15675b;
    public final long f15676c;

    public x(long j10, int i10, List list) {
        this.f15674a = e9.n0.u(list);
        this.f15675b = i10;
        this.f15676c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f15674a.equals(xVar.f15674a) && this.f15675b == xVar.f15675b && this.f15676c == xVar.f15676c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return c8.b(this.f15676c) + (((this.f15674a.hashCode() * 31) + this.f15675b) * 31);
    }
}
