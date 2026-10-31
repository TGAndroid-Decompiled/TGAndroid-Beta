package ce;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ld.l;
public final class b extends kotlin.jvm.internal.j implements l {
    public final int f4124b;
    public final d f4125c;

    public b(d dVar, c cVar, int i10) {
        super(1);
        this.f4124b = i10;
        this.f4125c = dVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f4124b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                this.f4125c.e(null);
                return ad.j.f401a;
            default:
                Throwable th3 = (Throwable) obj;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f4128g;
                d dVar = this.f4125c;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return ad.j.f401a;
        }
    }
}
