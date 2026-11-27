package defpackage;
public class ol0 implements bl0 {
    public final vnb a;
    public nl0 b;
    public nl0 c;
    public nl0 d;
    public nl0 e;
    public float f;
    public float h;
    public float n;
    public float r;

    public ol0(vnb vnbVar) {
        this.a = vnbVar;
        float N = hl.N(1.0f);
        float N2 = hl.N(0.33333334f);
        this.n = N;
        this.r = N2;
        float N3 = hl.N(1.0f);
        float N4 = hl.N(0.6666667f);
        this.f = N3;
        this.h = N4;
    }

    @Override
    public final float B0() {
        return -1.0f;
    }

    @Override
    public final float D0() {
        return -1.0f;
    }

    @Override
    public final int Q1() {
        return a(this.e);
    }

    @Override
    public int X() {
        return a(this.c);
    }

    public final int a(nl0 nl0Var) {
        boolean z = false;
        if (nl0Var == null) {
            return 0;
        }
        vnb vnbVar = this.a;
        if ((vnbVar instanceof x53) || (vnbVar == null ? aob.I.o() : vnbVar.a())) {
            z = true;
        }
        return nl0Var.l(vnbVar, z);
    }

    public float b() {
        return this.r;
    }

    public float c() {
        return this.n;
    }

    public final void d(int i, int i2) {
        this.b = new ml0(i2, i, (byte) 0);
    }

    public final void e(int i, int i2) {
        this.d = new ml0(i2, i, (byte) 0);
    }

    public final void f(int i, int i2) {
        this.c = new ml0(i2, i, (byte) 0);
    }

    @Override
    public int m0() {
        return 0;
    }

    @Override
    public float m1() {
        return 0.0f;
    }

    @Override
    public int o1() {
        return 0;
    }

    @Override
    public int x0() {
        return a(this.d);
    }

    @Override
    public int x1() {
        return a(this.b);
    }
}
