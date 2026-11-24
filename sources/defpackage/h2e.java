package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
public final class h2e extends bsd implements RandomAccess, w2e {
    public static final int[] d;
    public static final h2e e;
    public int[] b;
    public int c;

    static {
        int[] iArr = new int[0];
        d = iArr;
        e = new h2e(iArr, 0, false);
    }

    public h2e(int[] iArr, int i, boolean z) {
        super(z);
        this.b = iArr;
        this.c = i;
    }

    @Override
    public final void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        h();
        if (i >= 0 && i <= (i2 = this.c)) {
            int i3 = i + 1;
            int[] iArr = this.b;
            int length = iArr.length;
            if (i2 < length) {
                System.arraycopy(iArr, i, iArr, i3, i2 - i);
            } else {
                int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
                System.arraycopy(this.b, 0, iArr2, 0, i);
                System.arraycopy(this.b, i, iArr2, i3, this.c - i);
                this.b = iArr2;
            }
            this.b[i] = intValue;
            this.c++;
            ((AbstractList) this).modCount++;
            return;
        }
        k93.i(b00.g(i, this.c, "Index:", ", Size:"));
    }

    @Override
    public final boolean addAll(Collection collection) {
        h();
        Charset charset = h3e.a;
        collection.getClass();
        if (!(collection instanceof h2e)) {
            return super.addAll(collection);
        }
        h2e h2eVar = (h2e) collection;
        int i = h2eVar.c;
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
            System.arraycopy(h2eVar.b, 0, iArr, this.c, h2eVar.c);
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
        if (!(obj instanceof h2e)) {
            return super.equals(obj);
        }
        h2e h2eVar = (h2e) obj;
        if (this.c != h2eVar.c) {
            return false;
        }
        int[] iArr = h2eVar.b;
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Object get(int i) {
        k(i);
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

    public final int i(int i) {
        k(i);
        return this.b[i];
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
        h();
        int i2 = this.c;
        int[] iArr = this.b;
        int length = iArr.length;
        if (i2 == length) {
            iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.b, 0, iArr, 0, this.c);
            this.b = iArr;
        }
        int i3 = this.c;
        this.c = i3 + 1;
        iArr[i3] = i;
    }

    public final void k(int i) {
        if (i >= 0 && i < this.c) {
            return;
        }
        k93.i(b00.g(i, this.c, "Index:", ", Size:"));
    }

    @Override
    public final Object remove(int i) {
        int i2;
        h();
        k(i);
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
        k93.i("toIndex < fromIndex");
    }

    @Override
    public final Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        h();
        k(i);
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
    public final a3e zzd(int i) {
        int[] copyOf;
        if (i >= this.c) {
            if (i == 0) {
                copyOf = d;
            } else {
                copyOf = Arrays.copyOf(this.b, i);
            }
            return new h2e(copyOf, this.c, true);
        }
        sc8.e();
        return null;
    }

    @Override
    public final boolean add(Object obj) {
        j(((Integer) obj).intValue());
        return true;
    }
}
