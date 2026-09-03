package j3;

import java.util.Collections;
import java.util.List;
public final class c1 implements g {
    public static final c1 h;
    public static final String f8424n;
    public static final String f8425r;
    public static final String f8426s;
    public static final String v;
    public static final String f8427w;
    public static final String f8428x;
    public static final f0.d f8429y;
    public final String f8430a;
    public final y0 f8431b;
    public final x0 f8432c;
    public final e1 d;
    public final u0 e;
    public final z0 f8433f;

    static {
        s0 s0Var = new s0();
        s8.t tVar = s8.v.f44222b;
        s8.i0 i0Var = s8.i0.e;
        List list = Collections.EMPTY_LIST;
        s8.i0 i0Var2 = s8.i0.e;
        h = new c1("", new t0(s0Var), null, new x0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), e1.V, z0.f8878c);
        int i10 = h5.d0.f6924a;
        f8424n = Integer.toString(0, 36);
        f8425r = Integer.toString(1, 36);
        f8426s = Integer.toString(2, 36);
        v = Integer.toString(3, 36);
        f8427w = Integer.toString(4, 36);
        f8428x = Integer.toString(5, 36);
        f8429y = new f0.d(29);
    }

    public c1(String str, u0 u0Var, y0 y0Var, x0 x0Var, e1 e1Var, z0 z0Var) {
        this.f8430a = str;
        this.f8431b = y0Var;
        this.f8432c = x0Var;
        this.d = e1Var;
        this.e = u0Var;
        this.f8433f = z0Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c1) {
                c1 c1Var = (c1) obj;
                if (h5.d0.a(this.f8430a, c1Var.f8430a) && this.e.equals(c1Var.e) && h5.d0.a(this.f8431b, c1Var.f8431b) && h5.d0.a(this.f8432c, c1Var.f8432c) && h5.d0.a(this.d, c1Var.d) && h5.d0.a(this.f8433f, c1Var.f8433f)) {
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
        int hashCode = this.f8430a.hashCode() * 31;
        y0 y0Var = this.f8431b;
        if (y0Var != null) {
            i10 = y0Var.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f8432c.hashCode();
        int hashCode3 = this.e.hashCode();
        int hashCode4 = this.d.hashCode();
        return this.f8433f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + i10) * 31)) * 31)) * 31)) * 31);
    }
}
