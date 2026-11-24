package defpackage;
public final class qi2 extends sm4 {
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;

    public qi2(aob aobVar, long j, long j2, boolean z) {
        super(aobVar);
        long max;
        int i = (j2 > Long.MIN_VALUE ? 1 : (j2 == Long.MIN_VALUE ? 0 : -1));
        if (i != 0 && j2 < j) {
            throw new ri2(j, 2, j2);
        }
        boolean z2 = false;
        if (aobVar.h() == 1) {
            znb m = aobVar.m(0, new znb(), 0L);
            long max2 = Math.max(0L, j);
            if (!z && !m.j && max2 != 0 && !m.g) {
                throw new ri2(1);
            }
            if (i == 0) {
                max = m.l;
            } else {
                max = Math.max(0L, j2);
            }
            long j3 = m.l;
            int i2 = (j3 > (-9223372036854775807L) ? 1 : (j3 == (-9223372036854775807L) ? 0 : -1));
            if (i2 != 0) {
                max = max > j3 ? j3 : max;
                if (max2 > max) {
                    max2 = max;
                }
            }
            this.f = max2;
            this.g = max;
            int i3 = (max > (-9223372036854775807L) ? 1 : (max == (-9223372036854775807L) ? 0 : -1));
            this.h = i3 != 0 ? max - max2 : -9223372036854775807L;
            if (m.h && (i3 == 0 || (i2 != 0 && max == j3))) {
                z2 = true;
            }
            this.i = z2;
            return;
        }
        throw new ri2(0);
    }

    @Override
    public final xnb f(int i, xnb xnbVar, boolean z) {
        this.e.f(0, xnbVar, z);
        long j = xnbVar.e - this.f;
        long j2 = this.h;
        long j3 = -9223372036854775807L;
        if (j2 != -9223372036854775807L) {
            j3 = j2 - j;
        }
        Object obj = xnbVar.a;
        Object obj2 = xnbVar.b;
        da daVar = da.c;
        xnbVar.h(obj, obj2, 0, j3, j, xnbVar.f);
        return xnbVar;
    }

    @Override
    public final znb m(int i, znb znbVar, long j) {
        this.e.m(0, znbVar, 0L);
        long j2 = znbVar.o;
        long j3 = this.f;
        znbVar.o = j2 + j3;
        znbVar.l = this.h;
        znbVar.h = this.i;
        long j4 = znbVar.k;
        if (j4 != -9223372036854775807L) {
            long max = Math.max(j4, j3);
            znbVar.k = max;
            long j5 = this.g;
            if (j5 != -9223372036854775807L) {
                max = Math.min(max, j5);
            }
            znbVar.k = max - j3;
        }
        long i0 = g8c.i0(j3);
        long j6 = znbVar.d;
        if (j6 != -9223372036854775807L) {
            znbVar.d = j6 + i0;
        }
        long j7 = znbVar.e;
        if (j7 != -9223372036854775807L) {
            znbVar.e = j7 + i0;
        }
        return znbVar;
    }
}
