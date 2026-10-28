package f9;

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
public abstract class d0 extends AbstractCollection implements Serializable, Collection {
    public static final Object[] f10272a = new Object[0];

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
    public abstract boolean contains(Object obj);

    @Override
    public void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    public i0 h() {
        if (isEmpty()) {
            g0 g0Var = i0.f10286b;
            return s1.e;
        }
        Object[] array = toArray(f10272a);
        g0 g0Var2 = i0.f10286b;
        return i0.s(array.length, array);
    }

    public int m(int i10, Object[] objArr) {
        g2 it = iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return i10;
    }

    public Object[] n() {
        return null;
    }

    public int o() {
        throw new UnsupportedOperationException();
    }

    public int p() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Stream parallelStream() {
        return Stream.Wrapper.convert(parallelStream());
    }

    public abstract boolean q();

    @Override
    public abstract g2 iterator();

    @Override
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean removeAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override
    public final boolean retainAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override
    public java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(stream());
    }

    @Override
    public Object[] toArray(IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) intFunction.apply(0));
        return array;
    }

    @Override
    public j$.util.stream.Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override
    public final j$.util.Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override
    public j$.util.stream.Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override
    public final Object[] toArray() {
        return toArray(f10272a);
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        if (objArr.length < size) {
            Object[] n10 = n();
            if (n10 != null) {
                return Arrays.copyOfRange(n10, p(), o(), objArr.getClass());
            }
            if (objArr.length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        m(0, objArr);
        return objArr;
    }
}
