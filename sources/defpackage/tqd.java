package defpackage;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
public final class tqd extends wed implements frd, RandomAccess {
    public final ArrayList b;

    static {
        new tqd(10).a = false;
    }

    public tqd(int i) {
        this(new ArrayList(i));
    }

    @Override
    public final void add(int i, Object obj) {
        h();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override
    public final boolean addAll(int i, Collection collection) {
        h();
        if (collection instanceof frd) {
            collection = ((frd) collection).c();
        }
        boolean addAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override
    public final List c() {
        return DesugarCollections.unmodifiableList(this.b);
    }

    @Override
    public final void clear() {
        h();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override
    public final dpd f(int i) {
        ArrayList arrayList = this.b;
        if (i >= arrayList.size()) {
            ArrayList arrayList2 = new ArrayList(i);
            arrayList2.addAll(arrayList);
            return new tqd(arrayList2);
        }
        iy8.d();
        return null;
    }

    @Override
    public final frd g() {
        if (this.a) {
            return new u3e(this);
        }
        return this;
    }

    @Override
    public final java.lang.Object get(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqd.get(int):java.lang.Object");
    }

    @Override
    public final Object remove(int i) {
        h();
        Object remove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof vhd) {
            vhd vhdVar = (vhd) remove;
            Charset charset = vnd.a;
            if (vhdVar.size() == 0) {
                return "";
            }
            return new String(vhdVar.b, vhdVar.h(), vhdVar.size(), charset);
        }
        return new String((byte[]) remove, vnd.a);
    }

    @Override
    public final Object set(int i, Object obj) {
        h();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof vhd) {
            vhd vhdVar = (vhd) obj2;
            Charset charset = vnd.a;
            if (vhdVar.size() == 0) {
                return "";
            }
            return new String(vhdVar.b, vhdVar.h(), vhdVar.size(), charset);
        }
        return new String((byte[]) obj2, vnd.a);
    }

    @Override
    public final int size() {
        return this.b.size();
    }

    public tqd(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
