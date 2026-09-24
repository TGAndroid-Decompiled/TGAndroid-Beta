package m4;

import java.util.List;
import v7.a8;
public final class s {
    public final e9.i0 f14906a;
    public final int f14907b;
    public final long f14908c;

    public s(long j3, int i10, List list) {
        this.f14906a = e9.i0.v(list);
        this.f14907b = i10;
        this.f14908c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f14906a.equals(sVar.f14906a) && this.f14907b == sVar.f14907b && this.f14908c == sVar.f14908c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a8.b(this.f14908c) + (((this.f14906a.hashCode() * 31) + this.f14907b) * 31);
    }
}
