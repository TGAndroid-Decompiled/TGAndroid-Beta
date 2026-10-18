package n7;

import java.util.Iterator;
public final class z extends p {
    public static final Object[] f17329r;
    public static final z f17330s;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f17331f;
    public final transient int h;
    public final transient int f17332n;

    static {
        Object[] objArr = new Object[0];
        f17329r = objArr;
        f17330s = new z(0, 0, 0, objArr, objArr);
    }

    public z(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i10;
        this.f17331f = objArr2;
        this.h = i11;
        this.f17332n = i12;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f17331f;
            if (objArr.length != 0) {
                int rotateLeft = (int) (Integer.rotateLeft((int) (obj.hashCode() * (-862048943)), 15) * 461845907);
                while (true) {
                    int i10 = rotateLeft & this.h;
                    Object obj2 = objArr[i10];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            return true;
                        }
                        rotateLeft = i10 + 1;
                    } else {
                        return false;
                    }
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.d;
        int i10 = this.f17332n;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override
    public final int hashCode() {
        return this.e;
    }

    @Override
    public final Iterator iterator() {
        return s().listIterator(0);
    }

    @Override
    public final int m() {
        return this.f17332n;
    }

    @Override
    public final int n() {
        return 0;
    }

    @Override
    public final e0 o() {
        return s().listIterator(0);
    }

    @Override
    public final Object[] p() {
        return this.d;
    }

    @Override
    public final int size() {
        return this.f17332n;
    }

    @Override
    public final n t() {
        return n.s(this.f17332n, this.d);
    }
}
