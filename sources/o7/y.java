package o7;

import java.util.Iterator;
public final class y extends o {
    public static final Object[] f19266r;
    public static final y f19267s;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f19268f;
    public final transient int h;
    public final transient int f19269n;

    static {
        Object[] objArr = new Object[0];
        f19266r = objArr;
        f19267s = new y(0, 0, 0, objArr, objArr);
    }

    public y(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i10;
        this.f19268f = objArr2;
        this.h = i11;
        this.f19269n = i12;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f19268f;
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
        int i10 = this.f19269n;
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
        return this.f19269n;
    }

    @Override
    public final int n() {
        return 0;
    }

    @Override
    public final d0 o() {
        return s().listIterator(0);
    }

    @Override
    public final Object[] p() {
        return this.d;
    }

    @Override
    public final int size() {
        return this.f19269n;
    }

    @Override
    public final m t() {
        return m.s(this.f19269n, this.d);
    }
}
