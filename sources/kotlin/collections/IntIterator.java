package kotlin.collections;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
public abstract class IntIterator implements Iterator<Integer>, j$.util.Iterator {
    @Override
    public void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override
    public void forEachRemaining(java.util.function.Consumer<? super Integer> consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    public abstract int nextInt();

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object next() {
        return Integer.valueOf(nextInt());
    }
}
