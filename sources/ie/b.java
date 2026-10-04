package ie;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rd.l;
public final class b extends kotlin.jvm.internal.j implements l {
    public final int f12059b;
    public final d f12060c;

    public b(d dVar, c cVar, int i10) {
        super(1);
        this.f12059b = i10;
        this.f12060c = dVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f12059b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                this.f12060c.e(null);
                return gd.i.f10452a;
            default:
                Throwable th3 = (Throwable) obj;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f12063g;
                d dVar = this.f12060c;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return gd.i.f10452a;
        }
    }
}
