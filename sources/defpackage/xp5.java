package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
public final class xp5 extends AbstractList implements RandomAccess, Serializable {
    public final int[] a;
    public final int b;
    public final int c;

    public xp5(int i, int i2, int[] iArr) {
        this.a = iArr;
        this.b = i;
        this.c = i2;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i = this.b;
            while (true) {
                if (i < this.c) {
                    if (this.a[i] == intValue) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i != -1) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xp5) {
            xp5 xp5Var = (xp5) obj;
            int size = size();
            if (xp5Var.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.a[this.b + i] != xp5Var.a[xp5Var.b + i]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override
    public final Object get(int i) {
        gre.j(i, size());
        return Integer.valueOf(this.a[this.b + i]);
    }

    @Override
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.b; i2 < this.c; i2++) {
            i = (i * 31) + this.a[i2];
        }
        return i;
    }

    @Override
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i = this.b;
            int i2 = i;
            while (true) {
                if (i2 < this.c) {
                    if (this.a[i2] == intValue) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override
    public final boolean isEmpty() {
        return false;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        int i;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i2 = this.c;
            while (true) {
                i2--;
                i = this.b;
                if (i2 >= i) {
                    if (this.a[i2] == intValue) {
                        break;
                    }
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override
    public final Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        gre.j(i, size());
        int i2 = this.b + i;
        int[] iArr = this.a;
        int i3 = iArr[i2];
        num.getClass();
        iArr[i2] = num.intValue();
        return Integer.valueOf(i3);
    }

    @Override
    public final int size() {
        return this.c - this.b;
    }

    @Override
    public final List subList(int i, int i2) {
        gre.n(i, i2, size());
        if (i == i2) {
            return Collections.EMPTY_LIST;
        }
        int i3 = this.b;
        return new xp5(i + i3, i3 + i2, this.a);
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.a;
        int i = this.b;
        sb.append(iArr[i]);
        while (true) {
            i++;
            if (i < this.c) {
                sb.append(", ");
                sb.append(iArr[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }
}
