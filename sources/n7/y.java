package n7;

import java.util.Iterator;
public final class y extends o {
    public static final Object[] f16843r;
    public static final y f16844s;
    public final transient Object[] d;
    public final transient int f16845e;
    public final transient Object[] f16846f;
    public final transient int h;
    public final transient int f16847n;

    static {
        Object[] objArr = new Object[0];
        f16843r = objArr;
        f16844s = new y(0, 0, 0, objArr, objArr);
    }

    public y(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.f16845e = i10;
        this.f16846f = objArr2;
        this.h = i11;
        this.f16847n = i12;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f16846f;
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
        return this.f16845e;
    }

    @Override
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.d;
        int i10 = this.f16847n;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override
    public final Iterator iterator() {
        return t().listIterator(0);
    }

    @Override
    public final int n() {
        return this.f16847n;
    }

    @Override
    public final int o() {
        return 0;
    }

    @Override
    public final d0 p() {
        return t().listIterator(0);
    }

    @Override
    public final Object[] q() {
        return this.d;
    }

    @Override
    public final int size() {
        return this.f16847n;
    }

    @Override
    public final m u() {
        return m.t(this.f16847n, this.d);
    }
}
