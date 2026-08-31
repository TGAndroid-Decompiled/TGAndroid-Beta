package b7;

import java.util.Iterator;
public final class b0 extends q {
    public static final Object[] f1805r;
    public static final b0 f1806s;
    public final transient Object[] d;
    public final transient int f1807e;
    public final transient Object[] f1808f;
    public final transient int h;
    public final transient int f1809n;

    static {
        Object[] objArr = new Object[0];
        f1805r = objArr;
        f1806s = new b0(0, 0, 0, objArr, objArr);
    }

    public b0(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.f1807e = i10;
        this.f1808f = objArr2;
        this.h = i11;
        this.f1809n = i12;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f1808f;
            if (objArr.length != 0) {
                int rotateLeft = (int) (Integer.rotateLeft((int) (obj.hashCode() * (-862048943)), 15) * 461845907);
                while (true) {
                    int i10 = this.h & rotateLeft;
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
    public final int hashCode() {
        return this.f1807e;
    }

    @Override
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.d;
        int i10 = this.f1809n;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override
    public final Iterator iterator() {
        return t().listIterator(0);
    }

    @Override
    public final int n() {
        return this.f1809n;
    }

    @Override
    public final int o() {
        return 0;
    }

    @Override
    public final g0 p() {
        return t().listIterator(0);
    }

    @Override
    public final Object[] q() {
        return this.d;
    }

    @Override
    public final int size() {
        return this.f1809n;
    }

    @Override
    public final o u() {
        return o.t(this.f1809n, this.d);
    }
}
