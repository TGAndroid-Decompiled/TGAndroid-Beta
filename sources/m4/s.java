package m4;

import java.util.List;
import v7.a8;
public final class s {
    public final e9.i0 f14922a;
    public final int f14923b;
    public final long f14924c;

    public s(long j3, int i10, List list) {
        this.f14922a = e9.i0.v(list);
        this.f14923b = i10;
        this.f14924c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f14922a.equals(sVar.f14922a) && this.f14923b == sVar.f14923b && this.f14924c == sVar.f14924c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a8.b(this.f14924c) + (((this.f14922a.hashCode() * 31) + this.f14923b) * 31);
    }
}
