package oa;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;
public class b0 extends la.u {
    @Override
    public final Object read(ta.a aVar) {
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.k()) {
            try {
                arrayList.add(Integer.valueOf(aVar.p()));
            } catch (NumberFormatException e10) {
                throw new RuntimeException(e10);
            }
        }
        aVar.e();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i9 = 0; i9 < size; i9++) {
            atomicIntegerArray.set(i9, ((Integer) arrayList.get(i9)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override
    public final void write(ta.c cVar, Object obj) {
        AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
        cVar.b();
        int length = atomicIntegerArray.length();
        for (int i9 = 0; i9 < length; i9++) {
            cVar.o(atomicIntegerArray.get(i9));
        }
        cVar.e();
    }
}
