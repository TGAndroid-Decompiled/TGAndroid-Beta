package c8;
public abstract class c0 {
    public static gb.d1 f4535a;

    public static final void a() {
        try {
            if (f4535a == null) {
                gb.d1 d1Var = (gb.d1) ((gb.i) ((gb.r) o9.g.c().b(gb.r.class))).f13398o.mo24get();
                kotlin.jvm.internal.j.e(d1Var, "<set-?>");
                f4535a = d1Var;
            }
            gb.d1 d1Var2 = f4535a;
            if (d1Var2 != null) {
                if (d1Var2.f13357i) {
                    if (d1Var2 != null) {
                        d1Var2.b();
                        return;
                    } else {
                        kotlin.jvm.internal.j.h("sharedSessionRepository");
                        throw null;
                    }
                }
                return;
            }
            kotlin.jvm.internal.j.h("sharedSessionRepository");
            throw null;
        } catch (Exception unused) {
        }
    }
}
