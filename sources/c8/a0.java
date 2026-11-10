package c8;
public abstract class a0 {
    public static gb.f1 f5370a;

    public static final void a() {
        try {
            if (f5370a == null) {
                gb.f1 f1Var = (gb.f1) ((gb.i) ((gb.s) o9.g.c().b(gb.s.class))).f13710o.mo24get();
                kotlin.jvm.internal.j.e(f1Var, "<set-?>");
                f5370a = f1Var;
            }
            gb.f1 f1Var2 = f5370a;
            if (f1Var2 != null) {
                if (f1Var2.f13684i) {
                    if (f1Var2 != null) {
                        f1Var2.b();
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
