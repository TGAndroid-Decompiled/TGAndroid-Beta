package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class r {
    public final n4.a0 f16282a;
    public final int f16283b;
    public final int f16284c;
    public final q d;
    public final Bundle f16285e;

    public r(n4.a0 a0Var, int i10, int i11, boolean z10, q qVar, Bundle bundle) {
        this.f16282a = a0Var;
        this.f16283b = i10;
        this.f16284c = i11;
        this.d = qVar;
        this.f16285e = bundle;
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
            return this.f16282a.equals(rVar.f16282a);
        }
        return Objects.equals(qVar2, qVar);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.f16282a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ControllerInfo {pkg=");
        n4.a0 a0Var = this.f16282a;
        sb2.append(a0Var.f16573a.f16574a);
        sb2.append(", uid=");
        return a4.a.o(a0Var.f16573a.f16576c, "}", sb2);
    }
}
