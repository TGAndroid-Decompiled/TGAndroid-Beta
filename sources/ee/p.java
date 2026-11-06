package ee;

import java.util.concurrent.atomic.AtomicReferenceArray;
public final class p {
    private volatile AtomicReferenceArray<Object> array;

    public p(int i7) {
        this.array = new AtomicReferenceArray<>(i7);
    }

    public final int a() {
        return this.array.length();
    }

    public final Object b(int i7) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i7 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i7);
        }
        return null;
    }

    public final void c(int i7, ge.a aVar) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i7 < length) {
            atomicReferenceArray.set(i7, aVar);
            return;
        }
        int i10 = i7 + 1;
        int i11 = length * 2;
        if (i10 < i11) {
            i10 = i11;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i10);
        for (int i12 = 0; i12 < length; i12++) {
            atomicReferenceArray2.set(i12, atomicReferenceArray.get(i12));
        }
        atomicReferenceArray2.set(i7, aVar);
        this.array = atomicReferenceArray2;
    }
}
