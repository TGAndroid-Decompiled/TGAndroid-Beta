package j4;

import c3.h0;
public final class b implements i {
    public final int f12599a;
    public final a4.h f12600b;
    public final e2.v f12601c;
    public final String d;
    public final int e;
    public final String f12602f;
    public String f12603g;
    public h0 h;
    public int f12604i;
    public int f12605j;
    public boolean f12606k;
    public long f12607l;
    public b2.s f12608m;
    public int f12609n;
    public long f12610o;

    public b(String str) {
        this(0, 0, null, str);
        this.f12599a = 0;
    }

    @Override
    public final void a(e2.v r23) {
        throw new UnsupportedOperationException("Method not decompiled: j4.b.a(e2.v):void");
    }

    @Override
    public final void c() {
        switch (this.f12599a) {
            case 0:
                this.f12604i = 0;
                this.f12605j = 0;
                this.f12606k = false;
                this.f12610o = -9223372036854775807L;
                return;
            default:
                this.f12604i = 0;
                this.f12605j = 0;
                this.f12606k = false;
                this.f12610o = -9223372036854775807L;
                return;
        }
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        switch (this.f12599a) {
            case 0:
                f0Var.a();
                f0Var.b();
                this.f12603g = f0Var.e;
                f0Var.b();
                this.h = qVar.Z1(f0Var.d, 1);
                return;
            default:
                f0Var.a();
                f0Var.b();
                this.f12603g = f0Var.e;
                f0Var.b();
                this.h = qVar.Z1(f0Var.d, 1);
                return;
        }
    }

    @Override
    public final void e(boolean z10) {
        int i10 = this.f12599a;
    }

    @Override
    public final void f(int i10, long j3) {
        switch (this.f12599a) {
            case 0:
                this.f12610o = j3;
                return;
            default:
                this.f12610o = j3;
                return;
        }
    }

    public b(int i10, int i11, String str, String str2) {
        this.f12599a = i11;
        switch (i11) {
            case 1:
                a4.h hVar = new a4.h(new byte[16], 16);
                this.f12600b = hVar;
                this.f12601c = new e2.v(hVar.f256b);
                this.f12604i = 0;
                this.f12605j = 0;
                this.f12606k = false;
                this.f12610o = -9223372036854775807L;
                this.d = str;
                this.e = i10;
                this.f12602f = str2;
                return;
            default:
                a4.h hVar2 = new a4.h(new byte[128], 128);
                this.f12600b = hVar2;
                this.f12601c = new e2.v(hVar2.f256b);
                this.f12604i = 0;
                this.f12610o = -9223372036854775807L;
                this.d = str;
                this.e = i10;
                this.f12602f = str2;
                return;
        }
    }

    private final void b(boolean z10) {
    }

    private final void g(boolean z10) {
    }
}
