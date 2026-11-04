package be;

import java.util.concurrent.atomic.AtomicReferenceArray;
public final class p {
    private volatile AtomicReferenceArray<Object> array;

    public p(int i3) {
        this.array = new AtomicReferenceArray<>(i3);
    }

    public final int a() {
        return this.array.length();
    }

    public final Object b(int i3) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i3 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i3);
        }
        return null;
    }

    public final void c(int i3, de.a aVar) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i3 < length) {
            atomicReferenceArray.set(i3, aVar);
            return;
        }
        int i10 = i3 + 1;
        int i11 = length * 2;
        if (i10 < i11) {
            i10 = i11;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i10);
        for (int i12 = 0; i12 < length; i12++) {
            atomicReferenceArray2.set(i12, atomicReferenceArray.get(i12));
        }
        atomicReferenceArray2.set(i3, aVar);
        this.array = atomicReferenceArray2;
    }
}
