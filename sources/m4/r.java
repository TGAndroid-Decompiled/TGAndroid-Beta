package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class r {
    public final n4.z f16217a;
    public final int f16218b;
    public final int f16219c;
    public final q d;
    public final Bundle f16220e;

    public r(n4.z zVar, int i10, int i11, boolean z10, q qVar, Bundle bundle) {
        this.f16217a = zVar;
        this.f16218b = i10;
        this.f16219c = i11;
        this.d = qVar;
        this.f16220e = bundle;
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
            return this.f16217a.equals(rVar.f16217a);
        }
        return Objects.equals(qVar2, qVar);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.f16217a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ControllerInfo {pkg=");
        n4.z zVar = this.f16217a;
        sb2.append(zVar.f16617a.f16543a);
        sb2.append(", uid=");
        return a1.g.o(zVar.f16617a.f16545c, "}", sb2);
    }
}
