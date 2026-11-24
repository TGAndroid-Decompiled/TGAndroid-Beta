package defpackage;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
public final class fjf extends AbstractList implements RandomAccess, thf {
    public final rhf a;

    public fjf(rhf rhfVar) {
        this.a = rhfVar;
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
        return new fed(this);
    }

    @Override
    public final ListIterator listIterator(int i) {
        return new i1e(this, i);
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
    public final thf zzd() {
        return this;
    }
}
