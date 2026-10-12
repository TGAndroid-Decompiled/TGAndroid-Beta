package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class w {
    public final n4.t f15670a;
    public final int f15671b;
    public final int f15672c;
    public final v d;
    public final Bundle e;

    public w(n4.t tVar, int i10, int i11, boolean z10, v vVar, Bundle bundle) {
        this.f15670a = tVar;
        this.f15671b = i10;
        this.f15672c = i11;
        this.d = vVar;
        this.e = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        w wVar = (w) obj;
        v vVar = wVar.d;
        v vVar2 = this.d;
        if (vVar2 == null && vVar == null) {
            return this.f15670a.equals(wVar.f15670a);
        }
        return Objects.equals(vVar2, vVar);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.f15670a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ControllerInfo {pkg=");
        n4.t tVar = this.f15670a;
        sb2.append(tVar.f16033a.f16034a);
        sb2.append(", uid=");
        return a1.g.n(tVar.f16033a.f16036c, "}", sb2);
    }
}
