package m4;

import java.util.List;
import v7.z7;
public final class s {
    public final e9.i0 f16282a;
    public final int f16283b;
    public final long f16284c;

    public s(long j3, int i10, List list) {
        this.f16282a = e9.i0.v(list);
        this.f16283b = i10;
        this.f16284c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f16282a.equals(sVar.f16282a) && this.f16283b == sVar.f16283b && this.f16284c == sVar.f16284c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return z7.b(this.f16284c) + (((this.f16282a.hashCode() * 31) + this.f16283b) * 31);
    }
}
