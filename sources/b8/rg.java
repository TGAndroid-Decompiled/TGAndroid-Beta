package b8;

import java.util.List;
import java.util.ListIterator;
public final class rg extends ra implements ListIterator {
    public final ah f3050e;

    public rg(ah ahVar) {
        super(ahVar);
        this.f3050e = ahVar;
    }

    @Override
    public final void add(Object obj) {
        ah ahVar = this.f3050e;
        boolean isEmpty = ahVar.isEmpty();
        b();
        ((ListIterator) this.f3048b).add(obj);
        if (isEmpty) {
            ahVar.k();
        }
    }

    @Override
    public final boolean hasPrevious() {
        b();
        return ((ListIterator) this.f3048b).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        b();
        return ((ListIterator) this.f3048b).nextIndex();
    }

    @Override
    public final Object previous() {
        b();
        return ((ListIterator) this.f3048b).previous();
    }

    @Override
    public final int previousIndex() {
        b();
        return ((ListIterator) this.f3048b).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        b();
        ((ListIterator) this.f3048b).set(obj);
    }

    public rg(ah ahVar, int i3) {
        super(ahVar, ((List) ahVar.f2472c).listIterator(i3));
        this.f3050e = ahVar;
    }
}
