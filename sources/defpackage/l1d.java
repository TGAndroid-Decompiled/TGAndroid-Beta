package defpackage;

import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.stream.Stream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
public abstract class l1d extends AbstractCollection implements Serializable, Collection {
    public static final Object[] b = new Object[0];
    public static final Object[] c = new Object[0];
    public static final Object[] d = new Object[0];
    public static final Object[] e = new Object[0];
    public static final Object[] f = new Object[0];
    public static final Object[] h = new Object[0];
    public final byte a;

    public l1d(byte b2) {
        this.a = b2;
    }

    @Override
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public final boolean addAll(java.util.Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
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
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public final void forEach(Consumer consumer) {
        byte b2 = this.a;
        Iterable$CC.$default$forEach(this, consumer);
    }

    public abstract int h(Object[] objArr);

    public int i() {
        return 0;
    }

    public int j() {
        return 0;
    }

    public abstract Object[] k();

    public abstract int l(Object[] objArr);

    public abstract int m();

    public int n() {
        return 0;
    }

    public abstract Object[] o();

    public int p(Object[] objArr) {
        v7c u = u();
        int i = 0;
        while (u.hasNext()) {
            objArr[i] = u.next();
            i++;
        }
        return i;
    }

    @Override
    public final Stream parallelStream() {
        byte b2 = this.a;
        return Stream.Wrapper.convert(parallelStream());
    }

    public int q() {
        switch (this.a) {
            case 2:
                throw new UnsupportedOperationException();
            case 3:
            default:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
        }
    }

    public Object[] r() {
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
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public final boolean removeAll(java.util.Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public final boolean removeIf(Predicate predicate) {
        byte b2 = this.a;
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override
    public final boolean retainAll(java.util.Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public int s() {
        switch (this.a) {
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public final Spliterator spliterator() {
        switch (this.a) {
            case 0:
                return Spliterators.spliterator(this, 1296);
            case 1:
                return Spliterators.spliterator(this, 1296);
            case 2:
                return Spliterators.spliterator(this, 1296);
            case 3:
                return Spliterators.spliterator(this, 1296);
            case 4:
                return Spliterators.spliterator(this, 1296);
            default:
                return Spliterators.spliterator(this, 1296);
        }
    }

    @Override
    public final java.util.stream.Stream stream() {
        byte b2 = this.a;
        return Stream.Wrapper.convert(stream());
    }

    public int t() {
        throw new UnsupportedOperationException();
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
                    Object[] o = o();
                    if (o == null) {
                        if (length2 != 0) {
                            objArr = Arrays.copyOf(objArr, 0);
                        }
                        objArr = Arrays.copyOf(objArr, size2);
                    } else {
                        return Arrays.copyOfRange(o, n(), m(), objArr.getClass());
                    }
                } else if (length2 > size2) {
                    objArr[size2] = null;
                }
                l(objArr);
                return objArr;
            case 2:
                objArr.getClass();
                int size3 = size();
                int length3 = objArr.length;
                if (length3 < size3) {
                    Object[] v = v();
                    if (v == null) {
                        if (length3 != 0) {
                            objArr = Arrays.copyOf(objArr, 0);
                        }
                        objArr = Arrays.copyOf(objArr, size3);
                    } else {
                        return Arrays.copyOfRange(v, s(), q(), objArr.getClass());
                    }
                } else if (length3 > size3) {
                    objArr[size3] = null;
                }
                p(objArr);
                return objArr;
            case 3:
                objArr.getClass();
                int size4 = size();
                int length4 = objArr.length;
                if (length4 < size4) {
                    Object[] r = r();
                    if (r == null) {
                        if (length4 != 0) {
                            objArr = Arrays.copyOf(objArr, 0);
                        }
                        objArr = Arrays.copyOf(objArr, size4);
                    } else {
                        return Arrays.copyOfRange(r, s(), t(), objArr.getClass());
                    }
                } else if (length4 > size4) {
                    objArr[size4] = null;
                }
                w(objArr);
                return objArr;
            case 4:
                objArr.getClass();
                int size5 = size();
                int length5 = objArr.length;
                if (length5 < size5) {
                    Object[] v2 = v();
                    if (v2 == null) {
                        if (length5 != 0) {
                            objArr = Arrays.copyOf(objArr, 0);
                        }
                        objArr = Arrays.copyOf(objArr, size5);
                    } else {
                        return Arrays.copyOfRange(v2, s(), q(), objArr.getClass());
                    }
                } else if (length5 > size5) {
                    objArr[size5] = null;
                }
                p(objArr);
                return objArr;
            default:
                objArr.getClass();
                int size6 = size();
                int length6 = objArr.length;
                if (length6 < size6) {
                    Object[] x = x();
                    if (x == null) {
                        if (length6 != 0) {
                            objArr = Arrays.copyOf(objArr, 0);
                        }
                        objArr = Arrays.copyOf(objArr, size6);
                    } else {
                        return Arrays.copyOfRange(x, s(), q(), objArr.getClass());
                    }
                } else if (length6 > size6) {
                    objArr[size6] = null;
                }
                p(objArr);
                return objArr;
        }
    }

    public abstract v7c u();

    public Object[] v() {
        byte b2 = this.a;
        return null;
    }

    public abstract int w(Object[] objArr);

    public Object[] x() {
        return null;
    }

    @Override
    public final j$.util.stream.Stream parallelStream() {
        byte b2 = this.a;
        return Collection.CC.$default$parallelStream(this);
    }

    @Override
    public final j$.util.stream.Stream stream() {
        byte b2 = this.a;
        return Collection.CC.$default$stream(this);
    }

    @Override
    public final java.util.Spliterator spliterator() {
        byte b2 = this.a;
        return Spliterator.Wrapper.convert(spliterator());
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
            case 3:
                return toArray(e);
            case 4:
                return toArray(f);
            default:
                return toArray(h);
        }
    }

    @Override
    public final Object[] toArray(IntFunction intFunction) {
        Object[] array;
        byte b2 = this.a;
        array = toArray((Object[]) intFunction.apply(0));
        return array;
    }
}
