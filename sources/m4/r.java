package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class r {
    public final n4.z f16242a;
    public final int f16243b;
    public final int f16244c;
    public final q d;
    public final Bundle f16245e;

    public r(n4.z zVar, int i10, int i11, boolean z10, q qVar, Bundle bundle) {
        this.f16242a = zVar;
        this.f16243b = i10;
        this.f16244c = i11;
        this.d = qVar;
        this.f16245e = bundle;
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
            return this.f16242a.equals(rVar.f16242a);
        }
        return Objects.equals(qVar2, qVar);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.f16242a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ControllerInfo {pkg=");
        n4.z zVar = this.f16242a;
        sb2.append(zVar.f16663a.f16589a);
        sb2.append(", uid=");
        return a1.g.o(zVar.f16663a.f16591c, "}", sb2);
    }
}
