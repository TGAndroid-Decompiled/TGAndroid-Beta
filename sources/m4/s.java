package m4;

import java.util.List;
import v7.z7;
public final class s {
    public final e9.i0 f14670a;
    public final int f14671b;
    public final long f14672c;

    public s(long j3, int i10, List list) {
        this.f14670a = e9.i0.v(list);
        this.f14671b = i10;
        this.f14672c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f14670a.equals(sVar.f14670a) && this.f14671b == sVar.f14671b && this.f14672c == sVar.f14672c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return z7.b(this.f14672c) + (((this.f14670a.hashCode() * 31) + this.f14671b) * 31);
    }
}
