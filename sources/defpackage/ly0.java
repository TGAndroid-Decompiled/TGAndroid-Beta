package defpackage;

import android.os.SystemClock;
public final class ly0 implements lo7 {
    public long a;
    public long b;
    public Object c;
    public Object d;

    public ly0(long j, int i) {
        boolean z;
        if (((mj) this.c) == null) {
            z = true;
        } else {
            z = false;
        }
        gre.p(z);
        this.a = j;
        this.b = j + i;
    }

    public final void a(Exception exc) {
        boolean z;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.c) == null) {
            this.c = exc;
        }
        if (this.a == -9223372036854775807L) {
            ((l40) ((q93) this.d).r).getClass();
            synchronized (j40.s) {
                if (j40.u > 0) {
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
    public final long h(ja3 ja3Var) {
        long j = this.b;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.b = -1L;
        return j2;
    }

    @Override
    public final void j0(long j) {
        long[] jArr = (long[]) ((lv6) this.d).b;
        this.b = jArr[g8c.f(jArr, j, true)];
    }

    @Override
    public final fv9 k() {
        boolean z;
        if (this.a != -1) {
            z = true;
        } else {
            z = false;
        }
        gre.p(z);
        return new oc0((ci4) this.c, this.a, (byte) 1);
    }

    public ly0(q93 q93Var) {
        this.d = q93Var;
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }

    public ly0(String str, byte[] bArr, long j, long j2) {
        this.c = str;
        this.d = bArr;
        this.a = j;
        this.b = j2;
    }
}
