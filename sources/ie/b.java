package ie;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rd.l;
public final class b extends kotlin.jvm.internal.j implements l {
    public final int f11072b;
    public final d f11073c;

    public b(d dVar, c cVar, int i10) {
        super(1);
        this.f11072b = i10;
        this.f11073c = dVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f11072b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                this.f11073c.e(null);
                return gd.i.f9603a;
            default:
                Throwable th3 = (Throwable) obj;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f11076g;
                d dVar = this.f11073c;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return gd.i.f9603a;
        }
    }
}
