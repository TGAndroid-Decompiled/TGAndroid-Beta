package b8;

import java.util.Map;
import java.util.Set;
public abstract class ch implements p {
    public transient kd f2526a;
    public transient mb f2527b;

    public final Map a() {
        mb mbVar = this.f2527b;
        if (mbVar == null) {
            dh dhVar = (dh) this;
            mb mbVar2 = new mb(dhVar, dhVar.f2554c, 0);
            this.f2527b = mbVar2;
            return mbVar2;
        }
        return mbVar;
    }

    public final Set b() {
        kd kdVar = this.f2526a;
        if (kdVar == null) {
            dh dhVar = (dh) this;
            kd kdVar2 = new kd(dhVar, dhVar.f2554c);
            this.f2526a = kdVar2;
            return kdVar2;
        }
        return kdVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        return a().equals(((ch) ((p) obj)).a());
    }

    public final int hashCode() {
        return ((mb) a()).f2754b.hashCode();
    }

    public final String toString() {
        return ((mb) a()).f2754b.toString();
    }
}
