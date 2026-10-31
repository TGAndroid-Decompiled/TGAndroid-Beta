package j4;

import c3.k0;
public final class b implements i {
    public final int f9403a;
    public final a4.g f9404b;
    public final e2.x f9405c;
    public final String d;
    public final int e;
    public final String f9406f;
    public String f9407g;
    public k0 h;
    public int f9408i;
    public int f9409j;
    public boolean f9410k;
    public long f9411l;
    public b2.x f9412m;
    public int f9413n;
    public long f9414o;

    public b(String str) {
        this(0, 0, null, str);
        this.f9403a = 0;
    }

    @Override
    public final void c(e2.x r23) {
        throw new UnsupportedOperationException("Method not decompiled: j4.b.c(e2.x):void");
    }

    @Override
    public final void e() {
        switch (this.f9403a) {
            case 0:
                this.f9408i = 0;
                this.f9409j = 0;
                this.f9410k = false;
                this.f9414o = -9223372036854775807L;
                return;
            default:
                this.f9408i = 0;
                this.f9409j = 0;
                this.f9410k = false;
                this.f9414o = -9223372036854775807L;
                return;
        }
    }

    @Override
    public final void f(c3.q qVar, g0 g0Var) {
        switch (this.f9403a) {
            case 0:
                g0Var.b();
                g0Var.c();
                this.f9407g = (String) g0Var.e;
                g0Var.c();
                this.h = qVar.I1(g0Var.f9491c, 1);
                return;
            default:
                g0Var.b();
                g0Var.c();
                this.f9407g = (String) g0Var.e;
                g0Var.c();
                this.h = qVar.I1(g0Var.f9491c, 1);
                return;
        }
    }

    @Override
    public final void g(boolean z10) {
        int i10 = this.f9403a;
    }

    @Override
    public final void h(int i10, long j10) {
        switch (this.f9403a) {
            case 0:
                this.f9414o = j10;
                return;
            default:
                this.f9414o = j10;
                return;
        }
    }

    public b(int i10, int i11, String str, String str2) {
        this.f9403a = i11;
        switch (i11) {
            case 1:
                a4.g gVar = new a4.g(new byte[16], 16);
                this.f9404b = gVar;
                this.f9405c = new e2.x((byte[]) gVar.f260b);
                this.f9408i = 0;
                this.f9409j = 0;
                this.f9410k = false;
                this.f9414o = -9223372036854775807L;
                this.d = str;
                this.e = i10;
                this.f9406f = str2;
                return;
            default:
                a4.g gVar2 = new a4.g(new byte[128], 128);
                this.f9404b = gVar2;
                this.f9405c = new e2.x((byte[]) gVar2.f260b);
                this.f9408i = 0;
                this.f9414o = -9223372036854775807L;
                this.d = str;
                this.e = i10;
                this.f9406f = str2;
                return;
        }
    }

    private final void a(boolean z10) {
    }

    private final void b(boolean z10) {
    }
}
