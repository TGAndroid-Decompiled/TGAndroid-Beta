package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class w {
    public final n4.t f18286a;
    public final int f18287b;
    public final int f18288c;
    public final v d;
    public final Bundle e;

    public w(n4.t tVar, int i10, int i11, boolean z10, v vVar, Bundle bundle) {
        this.f18286a = tVar;
        this.f18287b = i10;
        this.f18288c = i11;
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
            return this.f18286a.equals(wVar.f18286a);
        }
        return Objects.equals(vVar2, vVar);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.f18286a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ControllerInfo {pkg=");
        n4.t tVar = this.f18286a;
        sb2.append(tVar.f18698a.f18699a);
        sb2.append(", uid=");
        return a1.g.n(tVar.f18698a.f18701c, "}", sb2);
    }
}
