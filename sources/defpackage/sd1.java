package defpackage;

import android.animation.ValueAnimator;
import java.net.URL;
public final class sd1 {
    public int a;
    public long b;
    public Object c;

    public sd1(int i, URL url, long j) {
        this.a = i;
        this.c = url;
        this.b = j;
    }

    public final void a(mk0 mk0Var, ye9 ye9Var) {
        long j;
        boolean z;
        int i;
        int b = nxe.b(mk0Var);
        if (mk0Var != null) {
            j = mk0Var.a;
        } else {
            j = Long.MIN_VALUE;
        }
        if (j == this.b && this.a >= 0) {
            z = true;
        } else {
            z = false;
        }
        this.b = j;
        ValueAnimator valueAnimator = (ValueAnimator) this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.c = null;
        }
        if (z && (i = this.a) != b) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i, b);
            ofInt.addUpdateListener(new lk(this, ye9Var, (byte) 25));
            ofInt.setInterpolator(k43.f);
            ofInt.setDuration(200L);
            this.c = ofInt;
            ofInt.start();
            return;
        }
        this.a = b;
        ye9Var.j(b);
    }

    public final synchronized long b(int i) {
        if (i != 429 && (i < 500 || i >= 600)) {
            return 86400000L;
        }
        return (long) Math.min(Math.pow(2.0d, this.a) + ((long) (Math.random() * 1000.0d)), 1800000.0d);
    }

    public final synchronized boolean c() {
        boolean z;
        if (this.a != 0) {
            ((tcc) this.c).a.getClass();
            if (System.currentTimeMillis() <= this.b) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    public final synchronized void d() {
        this.a = 0;
    }

    public final synchronized void e(int i) {
        if ((i < 200 || i >= 300) && i != 401 && i != 404) {
            this.a++;
            long b = b(i);
            ((tcc) this.c).a.getClass();
            this.b = System.currentTimeMillis() + b;
            return;
        }
        d();
    }
}
