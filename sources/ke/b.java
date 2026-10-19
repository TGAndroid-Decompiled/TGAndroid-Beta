package ke;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import td.l;
public final class b extends kotlin.jvm.internal.j implements l {
    public final int f15030b;
    public final d f15031c;

    public b(d dVar, c cVar, int i10) {
        super(1);
        this.f15030b = i10;
        this.f15031c = dVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f15030b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                this.f15031c.e(null);
                return id.i.f12775a;
            default:
                Throwable th3 = (Throwable) obj;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f15034g;
                d dVar = this.f15031c;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return id.i.f12775a;
        }
    }
}
