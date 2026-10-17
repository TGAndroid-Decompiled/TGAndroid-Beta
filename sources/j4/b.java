package j4;

import c3.j0;
public final class b implements i {
    public final int f13978a;
    public final a4.g f13979b;
    public final e2.x f13980c;
    public final String d;
    public final int e;
    public final String f13981f;
    public String f13982g;
    public j0 h;
    public int f13983i;
    public int f13984j;
    public boolean f13985k;
    public long f13986l;
    public b2.w f13987m;
    public int f13988n;
    public long f13989o;

    public b(String str) {
        this(0, 0, null, str);
        this.f13978a = 0;
    }

    @Override
    public final void a(e2.x r23) {
        throw new UnsupportedOperationException("Method not decompiled: j4.b.a(e2.x):void");
    }

    @Override
    public final void c() {
        switch (this.f13978a) {
            case 0:
                this.f13983i = 0;
                this.f13984j = 0;
                this.f13985k = false;
                this.f13989o = -9223372036854775807L;
                return;
            default:
                this.f13983i = 0;
                this.f13984j = 0;
                this.f13985k = false;
                this.f13989o = -9223372036854775807L;
                return;
        }
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        switch (this.f13978a) {
            case 0:
                f0Var.b();
                f0Var.c();
                this.f13982g = (String) f0Var.e;
                f0Var.c();
                this.h = qVar.j0(f0Var.f14052c, 1);
                return;
            default:
                f0Var.b();
                f0Var.c();
                this.f13982g = (String) f0Var.e;
                f0Var.c();
                this.h = qVar.j0(f0Var.f14052c, 1);
                return;
        }
    }

    @Override
    public final void e(boolean z10) {
        int i10 = this.f13978a;
    }

    @Override
    public final void f(int i10, long j10) {
        switch (this.f13978a) {
            case 0:
                this.f13989o = j10;
                return;
            default:
                this.f13989o = j10;
                return;
        }
    }

    public b(int i10, int i11, String str, String str2) {
        this.f13978a = i11;
        switch (i11) {
            case 1:
                a4.g gVar = new a4.g(new byte[16], 16);
                this.f13979b = gVar;
                this.f13980c = new e2.x(gVar.f260b);
                this.f13983i = 0;
                this.f13984j = 0;
                this.f13985k = false;
                this.f13989o = -9223372036854775807L;
                this.d = str;
                this.e = i10;
                this.f13981f = str2;
                return;
            default:
                a4.g gVar2 = new a4.g(new byte[128], 128);
                this.f13979b = gVar2;
                this.f13980c = new e2.x(gVar2.f260b);
                this.f13983i = 0;
                this.f13989o = -9223372036854775807L;
                this.d = str;
                this.e = i10;
                this.f13981f = str2;
                return;
        }
    }

    private final void b(boolean z10) {
    }

    private final void g(boolean z10) {
    }
}
