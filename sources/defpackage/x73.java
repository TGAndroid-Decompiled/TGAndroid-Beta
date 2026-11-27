package defpackage;
public final class x73 extends yfb implements ks4 {
    public final byte a = 1;
    public boolean b;
    public Object c;

    public x73(o83 o83Var, zw2 zw2Var) {
        super(3, zw2Var);
        this.c = o83Var;
    }

    @Override
    public final Object a(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        g9c g9cVar = g9c.a;
        switch (b) {
            case 0:
                nm4 nm4Var = (nm4) obj;
                Throwable th = (Throwable) obj2;
                return new x73((o83) this.c, (zw2) obj3).invokeSuspend(g9cVar);
            default:
                ((Boolean) obj2).getClass();
                x73 x73Var = new x73(3, (zw2) obj3);
                x73Var.c = (lc4) obj;
                return x73Var.invokeSuspend(g9cVar);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        vx2 vx2Var = vx2.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        ixe.b(obj);
                    } else {
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ixe.b(obj);
                    this.b = true;
                    if (((o83) this.c).b(this) == vx2Var) {
                        return vx2Var;
                    }
                }
                return g9c.a;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        ixe.b(obj);
                        return obj;
                    }
                    grb.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ixe.b(obj);
                lc4 lc4Var = (lc4) this.c;
                this.b = true;
                lc4Var.getClass();
                Object a = lc4.a(lc4Var, this);
                if (a == vx2Var) {
                    return vx2Var;
                }
                return a;
        }
    }

    public x73(int i, zw2 zw2Var) {
        super(i, zw2Var);
    }
}
