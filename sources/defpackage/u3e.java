package defpackage;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
public final class u3e extends AbstractList implements frd, RandomAccess {
    public final tqd a;

    public u3e(tqd tqdVar) {
        this.a = tqdVar;
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
        wgd wgdVar = new wgd((byte) 2);
        wgdVar.b = this.a.iterator();
        return wgdVar;
    }

    @Override
    public final ListIterator listIterator(int i) {
        v3e v3eVar = new v3e((byte) 0);
        v3eVar.b = this.a.listIterator(i);
        return v3eVar;
    }

    @Override
    public final int size() {
        return this.a.size();
    }

    @Override
    public final frd g() {
        return this;
    }
}
