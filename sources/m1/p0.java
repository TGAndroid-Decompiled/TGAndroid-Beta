package m1;

import androidx.datastore.core.NativeSharedCounter;
public final class p0 extends kd.j implements rd.p {
    public final int f20397a;
    public final t0 f20398b;

    public p0(t0 t0Var, id.c cVar, int i7) {
        super(2, cVar);
        this.f20397a = i7;
        this.f20398b = t0Var;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        switch (this.f20397a) {
            case 0:
                return new p0(this.f20398b, cVar, 0);
            default:
                return new p0(this.f20398b, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        zd.z zVar = (zd.z) obj;
        id.c cVar = (id.c) obj2;
        switch (this.f20397a) {
            case 0:
                return ((p0) create(zVar, cVar)).invokeSuspend(gd.k.f13480a);
            default:
                return ((p0) create(zVar, cVar)).invokeSuspend(gd.k.f13480a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f20397a;
        NativeSharedCounter nativeSharedCounter = z0.f20471b;
        t0 t0Var = this.f20398b;
        switch (i7) {
            case 0:
                jd.a aVar = jd.a.f17375a;
                c8.z.b(obj);
                return new Integer(nativeSharedCounter.nativeGetCounterValue(((z0) t0Var.f20435i.getValue()).f20472a));
            default:
                jd.a aVar2 = jd.a.f17375a;
                c8.z.b(obj);
                return new Integer(nativeSharedCounter.nativeIncrementAndGetCounterValue(((z0) t0Var.f20435i.getValue()).f20472a));
        }
    }
}
