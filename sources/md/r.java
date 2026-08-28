package md;

import java.util.concurrent.atomic.AtomicReferenceArray;
public final class r {
    private volatile AtomicReferenceArray<Object> array;

    public r(int i9) {
        this.array = new AtomicReferenceArray<>(i9);
    }

    public final int a() {
        return this.array.length();
    }

    public final Object b(int i9) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i9 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i9);
        }
        return null;
    }

    public final void c(int i9, od.a aVar) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i9 < length) {
            atomicReferenceArray.set(i9, aVar);
            return;
        }
        int i10 = i9 + 1;
        int i11 = length * 2;
        if (i10 < i11) {
            i10 = i11;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i10);
        for (int i12 = 0; i12 < length; i12++) {
            atomicReferenceArray2.set(i12, atomicReferenceArray.get(i12));
        }
        atomicReferenceArray2.set(i9, aVar);
        this.array = atomicReferenceArray2;
    }
}
