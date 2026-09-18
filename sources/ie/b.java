package ie;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rd.l;
public final class b extends kotlin.jvm.internal.j implements l {
    public final int f11085b;
    public final d f11086c;

    public b(d dVar, c cVar, int i10) {
        super(1);
        this.f11085b = i10;
        this.f11086c = dVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f11085b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                this.f11086c.e(null);
                return gd.i.f9620a;
            default:
                Throwable th3 = (Throwable) obj;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f11089g;
                d dVar = this.f11086c;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return gd.i.f9620a;
        }
    }
}
