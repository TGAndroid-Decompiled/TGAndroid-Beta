package defpackage;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
public abstract class fcd extends AbstractList implements omd {
    public boolean a = true;

    @Override
    public final boolean add(Object obj) {
        h();
        return super.add(obj);
    }

    @Override
    public boolean addAll(int i, Collection collection) {
        h();
        return super.addAll(i, collection);
    }

    @Override
    public void clear() {
        h();
        super.clear();
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final void h() {
        if (this.a) {
            return;
        }
        gxc.b();
    }

    @Override
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override
    public final boolean remove(Object obj) {
        h();
        return super.remove(obj);
    }

    @Override
    public final boolean removeAll(Collection collection) {
        h();
        return super.removeAll(collection);
    }

    @Override
    public final boolean retainAll(Collection collection) {
        h();
        return super.retainAll(collection);
    }

    @Override
    public boolean addAll(Collection collection) {
        h();
        return super.addAll(collection);
    }
}
