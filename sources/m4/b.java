package m4;

import f3.j0;
public final class b implements i {
    public final int f19582a;
    public final d4.f f19583b;
    public final h2.x f19584c;
    public final String d;
    public final int f19585e;
    public final String f19586f;
    public String f19587g;
    public j0 h;
    public int f19588i;
    public int f19589j;
    public boolean f19590k;
    public long f19591l;
    public e2.u f19592m;
    public int f19593n;
    public long f19594o;

    public b(String str) {
        this(0, 0, null, str);
        this.f19582a = 0;
    }

    @Override
    public final void c(h2.x r23) {
        throw new UnsupportedOperationException("Method not decompiled: m4.b.c(h2.x):void");
    }

    @Override
    public final void d() {
        switch (this.f19582a) {
            case 0:
                this.f19588i = 0;
                this.f19589j = 0;
                this.f19590k = false;
                this.f19594o = -9223372036854775807L;
                return;
            default:
                this.f19588i = 0;
                this.f19589j = 0;
                this.f19590k = false;
                this.f19594o = -9223372036854775807L;
                return;
        }
    }

    @Override
    public final void e(boolean z9) {
        int i7 = this.f19582a;
    }

    @Override
    public final void f(int i7, long j3) {
        switch (this.f19582a) {
            case 0:
                this.f19594o = j3;
                return;
            default:
                this.f19594o = j3;
                return;
        }
    }

    @Override
    public final void g(f3.q qVar, g0 g0Var) {
        switch (this.f19582a) {
            case 0:
                g0Var.b();
                g0Var.c();
                this.f19587g = (String) g0Var.f19679e;
                g0Var.c();
                this.h = qVar.O1(g0Var.f19678c, 1);
                return;
            default:
                g0Var.b();
                g0Var.c();
                this.f19587g = (String) g0Var.f19679e;
                g0Var.c();
                this.h = qVar.O1(g0Var.f19678c, 1);
                return;
        }
    }

    public b(int i7, int i10, String str, String str2) {
        this.f19582a = i10;
        switch (i10) {
            case 1:
                d4.f fVar = new d4.f(new byte[16], 16);
                this.f19583b = fVar;
                this.f19584c = new h2.x((byte[]) fVar.f8167b);
                this.f19588i = 0;
                this.f19589j = 0;
                this.f19590k = false;
                this.f19594o = -9223372036854775807L;
                this.d = str;
                this.f19585e = i7;
                this.f19586f = str2;
                return;
            default:
                d4.f fVar2 = new d4.f(new byte[128], 128);
                this.f19583b = fVar2;
                this.f19584c = new h2.x((byte[]) fVar2.f8167b);
                this.f19588i = 0;
                this.f19594o = -9223372036854775807L;
                this.d = str;
                this.f19585e = i7;
                this.f19586f = str2;
                return;
        }
    }

    private final void a(boolean z9) {
    }

    private final void b(boolean z9) {
    }
}
