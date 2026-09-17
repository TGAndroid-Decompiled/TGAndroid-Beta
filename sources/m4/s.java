package m4;

import java.util.List;
import v7.y7;
public final class s {
    public final e9.i0 f16108a;
    public final int f16109b;
    public final long f16110c;

    public s(long j3, int i10, List list) {
        this.f16108a = e9.i0.v(list);
        this.f16109b = i10;
        this.f16110c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f16108a.equals(sVar.f16108a) && this.f16109b == sVar.f16109b && this.f16110c == sVar.f16110c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return y7.b(this.f16110c) + (((this.f16108a.hashCode() * 31) + this.f16109b) * 31);
    }
}
