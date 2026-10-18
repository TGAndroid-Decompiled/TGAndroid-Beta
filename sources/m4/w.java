package m4;

import java.util.List;
import v7.c8;
public final class w {
    public final e9.n0 f16761a;
    public final int f16762b;
    public final long f16763c;

    public w(long j10, int i10, List list) {
        this.f16761a = e9.n0.u(list);
        this.f16762b = i10;
        this.f16763c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f16761a.equals(wVar.f16761a) && this.f16762b == wVar.f16762b && this.f16763c == wVar.f16763c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return c8.b(this.f16763c) + (((this.f16761a.hashCode() * 31) + this.f16762b) * 31);
    }
}
