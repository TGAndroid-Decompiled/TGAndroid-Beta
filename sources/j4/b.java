package j4;

import c3.l0;
public final class b implements i {
    public final int f14028a;
    public final a4.g f14029b;
    public final e2.x f14030c;
    public final String d;
    public final int e;
    public final String f14031f;
    public String f14032g;
    public l0 h;
    public int f14033i;
    public int f14034j;
    public boolean f14035k;
    public long f14036l;
    public b2.w f14037m;
    public int f14038n;
    public long f14039o;

    public b(String str) {
        this(0, 0, null, str);
        this.f14028a = 0;
    }

    @Override
    public final void a(e2.x r23) {
        throw new UnsupportedOperationException("Method not decompiled: j4.b.a(e2.x):void");
    }

    @Override
    public final void c() {
        switch (this.f14028a) {
            case 0:
                this.f14033i = 0;
                this.f14034j = 0;
                this.f14035k = false;
                this.f14039o = -9223372036854775807L;
                return;
            default:
                this.f14033i = 0;
                this.f14034j = 0;
                this.f14035k = false;
                this.f14039o = -9223372036854775807L;
                return;
        }
    }

    @Override
    public final void d(c3.s sVar, f0 f0Var) {
        switch (this.f14028a) {
            case 0:
                f0Var.b();
                f0Var.c();
                this.f14032g = (String) f0Var.e;
                f0Var.c();
                this.h = sVar.j0(f0Var.f14102c, 1);
                return;
            default:
                f0Var.b();
                f0Var.c();
                this.f14032g = (String) f0Var.e;
                f0Var.c();
                this.h = sVar.j0(f0Var.f14102c, 1);
                return;
        }
    }

    @Override
    public final void e(boolean z10) {
        int i10 = this.f14028a;
    }

    @Override
    public final void f(int i10, long j10) {
        switch (this.f14028a) {
            case 0:
                this.f14039o = j10;
                return;
            default:
                this.f14039o = j10;
                return;
        }
    }

    public b(int i10, int i11, String str, String str2) {
        this.f14028a = i11;
        switch (i11) {
            case 1:
                a4.g gVar = new a4.g(new byte[16], 16);
                this.f14029b = gVar;
                this.f14030c = new e2.x(gVar.f260b);
                this.f14033i = 0;
                this.f14034j = 0;
                this.f14035k = false;
                this.f14039o = -9223372036854775807L;
                this.d = str;
                this.e = i10;
                this.f14031f = str2;
                return;
            default:
                a4.g gVar2 = new a4.g(new byte[128], 128);
                this.f14029b = gVar2;
                this.f14030c = new e2.x(gVar2.f260b);
                this.f14033i = 0;
                this.f14039o = -9223372036854775807L;
                this.d = str;
                this.e = i10;
                this.f14031f = str2;
                return;
        }
    }

    private final void b(boolean z10) {
    }

    private final void g(boolean z10) {
    }
}
