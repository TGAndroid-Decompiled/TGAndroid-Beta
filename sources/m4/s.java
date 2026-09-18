package m4;

import java.util.List;
import v7.z7;
public final class s {
    public final e9.i0 f14871a;
    public final int f14872b;
    public final long f14873c;

    public s(long j3, int i10, List list) {
        this.f14871a = e9.i0.v(list);
        this.f14872b = i10;
        this.f14873c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f14871a.equals(sVar.f14871a) && this.f14872b == sVar.f14872b && this.f14873c == sVar.f14873c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return z7.b(this.f14873c) + (((this.f14871a.hashCode() * 31) + this.f14872b) * 31);
    }
}
