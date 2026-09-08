package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class r {
    public final n4.a0 f16085a;
    public final int f16086b;
    public final int f16087c;
    public final q d;
    public final Bundle f16088e;

    public r(n4.a0 a0Var, int i10, int i11, boolean z10, q qVar, Bundle bundle) {
        this.f16085a = a0Var;
        this.f16086b = i10;
        this.f16087c = i11;
        this.d = qVar;
        this.f16088e = bundle;
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
            return this.f16085a.equals(rVar.f16085a);
        }
        return Objects.equals(qVar2, qVar);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.f16085a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ControllerInfo {pkg=");
        n4.a0 a0Var = this.f16085a;
        sb2.append(a0Var.f16452a.f16453a);
        sb2.append(", uid=");
        return a4.a.n(a0Var.f16452a.f16455c, "}", sb2);
    }
}
