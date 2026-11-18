package hd;

import a8.p0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
public final class t extends c implements RandomAccess {
    public final Object[] f14155a;
    public final int f14156b;
    public int f14157c;
    public int d;

    public t(int i7, Object[] objArr) {
        this.f14155a = objArr;
        if (i7 >= 0) {
            if (i7 <= objArr.length) {
                this.f14156b = objArr.length;
                this.d = i7;
                return;
            }
            StringBuilder m10 = i5.c.m(i7, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            m10.append(objArr.length);
            throw new IllegalArgumentException(m10.toString().toString());
        }
        throw new IllegalArgumentException(i5.c.i(i7, "ring buffer filled size should not be negative but it is ").toString());
    }

    @Override
    public final int f() {
        return this.d;
    }

    @Override
    public final Object get(int i7) {
        int f10 = f();
        if (i7 >= 0 && i7 < f10) {
            return this.f14155a[(this.f14157c + i7) % this.f14156b];
        }
        throw new IndexOutOfBoundsException(p0.m(i7, f10, "index: ", ", size: "));
    }

    public final void i() {
        if (20 <= this.d) {
            int i7 = this.f14157c;
            int i10 = this.f14156b;
            int i11 = (i7 + 20) % i10;
            Object[] objArr = this.f14155a;
            if (i7 > i11) {
                e.e(i7, i10, objArr);
                e.e(0, i11, objArr);
            } else {
                e.e(i7, i11, objArr);
            }
            this.f14157c = i11;
            this.d -= 20;
            return;
        }
        throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 20, size = " + this.d).toString());
    }

    @Override
    public final Iterator iterator() {
        return new s(this);
    }

    @Override
    public final Object[] toArray() {
        return toArray(new Object[f()]);
    }

    @Override
    public final Object[] toArray(Object[] array) {
        Object[] objArr;
        kotlin.jvm.internal.j.e(array, "array");
        int length = array.length;
        int i7 = this.d;
        if (length < i7) {
            array = Arrays.copyOf(array, i7);
            kotlin.jvm.internal.j.d(array, "copyOf(...)");
        }
        int i10 = this.d;
        int i11 = this.f14157c;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            objArr = this.f14155a;
            if (i13 >= i10 || i11 >= this.f14156b) {
                break;
            }
            array[i13] = objArr[i11];
            i13++;
            i11++;
        }
        while (i13 < i10) {
            array[i13] = objArr[i12];
            i13++;
            i12++;
        }
        if (i10 < array.length) {
            array[i10] = null;
        }
        return array;
    }
}
