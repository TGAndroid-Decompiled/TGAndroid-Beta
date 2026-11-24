package defpackage;
public final class b73 extends ccb implements eq4 {
    public final byte a;
    public boolean b;
    public final Object c;

    public b73(Object obj, fw2 fw2Var, byte b) {
        super(2, fw2Var);
        this.a = b;
        this.c = obj;
    }

    @Override
    public final fw2 create(Object obj, fw2 fw2Var) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new b73((v73) obj2, fw2Var, (byte) 0);
            default:
                return new b73((xs5) obj2, fw2Var, (byte) 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g5c g5cVar = g5c.a;
        switch (b) {
            case 0:
                return ((b73) create((ik4) obj, (fw2) obj2)).invokeSuspend(g5cVar);
            default:
                return ((b73) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5cVar);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
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
                    if (((v73) obj2).e(this) == bx2Var) {
                        return bx2Var;
                    }
                }
                return g5c.a;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        qse.b(obj);
                    } else {
                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    qse.b(obj);
                    hk4 data = ((xs5) obj2).c.a.getData();
                    this.b = true;
                    obj = khe.b(data, this);
                    if (obj == bx2Var) {
                        return bx2Var;
                    }
                }
                ih7 ih7Var = (ih7) obj;
                if (ih7Var != null) {
                    return ih7Var.a();
                }
                return d24.a;
        }
    }
}
