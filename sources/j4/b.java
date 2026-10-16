package j4;

import c3.i0;
public final class b implements i {
    public final int f12573a;
    public final a4.g f12574b;
    public final e2.x f12575c;
    public final String d;
    public final int e;
    public final String f12576f;
    public String f12577g;
    public i0 h;
    public int f12578i;
    public int f12579j;
    public boolean f12580k;
    public long f12581l;
    public b2.x f12582m;
    public int f12583n;
    public long f12584o;

    public b(String str) {
        this(0, 0, null, str);
        this.f12573a = 0;
    }

    @Override
    public final void a(e2.x r23) {
        throw new UnsupportedOperationException("Method not decompiled: j4.b.a(e2.x):void");
    }

    @Override
    public final void c() {
        switch (this.f12573a) {
            case 0:
                this.f12578i = 0;
                this.f12579j = 0;
                this.f12580k = false;
                this.f12584o = -9223372036854775807L;
                return;
            default:
                this.f12578i = 0;
                this.f12579j = 0;
                this.f12580k = false;
                this.f12584o = -9223372036854775807L;
                return;
        }
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        switch (this.f12573a) {
            case 0:
                f0Var.b();
                f0Var.c();
                this.f12577g = (String) f0Var.e;
                f0Var.c();
                this.h = qVar.W(f0Var.f12647c, 1);
                return;
            default:
                f0Var.b();
                f0Var.c();
                this.f12577g = (String) f0Var.e;
                f0Var.c();
                this.h = qVar.W(f0Var.f12647c, 1);
                return;
        }
    }

    @Override
    public final void e(boolean z10) {
        int i10 = this.f12573a;
    }

    @Override
    public final void f(int i10, long j10) {
        switch (this.f12573a) {
            case 0:
                this.f12584o = j10;
                return;
            default:
                this.f12584o = j10;
                return;
        }
    }

    public b(int i10, int i11, String str, String str2) {
        this.f12573a = i11;
        switch (i11) {
            case 1:
                a4.g gVar = new a4.g(new byte[16], 16);
                this.f12574b = gVar;
                this.f12575c = new e2.x(gVar.f260b);
                this.f12578i = 0;
                this.f12579j = 0;
                this.f12580k = false;
                this.f12584o = -9223372036854775807L;
                this.d = str;
                this.e = i10;
                this.f12576f = str2;
                return;
            default:
                a4.g gVar2 = new a4.g(new byte[128], 128);
                this.f12574b = gVar2;
                this.f12575c = new e2.x(gVar2.f260b);
                this.f12578i = 0;
                this.f12584o = -9223372036854775807L;
                this.d = str;
                this.e = i10;
                this.f12576f = str2;
                return;
        }
    }

    private final void b(boolean z10) {
    }

    private final void g(boolean z10) {
    }
}
