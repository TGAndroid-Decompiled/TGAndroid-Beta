package m4;

import java.util.List;
import v7.z7;
public final class s {
    public final e9.i0 f14674a;
    public final int f14675b;
    public final long f14676c;

    public s(long j3, int i10, List list) {
        this.f14674a = e9.i0.v(list);
        this.f14675b = i10;
        this.f14676c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f14674a.equals(sVar.f14674a) && this.f14675b == sVar.f14675b && this.f14676c == sVar.f14676c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return z7.b(this.f14676c) + (((this.f14674a.hashCode() * 31) + this.f14675b) * 31);
    }
}
