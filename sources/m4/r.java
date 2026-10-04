package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class r {
    public final n4.a0 f16278a;
    public final int f16279b;
    public final int f16280c;
    public final q d;
    public final Bundle f16281e;

    public r(n4.a0 a0Var, int i10, int i11, boolean z10, q qVar, Bundle bundle) {
        this.f16278a = a0Var;
        this.f16279b = i10;
        this.f16280c = i11;
        this.d = qVar;
        this.f16281e = bundle;
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
            return this.f16278a.equals(rVar.f16278a);
        }
        return Objects.equals(qVar2, qVar);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.f16278a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ControllerInfo {pkg=");
        n4.a0 a0Var = this.f16278a;
        sb2.append(a0Var.f16569a.f16570a);
        sb2.append(", uid=");
        return a4.a.n(a0Var.f16569a.f16572c, "}", sb2);
    }
}
