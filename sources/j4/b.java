package j4;

import c3.j0;
public final class b implements i {
    public final int f13983a;
    public final a4.g f13984b;
    public final e2.x f13985c;
    public final String d;
    public final int e;
    public final String f13986f;
    public String f13987g;
    public j0 h;
    public int f13988i;
    public int f13989j;
    public boolean f13990k;
    public long f13991l;
    public b2.w f13992m;
    public int f13993n;
    public long f13994o;

    public b(String str) {
        this(0, 0, null, str);
        this.f13983a = 0;
    }

    @Override
    public final void a(e2.x r23) {
        throw new UnsupportedOperationException("Method not decompiled: j4.b.a(e2.x):void");
    }

    @Override
    public final void c() {
        switch (this.f13983a) {
            case 0:
                this.f13988i = 0;
                this.f13989j = 0;
                this.f13990k = false;
                this.f13994o = -9223372036854775807L;
                return;
            default:
                this.f13988i = 0;
                this.f13989j = 0;
                this.f13990k = false;
                this.f13994o = -9223372036854775807L;
                return;
        }
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        switch (this.f13983a) {
            case 0:
                f0Var.b();
                f0Var.c();
                this.f13987g = (String) f0Var.e;
                f0Var.c();
                this.h = qVar.j0(f0Var.f14057c, 1);
                return;
            default:
                f0Var.b();
                f0Var.c();
                this.f13987g = (String) f0Var.e;
                f0Var.c();
                this.h = qVar.j0(f0Var.f14057c, 1);
                return;
        }
    }

    @Override
    public final void e(boolean z10) {
        int i10 = this.f13983a;
    }

    @Override
    public final void f(int i10, long j10) {
        switch (this.f13983a) {
            case 0:
                this.f13994o = j10;
                return;
            default:
                this.f13994o = j10;
                return;
        }
    }

    public b(int i10, int i11, String str, String str2) {
        this.f13983a = i11;
        switch (i11) {
            case 1:
                a4.g gVar = new a4.g(new byte[16], 16);
                this.f13984b = gVar;
                this.f13985c = new e2.x(gVar.f260b);
                this.f13988i = 0;
                this.f13989j = 0;
                this.f13990k = false;
                this.f13994o = -9223372036854775807L;
                this.d = str;
                this.e = i10;
                this.f13986f = str2;
                return;
            default:
                a4.g gVar2 = new a4.g(new byte[128], 128);
                this.f13984b = gVar2;
                this.f13985c = new e2.x(gVar2.f260b);
                this.f13988i = 0;
                this.f13994o = -9223372036854775807L;
                this.d = str;
                this.e = i10;
                this.f13986f = str2;
                return;
        }
    }

    private final void b(boolean z10) {
    }

    private final void g(boolean z10) {
    }
}
