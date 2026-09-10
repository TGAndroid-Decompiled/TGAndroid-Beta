package ie;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rd.l;
public final class b extends kotlin.jvm.internal.j implements l {
    public final int f10566b;
    public final d f10567c;

    public b(d dVar, c cVar, int i10) {
        super(1);
        this.f10566b = i10;
        this.f10567c = dVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f10566b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                this.f10567c.e(null);
                return gd.i.f8748a;
            default:
                Throwable th3 = (Throwable) obj;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f10570g;
                d dVar = this.f10567c;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return gd.i.f8748a;
        }
    }
}
