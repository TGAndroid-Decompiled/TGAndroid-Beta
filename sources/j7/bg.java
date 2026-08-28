package j7;

import java.util.List;
import java.util.ListIterator;
public final class bg extends h7.c implements ListIterator {
    public final h7.e f13656e;

    public bg(h7.e eVar) {
        super(eVar, (byte) 0);
        this.f13656e = eVar;
    }

    @Override
    public final void add(Object obj) {
        h7.e eVar = this.f13656e;
        boolean isEmpty = eVar.isEmpty();
        b();
        ((ListIterator) this.f9891b).add(obj);
        if (isEmpty) {
            eVar.p();
        }
    }

    @Override
    public final boolean hasPrevious() {
        b();
        return ((ListIterator) this.f9891b).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        b();
        return ((ListIterator) this.f9891b).nextIndex();
    }

    @Override
    public final Object previous() {
        b();
        return ((ListIterator) this.f9891b).previous();
    }

    @Override
    public final int previousIndex() {
        b();
        return ((ListIterator) this.f9891b).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        b();
        ((ListIterator) this.f9891b).set(obj);
    }

    public bg(h7.e eVar, int i9) {
        super(eVar, ((List) eVar.f9908c).listIterator(i9), (byte) 0);
        this.f13656e = eVar;
    }
}
