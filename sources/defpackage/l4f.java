package defpackage;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
public final class l4f extends AbstractList implements vve, RandomAccess {
    public final gve a;

    public l4f(gve gveVar) {
        this.a = gveVar;
    }

    @Override
    public final Object d(int i) {
        return this.a.b.get(i);
    }

    @Override
    public final void e(jne jneVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object get(int i) {
        return (String) this.a.get(i);
    }

    @Override
    public final Iterator iterator() {
        wgd wgdVar = new wgd((byte) 3);
        wgdVar.b = this.a.iterator();
        return wgdVar;
    }

    @Override
    public final ListIterator listIterator(int i) {
        v3e v3eVar = new v3e((byte) 1);
        v3eVar.b = this.a.listIterator(i);
        return v3eVar;
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
    public final vve zze() {
        return this;
    }
}
