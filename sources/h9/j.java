package h9;

import java.util.List;
import java.util.ListIterator;
public final class j extends a8.d implements ListIterator {
    public final a8.f f14006e;

    public j(a8.f fVar) {
        super(fVar, (char) 0);
        this.f14006e = fVar;
    }

    @Override
    public final void add(Object obj) {
        a8.f fVar = this.f14006e;
        boolean isEmpty = fVar.isEmpty();
        c().add(obj);
        ((l1) fVar.h).f14020f++;
        if (isEmpty) {
            fVar.f();
        }
    }

    public final ListIterator c() {
        a();
        return (ListIterator) this.f364b;
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

    public j(a8.f fVar, int i7) {
        super(fVar, ((List) fVar.f387c).listIterator(i7), (char) 0);
        this.f14006e = fVar;
    }
}
