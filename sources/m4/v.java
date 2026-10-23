package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class v {
    public final n4.t f16821a;
    public final int f16822b;
    public final int f16823c;
    public final u d;
    public final Bundle e;

    public v(n4.t tVar, int i10, int i11, boolean z10, u uVar, Bundle bundle) {
        this.f16821a = tVar;
        this.f16822b = i10;
        this.f16823c = i11;
        this.d = uVar;
        this.e = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        v vVar = (v) obj;
        u uVar = vVar.d;
        u uVar2 = this.d;
        if (uVar2 == null && uVar == null) {
            return this.f16821a.equals(vVar.f16821a);
        }
        return Objects.equals(uVar2, uVar);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.f16821a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ControllerInfo {pkg=");
        n4.t tVar = this.f16821a;
        sb2.append(tVar.f17190a.f17191a);
        sb2.append(", uid=");
        return a1.g.n(tVar.f17190a.f17193c, "}", sb2);
    }
}
