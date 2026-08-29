package l7;

import java.util.List;
import java.util.ListIterator;
public final class bg extends j7.c implements ListIterator {
    public final j7.e f14515e;

    public bg(j7.e eVar) {
        super(eVar, (byte) 0);
        this.f14515e = eVar;
    }

    @Override
    public final void add(Object obj) {
        j7.e eVar = this.f14515e;
        boolean isEmpty = eVar.isEmpty();
        b();
        ((ListIterator) this.f10973b).add(obj);
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

    public bg(j7.e eVar, int i10) {
        super(eVar, ((List) eVar.f10990c).listIterator(i10), (byte) 0);
        this.f14515e = eVar;
    }
}
