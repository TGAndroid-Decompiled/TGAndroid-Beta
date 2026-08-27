package k1;

import h7.k6;
import ia.c0;

public final class n extends tc.i implements ad.p {

    public final int f14278a;

    public int f14279b;

    public Object f14280c;
    public final z d;

    public n(z zVar, rc.c cVar, int i10) {
        super(2, cVar);
        this.f14278a = i10;
        this.d = zVar;
    }

    @Override
    public final rc.c create(Object obj, rc.c cVar) {
        switch (this.f14278a) {
            case 0:
                n nVar = new n(this.d, cVar, 0);
                nVar.f14280c = obj;
                return nVar;
            default:
                n nVar2 = new n(this.d, cVar, 1);
                nVar2.f14280c = obj;
                return nVar2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14278a) {
            case 0:
                return ((n) create((k) obj, (rc.c) obj2)).invokeSuspend(pc.i.f45696a);
            default:
                return ((n) create((ld.c) obj, (rc.c) obj2)).invokeSuspend(pc.i.f45696a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF;
        switch (this.f14278a) {
            case 0:
                sc.a aVar = sc.a.f47847a;
                int i10 = this.f14279b;
                pc.i iVar = pc.i.f45696a;
                if (i10 == 0) {
                    k6.b(obj);
                    k kVar = (k) this.f14280c;
                    boolean z10 = kVar instanceof i;
                    z zVar = this.d;
                    if (z10) {
                        i iVar2 = (i) kVar;
                        this.f14279b = 1;
                        a0 a0Var = (a0) zVar.f14335f.b();
                        if (a0Var instanceof b) {
                            objF = iVar;
                        } else if (!(a0Var instanceof h)) {
                            if (kotlin.jvm.internal.j.a(a0Var, b0.f14259a)) {
                                objF = zVar.f(this);
                                if (objF != aVar) {
                                }
                            } else if (a0Var instanceof g) {
                                throw new IllegalStateException("Can't read in final state.");
                            }
                            objF = iVar;
                        } else if (a0Var != iVar2.f14271a || (objF = zVar.f(this)) != aVar) {
                            objF = iVar;
                        }
                        if (objF == aVar) {
                            return aVar;
                        }
                    } else if (kVar instanceof j) {
                        this.f14279b = 2;
                        if (z.a(zVar, (j) kVar, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i10 != 1 && i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k6.b(obj);
                }
                return iVar;
            default:
                z zVar2 = this.d;
                ld.m mVar = zVar2.f14335f;
                sc.a aVar2 = sc.a.f47847a;
                int i11 = this.f14279b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k6.b(obj);
                    return pc.i.f45696a;
                }
                k6.b(obj);
                ld.c cVar = (ld.c) this.f14280c;
                a0 a0Var2 = (a0) mVar.b();
                if (!(a0Var2 instanceof b)) {
                    zVar2.f14336n.E(new i(a0Var2));
                }
                c0 c0Var = new c0(a0Var2, null, 1);
                this.f14279b = 1;
                mVar.q(new ld.i(new kotlin.jvm.internal.o(), new ia.b0(cVar), c0Var), this);
                return aVar2;
        }
    }
}
