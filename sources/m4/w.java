package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class w {
    public final n4.r f12982a;
    public final int f12983b;
    public final int f12984c;
    public final v d;
    public final Bundle e;

    public w(n4.r rVar, int i10, int i11, boolean z10, v vVar, Bundle bundle) {
        this.f12982a = rVar;
        this.f12983b = i10;
        this.f12984c = i11;
        this.d = vVar;
        this.e = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        w wVar = (w) obj;
        v vVar = wVar.d;
        v vVar2 = this.d;
        if (vVar2 == null && vVar == null) {
            return this.f12982a.equals(wVar.f12982a);
        }
        return Objects.equals(vVar2, vVar);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.f12982a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ControllerInfo {pkg=");
        n4.r rVar = this.f12982a;
        sb2.append(rVar.f13529a.f13530a);
        sb2.append(", uid=");
        return a1.g.p(sb2, rVar.f13529a.f13532c, "}");
    }
}
