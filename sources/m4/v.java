package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class v {
    public final n4.t f16752a;
    public final int f16753b;
    public final int f16754c;
    public final u d;
    public final Bundle e;

    public v(n4.t tVar, int i10, int i11, boolean z10, u uVar, Bundle bundle) {
        this.f16752a = tVar;
        this.f16753b = i10;
        this.f16754c = i11;
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
            return this.f16752a.equals(vVar.f16752a);
        }
        return Objects.equals(uVar2, uVar);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.f16752a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ControllerInfo {pkg=");
        n4.t tVar = this.f16752a;
        sb2.append(tVar.f17123a.f17124a);
        sb2.append(", uid=");
        return a1.g.n(tVar.f17123a.f17126c, "}", sb2);
    }
}
