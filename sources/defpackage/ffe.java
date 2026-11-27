package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
public final class ffe extends rwd implements RandomAccess {
    public static final Object[] d;
    public static final ffe e;
    public Object[] b;
    public int c;

    static {
        Object[] objArr = new Object[0];
        d = objArr;
        e = new ffe(objArr, 0, false);
    }

    public ffe(Object[] objArr, int i, boolean z) {
        super(z);
        this.b = objArr;
        this.c = i;
    }

    @Override
    public final void add(int i, Object obj) {
        int i2;
        h();
        if (i >= 0 && i <= (i2 = this.c)) {
            int i3 = i + 1;
            Object[] objArr = this.b;
            int length = objArr.length;
            if (i2 < length) {
                System.arraycopy(objArr, i, objArr, i3, i2 - i);
            } else {
                Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
                System.arraycopy(this.b, 0, objArr2, 0, i);
                System.arraycopy(this.b, i, objArr2, i3, this.c - i);
                this.b = objArr2;
            }
            this.b[i] = obj;
            this.c++;
            ((AbstractList) this).modCount++;
            return;
        }
        su3.g(c00.h(i, this.c, "Index:", ", Size:"));
    }

    @Override
    public final Object get(int i) {
        i(i);
        return this.b[i];
    }

    public final void i(int i) {
        if (i >= 0 && i < this.c) {
            return;
        }
        su3.g(c00.h(i, this.c, "Index:", ", Size:"));
    }

    @Override
    public final Object remove(int i) {
        int i2;
        h();
        i(i);
        Object[] objArr = this.b;
        Object obj = objArr[i];
        if (i < this.c - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override
    public final Object set(int i, Object obj) {
        h();
        i(i);
        Object[] objArr = this.b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override
    public final int size() {
        return this.c;
    }

    @Override
    public final q7e zzd(int i) {
        Object[] copyOf;
        if (i >= this.c) {
            if (i == 0) {
                copyOf = d;
            } else {
                copyOf = Arrays.copyOf(this.b, i);
            }
            return new ffe(copyOf, this.c, true);
        }
        iy8.d();
        return null;
    }

    @Override
    public final boolean add(Object obj) {
        h();
        int i = this.c;
        Object[] objArr = this.b;
        int length = objArr.length;
        if (i == length) {
            objArr = Arrays.copyOf(this.b, Math.max(((length * 3) / 2) + 1, 10));
            this.b = objArr;
        }
        int i2 = this.c;
        this.c = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
