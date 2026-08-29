package j7;

import java.util.List;
import java.util.ListIterator;
public final class d extends c implements ListIterator {
    public final e f10981e;

    public d(e eVar) {
        super(eVar);
        this.f10981e = eVar;
    }

    @Override
    public final void add(Object obj) {
        e eVar = this.f10981e;
        boolean isEmpty = eVar.isEmpty();
        b();
        ((ListIterator) this.f10973b).add(obj);
        ((h) eVar.h).d++;
        if (isEmpty) {
            eVar.p();
        }
    }

    @Override
    public final boolean hasPrevious() {
        b();
        return ((ListIterator) this.f10973b).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        b();
        return ((ListIterator) this.f10973b).nextIndex();
    }

    @Override
    public final Object previous() {
        b();
        return ((ListIterator) this.f10973b).previous();
    }

    @Override
    public final int previousIndex() {
        b();
        return ((ListIterator) this.f10973b).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        b();
        ((ListIterator) this.f10973b).set(obj);
    }

    public d(e eVar, int i10) {
        super(eVar, ((List) eVar.f10990c).listIterator(i10));
        this.f10981e = eVar;
    }
}
