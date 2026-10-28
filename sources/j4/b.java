package j4;

import c3.j0;
public final class b implements i {
    public final int f15240a;
    public final a4.g f15241b;
    public final e2.x f15242c;
    public final String d;
    public final int e;
    public final String f15243f;
    public String f15244g;
    public j0 h;
    public int f15245i;
    public int f15246j;
    public boolean f15247k;
    public long f15248l;
    public b2.x f15249m;
    public int f15250n;
    public long f15251o;

    public b(String str) {
        this(0, 0, null, str);
        this.f15240a = 0;
    }

    @Override
    public final void a(e2.x r23) {
        throw new UnsupportedOperationException("Method not decompiled: j4.b.a(e2.x):void");
    }

    @Override
    public final void c() {
        switch (this.f15240a) {
            case 0:
                this.f15245i = 0;
                this.f15246j = 0;
                this.f15247k = false;
                this.f15251o = -9223372036854775807L;
                return;
            default:
                this.f15245i = 0;
                this.f15246j = 0;
                this.f15247k = false;
                this.f15251o = -9223372036854775807L;
                return;
        }
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        switch (this.f15240a) {
            case 0:
                f0Var.b();
                f0Var.c();
                this.f15244g = (String) f0Var.e;
                f0Var.c();
                this.h = qVar.F1(f0Var.f15314c, 1);
                return;
            default:
                f0Var.b();
                f0Var.c();
                this.f15244g = (String) f0Var.e;
                f0Var.c();
                this.h = qVar.F1(f0Var.f15314c, 1);
                return;
        }
    }

    @Override
    public final void e(boolean z10) {
        int i10 = this.f15240a;
    }

    @Override
    public final void f(int i10, long j10) {
        switch (this.f15240a) {
            case 0:
                this.f15251o = j10;
                return;
            default:
                this.f15251o = j10;
                return;
        }
    }

    public b(int i10, int i11, String str, String str2) {
        this.f15240a = i11;
        switch (i11) {
            case 1:
                a4.g gVar = new a4.g(new byte[16], 16);
                this.f15241b = gVar;
                this.f15242c = new e2.x(gVar.f260b);
                this.f15245i = 0;
                this.f15246j = 0;
                this.f15247k = false;
                this.f15251o = -9223372036854775807L;
                this.d = str;
                this.e = i10;
                this.f15243f = str2;
                return;
            default:
                a4.g gVar2 = new a4.g(new byte[128], 128);
                this.f15241b = gVar2;
                this.f15242c = new e2.x(gVar2.f260b);
                this.f15245i = 0;
                this.f15251o = -9223372036854775807L;
                this.d = str;
                this.e = i10;
                this.f15243f = str2;
                return;
        }
    }

    private final void b(boolean z10) {
    }

    private final void g(boolean z10) {
    }
}
