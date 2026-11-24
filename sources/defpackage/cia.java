package defpackage;
public final class cia extends eeb implements hs4 {
    public boolean a;
    public jm4 b;
    public Throwable c;
    public final hia d;

    public cia(hia hiaVar, px2 px2Var) {
        super(3, px2Var);
        this.d = hiaVar;
    }

    @Override
    public final Object a(Object obj, Object obj2, Object obj3) {
        cia ciaVar = new cia(this.d, (px2) obj3);
        ciaVar.b = (jm4) obj;
        ciaVar.c = (Throwable) obj2;
        return ciaVar.invokeSuspend(g7c.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (z) {
            if (z) {
                tue.b(obj);
            } else {
                dq9.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            tue.b(obj);
            jm4 jm4Var = this.b;
            Throwable th = this.c;
            c8a a = this.d.b.a(null);
            y7a y7aVar = new y7a(a, null, null);
            StringBuilder sb = new StringBuilder("Init session datastore failed with exception message: ");
            sb.append(th.getMessage());
            sb.append(". Emit fallback session ");
            ts2.w(sb, a.a, "FirebaseSessions");
            this.b = null;
            this.a = true;
            Object c = jm4Var.c(y7aVar, this);
            ly2 ly2Var = ly2.a;
            if (c == ly2Var) {
                return ly2Var;
            }
        }
        return g7c.a;
    }
}
