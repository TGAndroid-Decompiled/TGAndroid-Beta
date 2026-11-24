package defpackage;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
public final class ezd extends AbstractList implements omd, RandomAccess {
    public final cmd a;

    public ezd(cmd cmdVar) {
        this.a = cmdVar;
    }

    @Override
    public final List c() {
        return DesugarCollections.unmodifiableList(this.a.b);
    }

    @Override
    public final Object get(int i) {
        return (String) this.a.get(i);
    }

    @Override
    public final Iterator iterator() {
        dcd dcdVar = new dcd((byte) 2);
        dcdVar.b = this.a.iterator();
        return dcdVar;
    }

    @Override
    public final ListIterator listIterator(int i) {
        fzd fzdVar = new fzd((byte) 0);
        fzdVar.b = this.a.listIterator(i);
        return fzdVar;
    }

    @Override
    public final int size() {
        return this.a.size();
    }

    @Override
    public final omd g() {
        return this;
    }
}
