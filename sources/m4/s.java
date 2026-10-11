package m4;

import java.util.List;
import v7.w7;
public final class s {
    public final e9.i0 f16284a;
    public final int f16285b;
    public final long f16286c;

    public s(long j3, int i10, List list) {
        this.f16284a = e9.i0.v(list);
        this.f16285b = i10;
        this.f16286c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f16284a.equals(sVar.f16284a) && this.f16285b == sVar.f16285b && this.f16286c == sVar.f16286c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return w7.b(this.f16286c) + (((this.f16284a.hashCode() * 31) + this.f16285b) * 31);
    }
}
