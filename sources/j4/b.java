package j4;

import c3.j0;
public final class b implements i {
    public final int f13985a;
    public final a4.g f13986b;
    public final e2.x f13987c;
    public final String d;
    public final int e;
    public final String f13988f;
    public String f13989g;
    public j0 h;
    public int f13990i;
    public int f13991j;
    public boolean f13992k;
    public long f13993l;
    public b2.w f13994m;
    public int f13995n;
    public long f13996o;

    public b(String str) {
        this(0, 0, null, str);
        this.f13985a = 0;
    }

    @Override
    public final void a(e2.x r23) {
        throw new UnsupportedOperationException("Method not decompiled: j4.b.a(e2.x):void");
    }

    @Override
    public final void c() {
        switch (this.f13985a) {
            case 0:
                this.f13990i = 0;
                this.f13991j = 0;
                this.f13992k = false;
                this.f13996o = -9223372036854775807L;
                return;
            default:
                this.f13990i = 0;
                this.f13991j = 0;
                this.f13992k = false;
                this.f13996o = -9223372036854775807L;
                return;
        }
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        switch (this.f13985a) {
            case 0:
                f0Var.b();
                f0Var.c();
                this.f13989g = (String) f0Var.e;
                f0Var.c();
                this.h = qVar.j0(f0Var.f14059c, 1);
                return;
            default:
                f0Var.b();
                f0Var.c();
                this.f13989g = (String) f0Var.e;
                f0Var.c();
                this.h = qVar.j0(f0Var.f14059c, 1);
                return;
        }
    }

    @Override
    public final void e(boolean z10) {
        int i10 = this.f13985a;
    }

    @Override
    public final void f(int i10, long j10) {
        switch (this.f13985a) {
            case 0:
                this.f13996o = j10;
                return;
            default:
                this.f13996o = j10;
                return;
        }
    }

    public b(int i10, int i11, String str, String str2) {
        this.f13985a = i11;
        switch (i11) {
            case 1:
                a4.g gVar = new a4.g(new byte[16], 16);
                this.f13986b = gVar;
                this.f13987c = new e2.x(gVar.f260b);
                this.f13990i = 0;
                this.f13991j = 0;
                this.f13992k = false;
                this.f13996o = -9223372036854775807L;
                this.d = str;
                this.e = i10;
                this.f13988f = str2;
                return;
            default:
                a4.g gVar2 = new a4.g(new byte[128], 128);
                this.f13986b = gVar2;
                this.f13987c = new e2.x(gVar2.f260b);
                this.f13990i = 0;
                this.f13996o = -9223372036854775807L;
                this.d = str;
                this.e = i10;
                this.f13988f = str2;
                return;
        }
    }

    private final void b(boolean z10) {
    }

    private final void g(boolean z10) {
    }
}
