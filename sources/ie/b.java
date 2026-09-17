package ie;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rd.l;
public final class b extends kotlin.jvm.internal.j implements l {
    public final int f11981b;
    public final d f11982c;

    public b(d dVar, c cVar, int i10) {
        super(1);
        this.f11981b = i10;
        this.f11982c = dVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f11981b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                this.f11982c.e(null);
                return gd.i.f10616a;
            default:
                Throwable th3 = (Throwable) obj;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f11985g;
                d dVar = this.f11982c;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return gd.i.f10616a;
        }
    }
}
