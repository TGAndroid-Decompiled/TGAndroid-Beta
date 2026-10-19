package ke;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import td.l;
public final class b extends kotlin.jvm.internal.j implements l {
    public final int f15032b;
    public final d f15033c;

    public b(d dVar, c cVar, int i10) {
        super(1);
        this.f15032b = i10;
        this.f15033c = dVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f15032b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                this.f15033c.e(null);
                return id.i.f12777a;
            default:
                Throwable th3 = (Throwable) obj;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f15036g;
                d dVar = this.f15033c;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return id.i.f12777a;
        }
    }
}
