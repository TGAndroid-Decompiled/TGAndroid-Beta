package j3;

import java.util.Collections;
import java.util.List;
public final class f1 implements g {
    public static final f1 h;
    public static final String f10431n;
    public static final String f10432r;
    public static final String f10433s;
    public static final String v;
    public static final String f10434w;
    public static final d0 f10435x;
    public final String f10436a;
    public final c1 f10437b;
    public final b1 f10438c;
    public final h1 d;
    public final z0 f10439e;
    public final d1 f10440f;

    static {
        x0 x0Var = new x0();
        q8.x xVar = q8.z.f46511b;
        q8.l0 l0Var = q8.l0.f46462e;
        List list = Collections.EMPTY_LIST;
        q8.l0 l0Var2 = q8.l0.f46462e;
        h = new f1("", new y0(x0Var), null, new b1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), h1.U, d1.f10413c);
        int i10 = f5.d0.f6579a;
        f10431n = Integer.toString(0, 36);
        f10432r = Integer.toString(1, 36);
        f10433s = Integer.toString(2, 36);
        v = Integer.toString(3, 36);
        f10434w = Integer.toString(4, 36);
        f10435x = new d0(3);
    }

    public f1(String str, z0 z0Var, c1 c1Var, b1 b1Var, h1 h1Var, d1 d1Var) {
        this.f10436a = str;
        this.f10437b = c1Var;
        this.f10438c = b1Var;
        this.d = h1Var;
        this.f10439e = z0Var;
        this.f10440f = d1Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f1) {
                f1 f1Var = (f1) obj;
                if (f5.d0.a(this.f10436a, f1Var.f10436a) && this.f10439e.equals(f1Var.f10439e) && f5.d0.a(this.f10437b, f1Var.f10437b) && f5.d0.a(this.f10438c, f1Var.f10438c) && f5.d0.a(this.d, f1Var.d) && f5.d0.a(this.f10440f, f1Var.f10440f)) {
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
        int hashCode = this.f10436a.hashCode() * 31;
        c1 c1Var = this.f10437b;
        if (c1Var != null) {
            i10 = c1Var.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f10438c.hashCode();
        int hashCode3 = this.f10439e.hashCode();
        int hashCode4 = this.d.hashCode();
        return this.f10440f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + i10) * 31)) * 31)) * 31)) * 31);
    }
}
