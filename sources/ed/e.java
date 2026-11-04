package ed;

import b8.rb;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
public final class e extends AbstractList implements List {
    public static final Object[] d = new Object[0];
    public int f9949a;
    public Object[] f9950b = d;
    public int f9951c;

    @Override
    public final void add(int i3, Object obj) {
        int i10;
        int i11 = this.f9951c;
        if (i3 < 0 || i3 > i11) {
            throw new IndexOutOfBoundsException(a1.g.n(i3, i11, "index: ", ", size: "));
        }
        if (i3 == i11) {
            addLast(obj);
        } else if (i3 == 0) {
            addFirst(obj);
        } else {
            n();
            i(this.f9951c + 1);
            int m10 = m(this.f9949a + i3);
            int i12 = this.f9951c;
            if (i3 < ((i12 + 1) >> 1)) {
                if (m10 == 0) {
                    Object[] objArr = this.f9950b;
                    kotlin.jvm.internal.j.e(objArr, "<this>");
                    m10 = objArr.length;
                }
                int i13 = m10 - 1;
                int i14 = this.f9949a;
                if (i14 == 0) {
                    Object[] objArr2 = this.f9950b;
                    kotlin.jvm.internal.j.e(objArr2, "<this>");
                    i10 = objArr2.length - 1;
                } else {
                    i10 = i14 - 1;
                }
                int i15 = this.f9949a;
                if (i13 >= i15) {
                    Object[] objArr3 = this.f9950b;
                    objArr3[i10] = objArr3[i15];
                    f.c(i15, i15 + 1, i13 + 1, objArr3, objArr3);
                } else {
                    Object[] objArr4 = this.f9950b;
                    f.c(i15 - 1, i15, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f9950b;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    f.c(0, 1, i13 + 1, objArr5, objArr5);
                }
                this.f9950b[i13] = obj;
                this.f9949a = i10;
            } else {
                int m11 = m(this.f9949a + i12);
                if (m10 < m11) {
                    Object[] objArr6 = this.f9950b;
                    f.c(m10 + 1, m10, m11, objArr6, objArr6);
                } else {
                    Object[] objArr7 = this.f9950b;
                    f.c(1, 0, m11, objArr7, objArr7);
                    Object[] objArr8 = this.f9950b;
                    objArr8[0] = objArr8[objArr8.length - 1];
                    f.c(m10 + 1, m10, objArr8.length - 1, objArr8, objArr8);
                }
                this.f9950b[m10] = obj;
            }
            this.f9951c++;
        }
    }

    @Override
    public final boolean addAll(int i3, Collection elements) {
        kotlin.jvm.internal.j.e(elements, "elements");
        int i10 = this.f9951c;
        if (i3 >= 0 && i3 <= i10) {
            if (elements.isEmpty()) {
                return false;
            }
            if (i3 == this.f9951c) {
                return addAll(elements);
            }
            n();
            i(elements.size() + this.f9951c);
            int m10 = m(this.f9949a + this.f9951c);
            int m11 = m(this.f9949a + i3);
            int size = elements.size();
            if (i3 < ((this.f9951c + 1) >> 1)) {
                int i11 = this.f9949a;
                int i12 = i11 - size;
                if (m11 < i11) {
                    Object[] objArr = this.f9950b;
                    f.c(i12, i11, objArr.length, objArr, objArr);
                    if (size >= m11) {
                        Object[] objArr2 = this.f9950b;
                        f.c(objArr2.length - size, 0, m11, objArr2, objArr2);
                    } else {
                        Object[] objArr3 = this.f9950b;
                        f.c(objArr3.length - size, 0, size, objArr3, objArr3);
                        Object[] objArr4 = this.f9950b;
                        f.c(0, size, m11, objArr4, objArr4);
                    }
                } else if (i12 >= 0) {
                    Object[] objArr5 = this.f9950b;
                    f.c(i12, i11, m11, objArr5, objArr5);
                } else {
                    Object[] objArr6 = this.f9950b;
                    i12 += objArr6.length;
                    int i13 = m11 - i11;
                    int length = objArr6.length - i12;
                    if (length >= i13) {
                        f.c(i12, i11, m11, objArr6, objArr6);
                    } else {
                        f.c(i12, i11, i11 + length, objArr6, objArr6);
                        Object[] objArr7 = this.f9950b;
                        f.c(0, this.f9949a + length, m11, objArr7, objArr7);
                    }
                }
                this.f9949a = i12;
                h(k(m11 - size), elements);
                return true;
            }
            int i14 = m11 + size;
            if (m11 < m10) {
                int i15 = size + m10;
                Object[] objArr8 = this.f9950b;
                if (i15 <= objArr8.length) {
                    f.c(i14, m11, m10, objArr8, objArr8);
                } else if (i14 >= objArr8.length) {
                    f.c(i14 - objArr8.length, m11, m10, objArr8, objArr8);
                } else {
                    int length2 = m10 - (i15 - objArr8.length);
                    f.c(0, length2, m10, objArr8, objArr8);
                    Object[] objArr9 = this.f9950b;
                    f.c(i14, m11, length2, objArr9, objArr9);
                }
            } else {
                Object[] objArr10 = this.f9950b;
                f.c(size, 0, m10, objArr10, objArr10);
                Object[] objArr11 = this.f9950b;
                if (i14 >= objArr11.length) {
                    f.c(i14 - objArr11.length, m11, objArr11.length, objArr11, objArr11);
                } else {
                    f.c(0, objArr11.length - size, objArr11.length, objArr11, objArr11);
                    Object[] objArr12 = this.f9950b;
                    f.c(i14, m11, objArr12.length - size, objArr12, objArr12);
                }
            }
            h(m11, elements);
            return true;
        }
        throw new IndexOutOfBoundsException(a1.g.n(i3, i10, "index: ", ", size: "));
    }

    public final void addFirst(Object obj) {
        n();
        i(this.f9951c + 1);
        int i3 = this.f9949a;
        if (i3 == 0) {
            Object[] objArr = this.f9950b;
            kotlin.jvm.internal.j.e(objArr, "<this>");
            i3 = objArr.length;
        }
        int i10 = i3 - 1;
        this.f9949a = i10;
        this.f9950b[i10] = obj;
        this.f9951c++;
    }

    public final void addLast(Object obj) {
        n();
        i(this.f9951c + 1);
        this.f9950b[m(this.f9949a + this.f9951c)] = obj;
        this.f9951c++;
    }

    @Override
    public final void clear() {
        if (!isEmpty()) {
            n();
            l(this.f9949a, m(this.f9949a + this.f9951c));
        }
        this.f9949a = 0;
        this.f9951c = 0;
    }

    @Override
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override
    public final Object get(int i3) {
        int i10 = this.f9951c;
        if (i3 >= 0 && i3 < i10) {
            return this.f9950b[m(this.f9949a + i3)];
        }
        throw new IndexOutOfBoundsException(a1.g.n(i3, i10, "index: ", ", size: "));
    }

    public final void h(int i3, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f9950b.length;
        while (i3 < length && it.hasNext()) {
            this.f9950b[i3] = it.next();
            i3++;
        }
        int i10 = this.f9949a;
        for (int i11 = 0; i11 < i10 && it.hasNext(); i11++) {
            this.f9950b[i11] = it.next();
        }
        this.f9951c = collection.size() + this.f9951c;
    }

    public final void i(int i3) {
        if (i3 >= 0) {
            Object[] objArr = this.f9950b;
            if (i3 <= objArr.length) {
                return;
            }
            if (objArr == d) {
                if (i3 < 10) {
                    i3 = 10;
                }
                this.f9950b = new Object[i3];
                return;
            }
            int length = objArr.length;
            int i10 = length + (length >> 1);
            if (i10 - i3 < 0) {
                i10 = i3;
            }
            if (i10 - 2147483639 > 0) {
                if (i3 > 2147483639) {
                    i10 = Integer.MAX_VALUE;
                } else {
                    i10 = 2147483639;
                }
            }
            Object[] objArr2 = new Object[i10];
            f.c(0, this.f9949a, objArr.length, objArr, objArr2);
            Object[] objArr3 = this.f9950b;
            int length2 = objArr3.length;
            int i11 = this.f9949a;
            f.c(length2 - i11, 0, i11, objArr3, objArr2);
            this.f9949a = 0;
            this.f9950b = objArr2;
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    @Override
    public final int indexOf(Object obj) {
        int i3;
        int m10 = m(this.f9949a + this.f9951c);
        int i10 = this.f9949a;
        if (i10 < m10) {
            while (i10 < m10) {
                if (kotlin.jvm.internal.j.a(obj, this.f9950b[i10])) {
                    i3 = this.f9949a;
                } else {
                    i10++;
                }
            }
            return -1;
        } else if (i10 >= m10) {
            int length = this.f9950b.length;
            while (true) {
                if (i10 < length) {
                    if (kotlin.jvm.internal.j.a(obj, this.f9950b[i10])) {
                        i3 = this.f9949a;
                        break;
                    }
                    i10++;
                } else {
                    for (int i11 = 0; i11 < m10; i11++) {
                        if (kotlin.jvm.internal.j.a(obj, this.f9950b[i11])) {
                            i10 = i11 + this.f9950b.length;
                            i3 = this.f9949a;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i10 - i3;
    }

    @Override
    public final boolean isEmpty() {
        if (this.f9951c == 0) {
            return true;
        }
        return false;
    }

    public final int j(int i3) {
        Object[] objArr = this.f9950b;
        kotlin.jvm.internal.j.e(objArr, "<this>");
        if (i3 == objArr.length - 1) {
            return 0;
        }
        return i3 + 1;
    }

    public final int k(int i3) {
        if (i3 < 0) {
            return i3 + this.f9950b.length;
        }
        return i3;
    }

    public final void l(int i3, int i10) {
        if (i3 < i10) {
            f.e(i3, i10, this.f9950b);
            return;
        }
        Object[] objArr = this.f9950b;
        f.e(i3, objArr.length, objArr);
        f.e(0, i10, this.f9950b);
    }

    @Override
    public final int lastIndexOf(Object obj) {
        int length;
        int i3;
        int m10 = m(this.f9949a + this.f9951c);
        int i10 = this.f9949a;
        if (i10 < m10) {
            length = m10 - 1;
            if (i10 <= length) {
                while (!kotlin.jvm.internal.j.a(obj, this.f9950b[length])) {
                    if (length != i10) {
                        length--;
                    }
                }
                i3 = this.f9949a;
                return length - i3;
            }
            return -1;
        }
        if (i10 > m10) {
            int i11 = m10 - 1;
            while (true) {
                if (-1 < i11) {
                    if (kotlin.jvm.internal.j.a(obj, this.f9950b[i11])) {
                        length = i11 + this.f9950b.length;
                        i3 = this.f9949a;
                        break;
                    }
                    i11--;
                } else {
                    Object[] objArr = this.f9950b;
                    kotlin.jvm.internal.j.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i12 = this.f9949a;
                    if (i12 <= length) {
                        while (!kotlin.jvm.internal.j.a(obj, this.f9950b[length])) {
                            if (length != i12) {
                                length--;
                            }
                        }
                        i3 = this.f9949a;
                    }
                }
            }
        }
        return -1;
    }

    public final int m(int i3) {
        Object[] objArr = this.f9950b;
        if (i3 >= objArr.length) {
            return i3 - objArr.length;
        }
        return i3;
    }

    public final void n() {
        ((AbstractList) this).modCount++;
    }

    @Override
    public final Object remove(int i3) {
        int i10 = this.f9951c;
        if (i3 >= 0 && i3 < i10) {
            if (i3 == h.b(this)) {
                return removeLast();
            }
            if (i3 == 0) {
                return removeFirst();
            }
            n();
            int m10 = m(this.f9949a + i3);
            Object[] objArr = this.f9950b;
            Object obj = objArr[m10];
            if (i3 < (this.f9951c >> 1)) {
                int i11 = this.f9949a;
                if (m10 >= i11) {
                    f.c(i11 + 1, i11, m10, objArr, objArr);
                } else {
                    f.c(1, 0, m10, objArr, objArr);
                    Object[] objArr2 = this.f9950b;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i12 = this.f9949a;
                    f.c(i12 + 1, i12, objArr2.length - 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.f9950b;
                int i13 = this.f9949a;
                objArr3[i13] = null;
                this.f9949a = j(i13);
            } else {
                int m11 = m(h.b(this) + this.f9949a);
                if (m10 <= m11) {
                    Object[] objArr4 = this.f9950b;
                    f.c(m10, m10 + 1, m11 + 1, objArr4, objArr4);
                } else {
                    Object[] objArr5 = this.f9950b;
                    f.c(m10, m10 + 1, objArr5.length, objArr5, objArr5);
                    Object[] objArr6 = this.f9950b;
                    objArr6[objArr6.length - 1] = objArr6[0];
                    f.c(0, 1, m11 + 1, objArr6, objArr6);
                }
                this.f9950b[m11] = null;
            }
            this.f9951c--;
            return obj;
        }
        throw new IndexOutOfBoundsException(a1.g.n(i3, i10, "index: ", ", size: "));
    }

    @Override
    public final boolean removeAll(Collection elements) {
        int m10;
        kotlin.jvm.internal.j.e(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f9950b.length != 0) {
            int m11 = m(this.f9949a + this.f9951c);
            int i3 = this.f9949a;
            if (i3 < m11) {
                m10 = i3;
                while (i3 < m11) {
                    Object obj = this.f9950b[i3];
                    if (!elements.contains(obj)) {
                        this.f9950b[m10] = obj;
                        m10++;
                    } else {
                        z10 = true;
                    }
                    i3++;
                }
                f.e(m10, m11, this.f9950b);
            } else {
                int length = this.f9950b.length;
                boolean z11 = false;
                int i10 = i3;
                while (i3 < length) {
                    Object[] objArr = this.f9950b;
                    Object obj2 = objArr[i3];
                    objArr[i3] = null;
                    if (!elements.contains(obj2)) {
                        this.f9950b[i10] = obj2;
                        i10++;
                    } else {
                        z11 = true;
                    }
                    i3++;
                }
                m10 = m(i10);
                for (int i11 = 0; i11 < m11; i11++) {
                    Object[] objArr2 = this.f9950b;
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (!elements.contains(obj3)) {
                        this.f9950b[m10] = obj3;
                        m10 = j(m10);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                n();
                this.f9951c = k(m10 - this.f9949a);
            }
        }
        return z10;
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            n();
            Object[] objArr = this.f9950b;
            int i3 = this.f9949a;
            Object obj = objArr[i3];
            objArr[i3] = null;
            this.f9949a = j(i3);
            this.f9951c--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            n();
            int m10 = m(h.b(this) + this.f9949a);
            Object[] objArr = this.f9950b;
            Object obj = objArr[m10];
            objArr[m10] = null;
            this.f9951c--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override
    public final void removeRange(int i3, int i10) {
        rb.a(i3, i10, this.f9951c);
        int i11 = i10 - i3;
        if (i11 == 0) {
            return;
        }
        if (i11 == this.f9951c) {
            clear();
        } else if (i11 == 1) {
            remove(i3);
        } else {
            n();
            if (i3 < this.f9951c - i10) {
                int m10 = m((i3 - 1) + this.f9949a);
                int m11 = m((i10 - 1) + this.f9949a);
                while (i3 > 0) {
                    int i12 = m10 + 1;
                    int min = Math.min(i3, Math.min(i12, m11 + 1));
                    Object[] objArr = this.f9950b;
                    int i13 = m11 - min;
                    int i14 = m10 - min;
                    f.c(i13 + 1, i14 + 1, i12, objArr, objArr);
                    m10 = k(i14);
                    m11 = k(i13);
                    i3 -= min;
                }
                int m12 = m(this.f9949a + i11);
                l(this.f9949a, m12);
                this.f9949a = m12;
            } else {
                int m13 = m(this.f9949a + i10);
                int m14 = m(this.f9949a + i3);
                int i15 = this.f9951c;
                while (true) {
                    i15 -= i10;
                    if (i15 <= 0) {
                        break;
                    }
                    Object[] objArr2 = this.f9950b;
                    i10 = Math.min(i15, Math.min(objArr2.length - m13, objArr2.length - m14));
                    Object[] objArr3 = this.f9950b;
                    int i16 = m13 + i10;
                    f.c(m14, m13, i16, objArr3, objArr3);
                    m13 = m(i16);
                    m14 = m(m14 + i10);
                }
                int m15 = m(this.f9949a + this.f9951c);
                l(k(m15 - i11), m15);
            }
            this.f9951c -= i11;
        }
    }

    @Override
    public final boolean retainAll(Collection elements) {
        int m10;
        kotlin.jvm.internal.j.e(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f9950b.length != 0) {
            int m11 = m(this.f9949a + this.f9951c);
            int i3 = this.f9949a;
            if (i3 < m11) {
                m10 = i3;
                while (i3 < m11) {
                    Object obj = this.f9950b[i3];
                    if (elements.contains(obj)) {
                        this.f9950b[m10] = obj;
                        m10++;
                    } else {
                        z10 = true;
                    }
                    i3++;
                }
                f.e(m10, m11, this.f9950b);
            } else {
                int length = this.f9950b.length;
                boolean z11 = false;
                int i10 = i3;
                while (i3 < length) {
                    Object[] objArr = this.f9950b;
                    Object obj2 = objArr[i3];
                    objArr[i3] = null;
                    if (elements.contains(obj2)) {
                        this.f9950b[i10] = obj2;
                        i10++;
                    } else {
                        z11 = true;
                    }
                    i3++;
                }
                m10 = m(i10);
                for (int i11 = 0; i11 < m11; i11++) {
                    Object[] objArr2 = this.f9950b;
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (elements.contains(obj3)) {
                        this.f9950b[m10] = obj3;
                        m10 = j(m10);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                n();
                this.f9951c = k(m10 - this.f9949a);
            }
        }
        return z10;
    }

    @Override
    public final Object set(int i3, Object obj) {
        int i10 = this.f9951c;
        if (i3 >= 0 && i3 < i10) {
            int m10 = m(this.f9949a + i3);
            Object[] objArr = this.f9950b;
            Object obj2 = objArr[m10];
            objArr[m10] = obj;
            return obj2;
        }
        throw new IndexOutOfBoundsException(a1.g.n(i3, i10, "index: ", ", size: "));
    }

    @Override
    public final int size() {
        return this.f9951c;
    }

    @Override
    public final Object[] toArray() {
        return toArray(new Object[this.f9951c]);
    }

    @Override
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.j.e(array, "array");
        int length = array.length;
        int i3 = this.f9951c;
        if (length < i3) {
            Object newInstance = Array.newInstance(array.getClass().getComponentType(), i3);
            kotlin.jvm.internal.j.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) newInstance;
        }
        int m10 = m(this.f9949a + this.f9951c);
        int i10 = this.f9949a;
        if (i10 < m10) {
            f.d(i10, m10, 2, this.f9950b, array);
        } else if (!isEmpty()) {
            Object[] objArr = this.f9950b;
            f.c(0, this.f9949a, objArr.length, objArr, array);
            Object[] objArr2 = this.f9950b;
            f.c(objArr2.length - this.f9949a, 0, m10, objArr2, array);
        }
        int i11 = this.f9951c;
        if (i11 < array.length) {
            array[i11] = null;
        }
        return array;
    }

    @Override
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.j.e(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        n();
        i(elements.size() + this.f9951c);
        h(m(this.f9949a + this.f9951c), elements);
        return true;
    }
}
