package defpackage;

import java.math.RoundingMode;
import java.util.ArrayList;
public abstract class rx9 extends wx9 {
    public final long d;
    public final long e;
    public final ArrayList f;
    public final long g;
    public final long h;
    public final long i;

    public rx9(b19 b19Var, long j, long j2, long j3, long j4, ArrayList arrayList, long j5, long j6, long j7) {
        super(b19Var, j, j2);
        this.d = j3;
        this.e = j4;
        this.f = arrayList;
        this.i = j5;
        this.g = j6;
        this.h = j7;
    }

    public final long c(long j, long j2) {
        long e = e(j);
        if (e != -1) {
            return e;
        }
        return (int) (g((j2 - this.h) + this.i, j) - d(j, j2));
    }

    public final long d(long j, long j2) {
        int i = (e(j) > (-1L) ? 1 : (e(j) == (-1L) ? 0 : -1));
        long j3 = this.d;
        if (i == 0) {
            long j4 = this.g;
            if (j4 != -9223372036854775807L) {
                return Math.max(j3, g((j2 - this.h) - j4, j));
            }
        }
        return j3;
    }

    public abstract long e(long j);

    public final long f(long j, long j2) {
        long j3 = this.b;
        long j4 = this.d;
        ArrayList arrayList = this.f;
        if (arrayList != null) {
            return (((ux9) arrayList.get((int) (j - j4))).b * 1000000) / j3;
        }
        long e = e(j2);
        if (e != -1 && j == (j4 + e) - 1) {
            return j2 - h(j);
        }
        return (this.e * 1000000) / j3;
    }

    public final long g(long j, long j2) {
        long e = e(j2);
        int i = (e > 0L ? 1 : (e == 0L ? 0 : -1));
        long j3 = this.d;
        if (i != 0) {
            if (this.f == null) {
                long j4 = (j / ((this.e * 1000000) / this.b)) + j3;
                if (j4 >= j3) {
                    if (e == -1) {
                        return j4;
                    }
                    return Math.min(j4, (j3 + e) - 1);
                }
            } else {
                long j5 = (e + j3) - 1;
                long j6 = j3;
                while (j6 <= j5) {
                    long j7 = ((j5 - j6) / 2) + j6;
                    int i2 = (h(j7) > j ? 1 : (h(j7) == j ? 0 : -1));
                    if (i2 < 0) {
                        j6 = j7 + 1;
                    } else if (i2 > 0) {
                        j5 = j7 - 1;
                    } else {
                        return j7;
                    }
                }
                if (j6 == j3) {
                    return j6;
                }
                return j5;
            }
        }
        return j3;
    }

    public final long h(long j) {
        long j2;
        ArrayList arrayList = this.f;
        long j3 = j - this.d;
        if (arrayList != null) {
            j2 = ((ux9) arrayList.get((int) j3)).a - this.c;
        } else {
            j2 = j3 * this.e;
        }
        long j4 = j2;
        String str = hac.a;
        return hac.b0(j4, 1000000L, this.b, RoundingMode.DOWN);
    }

    public abstract b19 i(ia9 ia9Var, long j);

    public boolean j() {
        if (this.f != null) {
            return true;
        }
        return false;
    }
}
