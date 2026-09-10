package m4;

import java.util.List;
import v7.z7;
public final class s {
    public final e9.i0 f13508a;
    public final int f13509b;
    public final long f13510c;

    public s(long j3, int i10, List list) {
        this.f13508a = e9.i0.v(list);
        this.f13509b = i10;
        this.f13510c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f13508a.equals(sVar.f13508a) && this.f13509b == sVar.f13509b && this.f13510c == sVar.f13510c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return z7.b(this.f13510c) + (((this.f13508a.hashCode() * 31) + this.f13509b) * 31);
    }
}
