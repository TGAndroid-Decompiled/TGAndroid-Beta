package defpackage;

import android.os.SystemClock;
public final class sz0 implements oq7 {
    public long a;
    public long b;
    public Object c;
    public Object d;

    public sz0(long j, int i) {
        boolean z;
        if (((mk) this.c) == null) {
            z = true;
        } else {
            z = false;
        }
        jte.p(z);
        this.a = j;
        this.b = j + i;
    }

    @Override
    public final ix9 D() {
        boolean z;
        if (this.a != -1) {
            z = true;
        } else {
            z = false;
        }
        jte.p(z);
        return new od0((gk4) this.c, this.a, (byte) 1);
    }

    public final void a(Exception exc) {
        boolean z;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.c) == null) {
            this.c = exc;
        }
        if (this.a == -9223372036854775807L) {
            ((l50) ((cb3) this.d).r).getClass();
            synchronized (j50.s) {
                if (j50.u > 0) {
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
    public final long p(vb3 vb3Var) {
        long j = this.b;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.b = -1L;
        return j2;
    }

    @Override
    public final void u0(long j) {
        long[] jArr = (long[]) ((lx6) this.d).b;
        this.b = jArr[hac.f(jArr, j, true)];
    }

    public sz0(cb3 cb3Var) {
        this.d = cb3Var;
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }

    public sz0(String str, byte[] bArr, long j, long j2) {
        this.c = str;
        this.d = bArr;
        this.a = j;
        this.b = j2;
    }
}
