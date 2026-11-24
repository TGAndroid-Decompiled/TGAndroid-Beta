package defpackage;
public final class n83 extends eeb implements fs4 {
    public final byte a;
    public boolean b;
    public final Object c;

    public n83(Object obj, px2 px2Var, byte b) {
        super(2, px2Var);
        this.a = b;
        this.c = obj;
    }

    @Override
    public final px2 create(Object obj, px2 px2Var) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new n83((h93) obj2, px2Var, (byte) 0);
            default:
                return new n83((wu5) obj2, px2Var, (byte) 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g7c g7cVar = g7c.a;
        switch (b) {
            case 0:
                return ((n83) create((jm4) obj, (px2) obj2)).invokeSuspend(g7cVar);
            default:
                return ((n83) create((ky2) obj, (px2) obj2)).invokeSuspend(g7cVar);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        ly2 ly2Var = ly2.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        tue.b(obj);
                    } else {
                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    tue.b(obj);
                    this.b = true;
                    if (((h93) obj2).e(this) == ly2Var) {
                        return ly2Var;
                    }
                }
                return g7c.a;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        tue.b(obj);
                    } else {
                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    tue.b(obj);
                    im4 data = ((wu5) obj2).c.a.getData();
                    this.b = true;
                    obj = lje.b(data, this);
                    if (obj == ly2Var) {
                        return ly2Var;
                    }
                }
                lj7 lj7Var = (lj7) obj;
                if (lj7Var != null) {
                    return lj7Var.a();
                }
                return o34.a;
        }
    }
}
