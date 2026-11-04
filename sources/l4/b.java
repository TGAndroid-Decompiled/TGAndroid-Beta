package l4;

import e3.i0;
public final class b implements i {
    public final int f17743a;
    public final c4.f f17744b;
    public final g2.y f17745c;
    public final String d;
    public final int f17746e;
    public final String f17747f;
    public String f17748g;
    public i0 h;
    public int f17749i;
    public int f17750j;
    public boolean f17751k;
    public long f17752l;
    public d2.v f17753m;
    public int f17754n;
    public long f17755o;

    public b(String str) {
        this(0, 0, null, str);
        this.f17743a = 0;
    }

    @Override
    public final void a() {
        switch (this.f17743a) {
            case 0:
                this.f17749i = 0;
                this.f17750j = 0;
                this.f17751k = false;
                this.f17755o = -9223372036854775807L;
                return;
            default:
                this.f17749i = 0;
                this.f17750j = 0;
                this.f17751k = false;
                this.f17755o = -9223372036854775807L;
                return;
        }
    }

    @Override
    public final void c(g2.y r23) {
        throw new UnsupportedOperationException("Method not decompiled: l4.b.c(g2.y):void");
    }

    @Override
    public final void d(boolean z10) {
        int i3 = this.f17743a;
    }

    @Override
    public final void e(int i3, long j10) {
        switch (this.f17743a) {
            case 0:
                this.f17755o = j10;
                return;
            default:
                this.f17755o = j10;
                return;
        }
    }

    @Override
    public final void f(e3.q qVar, f0 f0Var) {
        switch (this.f17743a) {
            case 0:
                f0Var.b();
                f0Var.c();
                this.f17748g = (String) f0Var.f17823e;
                f0Var.c();
                this.h = qVar.i0(f0Var.f17822c, 1);
                return;
            default:
                f0Var.b();
                f0Var.c();
                this.f17748g = (String) f0Var.f17823e;
                f0Var.c();
                this.h = qVar.i0(f0Var.f17822c, 1);
                return;
        }
    }

    public b(int i3, int i10, String str, String str2) {
        this.f17743a = i10;
        switch (i10) {
            case 1:
                c4.f fVar = new c4.f(new byte[16], 16);
                this.f17744b = fVar;
                this.f17745c = new g2.y((byte[]) fVar.f4190b);
                this.f17749i = 0;
                this.f17750j = 0;
                this.f17751k = false;
                this.f17755o = -9223372036854775807L;
                this.d = str;
                this.f17746e = i3;
                this.f17747f = str2;
                return;
            default:
                c4.f fVar2 = new c4.f(new byte[128], 128);
                this.f17744b = fVar2;
                this.f17745c = new g2.y((byte[]) fVar2.f4190b);
                this.f17749i = 0;
                this.f17755o = -9223372036854775807L;
                this.d = str;
                this.f17746e = i3;
                this.f17747f = str2;
                return;
        }
    }

    private final void b(boolean z10) {
    }

    private final void g(boolean z10) {
    }
}
