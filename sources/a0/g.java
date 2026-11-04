package a0;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public final class g implements Collection, Set {
    public int[] f14a = b0.a.f2320a;
    public Object[] f15b = b0.a.f2322c;
    public int f16c;

    public g(int i3) {
        if (i3 > 0) {
            i.a(this, i3);
        }
    }

    @Override
    public final boolean add(Object obj) {
        int i3;
        int b10;
        int i10 = this.f16c;
        if (obj == null) {
            b10 = i.b(this, null, 0);
            i3 = 0;
        } else {
            int hashCode = obj.hashCode();
            i3 = hashCode;
            b10 = i.b(this, obj, hashCode);
        }
        if (b10 >= 0) {
            return false;
        }
        int i11 = ~b10;
        int[] iArr = this.f14a;
        if (i10 >= iArr.length) {
            int i12 = 8;
            if (i10 >= 8) {
                i12 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i12 = 4;
            }
            Object[] objArr = this.f15b;
            int[] iArr2 = new int[i12];
            this.f14a = iArr2;
            this.f15b = new Object[i12];
            if (i10 == this.f16c) {
                if (iArr2.length != 0) {
                    ed.f.b(0, 0, iArr.length, iArr, iArr2);
                    ed.f.d(0, objArr.length, 6, objArr, this.f15b);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i11 < i10) {
            int[] iArr3 = this.f14a;
            int i13 = i11 + 1;
            ed.f.b(i13, i11, i10, iArr3, iArr3);
            Object[] objArr2 = this.f15b;
            ed.f.c(i13, i11, i10, objArr2, objArr2);
        }
        int i14 = this.f16c;
        if (i10 == i14) {
            int[] iArr4 = this.f14a;
            if (i11 < iArr4.length) {
                iArr4[i11] = i3;
                this.f15b[i11] = obj;
                this.f16c = i14 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.j.e(elements, "elements");
        int size = elements.size() + this.f16c;
        int i3 = this.f16c;
        int[] iArr = this.f14a;
        boolean z10 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f15b;
            int[] iArr2 = new int[size];
            this.f14a = iArr2;
            this.f15b = new Object[size];
            if (i3 > 0) {
                ed.f.b(0, 0, i3, iArr, iArr2);
                ed.f.d(0, this.f16c, 6, objArr, this.f15b);
            }
        }
        if (this.f16c == i3) {
            for (Object obj : elements) {
                z10 |= add(obj);
            }
            return z10;
        }
        throw new ConcurrentModificationException();
    }

    @Override
    public final void clear() {
        if (this.f16c != 0) {
            this.f14a = b0.a.f2320a;
            this.f15b = b0.a.f2322c;
            this.f16c = 0;
        }
        if (this.f16c == 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override
    public final boolean contains(Object obj) {
        int b10;
        if (obj == null) {
            b10 = i.b(this, null, 0);
        } else {
            b10 = i.b(this, obj, obj.hashCode());
        }
        if (b10 < 0) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.j.e(elements, "elements");
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
        if (!(obj instanceof Set) || this.f16c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i3 = this.f16c;
            for (int i10 = 0; i10 < i3; i10++) {
                if (!((Set) obj).contains(this.f15b[i10])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final void h(int i3) {
        int i10 = this.f16c;
        Object[] objArr = this.f15b;
        Object obj = objArr[i3];
        if (i10 <= 1) {
            clear();
            return;
        }
        int i11 = i10 - 1;
        int[] iArr = this.f14a;
        int i12 = 8;
        if (iArr.length > 8 && i10 < iArr.length / 3) {
            if (i10 > 8) {
                i12 = i10 + (i10 >> 1);
            }
            int[] iArr2 = new int[i12];
            this.f14a = iArr2;
            this.f15b = new Object[i12];
            if (i3 > 0) {
                ed.f.b(0, 0, i3, iArr, iArr2);
                ed.f.d(0, i3, 6, objArr, this.f15b);
            }
            if (i3 < i11) {
                int i13 = i3 + 1;
                ed.f.b(i3, i13, i10, iArr, this.f14a);
                ed.f.c(i3, i13, i10, objArr, this.f15b);
            }
        } else {
            if (i3 < i11) {
                int i14 = i3 + 1;
                ed.f.b(i3, i14, i10, iArr, iArr);
                Object[] objArr2 = this.f15b;
                ed.f.c(i3, i14, i10, objArr2, objArr2);
            }
            this.f15b[i11] = null;
        }
        if (i10 == this.f16c) {
            this.f16c = i11;
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override
    public final int hashCode() {
        int[] iArr = this.f14a;
        int i3 = this.f16c;
        int i10 = 0;
        for (int i11 = 0; i11 < i3; i11++) {
            i10 += iArr[i11];
        }
        return i10;
    }

    @Override
    public final boolean isEmpty() {
        if (this.f16c <= 0) {
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
            b10 = i.b(this, null, 0);
        } else {
            b10 = i.b(this, obj, obj.hashCode());
        }
        if (b10 < 0) {
            return false;
        }
        h(b10);
        return true;
    }

    @Override
    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.j.e(elements, "elements");
        boolean z10 = false;
        for (Object obj : elements) {
            z10 |= remove(obj);
        }
        return z10;
    }

    @Override
    public final boolean retainAll(Collection elements) {
        boolean z10;
        kotlin.jvm.internal.j.e(elements, "elements");
        int i3 = this.f16c - 1;
        boolean z11 = false;
        while (true) {
            int i10 = -1;
            if (-1 < i3) {
                Object obj = this.f15b[i3];
                Collection collection = elements;
                if (collection instanceof Collection) {
                    z10 = collection.contains(obj);
                } else {
                    if (collection instanceof List) {
                        i10 = ((List) collection).indexOf(obj);
                    } else {
                        Iterator it = collection.iterator();
                        int i11 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (i11 >= 0) {
                                if (kotlin.jvm.internal.j.a(obj, next)) {
                                    i10 = i11;
                                    break;
                                }
                                i11++;
                            } else {
                                throw new ArithmeticException("Index overflow has happened.");
                            }
                        }
                    }
                    if (i10 >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (!z10) {
                    h(i3);
                    z11 = true;
                }
                i3--;
            } else {
                return z11;
            }
        }
    }

    @Override
    public final int size() {
        return this.f16c;
    }

    @Override
    public final Object[] toArray() {
        Object[] objArr = this.f15b;
        int i3 = this.f16c;
        kotlin.jvm.internal.j.e(objArr, "<this>");
        int length = objArr.length;
        if (i3 <= length) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr, 0, i3);
            kotlin.jvm.internal.j.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + length + ").");
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f16c * 14);
        sb2.append('{');
        int i3 = this.f16c;
        for (int i10 = 0; i10 < i3; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f15b[i10];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        kotlin.jvm.internal.j.d(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    @Override
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.j.e(array, "array");
        int i3 = this.f16c;
        if (array.length < i3) {
            array = (Object[]) Array.newInstance(array.getClass().getComponentType(), i3);
        } else if (array.length > i3) {
            array[i3] = null;
        }
        ed.f.c(0, 0, this.f16c, this.f15b, array);
        return array;
    }
}
