package ke;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import td.l;
public final class b extends kotlin.jvm.internal.j implements l {
    public final int f15076b;
    public final d f15077c;

    public b(d dVar, c cVar, int i10) {
        super(1);
        this.f15076b = i10;
        this.f15077c = dVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f15076b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                this.f15077c.e(null);
                return id.i.f12807a;
            default:
                Throwable th3 = (Throwable) obj;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f15080g;
                d dVar = this.f15077c;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return id.i.f12807a;
        }
    }
}
