package me;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import ci.ya;
public final class e {
    public final int f16406a;
    public final d f16407b;
    public final Interpolator f16408c;
    public final long d;
    public float f16409e;
    public float f16410f;
    public boolean f16411g;
    public ValueAnimator h;

    public e(int i10, d dVar, Interpolator interpolator, long j3) {
        this.f16406a = i10;
        this.f16407b = dVar;
        this.f16408c = interpolator;
        this.d = j3;
    }

    public final void a(float f7) {
        long j3;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f16411g) {
                b();
            }
            float f10 = this.f16409e;
            int i10 = (f10 > f7 ? 1 : (f10 == f7 ? 0 : -1));
            int i11 = this.f16406a;
            d dVar = this.f16407b;
            if (i10 == 0) {
                dVar.A(f10, i11);
                return;
            }
            if (!this.f16411g) {
                this.f16411g = true;
            }
            float f11 = f7 - f10;
            if (Build.VERSION.SDK_INT >= 26 && !ValueAnimator.areAnimatorsEnabled()) {
                j3 = 0;
            } else {
                j3 = this.d;
            }
            if (j3 <= 0) {
                d(f7, 1.0f);
                if (this.f16411g) {
                    this.f16411g = false;
                }
                dVar.A(f7, i11);
                return;
            }
            this.f16410f = f7;
            DecelerateInterpolator decelerateInterpolator = le.a.f15540a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.setDuration(j3);
            this.h.setInterpolator(this.f16408c);
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
        if (!this.f16411g) {
            return false;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f16411g) {
                this.f16411g = false;
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
        this.f16407b.A(f7, this.f16406a);
    }

    public final boolean d(float f7, float f10) {
        if (this.f16409e != f7) {
            this.f16409e = f7;
            this.f16407b.n(this.f16406a, f7, f10, this);
            return true;
        }
        return false;
    }

    public e(int i10, d dVar, Interpolator interpolator, long j3, float f7) {
        this.f16406a = i10;
        this.f16407b = dVar;
        this.f16408c = interpolator;
        this.d = j3;
        this.f16409e = f7;
    }
}
