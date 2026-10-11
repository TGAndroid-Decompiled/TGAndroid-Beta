package je;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sd.l;
public final class b extends kotlin.jvm.internal.j implements l {
    public final int f14129b;
    public final d f14130c;

    public b(d dVar, c cVar, int i10) {
        super(1);
        this.f14129b = i10;
        this.f14130c = dVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f14129b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                this.f14130c.e(null);
                return hd.i.f11091a;
            default:
                Throwable th3 = (Throwable) obj;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f14133g;
                d dVar = this.f14130c;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return hd.i.f11091a;
        }
    }
}
