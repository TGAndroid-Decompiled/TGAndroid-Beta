package defpackage;

import android.os.SystemClock;
public final class tf2 implements fm6 {
    public long a;
    public long b;
    public boolean c;
    public Object d;
    public Object e;

    public final void a(long j) {
        this.a = j;
        if (this.c) {
            ((bfb) this.d).getClass();
            this.b = SystemClock.elapsedRealtime();
        }
    }

    @Override
    public final void b(ce8 ce8Var) {
        if (this.c) {
            a(h());
        }
        this.e = ce8Var;
    }

    public final void c() {
        if (!this.c) {
            ((bfb) this.d).getClass();
            this.b = SystemClock.elapsedRealtime();
            this.c = true;
        }
    }

    @Override
    public final ce8 g() {
        return (ce8) this.e;
    }

    @Override
    public final long h() {
        long j;
        long j2 = this.a;
        if (this.c) {
            ((bfb) this.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.b;
            ce8 ce8Var = (ce8) this.e;
            if (ce8Var.a == 1.0f) {
                j = hac.T(elapsedRealtime);
            } else {
                j = elapsedRealtime * ce8Var.c;
            }
            return j + j2;
        }
        return j2;
    }

    @Override
    public final boolean i() {
        return false;
    }
}
