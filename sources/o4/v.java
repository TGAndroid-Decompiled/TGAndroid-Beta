package o4;

import android.os.Bundle;
import j$.util.Objects;
public final class v {
    public final p4.r f20879a;
    public final int f20880b;
    public final int f20881c;
    public final u d;
    public final Bundle f20882e;

    public v(p4.r rVar, int i3, int i10, boolean z10, u uVar, Bundle bundle) {
        this.f20879a = rVar;
        this.f20880b = i3;
        this.f20881c = i10;
        this.d = uVar;
        this.f20882e = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        v vVar = (v) obj;
        u uVar = vVar.d;
        u uVar2 = this.d;
        if (uVar2 == null && uVar == null) {
            return this.f20879a.equals(vVar.f20879a);
        }
        return Objects.equals(uVar2, uVar);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.f20879a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ControllerInfo {pkg=");
        p4.r rVar = this.f20879a;
        sb2.append(rVar.f53183a.f53184a);
        sb2.append(", uid=");
        return a1.g.o(rVar.f53183a.f53186c, "}", sb2);
    }
}
