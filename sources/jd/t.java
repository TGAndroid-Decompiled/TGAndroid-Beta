package jd;

import i2.o1;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
public final class t extends c implements RandomAccess {
    public final Object[] f14441a;
    public final int f14442b;
    public int f14443c;
    public int d;

    public t(int i10, Object[] objArr) {
        this.f14441a = objArr;
        if (i10 >= 0) {
            if (i10 <= objArr.length) {
                this.f14442b = objArr.length;
                this.d = i10;
                return;
            }
            StringBuilder n10 = o1.n(i10, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            n10.append(objArr.length);
            throw new IllegalArgumentException(n10.toString().toString());
        }
        throw new IllegalArgumentException(o1.k(i10, "ring buffer filled size should not be negative but it is ").toString());
    }

    @Override
    public final Object get(int i10) {
        int h = h();
        if (i10 >= 0 && i10 < h) {
            return this.f14441a[(this.f14443c + i10) % this.f14442b];
        }
        throw new IndexOutOfBoundsException(a1.g.l(i10, h, "index: ", ", size: "));
    }

    @Override
    public final int h() {
        return this.d;
    }

    @Override
    public final Iterator iterator() {
        return new s(this);
    }

    public final void m() {
        if (20 <= this.d) {
            int i10 = this.f14443c;
            int i11 = this.f14442b;
            int i12 = (i10 + 20) % i11;
            Object[] objArr = this.f14441a;
            if (i10 > i12) {
                f.e(i10, i11, objArr);
                f.e(0, i12, objArr);
            } else {
                f.e(i10, i12, objArr);
            }
            this.f14443c = i12;
            this.d -= 20;
            return;
        }
        throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 20, size = " + this.d).toString());
    }

    @Override
    public final Object[] toArray() {
        return toArray(new Object[h()]);
    }

    @Override
    public final Object[] toArray(Object[] array) {
        Object[] objArr;
        kotlin.jvm.internal.i.e(array, "array");
        int length = array.length;
        int i10 = this.d;
        if (length < i10) {
            array = Arrays.copyOf(array, i10);
            kotlin.jvm.internal.i.d(array, "copyOf(...)");
        }
        int i11 = this.d;
        int i12 = this.f14443c;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            objArr = this.f14441a;
            if (i14 >= i11 || i12 >= this.f14442b) {
                break;
            }
            array[i14] = objArr[i12];
            i14++;
            i12++;
        }
        while (i14 < i11) {
            array[i14] = objArr[i13];
            i14++;
            i13++;
        }
        if (i11 < array.length) {
            array[i11] = null;
        }
        return array;
    }
}
