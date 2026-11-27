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
public abstract class ejd extends AbstractCollection implements Serializable, Collection {
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
    public final void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    public abstract int h(Object[] objArr);

    public int i() {
        throw new UnsupportedOperationException();
    }

    public int j() {
        throw new UnsupportedOperationException();
    }

    public abstract vjd k();

    public abstract boolean l();

    public Object[] m() {
        return null;
    }

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
        int length = objArr.length;
        if (length < size) {
            Object[] m = m();
            if (m == null) {
                if (length != 0) {
                    objArr = Arrays.copyOf(objArr, 0);
                }
                objArr = Arrays.copyOf(objArr, size);
            } else {
                return Arrays.copyOfRange(m, j(), i(), objArr.getClass());
            }
        } else if (length > size) {
            objArr[size] = null;
        }
        h(objArr);
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
