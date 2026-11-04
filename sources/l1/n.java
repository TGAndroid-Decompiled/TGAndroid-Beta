package l1;

import b8.ib;
public final class n extends hd.j implements od.q {
    public final int f17586a = 1;
    public int f17587b;
    public Object f17588c;

    public n(int i3, fd.c cVar) {
        super(i3, cVar);
    }

    @Override
    public final Object a(Object obj, Object obj2, Object obj3) {
        switch (this.f17586a) {
            case 0:
                zd.c cVar = (zd.c) obj;
                Throwable th2 = (Throwable) obj2;
                return new n((b0) this.f17588c, (fd.c) obj3).invokeSuspend(dd.k.f8801a);
            default:
                ((Boolean) obj2).getClass();
                n nVar = new n(3, (fd.c) obj3);
                nVar.f17588c = (d0) obj;
                return nVar.invokeSuspend(dd.k.f8801a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f17586a) {
            case 0:
                gd.a aVar = gd.a.f12241a;
                int i3 = this.f17587b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ib.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ib.b(obj);
                    this.f17587b = 1;
                    if (b0.b((b0) this.f17588c, this) == aVar) {
                        return aVar;
                    }
                }
                return dd.k.f8801a;
            default:
                gd.a aVar2 = gd.a.f12241a;
                int i10 = this.f17587b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ib.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.b(obj);
                d0 d0Var = (d0) this.f17588c;
                this.f17587b = 1;
                d0Var.getClass();
                Object a10 = d0.a(d0Var, this);
                if (a10 == aVar2) {
                    return aVar2;
                }
                return a10;
        }
    }

    public n(b0 b0Var, fd.c cVar) {
        super(3, cVar);
        this.f17588c = b0Var;
    }
}
