package ie;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rd.l;
public final class b extends kotlin.jvm.internal.j implements l {
    public final int f11086b;
    public final d f11087c;

    public b(d dVar, c cVar, int i10) {
        super(1);
        this.f11086b = i10;
        this.f11087c = dVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f11086b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                this.f11087c.e(null);
                return gd.i.f9621a;
            default:
                Throwable th3 = (Throwable) obj;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f11090g;
                d dVar = this.f11087c;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return gd.i.f9621a;
        }
    }
}
