package k9;

import b8.od;
import b8.zb;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
public final class b extends AbstractList implements RandomAccess, Serializable {
    public final int[] f16908a;
    public final int f16909b;
    public final int f16910c;

    public b(int i3, int i10, int[] iArr) {
        this.f16908a = iArr;
        this.f16909b = i3;
        this.f16910c = i10;
    }

    @Override
    public final boolean contains(Object obj) {
        if ((obj instanceof Integer) && od.d(((Integer) obj).intValue(), this.f16909b, this.f16910c, this.f16908a) != -1) {
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
            for (int i3 = 0; i3 < size; i3++) {
                if (this.f16908a[this.f16909b + i3] != bVar.f16908a[bVar.f16909b + i3]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override
    public final Object get(int i3) {
        zb.j(i3, size());
        return Integer.valueOf(this.f16908a[this.f16909b + i3]);
    }

    @Override
    public final int hashCode() {
        int i3 = 1;
        for (int i10 = this.f16909b; i10 < this.f16910c; i10++) {
            i3 = (i3 * 31) + this.f16908a[i10];
        }
        return i3;
    }

    @Override
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i3 = this.f16910c;
            int i10 = this.f16909b;
            int d = od.d(intValue, i10, i3, this.f16908a);
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
        int i3;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i10 = this.f16910c;
            while (true) {
                i10--;
                i3 = this.f16909b;
                if (i10 >= i3) {
                    if (this.f16908a[i10] == intValue) {
                        break;
                    }
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                return i10 - i3;
            }
        }
        return -1;
    }

    @Override
    public final Object set(int i3, Object obj) {
        Integer num = (Integer) obj;
        zb.j(i3, size());
        int i10 = this.f16909b + i3;
        int[] iArr = this.f16908a;
        int i11 = iArr[i10];
        num.getClass();
        iArr[i10] = num.intValue();
        return Integer.valueOf(i11);
    }

    @Override
    public final int size() {
        return this.f16910c - this.f16909b;
    }

    @Override
    public final List subList(int i3, int i10) {
        zb.n(i3, i10, size());
        if (i3 == i10) {
            return Collections.EMPTY_LIST;
        }
        int i11 = this.f16909b;
        return new b(i3 + i11, i11 + i10, this.f16908a);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(size() * 5);
        sb2.append('[');
        int[] iArr = this.f16908a;
        int i3 = this.f16909b;
        sb2.append(iArr[i3]);
        while (true) {
            i3++;
            if (i3 < this.f16910c) {
                sb2.append(", ");
                sb2.append(iArr[i3]);
            } else {
                sb2.append(']');
                return sb2.toString();
            }
        }
    }
}
