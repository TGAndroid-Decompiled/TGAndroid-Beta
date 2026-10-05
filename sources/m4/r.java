package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class r {
    public final n4.a0 f16287a;
    public final int f16288b;
    public final int f16289c;
    public final q d;
    public final Bundle f16290e;

    public r(n4.a0 a0Var, int i10, int i11, boolean z10, q qVar, Bundle bundle) {
        this.f16287a = a0Var;
        this.f16288b = i10;
        this.f16289c = i11;
        this.d = qVar;
        this.f16290e = bundle;
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
            return this.f16287a.equals(rVar.f16287a);
        }
        return Objects.equals(qVar2, qVar);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.f16287a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ControllerInfo {pkg=");
        n4.a0 a0Var = this.f16287a;
        sb2.append(a0Var.f16578a.f16579a);
        sb2.append(", uid=");
        return a4.a.o(a0Var.f16578a.f16581c, "}", sb2);
    }
}
