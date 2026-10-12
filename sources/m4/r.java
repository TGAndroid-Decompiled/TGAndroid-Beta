package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class r {
    public final n4.a0 f15965a;
    public final int f15966b;
    public final int f15967c;
    public final q d;
    public final Bundle f15968e;

    public r(n4.a0 a0Var, int i10, int i11, boolean z10, q qVar, Bundle bundle) {
        this.f15965a = a0Var;
        this.f15966b = i10;
        this.f15967c = i11;
        this.d = qVar;
        this.f15968e = bundle;
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
            return this.f15965a.equals(rVar.f15965a);
        }
        return Objects.equals(qVar2, qVar);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.f15965a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ControllerInfo {pkg=");
        n4.a0 a0Var = this.f15965a;
        sb2.append(a0Var.f16291a.f16292a);
        sb2.append(", uid=");
        return a1.g.o(a0Var.f16291a.f16294c, "}", sb2);
    }
}
