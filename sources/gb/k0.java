package gb;

import java.util.Map;
public final class k0 {
    public static final j0 Companion = new Object();
    public static final gd.c[] d;
    public final o0 f13373a;
    public final h1 f13374b;
    public final Map f13375c;

    static {
        gd.d[] dVarArr = gd.d.f13468a;
        d = new gd.c[]{null, null, b7.h.a(new h0())};
    }

    public k0(int i7, o0 o0Var, h1 h1Var, Map map) {
        if (1 != (i7 & 1)) {
            oe.k.a(i7, 1, i0.f13363a.d());
            throw null;
        }
        this.f13373a = o0Var;
        if ((i7 & 2) == 0) {
            this.f13374b = null;
        } else {
            this.f13374b = h1Var;
        }
        if ((i7 & 4) == 0) {
            this.f13375c = null;
        } else {
            this.f13375c = map;
        }
    }

    public static k0 a(k0 k0Var, o0 sessionDetails, h1 h1Var, Map map, int i7) {
        if ((i7 & 1) != 0) {
            sessionDetails = k0Var.f13373a;
        }
        if ((i7 & 2) != 0) {
            h1Var = k0Var.f13374b;
        }
        if ((i7 & 4) != 0) {
            map = k0Var.f13375c;
        }
        k0Var.getClass();
        kotlin.jvm.internal.j.e(sessionDetails, "sessionDetails");
        return new k0(sessionDetails, h1Var, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (kotlin.jvm.internal.j.a(this.f13373a, k0Var.f13373a) && kotlin.jvm.internal.j.a(this.f13374b, k0Var.f13374b) && kotlin.jvm.internal.j.a(this.f13375c, k0Var.f13375c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f13373a.hashCode() * 31;
        int i7 = 0;
        h1 h1Var = this.f13374b;
        if (h1Var == null) {
            hashCode = 0;
        } else {
            hashCode = h1Var.hashCode();
        }
        int i10 = (hashCode2 + hashCode) * 31;
        Map map = this.f13375c;
        if (map != null) {
            i7 = map.hashCode();
        }
        return i10 + i7;
    }

    public final String toString() {
        return "SessionData(sessionDetails=" + this.f13373a + ", backgroundTime=" + this.f13374b + ", processDataMap=" + this.f13375c + ')';
    }

    public k0(o0 sessionDetails, h1 h1Var, Map map) {
        kotlin.jvm.internal.j.e(sessionDetails, "sessionDetails");
        this.f13373a = sessionDetails;
        this.f13374b = h1Var;
        this.f13375c = map;
    }
}
