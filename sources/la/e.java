package la;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
public final class e extends u {
    public final int f16714a;
    public final u f16715b;

    public e(u uVar, int i9) {
        this.f16714a = i9;
        this.f16715b = uVar;
    }

    @Override
    public final Object read(ta.a aVar) {
        switch (this.f16714a) {
            case 0:
                return new AtomicLong(((Number) this.f16715b.read(aVar)).longValue());
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.k()) {
                    arrayList.add(Long.valueOf(((Number) this.f16715b.read(aVar)).longValue()));
                }
                aVar.e();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i9 = 0; i9 < size; i9++) {
                    atomicLongArray.set(i9, ((Long) arrayList.get(i9)).longValue());
                }
                return atomicLongArray;
            default:
                if (aVar.x() == 9) {
                    aVar.t();
                    return null;
                }
                return this.f16715b.read(aVar);
        }
    }

    @Override
    public final void write(ta.c cVar, Object obj) {
        switch (this.f16714a) {
            case 0:
                this.f16715b.write(cVar, Long.valueOf(((AtomicLong) obj).get()));
                return;
            case 1:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                cVar.b();
                int length = atomicLongArray.length();
                for (int i9 = 0; i9 < length; i9++) {
                    this.f16715b.write(cVar, Long.valueOf(atomicLongArray.get(i9)));
                }
                cVar.e();
                return;
            default:
                if (obj == null) {
                    cVar.i();
                    return;
                } else {
                    this.f16715b.write(cVar, obj);
                    return;
                }
        }
    }
}
