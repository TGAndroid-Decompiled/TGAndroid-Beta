package j3;

import java.util.Collections;
import java.util.List;
public final class c1 implements g {
    public static final c1 h;
    public static final String f9001n;
    public static final String f9002r;
    public static final String f9003s;
    public static final String v;
    public static final String f9004w;
    public static final String f9005x;
    public static final f5.u f9006y;
    public final String f9007a;
    public final y0 f9008b;
    public final x0 f9009c;
    public final e1 d;
    public final u0 f9010e;
    public final z0 f9011f;

    static {
        s0 s0Var = new s0();
        s8.t tVar = s8.v.f47143b;
        s8.i0 i0Var = s8.i0.f47108e;
        List list = Collections.EMPTY_LIST;
        s8.i0 i0Var2 = s8.i0.f47108e;
        h = new c1("", new t0(s0Var), null, new x0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), e1.V, z0.f9495c);
        int i10 = h5.d0.f7237a;
        f9001n = Integer.toString(0, 36);
        f9002r = Integer.toString(1, 36);
        f9003s = Integer.toString(2, 36);
        v = Integer.toString(3, 36);
        f9004w = Integer.toString(4, 36);
        f9005x = Integer.toString(5, 36);
        f9006y = new f5.u(29);
    }

    public c1(String str, u0 u0Var, y0 y0Var, x0 x0Var, e1 e1Var, z0 z0Var) {
        this.f9007a = str;
        this.f9008b = y0Var;
        this.f9009c = x0Var;
        this.d = e1Var;
        this.f9010e = u0Var;
        this.f9011f = z0Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c1) {
                c1 c1Var = (c1) obj;
                if (h5.d0.a(this.f9007a, c1Var.f9007a) && this.f9010e.equals(c1Var.f9010e) && h5.d0.a(this.f9008b, c1Var.f9008b) && h5.d0.a(this.f9009c, c1Var.f9009c) && h5.d0.a(this.d, c1Var.d) && h5.d0.a(this.f9011f, c1Var.f9011f)) {
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
        int hashCode = this.f9007a.hashCode() * 31;
        y0 y0Var = this.f9008b;
        if (y0Var != null) {
            i10 = y0Var.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f9009c.hashCode();
        int hashCode3 = this.f9010e.hashCode();
        int hashCode4 = this.d.hashCode();
        return this.f9011f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + i10) * 31)) * 31)) * 31)) * 31);
    }
}
