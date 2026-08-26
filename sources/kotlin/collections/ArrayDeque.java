package kotlin.collections;

import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

public final class ArrayDeque extends java.util.AbstractList implements List {
    public static final Object[] emptyElementData = new Object[0];
    public Object[] elementData = emptyElementData;
    public int head;
    public int size;

    @Override
    public final void add(int i, Object obj) {
        int length;
        int i2 = this.size;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(Fragment$$ExternalSyntheticOutline0.m(i, i2, "index: ", ", size: "));
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        registerModification();
        ensureCapacity(this.size + 1);
        int iPositiveMod = positiveMod(this.head + i);
        int i3 = this.size;
        if (i < ((i3 + 1) >> 1)) {
            if (iPositiveMod == 0) {
                Object[] objArr = this.elementData;
                Intrinsics.checkNotNullParameter(objArr, "<this>");
                iPositiveMod = objArr.length;
            }
            int i4 = iPositiveMod - 1;
            int i5 = this.head;
            if (i5 == 0) {
                Object[] objArr2 = this.elementData;
                Intrinsics.checkNotNullParameter(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i5 - 1;
            }
            int i6 = this.head;
            if (i4 >= i6) {
                Object[] objArr3 = this.elementData;
                objArr3[length] = objArr3[i6];
                ArraysKt.copyInto(i6, i6 + 1, i4 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.elementData;
                ArraysKt.copyInto(i6 - 1, i6, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.elementData;
                objArr5[objArr5.length - 1] = objArr5[0];
                ArraysKt.copyInto(0, 1, i4 + 1, objArr5, objArr5);
            }
            this.elementData[i4] = obj;
            this.head = length;
        } else {
            int iPositiveMod2 = positiveMod(this.head + i3);
            if (iPositiveMod < iPositiveMod2) {
                Object[] objArr6 = this.elementData;
                ArraysKt.copyInto(iPositiveMod + 1, iPositiveMod, iPositiveMod2, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.elementData;
                ArraysKt.copyInto(1, 0, iPositiveMod2, objArr7, objArr7);
                Object[] objArr8 = this.elementData;
                objArr8[0] = objArr8[objArr8.length - 1];
                ArraysKt.copyInto(iPositiveMod + 1, iPositiveMod, objArr8.length - 1, objArr8, objArr8);
            }
            this.elementData[iPositiveMod] = obj;
        }
        this.size++;
    }

    @Override
    public final boolean addAll(int i, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = this.size;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(Fragment$$ExternalSyntheticOutline0.m(i, i2, "index: ", ", size: "));
        }
        if (elements.isEmpty()) {
            return false;
        }
        if (i == this.size) {
            return addAll(elements);
        }
        registerModification();
        ensureCapacity(elements.size() + this.size);
        int iPositiveMod = positiveMod(this.head + this.size);
        int iPositiveMod2 = positiveMod(this.head + i);
        int size = elements.size();
        if (i >= ((this.size + 1) >> 1)) {
            int i3 = iPositiveMod2 + size;
            if (iPositiveMod2 < iPositiveMod) {
                int i4 = size + iPositiveMod;
                Object[] objArr = this.elementData;
                if (i4 <= objArr.length) {
                    ArraysKt.copyInto(i3, iPositiveMod2, iPositiveMod, objArr, objArr);
                } else if (i3 >= objArr.length) {
                    ArraysKt.copyInto(i3 - objArr.length, iPositiveMod2, iPositiveMod, objArr, objArr);
                } else {
                    int length = iPositiveMod - (i4 - objArr.length);
                    ArraysKt.copyInto(0, length, iPositiveMod, objArr, objArr);
                    Object[] objArr2 = this.elementData;
                    ArraysKt.copyInto(i3, iPositiveMod2, length, objArr2, objArr2);
                }
            } else {
                Object[] objArr3 = this.elementData;
                ArraysKt.copyInto(size, 0, iPositiveMod, objArr3, objArr3);
                Object[] objArr4 = this.elementData;
                if (i3 >= objArr4.length) {
                    ArraysKt.copyInto(i3 - objArr4.length, iPositiveMod2, objArr4.length, objArr4, objArr4);
                } else {
                    ArraysKt.copyInto(0, objArr4.length - size, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.elementData;
                    ArraysKt.copyInto(i3, iPositiveMod2, objArr5.length - size, objArr5, objArr5);
                }
            }
            copyCollectionElements(iPositiveMod2, elements);
            return true;
        }
        int i5 = this.head;
        int length2 = i5 - size;
        if (iPositiveMod2 < i5) {
            Object[] objArr6 = this.elementData;
            ArraysKt.copyInto(length2, i5, objArr6.length, objArr6, objArr6);
            if (size >= iPositiveMod2) {
                Object[] objArr7 = this.elementData;
                ArraysKt.copyInto(objArr7.length - size, 0, iPositiveMod2, objArr7, objArr7);
            } else {
                Object[] objArr8 = this.elementData;
                ArraysKt.copyInto(objArr8.length - size, 0, size, objArr8, objArr8);
                Object[] objArr9 = this.elementData;
                ArraysKt.copyInto(0, size, iPositiveMod2, objArr9, objArr9);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.elementData;
            ArraysKt.copyInto(length2, i5, iPositiveMod2, objArr10, objArr10);
        } else {
            Object[] objArr11 = this.elementData;
            length2 += objArr11.length;
            int i6 = iPositiveMod2 - i5;
            int length3 = objArr11.length - length2;
            if (length3 >= i6) {
                ArraysKt.copyInto(length2, i5, iPositiveMod2, objArr11, objArr11);
            } else {
                ArraysKt.copyInto(length2, i5, i5 + length3, objArr11, objArr11);
                Object[] objArr12 = this.elementData;
                ArraysKt.copyInto(0, this.head + length3, iPositiveMod2, objArr12, objArr12);
            }
        }
        this.head = length2;
        copyCollectionElements(negativeMod(iPositiveMod2 - size), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        registerModification();
        ensureCapacity(this.size + 1);
        int length = this.head;
        if (length == 0) {
            Object[] objArr = this.elementData;
            Intrinsics.checkNotNullParameter(objArr, "<this>");
            length = objArr.length;
        }
        int i = length - 1;
        this.head = i;
        this.elementData[i] = obj;
        this.size++;
    }

    public final void addLast(Object obj) {
        registerModification();
        ensureCapacity(this.size + 1);
        this.elementData[positiveMod(this.head + this.size)] = obj;
        this.size++;
    }

    @Override
    public final void clear() {
        if (!isEmpty()) {
            registerModification();
            nullifyNonEmpty(this.head, positiveMod(this.head + this.size));
        }
        this.head = 0;
        this.size = 0;
    }

    @Override
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void copyCollectionElements(int i, Collection collection) {
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
        this.size = collection.size() + this.size;
    }

    public final void ensureCapacity(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.elementData;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == emptyElementData) {
            if (i < 10) {
                i = 10;
            }
            this.elementData = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        ArraysKt.copyInto(0, this.head, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.elementData;
        int length2 = objArr3.length;
        int i3 = this.head;
        ArraysKt.copyInto(length2 - i3, 0, i3, objArr3, objArr2);
        this.head = 0;
        this.elementData = objArr2;
    }

    @Override
    public final Object get(int i) {
        int i2 = this.size;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(Fragment$$ExternalSyntheticOutline0.m(i, i2, "index: ", ", size: "));
        }
        return this.elementData[positiveMod(this.head + i)];
    }

    public final int incremented(int i) {
        Object[] objArr = this.elementData;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (i == objArr.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override
    public final int indexOf(Object obj) {
        int i;
        int iPositiveMod = positiveMod(this.head + this.size);
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
    public final boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iPositiveMod = positiveMod(this.head + this.size);
        int i2 = this.head;
        if (i2 < iPositiveMod) {
            length = iPositiveMod - 1;
            if (i2 <= length) {
                while (!Intrinsics.areEqual(obj, this.elementData[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.head;
                return length - i;
            }
            return -1;
        }
        if (i2 > iPositiveMod) {
            for (int i3 = iPositiveMod - 1; -1 < i3; i3--) {
                if (Intrinsics.areEqual(obj, this.elementData[i3])) {
                    length = i3 + this.elementData.length;
                    i = this.head;
                    return length - i;
                }
            }
            Object[] objArr = this.elementData;
            Intrinsics.checkNotNullParameter(objArr, "<this>");
            length = objArr.length - 1;
            int i4 = this.head;
            if (i4 <= length) {
                while (!Intrinsics.areEqual(obj, this.elementData[length])) {
                    if (length != i4) {
                        length--;
                    }
                }
                i = this.head;
                return length - i;
            }
        }
        return -1;
    }

    public final int negativeMod(int i) {
        return i < 0 ? i + this.elementData.length : i;
    }

    public final void nullifyNonEmpty(int i, int i2) {
        if (i < i2) {
            ArraysKt.fill(i, i2, this.elementData);
            return;
        }
        Object[] objArr = this.elementData;
        ArraysKt.fill(i, objArr.length, objArr);
        ArraysKt.fill(0, i2, this.elementData);
    }

    public final int positiveMod(int i) {
        Object[] objArr = this.elementData;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void registerModification() {
        ((java.util.AbstractList) this).modCount++;
    }

    @Override
    public final Object remove(int i) {
        int i2 = this.size;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(Fragment$$ExternalSyntheticOutline0.m(i, i2, "index: ", ", size: "));
        }
        if (i == size() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        registerModification();
        int iPositiveMod = positiveMod(this.head + i);
        Object[] objArr = this.elementData;
        Object obj = objArr[iPositiveMod];
        if (i < (this.size >> 1)) {
            int i3 = this.head;
            if (iPositiveMod >= i3) {
                ArraysKt.copyInto(i3 + 1, i3, iPositiveMod, objArr, objArr);
            } else {
                ArraysKt.copyInto(1, 0, iPositiveMod, objArr, objArr);
                Object[] objArr2 = this.elementData;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i4 = this.head;
                ArraysKt.copyInto(i4 + 1, i4, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.elementData;
            int i5 = this.head;
            objArr3[i5] = null;
            this.head = incremented(i5);
        } else {
            int iPositiveMod2 = positiveMod((size() - 1) + this.head);
            if (iPositiveMod <= iPositiveMod2) {
                Object[] objArr4 = this.elementData;
                ArraysKt.copyInto(iPositiveMod, iPositiveMod + 1, iPositiveMod2 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.elementData;
                ArraysKt.copyInto(iPositiveMod, iPositiveMod + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.elementData;
                objArr6[objArr6.length - 1] = objArr6[0];
                ArraysKt.copyInto(0, 1, iPositiveMod2 + 1, objArr6, objArr6);
            }
            this.elementData[iPositiveMod2] = null;
        }
        this.size--;
        return obj;
    }

    @Override
    public final boolean removeAll(Collection elements) {
        int iPositiveMod;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int iPositiveMod2 = positiveMod(this.head + this.size);
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
                ArraysKt.fill(iPositiveMod, iPositiveMod2, this.elementData);
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
        this.size--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        registerModification();
        int iPositiveMod = positiveMod((size() - 1) + this.head);
        Object[] objArr = this.elementData;
        Object obj = objArr[iPositiveMod];
        objArr[iPositiveMod] = null;
        this.size--;
        return obj;
    }

    @Override
    public final void removeRange(int i, int i2) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, this.size);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.size) {
            clear();
            return;
        }
        if (i3 == 1) {
            remove(i);
            return;
        }
        registerModification();
        if (i < this.size - i2) {
            int iPositiveMod = positiveMod((i - 1) + this.head);
            int iPositiveMod2 = positiveMod((i2 - 1) + this.head);
            while (i > 0) {
                int i4 = iPositiveMod + 1;
                int iMin = Math.min(i, Math.min(i4, iPositiveMod2 + 1));
                Object[] objArr = this.elementData;
                int i5 = iPositiveMod2 - iMin;
                int i6 = iPositiveMod - iMin;
                ArraysKt.copyInto(i5 + 1, i6 + 1, i4, objArr, objArr);
                iPositiveMod = negativeMod(i6);
                iPositiveMod2 = negativeMod(i5);
                i -= iMin;
            }
            int iPositiveMod3 = positiveMod(this.head + i3);
            nullifyNonEmpty(this.head, iPositiveMod3);
            this.head = iPositiveMod3;
        } else {
            int iPositiveMod4 = positiveMod(this.head + i2);
            int iPositiveMod5 = positiveMod(this.head + i);
            int i7 = this.size;
            while (true) {
                i7 -= i2;
                if (i7 <= 0) {
                    break;
                }
                Object[] objArr2 = this.elementData;
                i2 = Math.min(i7, Math.min(objArr2.length - iPositiveMod4, objArr2.length - iPositiveMod5));
                Object[] objArr3 = this.elementData;
                int i8 = iPositiveMod4 + i2;
                ArraysKt.copyInto(iPositiveMod5, iPositiveMod4, i8, objArr3, objArr3);
                iPositiveMod4 = positiveMod(i8);
                iPositiveMod5 = positiveMod(iPositiveMod5 + i2);
            }
            int iPositiveMod6 = positiveMod(this.head + this.size);
            nullifyNonEmpty(negativeMod(iPositiveMod6 - i3), iPositiveMod6);
        }
        this.size -= i3;
    }

    @Override
    public final boolean retainAll(Collection elements) {
        int iPositiveMod;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int iPositiveMod2 = positiveMod(this.head + this.size);
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
                ArraysKt.fill(iPositiveMod, iPositiveMod2, this.elementData);
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
    public final Object set(int i, Object obj) {
        int i2 = this.size;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(Fragment$$ExternalSyntheticOutline0.m(i, i2, "index: ", ", size: "));
        }
        int iPositiveMod = positiveMod(this.head + i);
        Object[] objArr = this.elementData;
        Object obj2 = objArr[iPositiveMod];
        objArr[iPositiveMod] = obj;
        return obj2;
    }

    @Override
    public final int size() {
        return this.size;
    }

    @Override
    public final Object[] toArray() {
        return toArray(new Object[this.size]);
    }

    @Override
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        int i = this.size;
        if (length < i) {
            Object objNewInstance = Array.newInstance(array.getClass().getComponentType(), i);
            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) objNewInstance;
        }
        int iPositiveMod = positiveMod(this.head + this.size);
        int i2 = this.head;
        if (i2 < iPositiveMod) {
            ArraysKt.copyInto$default(i2, iPositiveMod, 2, this.elementData, array);
        } else if (!isEmpty()) {
            Object[] objArr = this.elementData;
            ArraysKt.copyInto(0, this.head, objArr.length, objArr, array);
            Object[] objArr2 = this.elementData;
            ArraysKt.copyInto(objArr2.length - this.head, 0, iPositiveMod, objArr2, array);
        }
        int i3 = this.size;
        if (i3 < array.length) {
            array[i3] = null;
        }
        return array;
    }

    @Override
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        registerModification();
        ensureCapacity(elements.size() + this.size);
        copyCollectionElements(positiveMod(this.head + this.size), elements);
        return true;
    }
}
