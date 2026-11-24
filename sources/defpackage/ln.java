package defpackage;

import android.os.SystemClock;
import android.view.View;
import android.view.animation.Interpolator;
public final class ln {
    public View a;
    public final Runnable b;
    public float c;
    public float d;
    public boolean e;
    public short f;
    public long g;
    public Interpolator h;
    public boolean i;
    public long j;
    public float k;

    public ln(float f, View view, long j, long j2, Interpolator interpolator) {
        this.f = (short) 0;
        this.g = 200L;
        d53 d53Var = d53.f;
        this.a = view;
        this.d = f;
        this.c = f;
        this.f = (int) j;
        this.g = j2;
        this.h = interpolator;
        this.e = false;
    }

    public final void a(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        e(true, f);
    }

    public final float b() {
        if (!this.i) {
            return 0.0f;
        }
        return pqe.a(((float) ((SystemClock.elapsedRealtime() - this.j) - this.f)) / ((float) this.g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a = pqe.a(((float) ((elapsedRealtime - this.j) - this.f)) / ((float) this.g), 0.0f, 1.0f);
            if (elapsedRealtime - this.j >= this.f) {
                Interpolator interpolator = this.h;
                float f = this.k;
                float f2 = this.d;
                if (interpolator == null) {
                    this.c = gm.R1(f, f2, a);
                } else {
                    this.c = gm.R1(f, f2, interpolator.getInterpolation(a));
                }
            }
            if (a >= 1.0f) {
                this.i = false;
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

    public final float d(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        return e(false, f);
    }

    public final float e(boolean z, float f) {
        if (!z && this.g > 0 && !this.e) {
            if (Math.abs(this.d - f) > 1.0E-4f) {
                this.i = true;
                this.d = f;
                this.k = this.c;
                this.j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f;
            this.c = f;
            this.i = false;
            this.e = false;
        }
        return c();
    }

    public final float f(boolean z, boolean z2) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        return e(z2, f);
    }

    public ln(long j, long j2, d53 d53Var) {
        this.f = (short) 0;
        this.g = 200L;
        d53 d53Var2 = d53.f;
        this.a = null;
        this.f = (int) j;
        this.g = j2;
        this.h = d53Var;
        this.e = true;
    }

    public ln(View view) {
        this.f = (short) 0;
        this.g = 200L;
        this.h = d53.f;
        this.a = view;
        this.e = true;
    }

    public ln(long j, View view, Interpolator interpolator) {
        this.f = (short) 0;
        this.g = 200L;
        d53 d53Var = d53.f;
        this.a = view;
        this.g = j;
        this.h = interpolator;
        this.e = true;
    }

    public ln(View view, long j, long j2, Interpolator interpolator) {
        this.f = (short) 0;
        this.g = 200L;
        d53 d53Var = d53.f;
        this.a = view;
        this.f = (int) j;
        this.g = j2;
        this.h = interpolator;
        this.e = true;
    }

    public ln(Runnable runnable) {
        this.f = (short) 0;
        this.g = 200L;
        this.h = d53.f;
        this.b = runnable;
        this.e = true;
    }

    public ln(Runnable runnable, long j, d53 d53Var) {
        this.f = (short) 0;
        this.g = 200L;
        d53 d53Var2 = d53.f;
        this.b = runnable;
        this.g = j;
        this.h = d53Var;
        this.e = true;
    }

    public ln(Runnable runnable, long j, d53 d53Var, int i) {
        this.f = (short) 0;
        this.g = 200L;
        d53 d53Var2 = d53.f;
        this.b = runnable;
        this.f = (short) 0;
        this.g = j;
        this.h = d53Var;
        this.e = true;
    }

    public ln(long j, Interpolator interpolator) {
        this.f = (short) 0;
        this.g = 200L;
        d53 d53Var = d53.f;
        this.a = null;
        this.g = j;
        this.h = interpolator;
        this.e = true;
    }

    public ln(float f, Runnable runnable, long j, long j2, d53 d53Var) {
        this.f = (short) 0;
        this.g = 200L;
        d53 d53Var2 = d53.f;
        this.b = runnable;
        this.d = f;
        this.c = f;
        this.f = (int) j;
        this.g = j2;
        this.h = d53Var;
        this.e = false;
    }
}
