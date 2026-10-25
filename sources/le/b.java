package le;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ud.l;
public final class b extends kotlin.jvm.internal.j implements l {
    public final int f16989b;
    public final d f16990c;

    public b(d dVar, c cVar, int i10) {
        super(1);
        this.f16989b = i10;
        this.f16990c = dVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f16989b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                this.f16990c.e(null);
                return jd.i.f15580a;
            default:
                Throwable th3 = (Throwable) obj;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f16993g;
                d dVar = this.f16990c;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return jd.i.f15580a;
        }
    }
}
