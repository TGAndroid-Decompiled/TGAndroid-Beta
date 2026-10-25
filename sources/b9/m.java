package b9;

import java.util.Iterator;
public final class m extends k {
    public static final Object[] f3710f;
    public static final m h;
    public final transient Object[] d;
    public final transient Object[] e;

    static {
        Object[] objArr = new Object[0];
        f3710f = objArr;
        h = new m(objArr, objArr);
    }

    public m(Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = objArr2;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            int length = this.e.length;
            return false;
        }
        return false;
    }

    @Override
    public final int h(Object[] objArr) {
        System.arraycopy(this.d, 0, objArr, 0, 0);
        return 0;
    }

    @Override
    public final int hashCode() {
        return 0;
    }

    @Override
    public final Iterator iterator() {
        l lVar = this.f3706b;
        if (lVar == null) {
            h hVar = j.f3703b;
            lVar = l.d;
            this.f3706b = lVar;
        }
        return lVar.listIterator(0);
    }

    @Override
    public final int m() {
        return 0;
    }

    @Override
    public final int n() {
        return 0;
    }

    @Override
    public final Object[] o() {
        return this.d;
    }

    @Override
    public final int size() {
        return 0;
    }
}
