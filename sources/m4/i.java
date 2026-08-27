package m4;

public final class i {

    public final l4.d f17692a;

    public final n4.m f17693b;

    public final n4.b f17694c;
    public final h d;

    public final long f17695e;

    public final long f17696f;

    public i(long j10, n4.m mVar, n4.b bVar, l4.d dVar, long j11, h hVar) {
        this.f17695e = j10;
        this.f17693b = mVar;
        this.f17694c = bVar;
        this.f17696f = j11;
        this.f17692a = dVar;
        this.d = hVar;
    }

    public final i a(long j10, n4.m mVar) throws j4.b {
        long jY;
        long jY2;
        h hVarC = this.f17693b.c();
        h hVarC2 = mVar.c();
        if (hVarC == null) {
            return new i(j10, mVar, this.f17694c, this.f17692a, this.f17696f, hVarC);
        }
        if (!hVarC.B()) {
            return new i(j10, mVar, this.f17694c, this.f17692a, this.f17696f, hVarC2);
        }
        long jF = hVarC.F(j10);
        if (jF == 0) {
            return new i(j10, mVar, this.f17694c, this.f17692a, this.f17696f, hVarC2);
        }
        long jE = hVarC.E();
        long jA = hVarC.a(jE);
        long j11 = jF + jE;
        long j12 = j11 - 1;
        long jL = hVarC.l(j12, j10) + hVarC.a(j12);
        long jE2 = hVarC2.E();
        long jA2 = hVarC2.a(jE2);
        long j13 = this.f17696f;
        if (jL != jA2) {
            if (jL < jA2) {
                throw new j4.b();
            }
            if (jA2 < jA) {
                jY2 = j13 - (hVarC2.y(jA, j10) - jE);
            } else {
                jY = hVarC.y(jA2, j10) - jE2;
            }
            return new i(j10, mVar, this.f17694c, this.f17692a, jY2, hVarC2);
        }
        jY = j11 - jE2;
        jY2 = jY + j13;
        return new i(j10, mVar, this.f17694c, this.f17692a, jY2, hVarC2);
    }

    public final long b(long j10) {
        h hVar = this.d;
        long j11 = this.f17695e;
        return (hVar.G(j11, j10) + (hVar.r(j11, j10) + this.f17696f)) - 1;
    }

    public final long c(long j10) {
        return this.d.l(j10 - this.f17696f, this.f17695e) + d(j10);
    }

    public final long d(long j10) {
        return this.d.a(j10 - this.f17696f);
    }
}
