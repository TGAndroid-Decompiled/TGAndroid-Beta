package ke;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import td.l;
public final class b extends kotlin.jvm.internal.j implements l {
    public final int f15031b;
    public final d f15032c;

    public b(d dVar, c cVar, int i10) {
        super(1);
        this.f15031b = i10;
        this.f15032c = dVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f15031b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                this.f15032c.e(null);
                return id.i.f12777a;
            default:
                Throwable th3 = (Throwable) obj;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f15035g;
                d dVar = this.f15032c;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return id.i.f12777a;
        }
    }
}
