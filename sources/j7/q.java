package j7;
public final class q extends i {
    public final transient Object[] f14059c;
    public final transient int d;
    public final transient int f14060e = 1;

    public q(int i9, Object[] objArr) {
        this.f14059c = objArr;
        this.d = i9;
    }

    @Override
    public final Object get(int i9) {
        f7.y8.a(i9, this.f14060e);
        Object obj = this.f14059c[i9 + i9 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f14060e;
    }
}
