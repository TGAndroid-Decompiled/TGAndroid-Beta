package ke;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import td.l;
public final class b extends kotlin.jvm.internal.j implements l {
    public final int f14227b;
    public final d f14228c;

    public b(d dVar, c cVar, int i10) {
        super(1);
        this.f14227b = i10;
        this.f14228c = dVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f14227b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                this.f14228c.e(null);
                return id.i.f11386a;
            default:
                Throwable th3 = (Throwable) obj;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f14231g;
                d dVar = this.f14228c;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return id.i.f11386a;
        }
    }
}
