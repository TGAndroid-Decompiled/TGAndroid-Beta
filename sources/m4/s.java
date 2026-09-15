package m4;

import java.util.List;
import v7.z7;
public final class s {
    public final e9.i0 f14676a;
    public final int f14677b;
    public final long f14678c;

    public s(long j3, int i10, List list) {
        this.f14676a = e9.i0.v(list);
        this.f14677b = i10;
        this.f14678c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f14676a.equals(sVar.f14676a) && this.f14677b == sVar.f14677b && this.f14678c == sVar.f14678c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return z7.b(this.f14678c) + (((this.f14676a.hashCode() * 31) + this.f14677b) * 31);
    }
}
