package m4;

import java.util.List;
import v7.w7;
public final class s {
    public final e9.i0 f16223a;
    public final int f16224b;
    public final long f16225c;

    public s(long j3, int i10, List list) {
        this.f16223a = e9.i0.v(list);
        this.f16224b = i10;
        this.f16225c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f16223a.equals(sVar.f16223a) && this.f16224b == sVar.f16224b && this.f16225c == sVar.f16225c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return w7.b(this.f16225c) + (((this.f16223a.hashCode() * 31) + this.f16224b) * 31);
    }
}
