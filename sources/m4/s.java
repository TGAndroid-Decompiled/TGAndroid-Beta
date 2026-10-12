package m4;

import java.util.List;
import v7.w7;
public final class s {
    public final e9.i0 f15970a;
    public final int f15971b;
    public final long f15972c;

    public s(long j3, int i10, List list) {
        this.f15970a = e9.i0.v(list);
        this.f15971b = i10;
        this.f15972c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f15970a.equals(sVar.f15970a) && this.f15971b == sVar.f15971b && this.f15972c == sVar.f15972c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return w7.b(this.f15972c) + (((this.f15970a.hashCode() * 31) + this.f15971b) * 31);
    }
}
