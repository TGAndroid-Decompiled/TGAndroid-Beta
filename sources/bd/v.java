package bd;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
public final class v extends e implements RandomAccess {
    public final Object[] f2666a;
    public final int f2667b;
    public int f2668c;
    public int d;

    public v(int i10, Object[] objArr) {
        this.f2666a = objArr;
        if (i10 >= 0) {
            if (i10 <= objArr.length) {
                this.f2667b = objArr.length;
                this.d = i10;
                return;
            }
            StringBuilder l4 = i0.a.l(i10, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            l4.append(objArr.length);
            throw new IllegalArgumentException(l4.toString().toString());
        }
        throw new IllegalArgumentException(i0.a.i(i10, "ring buffer filled size should not be negative but it is ").toString());
    }

    @Override
    public final Object get(int i10) {
        int l4 = l();
        if (i10 >= 0 && i10 < l4) {
            return this.f2666a[(this.f2668c + i10) % this.f2667b];
        }
        throw new IndexOutOfBoundsException(a1.g.j(i10, l4, "index: ", ", size: "));
    }

    @Override
    public final Iterator iterator() {
        return new u(this);
    }

    @Override
    public final int l() {
        return this.d;
    }

    public final void m() {
        if (20 <= this.d) {
            int i10 = this.f2668c;
            int i11 = this.f2667b;
            int i12 = (i10 + 20) % i11;
            Object[] objArr = this.f2666a;
            if (i10 > i12) {
                h.e(i10, i11, objArr);
                h.e(0, i12, objArr);
            } else {
                h.e(i10, i12, objArr);
            }
            this.f2668c = i12;
            this.d -= 20;
            return;
        }
        throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 20, size = " + this.d).toString());
    }

    @Override
    public final Object[] toArray() {
        return toArray(new Object[l()]);
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
        int i12 = this.f2668c;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            objArr = this.f2666a;
            if (i14 >= i11 || i12 >= this.f2667b) {
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
