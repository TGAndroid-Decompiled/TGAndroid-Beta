package a8;

import java.util.List;
import java.util.ListIterator;
public final class e extends d implements ListIterator {
    public final f f372e;

    public e(f fVar) {
        super(fVar);
        this.f372e = fVar;
    }

    @Override
    public final void add(Object obj) {
        f fVar = this.f372e;
        boolean isEmpty = fVar.isEmpty();
        b();
        ((ListIterator) this.f358b).add(obj);
        ((i) fVar.h).d++;
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

    public e(f fVar, int i7) {
        super(fVar, ((List) fVar.f388c).listIterator(i7));
        this.f372e = fVar;
    }
}
