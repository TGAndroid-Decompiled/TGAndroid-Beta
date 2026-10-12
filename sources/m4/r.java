package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class r {
    public final n4.a0 f15966a;
    public final int f15967b;
    public final int f15968c;
    public final q d;
    public final Bundle f15969e;

    public r(n4.a0 a0Var, int i10, int i11, boolean z10, q qVar, Bundle bundle) {
        this.f15966a = a0Var;
        this.f15967b = i10;
        this.f15968c = i11;
        this.d = qVar;
        this.f15969e = bundle;
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
            return this.f15966a.equals(rVar.f15966a);
        }
        return Objects.equals(qVar2, qVar);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.f15966a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ControllerInfo {pkg=");
        n4.a0 a0Var = this.f15966a;
        sb2.append(a0Var.f16292a.f16293a);
        sb2.append(", uid=");
        return a1.g.o(a0Var.f16292a.f16295c, "}", sb2);
    }
}
