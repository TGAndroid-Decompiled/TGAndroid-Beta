package ne;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import di.xa;
public final class e {
    public final int f16297a;
    public final d f16298b;
    public final Interpolator f16299c;
    public final long d;
    public float e;
    public float f16300f;
    public boolean f16301g;
    public ValueAnimator h;

    public e(int i10, d dVar, Interpolator interpolator, long j10) {
        this.f16297a = i10;
        this.f16298b = dVar;
        this.f16299c = interpolator;
        this.d = j10;
    }

    public final void a(float f7) {
        long j10;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f16301g) {
                b();
            }
            float f10 = this.e;
            int i10 = (f10 > f7 ? 1 : (f10 == f7 ? 0 : -1));
            int i11 = this.f16297a;
            d dVar = this.f16298b;
            if (i10 == 0) {
                dVar.C(f10, i11);
                return;
            }
            if (!this.f16301g) {
                this.f16301g = true;
            }
            float f11 = f7 - f10;
            if (Build.VERSION.SDK_INT >= 26 && !ValueAnimator.areAnimatorsEnabled()) {
                j10 = 0;
            } else {
                j10 = this.d;
            }
            if (j10 <= 0) {
                d(f7, 1.0f);
                if (this.f16301g) {
                    this.f16301g = false;
                }
                dVar.C(f7, i11);
                return;
            }
            this.f16300f = f7;
            DecelerateInterpolator decelerateInterpolator = me.a.f15760a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.setDuration(j10);
            this.h.setInterpolator(this.f16299c);
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
        if (!this.f16301g) {
            return false;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f16301g) {
                this.f16301g = false;
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
        this.f16298b.C(f7, this.f16297a);
    }

    public final boolean d(float f7, float f10) {
        if (this.e != f7) {
            this.e = f7;
            this.f16298b.p(this.f16297a, f7, f10, this);
            return true;
        }
        return false;
    }

    public e(int i10, d dVar, Interpolator interpolator, long j10, float f7) {
        this.f16297a = i10;
        this.f16298b = dVar;
        this.f16299c = interpolator;
        this.d = j10;
        this.e = f7;
    }
}
