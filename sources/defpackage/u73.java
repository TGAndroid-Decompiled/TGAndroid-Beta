package defpackage;
public final class u73 extends yfb implements is4 {
    public final byte a;
    public boolean b;
    public final Object c;

    public u73(Object obj, zw2 zw2Var, byte b) {
        super(2, zw2Var);
        this.a = b;
        this.c = obj;
    }

    @Override
    public final zw2 create(Object obj, zw2 zw2Var) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new u73((o83) obj2, zw2Var, (byte) 0);
            default:
                return new u73((av5) obj2, zw2Var, (byte) 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        f9c f9cVar = f9c.a;
        switch (b) {
            case 0:
                return ((u73) create((nm4) obj, (zw2) obj2)).invokeSuspend(f9cVar);
            default:
                return ((u73) create((ux2) obj, (zw2) obj2)).invokeSuspend(f9cVar);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
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
                    if (((o83) obj2).e(this) == vx2Var) {
                        return vx2Var;
                    }
                }
                return f9c.a;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        ixe.b(obj);
                    } else {
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ixe.b(obj);
                    mm4 data = ((av5) obj2).c.a.getData();
                    this.b = true;
                    obj = qme.b(data, this);
                    if (obj == vx2Var) {
                        return vx2Var;
                    }
                }
                rj7 rj7Var = (rj7) obj;
                if (rj7Var != null) {
                    return rj7Var.a();
                }
                return y24.a;
        }
    }
}
