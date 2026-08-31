package b4;

import j3.n0;
public final class b implements i {
    public final int f1422a;
    public final h5.v f1423b;
    public final h5.w f1424c;
    public final String d;
    public String f1425e;
    public r3.v f1426f;
    public int f1427g;
    public int h;
    public boolean f1428i;
    public long f1429j;
    public n0 f1430k;
    public int f1431l;
    public long f1432m;

    public b(String str, int i10) {
        this.f1422a = i10;
        switch (i10) {
            case 1:
                h5.v vVar = new h5.v(new byte[16], 16);
                this.f1423b = vVar;
                this.f1424c = new h5.w(vVar.f7303b);
                this.f1427g = 0;
                this.h = 0;
                this.f1428i = false;
                this.f1432m = -9223372036854775807L;
                this.d = str;
                return;
            default:
                h5.v vVar2 = new h5.v(new byte[128], 128);
                this.f1423b = vVar2;
                this.f1424c = new h5.w(vVar2.f7303b);
                this.f1427g = 0;
                this.f1432m = -9223372036854775807L;
                this.d = str;
                return;
        }
    }

    @Override
    public final void a(h5.w r23) {
        throw new UnsupportedOperationException("Method not decompiled: b4.b.a(h5.w):void");
    }

    @Override
    public final void b() {
        switch (this.f1422a) {
            case 0:
                this.f1427g = 0;
                this.h = 0;
                this.f1428i = false;
                this.f1432m = -9223372036854775807L;
                return;
            default:
                this.f1427g = 0;
                this.h = 0;
                this.f1428i = false;
                this.f1432m = -9223372036854775807L;
                return;
        }
    }

    @Override
    public final void c(r3.m mVar, h0 h0Var) {
        switch (this.f1422a) {
            case 0:
                h0Var.a();
                h0Var.b();
                this.f1425e = h0Var.f1514e;
                h0Var.b();
                this.f1426f = mVar.i2(h0Var.d, 1);
                return;
            default:
                h0Var.a();
                h0Var.b();
                this.f1425e = h0Var.f1514e;
                h0Var.b();
                this.f1426f = mVar.i2(h0Var.d, 1);
                return;
        }
    }

    @Override
    public final void d() {
        int i10 = this.f1422a;
    }

    @Override
    public final void e(int i10, long j10) {
        switch (this.f1422a) {
            case 0:
                if (j10 != -9223372036854775807L) {
                    this.f1432m = j10;
                    return;
                }
                return;
            default:
                if (j10 != -9223372036854775807L) {
                    this.f1432m = j10;
                    return;
                }
                return;
        }
    }

    private final void f() {
    }

    private final void g() {
    }
}
