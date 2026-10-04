package m4;

import java.util.List;
import v7.z7;
public final class s {
    public final e9.i0 f16287a;
    public final int f16288b;
    public final long f16289c;

    public s(long j3, int i10, List list) {
        this.f16287a = e9.i0.v(list);
        this.f16288b = i10;
        this.f16289c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f16287a.equals(sVar.f16287a) && this.f16288b == sVar.f16288b && this.f16289c == sVar.f16289c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return z7.b(this.f16289c) + (((this.f16287a.hashCode() * 31) + this.f16288b) * 31);
    }
}
