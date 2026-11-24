package defpackage;
public class nl0 implements al0 {
    public final wjb a;
    public ml0 b;
    public ml0 c;
    public ml0 d;
    public ml0 e;
    public float f;
    public float h;
    public float n;
    public float r;

    public nl0(wjb wjbVar) {
        this.a = wjbVar;
        float N = gl.N(1.0f);
        float N2 = gl.N(0.33333334f);
        this.n = N;
        this.r = N2;
        float N3 = gl.N(1.0f);
        float N4 = gl.N(0.6666667f);
        this.f = N3;
        this.h = N4;
    }

    @Override
    public int L() {
        return a(this.c);
    }

    @Override
    public float U0() {
        return 0.0f;
    }

    public final int a(ml0 ml0Var) {
        boolean z = false;
        if (ml0Var == null) {
            return 0;
        }
        wjb wjbVar = this.a;
        if ((wjbVar instanceof f53) || (wjbVar == null ? bkb.I.o() : wjbVar.a())) {
            z = true;
        }
        return ml0Var.k(wjbVar, z);
    }

    @Override
    public int a1() {
        return 0;
    }

    public float b() {
        return this.r;
    }

    public float c() {
        return this.n;
    }

    public final void d(int i, int i2) {
        this.b = new ll0(i2, i, (byte) 0);
    }

    @Override
    public int d1() {
        return a(this.b);
    }

    public final void e(int i, int i2) {
        this.d = new ll0(i2, i, (byte) 0);
    }

    public final void f(int i, int i2) {
        this.c = new ll0(i2, i, (byte) 0);
    }

    @Override
    public int j0() {
        return 0;
    }

    @Override
    public int m0() {
        return a(this.d);
    }

    @Override
    public final float p0() {
        return -1.0f;
    }

    @Override
    public final float s0() {
        return -1.0f;
    }

    @Override
    public final int t1() {
        return a(this.e);
    }
}
