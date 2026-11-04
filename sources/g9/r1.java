package g9;
public final class r1 extends a0 {
    public static final r1 f12134r = new r1();
    public final transient Object d;
    public final transient Object[] f12135e;
    public final transient int f12136f;
    public final transient int h;
    public final transient r1 f12137n;

    public r1() {
        this.d = null;
        this.f12135e = new Object[0];
        this.f12136f = 0;
        this.h = 0;
        this.f12137n = this;
    }

    @Override
    public final u1 c() {
        return new u1(this, this.f12135e, this.f12136f, this.h);
    }

    @Override
    public final v1 d() {
        return new v1(this, new w1(this.f12136f, this.h, this.f12135e));
    }

    @Override
    public final Object get(Object obj) {
        Object i3 = x1.i(this.d, this.f12135e, this.h, this.f12136f, obj);
        if (i3 == null) {
            return null;
        }
        return i3;
    }

    @Override
    public final int size() {
        return this.h;
    }

    public r1(int i3, Object[] objArr) {
        this.f12135e = objArr;
        this.h = i3;
        this.f12136f = 0;
        int o10 = i3 >= 2 ? t0.o(i3) : 0;
        Object h = x1.h(objArr, i3, o10, 0);
        if (!(h instanceof Object[])) {
            this.d = h;
            Object h7 = x1.h(objArr, i3, o10, 1);
            if (!(h7 instanceof Object[])) {
                this.f12137n = new r1(h7, objArr, i3, this);
                return;
            }
            throw ((k0) ((Object[]) h7)[2]).a();
        }
        throw ((k0) ((Object[]) h)[2]).a();
    }

    public r1(Object obj, Object[] objArr, int i3, r1 r1Var) {
        this.d = obj;
        this.f12135e = objArr;
        this.f12136f = 1;
        this.h = i3;
        this.f12137n = r1Var;
    }
}
