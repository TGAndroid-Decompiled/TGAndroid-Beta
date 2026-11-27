package defpackage;

import android.os.SystemClock;
public final class ty0 implements lr7 {
    public long a;
    public long b;
    public Object c;
    public Object d;

    public ty0(long j, int i) {
        boolean z;
        if (((nj) this.c) == null) {
            z = true;
        } else {
            z = false;
        }
        yve.p(z);
        this.a = j;
        this.b = j + i;
    }

    @Override
    public final zy9 C() {
        boolean z;
        if (this.a != -1) {
            z = true;
        } else {
            z = false;
        }
        yve.p(z);
        return new qc0((gk4) this.c, this.a, (byte) 1);
    }

    public final fa4 a(int i, long j) {
        boolean z;
        String str;
        boolean z2;
        if (j != 0 && j == this.a) {
            z = true;
        } else {
            z = false;
        }
        for (int i2 : (int[]) this.d) {
            if (i2 == i) {
                z2 = true;
            } else {
                z2 = false;
            }
            z |= z2;
        }
        fa4 fa4Var = (fa4) this.c;
        if (z) {
            str = "opened";
        } else {
            str = "neighbour";
        }
        return new fa4(fa4Var.a, fa4Var.b, str);
    }

    public final void b(Exception exc) {
        boolean z;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.c) == null) {
            this.c = exc;
        }
        if (this.a == -9223372036854775807L) {
            ((n40) ((ja3) this.d).r).getClass();
            synchronized (l40.s) {
                if (l40.u > 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (!z) {
                this.a = 200 + elapsedRealtime;
            }
        }
        long j = this.a;
        if (j != -9223372036854775807L && elapsedRealtime >= j) {
            Exception exc2 = (Exception) this.c;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.c;
            this.c = null;
            this.a = -9223372036854775807L;
            this.b = -9223372036854775807L;
            throw exc3;
        }
        this.b = elapsedRealtime + 50;
    }

    @Override
    public final long p(cb3 cb3Var) {
        long j = this.b;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.b = -1L;
        return j2;
    }

    @Override
    public final void p0(long j) {
        long[] jArr = (long[]) ((lh2) this.d).b;
        this.b = jArr[gcc.f(jArr, j, true)];
    }

    public ty0(Object obj, Object obj2, long j, long j2) {
        this.c = obj;
        this.d = obj2;
        this.a = j;
        this.b = j2;
    }

    public ty0(ja3 ja3Var) {
        this.d = ja3Var;
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }
}
