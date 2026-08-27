package h3;

import java.util.Collections;
import java.util.List;

public final class f1 implements g {
    public static final f1 h;

    public static final String f7824n;

    public static final String f7825r;

    public static final String f7826s;
    public static final String v;

    public static final String f7827w;

    public static final f9.z f7828x;

    public final String f7829a;

    public final c1 f7830b;

    public final b1 f7831c;
    public final h1 d;

    public final z0 f7832e;

    public final d1 f7833f;

    static {
        x0 x0Var = new x0();
        p8.x xVar = p8.z.f45604b;
        p8.l0 l0Var = p8.l0.f45555e;
        List list = Collections.EMPTY_LIST;
        p8.l0 l0Var2 = p8.l0.f45555e;
        h = new f1("", new z0(x0Var), null, new b1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), h1.U, d1.f7806c);
        int i10 = d5.g0.f4795a;
        f7824n = Integer.toString(0, 36);
        f7825r = Integer.toString(1, 36);
        f7826s = Integer.toString(2, 36);
        v = Integer.toString(3, 36);
        f7827w = Integer.toString(4, 36);
        f7828x = new f9.z(20);
    }

    public f1(String str, z0 z0Var, c1 c1Var, b1 b1Var, h1 h1Var, d1 d1Var) {
        this.f7829a = str;
        this.f7830b = c1Var;
        this.f7831c = b1Var;
        this.d = h1Var;
        this.f7832e = z0Var;
        this.f7833f = d1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return d5.g0.a(this.f7829a, f1Var.f7829a) && this.f7832e.equals(f1Var.f7832e) && d5.g0.a(this.f7830b, f1Var.f7830b) && d5.g0.a(this.f7831c, f1Var.f7831c) && d5.g0.a(this.d, f1Var.d) && d5.g0.a(this.f7833f, f1Var.f7833f);
    }

    public final int hashCode() {
        int iHashCode = this.f7829a.hashCode() * 31;
        c1 c1Var = this.f7830b;
        return this.f7833f.hashCode() + ((this.d.hashCode() + ((this.f7832e.hashCode() + ((this.f7831c.hashCode() + ((iHashCode + (c1Var != null ? c1Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
