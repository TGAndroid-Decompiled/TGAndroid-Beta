package defpackage;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
public final class fod extends fcd implements rod, RandomAccess {
    public final ArrayList b;

    static {
        new fod(10).a = false;
    }

    public fod(int i) {
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
        if (collection instanceof rod) {
            collection = ((rod) collection).c();
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
    public final omd f(int i) {
        ArrayList arrayList = this.b;
        if (i >= arrayList.size()) {
            ArrayList arrayList2 = new ArrayList(i);
            arrayList2.addAll(arrayList);
            return new fod(arrayList2);
        }
        i98.g();
        return null;
    }

    @Override
    public final rod g() {
        if (this.a) {
            return new h1e(this);
        }
        return this;
    }

    @Override
    public final java.lang.Object get(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fod.get(int):java.lang.Object");
    }

    @Override
    public final Object remove(int i) {
        h();
        Object remove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof efd) {
            efd efdVar = (efd) remove;
            Charset charset = gld.a;
            if (efdVar.size() == 0) {
                return "";
            }
            return new String(efdVar.b, efdVar.h(), efdVar.size(), charset);
        }
        return new String((byte[]) remove, gld.a);
    }

    @Override
    public final Object set(int i, Object obj) {
        h();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof efd) {
            efd efdVar = (efd) obj2;
            Charset charset = gld.a;
            if (efdVar.size() == 0) {
                return "";
            }
            return new String(efdVar.b, efdVar.h(), efdVar.size(), charset);
        }
        return new String((byte[]) obj2, gld.a);
    }

    @Override
    public final int size() {
        return this.b.size();
    }

    public fod(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
