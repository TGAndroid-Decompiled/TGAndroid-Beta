package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

public final class ArrayDeque extends AbstractMutableList {
    public static final Companion Companion = new Companion(null);
    private static final Object[] emptyElementData = new Object[0];
    private Object[] elementData = emptyElementData;
    private int head;
    private int size;

    @Override
    public int getSize() {
        return this.size;
    }

    private final void ensureCapacity(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.elementData;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == emptyElementData) {
            this.elementData = new Object[RangesKt.coerceAtLeast(i, 10)];
        } else {
            copyElements(AbstractList.Companion.newCapacity$kotlin_stdlib(objArr.length, i));
        }
    }

    private final void copyElements(int i) {
        Object[] objArr = new Object[i];
        Object[] objArr2 = this.elementData;
        ArraysKt.copyInto(objArr2, objArr, 0, this.head, objArr2.length);
        Object[] objArr3 = this.elementData;
        int length = objArr3.length;
        int i2 = this.head;
        ArraysKt.copyInto(objArr3, objArr, length - i2, 0, i2);
        this.head = 0;
        this.elementData = objArr;
    }

    private final int positiveMod(int i) {
        Object[] objArr = this.elementData;
        return i >= objArr.length ? i - objArr.length : i;
    }

    private final int negativeMod(int i) {
        return i < 0 ? i + this.elementData.length : i;
    }

    private final int incremented(int i) {
        if (i == ArraysKt___ArraysKt.getLastIndex(this.elementData)) {
            return 0;
        }
        return i + 1;
    }

    private final int decremented(int i) {
        return i == 0 ? ArraysKt___ArraysKt.getLastIndex(this.elementData) : i - 1;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    public final void addFirst(Object obj) {
        registerModification();
        ensureCapacity(size() + 1);
        int iDecremented = decremented(this.head);
        this.head = iDecremented;
        this.elementData[iDecremented] = obj;
        this.size = size() + 1;
    }

    public final void addLast(Object obj) {
        registerModification();
        ensureCapacity(size() + 1);
        this.elementData[positiveMod(this.head + size())] = obj;
        this.size = size() + 1;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        registerModification();
        Object[] objArr = this.elementData;
        int i = this.head;
        Object obj = objArr[i];
        objArr[i] = null;
        this.head = incremented(i);
        this.size = size() - 1;
        return obj;
    }

    public final Object removeFirstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        registerModification();
        int iPositiveMod = positiveMod(this.head + CollectionsKt.getLastIndex(this));
        Object[] objArr = this.elementData;
        Object obj = objArr[iPositiveMod];
        objArr[iPositiveMod] = null;
        this.size = size() - 1;
        return obj;
    }

    @Override
    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override
    public void add(int i, Object obj) {
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i, size());
        if (i == size()) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        registerModification();
        ensureCapacity(size() + 1);
        int iPositiveMod = positiveMod(this.head + i);
        if (i < ((size() + 1) >> 1)) {
            int iDecremented = decremented(iPositiveMod);
            int iDecremented2 = decremented(this.head);
            int i2 = this.head;
            if (iDecremented >= i2) {
                Object[] objArr = this.elementData;
                objArr[iDecremented2] = objArr[i2];
                ArraysKt.copyInto(objArr, objArr, i2, i2 + 1, iDecremented + 1);
            } else {
                Object[] objArr2 = this.elementData;
                ArraysKt.copyInto(objArr2, objArr2, i2 - 1, i2, objArr2.length);
                Object[] objArr3 = this.elementData;
                objArr3[objArr3.length - 1] = objArr3[0];
                ArraysKt.copyInto(objArr3, objArr3, 0, 1, iDecremented + 1);
            }
            this.elementData[iDecremented] = obj;
            this.head = iDecremented2;
        } else {
            int iPositiveMod2 = positiveMod(this.head + size());
            if (iPositiveMod < iPositiveMod2) {
                Object[] objArr4 = this.elementData;
                ArraysKt.copyInto(objArr4, objArr4, iPositiveMod + 1, iPositiveMod, iPositiveMod2);
            } else {
                Object[] objArr5 = this.elementData;
                ArraysKt.copyInto(objArr5, objArr5, 1, 0, iPositiveMod2);
                Object[] objArr6 = this.elementData;
                objArr6[0] = objArr6[objArr6.length - 1];
                ArraysKt.copyInto(objArr6, objArr6, iPositiveMod + 1, iPositiveMod, objArr6.length - 1);
            }
            this.elementData[iPositiveMod] = obj;
        }
        this.size = size() + 1;
    }

    private final void copyCollectionElements(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.elementData.length;
        while (i < length && it.hasNext()) {
            this.elementData[i] = it.next();
            i++;
        }
        int i2 = this.head;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.elementData[i3] = it.next();
        }
        this.size = size() + collection.size();
    }

    @Override
    public boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        registerModification();
        ensureCapacity(size() + elements.size());
        copyCollectionElements(positiveMod(this.head + size()), elements);
        return true;
    }

    @Override
    public boolean addAll(int i, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(elements);
        }
        registerModification();
        ensureCapacity(size() + elements.size());
        int iPositiveMod = positiveMod(this.head + size());
        int iPositiveMod2 = positiveMod(this.head + i);
        int size = elements.size();
        if (i < ((size() + 1) >> 1)) {
            int i2 = this.head;
            int length = i2 - size;
            if (iPositiveMod2 < i2) {
                Object[] objArr = this.elementData;
                ArraysKt.copyInto(objArr, objArr, length, i2, objArr.length);
                if (size >= iPositiveMod2) {
                    Object[] objArr2 = this.elementData;
                    ArraysKt.copyInto(objArr2, objArr2, objArr2.length - size, 0, iPositiveMod2);
                } else {
                    Object[] objArr3 = this.elementData;
                    ArraysKt.copyInto(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.elementData;
                    ArraysKt.copyInto(objArr4, objArr4, 0, size, iPositiveMod2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.elementData;
                ArraysKt.copyInto(objArr5, objArr5, length, i2, iPositiveMod2);
            } else {
                Object[] objArr6 = this.elementData;
                length += objArr6.length;
                int i3 = iPositiveMod2 - i2;
                int length2 = objArr6.length - length;
                if (length2 >= i3) {
                    ArraysKt.copyInto(objArr6, objArr6, length, i2, iPositiveMod2);
                } else {
                    ArraysKt.copyInto(objArr6, objArr6, length, i2, i2 + length2);
                    Object[] objArr7 = this.elementData;
                    ArraysKt.copyInto(objArr7, objArr7, 0, this.head + length2, iPositiveMod2);
                }
            }
            this.head = length;
            copyCollectionElements(negativeMod(iPositiveMod2 - size), elements);
        } else {
            int i4 = iPositiveMod2 + size;
            if (iPositiveMod2 < iPositiveMod) {
                int i5 = size + iPositiveMod;
                Object[] objArr8 = this.elementData;
                if (i5 <= objArr8.length) {
                    ArraysKt.copyInto(objArr8, objArr8, i4, iPositiveMod2, iPositiveMod);
                } else if (i4 >= objArr8.length) {
                    ArraysKt.copyInto(objArr8, objArr8, i4 - objArr8.length, iPositiveMod2, iPositiveMod);
                } else {
                    int length3 = iPositiveMod - (i5 - objArr8.length);
                    ArraysKt.copyInto(objArr8, objArr8, 0, length3, iPositiveMod);
                    Object[] objArr9 = this.elementData;
                    ArraysKt.copyInto(objArr9, objArr9, i4, iPositiveMod2, length3);
                }
            } else {
                Object[] objArr10 = this.elementData;
                ArraysKt.copyInto(objArr10, objArr10, size, 0, iPositiveMod);
                Object[] objArr11 = this.elementData;
                if (i4 >= objArr11.length) {
                    ArraysKt.copyInto(objArr11, objArr11, i4 - objArr11.length, iPositiveMod2, objArr11.length);
                } else {
                    ArraysKt.copyInto(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.elementData;
                    ArraysKt.copyInto(objArr12, objArr12, i4, iPositiveMod2, objArr12.length - size);
                }
            }
            copyCollectionElements(iPositiveMod2, elements);
        }
        return true;
    }

    @Override
    public Object get(int i) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, size());
        return this.elementData[positiveMod(this.head + i)];
    }

    @Override
    public Object set(int i, Object obj) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, size());
        int iPositiveMod = positiveMod(this.head + i);
        Object[] objArr = this.elementData;
        Object obj2 = objArr[iPositiveMod];
        objArr[iPositiveMod] = obj;
        return obj2;
    }

    @Override
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override
    public int indexOf(Object obj) {
        int i;
        int iPositiveMod = positiveMod(this.head + size());
        int length = this.head;
        if (length < iPositiveMod) {
            while (length < iPositiveMod) {
                if (Intrinsics.areEqual(obj, this.elementData[length])) {
                    i = this.head;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iPositiveMod) {
            return -1;
        }
        int length2 = this.elementData.length;
        while (length < length2) {
            if (Intrinsics.areEqual(obj, this.elementData[length])) {
                i = this.head;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iPositiveMod; i2++) {
            if (Intrinsics.areEqual(obj, this.elementData[i2])) {
                length = i2 + this.elementData.length;
                i = this.head;
            }
        }
        return -1;
        return length - i;
    }

    @Override
    public int lastIndexOf(Object obj) {
        int lastIndex;
        int i;
        int iPositiveMod = positiveMod(this.head + size());
        int i2 = this.head;
        if (i2 < iPositiveMod) {
            lastIndex = iPositiveMod - 1;
            if (i2 <= lastIndex) {
                while (!Intrinsics.areEqual(obj, this.elementData[lastIndex])) {
                    if (lastIndex != i2) {
                        lastIndex--;
                    }
                }
                i = this.head;
                return lastIndex - i;
            }
            return -1;
        }
        if (i2 > iPositiveMod) {
            for (int i3 = iPositiveMod - 1; -1 < i3; i3--) {
                if (Intrinsics.areEqual(obj, this.elementData[i3])) {
                    lastIndex = i3 + this.elementData.length;
                    i = this.head;
                    return lastIndex - i;
                }
            }
            lastIndex = ArraysKt___ArraysKt.getLastIndex(this.elementData);
            int i4 = this.head;
            if (i4 <= lastIndex) {
                while (!Intrinsics.areEqual(obj, this.elementData[lastIndex])) {
                    if (lastIndex != i4) {
                        lastIndex--;
                    }
                }
                i = this.head;
                return lastIndex - i;
            }
        }
        return -1;
    }

    @Override
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override
    public Object removeAt(int i) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, size());
        if (i == CollectionsKt.getLastIndex(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        registerModification();
        int iPositiveMod = positiveMod(this.head + i);
        Object obj = this.elementData[iPositiveMod];
        if (i < (size() >> 1)) {
            int i2 = this.head;
            if (iPositiveMod >= i2) {
                Object[] objArr = this.elementData;
                ArraysKt.copyInto(objArr, objArr, i2 + 1, i2, iPositiveMod);
            } else {
                Object[] objArr2 = this.elementData;
                ArraysKt.copyInto(objArr2, objArr2, 1, 0, iPositiveMod);
                Object[] objArr3 = this.elementData;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i3 = this.head;
                ArraysKt.copyInto(objArr3, objArr3, i3 + 1, i3, objArr3.length - 1);
            }
            Object[] objArr4 = this.elementData;
            int i4 = this.head;
            objArr4[i4] = null;
            this.head = incremented(i4);
        } else {
            int iPositiveMod2 = positiveMod(this.head + CollectionsKt.getLastIndex(this));
            if (iPositiveMod <= iPositiveMod2) {
                Object[] objArr5 = this.elementData;
                ArraysKt.copyInto(objArr5, objArr5, iPositiveMod, iPositiveMod + 1, iPositiveMod2 + 1);
            } else {
                Object[] objArr6 = this.elementData;
                ArraysKt.copyInto(objArr6, objArr6, iPositiveMod, iPositiveMod + 1, objArr6.length);
                Object[] objArr7 = this.elementData;
                objArr7[objArr7.length - 1] = objArr7[0];
                ArraysKt.copyInto(objArr7, objArr7, 0, 1, iPositiveMod2 + 1);
            }
            this.elementData[iPositiveMod2] = null;
        }
        this.size = size() - 1;
        return obj;
    }

    @Override
    public boolean removeAll(Collection elements) {
        int iPositiveMod;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int iPositiveMod2 = positiveMod(this.head + size());
            int i = this.head;
            if (i < iPositiveMod2) {
                iPositiveMod = i;
                while (i < iPositiveMod2) {
                    Object obj = this.elementData[i];
                    if (elements.contains(obj)) {
                        z = true;
                    } else {
                        this.elementData[iPositiveMod] = obj;
                        iPositiveMod++;
                    }
                    i++;
                }
                ArraysKt___ArraysJvmKt.fill(this.elementData, null, iPositiveMod, iPositiveMod2);
            } else {
                int length = this.elementData.length;
                int i2 = i;
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr = this.elementData;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (elements.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.elementData[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iPositiveMod = positiveMod(i2);
                for (int i3 = 0; i3 < iPositiveMod2; i3++) {
                    Object[] objArr2 = this.elementData;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (elements.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.elementData[iPositiveMod] = obj3;
                        iPositiveMod = incremented(iPositiveMod);
                    }
                }
                z = z2;
            }
            if (z) {
                registerModification();
                this.size = negativeMod(iPositiveMod - this.head);
            }
        }
        return z;
    }

    @Override
    public boolean retainAll(Collection elements) {
        int iPositiveMod;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int iPositiveMod2 = positiveMod(this.head + size());
            int i = this.head;
            if (i < iPositiveMod2) {
                iPositiveMod = i;
                while (i < iPositiveMod2) {
                    Object obj = this.elementData[i];
                    if (elements.contains(obj)) {
                        this.elementData[iPositiveMod] = obj;
                        iPositiveMod++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                ArraysKt___ArraysJvmKt.fill(this.elementData, null, iPositiveMod, iPositiveMod2);
            } else {
                int length = this.elementData.length;
                int i2 = i;
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr = this.elementData;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (elements.contains(obj2)) {
                        this.elementData[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iPositiveMod = positiveMod(i2);
                for (int i3 = 0; i3 < iPositiveMod2; i3++) {
                    Object[] objArr2 = this.elementData;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (elements.contains(obj3)) {
                        this.elementData[iPositiveMod] = obj3;
                        iPositiveMod = incremented(iPositiveMod);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                registerModification();
                this.size = negativeMod(iPositiveMod - this.head);
            }
        }
        return z;
    }

    @Override
    public void clear() {
        if (!isEmpty()) {
            registerModification();
            nullifyNonEmpty(this.head, positiveMod(this.head + size()));
        }
        this.head = 0;
        this.size = 0;
    }

    @Override
    public Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (array.length < size()) {
            array = ArraysKt__ArraysJVMKt.arrayOfNulls(array, size());
        }
        int iPositiveMod = positiveMod(this.head + size());
        int i = this.head;
        if (i < iPositiveMod) {
            ArraysKt.copyInto$default(this.elementData, array, 0, i, iPositiveMod, 2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr = this.elementData;
            ArraysKt.copyInto(objArr, array, 0, this.head, objArr.length);
            Object[] objArr2 = this.elementData;
            ArraysKt.copyInto(objArr2, array, objArr2.length - this.head, 0, iPositiveMod);
        }
        return CollectionsKt__CollectionsJVMKt.terminateCollectionToArray(size(), array);
    }

    @Override
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override
    protected void removeRange(int i, int i2) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, size());
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == size()) {
            clear();
            return;
        }
        if (i3 == 1) {
            remove(i);
            return;
        }
        registerModification();
        if (i < size() - i2) {
            removeRangeShiftPreceding(i, i2);
            int iPositiveMod = positiveMod(this.head + i3);
            nullifyNonEmpty(this.head, iPositiveMod);
            this.head = iPositiveMod;
        } else {
            removeRangeShiftSucceeding(i, i2);
            int iPositiveMod2 = positiveMod(this.head + size());
            nullifyNonEmpty(negativeMod(iPositiveMod2 - i3), iPositiveMod2);
        }
        this.size = size() - i3;
    }

    private final void removeRangeShiftPreceding(int i, int i2) {
        int iPositiveMod = positiveMod(this.head + (i - 1));
        int iPositiveMod2 = positiveMod(this.head + (i2 - 1));
        while (i > 0) {
            int i3 = iPositiveMod + 1;
            int iMin = Math.min(i, Math.min(i3, iPositiveMod2 + 1));
            Object[] objArr = this.elementData;
            int i4 = iPositiveMod2 - iMin;
            int i5 = iPositiveMod - iMin;
            ArraysKt.copyInto(objArr, objArr, i4 + 1, i5 + 1, i3);
            iPositiveMod = negativeMod(i5);
            iPositiveMod2 = negativeMod(i4);
            i -= iMin;
        }
    }

    private final void removeRangeShiftSucceeding(int i, int i2) {
        int iPositiveMod = positiveMod(this.head + i2);
        int iPositiveMod2 = positiveMod(this.head + i);
        int size = size();
        while (true) {
            size -= i2;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.elementData;
            i2 = Math.min(size, Math.min(objArr.length - iPositiveMod, objArr.length - iPositiveMod2));
            Object[] objArr2 = this.elementData;
            int i3 = iPositiveMod + i2;
            ArraysKt.copyInto(objArr2, objArr2, iPositiveMod2, iPositiveMod, i3);
            iPositiveMod = positiveMod(i3);
            iPositiveMod2 = positiveMod(iPositiveMod2 + i2);
        }
    }

    private final void nullifyNonEmpty(int i, int i2) {
        if (i < i2) {
            ArraysKt___ArraysJvmKt.fill(this.elementData, null, i, i2);
            return;
        }
        Object[] objArr = this.elementData;
        ArraysKt___ArraysJvmKt.fill(objArr, null, i, objArr.length);
        ArraysKt___ArraysJvmKt.fill(this.elementData, null, 0, i2);
    }

    private final void registerModification() {
        ((java.util.AbstractList) this).modCount++;
    }

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
