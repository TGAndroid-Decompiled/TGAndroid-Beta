package jd;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import v7.s8;
public final class e extends AbstractList implements List {
    public static final Object[] d = new Object[0];
    public int f14381a;
    public Object[] f14382b = d;
    public int f14383c;

    @Override
    public final void add(int i10, Object obj) {
        int i11;
        int i12 = this.f14383c;
        if (i10 < 0 || i10 > i12) {
            throw new IndexOutOfBoundsException(a1.g.l(i10, i12, "index: ", ", size: "));
        }
        if (i10 == i12) {
            addLast(obj);
        } else if (i10 == 0) {
            addFirst(obj);
        } else {
            r();
            m(this.f14383c + 1);
            int q6 = q(this.f14381a + i10);
            int i13 = this.f14383c;
            if (i10 < ((i13 + 1) >> 1)) {
                if (q6 == 0) {
                    Object[] objArr = this.f14382b;
                    kotlin.jvm.internal.i.e(objArr, "<this>");
                    q6 = objArr.length;
                }
                int i14 = q6 - 1;
                int i15 = this.f14381a;
                if (i15 == 0) {
                    Object[] objArr2 = this.f14382b;
                    kotlin.jvm.internal.i.e(objArr2, "<this>");
                    i11 = objArr2.length - 1;
                } else {
                    i11 = i15 - 1;
                }
                int i16 = this.f14381a;
                if (i14 >= i16) {
                    Object[] objArr3 = this.f14382b;
                    objArr3[i11] = objArr3[i16];
                    f.c(i16, i16 + 1, i14 + 1, objArr3, objArr3);
                } else {
                    Object[] objArr4 = this.f14382b;
                    f.c(i16 - 1, i16, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f14382b;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    f.c(0, 1, i14 + 1, objArr5, objArr5);
                }
                this.f14382b[i14] = obj;
                this.f14381a = i11;
            } else {
                int q10 = q(this.f14381a + i13);
                if (q6 < q10) {
                    Object[] objArr6 = this.f14382b;
                    f.c(q6 + 1, q6, q10, objArr6, objArr6);
                } else {
                    Object[] objArr7 = this.f14382b;
                    f.c(1, 0, q10, objArr7, objArr7);
                    Object[] objArr8 = this.f14382b;
                    objArr8[0] = objArr8[objArr8.length - 1];
                    f.c(q6 + 1, q6, objArr8.length - 1, objArr8, objArr8);
                }
                this.f14382b[q6] = obj;
            }
            this.f14383c++;
        }
    }

    @Override
    public final boolean addAll(int i10, Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        int i11 = this.f14383c;
        if (i10 >= 0 && i10 <= i11) {
            if (elements.isEmpty()) {
                return false;
            }
            if (i10 == this.f14383c) {
                return addAll(elements);
            }
            r();
            m(elements.size() + this.f14383c);
            int q6 = q(this.f14381a + this.f14383c);
            int q10 = q(this.f14381a + i10);
            int size = elements.size();
            if (i10 < ((this.f14383c + 1) >> 1)) {
                int i12 = this.f14381a;
                int i13 = i12 - size;
                if (q10 < i12) {
                    Object[] objArr = this.f14382b;
                    f.c(i13, i12, objArr.length, objArr, objArr);
                    if (size >= q10) {
                        Object[] objArr2 = this.f14382b;
                        f.c(objArr2.length - size, 0, q10, objArr2, objArr2);
                    } else {
                        Object[] objArr3 = this.f14382b;
                        f.c(objArr3.length - size, 0, size, objArr3, objArr3);
                        Object[] objArr4 = this.f14382b;
                        f.c(0, size, q10, objArr4, objArr4);
                    }
                } else if (i13 >= 0) {
                    Object[] objArr5 = this.f14382b;
                    f.c(i13, i12, q10, objArr5, objArr5);
                } else {
                    Object[] objArr6 = this.f14382b;
                    i13 += objArr6.length;
                    int i14 = q10 - i12;
                    int length = objArr6.length - i13;
                    if (length >= i14) {
                        f.c(i13, i12, q10, objArr6, objArr6);
                    } else {
                        f.c(i13, i12, i12 + length, objArr6, objArr6);
                        Object[] objArr7 = this.f14382b;
                        f.c(0, this.f14381a + length, q10, objArr7, objArr7);
                    }
                }
                this.f14381a = i13;
                h(o(q10 - size), elements);
                return true;
            }
            int i15 = q10 + size;
            if (q10 < q6) {
                int i16 = size + q6;
                Object[] objArr8 = this.f14382b;
                if (i16 <= objArr8.length) {
                    f.c(i15, q10, q6, objArr8, objArr8);
                } else if (i15 >= objArr8.length) {
                    f.c(i15 - objArr8.length, q10, q6, objArr8, objArr8);
                } else {
                    int length2 = q6 - (i16 - objArr8.length);
                    f.c(0, length2, q6, objArr8, objArr8);
                    Object[] objArr9 = this.f14382b;
                    f.c(i15, q10, length2, objArr9, objArr9);
                }
            } else {
                Object[] objArr10 = this.f14382b;
                f.c(size, 0, q6, objArr10, objArr10);
                Object[] objArr11 = this.f14382b;
                if (i15 >= objArr11.length) {
                    f.c(i15 - objArr11.length, q10, objArr11.length, objArr11, objArr11);
                } else {
                    f.c(0, objArr11.length - size, objArr11.length, objArr11, objArr11);
                    Object[] objArr12 = this.f14382b;
                    f.c(i15, q10, objArr12.length - size, objArr12, objArr12);
                }
            }
            h(q10, elements);
            return true;
        }
        throw new IndexOutOfBoundsException(a1.g.l(i10, i11, "index: ", ", size: "));
    }

    public final void addFirst(Object obj) {
        r();
        m(this.f14383c + 1);
        int i10 = this.f14381a;
        if (i10 == 0) {
            Object[] objArr = this.f14382b;
            kotlin.jvm.internal.i.e(objArr, "<this>");
            i10 = objArr.length;
        }
        int i11 = i10 - 1;
        this.f14381a = i11;
        this.f14382b[i11] = obj;
        this.f14383c++;
    }

    public final void addLast(Object obj) {
        r();
        m(this.f14383c + 1);
        this.f14382b[q(this.f14381a + this.f14383c)] = obj;
        this.f14383c++;
    }

    @Override
    public final void clear() {
        if (!isEmpty()) {
            r();
            p(this.f14381a, q(this.f14381a + this.f14383c));
        }
        this.f14381a = 0;
        this.f14383c = 0;
    }

    @Override
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override
    public final Object get(int i10) {
        int i11 = this.f14383c;
        if (i10 >= 0 && i10 < i11) {
            return this.f14382b[q(this.f14381a + i10)];
        }
        throw new IndexOutOfBoundsException(a1.g.l(i10, i11, "index: ", ", size: "));
    }

    public final void h(int i10, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f14382b.length;
        while (i10 < length && it.hasNext()) {
            this.f14382b[i10] = it.next();
            i10++;
        }
        int i11 = this.f14381a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f14382b[i12] = it.next();
        }
        this.f14383c = collection.size() + this.f14383c;
    }

    @Override
    public final int indexOf(Object obj) {
        int i10;
        int q6 = q(this.f14381a + this.f14383c);
        int i11 = this.f14381a;
        if (i11 < q6) {
            while (i11 < q6) {
                if (kotlin.jvm.internal.i.a(obj, this.f14382b[i11])) {
                    i10 = this.f14381a;
                } else {
                    i11++;
                }
            }
            return -1;
        } else if (i11 >= q6) {
            int length = this.f14382b.length;
            while (true) {
                if (i11 < length) {
                    if (kotlin.jvm.internal.i.a(obj, this.f14382b[i11])) {
                        i10 = this.f14381a;
                        break;
                    }
                    i11++;
                } else {
                    for (int i12 = 0; i12 < q6; i12++) {
                        if (kotlin.jvm.internal.i.a(obj, this.f14382b[i12])) {
                            i11 = i12 + this.f14382b.length;
                            i10 = this.f14381a;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i11 - i10;
    }

    @Override
    public final boolean isEmpty() {
        if (this.f14383c == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        int length;
        int i10;
        int q6 = q(this.f14381a + this.f14383c);
        int i11 = this.f14381a;
        if (i11 < q6) {
            length = q6 - 1;
            if (i11 <= length) {
                while (!kotlin.jvm.internal.i.a(obj, this.f14382b[length])) {
                    if (length != i11) {
                        length--;
                    }
                }
                i10 = this.f14381a;
                return length - i10;
            }
            return -1;
        }
        if (i11 > q6) {
            int i12 = q6 - 1;
            while (true) {
                if (-1 < i12) {
                    if (kotlin.jvm.internal.i.a(obj, this.f14382b[i12])) {
                        length = i12 + this.f14382b.length;
                        i10 = this.f14381a;
                        break;
                    }
                    i12--;
                } else {
                    Object[] objArr = this.f14382b;
                    kotlin.jvm.internal.i.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i13 = this.f14381a;
                    if (i13 <= length) {
                        while (!kotlin.jvm.internal.i.a(obj, this.f14382b[length])) {
                            if (length != i13) {
                                length--;
                            }
                        }
                        i10 = this.f14381a;
                    }
                }
            }
        }
        return -1;
    }

    public final void m(int i10) {
        if (i10 >= 0) {
            Object[] objArr = this.f14382b;
            if (i10 <= objArr.length) {
                return;
            }
            if (objArr == d) {
                if (i10 < 10) {
                    i10 = 10;
                }
                this.f14382b = new Object[i10];
                return;
            }
            int length = objArr.length;
            int i11 = length + (length >> 1);
            if (i11 - i10 < 0) {
                i11 = i10;
            }
            if (i11 - 2147483639 > 0) {
                if (i10 > 2147483639) {
                    i11 = Integer.MAX_VALUE;
                } else {
                    i11 = 2147483639;
                }
            }
            Object[] objArr2 = new Object[i11];
            f.c(0, this.f14381a, objArr.length, objArr, objArr2);
            Object[] objArr3 = this.f14382b;
            int length2 = objArr3.length;
            int i12 = this.f14381a;
            f.c(length2 - i12, 0, i12, objArr3, objArr2);
            this.f14381a = 0;
            this.f14382b = objArr2;
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final int n(int i10) {
        Object[] objArr = this.f14382b;
        kotlin.jvm.internal.i.e(objArr, "<this>");
        if (i10 == objArr.length - 1) {
            return 0;
        }
        return i10 + 1;
    }

    public final int o(int i10) {
        if (i10 < 0) {
            return i10 + this.f14382b.length;
        }
        return i10;
    }

    public final void p(int i10, int i11) {
        if (i10 < i11) {
            f.e(i10, i11, this.f14382b);
            return;
        }
        Object[] objArr = this.f14382b;
        f.e(i10, objArr.length, objArr);
        f.e(0, i11, this.f14382b);
    }

    public final int q(int i10) {
        Object[] objArr = this.f14382b;
        if (i10 >= objArr.length) {
            return i10 - objArr.length;
        }
        return i10;
    }

    public final void r() {
        ((AbstractList) this).modCount++;
    }

    @Override
    public final Object remove(int i10) {
        int i11 = this.f14383c;
        if (i10 >= 0 && i10 < i11) {
            if (i10 == h.a(this)) {
                return removeLast();
            }
            if (i10 == 0) {
                return removeFirst();
            }
            r();
            int q6 = q(this.f14381a + i10);
            Object[] objArr = this.f14382b;
            Object obj = objArr[q6];
            if (i10 < (this.f14383c >> 1)) {
                int i12 = this.f14381a;
                if (q6 >= i12) {
                    f.c(i12 + 1, i12, q6, objArr, objArr);
                } else {
                    f.c(1, 0, q6, objArr, objArr);
                    Object[] objArr2 = this.f14382b;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i13 = this.f14381a;
                    f.c(i13 + 1, i13, objArr2.length - 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.f14382b;
                int i14 = this.f14381a;
                objArr3[i14] = null;
                this.f14381a = n(i14);
            } else {
                int q10 = q(h.a(this) + this.f14381a);
                if (q6 <= q10) {
                    Object[] objArr4 = this.f14382b;
                    f.c(q6, q6 + 1, q10 + 1, objArr4, objArr4);
                } else {
                    Object[] objArr5 = this.f14382b;
                    f.c(q6, q6 + 1, objArr5.length, objArr5, objArr5);
                    Object[] objArr6 = this.f14382b;
                    objArr6[objArr6.length - 1] = objArr6[0];
                    f.c(0, 1, q10 + 1, objArr6, objArr6);
                }
                this.f14382b[q10] = null;
            }
            this.f14383c--;
            return obj;
        }
        throw new IndexOutOfBoundsException(a1.g.l(i10, i11, "index: ", ", size: "));
    }

    @Override
    public final boolean removeAll(Collection elements) {
        int q6;
        kotlin.jvm.internal.i.e(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f14382b.length != 0) {
            int q10 = q(this.f14381a + this.f14383c);
            int i10 = this.f14381a;
            if (i10 < q10) {
                q6 = i10;
                while (i10 < q10) {
                    Object obj = this.f14382b[i10];
                    if (!elements.contains(obj)) {
                        this.f14382b[q6] = obj;
                        q6++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                f.e(q6, q10, this.f14382b);
            } else {
                int length = this.f14382b.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f14382b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (!elements.contains(obj2)) {
                        this.f14382b[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                q6 = q(i11);
                for (int i12 = 0; i12 < q10; i12++) {
                    Object[] objArr2 = this.f14382b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (!elements.contains(obj3)) {
                        this.f14382b[q6] = obj3;
                        q6 = n(q6);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                r();
                this.f14383c = o(q6 - this.f14381a);
            }
        }
        return z10;
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            r();
            Object[] objArr = this.f14382b;
            int i10 = this.f14381a;
            Object obj = objArr[i10];
            objArr[i10] = null;
            this.f14381a = n(i10);
            this.f14383c--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            r();
            int q6 = q(h.a(this) + this.f14381a);
            Object[] objArr = this.f14382b;
            Object obj = objArr[q6];
            objArr[q6] = null;
            this.f14383c--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override
    public final void removeRange(int i10, int i11) {
        s8.a(i10, i11, this.f14383c);
        int i12 = i11 - i10;
        if (i12 == 0) {
            return;
        }
        if (i12 == this.f14383c) {
            clear();
        } else if (i12 == 1) {
            remove(i10);
        } else {
            r();
            if (i10 < this.f14383c - i11) {
                int q6 = q((i10 - 1) + this.f14381a);
                int q10 = q((i11 - 1) + this.f14381a);
                while (i10 > 0) {
                    int i13 = q6 + 1;
                    int min = Math.min(i10, Math.min(i13, q10 + 1));
                    Object[] objArr = this.f14382b;
                    int i14 = q10 - min;
                    int i15 = q6 - min;
                    f.c(i14 + 1, i15 + 1, i13, objArr, objArr);
                    q6 = o(i15);
                    q10 = o(i14);
                    i10 -= min;
                }
                int q11 = q(this.f14381a + i12);
                p(this.f14381a, q11);
                this.f14381a = q11;
            } else {
                int q12 = q(this.f14381a + i11);
                int q13 = q(this.f14381a + i10);
                int i16 = this.f14383c;
                while (true) {
                    i16 -= i11;
                    if (i16 <= 0) {
                        break;
                    }
                    Object[] objArr2 = this.f14382b;
                    i11 = Math.min(i16, Math.min(objArr2.length - q12, objArr2.length - q13));
                    Object[] objArr3 = this.f14382b;
                    int i17 = q12 + i11;
                    f.c(q13, q12, i17, objArr3, objArr3);
                    q12 = q(i17);
                    q13 = q(q13 + i11);
                }
                int q14 = q(this.f14381a + this.f14383c);
                p(o(q14 - i12), q14);
            }
            this.f14383c -= i12;
        }
    }

    @Override
    public final boolean retainAll(Collection elements) {
        int q6;
        kotlin.jvm.internal.i.e(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f14382b.length != 0) {
            int q10 = q(this.f14381a + this.f14383c);
            int i10 = this.f14381a;
            if (i10 < q10) {
                q6 = i10;
                while (i10 < q10) {
                    Object obj = this.f14382b[i10];
                    if (elements.contains(obj)) {
                        this.f14382b[q6] = obj;
                        q6++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                f.e(q6, q10, this.f14382b);
            } else {
                int length = this.f14382b.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f14382b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        this.f14382b[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                q6 = q(i11);
                for (int i12 = 0; i12 < q10; i12++) {
                    Object[] objArr2 = this.f14382b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        this.f14382b[q6] = obj3;
                        q6 = n(q6);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                r();
                this.f14383c = o(q6 - this.f14381a);
            }
        }
        return z10;
    }

    @Override
    public final Object set(int i10, Object obj) {
        int i11 = this.f14383c;
        if (i10 >= 0 && i10 < i11) {
            int q6 = q(this.f14381a + i10);
            Object[] objArr = this.f14382b;
            Object obj2 = objArr[q6];
            objArr[q6] = obj;
            return obj2;
        }
        throw new IndexOutOfBoundsException(a1.g.l(i10, i11, "index: ", ", size: "));
    }

    @Override
    public final int size() {
        return this.f14383c;
    }

    @Override
    public final Object[] toArray() {
        return toArray(new Object[this.f14383c]);
    }

    @Override
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.i.e(array, "array");
        int length = array.length;
        int i10 = this.f14383c;
        if (length < i10) {
            Object newInstance = Array.newInstance(array.getClass().getComponentType(), i10);
            kotlin.jvm.internal.i.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) newInstance;
        }
        int q6 = q(this.f14381a + this.f14383c);
        int i11 = this.f14381a;
        if (i11 < q6) {
            f.d(i11, q6, 2, this.f14382b, array);
        } else if (!isEmpty()) {
            Object[] objArr = this.f14382b;
            f.c(0, this.f14381a, objArr.length, objArr, array);
            Object[] objArr2 = this.f14382b;
            f.c(objArr2.length - this.f14381a, 0, q6, objArr2, array);
        }
        int i12 = this.f14383c;
        if (i12 < array.length) {
            array[i12] = null;
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
        kotlin.jvm.internal.i.e(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        r();
        m(elements.size() + this.f14383c);
        h(q(this.f14381a + this.f14383c), elements);
        return true;
    }
}
