package m4;

import java.util.List;
import v7.c8;
public final class w {
    public final e9.n0 f16756a;
    public final int f16757b;
    public final long f16758c;

    public w(long j10, int i10, List list) {
        this.f16756a = e9.n0.u(list);
        this.f16757b = i10;
        this.f16758c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f16756a.equals(wVar.f16756a) && this.f16757b == wVar.f16757b && this.f16758c == wVar.f16758c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return c8.b(this.f16758c) + (((this.f16756a.hashCode() * 31) + this.f16757b) * 31);
    }
}
