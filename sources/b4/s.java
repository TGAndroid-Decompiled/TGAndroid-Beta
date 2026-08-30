package b4;
public final class s implements i {
    public final d0 f1489a;
    public String f1490b;
    public r3.v f1491c;
    public r d;
    public boolean e;
    public long f1497l;
    public final boolean[] f1492f = new boolean[3];
    public final v f1493g = new v(32);
    public final v h = new v(33);
    public final v f1494i = new v(34);
    public final v f1495j = new v(39);
    public final v f1496k = new v(40);
    public long f1498m = -9223372036854775807L;
    public final h5.w f1499n = new h5.w();

    public s(d0 d0Var) {
        this.f1489a = d0Var;
    }

    @Override
    public final void a(h5.w r34) {
        throw new UnsupportedOperationException("Method not decompiled: b4.s.a(h5.w):void");
    }

    @Override
    public final void b() {
        this.f1497l = 0L;
        this.f1498m = -9223372036854775807L;
        h5.a.m(this.f1492f);
        this.f1493g.f();
        this.h.f();
        this.f1494i.f();
        this.f1495j.f();
        this.f1496k.f();
        r rVar = this.d;
        if (rVar != null) {
            rVar.f1482f = false;
            rVar.f1483g = false;
            rVar.h = false;
            rVar.f1484i = false;
            rVar.f1485j = false;
        }
    }

    @Override
    public final void c(r3.m mVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f1490b = h0Var.e;
        h0Var.b();
        r3.v c22 = mVar.c2(h0Var.d, 2);
        this.f1491c = c22;
        this.d = new r(c22);
        this.f1489a.b(mVar, h0Var);
    }

    @Override
    public final void e(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f1498m = j10;
        }
    }

    public final void f(int i10, int i11, byte[] bArr) {
        boolean z4;
        r rVar = this.d;
        if (rVar.f1482f) {
            int i12 = rVar.d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                if ((bArr[i13] & 128) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                rVar.f1483g = z4;
                rVar.f1482f = false;
            } else {
                rVar.d = (i11 - i10) + i12;
            }
        }
        if (!this.e) {
            this.f1493g.a(i10, i11, bArr);
            this.h.a(i10, i11, bArr);
            this.f1494i.a(i10, i11, bArr);
        }
        this.f1495j.a(i10, i11, bArr);
        this.f1496k.a(i10, i11, bArr);
    }

    @Override
    public final void d() {
    }
}
