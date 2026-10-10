package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class r {
    public final n4.z f16221a;
    public final int f16222b;
    public final int f16223c;
    public final q d;
    public final Bundle f16224e;

    public r(n4.z zVar, int i10, int i11, boolean z10, q qVar, Bundle bundle) {
        this.f16221a = zVar;
        this.f16222b = i10;
        this.f16223c = i11;
        this.d = qVar;
        this.f16224e = bundle;
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
            return this.f16221a.equals(rVar.f16221a);
        }
        return Objects.equals(qVar2, qVar);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.f16221a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ControllerInfo {pkg=");
        n4.z zVar = this.f16221a;
        sb2.append(zVar.f16621a.f16547a);
        sb2.append(", uid=");
        return a1.g.o(zVar.f16621a.f16549c, "}", sb2);
    }
}
