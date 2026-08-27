package i7;

import java.util.List;
import java.util.ListIterator;

public final class d extends c implements ListIterator {

    public final e f10608e;

    public d(e eVar) {
        super(eVar);
        this.f10608e = eVar;
    }

    @Override
    public final void add(Object obj) {
        e eVar = this.f10608e;
        boolean zIsEmpty = eVar.isEmpty();
        b();
        ((ListIterator) this.f10600b).add(obj);
        ((h) eVar.h).d++;
        if (zIsEmpty) {
            eVar.p();
        }
    }

    @Override
    public final boolean hasPrevious() {
        b();
        return ((ListIterator) this.f10600b).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        b();
        return ((ListIterator) this.f10600b).nextIndex();
    }

    @Override
    public final Object previous() {
        b();
        return ((ListIterator) this.f10600b).previous();
    }

    @Override
    public final int previousIndex() {
        b();
        return ((ListIterator) this.f10600b).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        b();
        ((ListIterator) this.f10600b).set(obj);
    }

    public d(e eVar, int i10) {
        super(eVar, ((List) eVar.f10617c).listIterator(i10));
        this.f10608e = eVar;
    }
}
