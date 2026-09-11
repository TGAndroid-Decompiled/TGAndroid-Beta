package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class r {
    public final n4.a0 f16058a;
    public final int f16059b;
    public final int f16060c;
    public final q d;
    public final Bundle f16061e;

    public r(n4.a0 a0Var, int i10, int i11, boolean z10, q qVar, Bundle bundle) {
        this.f16058a = a0Var;
        this.f16059b = i10;
        this.f16060c = i11;
        this.d = qVar;
        this.f16061e = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        r rVar = (r) obj;
        q qVar = rVar.d;
        q qVar2 = this.d;
        if (qVar2 == null && qVar == null) {
            return this.f16058a.equals(rVar.f16058a);
        }
        return Objects.equals(qVar2, qVar);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.f16058a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ControllerInfo {pkg=");
        n4.a0 a0Var = this.f16058a;
        sb2.append(a0Var.f16425a.f16426a);
        sb2.append(", uid=");
        return a4.a.n(a0Var.f16425a.f16428c, "}", sb2);
    }
}
