package me;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import ci.ya;
public final class e {
    public final int f16342a;
    public final d f16343b;
    public final Interpolator f16344c;
    public final long d;
    public float f16345e;
    public float f16346f;
    public boolean f16347g;
    public ValueAnimator h;

    public e(int i10, d dVar, Interpolator interpolator, long j3) {
        this.f16342a = i10;
        this.f16343b = dVar;
        this.f16344c = interpolator;
        this.d = j3;
    }

    public final void a(float f7) {
        long j3;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f16347g) {
                b();
            }
            float f10 = this.f16345e;
            int i10 = (f10 > f7 ? 1 : (f10 == f7 ? 0 : -1));
            int i11 = this.f16342a;
            d dVar = this.f16343b;
            if (i10 == 0) {
                dVar.A(f10, i11);
                return;
            }
            if (!this.f16347g) {
                this.f16347g = true;
            }
            float f11 = f7 - f10;
            if (Build.VERSION.SDK_INT >= 26 && !ValueAnimator.areAnimatorsEnabled()) {
                j3 = 0;
            } else {
                j3 = this.d;
            }
            if (j3 <= 0) {
                d(f7, 1.0f);
                if (this.f16347g) {
                    this.f16347g = false;
                }
                dVar.A(f7, i11);
                return;
            }
            this.f16346f = f7;
            DecelerateInterpolator decelerateInterpolator = le.a.f15501a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.setDuration(j3);
            this.h.setInterpolator(this.f16344c);
            this.h.addUpdateListener(new ya(this, f10, f11, 1));
            this.h.addListener(new c(this, f10, f11, 0));
            try {
                this.h.start();
                return;
            } catch (Throwable th2) {
                Log.e("tgx", "Cannot start animation", th2);
                c(f7);
                return;
            }
        }
        throw new AssertionError();
    }

    public final boolean b() {
        if (!this.f16347g) {
            return false;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f16347g) {
                this.f16347g = false;
            }
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.h = null;
                return true;
            }
            return true;
        }
        throw new AssertionError();
    }

    public final void c(float f7) {
        boolean b10 = b();
        if (!d(f7, 1.0f) && !b10) {
            return;
        }
        this.f16343b.A(f7, this.f16342a);
    }

    public final boolean d(float f7, float f10) {
        if (this.f16345e != f7) {
            this.f16345e = f7;
            this.f16343b.n(this.f16342a, f7, f10, this);
            return true;
        }
        return false;
    }

    public e(int i10, d dVar, Interpolator interpolator, long j3, float f7) {
        this.f16342a = i10;
        this.f16343b = dVar;
        this.f16344c = interpolator;
        this.d = j3;
        this.f16345e = f7;
    }
}
