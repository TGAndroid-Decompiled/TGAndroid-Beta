package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
public final class ks extends AbstractList implements List {
    public static final Object[] d = new Object[0];
    public int a;
    public Object[] b = d;
    public int c;

    @Override
    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.c;
        if (i >= 0 && i <= i3) {
            if (i == i3) {
                addLast(obj);
                return;
            } else if (i == 0) {
                addFirst(obj);
                return;
            } else {
                n();
                i(this.c + 1);
                int m = m(this.a + i);
                int i4 = this.c;
                if (i < ((i4 + 1) >> 1)) {
                    if (m == 0) {
                        Object[] objArr = this.b;
                        objArr.getClass();
                        i2 = objArr.length - 1;
                    } else {
                        i2 = m - 1;
                    }
                    int i5 = this.a;
                    if (i5 == 0) {
                        Object[] objArr2 = this.b;
                        objArr2.getClass();
                        i5 = objArr2.length;
                    }
                    int i6 = i5 - 1;
                    int i7 = this.a;
                    Object[] objArr3 = this.b;
                    if (i2 >= i7) {
                        objArr3[i6] = objArr3[i7];
                        ss.c(i7, i7 + 1, i2 + 1, objArr3, objArr3);
                    } else {
                        ss.c(i7 - 1, i7, objArr3.length, objArr3, objArr3);
                        Object[] objArr4 = this.b;
                        objArr4[objArr4.length - 1] = objArr4[0];
                        ss.c(0, 1, i2 + 1, objArr4, objArr4);
                    }
                    this.b[i2] = obj;
                    this.a = i6;
                } else {
                    int m2 = m(this.a + i4);
                    Object[] objArr5 = this.b;
                    if (m < m2) {
                        ss.c(m + 1, m, m2, objArr5, objArr5);
                    } else {
                        ss.c(1, 0, m2, objArr5, objArr5);
                        Object[] objArr6 = this.b;
                        objArr6[0] = objArr6[objArr6.length - 1];
                        ss.c(m + 1, m, objArr6.length - 1, objArr6, objArr6);
                    }
                    this.b[m] = obj;
                }
                this.c++;
                return;
            }
        }
        k93.i(b00.g(i, i3, "index: ", ", size: "));
    }

    @Override
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        int i2 = this.c;
        if (i >= 0 && i <= i2) {
            if (collection.isEmpty()) {
                return false;
            }
            if (i == this.c) {
                return addAll(collection);
            }
            n();
            i(collection.size() + this.c);
            int m = m(this.a + this.c);
            int m2 = m(this.a + i);
            int size = collection.size();
            if (i < ((this.c + 1) >> 1)) {
                int i3 = this.a;
                int i4 = i3 - size;
                Object[] objArr = this.b;
                if (m2 >= i3) {
                    if (i4 >= 0) {
                        ss.c(i4, i3, m2, objArr, objArr);
                    } else {
                        i4 += objArr.length;
                        int i5 = m2 - i3;
                        int length = objArr.length - i4;
                        if (length >= i5) {
                            ss.c(i4, i3, m2, objArr, objArr);
                        } else {
                            ss.c(i4, i3, i3 + length, objArr, objArr);
                            Object[] objArr2 = this.b;
                            ss.c(0, this.a + length, m2, objArr2, objArr2);
                        }
                    }
                } else {
                    ss.c(i4, i3, objArr.length, objArr, objArr);
                    Object[] objArr3 = this.b;
                    if (size >= m2) {
                        ss.c(objArr3.length - size, 0, m2, objArr3, objArr3);
                    } else {
                        ss.c(objArr3.length - size, 0, size, objArr3, objArr3);
                        Object[] objArr4 = this.b;
                        ss.c(0, size, m2, objArr4, objArr4);
                    }
                }
                this.a = i4;
                h(k(m2 - size), collection);
                return true;
            }
            int i6 = m2 + size;
            Object[] objArr5 = this.b;
            if (m2 < m) {
                int i7 = size + m;
                if (i7 <= objArr5.length) {
                    ss.c(i6, m2, m, objArr5, objArr5);
                } else if (i6 >= objArr5.length) {
                    ss.c(i6 - objArr5.length, m2, m, objArr5, objArr5);
                } else {
                    int length2 = m - (i7 - objArr5.length);
                    ss.c(0, length2, m, objArr5, objArr5);
                    Object[] objArr6 = this.b;
                    ss.c(i6, m2, length2, objArr6, objArr6);
                }
            } else {
                ss.c(size, 0, m, objArr5, objArr5);
                Object[] objArr7 = this.b;
                if (i6 >= objArr7.length) {
                    ss.c(i6 - objArr7.length, m2, objArr7.length, objArr7, objArr7);
                } else {
                    ss.c(0, objArr7.length - size, objArr7.length, objArr7, objArr7);
                    Object[] objArr8 = this.b;
                    ss.c(i6, m2, objArr8.length - size, objArr8, objArr8);
                }
            }
            h(m2, collection);
            return true;
        }
        k93.i(b00.g(i, i2, "index: ", ", size: "));
        return false;
    }

    public final void addFirst(Object obj) {
        n();
        i(this.c + 1);
        int i = this.a;
        if (i == 0) {
            Object[] objArr = this.b;
            objArr.getClass();
            i = objArr.length;
        }
        int i2 = i - 1;
        this.a = i2;
        this.b[i2] = obj;
        this.c++;
    }

    public final void addLast(Object obj) {
        n();
        i(this.c + 1);
        this.b[m(this.a + this.c)] = obj;
        this.c++;
    }

    @Override
    public final void clear() {
        if (!isEmpty()) {
            n();
            l(this.a, m(this.a + this.c));
        }
        this.a = 0;
        this.c = 0;
    }

    @Override
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override
    public final Object get(int i) {
        int i2 = this.c;
        if (i >= 0 && i < i2) {
            return this.b[m(this.a + i)];
        }
        k93.i(b00.g(i, i2, "index: ", ", size: "));
        return null;
    }

    public final void h(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.b.length;
        while (i < length && it.hasNext()) {
            this.b[i] = it.next();
            i++;
        }
        int i2 = this.a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.b[i3] = it.next();
        }
        this.c = collection.size() + this.c;
    }

    public final void i(int i) {
        if (i >= 0) {
            Object[] objArr = this.b;
            if (i <= objArr.length) {
                return;
            }
            if (objArr == d) {
                if (i < 10) {
                    i = 10;
                }
                this.b = new Object[i];
                return;
            }
            int length = objArr.length;
            int i2 = length + (length >> 1);
            if (i2 - i < 0) {
                i2 = i;
            }
            if (i2 - 2147483639 > 0) {
                if (i > 2147483639) {
                    i2 = Integer.MAX_VALUE;
                } else {
                    i2 = 2147483639;
                }
            }
            Object[] objArr2 = new Object[i2];
            ss.c(0, this.a, objArr.length, objArr, objArr2);
            Object[] objArr3 = this.b;
            int length2 = objArr3.length;
            int i3 = this.a;
            ss.c(length2 - i3, 0, i3, objArr3, objArr2);
            this.a = 0;
            this.b = objArr2;
            return;
        }
        sc8.j("Deque is too big.");
    }

    @Override
    public final int indexOf(Object obj) {
        int i;
        int m = m(this.a + this.c);
        int i2 = this.a;
        if (i2 < m) {
            while (i2 < m) {
                if (rp5.a(obj, this.b[i2])) {
                    i = this.a;
                } else {
                    i2++;
                }
            }
            return -1;
        } else if (i2 >= m) {
            int length = this.b.length;
            while (true) {
                if (i2 < length) {
                    if (rp5.a(obj, this.b[i2])) {
                        i = this.a;
                        break;
                    }
                    i2++;
                } else {
                    for (int i3 = 0; i3 < m; i3++) {
                        if (rp5.a(obj, this.b[i3])) {
                            i2 = i3 + this.b.length;
                            i = this.a;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i2 - i;
    }

    @Override
    public final boolean isEmpty() {
        if (this.c == 0) {
            return true;
        }
        return false;
    }

    public final int j(int i) {
        Object[] objArr = this.b;
        objArr.getClass();
        if (i == objArr.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final int k(int i) {
        if (i < 0) {
            return i + this.b.length;
        }
        return i;
    }

    public final void l(int i, int i2) {
        Object[] objArr = this.b;
        if (i < i2) {
            ss.e(i, i2, objArr);
            return;
        }
        Arrays.fill(objArr, i, objArr.length, (Object) null);
        ss.e(0, i2, this.b);
    }

    @Override
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int m = m(this.a + this.c);
        int i2 = this.a;
        if (i2 < m) {
            length = m - 1;
            if (i2 <= length) {
                while (!rp5.a(obj, this.b[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.a;
                return length - i;
            }
            return -1;
        }
        if (i2 > m) {
            while (true) {
                m--;
                Object[] objArr = this.b;
                if (-1 < m) {
                    if (rp5.a(obj, objArr[m])) {
                        length = m + this.b.length;
                        i = this.a;
                        break;
                    }
                } else {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i3 = this.a;
                    if (i3 <= length) {
                        while (!rp5.a(obj, this.b[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.a;
                    }
                }
            }
        }
        return -1;
    }

    public final int m(int i) {
        Object[] objArr = this.b;
        if (i >= objArr.length) {
            return i - objArr.length;
        }
        return i;
    }

    public final void n() {
        ((AbstractList) this).modCount++;
    }

    public final Object o(int i) {
        int i2 = this.c;
        if (i >= 0 && i < i2) {
            if (i == i2 - 1) {
                return removeLast();
            }
            if (i == 0) {
                return removeFirst();
            }
            n();
            int m = m(this.a + i);
            Object[] objArr = this.b;
            Object obj = objArr[m];
            int i3 = this.c;
            int i4 = i3 >> 1;
            int i5 = this.a;
            if (i < i4) {
                if (m >= i5) {
                    ss.c(i5 + 1, i5, m, objArr, objArr);
                } else {
                    ss.c(1, 0, m, objArr, objArr);
                    Object[] objArr2 = this.b;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i6 = this.a;
                    ss.c(i6 + 1, i6, objArr2.length - 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.b;
                int i7 = this.a;
                objArr3[i7] = null;
                this.a = j(i7);
            } else {
                int m2 = m((i3 - 1) + i5);
                Object[] objArr4 = this.b;
                int i8 = m + 1;
                if (m <= m2) {
                    ss.c(m, i8, m2 + 1, objArr4, objArr4);
                } else {
                    ss.c(m, i8, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.b;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    ss.c(0, 1, m2 + 1, objArr5, objArr5);
                }
                this.b[m2] = null;
            }
            this.c--;
            return obj;
        }
        k93.i(b00.g(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        o(indexOf);
        return true;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        int m;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int m2 = m(this.a + this.c);
            int i = this.a;
            if (i < m2) {
                m = i;
                while (true) {
                    objArr = this.b;
                    if (i >= m2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (!collection.contains(obj)) {
                        this.b[m] = obj;
                        m++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                ss.e(m, m2, objArr);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (!collection.contains(obj2)) {
                        this.b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                m = m(i2);
                for (int i3 = 0; i3 < m2; i3++) {
                    Object[] objArr3 = this.b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (!collection.contains(obj3)) {
                        this.b[m] = obj3;
                        m = j(m);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                n();
                this.c = k(m - this.a);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            n();
            Object[] objArr = this.b;
            int i = this.a;
            Object obj = objArr[i];
            objArr[i] = null;
            this.a = j(i);
            this.c--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            n();
            int m = m((size() - 1) + this.a);
            Object[] objArr = this.b;
            Object obj = objArr[m];
            objArr[m] = null;
            this.c--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override
    public final void removeRange(int i, int i2) {
        zkd.a(i, i2, this.c);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.c) {
            clear();
        } else if (i3 == 1) {
            o(i);
        } else {
            n();
            int i4 = this.c - i2;
            int i5 = this.a;
            if (i < i4) {
                int m = m((i - 1) + i5);
                int m2 = m(this.a + (i2 - 1));
                while (i > 0) {
                    int i6 = m + 1;
                    int min = Math.min(i, Math.min(i6, m2 + 1));
                    Object[] objArr = this.b;
                    int i7 = m2 - min;
                    int i8 = m - min;
                    ss.c(i7 + 1, i8 + 1, i6, objArr, objArr);
                    m = k(i8);
                    m2 = k(i7);
                    i -= min;
                }
                int m3 = m(this.a + i3);
                l(this.a, m3);
                this.a = m3;
            } else {
                int m4 = m(i5 + i2);
                int m5 = m(this.a + i);
                int i9 = this.c;
                while (true) {
                    i9 -= i2;
                    if (i9 <= 0) {
                        break;
                    }
                    Object[] objArr2 = this.b;
                    i2 = Math.min(i9, Math.min(objArr2.length - m4, objArr2.length - m5));
                    Object[] objArr3 = this.b;
                    int i10 = m4 + i2;
                    ss.c(m5, m4, i10, objArr3, objArr3);
                    m4 = m(i10);
                    m5 = m(m5 + i2);
                }
                int m6 = m(this.a + this.c);
                l(k(m6 - i3), m6);
            }
            this.c -= i3;
        }
    }

    @Override
    public final boolean retainAll(Collection collection) {
        int m;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int m2 = m(this.a + this.c);
            int i = this.a;
            if (i < m2) {
                m = i;
                while (true) {
                    objArr = this.b;
                    if (i >= m2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.b[m] = obj;
                        m++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                ss.e(m, m2, objArr);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                m = m(i2);
                for (int i3 = 0; i3 < m2; i3++) {
                    Object[] objArr3 = this.b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.b[m] = obj3;
                        m = j(m);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                n();
                this.c = k(m - this.a);
            }
        }
        return z;
    }

    @Override
    public final Object set(int i, Object obj) {
        int i2 = this.c;
        if (i >= 0 && i < i2) {
            int m = m(this.a + i);
            Object[] objArr = this.b;
            Object obj2 = objArr[m];
            objArr[m] = obj;
            return obj2;
        }
        k93.i(b00.g(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override
    public final int size() {
        return this.c;
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.c;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            newInstance.getClass();
            objArr = (Object[]) newInstance;
        }
        int m = m(this.a + this.c);
        int i2 = this.a;
        if (i2 < m) {
            ss.d(i2, m, 2, this.b, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.b;
            ss.c(0, this.a, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.b;
            ss.c(objArr3.length - this.a, 0, m, objArr3, objArr);
        }
        int i3 = this.c;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override
    public final Object remove(int i) {
        return o(i);
    }

    @Override
    public final Object[] toArray() {
        return toArray(new Object[this.c]);
    }

    @Override
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        n();
        i(collection.size() + this.c);
        h(m(this.a + this.c), collection);
        return true;
    }
}
