package a9;

import java.util.Iterator;
public final class n extends l {
    public static final Object[] f359f;
    public static final n h;
    public final transient Object[] d;
    public final transient Object[] f360e;

    static {
        Object[] objArr = new Object[0];
        f359f = objArr;
        h = new n(objArr, objArr);
    }

    public n(Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.f360e = objArr2;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            int length = this.f360e.length;
            return false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return 0;
    }

    @Override
    public final int i(Object[] objArr) {
        System.arraycopy(this.d, 0, objArr, 0, 0);
        return 0;
    }

    @Override
    public final Iterator iterator() {
        m mVar = this.f355b;
        if (mVar == null) {
            i iVar = k.f352b;
            mVar = m.d;
            this.f355b = mVar;
        }
        return mVar.listIterator(0);
    }

    @Override
    public final int n() {
        return 0;
    }

    @Override
    public final int o() {
        return 0;
    }

    @Override
    public final Object[] p() {
        return this.d;
    }

    @Override
    public final int size() {
        return 0;
    }
}
