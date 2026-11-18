package m1;

import androidx.datastore.core.NativeSharedCounter;
public final class p0 extends kd.j implements rd.p {
    public final int f20400a;
    public final t0 f20401b;

    public p0(t0 t0Var, id.c cVar, int i7) {
        super(2, cVar);
        this.f20400a = i7;
        this.f20401b = t0Var;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        switch (this.f20400a) {
            case 0:
                return new p0(this.f20401b, cVar, 0);
            default:
                return new p0(this.f20401b, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        zd.z zVar = (zd.z) obj;
        id.c cVar = (id.c) obj2;
        switch (this.f20400a) {
            case 0:
                return ((p0) create(zVar, cVar)).invokeSuspend(gd.k.f13485a);
            default:
                return ((p0) create(zVar, cVar)).invokeSuspend(gd.k.f13485a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f20400a;
        NativeSharedCounter nativeSharedCounter = z0.f20474b;
        t0 t0Var = this.f20401b;
        switch (i7) {
            case 0:
                jd.a aVar = jd.a.f17381a;
                b7.h.b(obj);
                return new Integer(nativeSharedCounter.nativeGetCounterValue(((z0) t0Var.f20438i.getValue()).f20475a));
            default:
                jd.a aVar2 = jd.a.f17381a;
                b7.h.b(obj);
                return new Integer(nativeSharedCounter.nativeIncrementAndGetCounterValue(((z0) t0Var.f20438i.getValue()).f20475a));
        }
    }
}
