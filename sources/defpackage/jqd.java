package defpackage;

import java.util.Iterator;
public final class jqd extends dnd {
    public static final Object[] F;
    public static final jqd G;
    public final transient int E;
    public final transient Object[] s;
    public final transient int w;
    public final transient Object[] x;
    public final transient int y;

    static {
        Object[] objArr = new Object[0];
        F = objArr;
        G = new jqd(0, 0, 0, objArr, objArr);
    }

    public jqd(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super((byte) 4);
        this.s = objArr;
        this.w = i;
        this.x = objArr2;
        this.y = i2;
        this.E = i3;
    }

    @Override
    public final omd B() {
        return omd.A(this.E, this.s);
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.x;
            if (objArr.length != 0) {
                int rotateLeft = (int) (Integer.rotateLeft((int) (obj.hashCode() * (-862048943)), 15) * 461845907);
                while (true) {
                    int i = rotateLeft & this.y;
                    Object obj2 = objArr[i];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            return true;
                        }
                        rotateLeft = i + 1;
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
        return this.w;
    }

    @Override
    public final Iterator iterator() {
        return A().listIterator(0);
    }

    @Override
    public final int p(Object[] objArr) {
        Object[] objArr2 = this.s;
        int i = this.E;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override
    public final int q() {
        return this.E;
    }

    @Override
    public final int s() {
        return 0;
    }

    @Override
    public final int size() {
        return this.E;
    }

    @Override
    public final v9c u() {
        return A().listIterator(0);
    }

    @Override
    public final Object[] v() {
        return this.s;
    }
}
