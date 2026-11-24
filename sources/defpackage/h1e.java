package defpackage;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
public final class h1e extends AbstractList implements rod, RandomAccess {
    public final fod a;

    public h1e(fod fodVar) {
        this.a = fodVar;
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
        fed fedVar = new fed((byte) 2);
        fedVar.b = this.a.iterator();
        return fedVar;
    }

    @Override
    public final ListIterator listIterator(int i) {
        i1e i1eVar = new i1e((byte) 0);
        i1eVar.b = this.a.listIterator(i);
        return i1eVar;
    }

    @Override
    public final int size() {
        return this.a.size();
    }

    @Override
    public final rod g() {
        return this;
    }
}
