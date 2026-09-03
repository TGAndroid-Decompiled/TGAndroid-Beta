package l7;

import java.util.List;
import java.util.ListIterator;
public final class d extends c implements ListIterator {
    public final e e;

    public d(e eVar) {
        super(eVar);
        this.e = eVar;
    }

    @Override
    public final void add(Object obj) {
        e eVar = this.e;
        boolean isEmpty = eVar.isEmpty();
        b();
        ((ListIterator) this.f11542b).add(obj);
        ((h) eVar.h).d++;
        if (isEmpty) {
            eVar.p();
        }
    }

    @Override
    public final boolean hasPrevious() {
        b();
        return ((ListIterator) this.f11542b).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        b();
        return ((ListIterator) this.f11542b).nextIndex();
    }

    @Override
    public final Object previous() {
        b();
        return ((ListIterator) this.f11542b).previous();
    }

    @Override
    public final int previousIndex() {
        b();
        return ((ListIterator) this.f11542b).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        b();
        ((ListIterator) this.f11542b).set(obj);
    }

    public d(e eVar, int i10) {
        super(eVar, ((List) eVar.f11558c).listIterator(i10));
        this.e = eVar;
    }
}
