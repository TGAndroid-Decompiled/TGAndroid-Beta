package defpackage;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;
public final class d66 extends AbstractSequentialList implements Serializable {
    public final List a;
    public final aq4 b;

    public d66(List list, aq4 aq4Var) {
        list.getClass();
        this.a = list;
        this.b = aq4Var;
    }

    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public final ListIterator listIterator(int i) {
        return new b66(this, this.a.listIterator(i), (byte) 1);
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
