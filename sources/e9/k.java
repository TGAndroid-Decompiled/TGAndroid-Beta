package e9;

import java.util.List;
import java.util.ListIterator;
public final class k extends c implements ListIterator {
    public final l f8993e;

    public k(l lVar) {
        super(lVar);
        this.f8993e = lVar;
    }

    @Override
    public final void add(Object obj) {
        l lVar = this.f8993e;
        boolean isEmpty = lVar.isEmpty();
        c().add(obj);
        ((v0) lVar.h).f9047e++;
        if (isEmpty) {
            lVar.i();
        }
    }

    public final ListIterator c() {
        a();
        return (ListIterator) this.f8953b;
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

    public k(l lVar, int i10) {
        super(lVar, ((List) lVar.f8999c).listIterator(i10));
        this.f8993e = lVar;
    }
}
