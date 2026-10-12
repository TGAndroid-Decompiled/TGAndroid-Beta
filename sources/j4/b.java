package j4;

import c3.i0;
public final class b implements i {
    public final int f12569a;
    public final a4.g f12570b;
    public final e2.x f12571c;
    public final String d;
    public final int e;
    public final String f12572f;
    public String f12573g;
    public i0 h;
    public int f12574i;
    public int f12575j;
    public boolean f12576k;
    public long f12577l;
    public b2.x f12578m;
    public int f12579n;
    public long f12580o;

    public b(String str) {
        this(0, 0, null, str);
        this.f12569a = 0;
    }

    @Override
    public final void a(e2.x r23) {
        throw new UnsupportedOperationException("Method not decompiled: j4.b.a(e2.x):void");
    }

    @Override
    public final void c() {
        switch (this.f12569a) {
            case 0:
                this.f12574i = 0;
                this.f12575j = 0;
                this.f12576k = false;
                this.f12580o = -9223372036854775807L;
                return;
            default:
                this.f12574i = 0;
                this.f12575j = 0;
                this.f12576k = false;
                this.f12580o = -9223372036854775807L;
                return;
        }
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        switch (this.f12569a) {
            case 0:
                f0Var.b();
                f0Var.c();
                this.f12573g = (String) f0Var.e;
                f0Var.c();
                this.h = qVar.a0(f0Var.f12643c, 1);
                return;
            default:
                f0Var.b();
                f0Var.c();
                this.f12573g = (String) f0Var.e;
                f0Var.c();
                this.h = qVar.a0(f0Var.f12643c, 1);
                return;
        }
    }

    @Override
    public final void e(boolean z10) {
        int i10 = this.f12569a;
    }

    @Override
    public final void f(int i10, long j10) {
        switch (this.f12569a) {
            case 0:
                this.f12580o = j10;
                return;
            default:
                this.f12580o = j10;
                return;
        }
    }

    public b(int i10, int i11, String str, String str2) {
        this.f12569a = i11;
        switch (i11) {
            case 1:
                a4.g gVar = new a4.g(new byte[16], 16);
                this.f12570b = gVar;
                this.f12571c = new e2.x(gVar.f260b);
                this.f12574i = 0;
                this.f12575j = 0;
                this.f12576k = false;
                this.f12580o = -9223372036854775807L;
                this.d = str;
                this.e = i10;
                this.f12572f = str2;
                return;
            default:
                a4.g gVar2 = new a4.g(new byte[128], 128);
                this.f12570b = gVar2;
                this.f12571c = new e2.x(gVar2.f260b);
                this.f12574i = 0;
                this.f12580o = -9223372036854775807L;
                this.d = str;
                this.e = i10;
                this.f12572f = str2;
                return;
        }
    }

    private final void b(boolean z10) {
    }

    private final void g(boolean z10) {
    }
}
