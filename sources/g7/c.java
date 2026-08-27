package g7;

public final class c extends k9 {

    public final transient Object[] f6427c;
    public final transient int d;

    public final transient int f6428e = 1;

    public c(int i10, Object[] objArr) {
        this.f6427c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        c7.a(i10, this.f6428e);
        Object obj = this.f6427c[i10 + i10 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f6428e;
    }
}
