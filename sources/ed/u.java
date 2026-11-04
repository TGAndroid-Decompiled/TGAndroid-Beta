package ed;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import k2.p1;
public final class u extends d implements RandomAccess {
    public final Object[] f9960a;
    public final int f9961b;
    public int f9962c;
    public int d;

    public u(int i3, Object[] objArr) {
        this.f9960a = objArr;
        if (i3 >= 0) {
            if (i3 <= objArr.length) {
                this.f9961b = objArr.length;
                this.d = i3;
                return;
            }
            StringBuilder m10 = p1.m(i3, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            m10.append(objArr.length);
            throw new IllegalArgumentException(m10.toString().toString());
        }
        throw new IllegalArgumentException(p1.i(i3, "ring buffer filled size should not be negative but it is ").toString());
    }

    @Override
    public final Object get(int i3) {
        int h = h();
        if (i3 >= 0 && i3 < h) {
            return this.f9960a[(this.f9962c + i3) % this.f9961b];
        }
        throw new IndexOutOfBoundsException(a1.g.n(i3, h, "index: ", ", size: "));
    }

    @Override
    public final int h() {
        return this.d;
    }

    public final void i() {
        if (20 <= this.d) {
            int i3 = this.f9962c;
            int i10 = this.f9961b;
            int i11 = (i3 + 20) % i10;
            Object[] objArr = this.f9960a;
            if (i3 > i11) {
                f.e(i3, i10, objArr);
                f.e(0, i11, objArr);
            } else {
                f.e(i3, i11, objArr);
            }
            this.f9962c = i11;
            this.d -= 20;
            return;
        }
        throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 20, size = " + this.d).toString());
    }

    @Override
    public final Iterator iterator() {
        return new t(this);
    }

    @Override
    public final Object[] toArray() {
        return toArray(new Object[h()]);
    }

    @Override
    public final Object[] toArray(Object[] array) {
        Object[] objArr;
        kotlin.jvm.internal.j.e(array, "array");
        int length = array.length;
        int i3 = this.d;
        if (length < i3) {
            array = Arrays.copyOf(array, i3);
            kotlin.jvm.internal.j.d(array, "copyOf(...)");
        }
        int i10 = this.d;
        int i11 = this.f9962c;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            objArr = this.f9960a;
            if (i13 >= i10 || i11 >= this.f9961b) {
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
