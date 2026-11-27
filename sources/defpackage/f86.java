package defpackage;

import java.util.AbstractList;
import java.util.ListIterator;
public final class f86 extends x2c implements ListIterator {
    public final byte b;
    public final AbstractList c;

    public f86(AbstractList abstractList, ListIterator listIterator, byte b) {
        super(listIterator);
        this.b = b;
        this.c = abstractList;
    }

    @Override
    public final Object a(Object obj) {
        byte b = this.b;
        AbstractList abstractList = this.c;
        switch (b) {
            case 0:
                return ((g86) abstractList).b.apply(obj);
            default:
                return ((h86) abstractList).b.apply(obj);
        }
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasPrevious() {
        return ((ListIterator) this.a).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        return ((ListIterator) this.a).nextIndex();
    }

    @Override
    public final Object previous() {
        return a(((ListIterator) this.a).previous());
    }

    @Override
    public final int previousIndex() {
        return ((ListIterator) this.a).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
