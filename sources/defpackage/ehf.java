package defpackage;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
public final class ehf extends AbstractList implements RandomAccess, sff {
    public final qff a;

    public ehf(qff qffVar) {
        this.a = qffVar;
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
        return new dcd(this);
    }

    @Override
    public final ListIterator listIterator(int i) {
        return new fzd(this, i);
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
    public final sff zzd() {
        return this;
    }
}
