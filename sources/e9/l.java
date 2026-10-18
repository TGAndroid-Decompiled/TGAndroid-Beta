package e9;

import java.util.List;
import java.util.ListIterator;
public final class l extends d implements ListIterator {
    public final m e;

    public l(m mVar) {
        super(mVar);
        this.e = mVar;
    }

    @Override
    public final void add(Object obj) {
        m mVar = this.e;
        boolean isEmpty = mVar.isEmpty();
        c().add(obj);
        ((p1) mVar.h).f8488f++;
        if (isEmpty) {
            mVar.h();
        }
    }

    public final ListIterator c() {
        a();
        return (ListIterator) this.f8429b;
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

    public l(m mVar, int i10) {
        super(mVar, ((List) mVar.f8472c).listIterator(i10));
        this.e = mVar;
    }
}
