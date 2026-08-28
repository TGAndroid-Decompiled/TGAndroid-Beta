package o8;

import java.util.List;
import java.util.ListIterator;
public final class i extends h7.c implements ListIterator {
    public final h7.e f19049e;

    public i(h7.e eVar) {
        super(eVar, (char) 0);
        this.f19049e = eVar;
    }

    @Override
    public final void add(Object obj) {
        h7.e eVar = this.f19049e;
        boolean isEmpty = eVar.isEmpty();
        c().add(obj);
        ((h0) eVar.h).f19047e++;
        if (isEmpty) {
            eVar.i();
        }
    }

    public final ListIterator c() {
        a();
        return (ListIterator) this.f9891b;
    }

    @Override
    public final boolean hasPrevious() {
        return c().hasPrevious();
    }

    @Override
    public final int nextIndex() {
        return c().nextIndex();
    }

    @Override
    public final Object previous() {
        return c().previous();
    }

    @Override
    public final int previousIndex() {
        return c().previousIndex();
    }

    @Override
    public final void set(Object obj) {
        c().set(obj);
    }

    public i(h7.e eVar, int i9) {
        super(eVar, ((List) eVar.f9908c).listIterator(i9), (char) 0);
        this.f19049e = eVar;
    }
}
