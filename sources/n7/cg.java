package n7;

import java.util.List;
import java.util.ListIterator;
public final class cg extends l7.c implements ListIterator {
    public final l7.e f15301e;

    public cg(l7.e eVar) {
        super(eVar, (byte) 0);
        this.f15301e = eVar;
    }

    @Override
    public final void add(Object obj) {
        l7.e eVar = this.f15301e;
        boolean isEmpty = eVar.isEmpty();
        b();
        ((ListIterator) this.f11814b).add(obj);
        if (isEmpty) {
            eVar.p();
        }
    }

    @Override
    public final boolean hasPrevious() {
        b();
        return ((ListIterator) this.f11814b).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        b();
        return ((ListIterator) this.f11814b).nextIndex();
    }

    @Override
    public final Object previous() {
        b();
        return ((ListIterator) this.f11814b).previous();
    }

    @Override
    public final int previousIndex() {
        b();
        return ((ListIterator) this.f11814b).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        b();
        ((ListIterator) this.f11814b).set(obj);
    }

    public cg(l7.e eVar, int i10) {
        super(eVar, ((List) eVar.f11831c).listIterator(i10), (byte) 0);
        this.f15301e = eVar;
    }
}
