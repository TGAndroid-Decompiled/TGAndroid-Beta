package gb;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;
public class b0 extends db.u {
    @Override
    public final Object read(lb.a aVar) {
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.k()) {
            try {
                arrayList.add(Integer.valueOf(aVar.p()));
            } catch (NumberFormatException e) {
                throw new RuntimeException(e);
            }
        }
        aVar.e();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i10 = 0; i10 < size; i10++) {
            atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
        bVar.b();
        int length = atomicIntegerArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            bVar.o(atomicIntegerArray.get(i10));
        }
        bVar.e();
    }
}
