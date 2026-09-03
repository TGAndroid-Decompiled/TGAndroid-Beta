package b4;

import j3.n0;
public final class b implements i {
    public final int f1330a;
    public final h5.v f1331b;
    public final h5.w f1332c;
    public final String d;
    public String e;
    public r3.v f1333f;
    public int f1334g;
    public int h;
    public boolean f1335i;
    public long f1336j;
    public n0 f1337k;
    public int f1338l;
    public long f1339m;

    public b(String str, int i10) {
        this.f1330a = i10;
        switch (i10) {
            case 1:
                h5.v vVar = new h5.v(new byte[16], 16);
                this.f1331b = vVar;
                this.f1332c = new h5.w(vVar.f6984b);
                this.f1334g = 0;
                this.h = 0;
                this.f1335i = false;
                this.f1339m = -9223372036854775807L;
                this.d = str;
                return;
            default:
                h5.v vVar2 = new h5.v(new byte[128], 128);
                this.f1331b = vVar2;
                this.f1332c = new h5.w(vVar2.f6984b);
                this.f1334g = 0;
                this.f1339m = -9223372036854775807L;
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
        switch (this.f1330a) {
            case 0:
                this.f1334g = 0;
                this.h = 0;
                this.f1335i = false;
                this.f1339m = -9223372036854775807L;
                return;
            default:
                this.f1334g = 0;
                this.h = 0;
                this.f1335i = false;
                this.f1339m = -9223372036854775807L;
                return;
        }
    }

    @Override
    public final void c(r3.m mVar, h0 h0Var) {
        switch (this.f1330a) {
            case 0:
                h0Var.a();
                h0Var.b();
                this.e = h0Var.e;
                h0Var.b();
                this.f1333f = mVar.d2(h0Var.d, 1);
                return;
            default:
                h0Var.a();
                h0Var.b();
                this.e = h0Var.e;
                h0Var.b();
                this.f1333f = mVar.d2(h0Var.d, 1);
                return;
        }
    }

    @Override
    public final void d() {
        int i10 = this.f1330a;
    }

    @Override
    public final void e(int i10, long j10) {
        switch (this.f1330a) {
            case 0:
                if (j10 != -9223372036854775807L) {
                    this.f1339m = j10;
                    return;
                }
                return;
            default:
                if (j10 != -9223372036854775807L) {
                    this.f1339m = j10;
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
