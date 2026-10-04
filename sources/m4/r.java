package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class r {
    public final n4.a0 f16277a;
    public final int f16278b;
    public final int f16279c;
    public final q d;
    public final Bundle f16280e;

    public r(n4.a0 a0Var, int i10, int i11, boolean z10, q qVar, Bundle bundle) {
        this.f16277a = a0Var;
        this.f16278b = i10;
        this.f16279c = i11;
        this.d = qVar;
        this.f16280e = bundle;
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
            return this.f16277a.equals(rVar.f16277a);
        }
        return Objects.equals(qVar2, qVar);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.f16277a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ControllerInfo {pkg=");
        n4.a0 a0Var = this.f16277a;
        sb2.append(a0Var.f16568a.f16569a);
        sb2.append(", uid=");
        return a4.a.n(a0Var.f16568a.f16571c, "}", sb2);
    }
}
