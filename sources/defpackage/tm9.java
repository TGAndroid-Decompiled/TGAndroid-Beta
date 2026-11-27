package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
public final class tm9 extends z2 implements RandomAccess {
    public final Object[] a;
    public final int b;
    public int c;
    public int d;

    public tm9(int i, Object[] objArr) {
        this.a = objArr;
        if (i >= 0) {
            if (i <= objArr.length) {
                this.b = objArr.length;
                this.d = i;
                return;
            }
            StringBuilder m = uh9.m(i, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            m.append(objArr.length);
            throw new IllegalArgumentException(m.toString().toString());
        }
        bya.a(uh9.k(i, "ring buffer filled size should not be negative but it is "));
        throw null;
    }

    @Override
    public final Object get(int i) {
        int i2 = this.d;
        if (i >= 0 && i < i2) {
            return this.a[(this.c + i) % this.b];
        }
        su3.g(c00.h(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override
    public final int h() {
        return this.d;
    }

    public final void i() {
        if (20 <= this.d) {
            int i = this.c;
            int i2 = this.b;
            int i3 = (i + 20) % i2;
            Object[] objArr = this.a;
            if (i > i3) {
                Arrays.fill(objArr, i, i2, (Object) null);
                Arrays.fill(objArr, 0, i3, (Object) null);
            } else {
                Arrays.fill(objArr, i, i3, (Object) null);
            }
            this.c = i3;
            this.d -= 20;
            return;
        }
        throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 20, size = " + this.d).toString());
    }

    @Override
    public final Iterator iterator() {
        return new sm9(this);
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        int length = objArr.length;
        int i = this.d;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i2 = this.d;
        int i3 = this.c;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr2 = this.a;
            if (i5 >= i2 || i3 >= this.b) {
                break;
            }
            objArr[i5] = objArr2[i3];
            i5++;
            i3++;
        }
        while (i5 < i2) {
            objArr[i5] = objArr2[i4];
            i5++;
            i4++;
        }
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override
    public final Object[] toArray() {
        return toArray(new Object[h()]);
    }
}
