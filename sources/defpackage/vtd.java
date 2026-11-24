package defpackage;
public final class vtd extends qtd {
    public static final vtd e = new vtd(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public vtd(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override
    public final Object get(int i) {
        k3f.a(i, this.d);
        Object obj = this.c[i];
        obj.getClass();
        return obj;
    }

    @Override
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override
    public final int i() {
        return this.d;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final Object[] l() {
        return this.c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
