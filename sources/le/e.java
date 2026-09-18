package le;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import ci.bb;
public final class e {
    public final int f14135a;
    public final d f14136b;
    public final Interpolator f14137c;
    public final long d;
    public float e;
    public float f14138f;
    public boolean f14139g;
    public ValueAnimator h;

    public e(int i10, d dVar, Interpolator interpolator, long j3) {
        this.f14135a = i10;
        this.f14136b = dVar;
        this.f14137c = interpolator;
        this.d = j3;
    }

    public final void a(float f7) {
        long j3;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f14139g) {
                b();
            }
            float f10 = this.e;
            int i10 = this.f14135a;
            d dVar = this.f14136b;
            if (f10 == f7) {
                dVar.C(f10, i10);
                return;
            }
            if (!this.f14139g) {
                this.f14139g = true;
            }
            float f11 = f7 - f10;
            if (Build.VERSION.SDK_INT >= 26 && !ValueAnimator.areAnimatorsEnabled()) {
                j3 = 0;
            } else {
                j3 = this.d;
            }
            if (j3 <= 0) {
                d(f7, 1.0f);
                if (this.f14139g) {
                    this.f14139g = false;
                }
                dVar.C(f7, i10);
                return;
            }
            this.f14138f = f7;
            DecelerateInterpolator decelerateInterpolator = ke.a.f13588a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.setDuration(j3);
            this.h.setInterpolator(this.f14137c);
            this.h.addUpdateListener(new bb(this, f10, f11, 1));
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
        if (!this.f14139g) {
            return false;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f14139g) {
                this.f14139g = false;
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
        this.f14136b.C(f7, this.f14135a);
    }

    public final boolean d(float f7, float f10) {
        if (this.e != f7) {
            this.e = f7;
            this.f14136b.D(this.f14135a, f7, f10, this);
            return true;
        }
        return false;
    }

    public e(int i10, d dVar, Interpolator interpolator, long j3, float f7) {
        this.f14135a = i10;
        this.f14136b = dVar;
        this.f14137c = interpolator;
        this.d = j3;
        this.e = f7;
    }
}
