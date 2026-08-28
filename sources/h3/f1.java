package h3;

import fh.y5;
import java.util.Collections;
import java.util.List;
public final class f1 implements g {
    public static final f1 h;
    public static final String f9393n;
    public static final String f9394r;
    public static final String f9395s;
    public static final String v;
    public static final String f9396w;
    public static final y5 f9397x;
    public final String f9398a;
    public final c1 f9399b;
    public final b1 f9400c;
    public final h1 d;
    public final z0 f9401e;
    public final d1 f9402f;

    static {
        x0 x0Var = new x0();
        o8.x xVar = o8.z.f19105b;
        o8.l0 l0Var = o8.l0.f19056e;
        List list = Collections.EMPTY_LIST;
        o8.l0 l0Var2 = o8.l0.f19056e;
        h = new f1("", new y0(x0Var), null, new b1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), h1.U, d1.f9375c);
        int i9 = d5.f0.f4349a;
        f9393n = Integer.toString(0, 36);
        f9394r = Integer.toString(1, 36);
        f9395s = Integer.toString(2, 36);
        v = Integer.toString(3, 36);
        f9396w = Integer.toString(4, 36);
        f9397x = new y5(16);
    }

    public f1(String str, z0 z0Var, c1 c1Var, b1 b1Var, h1 h1Var, d1 d1Var) {
        this.f9398a = str;
        this.f9399b = c1Var;
        this.f9400c = b1Var;
        this.d = h1Var;
        this.f9401e = z0Var;
        this.f9402f = d1Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f1) {
                f1 f1Var = (f1) obj;
                if (d5.f0.a(this.f9398a, f1Var.f9398a) && this.f9401e.equals(f1Var.f9401e) && d5.f0.a(this.f9399b, f1Var.f9399b) && d5.f0.a(this.f9400c, f1Var.f9400c) && d5.f0.a(this.d, f1Var.d) && d5.f0.a(this.f9402f, f1Var.f9402f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i9;
        int hashCode = this.f9398a.hashCode() * 31;
        c1 c1Var = this.f9399b;
        if (c1Var != null) {
            i9 = c1Var.hashCode();
        } else {
            i9 = 0;
        }
        int hashCode2 = this.f9400c.hashCode();
        int hashCode3 = this.f9401e.hashCode();
        int hashCode4 = this.d.hashCode();
        return this.f9402f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + i9) * 31)) * 31)) * 31)) * 31);
    }
}
