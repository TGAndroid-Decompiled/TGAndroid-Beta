package ke;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import td.l;
public final class b extends kotlin.jvm.internal.j implements l {
    public final int f15029b;
    public final d f15030c;

    public b(d dVar, c cVar, int i10) {
        super(1);
        this.f15029b = i10;
        this.f15030c = dVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f15029b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                this.f15030c.e(null);
                return id.i.f12775a;
            default:
                Throwable th3 = (Throwable) obj;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f15033g;
                d dVar = this.f15030c;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return id.i.f12775a;
        }
    }
}
