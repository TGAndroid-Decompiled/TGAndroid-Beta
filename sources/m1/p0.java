package m1;

import androidx.datastore.core.NativeSharedCounter;
public final class p0 extends kd.j implements rd.p {
    public final int f20431a;
    public final t0 f20432b;

    public p0(t0 t0Var, id.c cVar, int i7) {
        super(2, cVar);
        this.f20431a = i7;
        this.f20432b = t0Var;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        switch (this.f20431a) {
            case 0:
                return new p0(this.f20432b, cVar, 0);
            default:
                return new p0(this.f20432b, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        zd.z zVar = (zd.z) obj;
        id.c cVar = (id.c) obj2;
        switch (this.f20431a) {
            case 0:
                return ((p0) create(zVar, cVar)).invokeSuspend(gd.k.f13517a);
            default:
                return ((p0) create(zVar, cVar)).invokeSuspend(gd.k.f13517a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f20431a;
        NativeSharedCounter nativeSharedCounter = z0.f20505b;
        t0 t0Var = this.f20432b;
        switch (i7) {
            case 0:
                jd.a aVar = jd.a.f17409a;
                b7.h.b(obj);
                return new Integer(nativeSharedCounter.nativeGetCounterValue(((z0) t0Var.f20469i.getValue()).f20506a));
            default:
                jd.a aVar2 = jd.a.f17409a;
                b7.h.b(obj);
                return new Integer(nativeSharedCounter.nativeIncrementAndGetCounterValue(((z0) t0Var.f20469i.getValue()).f20506a));
        }
    }
}
