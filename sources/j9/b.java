package j9;

import a8.ed;
import a8.yb;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
public final class b extends AbstractList implements RandomAccess, Serializable {
    public final int[] f15541a;
    public final int f15542b;
    public final int f15543c;

    public b(int i10, int i11, int[] iArr) {
        this.f15541a = iArr;
        this.f15542b = i10;
        this.f15543c = i11;
    }

    @Override
    public final boolean contains(Object obj) {
        if ((obj instanceof Integer) && ed.d(((Integer) obj).intValue(), this.f15542b, this.f15543c, this.f15541a) != -1) {
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
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f15541a[this.f15542b + i10] != bVar.f15541a[bVar.f15542b + i10]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override
    public final Object get(int i10) {
        yb.j(i10, size());
        return Integer.valueOf(this.f15541a[this.f15542b + i10]);
    }

    @Override
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = this.f15542b; i11 < this.f15543c; i11++) {
            i10 = (i10 * 31) + this.f15541a[i11];
        }
        return i10;
    }

    @Override
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i10 = this.f15543c;
            int i11 = this.f15542b;
            int d = ed.d(intValue, i11, i10, this.f15541a);
            if (d >= 0) {
                return d - i11;
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
        int i10;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i11 = this.f15543c;
            while (true) {
                i11--;
                i10 = this.f15542b;
                if (i11 >= i10) {
                    if (this.f15541a[i11] == intValue) {
                        break;
                    }
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0) {
                return i11 - i10;
            }
        }
        return -1;
    }

    @Override
    public final Object set(int i10, Object obj) {
        Integer num = (Integer) obj;
        yb.j(i10, size());
        int i11 = this.f15542b + i10;
        int[] iArr = this.f15541a;
        int i12 = iArr[i11];
        num.getClass();
        iArr[i11] = num.intValue();
        return Integer.valueOf(i12);
    }

    @Override
    public final int size() {
        return this.f15543c - this.f15542b;
    }

    @Override
    public final List subList(int i10, int i11) {
        yb.n(i10, i11, size());
        if (i10 == i11) {
            return Collections.EMPTY_LIST;
        }
        int i12 = this.f15542b;
        return new b(i10 + i12, i12 + i11, this.f15541a);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(size() * 5);
        sb2.append('[');
        int[] iArr = this.f15541a;
        int i10 = this.f15542b;
        sb2.append(iArr[i10]);
        while (true) {
            i10++;
            if (i10 < this.f15543c) {
                sb2.append(", ");
                sb2.append(iArr[i10]);
            } else {
                sb2.append(']');
                return sb2.toString();
            }
        }
    }
}
