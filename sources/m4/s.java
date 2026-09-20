package m4;

import java.util.List;
import v7.a8;
public final class s {
    public final e9.i0 f14907a;
    public final int f14908b;
    public final long f14909c;

    public s(long j3, int i10, List list) {
        this.f14907a = e9.i0.v(list);
        this.f14908b = i10;
        this.f14909c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f14907a.equals(sVar.f14907a) && this.f14908b == sVar.f14908b && this.f14909c == sVar.f14909c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a8.b(this.f14909c) + (((this.f14907a.hashCode() * 31) + this.f14908b) * 31);
    }
}
