package gb;

import a8.ab;
import java.util.Map;
public final class k0 {
    public static final j0 Companion = new Object();
    public static final gd.c[] d;
    public final o0 f13722a;
    public final i1 f13723b;
    public final Map f13724c;

    static {
        gd.d[] dVarArr = gd.d.f13817a;
        d = new gd.c[]{null, null, ab.a(new h0())};
    }

    public k0(int i7, o0 o0Var, i1 i1Var, Map map) {
        if (1 != (i7 & 1)) {
            oe.k.a(i7, 1, i0.f13710a.d());
            throw null;
        }
        this.f13722a = o0Var;
        if ((i7 & 2) == 0) {
            this.f13723b = null;
        } else {
            this.f13723b = i1Var;
        }
        if ((i7 & 4) == 0) {
            this.f13724c = null;
        } else {
            this.f13724c = map;
        }
    }

    public static k0 a(k0 k0Var, o0 sessionDetails, i1 i1Var, Map map, int i7) {
        if ((i7 & 1) != 0) {
            sessionDetails = k0Var.f13722a;
        }
        if ((i7 & 2) != 0) {
            i1Var = k0Var.f13723b;
        }
        if ((i7 & 4) != 0) {
            map = k0Var.f13724c;
        }
        k0Var.getClass();
        kotlin.jvm.internal.j.e(sessionDetails, "sessionDetails");
        return new k0(sessionDetails, i1Var, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (kotlin.jvm.internal.j.a(this.f13722a, k0Var.f13722a) && kotlin.jvm.internal.j.a(this.f13723b, k0Var.f13723b) && kotlin.jvm.internal.j.a(this.f13724c, k0Var.f13724c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f13722a.hashCode() * 31;
        int i7 = 0;
        i1 i1Var = this.f13723b;
        if (i1Var == null) {
            hashCode = 0;
        } else {
            hashCode = i1Var.hashCode();
        }
        int i10 = (hashCode2 + hashCode) * 31;
        Map map = this.f13724c;
        if (map != null) {
            i7 = map.hashCode();
        }
        return i10 + i7;
    }

    public final String toString() {
        return "SessionData(sessionDetails=" + this.f13722a + ", backgroundTime=" + this.f13723b + ", processDataMap=" + this.f13724c + ')';
    }

    public k0(o0 sessionDetails, i1 i1Var, Map map) {
        kotlin.jvm.internal.j.e(sessionDetails, "sessionDetails");
        this.f13722a = sessionDetails;
        this.f13723b = i1Var;
        this.f13724c = map;
    }
}
