package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class r {
    public final n4.a0 f14917a;
    public final int f14918b;
    public final int f14919c;
    public final q d;
    public final Bundle e;

    public r(n4.a0 a0Var, int i10, int i11, boolean z10, q qVar, Bundle bundle) {
        this.f14917a = a0Var;
        this.f14918b = i10;
        this.f14919c = i11;
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
            return this.f14917a.equals(rVar.f14917a);
        }
        return Objects.equals(qVar2, qVar);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.f14917a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ControllerInfo {pkg=");
        n4.a0 a0Var = this.f14917a;
        sb2.append(a0Var.f15157a.f15158a);
        sb2.append(", uid=");
        return a4.a.o(a0Var.f15157a.f15160c, "}", sb2);
    }
}
