package k7;

import java.util.List;
import java.util.ListIterator;

public final class bg extends i7.c implements ListIterator {

    public final i7.e f14510e;

    public bg(i7.e eVar) {
        super(eVar, (byte) 0);
        this.f14510e = eVar;
    }

    @Override
    public final void add(Object obj) {
        i7.e eVar = this.f14510e;
        boolean zIsEmpty = eVar.isEmpty();
        b();
        ((ListIterator) this.f10600b).add(obj);
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

    public bg(i7.e eVar, int i10) {
        super(eVar, ((List) eVar.f10617c).listIterator(i10), (byte) 0);
        this.f14510e = eVar;
    }
}
