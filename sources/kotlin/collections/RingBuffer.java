package kotlin.collections;

import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

public final class RingBuffer extends AbstractList implements RandomAccess {
    public final Object[] buffer;
    public final int capacity;
    public int size;
    public int startIndex;

    public RingBuffer(int i, Object[] objArr) {
        this.buffer = objArr;
        if (i < 0) {
            throw new IllegalArgumentException(SurfaceContainer$$ExternalSyntheticOutline0.m(i, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i <= objArr.length) {
            this.capacity = objArr.length;
            this.size = i;
        } else {
            throw new IllegalArgumentException(("ring buffer filled size: " + i + " cannot be larger than the buffer size: " + objArr.length).toString());
        }
    }

    @Override
    public final Object get(int i) {
        int size = getSize();
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException(SurfaceContainer$$ExternalSyntheticOutline0.m(i, size, "index: ", ", size: "));
        }
        return this.buffer[(this.startIndex + i) % this.capacity];
    }

    @Override
    public final int getSize() {
        return this.size;
    }

    @Override
    public final Iterator iterator() {
        return new Iterator() {
            public int count;
            public int index;
            public Object nextValue;
            public int state;

            {
                this.count = RingBuffer.this.size;
                this.index = RingBuffer.this.startIndex;
            }

            @Override
            public final boolean hasNext() {
                int i = this.state;
                if (i == 0) {
                    return tryToComputeNext();
                }
                if (i == 1) {
                    return true;
                }
                if (i == 2) {
                    return false;
                }
                throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
            }

            @Override
            public final Object next() {
                int i = this.state;
                if (i == 1) {
                    this.state = 0;
                    return this.nextValue;
                }
                if (i == 2 || !tryToComputeNext()) {
                    throw new NoSuchElementException();
                }
                this.state = 0;
                return this.nextValue;
            }

            @Override
            public final void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            public final boolean tryToComputeNext() {
                this.state = 3;
                int i = this.count;
                if (i == 0) {
                    this.state = 2;
                } else {
                    RingBuffer ringBuffer = RingBuffer.this;
                    Object[] objArr = ringBuffer.buffer;
                    int i2 = this.index;
                    this.nextValue = objArr[i2];
                    this.state = 1;
                    this.index = (i2 + 1) % ringBuffer.capacity;
                    this.count = i - 1;
                }
                return this.state == 1;
            }
        };
    }

    public final void removeFirst() {
        if (20 > this.size) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 20, size = " + this.size).toString());
        }
        int i = this.startIndex;
        int i2 = this.capacity;
        int i3 = (i + 20) % i2;
        Object[] objArr = this.buffer;
        if (i > i3) {
            ArraysKt.fill(i, i2, objArr);
            ArraysKt.fill(0, i3, objArr);
        } else {
            ArraysKt.fill(i, i3, objArr);
        }
        this.startIndex = i3;
        this.size -= 20;
    }

    @Override
    public final Object[] toArray() {
        return toArray(new Object[getSize()]);
    }

    @Override
    public final Object[] toArray(Object[] array) {
        Object[] objArr;
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        int i = this.size;
        if (length < i) {
            array = Arrays.copyOf(array, i);
            Intrinsics.checkNotNullExpressionValue(array, "copyOf(...)");
        }
        int i2 = this.size;
        int i3 = this.startIndex;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr = this.buffer;
            if (i5 >= i2 || i3 >= this.capacity) {
                break;
            }
            array[i5] = objArr[i3];
            i5++;
            i3++;
        }
        while (i5 < i2) {
            array[i5] = objArr[i4];
            i5++;
            i4++;
        }
        if (i2 < array.length) {
            array[i2] = null;
        }
        return array;
    }
}
