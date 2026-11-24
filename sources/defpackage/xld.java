package defpackage;

import j$.util.SortedSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
public abstract class xld extends okd implements NavigableSet, Iterable, SortedSet {
    public final transient Comparator s;
    public transient xld w;

    public xld(Comparator comparator) {
        super((byte) 4);
        this.s = comparator;
    }

    public static aod E(Comparator comparator) {
        if (end.b != comparator) {
            eid eidVar = yjd.n;
            return new aod(qnd.w, comparator);
        }
        return aod.y;
    }

    @Override
    public final xld descendingSet() {
        aod aodVar = this.w;
        if (aodVar == null) {
            aod aodVar2 = (aod) this;
            Comparator reverseOrder = Collections.reverseOrder(aodVar2.s);
            if (aodVar2.isEmpty()) {
                aodVar = E(reverseOrder);
            } else {
                aodVar = new aod(aodVar2.x.y(), reverseOrder);
            }
            this.w = aodVar;
            aodVar.w = this;
        }
        return aodVar;
    }

    @Override
    public final aod subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.s.compare(obj, obj2) <= 0) {
            aod aodVar = (aod) this;
            aod H = aodVar.H(aodVar.G(obj, z), aodVar.x.size());
            return H.H(0, H.F(obj2, z2));
        }
        i98.g();
        return null;
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Comparator comparator() {
        return this.s;
    }

    public abstract Object first();

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override
    public final java.util.SortedSet headSet(Object obj) {
        obj.getClass();
        aod aodVar = (aod) this;
        return aodVar.H(0, aodVar.F(obj, false));
    }

    public abstract Object last();

    @Override
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final java.util.SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override
    public final java.util.SortedSet tailSet(Object obj) {
        obj.getClass();
        aod aodVar = (aod) this;
        return aodVar.H(aodVar.G(obj, true), aodVar.x.size());
    }

    @Override
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        aod aodVar = (aod) this;
        return aodVar.H(0, aodVar.F(obj, z));
    }

    @Override
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        aod aodVar = (aod) this;
        return aodVar.H(aodVar.G(obj, z), aodVar.x.size());
    }
}
