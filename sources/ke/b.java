package ke;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import td.l;
public final class b extends kotlin.jvm.internal.j implements l {
    public final int f15024b;
    public final d f15025c;

    public b(d dVar, c cVar, int i10) {
        super(1);
        this.f15024b = i10;
        this.f15025c = dVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f15024b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                this.f15025c.e(null);
                return id.i.f12779a;
            default:
                Throwable th3 = (Throwable) obj;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f15028g;
                d dVar = this.f15025c;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return id.i.f12779a;
        }
    }
}
