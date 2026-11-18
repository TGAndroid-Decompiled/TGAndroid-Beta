package l9;

import a8.la;
import c8.k1;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
public final class b extends AbstractList implements RandomAccess, Serializable {
    public final int[] f19703a;
    public final int f19704b;
    public final int f19705c;

    public b(int i7, int i10, int[] iArr) {
        this.f19703a = iArr;
        this.f19704b = i7;
        this.f19705c = i10;
    }

    @Override
    public final boolean contains(Object obj) {
        if ((obj instanceof Integer) && k1.d(((Integer) obj).intValue(), this.f19704b, this.f19705c, this.f19703a) != -1) {
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
                if (this.f19703a[this.f19704b + i7] != bVar.f19703a[bVar.f19704b + i7]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override
    public final Object get(int i7) {
        la.j(i7, size());
        return Integer.valueOf(this.f19703a[this.f19704b + i7]);
    }

    @Override
    public final int hashCode() {
        int i7 = 1;
        for (int i10 = this.f19704b; i10 < this.f19705c; i10++) {
            i7 = (i7 * 31) + this.f19703a[i10];
        }
        return i7;
    }

    @Override
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i7 = this.f19705c;
            int i10 = this.f19704b;
            int d = k1.d(intValue, i10, i7, this.f19703a);
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
            int i10 = this.f19705c;
            while (true) {
                i10--;
                i7 = this.f19704b;
                if (i10 >= i7) {
                    if (this.f19703a[i10] == intValue) {
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
        la.j(i7, size());
        int i10 = this.f19704b + i7;
        int[] iArr = this.f19703a;
        int i11 = iArr[i10];
        num.getClass();
        iArr[i10] = num.intValue();
        return Integer.valueOf(i11);
    }

    @Override
    public final int size() {
        return this.f19705c - this.f19704b;
    }

    @Override
    public final List subList(int i7, int i10) {
        la.n(i7, i10, size());
        if (i7 == i10) {
            return Collections.EMPTY_LIST;
        }
        int i11 = this.f19704b;
        return new b(i7 + i11, i11 + i10, this.f19703a);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(size() * 5);
        sb2.append('[');
        int[] iArr = this.f19703a;
        int i7 = this.f19704b;
        sb2.append(iArr[i7]);
        while (true) {
            i7++;
            if (i7 < this.f19705c) {
                sb2.append(", ");
                sb2.append(iArr[i7]);
            } else {
                sb2.append(']');
                return sb2.toString();
            }
        }
    }
}
