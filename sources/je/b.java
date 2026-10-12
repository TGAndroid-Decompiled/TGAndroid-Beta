package je;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sd.l;
public final class b extends kotlin.jvm.internal.j implements l {
    public final int f14127b;
    public final d f14128c;

    public b(d dVar, c cVar, int i10) {
        super(1);
        this.f14127b = i10;
        this.f14128c = dVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f14127b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                this.f14128c.e(null);
                return hd.i.f11090a;
            default:
                Throwable th3 = (Throwable) obj;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f14131g;
                d dVar = this.f14128c;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return hd.i.f11090a;
        }
    }
}
