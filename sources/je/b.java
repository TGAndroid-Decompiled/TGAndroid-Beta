package je;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sd.l;
public final class b extends kotlin.jvm.internal.j implements l {
    public final int f14130b;
    public final d f14131c;

    public b(d dVar, c cVar, int i10) {
        super(1);
        this.f14130b = i10;
        this.f14131c = dVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f14130b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                this.f14131c.e(null);
                return hd.i.f11092a;
            default:
                Throwable th3 = (Throwable) obj;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f14134g;
                d dVar = this.f14131c;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return hd.i.f11092a;
        }
    }
}
