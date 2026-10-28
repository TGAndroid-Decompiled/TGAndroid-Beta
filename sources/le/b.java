package le;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ud.l;
public final class b extends kotlin.jvm.internal.j implements l {
    public final int f16988b;
    public final d f16989c;

    public b(d dVar, c cVar, int i10) {
        super(1);
        this.f16988b = i10;
        this.f16989c = dVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f16988b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                this.f16989c.e(null);
                return jd.i.f15579a;
            default:
                Throwable th3 = (Throwable) obj;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f16992g;
                d dVar = this.f16989c;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return jd.i.f15579a;
        }
    }
}
