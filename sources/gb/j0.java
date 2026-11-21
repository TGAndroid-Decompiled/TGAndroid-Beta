package gb;

import java.util.Map;
public final class j0 {
    public static final i0 Companion = new Object();
    public static final gd.c[] d;
    public final n0 f13402a;
    public final g1 f13403b;
    public final Map f13404c;

    static {
        gd.d[] dVarArr = gd.d.f13502a;
        d = new gd.c[]{null, null, b5.a.b(new g0())};
    }

    public j0(int i7, n0 n0Var, g1 g1Var, Map map) {
        if (1 != (i7 & 1)) {
            oe.k.a(i7, 1, h0.f13381a.d());
            throw null;
        }
        this.f13402a = n0Var;
        if ((i7 & 2) == 0) {
            this.f13403b = null;
        } else {
            this.f13403b = g1Var;
        }
        if ((i7 & 4) == 0) {
            this.f13404c = null;
        } else {
            this.f13404c = map;
        }
    }

    public static j0 a(j0 j0Var, n0 sessionDetails, g1 g1Var, Map map, int i7) {
        if ((i7 & 1) != 0) {
            sessionDetails = j0Var.f13402a;
        }
        if ((i7 & 2) != 0) {
            g1Var = j0Var.f13403b;
        }
        if ((i7 & 4) != 0) {
            map = j0Var.f13404c;
        }
        j0Var.getClass();
        kotlin.jvm.internal.j.e(sessionDetails, "sessionDetails");
        return new j0(sessionDetails, g1Var, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (kotlin.jvm.internal.j.a(this.f13402a, j0Var.f13402a) && kotlin.jvm.internal.j.a(this.f13403b, j0Var.f13403b) && kotlin.jvm.internal.j.a(this.f13404c, j0Var.f13404c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f13402a.hashCode() * 31;
        int i7 = 0;
        g1 g1Var = this.f13403b;
        if (g1Var == null) {
            hashCode = 0;
        } else {
            hashCode = g1Var.hashCode();
        }
        int i10 = (hashCode2 + hashCode) * 31;
        Map map = this.f13404c;
        if (map != null) {
            i7 = map.hashCode();
        }
        return i10 + i7;
    }

    public final String toString() {
        return "SessionData(sessionDetails=" + this.f13402a + ", backgroundTime=" + this.f13403b + ", processDataMap=" + this.f13404c + ')';
    }

    public j0(n0 sessionDetails, g1 g1Var, Map map) {
        kotlin.jvm.internal.j.e(sessionDetails, "sessionDetails");
        this.f13402a = sessionDetails;
        this.f13403b = g1Var;
        this.f13404c = map;
    }
}
