package m4;

import java.util.List;
import v7.w7;
public final class s {
    public final e9.i0 f15971a;
    public final int f15972b;
    public final long f15973c;

    public s(long j3, int i10, List list) {
        this.f15971a = e9.i0.v(list);
        this.f15972b = i10;
        this.f15973c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f15971a.equals(sVar.f15971a) && this.f15972b == sVar.f15972b && this.f15973c == sVar.f15973c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return w7.b(this.f15973c) + (((this.f15971a.hashCode() * 31) + this.f15972b) * 31);
    }
}
