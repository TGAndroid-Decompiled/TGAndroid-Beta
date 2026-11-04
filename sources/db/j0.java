package db;

import b8.hb;
import java.util.Map;
public final class j0 {
    public static final i0 Companion = new Object();
    public static final dd.c[] d;
    public final n0 f8691a;
    public final h1 f8692b;
    public final Map f8693c;

    static {
        dd.d[] dVarArr = dd.d.f8789a;
        d = new dd.c[]{null, null, hb.a(new g0())};
    }

    public j0(int i3, n0 n0Var, h1 h1Var, Map map) {
        if (1 != (i3 & 1)) {
            le.k.a(i3, 1, h0.f8668a.d());
            throw null;
        }
        this.f8691a = n0Var;
        if ((i3 & 2) == 0) {
            this.f8692b = null;
        } else {
            this.f8692b = h1Var;
        }
        if ((i3 & 4) == 0) {
            this.f8693c = null;
        } else {
            this.f8693c = map;
        }
    }

    public static j0 a(j0 j0Var, n0 sessionDetails, h1 h1Var, Map map, int i3) {
        if ((i3 & 1) != 0) {
            sessionDetails = j0Var.f8691a;
        }
        if ((i3 & 2) != 0) {
            h1Var = j0Var.f8692b;
        }
        if ((i3 & 4) != 0) {
            map = j0Var.f8693c;
        }
        j0Var.getClass();
        kotlin.jvm.internal.j.e(sessionDetails, "sessionDetails");
        return new j0(sessionDetails, h1Var, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (kotlin.jvm.internal.j.a(this.f8691a, j0Var.f8691a) && kotlin.jvm.internal.j.a(this.f8692b, j0Var.f8692b) && kotlin.jvm.internal.j.a(this.f8693c, j0Var.f8693c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f8691a.hashCode() * 31;
        int i3 = 0;
        h1 h1Var = this.f8692b;
        if (h1Var == null) {
            hashCode = 0;
        } else {
            hashCode = h1Var.hashCode();
        }
        int i10 = (hashCode2 + hashCode) * 31;
        Map map = this.f8693c;
        if (map != null) {
            i3 = map.hashCode();
        }
        return i10 + i3;
    }

    public final String toString() {
        return "SessionData(sessionDetails=" + this.f8691a + ", backgroundTime=" + this.f8692b + ", processDataMap=" + this.f8693c + ')';
    }

    public j0(n0 sessionDetails, h1 h1Var, Map map) {
        kotlin.jvm.internal.j.e(sessionDetails, "sessionDetails");
        this.f8691a = sessionDetails;
        this.f8692b = h1Var;
        this.f8693c = map;
    }
}
