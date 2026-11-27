package defpackage;
public final class mj2 extends xo4 {
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;

    public mj2(asb asbVar, long j, long j2, boolean z) {
        super(asbVar);
        long max;
        int i = (j2 > Long.MIN_VALUE ? 1 : (j2 == Long.MIN_VALUE ? 0 : -1));
        if (i != 0 && j2 < j) {
            throw new nj2(j, 2, j2);
        }
        boolean z2 = false;
        if (asbVar.h() == 1) {
            zrb m = asbVar.m(0, new zrb(), 0L);
            long max2 = Math.max(0L, j);
            if (!z && !m.j && max2 != 0 && !m.g) {
                throw new nj2(1);
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
        throw new nj2(0);
    }

    @Override
    public final xrb f(int i, xrb xrbVar, boolean z) {
        this.e.f(0, xrbVar, z);
        long j = xrbVar.e - this.f;
        long j2 = this.h;
        long j3 = -9223372036854775807L;
        if (j2 != -9223372036854775807L) {
            j3 = j2 - j;
        }
        Object obj = xrbVar.a;
        Object obj2 = xrbVar.b;
        ea eaVar = ea.c;
        xrbVar.h(obj, obj2, 0, j3, j, xrbVar.f);
        return xrbVar;
    }

    @Override
    public final zrb m(int i, zrb zrbVar, long j) {
        this.e.m(0, zrbVar, 0L);
        long j2 = zrbVar.o;
        long j3 = this.f;
        zrbVar.o = j2 + j3;
        zrbVar.l = this.h;
        zrbVar.h = this.i;
        long j4 = zrbVar.k;
        if (j4 != -9223372036854775807L) {
            long max = Math.max(j4, j3);
            zrbVar.k = max;
            long j5 = this.g;
            if (j5 != -9223372036854775807L) {
                max = Math.min(max, j5);
            }
            zrbVar.k = max - j3;
        }
        long i0 = gcc.i0(j3);
        long j6 = zrbVar.d;
        if (j6 != -9223372036854775807L) {
            zrbVar.d = j6 + i0;
        }
        long j7 = zrbVar.e;
        if (j7 != -9223372036854775807L) {
            zrbVar.e = j7 + i0;
        }
        return zrbVar;
    }
}
