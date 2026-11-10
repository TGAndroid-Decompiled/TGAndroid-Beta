package hd;

import a8.p0;
import c8.b0;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
public final class d extends AbstractList implements List {
    public static final Object[] d = new Object[0];
    public int f14472a;
    public Object[] f14473b = d;
    public int f14474c;

    @Override
    public final void add(int i7, Object obj) {
        int i10;
        int i11 = this.f14474c;
        if (i7 < 0 || i7 > i11) {
            throw new IndexOutOfBoundsException(p0.m(i7, i11, "index: ", ", size: "));
        }
        if (i7 == i11) {
            addLast(obj);
        } else if (i7 == 0) {
            addFirst(obj);
        } else {
            n();
            i(this.f14474c + 1);
            int m10 = m(this.f14472a + i7);
            int i12 = this.f14474c;
            if (i7 < ((i12 + 1) >> 1)) {
                if (m10 == 0) {
                    Object[] objArr = this.f14473b;
                    kotlin.jvm.internal.j.e(objArr, "<this>");
                    m10 = objArr.length;
                }
                int i13 = m10 - 1;
                int i14 = this.f14472a;
                if (i14 == 0) {
                    Object[] objArr2 = this.f14473b;
                    kotlin.jvm.internal.j.e(objArr2, "<this>");
                    i10 = objArr2.length - 1;
                } else {
                    i10 = i14 - 1;
                }
                int i15 = this.f14472a;
                if (i13 >= i15) {
                    Object[] objArr3 = this.f14473b;
                    objArr3[i10] = objArr3[i15];
                    e.c(i15, i15 + 1, i13 + 1, objArr3, objArr3);
                } else {
                    Object[] objArr4 = this.f14473b;
                    e.c(i15 - 1, i15, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f14473b;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    e.c(0, 1, i13 + 1, objArr5, objArr5);
                }
                this.f14473b[i13] = obj;
                this.f14472a = i10;
            } else {
                int m11 = m(this.f14472a + i12);
                if (m10 < m11) {
                    Object[] objArr6 = this.f14473b;
                    e.c(m10 + 1, m10, m11, objArr6, objArr6);
                } else {
                    Object[] objArr7 = this.f14473b;
                    e.c(1, 0, m11, objArr7, objArr7);
                    Object[] objArr8 = this.f14473b;
                    objArr8[0] = objArr8[objArr8.length - 1];
                    e.c(m10 + 1, m10, objArr8.length - 1, objArr8, objArr8);
                }
                this.f14473b[m10] = obj;
            }
            this.f14474c++;
        }
    }

    @Override
    public final boolean addAll(int i7, Collection elements) {
        kotlin.jvm.internal.j.e(elements, "elements");
        int i10 = this.f14474c;
        if (i7 >= 0 && i7 <= i10) {
            if (elements.isEmpty()) {
                return false;
            }
            if (i7 == this.f14474c) {
                return addAll(elements);
            }
            n();
            i(elements.size() + this.f14474c);
            int m10 = m(this.f14472a + this.f14474c);
            int m11 = m(this.f14472a + i7);
            int size = elements.size();
            if (i7 < ((this.f14474c + 1) >> 1)) {
                int i11 = this.f14472a;
                int i12 = i11 - size;
                if (m11 < i11) {
                    Object[] objArr = this.f14473b;
                    e.c(i12, i11, objArr.length, objArr, objArr);
                    if (size >= m11) {
                        Object[] objArr2 = this.f14473b;
                        e.c(objArr2.length - size, 0, m11, objArr2, objArr2);
                    } else {
                        Object[] objArr3 = this.f14473b;
                        e.c(objArr3.length - size, 0, size, objArr3, objArr3);
                        Object[] objArr4 = this.f14473b;
                        e.c(0, size, m11, objArr4, objArr4);
                    }
                } else if (i12 >= 0) {
                    Object[] objArr5 = this.f14473b;
                    e.c(i12, i11, m11, objArr5, objArr5);
                } else {
                    Object[] objArr6 = this.f14473b;
                    i12 += objArr6.length;
                    int i13 = m11 - i11;
                    int length = objArr6.length - i12;
                    if (length >= i13) {
                        e.c(i12, i11, m11, objArr6, objArr6);
                    } else {
                        e.c(i12, i11, i11 + length, objArr6, objArr6);
                        Object[] objArr7 = this.f14473b;
                        e.c(0, this.f14472a + length, m11, objArr7, objArr7);
                    }
                }
                this.f14472a = i12;
                f(k(m11 - size), elements);
                return true;
            }
            int i14 = m11 + size;
            if (m11 < m10) {
                int i15 = size + m10;
                Object[] objArr8 = this.f14473b;
                if (i15 <= objArr8.length) {
                    e.c(i14, m11, m10, objArr8, objArr8);
                } else if (i14 >= objArr8.length) {
                    e.c(i14 - objArr8.length, m11, m10, objArr8, objArr8);
                } else {
                    int length2 = m10 - (i15 - objArr8.length);
                    e.c(0, length2, m10, objArr8, objArr8);
                    Object[] objArr9 = this.f14473b;
                    e.c(i14, m11, length2, objArr9, objArr9);
                }
            } else {
                Object[] objArr10 = this.f14473b;
                e.c(size, 0, m10, objArr10, objArr10);
                Object[] objArr11 = this.f14473b;
                if (i14 >= objArr11.length) {
                    e.c(i14 - objArr11.length, m11, objArr11.length, objArr11, objArr11);
                } else {
                    e.c(0, objArr11.length - size, objArr11.length, objArr11, objArr11);
                    Object[] objArr12 = this.f14473b;
                    e.c(i14, m11, objArr12.length - size, objArr12, objArr12);
                }
            }
            f(m11, elements);
            return true;
        }
        throw new IndexOutOfBoundsException(p0.m(i7, i10, "index: ", ", size: "));
    }

    public final void addFirst(Object obj) {
        n();
        i(this.f14474c + 1);
        int i7 = this.f14472a;
        if (i7 == 0) {
            Object[] objArr = this.f14473b;
            kotlin.jvm.internal.j.e(objArr, "<this>");
            i7 = objArr.length;
        }
        int i10 = i7 - 1;
        this.f14472a = i10;
        this.f14473b[i10] = obj;
        this.f14474c++;
    }

    public final void addLast(Object obj) {
        n();
        i(this.f14474c + 1);
        this.f14473b[m(this.f14472a + this.f14474c)] = obj;
        this.f14474c++;
    }

    @Override
    public final void clear() {
        if (!isEmpty()) {
            n();
            l(this.f14472a, m(this.f14472a + this.f14474c));
        }
        this.f14472a = 0;
        this.f14474c = 0;
    }

    @Override
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final void f(int i7, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f14473b.length;
        while (i7 < length && it.hasNext()) {
            this.f14473b[i7] = it.next();
            i7++;
        }
        int i10 = this.f14472a;
        for (int i11 = 0; i11 < i10 && it.hasNext(); i11++) {
            this.f14473b[i11] = it.next();
        }
        this.f14474c = collection.size() + this.f14474c;
    }

    @Override
    public final Object get(int i7) {
        int i10 = this.f14474c;
        if (i7 >= 0 && i7 < i10) {
            return this.f14473b[m(this.f14472a + i7)];
        }
        throw new IndexOutOfBoundsException(p0.m(i7, i10, "index: ", ", size: "));
    }

    public final void i(int i7) {
        if (i7 >= 0) {
            Object[] objArr = this.f14473b;
            if (i7 <= objArr.length) {
                return;
            }
            if (objArr == d) {
                if (i7 < 10) {
                    i7 = 10;
                }
                this.f14473b = new Object[i7];
                return;
            }
            int length = objArr.length;
            int i10 = length + (length >> 1);
            if (i10 - i7 < 0) {
                i10 = i7;
            }
            if (i10 - 2147483639 > 0) {
                if (i7 > 2147483639) {
                    i10 = Integer.MAX_VALUE;
                } else {
                    i10 = 2147483639;
                }
            }
            Object[] objArr2 = new Object[i10];
            e.c(0, this.f14472a, objArr.length, objArr, objArr2);
            Object[] objArr3 = this.f14473b;
            int length2 = objArr3.length;
            int i11 = this.f14472a;
            e.c(length2 - i11, 0, i11, objArr3, objArr2);
            this.f14472a = 0;
            this.f14473b = objArr2;
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    @Override
    public final int indexOf(Object obj) {
        int i7;
        int m10 = m(this.f14472a + this.f14474c);
        int i10 = this.f14472a;
        if (i10 < m10) {
            while (i10 < m10) {
                if (kotlin.jvm.internal.j.a(obj, this.f14473b[i10])) {
                    i7 = this.f14472a;
                } else {
                    i10++;
                }
            }
            return -1;
        } else if (i10 >= m10) {
            int length = this.f14473b.length;
            while (true) {
                if (i10 < length) {
                    if (kotlin.jvm.internal.j.a(obj, this.f14473b[i10])) {
                        i7 = this.f14472a;
                        break;
                    }
                    i10++;
                } else {
                    for (int i11 = 0; i11 < m10; i11++) {
                        if (kotlin.jvm.internal.j.a(obj, this.f14473b[i11])) {
                            i10 = i11 + this.f14473b.length;
                            i7 = this.f14472a;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i10 - i7;
    }

    @Override
    public final boolean isEmpty() {
        if (this.f14474c == 0) {
            return true;
        }
        return false;
    }

    public final int j(int i7) {
        Object[] objArr = this.f14473b;
        kotlin.jvm.internal.j.e(objArr, "<this>");
        if (i7 == objArr.length - 1) {
            return 0;
        }
        return i7 + 1;
    }

    public final int k(int i7) {
        if (i7 < 0) {
            return i7 + this.f14473b.length;
        }
        return i7;
    }

    public final void l(int i7, int i10) {
        if (i7 < i10) {
            e.e(i7, i10, this.f14473b);
            return;
        }
        Object[] objArr = this.f14473b;
        e.e(i7, objArr.length, objArr);
        e.e(0, i10, this.f14473b);
    }

    @Override
    public final int lastIndexOf(Object obj) {
        int length;
        int i7;
        int m10 = m(this.f14472a + this.f14474c);
        int i10 = this.f14472a;
        if (i10 < m10) {
            length = m10 - 1;
            if (i10 <= length) {
                while (!kotlin.jvm.internal.j.a(obj, this.f14473b[length])) {
                    if (length != i10) {
                        length--;
                    }
                }
                i7 = this.f14472a;
                return length - i7;
            }
            return -1;
        }
        if (i10 > m10) {
            int i11 = m10 - 1;
            while (true) {
                if (-1 < i11) {
                    if (kotlin.jvm.internal.j.a(obj, this.f14473b[i11])) {
                        length = i11 + this.f14473b.length;
                        i7 = this.f14472a;
                        break;
                    }
                    i11--;
                } else {
                    Object[] objArr = this.f14473b;
                    kotlin.jvm.internal.j.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i12 = this.f14472a;
                    if (i12 <= length) {
                        while (!kotlin.jvm.internal.j.a(obj, this.f14473b[length])) {
                            if (length != i12) {
                                length--;
                            }
                        }
                        i7 = this.f14472a;
                    }
                }
            }
        }
        return -1;
    }

    public final int m(int i7) {
        Object[] objArr = this.f14473b;
        if (i7 >= objArr.length) {
            return i7 - objArr.length;
        }
        return i7;
    }

    public final void n() {
        ((AbstractList) this).modCount++;
    }

    @Override
    public final Object remove(int i7) {
        int i10 = this.f14474c;
        if (i7 >= 0 && i7 < i10) {
            if (i7 == g.b(this)) {
                return removeLast();
            }
            if (i7 == 0) {
                return removeFirst();
            }
            n();
            int m10 = m(this.f14472a + i7);
            Object[] objArr = this.f14473b;
            Object obj = objArr[m10];
            if (i7 < (this.f14474c >> 1)) {
                int i11 = this.f14472a;
                if (m10 >= i11) {
                    e.c(i11 + 1, i11, m10, objArr, objArr);
                } else {
                    e.c(1, 0, m10, objArr, objArr);
                    Object[] objArr2 = this.f14473b;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i12 = this.f14472a;
                    e.c(i12 + 1, i12, objArr2.length - 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.f14473b;
                int i13 = this.f14472a;
                objArr3[i13] = null;
                this.f14472a = j(i13);
            } else {
                int m11 = m(g.b(this) + this.f14472a);
                if (m10 <= m11) {
                    Object[] objArr4 = this.f14473b;
                    e.c(m10, m10 + 1, m11 + 1, objArr4, objArr4);
                } else {
                    Object[] objArr5 = this.f14473b;
                    e.c(m10, m10 + 1, objArr5.length, objArr5, objArr5);
                    Object[] objArr6 = this.f14473b;
                    objArr6[objArr6.length - 1] = objArr6[0];
                    e.c(0, 1, m11 + 1, objArr6, objArr6);
                }
                this.f14473b[m11] = null;
            }
            this.f14474c--;
            return obj;
        }
        throw new IndexOutOfBoundsException(p0.m(i7, i10, "index: ", ", size: "));
    }

    @Override
    public final boolean removeAll(Collection elements) {
        int m10;
        kotlin.jvm.internal.j.e(elements, "elements");
        boolean z9 = false;
        z9 = false;
        z9 = false;
        if (!isEmpty() && this.f14473b.length != 0) {
            int m11 = m(this.f14472a + this.f14474c);
            int i7 = this.f14472a;
            if (i7 < m11) {
                m10 = i7;
                while (i7 < m11) {
                    Object obj = this.f14473b[i7];
                    if (!elements.contains(obj)) {
                        this.f14473b[m10] = obj;
                        m10++;
                    } else {
                        z9 = true;
                    }
                    i7++;
                }
                e.e(m10, m11, this.f14473b);
            } else {
                int length = this.f14473b.length;
                boolean z10 = false;
                int i10 = i7;
                while (i7 < length) {
                    Object[] objArr = this.f14473b;
                    Object obj2 = objArr[i7];
                    objArr[i7] = null;
                    if (!elements.contains(obj2)) {
                        this.f14473b[i10] = obj2;
                        i10++;
                    } else {
                        z10 = true;
                    }
                    i7++;
                }
                m10 = m(i10);
                for (int i11 = 0; i11 < m11; i11++) {
                    Object[] objArr2 = this.f14473b;
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (!elements.contains(obj3)) {
                        this.f14473b[m10] = obj3;
                        m10 = j(m10);
                    } else {
                        z10 = true;
                    }
                }
                z9 = z10;
            }
            if (z9) {
                n();
                this.f14474c = k(m10 - this.f14472a);
            }
        }
        return z9;
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            n();
            Object[] objArr = this.f14473b;
            int i7 = this.f14472a;
            Object obj = objArr[i7];
            objArr[i7] = null;
            this.f14472a = j(i7);
            this.f14474c--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            n();
            int m10 = m(g.b(this) + this.f14472a);
            Object[] objArr = this.f14473b;
            Object obj = objArr[m10];
            objArr[m10] = null;
            this.f14474c--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override
    public final void removeRange(int i7, int i10) {
        b0.a(i7, i10, this.f14474c);
        int i11 = i10 - i7;
        if (i11 == 0) {
            return;
        }
        if (i11 == this.f14474c) {
            clear();
        } else if (i11 == 1) {
            remove(i7);
        } else {
            n();
            if (i7 < this.f14474c - i10) {
                int m10 = m((i7 - 1) + this.f14472a);
                int m11 = m((i10 - 1) + this.f14472a);
                while (i7 > 0) {
                    int i12 = m10 + 1;
                    int min = Math.min(i7, Math.min(i12, m11 + 1));
                    Object[] objArr = this.f14473b;
                    int i13 = m11 - min;
                    int i14 = m10 - min;
                    e.c(i13 + 1, i14 + 1, i12, objArr, objArr);
                    m10 = k(i14);
                    m11 = k(i13);
                    i7 -= min;
                }
                int m12 = m(this.f14472a + i11);
                l(this.f14472a, m12);
                this.f14472a = m12;
            } else {
                int m13 = m(this.f14472a + i10);
                int m14 = m(this.f14472a + i7);
                int i15 = this.f14474c;
                while (true) {
                    i15 -= i10;
                    if (i15 <= 0) {
                        break;
                    }
                    Object[] objArr2 = this.f14473b;
                    i10 = Math.min(i15, Math.min(objArr2.length - m13, objArr2.length - m14));
                    Object[] objArr3 = this.f14473b;
                    int i16 = m13 + i10;
                    e.c(m14, m13, i16, objArr3, objArr3);
                    m13 = m(i16);
                    m14 = m(m14 + i10);
                }
                int m15 = m(this.f14472a + this.f14474c);
                l(k(m15 - i11), m15);
            }
            this.f14474c -= i11;
        }
    }

    @Override
    public final boolean retainAll(Collection elements) {
        int m10;
        kotlin.jvm.internal.j.e(elements, "elements");
        boolean z9 = false;
        z9 = false;
        z9 = false;
        if (!isEmpty() && this.f14473b.length != 0) {
            int m11 = m(this.f14472a + this.f14474c);
            int i7 = this.f14472a;
            if (i7 < m11) {
                m10 = i7;
                while (i7 < m11) {
                    Object obj = this.f14473b[i7];
                    if (elements.contains(obj)) {
                        this.f14473b[m10] = obj;
                        m10++;
                    } else {
                        z9 = true;
                    }
                    i7++;
                }
                e.e(m10, m11, this.f14473b);
            } else {
                int length = this.f14473b.length;
                boolean z10 = false;
                int i10 = i7;
                while (i7 < length) {
                    Object[] objArr = this.f14473b;
                    Object obj2 = objArr[i7];
                    objArr[i7] = null;
                    if (elements.contains(obj2)) {
                        this.f14473b[i10] = obj2;
                        i10++;
                    } else {
                        z10 = true;
                    }
                    i7++;
                }
                m10 = m(i10);
                for (int i11 = 0; i11 < m11; i11++) {
                    Object[] objArr2 = this.f14473b;
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (elements.contains(obj3)) {
                        this.f14473b[m10] = obj3;
                        m10 = j(m10);
                    } else {
                        z10 = true;
                    }
                }
                z9 = z10;
            }
            if (z9) {
                n();
                this.f14474c = k(m10 - this.f14472a);
            }
        }
        return z9;
    }

    @Override
    public final Object set(int i7, Object obj) {
        int i10 = this.f14474c;
        if (i7 >= 0 && i7 < i10) {
            int m10 = m(this.f14472a + i7);
            Object[] objArr = this.f14473b;
            Object obj2 = objArr[m10];
            objArr[m10] = obj;
            return obj2;
        }
        throw new IndexOutOfBoundsException(p0.m(i7, i10, "index: ", ", size: "));
    }

    @Override
    public final int size() {
        return this.f14474c;
    }

    @Override
    public final Object[] toArray() {
        return toArray(new Object[this.f14474c]);
    }

    @Override
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.j.e(array, "array");
        int length = array.length;
        int i7 = this.f14474c;
        if (length < i7) {
            Object newInstance = Array.newInstance(array.getClass().getComponentType(), i7);
            kotlin.jvm.internal.j.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) newInstance;
        }
        int m10 = m(this.f14472a + this.f14474c);
        int i10 = this.f14472a;
        if (i10 < m10) {
            e.d(i10, m10, 2, this.f14473b, array);
        } else if (!isEmpty()) {
            Object[] objArr = this.f14473b;
            e.c(0, this.f14472a, objArr.length, objArr, array);
            Object[] objArr2 = this.f14473b;
            e.c(objArr2.length - this.f14472a, 0, m10, objArr2, array);
        }
        int i11 = this.f14474c;
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
        i(elements.size() + this.f14474c);
        f(m(this.f14472a + this.f14474c), elements);
        return true;
    }
}
