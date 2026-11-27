package defpackage;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
public final class ulf extends AbstractList implements RandomAccess, ikf {
    public final gkf a;

    public ulf(gkf gkfVar) {
        this.a = gkfVar;
    }

    @Override
    public final Object b(int i) {
        return this.a.b.get(i);
    }

    @Override
    public final Object get(int i) {
        return this.a.get(i);
    }

    @Override
    public final Iterator iterator() {
        return new wgd(this);
    }

    @Override
    public final ListIterator listIterator(int i) {
        return new v3e(this, i);
    }

    @Override
    public final int size() {
        return this.a.b.size();
    }

    @Override
    public final List zzh() {
        return DesugarCollections.unmodifiableList(this.a.b);
    }

    @Override
    public final ikf zzd() {
        return this;
    }
}
