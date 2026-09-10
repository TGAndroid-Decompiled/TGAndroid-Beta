package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class r {
    public final n4.a0 f13498a;
    public final int f13499b;
    public final int f13500c;
    public final q d;
    public final Bundle e;

    public r(n4.a0 a0Var, int i10, int i11, boolean z10, q qVar, Bundle bundle) {
        this.f13498a = a0Var;
        this.f13499b = i10;
        this.f13500c = i11;
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
            return this.f13498a.equals(rVar.f13498a);
        }
        return Objects.equals(qVar2, qVar);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.f13498a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ControllerInfo {pkg=");
        n4.a0 a0Var = this.f13498a;
        sb2.append(a0Var.f13759a.f13760a);
        sb2.append(", uid=");
        return a4.a.n(a0Var.f13759a.f13762c, "}", sb2);
    }
}
