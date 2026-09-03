package b4;
public final class s implements i {
    public final d0 f1500a;
    public String f1501b;
    public r3.v f1502c;
    public r d;
    public boolean e;
    public long f1508l;
    public final boolean[] f1503f = new boolean[3];
    public final v f1504g = new v(32);
    public final v h = new v(33);
    public final v f1505i = new v(34);
    public final v f1506j = new v(39);
    public final v f1507k = new v(40);
    public long f1509m = -9223372036854775807L;
    public final h5.w f1510n = new h5.w();

    public s(d0 d0Var) {
        this.f1500a = d0Var;
    }

    @Override
    public final void a(h5.w r34) {
        throw new UnsupportedOperationException("Method not decompiled: b4.s.a(h5.w):void");
    }

    @Override
    public final void b() {
        this.f1508l = 0L;
        this.f1509m = -9223372036854775807L;
        h5.a.m(this.f1503f);
        this.f1504g.f();
        this.h.f();
        this.f1505i.f();
        this.f1506j.f();
        this.f1507k.f();
        r rVar = this.d;
        if (rVar != null) {
            rVar.f1493f = false;
            rVar.f1494g = false;
            rVar.h = false;
            rVar.f1495i = false;
            rVar.f1496j = false;
        }
    }

    @Override
    public final void c(r3.m mVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f1501b = h0Var.e;
        h0Var.b();
        r3.v d22 = mVar.d2(h0Var.d, 2);
        this.f1502c = d22;
        this.d = new r(d22);
        this.f1500a.b(mVar, h0Var);
    }

    @Override
    public final void e(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f1509m = j10;
        }
    }

    public final void f(int i10, int i11, byte[] bArr) {
        boolean z4;
        r rVar = this.d;
        if (rVar.f1493f) {
            int i12 = rVar.d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                if ((bArr[i13] & 128) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                rVar.f1494g = z4;
                rVar.f1493f = false;
            } else {
                rVar.d = (i11 - i10) + i12;
            }
        }
        if (!this.e) {
            this.f1504g.a(i10, i11, bArr);
            this.h.a(i10, i11, bArr);
            this.f1505i.a(i10, i11, bArr);
        }
        this.f1506j.a(i10, i11, bArr);
        this.f1507k.a(i10, i11, bArr);
    }

    @Override
    public final void d() {
    }
}
