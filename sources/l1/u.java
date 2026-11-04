package l1;

import b8.ib;
public final class u extends hd.j implements od.l {
    public Throwable f17641a;
    public int f17642b;
    public final b0 f17643c;

    public u(b0 b0Var, fd.c cVar) {
        super(1, cVar);
        this.f17643c = b0Var;
    }

    @Override
    public final fd.c create(fd.c cVar) {
        return new u(this.f17643c, cVar);
    }

    @Override
    public final Object invoke(Object obj) {
        return ((u) create((fd.c) obj)).invokeSuspend(dd.k.f8801a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        f1 f1Var;
        gd.a aVar = gd.a.f12241a;
        int i3 = this.f17642b;
        b0 b0Var = this.f17643c;
        try {
        } catch (Throwable th3) {
            m0 g7 = b0Var.g();
            this.f17641a = th3;
            this.f17642b = 2;
            Object d = g7.d(this);
            if (d != aVar) {
                th2 = th3;
                obj = d;
            }
        }
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    th2 = this.f17641a;
                    ib.b(obj);
                    f1Var = new x0(((Number) obj).intValue(), th2);
                    return new dd.e(f1Var, Boolean.TRUE);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.b(obj);
        } else {
            ib.b(obj);
            this.f17642b = 1;
            obj = b0.f(b0Var, true, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        f1Var = (f1) obj;
        return new dd.e(f1Var, Boolean.TRUE);
    }
}
