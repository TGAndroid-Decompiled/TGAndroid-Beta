package a0;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public final class g implements Collection, Set {
    public int[] f11a = b0.a.f1576a;
    public Object[] f12b = b0.a.f1578c;
    public int f13c;

    public g(int i10) {
        if (i10 > 0) {
            j.a(this, i10);
        }
    }

    @Override
    public final boolean add(Object obj) {
        int i10;
        int b10;
        int i11 = this.f13c;
        if (obj == null) {
            b10 = j.b(this, null, 0);
            i10 = 0;
        } else {
            int hashCode = obj.hashCode();
            i10 = hashCode;
            b10 = j.b(this, obj, hashCode);
        }
        if (b10 >= 0) {
            return false;
        }
        int i12 = ~b10;
        int[] iArr = this.f11a;
        if (i11 >= iArr.length) {
            int i13 = 8;
            if (i11 >= 8) {
                i13 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.f12b;
            int[] iArr2 = new int[i13];
            this.f11a = iArr2;
            this.f12b = new Object[i13];
            if (i11 == this.f13c) {
                if (iArr2.length != 0) {
                    hd.f.b(0, 0, iArr.length, iArr, iArr2);
                    hd.f.d(0, objArr.length, 6, objArr, this.f12b);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i11) {
            int[] iArr3 = this.f11a;
            int i14 = i12 + 1;
            hd.f.b(i14, i12, i11, iArr3, iArr3);
            Object[] objArr2 = this.f12b;
            hd.f.c(i14, i12, i11, objArr2, objArr2);
        }
        int i15 = this.f13c;
        if (i11 == i15) {
            int[] iArr4 = this.f11a;
            if (i12 < iArr4.length) {
                iArr4[i12] = i10;
                this.f12b[i12] = obj;
                this.f13c = i15 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        int size = elements.size() + this.f13c;
        int i10 = this.f13c;
        int[] iArr = this.f11a;
        boolean z10 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f12b;
            int[] iArr2 = new int[size];
            this.f11a = iArr2;
            this.f12b = new Object[size];
            if (i10 > 0) {
                hd.f.b(0, 0, i10, iArr, iArr2);
                hd.f.d(0, this.f13c, 6, objArr, this.f12b);
            }
        }
        if (this.f13c == i10) {
            for (Object obj : elements) {
                z10 |= add(obj);
            }
            return z10;
        }
        throw new ConcurrentModificationException();
    }

    @Override
    public final void clear() {
        if (this.f13c != 0) {
            this.f11a = b0.a.f1576a;
            this.f12b = b0.a.f1578c;
            this.f13c = 0;
        }
        if (this.f13c == 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override
    public final boolean contains(Object obj) {
        int b10;
        if (obj == null) {
            b10 = j.b(this, null, 0);
        } else {
            b10 = j.b(this, obj, obj.hashCode());
        }
        if (b10 < 0) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        for (Object obj : elements) {
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
        if (!(obj instanceof Set) || this.f13c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i10 = this.f13c;
            for (int i11 = 0; i11 < i10; i11++) {
                if (!((Set) obj).contains(this.f12b[i11])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override
    public final int hashCode() {
        int[] iArr = this.f11a;
        int i10 = this.f13c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public final void i(int i10) {
        int i11 = this.f13c;
        Object[] objArr = this.f12b;
        Object obj = objArr[i10];
        if (i11 <= 1) {
            clear();
            return;
        }
        int i12 = i11 - 1;
        int[] iArr = this.f11a;
        int i13 = 8;
        if (iArr.length > 8 && i11 < iArr.length / 3) {
            if (i11 > 8) {
                i13 = i11 + (i11 >> 1);
            }
            int[] iArr2 = new int[i13];
            this.f11a = iArr2;
            this.f12b = new Object[i13];
            if (i10 > 0) {
                hd.f.b(0, 0, i10, iArr, iArr2);
                hd.f.d(0, i10, 6, objArr, this.f12b);
            }
            if (i10 < i12) {
                int i14 = i10 + 1;
                hd.f.b(i10, i14, i11, iArr, this.f11a);
                hd.f.c(i10, i14, i11, objArr, this.f12b);
            }
        } else {
            if (i10 < i12) {
                int i15 = i10 + 1;
                hd.f.b(i10, i15, i11, iArr, iArr);
                Object[] objArr2 = this.f12b;
                hd.f.c(i10, i15, i11, objArr2, objArr2);
            }
            this.f12b[i12] = null;
        }
        if (i11 == this.f13c) {
            this.f13c = i12;
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override
    public final boolean isEmpty() {
        if (this.f13c <= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Iterator iterator() {
        return new b(this);
    }

    @Override
    public final boolean remove(Object obj) {
        int b10;
        if (obj == null) {
            b10 = j.b(this, null, 0);
        } else {
            b10 = j.b(this, obj, obj.hashCode());
        }
        if (b10 < 0) {
            return false;
        }
        i(b10);
        return true;
    }

    @Override
    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        boolean z10 = false;
        for (Object obj : elements) {
            z10 |= remove(obj);
        }
        return z10;
    }

    @Override
    public final boolean retainAll(Collection elements) {
        boolean z10;
        kotlin.jvm.internal.i.e(elements, "elements");
        int i10 = this.f13c - 1;
        boolean z11 = false;
        while (true) {
            int i11 = -1;
            if (-1 < i10) {
                Object obj = this.f12b[i10];
                Collection collection = elements;
                if (collection instanceof Collection) {
                    z10 = collection.contains(obj);
                } else {
                    if (collection instanceof List) {
                        i11 = ((List) collection).indexOf(obj);
                    } else {
                        Iterator it = collection.iterator();
                        int i12 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (i12 >= 0) {
                                if (kotlin.jvm.internal.i.a(obj, next)) {
                                    i11 = i12;
                                    break;
                                }
                                i12++;
                            } else {
                                throw new ArithmeticException("Index overflow has happened.");
                            }
                        }
                    }
                    if (i11 >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (!z10) {
                    i(i10);
                    z11 = true;
                }
                i10--;
            } else {
                return z11;
            }
        }
    }

    @Override
    public final int size() {
        return this.f13c;
    }

    @Override
    public final Object[] toArray() {
        Object[] objArr = this.f12b;
        int i10 = this.f13c;
        kotlin.jvm.internal.i.e(objArr, "<this>");
        int length = objArr.length;
        if (i10 <= length) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr, 0, i10);
            kotlin.jvm.internal.i.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is greater than size (" + length + ").");
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f13c * 14);
        sb2.append('{');
        int i10 = this.f13c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f12b[i11];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.d(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    @Override
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.i.e(array, "array");
        int i10 = this.f13c;
        if (array.length < i10) {
            array = (Object[]) Array.newInstance(array.getClass().getComponentType(), i10);
        } else if (array.length > i10) {
            array[i10] = null;
        }
        hd.f.c(0, 0, this.f13c, this.f12b, array);
        return array;
    }
}
