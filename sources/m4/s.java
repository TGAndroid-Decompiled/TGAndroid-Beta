package m4;

import java.util.List;
import v7.w7;
public final class s {
    public final e9.i0 f16227a;
    public final int f16228b;
    public final long f16229c;

    public s(long j3, int i10, List list) {
        this.f16227a = e9.i0.v(list);
        this.f16228b = i10;
        this.f16229c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f16227a.equals(sVar.f16227a) && this.f16228b == sVar.f16228b && this.f16229c == sVar.f16229c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return w7.b(this.f16229c) + (((this.f16227a.hashCode() * 31) + this.f16228b) * 31);
    }
}
