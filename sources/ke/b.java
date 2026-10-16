package ke;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import td.l;
public final class b extends kotlin.jvm.internal.j implements l {
    public final int f14229b;
    public final d f14230c;

    public b(d dVar, c cVar, int i10) {
        super(1);
        this.f14229b = i10;
        this.f14230c = dVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f14229b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                this.f14230c.e(null);
                return id.i.f11390a;
            default:
                Throwable th3 = (Throwable) obj;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f14233g;
                d dVar = this.f14230c;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return id.i.f11390a;
        }
    }
}
