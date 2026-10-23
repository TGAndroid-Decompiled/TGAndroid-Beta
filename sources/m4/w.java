package m4;

import java.util.List;
import v7.c8;
public final class w {
    public final e9.n0 f16825a;
    public final int f16826b;
    public final long f16827c;

    public w(long j10, int i10, List list) {
        this.f16825a = e9.n0.u(list);
        this.f16826b = i10;
        this.f16827c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f16825a.equals(wVar.f16825a) && this.f16826b == wVar.f16826b && this.f16827c == wVar.f16827c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return c8.b(this.f16827c) + (((this.f16825a.hashCode() * 31) + this.f16826b) * 31);
    }
}
