package m4;

import java.util.List;
import v7.z7;
public final class s {
    public final e9.i0 f16283a;
    public final int f16284b;
    public final long f16285c;

    public s(long j3, int i10, List list) {
        this.f16283a = e9.i0.v(list);
        this.f16284b = i10;
        this.f16285c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f16283a.equals(sVar.f16283a) && this.f16284b == sVar.f16284b && this.f16285c == sVar.f16285c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return z7.b(this.f16285c) + (((this.f16283a.hashCode() * 31) + this.f16284b) * 31);
    }
}
