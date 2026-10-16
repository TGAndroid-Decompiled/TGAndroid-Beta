package ne;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import di.xa;
public final class e {
    public final int f16008a;
    public final d f16009b;
    public final Interpolator f16010c;
    public final long d;
    public float e;
    public float f16011f;
    public boolean f16012g;
    public ValueAnimator h;

    public e(int i10, d dVar, Interpolator interpolator, long j10) {
        this.f16008a = i10;
        this.f16009b = dVar;
        this.f16010c = interpolator;
        this.d = j10;
    }

    public final void a(float f7) {
        long j10;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f16012g) {
                b();
            }
            float f10 = this.e;
            int i10 = (f10 > f7 ? 1 : (f10 == f7 ? 0 : -1));
            int i11 = this.f16008a;
            d dVar = this.f16009b;
            if (i10 == 0) {
                dVar.A(f10, i11);
                return;
            }
            if (!this.f16012g) {
                this.f16012g = true;
            }
            float f11 = f7 - f10;
            if (Build.VERSION.SDK_INT >= 26 && !ValueAnimator.areAnimatorsEnabled()) {
                j10 = 0;
            } else {
                j10 = this.d;
            }
            if (j10 <= 0) {
                d(f7, 1.0f);
                if (this.f16012g) {
                    this.f16012g = false;
                }
                dVar.A(f7, i11);
                return;
            }
            this.f16011f = f7;
            DecelerateInterpolator decelerateInterpolator = me.a.f15495a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.setDuration(j10);
            this.h.setInterpolator(this.f16010c);
            this.h.addUpdateListener(new xa(this, f10, f11, 1));
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
        if (!this.f16012g) {
            return false;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f16012g) {
                this.f16012g = false;
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
        this.f16009b.A(f7, this.f16008a);
    }

    public final boolean d(float f7, float f10) {
        if (this.e != f7) {
            this.e = f7;
            this.f16009b.p(this.f16008a, f7, f10, this);
            return true;
        }
        return false;
    }

    public e(int i10, d dVar, Interpolator interpolator, long j10, float f7) {
        this.f16008a = i10;
        this.f16009b = dVar;
        this.f16010c = interpolator;
        this.d = j10;
        this.e = f7;
    }
}
