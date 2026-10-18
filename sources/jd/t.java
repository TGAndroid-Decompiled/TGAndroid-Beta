package jd;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
public final class t extends c implements RandomAccess {
    public final Object[] f14396a;
    public final int f14397b;
    public int f14398c;
    public int d;

    public t(int i10, Object[] objArr) {
        this.f14396a = objArr;
        if (i10 >= 0) {
            if (i10 <= objArr.length) {
                this.f14397b = objArr.length;
                this.d = i10;
                return;
            }
            StringBuilder l4 = i2.d.l(i10, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            l4.append(objArr.length);
            throw new IllegalArgumentException(l4.toString().toString());
        }
        throw new IllegalArgumentException(i2.d.j(i10, "ring buffer filled size should not be negative but it is ").toString());
    }

    @Override
    public final Object get(int i10) {
        int h = h();
        if (i10 >= 0 && i10 < h) {
            return this.f14396a[(this.f14398c + i10) % this.f14397b];
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
            int i10 = this.f14398c;
            int i11 = this.f14397b;
            int i12 = (i10 + 20) % i11;
            Object[] objArr = this.f14396a;
            if (i10 > i12) {
                f.e(i10, i11, objArr);
                f.e(0, i12, objArr);
            } else {
                f.e(i10, i12, objArr);
            }
            this.f14398c = i12;
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
        int i12 = this.f14398c;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            objArr = this.f14396a;
            if (i14 >= i11 || i12 >= this.f14397b) {
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
