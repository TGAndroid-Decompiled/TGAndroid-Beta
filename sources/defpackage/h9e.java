package defpackage;

import java.util.Iterator;
public final class h9e extends t6e {
    public static final Object[] F;
    public static final h9e G;
    public final transient int E;
    public final transient Object[] s;
    public final transient int w;
    public final transient Object[] x;
    public final transient int y;

    static {
        Object[] objArr = new Object[0];
        F = objArr;
        G = new h9e(0, 0, 0, objArr, objArr);
    }

    public h9e(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super((byte) 5);
        this.s = objArr;
        this.w = i;
        this.x = objArr2;
        this.y = i2;
        this.E = i3;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.x;
            if (objArr.length != 0) {
                int a = y3f.a(obj.hashCode());
                while (true) {
                    int i = a & this.y;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    a = i + 1;
                }
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.w;
    }

    @Override
    public final Iterator iterator() {
        x5e x5eVar = this.n;
        if (x5eVar == null) {
            x5eVar = x5e.z(this.E, this.s);
            this.n = x5eVar;
        }
        return x5eVar.listIterator(0);
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
    public final Object[] x() {
        return this.s;
    }
}
