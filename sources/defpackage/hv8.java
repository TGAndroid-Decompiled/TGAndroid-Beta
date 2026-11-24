package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
public final class hv8 extends s3 implements RandomAccess {
    public static final hv8 d = new hv8(new Object[0], 0, false);
    public Object[] b;
    public int c;

    public hv8(Object[] objArr, int i, boolean z) {
        this.a = z;
        this.b = objArr;
        this.c = i;
    }

    @Override
    public final void add(int i, Object obj) {
        int i2;
        h();
        if (i >= 0 && i <= (i2 = this.c)) {
            Object[] objArr = this.b;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[kt6.z(i2, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.b, i, objArr2, i + 1, this.c - i);
                this.b = objArr2;
            }
            this.b[i] = obj;
            this.c++;
            ((AbstractList) this).modCount++;
            return;
        }
        u36.h(this.c, hg9.l(i, "Index:", ", Size:"));
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
        u36.h(this.c, hg9.l(i, "Index:", ", Size:"));
    }

    public final hv8 j(int i) {
        if (i >= this.c) {
            return new hv8(Arrays.copyOf(this.b, i), this.c, true);
        }
        i98.g();
        return null;
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
    public final boolean add(Object obj) {
        h();
        int i = this.c;
        Object[] objArr = this.b;
        if (i == objArr.length) {
            objArr = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
            this.b = objArr;
        }
        int i2 = this.c;
        this.c = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
