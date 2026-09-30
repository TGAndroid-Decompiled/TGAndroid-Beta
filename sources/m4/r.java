package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class r {
    public final n4.a0 f14918a;
    public final int f14919b;
    public final int f14920c;
    public final q d;
    public final Bundle e;

    public r(n4.a0 a0Var, int i10, int i11, boolean z10, q qVar, Bundle bundle) {
        this.f14918a = a0Var;
        this.f14919b = i10;
        this.f14920c = i11;
        this.d = qVar;
        this.e = bundle;
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
            return this.f14918a.equals(rVar.f14918a);
        }
        return Objects.equals(qVar2, qVar);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.f14918a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ControllerInfo {pkg=");
        n4.a0 a0Var = this.f14918a;
        sb2.append(a0Var.f15158a.f15159a);
        sb2.append(", uid=");
        return a4.a.o(a0Var.f15158a.f15161c, "}", sb2);
    }
}
