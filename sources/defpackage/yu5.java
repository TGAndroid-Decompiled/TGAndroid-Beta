package defpackage;

import java.util.Arrays;
public final class yu5 extends yfb implements is4 {
    public final byte a;
    public boolean b;
    public final av5 c;
    public final zj8 d;
    public final Long e;

    public yu5(av5 av5Var, zj8 zj8Var, Long l, zw2 zw2Var, byte b) {
        super(2, zw2Var);
        this.a = b;
        this.c = av5Var;
        this.d = zj8Var;
        this.e = l;
    }

    @Override
    public final zw2 create(Object obj, zw2 zw2Var) {
        switch (this.a) {
            case 0:
                return new yu5(this.c, this.d, this.e, zw2Var, (byte) 0);
            default:
                return new yu5(this.c, this.d, this.e, zw2Var, (byte) 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        f9c f9cVar = f9c.a;
        ux2 ux2Var = (ux2) obj;
        zw2 zw2Var = (zw2) obj2;
        switch (b) {
            case 0:
                return ((yu5) create(ux2Var, zw2Var)).invokeSuspend(f9cVar);
            default:
                return ((yu5) create(ux2Var, zw2Var)).invokeSuspend(f9cVar);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Long l = this.e;
        zj8 zj8Var = this.d;
        av5 av5Var = this.c;
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
                    mm4 data = av5Var.c.a.getData();
                    this.b = true;
                    obj = qme.b(data, this);
                    if (obj == vx2Var) {
                        return vx2Var;
                    }
                }
                rj7 rj7Var = (rj7) obj;
                if (rj7Var != null) {
                    zj8Var.getClass();
                    Object obj2 = rj7Var.a.get(zj8Var);
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
                        ixe.b(obj);
                        return obj;
                    }
                    grb.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ixe.b(obj);
                xj8 xj8Var = av5Var.c;
                zu5 zu5Var = new zu5(zj8Var, l, null);
                this.b = true;
                Object a = xj8Var.a(new wj8(zu5Var, null, (byte) 1), this);
                if (a == vx2Var) {
                    return vx2Var;
                }
                return a;
        }
    }
}
