package defpackage;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
public abstract class qdd extends AbstractCollection implements Serializable {
    public static final Object[] b = new Object[0];
    public static final Object[] c = new Object[0];
    public static final Object[] d = new Object[0];
    public static final Object[] e = new Object[0];
    public final byte a;

    @Override
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public final boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public final void clear() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public abstract int h(Object[] objArr);

    public int i() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public int j() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public Object[] k() {
        byte b2 = this.a;
        return null;
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public final boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public final boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        switch (this.a) {
            case 0:
                objArr.getClass();
                int size = size();
                int length = objArr.length;
                if (length < size) {
                    Object[] k = k();
                    if (k == null) {
                        if (length != 0) {
                            objArr = Arrays.copyOf(objArr, 0);
                        }
                        objArr = Arrays.copyOf(objArr, size);
                    } else {
                        return Arrays.copyOfRange(k, j(), i(), objArr.getClass());
                    }
                } else if (length > size) {
                    objArr[size] = null;
                }
                h(objArr);
                return objArr;
            case 1:
                objArr.getClass();
                int size2 = size();
                int length2 = objArr.length;
                if (length2 < size2) {
                    Object[] k2 = k();
                    if (k2 == null) {
                        objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size2);
                    } else {
                        return Arrays.copyOfRange(k2, j(), i(), objArr.getClass());
                    }
                } else if (length2 > size2) {
                    objArr[size2] = null;
                }
                h(objArr);
                return objArr;
            case 2:
                objArr.getClass();
                int size3 = size();
                int length3 = objArr.length;
                if (length3 < size3) {
                    Object[] k3 = k();
                    if (k3 == null) {
                        objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size3);
                    } else {
                        return Arrays.copyOfRange(k3, j(), i(), objArr.getClass());
                    }
                } else if (length3 > size3) {
                    objArr[size3] = null;
                }
                h(objArr);
                return objArr;
            default:
                objArr.getClass();
                int size4 = size();
                int length4 = objArr.length;
                if (length4 < size4) {
                    Object[] k4 = k();
                    if (k4 == null) {
                        objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size4);
                    } else {
                        return Arrays.copyOfRange(k4, j(), i(), objArr.getClass());
                    }
                } else if (length4 > size4) {
                    objArr[size4] = null;
                }
                h(objArr);
                return objArr;
        }
    }

    @Override
    public final Object[] toArray() {
        switch (this.a) {
            case 0:
                return toArray(b);
            case 1:
                return toArray(c);
            case 2:
                return toArray(d);
            default:
                return toArray(e);
        }
    }
}
