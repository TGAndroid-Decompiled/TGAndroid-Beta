package m4;

import java.util.List;
import v7.c8;
public final class w {
    public final e9.n0 f16763a;
    public final int f16764b;
    public final long f16765c;

    public w(long j10, int i10, List list) {
        this.f16763a = e9.n0.u(list);
        this.f16764b = i10;
        this.f16765c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f16763a.equals(wVar.f16763a) && this.f16764b == wVar.f16764b && this.f16765c == wVar.f16765c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return c8.b(this.f16765c) + (((this.f16763a.hashCode() * 31) + this.f16764b) * 31);
    }
}
