package m4;

import java.util.List;
import v7.w7;
public final class s {
    public final e9.i0 f16248a;
    public final int f16249b;
    public final long f16250c;

    public s(long j3, int i10, List list) {
        this.f16248a = e9.i0.v(list);
        this.f16249b = i10;
        this.f16250c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f16248a.equals(sVar.f16248a) && this.f16249b == sVar.f16249b && this.f16250c == sVar.f16250c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return w7.b(this.f16250c) + (((this.f16248a.hashCode() * 31) + this.f16249b) * 31);
    }
}
