package m4;

import java.util.List;
import v7.z7;
public final class s {
    public final e9.i0 f14686a;
    public final int f14687b;
    public final long f14688c;

    public s(long j3, int i10, List list) {
        this.f14686a = e9.i0.v(list);
        this.f14687b = i10;
        this.f14688c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f14686a.equals(sVar.f14686a) && this.f14687b == sVar.f14687b && this.f14688c == sVar.f14688c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return z7.b(this.f14688c) + (((this.f14686a.hashCode() * 31) + this.f14687b) * 31);
    }
}
