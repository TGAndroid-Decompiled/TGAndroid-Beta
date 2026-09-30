package m4;

import java.util.List;
import v7.a8;
public final class s {
    public final e9.i0 f14937a;
    public final int f14938b;
    public final long f14939c;

    public s(long j3, int i10, List list) {
        this.f14937a = e9.i0.v(list);
        this.f14938b = i10;
        this.f14939c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f14937a.equals(sVar.f14937a) && this.f14938b == sVar.f14938b && this.f14939c == sVar.f14939c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a8.b(this.f14939c) + (((this.f14937a.hashCode() * 31) + this.f14938b) * 31);
    }
}
