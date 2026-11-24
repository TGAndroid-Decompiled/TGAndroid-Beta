package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
public final class zpe extends pge implements aye, RandomAccess {
    public static final zpe d;
    public int[] b;
    public int c;

    static {
        zpe zpeVar = new zpe(new int[0], 0);
        d = zpeVar;
        zpeVar.a = false;
    }

    public zpe(int[] iArr, int i) {
        this.b = iArr;
        this.c = i;
    }

    @Override
    public final void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        h();
        if (i >= 0 && i <= (i2 = this.c)) {
            int[] iArr = this.b;
            if (i2 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
            } else {
                int[] iArr2 = new int[kt6.z(i2, 3, 2, 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.b, i, iArr2, i + 1, this.c - i);
                this.b = iArr2;
            }
            this.b[i] = intValue;
            this.c++;
            ((AbstractList) this).modCount++;
            return;
        }
        wa3.i(k(i));
    }

    @Override
    public final boolean addAll(Collection collection) {
        h();
        Charset charset = iqe.a;
        collection.getClass();
        if (!(collection instanceof zpe)) {
            return super.addAll(collection);
        }
        zpe zpeVar = (zpe) collection;
        int i = zpeVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.b;
            if (i3 > iArr.length) {
                iArr = Arrays.copyOf(iArr, i3);
                this.b = iArr;
            }
            System.arraycopy(zpeVar.b, 0, iArr, this.c, zpeVar.c);
            this.c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpe)) {
            return super.equals(obj);
        }
        zpe zpeVar = (zpe) obj;
        if (this.c != zpeVar.c) {
            return false;
        }
        int[] iArr = zpeVar.b;
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Object get(int i) {
        j(i);
        return Integer.valueOf(this.b[i]);
    }

    @Override
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + this.b[i2];
        }
        return i;
    }

    public final void i(int i) {
        h();
        int i2 = this.c;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[kt6.z(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.b = iArr2;
            iArr = iArr2;
        }
        int i3 = this.c;
        this.c = i3 + 1;
        iArr[i3] = i;
    }

    @Override
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    public final void j(int i) {
        if (i >= 0 && i < this.c) {
            return;
        }
        wa3.i(k(i));
    }

    public final String k(int i) {
        int i2 = this.c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override
    public final Object remove(int i) {
        int i2;
        h();
        j(i);
        int[] iArr = this.b;
        int i3 = iArr[i];
        if (i < this.c - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override
    public final void removeRange(int i, int i2) {
        h();
        if (i2 >= i) {
            int[] iArr = this.b;
            System.arraycopy(iArr, i2, iArr, i, this.c - i2);
            this.c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        wa3.i("toIndex < fromIndex");
    }

    @Override
    public final Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        h();
        j(i);
        int[] iArr = this.b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override
    public final int size() {
        return this.c;
    }

    @Override
    public final nre zza(int i) {
        if (i >= this.c) {
            return new zpe(Arrays.copyOf(this.b, i), this.c);
        }
        i98.g();
        return null;
    }

    @Override
    public final boolean add(Object obj) {
        i(((Integer) obj).intValue());
        return true;
    }
}
