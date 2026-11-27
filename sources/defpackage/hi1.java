package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
public final class hi1 extends yfb implements is4 {
    public final byte a;
    public boolean b;
    public Object c;
    public final Object d;
    public final Object e;

    public hi1(Object obj, Object obj2, zw2 zw2Var, byte b) {
        super(2, zw2Var);
        this.a = b;
        this.d = obj;
        this.e = obj2;
    }

    @Override
    public final zw2 create(Object obj, zw2 zw2Var) {
        byte b = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                hi1 hi1Var = new hi1((nm4) obj3, (ji1) obj2, zw2Var, (byte) 0);
                hi1Var.c = obj;
                return hi1Var;
            default:
                hi1 hi1Var2 = new hi1((o83) obj3, (is4) obj2, zw2Var, (byte) 1);
                hi1Var2.c = obj;
                return hi1Var2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g9c g9cVar = g9c.a;
        ux2 ux2Var = (ux2) obj;
        zw2 zw2Var = (zw2) obj2;
        switch (b) {
            case 0:
                return ((hi1) create(ux2Var, zw2Var)).invokeSuspend(g9cVar);
            default:
                return ((hi1) create(ux2Var, zw2Var)).invokeSuspend(g9cVar);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Object obj2 = this.e;
        vx2 vx2Var = vx2.a;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                boolean z = this.b;
                g9c g9cVar = g9c.a;
                if (z) {
                    if (z) {
                        ixe.b(obj);
                    } else {
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ixe.b(obj);
                    ux2 ux2Var = (ux2) this.c;
                    nm4 nm4Var = (nm4) obj3;
                    ji1 ji1Var = (ji1) obj2;
                    mx2 mx2Var = ji1Var.a;
                    int i = ji1Var.b;
                    if (i == -3) {
                        i = -2;
                    }
                    x01 x01Var = ji1Var.c;
                    is4 ii1Var = new ii1(ji1Var, null, (byte) 0);
                    so8 so8Var = new so8(g4e.b(ux2Var, mx2Var), mvd.a(i, x01Var, 4));
                    so8Var.R(xx2.b, so8Var, ii1Var);
                    this.b = true;
                    Object a = tle.a(nm4Var, so8Var, true, this);
                    if (a != vx2Var) {
                        a = g9cVar;
                    }
                    if (a == vx2Var) {
                        return vx2Var;
                    }
                }
                return g9cVar;
            default:
                o83 o83Var = (o83) obj3;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        ixe.b(obj);
                        return obj;
                    }
                    grb.i("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ixe.b(obj);
                    vp2 a2 = xwd.a();
                    k37 k37Var = new k37((is4) obj2, a2, o83Var.h.r(), ((ux2) this.c).c());
                    lyc lycVar = o83Var.l;
                    Object d = ((z01) lycVar.d).d(k37Var);
                    if (d instanceof nj1) {
                        Throwable th = ((nj1) d).a;
                        if (th == null) {
                            throw new IllegalStateException("Channel was closed normally");
                        }
                        throw th;
                    } else if (!(d instanceof oj1)) {
                        if (((AtomicInteger) ((z8d) lycVar.e).b).getAndIncrement() == 0) {
                            fud.b((ux2) lycVar.b, new fj4(lycVar, null));
                        }
                        this.b = true;
                        Object h = a2.h(this);
                        if (h == vx2Var) {
                            return vx2Var;
                        }
                        return h;
                    } else {
                        grb.i("Check failed.");
                    }
                }
                return null;
        }
    }
}
