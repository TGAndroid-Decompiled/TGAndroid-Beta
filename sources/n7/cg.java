package n7;

import java.util.List;
import java.util.ListIterator;
public final class cg extends l7.c implements ListIterator {
    public final l7.e e;

    public cg(l7.e eVar) {
        super(eVar, (byte) 0);
        this.e = eVar;
    }

    @Override
    public final void add(Object obj) {
        l7.e eVar = this.e;
        boolean isEmpty = eVar.isEmpty();
        b();
        ((ListIterator) this.f11432b).add(obj);
        if (isEmpty) {
            eVar.p();
        }
    }

    @Override
    public final boolean hasPrevious() {
        b();
        return ((ListIterator) this.f11432b).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        b();
        return ((ListIterator) this.f11432b).nextIndex();
    }

    @Override
    public final Object previous() {
        b();
        return ((ListIterator) this.f11432b).previous();
    }

    @Override
    public final int previousIndex() {
        b();
        return ((ListIterator) this.f11432b).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        b();
        ((ListIterator) this.f11432b).set(obj);
    }

    public cg(l7.e eVar, int i10) {
        super(eVar, ((List) eVar.f11448c).listIterator(i10), (byte) 0);
        this.e = eVar;
    }
}
