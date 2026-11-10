package c8;

import java.util.List;
import java.util.ListIterator;
public final class zf extends a8.d implements ListIterator {
    public final a8.f f5996e;

    public zf(a8.f fVar) {
        super(fVar, (byte) 0);
        this.f5996e = fVar;
    }

    @Override
    public final void add(Object obj) {
        a8.f fVar = this.f5996e;
        boolean isEmpty = fVar.isEmpty();
        b();
        ((ListIterator) this.f358b).add(obj);
        if (isEmpty) {
            fVar.k();
        }
    }

    @Override
    public final boolean hasPrevious() {
        b();
        return ((ListIterator) this.f358b).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        b();
        return ((ListIterator) this.f358b).nextIndex();
    }

    @Override
    public final Object previous() {
        b();
        return ((ListIterator) this.f358b).previous();
    }

    @Override
    public final int previousIndex() {
        b();
        return ((ListIterator) this.f358b).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        b();
        ((ListIterator) this.f358b).set(obj);
    }

    public zf(a8.f fVar, int i7) {
        super(fVar, ((List) fVar.f388c).listIterator(i7), (byte) 0);
        this.f5996e = fVar;
    }
}
