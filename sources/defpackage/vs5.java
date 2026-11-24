package defpackage;

import java.util.Arrays;
public final class vs5 extends ccb implements eq4 {
    public final byte a;
    public boolean b;
    public final xs5 c;
    public final lg8 d;
    public final Long e;

    public vs5(xs5 xs5Var, lg8 lg8Var, Long l, fw2 fw2Var, byte b) {
        super(2, fw2Var);
        this.a = b;
        this.c = xs5Var;
        this.d = lg8Var;
        this.e = l;
    }

    @Override
    public final fw2 create(Object obj, fw2 fw2Var) {
        switch (this.a) {
            case 0:
                return new vs5(this.c, this.d, this.e, fw2Var, (byte) 0);
            default:
                return new vs5(this.c, this.d, this.e, fw2Var, (byte) 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g5c g5cVar = g5c.a;
        ax2 ax2Var = (ax2) obj;
        fw2 fw2Var = (fw2) obj2;
        switch (b) {
            case 0:
                return ((vs5) create(ax2Var, fw2Var)).invokeSuspend(g5cVar);
            default:
                return ((vs5) create(ax2Var, fw2Var)).invokeSuspend(g5cVar);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Long l = this.e;
        lg8 lg8Var = this.d;
        xs5 xs5Var = this.c;
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
                    hk4 data = xs5Var.c.a.getData();
                    this.b = true;
                    obj = khe.b(data, this);
                    if (obj == bx2Var) {
                        return bx2Var;
                    }
                }
                ih7 ih7Var = (ih7) obj;
                if (ih7Var != null) {
                    lg8Var.getClass();
                    Object obj2 = ih7Var.a.get(lg8Var);
                    if (obj2 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj2;
                        obj2 = Arrays.copyOf(bArr, bArr.length);
                    }
                    if (obj2 != null) {
                        return obj2;
                    }
                    return l;
                }
                return l;
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
                jg8 jg8Var = xs5Var.c;
                ws5 ws5Var = new ws5(lg8Var, l, null);
                this.b = true;
                Object a = jg8Var.a(new ig8(ws5Var, null, (byte) 1), this);
                if (a == bx2Var) {
                    return bx2Var;
                }
                return a;
        }
    }
}
