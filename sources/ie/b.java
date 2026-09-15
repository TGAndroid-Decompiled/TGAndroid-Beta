package ie;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rd.l;
public final class b extends kotlin.jvm.internal.j implements l {
    public final int f11082b;
    public final d f11083c;

    public b(d dVar, c cVar, int i10) {
        super(1);
        this.f11082b = i10;
        this.f11083c = dVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f11082b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                this.f11083c.e(null);
                return gd.i.f9616a;
            default:
                Throwable th3 = (Throwable) obj;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f11086g;
                d dVar = this.f11083c;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return gd.i.f9616a;
        }
    }
}
