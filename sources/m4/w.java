package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class w {
    public final n4.t f18285a;
    public final int f18286b;
    public final int f18287c;
    public final v d;
    public final Bundle e;

    public w(n4.t tVar, int i10, int i11, boolean z10, v vVar, Bundle bundle) {
        this.f18285a = tVar;
        this.f18286b = i10;
        this.f18287c = i11;
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
            return this.f18285a.equals(wVar.f18285a);
        }
        return Objects.equals(vVar2, vVar);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.f18285a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ControllerInfo {pkg=");
        n4.t tVar = this.f18285a;
        sb2.append(tVar.f18697a.f18698a);
        sb2.append(", uid=");
        return a1.g.n(tVar.f18697a.f18700c, "}", sb2);
    }
}
