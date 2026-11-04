package b8;
public abstract class qb {
    public static db.e1 f3028a;

    public static final void a() {
        try {
            if (f3028a == null) {
                db.e1 e1Var = (db.e1) ((db.i) ((db.r) n9.h.c().b(db.r.class))).f8684o.mo5get();
                kotlin.jvm.internal.j.e(e1Var, "<set-?>");
                f3028a = e1Var;
            }
            db.e1 e1Var2 = f3028a;
            if (e1Var2 != null) {
                if (e1Var2.f8650i) {
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
