package defpackage;

import android.os.SystemClock;
public final class ie2 implements ck6 {
    public long a;
    public long b;
    public boolean c;
    public Object d;
    public Object e;

    public final void a(long j) {
        this.a = j;
        if (this.c) {
            ((adb) this.d).getClass();
            this.b = SystemClock.elapsedRealtime();
        }
    }

    @Override
    public final void b(zb8 zb8Var) {
        if (this.c) {
            a(h());
        }
        this.e = zb8Var;
    }

    public final void c() {
        if (!this.c) {
            ((adb) this.d).getClass();
            this.b = SystemClock.elapsedRealtime();
            this.c = true;
        }
    }

    @Override
    public final zb8 g() {
        return (zb8) this.e;
    }

    @Override
    public final long h() {
        long j;
        long j2 = this.a;
        if (this.c) {
            ((adb) this.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.b;
            zb8 zb8Var = (zb8) this.e;
            if (zb8Var.a == 1.0f) {
                j = g8c.T(elapsedRealtime);
            } else {
                j = elapsedRealtime * zb8Var.c;
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
