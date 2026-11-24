package defpackage;
public final class aga extends ccb implements gq4 {
    public boolean a;
    public ik4 b;
    public Throwable c;
    public final fga d;

    public aga(fga fgaVar, fw2 fw2Var) {
        super(3, fw2Var);
        this.d = fgaVar;
    }

    @Override
    public final Object a(Object obj, Object obj2, Object obj3) {
        aga agaVar = new aga(this.d, (fw2) obj3);
        agaVar.b = (ik4) obj;
        agaVar.c = (Throwable) obj2;
        return agaVar.invokeSuspend(g5c.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (z) {
            if (z) {
                qse.b(obj);
            } else {
                sc8.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            qse.b(obj);
            ik4 ik4Var = this.b;
            Throwable th = this.c;
            a6a a = this.d.b.a(null);
            w5a w5aVar = new w5a(a, null, null);
            StringBuilder sb = new StringBuilder("Init session datastore failed with exception message: ");
            sb.append(th.getMessage());
            sb.append(". Emit fallback session ");
            ir2.x(sb, a.a, "FirebaseSessions");
            this.b = null;
            this.a = true;
            Object c = ik4Var.c(w5aVar, this);
            bx2 bx2Var = bx2.a;
            if (c == bx2Var) {
                return bx2Var;
            }
        }
        return g5c.a;
    }
}
