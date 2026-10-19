package m4;

import java.util.List;
import v7.c8;
public final class w {
    public final e9.n0 f16764a;
    public final int f16765b;
    public final long f16766c;

    public w(long j10, int i10, List list) {
        this.f16764a = e9.n0.u(list);
        this.f16765b = i10;
        this.f16766c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f16764a.equals(wVar.f16764a) && this.f16765b == wVar.f16765b && this.f16766c == wVar.f16766c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return c8.b(this.f16766c) + (((this.f16764a.hashCode() * 31) + this.f16765b) * 31);
    }
}
