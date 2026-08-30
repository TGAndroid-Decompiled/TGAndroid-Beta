package j3;

import java.util.Collections;
import java.util.List;
public final class c1 implements g {
    public static final c1 h;
    public static final String f8442n;
    public static final String f8443r;
    public static final String f8444s;
    public static final String v;
    public static final String f8445w;
    public static final String f8446x;
    public static final f0.d f8447y;
    public final String f8448a;
    public final y0 f8449b;
    public final x0 f8450c;
    public final e1 d;
    public final u0 e;
    public final z0 f8451f;

    static {
        s0 s0Var = new s0();
        s8.t tVar = s8.v.f44157b;
        s8.i0 i0Var = s8.i0.e;
        List list = Collections.EMPTY_LIST;
        s8.i0 i0Var2 = s8.i0.e;
        h = new c1("", new t0(s0Var), null, new x0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), e1.V, z0.f8896c);
        int i10 = h5.d0.f6937a;
        f8442n = Integer.toString(0, 36);
        f8443r = Integer.toString(1, 36);
        f8444s = Integer.toString(2, 36);
        v = Integer.toString(3, 36);
        f8445w = Integer.toString(4, 36);
        f8446x = Integer.toString(5, 36);
        f8447y = new f0.d(29);
    }

    public c1(String str, u0 u0Var, y0 y0Var, x0 x0Var, e1 e1Var, z0 z0Var) {
        this.f8448a = str;
        this.f8449b = y0Var;
        this.f8450c = x0Var;
        this.d = e1Var;
        this.e = u0Var;
        this.f8451f = z0Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c1) {
                c1 c1Var = (c1) obj;
                if (h5.d0.a(this.f8448a, c1Var.f8448a) && this.e.equals(c1Var.e) && h5.d0.a(this.f8449b, c1Var.f8449b) && h5.d0.a(this.f8450c, c1Var.f8450c) && h5.d0.a(this.d, c1Var.d) && h5.d0.a(this.f8451f, c1Var.f8451f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f8448a.hashCode() * 31;
        y0 y0Var = this.f8449b;
        if (y0Var != null) {
            i10 = y0Var.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f8450c.hashCode();
        int hashCode3 = this.e.hashCode();
        int hashCode4 = this.d.hashCode();
        return this.f8451f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + i10) * 31)) * 31)) * 31)) * 31);
    }
}
