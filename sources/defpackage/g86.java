package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
public final class g86 extends AbstractList implements RandomAccess, Serializable {
    public final List a;
    public final es4 b;

    public g86(List list, es4 es4Var) {
        list.getClass();
        this.a = list;
        this.b = es4Var;
    }

    @Override
    public final Object get(int i) {
        return this.b.apply(this.a.get(i));
    }

    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return listIterator();
    }

    @Override
    public final ListIterator listIterator(int i) {
        return new f86(this, this.a.listIterator(i), (byte) 0);
    }

    @Override
    public final Object remove(int i) {
        return this.b.apply(this.a.remove(i));
    }

    @Override
    public final void removeRange(int i, int i2) {
        this.a.subList(i, i2).clear();
    }

    @Override
    public final int size() {
        return this.a.size();
    }
}
