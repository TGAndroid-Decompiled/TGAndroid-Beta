package j4;

import c3.j0;
public final class b implements i {
    public final int f15241a;
    public final a4.g f15242b;
    public final e2.x f15243c;
    public final String d;
    public final int e;
    public final String f15244f;
    public String f15245g;
    public j0 h;
    public int f15246i;
    public int f15247j;
    public boolean f15248k;
    public long f15249l;
    public b2.x f15250m;
    public int f15251n;
    public long f15252o;

    public b(String str) {
        this(0, 0, null, str);
        this.f15241a = 0;
    }

    @Override
    public final void a(e2.x r23) {
        throw new UnsupportedOperationException("Method not decompiled: j4.b.a(e2.x):void");
    }

    @Override
    public final void c() {
        switch (this.f15241a) {
            case 0:
                this.f15246i = 0;
                this.f15247j = 0;
                this.f15248k = false;
                this.f15252o = -9223372036854775807L;
                return;
            default:
                this.f15246i = 0;
                this.f15247j = 0;
                this.f15248k = false;
                this.f15252o = -9223372036854775807L;
                return;
        }
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        switch (this.f15241a) {
            case 0:
                f0Var.b();
                f0Var.c();
                this.f15245g = (String) f0Var.e;
                f0Var.c();
                this.h = qVar.F1(f0Var.f15315c, 1);
                return;
            default:
                f0Var.b();
                f0Var.c();
                this.f15245g = (String) f0Var.e;
                f0Var.c();
                this.h = qVar.F1(f0Var.f15315c, 1);
                return;
        }
    }

    @Override
    public final void e(boolean z10) {
        int i10 = this.f15241a;
    }

    @Override
    public final void f(int i10, long j10) {
        switch (this.f15241a) {
            case 0:
                this.f15252o = j10;
                return;
            default:
                this.f15252o = j10;
                return;
        }
    }

    public b(int i10, int i11, String str, String str2) {
        this.f15241a = i11;
        switch (i11) {
            case 1:
                a4.g gVar = new a4.g(new byte[16], 16);
                this.f15242b = gVar;
                this.f15243c = new e2.x(gVar.f260b);
                this.f15246i = 0;
                this.f15247j = 0;
                this.f15248k = false;
                this.f15252o = -9223372036854775807L;
                this.d = str;
                this.e = i10;
                this.f15244f = str2;
                return;
            default:
                a4.g gVar2 = new a4.g(new byte[128], 128);
                this.f15242b = gVar2;
                this.f15243c = new e2.x(gVar2.f260b);
                this.f15246i = 0;
                this.f15252o = -9223372036854775807L;
                this.d = str;
                this.e = i10;
                this.f15244f = str2;
                return;
        }
    }

    private final void b(boolean z10) {
    }

    private final void g(boolean z10) {
    }
}
