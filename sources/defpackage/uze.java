package defpackage;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
public final class uze extends AbstractList implements ere, RandomAccess {
    public final pqe a;

    public uze(pqe pqeVar) {
        this.a = pqeVar;
    }

    @Override
    public final Object d(int i) {
        return this.a.b.get(i);
    }

    @Override
    public final void e(sie sieVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object get(int i) {
        return (String) this.a.get(i);
    }

    @Override
    public final Iterator iterator() {
        dcd dcdVar = new dcd((byte) 3);
        dcdVar.b = this.a.iterator();
        return dcdVar;
    }

    @Override
    public final ListIterator listIterator(int i) {
        fzd fzdVar = new fzd((byte) 1);
        fzdVar.b = this.a.listIterator(i);
        return fzdVar;
    }

    @Override
    public final int size() {
        return this.a.size();
    }

    @Override
    public final List zzd() {
        return DesugarCollections.unmodifiableList(this.a.b);
    }

    @Override
    public final ere zze() {
        return this;
    }
}
