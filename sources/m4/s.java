package m4;

import java.util.List;
import v7.a8;
public final class s {
    public final e9.i0 f14921a;
    public final int f14922b;
    public final long f14923c;

    public s(long j3, int i10, List list) {
        this.f14921a = e9.i0.v(list);
        this.f14922b = i10;
        this.f14923c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f14921a.equals(sVar.f14921a) && this.f14922b == sVar.f14922b && this.f14923c == sVar.f14923c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a8.b(this.f14923c) + (((this.f14921a.hashCode() * 31) + this.f14922b) * 31);
    }
}
