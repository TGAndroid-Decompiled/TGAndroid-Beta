package defpackage;

import android.os.SystemClock;
import android.view.View;
public final class kl {
    public final View a;
    public final Runnable b;
    public int c;
    public int d;
    public boolean e;
    public final short f;
    public final s33 g;
    public boolean h;
    public long i;
    public int j;

    public kl(View view, long j, s33 s33Var) {
        this.f = (short) 200;
        s33 s33Var2 = s33.f;
        this.a = view;
        this.f = (int) j;
        this.g = s33Var;
        this.e = true;
    }

    public final int a(int i, boolean z) {
        long j = this.f;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!z && j > 0 && !this.e) {
            if (this.d != i) {
                this.h = true;
                this.d = i;
                this.j = this.c;
                this.i = elapsedRealtime;
            }
        } else {
            this.d = i;
            this.c = i;
            this.h = false;
            this.e = false;
        }
        if (this.h) {
            float a = moe.a(((float) (elapsedRealtime - this.i)) / ((float) j), 0.0f, 1.0f);
            if (elapsedRealtime - this.i >= 0) {
                int i2 = this.j;
                int i3 = this.d;
                s33 s33Var = this.g;
                if (s33Var == null) {
                    this.c = bm2.f(a, i2, i3);
                } else {
                    this.c = bm2.f(s33Var.getInterpolation(a), i2, i3);
                }
            }
            if (a >= 1.0f) {
                this.h = false;
            } else {
                View view = this.a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.c;
    }

    public kl(View view) {
        this.f = (short) 200;
        this.g = s33.f;
        this.a = view;
        this.e = true;
    }

    public kl(View view, long j, s33 s33Var, int i) {
        this.f = (short) 200;
        s33 s33Var2 = s33.f;
        this.a = view;
        this.f = (int) j;
        this.g = s33Var;
        this.e = true;
    }

    public kl(Runnable runnable, long j, s33 s33Var) {
        this.f = (short) 200;
        s33 s33Var2 = s33.f;
        this.b = runnable;
        this.f = (int) j;
        this.g = s33Var;
        this.e = true;
    }
}
