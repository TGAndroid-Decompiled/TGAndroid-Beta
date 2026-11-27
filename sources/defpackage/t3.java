package defpackage;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
public abstract class t3 extends AbstractList implements or5 {
    public boolean a;

    @Override
    public final boolean addAll(Collection collection) {
        h();
        return super.addAll(collection);
    }

    @Override
    public final void clear() {
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
        p3d.a();
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
    public abstract Object remove(int i);

    @Override
    public final boolean remove(Object obj) {
        h();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
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
    public final boolean addAll(int i, Collection collection) {
        h();
        return super.addAll(i, collection);
    }
}
