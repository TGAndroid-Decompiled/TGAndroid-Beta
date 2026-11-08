package l9;

import a8.ia;
import c8.e1;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
public final class b extends AbstractList implements RandomAccess, Serializable {
    public final int[] f18206a;
    public final int f18207b;
    public final int f18208c;

    public b(int i7, int i10, int[] iArr) {
        this.f18206a = iArr;
        this.f18207b = i7;
        this.f18208c = i10;
    }

    @Override
    public final boolean contains(Object obj) {
        if ((obj instanceof Integer) && e1.d(((Integer) obj).intValue(), this.f18207b, this.f18208c, this.f18206a) != -1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            int size = size();
            if (bVar.size() != size) {
                return false;
            }
            for (int i7 = 0; i7 < size; i7++) {
                if (this.f18206a[this.f18207b + i7] != bVar.f18206a[bVar.f18207b + i7]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override
    public final Object get(int i7) {
        ia.j(i7, size());
        return Integer.valueOf(this.f18206a[this.f18207b + i7]);
    }

    @Override
    public final int hashCode() {
        int i7 = 1;
        for (int i10 = this.f18207b; i10 < this.f18208c; i10++) {
            i7 = (i7 * 31) + this.f18206a[i10];
        }
        return i7;
    }

    @Override
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i7 = this.f18208c;
            int i10 = this.f18207b;
            int d = e1.d(intValue, i10, i7, this.f18206a);
            if (d >= 0) {
                return d - i10;
            }
            return -1;
        }
        return -1;
    }

    @Override
    public final boolean isEmpty() {
        return false;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        int i7;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i10 = this.f18208c;
            while (true) {
                i10--;
                i7 = this.f18207b;
                if (i10 >= i7) {
                    if (this.f18206a[i10] == intValue) {
                        break;
                    }
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                return i10 - i7;
            }
        }
        return -1;
    }

    @Override
    public final Object set(int i7, Object obj) {
        Integer num = (Integer) obj;
        ia.j(i7, size());
        int i10 = this.f18207b + i7;
        int[] iArr = this.f18206a;
        int i11 = iArr[i10];
        num.getClass();
        iArr[i10] = num.intValue();
        return Integer.valueOf(i11);
    }

    @Override
    public final int size() {
        return this.f18208c - this.f18207b;
    }

    @Override
    public final List subList(int i7, int i10) {
        ia.n(i7, i10, size());
        if (i7 == i10) {
            return Collections.EMPTY_LIST;
        }
        int i11 = this.f18207b;
        return new b(i7 + i11, i11 + i10, this.f18206a);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(size() * 5);
        sb2.append('[');
        int[] iArr = this.f18206a;
        int i7 = this.f18207b;
        sb2.append(iArr[i7]);
        while (true) {
            i7++;
            if (i7 < this.f18208c) {
                sb2.append(", ");
                sb2.append(iArr[i7]);
            } else {
                sb2.append(']');
                return sb2.toString();
            }
        }
    }
}
