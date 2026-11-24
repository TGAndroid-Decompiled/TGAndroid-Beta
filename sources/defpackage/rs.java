package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public final class rs implements Collection, Set {
    public int[] a;
    public Object[] b;
    public int c;

    public rs(int i) {
        this.a = yp3.c;
        this.b = yp3.e;
        if (i > 0) {
            this.a = new int[i];
            this.b = new Object[i];
        }
    }

    @Override
    public final boolean add(Object obj) {
        int i;
        int a;
        int i2 = this.c;
        if (obj == null) {
            a = mmd.a(this, null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            a = mmd.a(this, obj, hashCode);
        }
        if (a >= 0) {
            return false;
        }
        int i3 = ~a;
        int[] iArr = this.a;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.b;
            int[] iArr2 = new int[i4];
            this.a = iArr2;
            this.b = new Object[i4];
            if (i2 == this.c) {
                if (iArr2.length != 0) {
                    ss.b(0, 0, iArr.length, iArr, iArr2);
                    ss.d(0, objArr.length, 6, objArr, this.b);
                }
            } else {
                zf.b();
                return false;
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.a;
            int i5 = i3 + 1;
            ss.b(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.b;
            ss.c(i5, i3, i2, objArr2, objArr2);
        }
        int i6 = this.c;
        if (i2 == i6) {
            int[] iArr4 = this.a;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.b[i3] = obj;
                this.c = i6 + 1;
                return true;
            }
        }
        zf.b();
        return false;
    }

    @Override
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.c;
        int i = this.c;
        int[] iArr = this.a;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.b;
            int[] iArr2 = new int[size];
            this.a = iArr2;
            this.b = new Object[size];
            if (i > 0) {
                ss.b(0, 0, i, iArr, iArr2);
                ss.d(0, this.c, 6, objArr, this.b);
            }
        }
        if (this.c == i) {
            for (Object obj : collection) {
                z |= add(obj);
            }
            return z;
        }
        zf.b();
        return false;
    }

    @Override
    public final void clear() {
        int i = this.c;
        if (i != 0) {
            this.a = yp3.c;
            this.b = yp3.e;
            i = 0;
            this.c = 0;
        }
        if (i == 0) {
            return;
        }
        zf.b();
    }

    @Override
    public final boolean contains(Object obj) {
        int a;
        if (obj == null) {
            a = mmd.a(this, null, 0);
        } else {
            a = mmd.a(this, obj, obj.hashCode());
        }
        if (a < 0) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.c;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.b[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final void h(int i) {
        int i2 = this.c;
        Object[] objArr = this.b;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return;
        }
        int i3 = i2 - 1;
        int[] iArr = this.a;
        int i4 = 8;
        if (iArr.length > 8 && i2 < iArr.length / 3) {
            if (i2 > 8) {
                i4 = i2 + (i2 >> 1);
            }
            int[] iArr2 = new int[i4];
            this.a = iArr2;
            this.b = new Object[i4];
            if (i > 0) {
                ss.b(0, 0, i, iArr, iArr2);
                ss.d(0, i, 6, objArr, this.b);
            }
            if (i < i3) {
                int i5 = i + 1;
                ss.b(i, i5, i2, iArr, this.a);
                ss.c(i, i5, i2, objArr, this.b);
            }
        } else {
            if (i < i3) {
                int i6 = i + 1;
                ss.b(i, i6, i2, iArr, iArr);
                Object[] objArr2 = this.b;
                ss.c(i, i6, i2, objArr2, objArr2);
            }
            this.b[i3] = null;
        }
        if (i2 == this.c) {
            this.c = i3;
        } else {
            zf.b();
        }
    }

    @Override
    public final int hashCode() {
        int[] iArr = this.a;
        int i = this.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override
    public final boolean isEmpty() {
        if (this.c <= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Iterator iterator() {
        return new ms(this);
    }

    @Override
    public final boolean remove(Object obj) {
        int a;
        if (obj == null) {
            a = mmd.a(this, null, 0);
        } else {
            a = mmd.a(this, obj, obj.hashCode());
        }
        if (a < 0) {
            return false;
        }
        h(a);
        return true;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (Object obj : collection) {
            z |= remove(obj);
        }
        return z;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        boolean z;
        collection.getClass();
        int i = this.c - 1;
        boolean z2 = false;
        while (true) {
            int i2 = -1;
            if (-1 < i) {
                Object obj = this.b[i];
                Collection collection2 = collection;
                if (collection2 instanceof Collection) {
                    z = collection2.contains(obj);
                } else {
                    if (collection2 instanceof List) {
                        i2 = ((List) collection2).indexOf(obj);
                    } else {
                        Iterator it = collection2.iterator();
                        int i3 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (i3 >= 0) {
                                if (rp5.a(obj, next)) {
                                    i2 = i3;
                                    break;
                                }
                                i3++;
                            } else {
                                throw new ArithmeticException("Index overflow has happened.");
                            }
                        }
                    }
                    if (i2 >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (!z) {
                    h(i);
                    z2 = true;
                }
                i--;
            } else {
                return z2;
            }
        }
    }

    @Override
    public final int size() {
        return this.c;
    }

    @Override
    public final Object[] toArray() {
        Object[] objArr = this.b;
        int i = this.c;
        objArr.getClass();
        int length = objArr.length;
        if (i <= length) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr, 0, i);
            copyOfRange.getClass();
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + length + ").");
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 14);
        sb.append('{');
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.b[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i = this.c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        ss.c(0, 0, this.c, this.b, objArr);
        return objArr;
    }
}
