package defpackage;

import android.os.SystemClock;
public final class ze2 implements hm6 {
    public long a;
    public long b;
    public boolean c;
    public Object d;
    public Object e;

    public final void a(long j) {
        this.a = j;
        if (this.c) {
            ((vgb) this.d).getClass();
            this.b = SystemClock.elapsedRealtime();
        }
    }

    public final void b() {
        if (!this.c) {
            ((vgb) this.d).getClass();
            this.b = SystemClock.elapsedRealtime();
            this.c = true;
        }
    }

    @Override
    public final void c(of8 of8Var) {
        if (this.c) {
            a(g());
        }
        this.e = of8Var;
    }

    @Override
    public final of8 f() {
        return (of8) this.e;
    }

    @Override
    public final long g() {
        long j;
        long j2 = this.a;
        if (this.c) {
            ((vgb) this.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.b;
            of8 of8Var = (of8) this.e;
            if (of8Var.a == 1.0f) {
                j = gcc.T(elapsedRealtime);
            } else {
                j = elapsedRealtime * of8Var.c;
            }
            return j + j2;
        }
        return j2;
    }

    @Override
    public final boolean h() {
        return false;
    }
}
