package h9;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import v7.t6;
import v7.x7;
public final class b extends AbstractList implements RandomAccess, Serializable {
    public final int[] f10917a;
    public final int f10918b;
    public final int f10919c;

    public b(int i10, int i11, int[] iArr) {
        this.f10917a = iArr;
        this.f10918b = i10;
        this.f10919c = i11;
    }

    @Override
    public final boolean contains(Object obj) {
        if ((obj instanceof Integer) && x7.d(((Integer) obj).intValue(), this.f10918b, this.f10919c, this.f10917a) != -1) {
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
                if (this.f10917a[this.f10918b + i10] != bVar.f10917a[bVar.f10918b + i10]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override
    public final Object get(int i10) {
        t6.c(i10, size());
        return Integer.valueOf(this.f10917a[this.f10918b + i10]);
    }

    @Override
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = this.f10918b; i11 < this.f10919c; i11++) {
            i10 = (i10 * 31) + this.f10917a[i11];
        }
        return i10;
    }

    @Override
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i10 = this.f10919c;
            int i11 = this.f10918b;
            int d = x7.d(intValue, i11, i10, this.f10917a);
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
            int i11 = this.f10919c;
            while (true) {
                i11--;
                i10 = this.f10918b;
                if (i11 >= i10) {
                    if (this.f10917a[i11] == intValue) {
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
        t6.c(i10, size());
        int i11 = this.f10918b + i10;
        int[] iArr = this.f10917a;
        int i12 = iArr[i11];
        num.getClass();
        iArr[i11] = num.intValue();
        return Integer.valueOf(i12);
    }

    @Override
    public final int size() {
        return this.f10919c - this.f10918b;
    }

    @Override
    public final List subList(int i10, int i11) {
        t6.f(i10, i11, size());
        if (i10 == i11) {
            return Collections.EMPTY_LIST;
        }
        int i12 = this.f10918b;
        return new b(i10 + i12, i12 + i11, this.f10917a);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(size() * 5);
        sb2.append('[');
        int[] iArr = this.f10917a;
        int i10 = this.f10918b;
        sb2.append(iArr[i10]);
        while (true) {
            i10++;
            if (i10 < this.f10919c) {
                sb2.append(", ");
                sb2.append(iArr[i10]);
            } else {
                sb2.append(']');
                return sb2.toString();
            }
        }
    }
}
