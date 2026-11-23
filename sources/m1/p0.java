package m1;

import androidx.datastore.core.NativeSharedCounter;
public final class p0 extends kd.j implements rd.p {
    public final int f20493a;
    public final t0 f20494b;

    public p0(t0 t0Var, id.c cVar, int i7) {
        super(2, cVar);
        this.f20493a = i7;
        this.f20494b = t0Var;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        switch (this.f20493a) {
            case 0:
                return new p0(this.f20494b, cVar, 0);
            default:
                return new p0(this.f20494b, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        zd.z zVar = (zd.z) obj;
        id.c cVar = (id.c) obj2;
        switch (this.f20493a) {
            case 0:
                return ((p0) create(zVar, cVar)).invokeSuspend(gd.k.f13480a);
            default:
                return ((p0) create(zVar, cVar)).invokeSuspend(gd.k.f13480a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f20493a;
        NativeSharedCounter nativeSharedCounter = z0.f20567b;
        t0 t0Var = this.f20494b;
        switch (i7) {
            case 0:
                jd.a aVar = jd.a.f17478a;
                c8.z.b(obj);
                return new Integer(nativeSharedCounter.nativeGetCounterValue(((z0) t0Var.f20531i.getValue()).f20568a));
            default:
                jd.a aVar2 = jd.a.f17478a;
                c8.z.b(obj);
                return new Integer(nativeSharedCounter.nativeIncrementAndGetCounterValue(((z0) t0Var.f20531i.getValue()).f20568a));
        }
    }
}
