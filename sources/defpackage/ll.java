package defpackage;

import android.os.SystemClock;
import android.view.View;
public final class ll {
    public final View a;
    public final Runnable b;
    public int c;
    public int d;
    public boolean e;
    public final short f;
    public final k43 g;
    public boolean h;
    public long i;
    public int j;

    public ll(View view, long j, k43 k43Var) {
        this.f = (short) 200;
        k43 k43Var2 = k43.f;
        this.a = view;
        this.f = (int) j;
        this.g = k43Var;
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
            float a = ete.a(((float) (elapsedRealtime - this.i)) / ((float) j), 0.0f, 1.0f);
            if (elapsedRealtime - this.i >= 0) {
                int i2 = this.j;
                int i3 = this.d;
                k43 k43Var = this.g;
                if (k43Var == null) {
                    this.c = vm2.f(a, i2, i3);
                } else {
                    this.c = vm2.f(k43Var.getInterpolation(a), i2, i3);
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

    public ll(View view) {
        this.f = (short) 200;
        this.g = k43.f;
        this.a = view;
        this.e = true;
    }

    public ll(View view, long j, k43 k43Var, int i) {
        this.f = (short) 200;
        k43 k43Var2 = k43.f;
        this.a = view;
        this.f = (int) j;
        this.g = k43Var;
        this.e = true;
    }

    public ll(Runnable runnable, long j, k43 k43Var) {
        this.f = (short) 200;
        k43 k43Var2 = k43.f;
        this.b = runnable;
        this.f = (int) j;
        this.g = k43Var;
        this.e = true;
    }
}
