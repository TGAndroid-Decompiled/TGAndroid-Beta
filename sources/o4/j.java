package o4;

import java.io.IOException;
public final class j {
    public final n4.d f19177a;
    public final p4.m f19178b;
    public final p4.b f19179c;
    public final i d;
    public final long f19180e;
    public final long f19181f;

    public j(long j10, p4.m mVar, p4.b bVar, n4.d dVar, long j11, i iVar) {
        this.f19180e = j10;
        this.f19178b = mVar;
        this.f19179c = bVar;
        this.f19181f = j11;
        this.f19177a = dVar;
        this.d = iVar;
    }

    public final j a(long j10, p4.m mVar) {
        long r6;
        long r9;
        i c3 = this.f19178b.c();
        i c6 = mVar.c();
        if (c3 == null) {
            return new j(j10, mVar, this.f19179c, this.f19177a, this.f19181f, c3);
        } else if (!c3.y()) {
            return new j(j10, mVar, this.f19179c, this.f19177a, this.f19181f, c6);
        } else {
            long F = c3.F(j10);
            if (F == 0) {
                return new j(j10, mVar, this.f19179c, this.f19177a, this.f19181f, c6);
            }
            long z10 = c3.z();
            long b10 = c3.b(z10);
            long j11 = F + z10;
            long j12 = j11 - 1;
            long g10 = c3.g(j12, j10) + c3.b(j12);
            long z11 = c6.z();
            long b11 = c6.b(z11);
            long j13 = this.f19181f;
            int i10 = (g10 > b11 ? 1 : (g10 == b11 ? 0 : -1));
            if (i10 == 0) {
                r6 = j11 - z11;
            } else if (i10 >= 0) {
                if (b11 < b10) {
                    r9 = j13 - (c6.r(b10, j10) - z10);
                    return new j(j10, mVar, this.f19179c, this.f19177a, r9, c6);
                }
                r6 = c3.r(b11, j10) - z11;
            } else {
                throw new IOException();
            }
            r9 = r6 + j13;
            return new j(j10, mVar, this.f19179c, this.f19177a, r9, c6);
        }
    }

    public final long b(long j10) {
        i iVar = this.d;
        long j11 = this.f19180e;
        return (iVar.H(j11, j10) + (iVar.n(j11, j10) + this.f19181f)) - 1;
    }

    public final long c(long j10) {
        return this.d.g(j10 - this.f19181f, this.f19180e) + d(j10);
    }

    public final long d(long j10) {
        return this.d.b(j10 - this.f19181f);
    }
}
