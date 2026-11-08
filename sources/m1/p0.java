package m1;

import androidx.datastore.core.NativeSharedCounter;
public final class p0 extends kd.j implements rd.p {
    public final int f19442a;
    public final t0 f19443b;

    public p0(t0 t0Var, id.c cVar, int i7) {
        super(2, cVar);
        this.f19442a = i7;
        this.f19443b = t0Var;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        switch (this.f19442a) {
            case 0:
                return new p0(this.f19443b, cVar, 0);
            default:
                return new p0(this.f19443b, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        zd.z zVar = (zd.z) obj;
        id.c cVar = (id.c) obj2;
        switch (this.f19442a) {
            case 0:
                return ((p0) create(zVar, cVar)).invokeSuspend(gd.k.f13829a);
            default:
                return ((p0) create(zVar, cVar)).invokeSuspend(gd.k.f13829a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f19442a;
        NativeSharedCounter nativeSharedCounter = z0.f19516b;
        t0 t0Var = this.f19443b;
        switch (i7) {
            case 0:
                jd.a aVar = jd.a.f16646a;
                af.b.c(obj);
                return new Integer(nativeSharedCounter.nativeGetCounterValue(((z0) t0Var.f19480i.getValue()).f19517a));
            default:
                jd.a aVar2 = jd.a.f16646a;
                af.b.c(obj);
                return new Integer(nativeSharedCounter.nativeIncrementAndGetCounterValue(((z0) t0Var.f19480i.getValue()).f19517a));
        }
    }
}
