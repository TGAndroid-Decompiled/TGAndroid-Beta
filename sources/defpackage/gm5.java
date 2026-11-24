package defpackage;

import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.stream.Stream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
public abstract class gm5 extends AbstractCollection implements Serializable, Collection {
    public static final Object[] a = new Object[0];

    @Override
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean contains(Object obj) {
        if (((c69) this).e.b(obj) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    public mm5 h() {
        if (isEmpty()) {
            km5 km5Var = mm5.b;
            return w59.e;
        }
        Object[] array = toArray(a);
        km5 km5Var2 = mm5.b;
        return mm5.o(array.length, array);
    }

    public int i(int i, Object[] objArr) {
        v5c n = n();
        while (n.hasNext()) {
            objArr[i] = n.next();
            i++;
        }
        return i;
    }

    public Object[] j() {
        return null;
    }

    public int k() {
        throw new UnsupportedOperationException();
    }

    public int l() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean m();

    public abstract v5c n();

    @Override
    public final Stream parallelStream() {
        return Stream.Wrapper.convert(parallelStream());
    }

    @Override
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean removeAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override
    public final boolean retainAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override
    public final java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(stream());
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        if (objArr.length < size) {
            Object[] j = j();
            if (j != null) {
                return Arrays.copyOfRange(j, l(), k(), objArr.getClass());
            }
            if (objArr.length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        i(0, objArr);
        return objArr;
    }

    @Override
    public final j$.util.stream.Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override
    public final j$.util.Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override
    public final j$.util.stream.Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override
    public final Object[] toArray() {
        return toArray(a);
    }

    @Override
    public final Object[] toArray(IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) intFunction.apply(0));
        return array;
    }
}
