package g9;

import b8.ah;
import b8.ra;
import java.util.List;
import java.util.ListIterator;
public final class j extends ra implements ListIterator {
    public final ah f12084e;

    public j(ah ahVar) {
        super(ahVar, (byte) 0);
        this.f12084e = ahVar;
    }

    @Override
    public final void add(Object obj) {
        ah ahVar = this.f12084e;
        boolean isEmpty = ahVar.isEmpty();
        c().add(obj);
        ((k1) ahVar.h).f12092f++;
        if (isEmpty) {
            ahVar.h();
        }
    }

    public final ListIterator c() {
        a();
        return (ListIterator) this.f3048b;
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

    public j(ah ahVar, int i3) {
        super(ahVar, ((List) ahVar.f2472c).listIterator(i3), (byte) 0);
        this.f12084e = ahVar;
    }
}
