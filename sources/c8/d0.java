package c8;
public abstract class d0 {
    public static gb.e1 f4524a;

    public static final void a() {
        try {
            if (f4524a == null) {
                gb.e1 e1Var = (gb.e1) ((gb.i) ((gb.r) o9.g.c().b(gb.r.class))).f13361o.mo23get();
                kotlin.jvm.internal.j.e(e1Var, "<set-?>");
                f4524a = e1Var;
            }
            gb.e1 e1Var2 = f4524a;
            if (e1Var2 != null) {
                if (e1Var2.f13325i) {
                    if (e1Var2 != null) {
                        e1Var2.b();
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
