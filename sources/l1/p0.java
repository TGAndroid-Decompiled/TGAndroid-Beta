package l1;

import androidx.datastore.core.NativeSharedCounter;
import b8.ib;
public final class p0 extends hd.j implements od.p {
    public final int f17602a;
    public final t0 f17603b;

    public p0(t0 t0Var, fd.c cVar, int i3) {
        super(2, cVar);
        this.f17602a = i3;
        this.f17603b = t0Var;
    }

    @Override
    public final fd.c create(Object obj, fd.c cVar) {
        switch (this.f17602a) {
            case 0:
                return new p0(this.f17603b, cVar, 0);
            default:
                return new p0(this.f17603b, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        wd.z zVar = (wd.z) obj;
        fd.c cVar = (fd.c) obj2;
        switch (this.f17602a) {
            case 0:
                return ((p0) create(zVar, cVar)).invokeSuspend(dd.k.f8801a);
            default:
                return ((p0) create(zVar, cVar)).invokeSuspend(dd.k.f8801a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i3 = this.f17602a;
        NativeSharedCounter nativeSharedCounter = a1.f17488b;
        t0 t0Var = this.f17603b;
        switch (i3) {
            case 0:
                gd.a aVar = gd.a.f12241a;
                ib.b(obj);
                return new Integer(nativeSharedCounter.nativeGetCounterValue(((a1) t0Var.f17640i.getValue()).f17489a));
            default:
                gd.a aVar2 = gd.a.f12241a;
                ib.b(obj);
                return new Integer(nativeSharedCounter.nativeIncrementAndGetCounterValue(((a1) t0Var.f17640i.getValue()).f17489a));
        }
    }
}
