package defpackage;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
public abstract class dtd extends AbstractCollection implements Serializable {
    public static final Object[] a = new Object[0];

    @Override
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract int h(Object[] objArr);

    public abstract int i();

    public int j() {
        return 0;
    }

    public boolean k() {
        return true;
    }

    public abstract Object[] l();

    @Override
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] l = l();
            if (l == null) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            } else {
                return Arrays.copyOfRange(l, j(), i(), objArr.getClass());
            }
        } else if (length > size) {
            objArr[size] = null;
        }
        h(objArr);
        return objArr;
    }

    @Override
    public final Object[] toArray() {
        return toArray(a);
    }
}
