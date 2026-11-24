package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
public final class zh1 extends ccb implements eq4 {
    public final byte a;
    public boolean b;
    public Object c;
    public final Object d;
    public final Object e;

    public zh1(Object obj, Object obj2, fw2 fw2Var, byte b) {
        super(2, fw2Var);
        this.a = b;
        this.d = obj;
        this.e = obj2;
    }

    @Override
    public final fw2 create(Object obj, fw2 fw2Var) {
        byte b = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                zh1 zh1Var = new zh1((ik4) obj3, (bi1) obj2, fw2Var, (byte) 0);
                zh1Var.c = obj;
                return zh1Var;
            default:
                zh1 zh1Var2 = new zh1((v73) obj3, (eq4) obj2, fw2Var, (byte) 1);
                zh1Var2.c = obj;
                return zh1Var2;
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
                return ((zh1) create(ax2Var, fw2Var)).invokeSuspend(g5cVar);
            default:
                return ((zh1) create(ax2Var, fw2Var)).invokeSuspend(g5cVar);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Object obj2 = this.e;
        bx2 bx2Var = bx2.a;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                boolean z = this.b;
                g5c g5cVar = g5c.a;
                if (z) {
                    if (z) {
                        qse.b(obj);
                    } else {
                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    qse.b(obj);
                    ax2 ax2Var = (ax2) this.c;
                    ik4 ik4Var = (ik4) obj3;
                    bi1 bi1Var = (bi1) obj2;
                    sw2 sw2Var = bi1Var.a;
                    int i = bi1Var.b;
                    if (i == -3) {
                        i = -2;
                    }
                    o01 o01Var = bi1Var.c;
                    eq4 ai1Var = new ai1(bi1Var, null, (byte) 0);
                    fl8 fl8Var = new fl8(qzd.b(ax2Var, sw2Var), wqd.a(i, o01Var, 4));
                    fl8Var.R(dx2.b, fl8Var, ai1Var);
                    this.b = true;
                    Object a = wge.a(ik4Var, fl8Var, true, this);
                    if (a != bx2Var) {
                        a = g5cVar;
                    }
                    if (a == bx2Var) {
                        return bx2Var;
                    }
                }
                return g5cVar;
            default:
                v73 v73Var = (v73) obj3;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        qse.b(obj);
                        return obj;
                    }
                    sc8.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    qse.b(obj);
                    cp2 a2 = hsd.a();
                    d17 d17Var = new d17((eq4) obj2, a2, v73Var.h.F(), ((ax2) this.c).c());
                    c5a c5aVar = v73Var.l;
                    Object d = ((q01) c5aVar.d).d(d17Var);
                    if (d instanceof ej1) {
                        Throwable th = ((ej1) d).a;
                        if (th == null) {
                            throw new IllegalStateException("Channel was closed normally");
                        }
                        throw th;
                    } else if (!(d instanceof fj1)) {
                        if (((AtomicInteger) ((i4d) c5aVar.e).a).getAndIncrement() == 0) {
                            ppd.b((ax2) c5aVar.b, new eh4(c5aVar, null));
                        }
                        this.b = true;
                        Object h = a2.h(this);
                        if (h == bx2Var) {
                            return bx2Var;
                        }
                        return h;
                    } else {
                        sc8.j("Check failed.");
                    }
                }
                return null;
        }
    }
}
