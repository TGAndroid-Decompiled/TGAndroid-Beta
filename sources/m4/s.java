package m4;

import java.util.List;
import v7.z7;
public final class s {
    public final e9.i0 f16292a;
    public final int f16293b;
    public final long f16294c;

    public s(long j3, int i10, List list) {
        this.f16292a = e9.i0.v(list);
        this.f16293b = i10;
        this.f16294c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f16292a.equals(sVar.f16292a) && this.f16293b == sVar.f16293b && this.f16294c == sVar.f16294c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return z7.b(this.f16294c) + (((this.f16292a.hashCode() * 31) + this.f16293b) * 31);
    }
}
