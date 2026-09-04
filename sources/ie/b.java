package ie;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rd.l;
public final class b extends kotlin.jvm.internal.j implements l {
    public final int f11955b;
    public final d f11956c;

    public b(d dVar, c cVar, int i10) {
        super(1);
        this.f11955b = i10;
        this.f11956c = dVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f11955b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                this.f11956c.e(null);
                return gd.i.f10588a;
            default:
                Throwable th3 = (Throwable) obj;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f11959g;
                d dVar = this.f11956c;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return gd.i.f10588a;
        }
    }
}
