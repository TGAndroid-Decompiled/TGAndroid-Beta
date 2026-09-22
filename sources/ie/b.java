package ie;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rd.l;
public final class b extends kotlin.jvm.internal.j implements l {
    public final int f11084b;
    public final d f11085c;

    public b(d dVar, c cVar, int i10) {
        super(1);
        this.f11084b = i10;
        this.f11085c = dVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f11084b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                this.f11085c.e(null);
                return gd.i.f9617a;
            default:
                Throwable th3 = (Throwable) obj;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f11088g;
                d dVar = this.f11085c;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return gd.i.f9617a;
        }
    }
}
