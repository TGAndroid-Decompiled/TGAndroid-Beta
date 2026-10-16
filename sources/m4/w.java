package m4;

import java.util.List;
import v7.c8;
public final class w {
    public final e9.n0 f15404a;
    public final int f15405b;
    public final long f15406c;

    public w(long j10, int i10, List list) {
        this.f15404a = e9.n0.u(list);
        this.f15405b = i10;
        this.f15406c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f15404a.equals(wVar.f15404a) && this.f15405b == wVar.f15405b && this.f15406c == wVar.f15406c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return c8.b(this.f15406c) + (((this.f15404a.hashCode() * 31) + this.f15405b) * 31);
    }
}
