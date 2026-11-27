package defpackage;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;
public final class h86 extends AbstractSequentialList implements Serializable {
    public final List a;
    public final es4 b;

    public h86(List list, es4 es4Var) {
        list.getClass();
        this.a = list;
        this.b = es4Var;
    }

    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public final ListIterator listIterator(int i) {
        return new f86(this, this.a.listIterator(i), (byte) 1);
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
