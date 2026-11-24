package defpackage;

import java.util.Arrays;
public final class uu5 extends eeb implements fs4 {
    public final byte a;
    public boolean b;
    public final wu5 c;
    public final ni8 d;
    public final Long e;

    public uu5(wu5 wu5Var, ni8 ni8Var, Long l, px2 px2Var, byte b) {
        super(2, px2Var);
        this.a = b;
        this.c = wu5Var;
        this.d = ni8Var;
        this.e = l;
    }

    @Override
    public final px2 create(Object obj, px2 px2Var) {
        switch (this.a) {
            case 0:
                return new uu5(this.c, this.d, this.e, px2Var, (byte) 0);
            default:
                return new uu5(this.c, this.d, this.e, px2Var, (byte) 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g7c g7cVar = g7c.a;
        ky2 ky2Var = (ky2) obj;
        px2 px2Var = (px2) obj2;
        switch (b) {
            case 0:
                return ((uu5) create(ky2Var, px2Var)).invokeSuspend(g7cVar);
            default:
                return ((uu5) create(ky2Var, px2Var)).invokeSuspend(g7cVar);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Long l = this.e;
        ni8 ni8Var = this.d;
        wu5 wu5Var = this.c;
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
                    im4 data = wu5Var.c.a.getData();
                    this.b = true;
                    obj = lje.b(data, this);
                    if (obj == ly2Var) {
                        return ly2Var;
                    }
                }
                lj7 lj7Var = (lj7) obj;
                if (lj7Var != null) {
                    ni8Var.getClass();
                    Object obj2 = lj7Var.a.get(ni8Var);
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
                        tue.b(obj);
                        return obj;
                    }
                    dq9.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tue.b(obj);
                li8 li8Var = wu5Var.c;
                vu5 vu5Var = new vu5(ni8Var, l, null);
                this.b = true;
                Object a = li8Var.a(new ki8(vu5Var, null, (byte) 1), this);
                if (a == ly2Var) {
                    return ly2Var;
                }
                return a;
        }
    }
}
