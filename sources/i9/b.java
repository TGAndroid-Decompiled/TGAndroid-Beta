package i9;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import v7.b8;
import v7.u6;
public final class b extends AbstractList implements RandomAccess, Serializable {
    public final int[] f11348a;
    public final int f11349b;
    public final int f11350c;

    public b(int i10, int i11, int[] iArr) {
        this.f11348a = iArr;
        this.f11349b = i10;
        this.f11350c = i11;
    }

    @Override
    public final boolean contains(Object obj) {
        if ((obj instanceof Integer) && b8.d(((Integer) obj).intValue(), this.f11349b, this.f11350c, this.f11348a) != -1) {
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
                if (this.f11348a[this.f11349b + i10] != bVar.f11348a[bVar.f11349b + i10]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override
    public final Object get(int i10) {
        u6.j(i10, size());
        return Integer.valueOf(this.f11348a[this.f11349b + i10]);
    }

    @Override
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = this.f11349b; i11 < this.f11350c; i11++) {
            i10 = (i10 * 31) + this.f11348a[i11];
        }
        return i10;
    }

    @Override
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i10 = this.f11350c;
            int i11 = this.f11349b;
            int d = b8.d(intValue, i11, i10, this.f11348a);
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
            int i11 = this.f11350c;
            while (true) {
                i11--;
                i10 = this.f11349b;
                if (i11 >= i10) {
                    if (this.f11348a[i11] == intValue) {
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
        u6.j(i10, size());
        int i11 = this.f11349b + i10;
        int[] iArr = this.f11348a;
        int i12 = iArr[i11];
        num.getClass();
        iArr[i11] = num.intValue();
        return Integer.valueOf(i12);
    }

    @Override
    public final int size() {
        return this.f11350c - this.f11349b;
    }

    @Override
    public final List subList(int i10, int i11) {
        u6.n(i10, i11, size());
        if (i10 == i11) {
            return Collections.EMPTY_LIST;
        }
        int i12 = this.f11349b;
        return new b(i10 + i12, i12 + i11, this.f11348a);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(size() * 5);
        sb2.append('[');
        int[] iArr = this.f11348a;
        int i10 = this.f11349b;
        sb2.append(iArr[i10]);
        while (true) {
            i10++;
            if (i10 < this.f11350c) {
                sb2.append(", ");
                sb2.append(iArr[i10]);
            } else {
                sb2.append(']');
                return sb2.toString();
            }
        }
    }
}
