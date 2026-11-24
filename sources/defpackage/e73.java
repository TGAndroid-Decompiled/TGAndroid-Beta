package defpackage;
public final class e73 extends ccb implements gq4 {
    public final byte a = 1;
    public boolean b;
    public Object c;

    public e73(v73 v73Var, fw2 fw2Var) {
        super(3, fw2Var);
        this.c = v73Var;
    }

    @Override
    public final Object a(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        g5c g5cVar = g5c.a;
        switch (b) {
            case 0:
                ik4 ik4Var = (ik4) obj;
                Throwable th = (Throwable) obj2;
                return new e73((v73) this.c, (fw2) obj3).invokeSuspend(g5cVar);
            default:
                ((Boolean) obj2).getClass();
                e73 e73Var = new e73(3, (fw2) obj3);
                e73Var.c = (oa4) obj;
                return e73Var.invokeSuspend(g5cVar);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        bx2 bx2Var = bx2.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        qse.b(obj);
                    } else {
                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    qse.b(obj);
                    this.b = true;
                    if (((v73) this.c).b(this) == bx2Var) {
                        return bx2Var;
                    }
                }
                return g5c.a;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        qse.b(obj);
                        return obj;
                    }
                    sc8.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qse.b(obj);
                oa4 oa4Var = (oa4) this.c;
                this.b = true;
                oa4Var.getClass();
                Object a = oa4.a(oa4Var, this);
                if (a == bx2Var) {
                    return bx2Var;
                }
                return a;
        }
    }

    public e73(int i, fw2 fw2Var) {
        super(i, fw2Var);
    }
}
