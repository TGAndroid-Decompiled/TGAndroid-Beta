package m4;

import java.util.List;
import v7.a8;
public final class s {
    public final e9.i0 f14948a;
    public final int f14949b;
    public final long f14950c;

    public s(long j3, int i10, List list) {
        this.f14948a = e9.i0.v(list);
        this.f14949b = i10;
        this.f14950c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f14948a.equals(sVar.f14948a) && this.f14949b == sVar.f14949b && this.f14950c == sVar.f14950c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a8.b(this.f14950c) + (((this.f14948a.hashCode() * 31) + this.f14949b) * 31);
    }
}
