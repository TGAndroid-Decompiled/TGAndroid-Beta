package hd;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
public final class t extends c implements RandomAccess {
    public final Object[] f10182a;
    public final int f10183b;
    public int f10184c;
    public int d;

    public t(int i10, Object[] objArr) {
        this.f10182a = objArr;
        if (i10 >= 0) {
            if (i10 <= objArr.length) {
                this.f10183b = objArr.length;
                this.d = i10;
                return;
            }
            StringBuilder j3 = hg.c.j(i10, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            j3.append(objArr.length);
            throw new IllegalArgumentException(j3.toString().toString());
        }
        throw new IllegalArgumentException(hg.c.h(i10, "ring buffer filled size should not be negative but it is ").toString());
    }

    @Override
    public final Object get(int i10) {
        int i11 = i();
        if (i10 >= 0 && i10 < i11) {
            return this.f10182a[(this.f10184c + i10) % this.f10183b];
        }
        throw new IndexOutOfBoundsException(a4.a.m(i10, i11, "index: ", ", size: "));
    }

    @Override
    public final int i() {
        return this.d;
    }

    @Override
    public final Iterator iterator() {
        return new s(this);
    }

    public final void n() {
        if (20 <= this.d) {
            int i10 = this.f10184c;
            int i11 = this.f10183b;
            int i12 = (i10 + 20) % i11;
            Object[] objArr = this.f10182a;
            if (i10 > i12) {
                f.e(i10, i11, objArr);
                f.e(0, i12, objArr);
            } else {
                f.e(i10, i12, objArr);
            }
            this.f10184c = i12;
            this.d -= 20;
            return;
        }
        throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 20, size = " + this.d).toString());
    }

    @Override
    public final Object[] toArray() {
        return toArray(new Object[i()]);
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
        int i12 = this.f10184c;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            objArr = this.f10182a;
            if (i14 >= i11 || i12 >= this.f10183b) {
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
