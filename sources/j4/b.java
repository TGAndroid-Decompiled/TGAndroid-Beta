package j4;
public final class b implements i {
    public final int f11506a;
    public final a4.h f11507b;
    public final e2.v f11508c;
    public final String d;
    public final int e;
    public final String f11509f;
    public String f11510g;
    public c3.h0 h;
    public int f11511i;
    public int f11512j;
    public boolean f11513k;
    public long f11514l;
    public b2.s f11515m;
    public int f11516n;
    public long f11517o;

    public b(String str) {
        this(0, 0, null, str);
        this.f11506a = 0;
    }

    @Override
    public final void a(e2.v r23) {
        throw new UnsupportedOperationException("Method not decompiled: j4.b.a(e2.v):void");
    }

    @Override
    public final void b() {
        switch (this.f11506a) {
            case 0:
                this.f11511i = 0;
                this.f11512j = 0;
                this.f11513k = false;
                this.f11517o = -9223372036854775807L;
                return;
            default:
                this.f11511i = 0;
                this.f11512j = 0;
                this.f11513k = false;
                this.f11517o = -9223372036854775807L;
                return;
        }
    }

    @Override
    public final void c(c3.q qVar, g0 g0Var) {
        switch (this.f11506a) {
            case 0:
                g0Var.a();
                g0Var.b();
                this.f11510g = g0Var.e;
                g0Var.b();
                this.h = qVar.I(g0Var.d, 1);
                return;
            default:
                g0Var.a();
                g0Var.b();
                this.f11510g = g0Var.e;
                g0Var.b();
                this.h = qVar.I(g0Var.d, 1);
                return;
        }
    }

    @Override
    public final void d(boolean z10) {
        int i10 = this.f11506a;
    }

    @Override
    public final void e(int i10, long j3) {
        switch (this.f11506a) {
            case 0:
                this.f11517o = j3;
                return;
            default:
                this.f11517o = j3;
                return;
        }
    }

    public b(int i10, int i11, String str, String str2) {
        this.f11506a = i11;
        switch (i11) {
            case 1:
                a4.h hVar = new a4.h(new byte[16], 16);
                this.f11507b = hVar;
                this.f11508c = new e2.v(hVar.f254b);
                this.f11511i = 0;
                this.f11512j = 0;
                this.f11513k = false;
                this.f11517o = -9223372036854775807L;
                this.d = str;
                this.e = i10;
                this.f11509f = str2;
                return;
            default:
                a4.h hVar2 = new a4.h(new byte[128], 128);
                this.f11507b = hVar2;
                this.f11508c = new e2.v(hVar2.f254b);
                this.f11511i = 0;
                this.f11517o = -9223372036854775807L;
                this.d = str;
                this.e = i10;
                this.f11509f = str2;
                return;
        }
    }

    private final void f(boolean z10) {
    }

    private final void g(boolean z10) {
    }
}
