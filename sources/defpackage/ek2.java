package defpackage;
public final class ek2 extends to4 {
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;

    public ek2(bqb bqbVar, long j, long j2, boolean z) {
        super(bqbVar);
        long max;
        int i = (j2 > Long.MIN_VALUE ? 1 : (j2 == Long.MIN_VALUE ? 0 : -1));
        if (i != 0 && j2 < j) {
            throw new fk2(j, 2, j2);
        }
        boolean z2 = false;
        if (bqbVar.h() == 1) {
            aqb m = bqbVar.m(0, new aqb(), 0L);
            long max2 = Math.max(0L, j);
            if (!z && !m.j && max2 != 0 && !m.g) {
                throw new fk2(1);
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
        throw new fk2(0);
    }

    @Override
    public final ypb f(int i, ypb ypbVar, boolean z) {
        this.e.f(0, ypbVar, z);
        long j = ypbVar.e - this.f;
        long j2 = this.h;
        long j3 = -9223372036854775807L;
        if (j2 != -9223372036854775807L) {
            j3 = j2 - j;
        }
        Object obj = ypbVar.a;
        Object obj2 = ypbVar.b;
        da daVar = da.c;
        ypbVar.h(obj, obj2, 0, j3, j, ypbVar.f);
        return ypbVar;
    }

    @Override
    public final aqb m(int i, aqb aqbVar, long j) {
        this.e.m(0, aqbVar, 0L);
        long j2 = aqbVar.o;
        long j3 = this.f;
        aqbVar.o = j2 + j3;
        aqbVar.l = this.h;
        aqbVar.h = this.i;
        long j4 = aqbVar.k;
        if (j4 != -9223372036854775807L) {
            long max = Math.max(j4, j3);
            aqbVar.k = max;
            long j5 = this.g;
            if (j5 != -9223372036854775807L) {
                max = Math.min(max, j5);
            }
            aqbVar.k = max - j3;
        }
        long i0 = hac.i0(j3);
        long j6 = aqbVar.d;
        if (j6 != -9223372036854775807L) {
            aqbVar.d = j6 + i0;
        }
        long j7 = aqbVar.e;
        if (j7 != -9223372036854775807L) {
            aqbVar.e = j7 + i0;
        }
        return aqbVar;
    }
}
