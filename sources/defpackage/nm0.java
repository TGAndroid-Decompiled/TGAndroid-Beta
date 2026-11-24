package defpackage;
public class nm0 implements am0 {
    public final ylb a;
    public mm0 b;
    public mm0 c;
    public mm0 d;
    public mm0 e;
    public float f;
    public float h;
    public float n;
    public float r;

    public nm0(ylb ylbVar) {
        this.a = ylbVar;
        float N = gm.N(1.0f);
        float N2 = gm.N(0.33333334f);
        this.n = N;
        this.r = N2;
        float N3 = gm.N(1.0f);
        float N4 = gm.N(0.6666667f);
        this.f = N3;
        this.h = N4;
    }

    @Override
    public final int K1() {
        return a(this.e);
    }

    @Override
    public int V() {
        return a(this.c);
    }

    public final int a(mm0 mm0Var) {
        boolean z = false;
        if (mm0Var == null) {
            return 0;
        }
        ylb ylbVar = this.a;
        if ((ylbVar instanceof r63) || (ylbVar == null ? cmb.I.o() : ylbVar.a())) {
            z = true;
        }
        return mm0Var.o(ylbVar, z);
    }

    public float b() {
        return this.r;
    }

    public float c() {
        return this.n;
    }

    public final void d(int i, int i2) {
        this.b = new lm0(i2, i, (byte) 0);
    }

    public final void e(int i, int i2) {
        this.d = new lm0(i2, i, (byte) 0);
    }

    public final void f(int i, int i2) {
        this.c = new lm0(i2, i, (byte) 0);
    }

    @Override
    public int g0() {
        return 0;
    }

    @Override
    public float g1() {
        return 0.0f;
    }

    @Override
    public int h1() {
        return 0;
    }

    @Override
    public int r1() {
        return a(this.b);
    }

    @Override
    public int u0() {
        return a(this.d);
    }

    @Override
    public final float w0() {
        return -1.0f;
    }

    @Override
    public final float y0() {
        return -1.0f;
    }
}
