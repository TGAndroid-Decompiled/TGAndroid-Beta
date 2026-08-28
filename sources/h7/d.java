package h7;

import java.util.List;
import java.util.ListIterator;
public final class d extends c implements ListIterator {
    public final e f9899e;

    public d(e eVar) {
        super(eVar);
        this.f9899e = eVar;
    }

    @Override
    public final void add(Object obj) {
        e eVar = this.f9899e;
        boolean isEmpty = eVar.isEmpty();
        b();
        ((ListIterator) this.f9891b).add(obj);
        ((h) eVar.h).d++;
        if (isEmpty) {
            eVar.p();
        }
    }

    @Override
    public final boolean hasPrevious() {
        b();
        return ((ListIterator) this.f9891b).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        b();
        return ((ListIterator) this.f9891b).nextIndex();
    }

    @Override
    public final Object previous() {
        b();
        return ((ListIterator) this.f9891b).previous();
    }

    @Override
    public final int previousIndex() {
        b();
        return ((ListIterator) this.f9891b).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        b();
        ((ListIterator) this.f9891b).set(obj);
    }

    public d(e eVar, int i9) {
        super(eVar, ((List) eVar.f9908c).listIterator(i9));
        this.f9899e = eVar;
    }
}
