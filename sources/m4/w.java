package m4;

import java.util.List;
import v7.c8;
public final class w {
    public final e9.n0 f16762a;
    public final int f16763b;
    public final long f16764c;

    public w(long j10, int i10, List list) {
        this.f16762a = e9.n0.u(list);
        this.f16763b = i10;
        this.f16764c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f16762a.equals(wVar.f16762a) && this.f16763b == wVar.f16763b && this.f16764c == wVar.f16764c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return c8.b(this.f16764c) + (((this.f16762a.hashCode() * 31) + this.f16763b) * 31);
    }
}
