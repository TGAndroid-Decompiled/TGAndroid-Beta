package f9;

import a8.dh;
import a8.ta;
import java.util.List;
import java.util.ListIterator;
public final class j extends ta implements ListIterator {
    public final dh e;

    public j(dh dhVar) {
        super(dhVar, (byte) 0);
        this.e = dhVar;
    }

    @Override
    public final void add(Object obj) {
        dh dhVar = this.e;
        boolean isEmpty = dhVar.isEmpty();
        c().add(obj);
        ((k1) dhVar.h).f10293f++;
        if (isEmpty) {
            dhVar.h();
        }
    }

    public final ListIterator c() {
        a();
        return (ListIterator) this.f938b;
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

    public j(dh dhVar, int i10) {
        super(dhVar, ((List) dhVar.f412c).listIterator(i10), (byte) 0);
        this.e = dhVar;
    }
}
