package defpackage;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
public final class w1f extends AbstractList implements hte, RandomAccess {
    public final sse a;

    public w1f(sse sseVar) {
        this.a = sseVar;
    }

    @Override
    public final Object d(int i) {
        return this.a.b.get(i);
    }

    @Override
    public final void e(tke tkeVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object get(int i) {
        return (String) this.a.get(i);
    }

    @Override
    public final Iterator iterator() {
        fed fedVar = new fed((byte) 3);
        fedVar.b = this.a.iterator();
        return fedVar;
    }

    @Override
    public final ListIterator listIterator(int i) {
        i1e i1eVar = new i1e((byte) 1);
        i1eVar.b = this.a.listIterator(i);
        return i1eVar;
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
    public final hte zze() {
        return this;
    }
}
