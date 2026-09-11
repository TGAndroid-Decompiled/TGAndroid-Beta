package m4;

import java.util.List;
import v7.y7;
public final class s {
    public final e9.i0 f16081a;
    public final int f16082b;
    public final long f16083c;

    public s(long j3, int i10, List list) {
        this.f16081a = e9.i0.v(list);
        this.f16082b = i10;
        this.f16083c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f16081a.equals(sVar.f16081a) && this.f16082b == sVar.f16082b && this.f16083c == sVar.f16083c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return y7.b(this.f16083c) + (((this.f16081a.hashCode() * 31) + this.f16082b) * 31);
    }
}
