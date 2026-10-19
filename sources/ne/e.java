package ne;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import ei.ja;
public final class e {
    public final int f17390a;
    public final d f17391b;
    public final Interpolator f17392c;
    public final long d;
    public float e;
    public float f17393f;
    public boolean f17394g;
    public ValueAnimator h;

    public e(int i10, d dVar, Interpolator interpolator, long j10) {
        this.f17390a = i10;
        this.f17391b = dVar;
        this.f17392c = interpolator;
        this.d = j10;
    }

    public final void a(float f7) {
        long j10;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f17394g) {
                b();
            }
            float f10 = this.e;
            int i10 = (f10 > f7 ? 1 : (f10 == f7 ? 0 : -1));
            int i11 = this.f17390a;
            d dVar = this.f17391b;
            if (i10 == 0) {
                dVar.H(f10, i11);
                return;
            }
            if (!this.f17394g) {
                this.f17394g = true;
            }
            float f11 = f7 - f10;
            if (Build.VERSION.SDK_INT >= 26 && !ValueAnimator.areAnimatorsEnabled()) {
                j10 = 0;
            } else {
                j10 = this.d;
            }
            if (j10 <= 0) {
                d(f7, 1.0f);
                if (this.f17394g) {
                    this.f17394g = false;
                }
                dVar.H(f7, i11);
                return;
            }
            this.f17393f = f7;
            DecelerateInterpolator decelerateInterpolator = me.a.f16855a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.setDuration(j10);
            this.h.setInterpolator(this.f17392c);
            this.h.addUpdateListener(new ja(this, f10, f11, 1));
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
        if (!this.f17394g) {
            return false;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f17394g) {
                this.f17394g = false;
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
        this.f17391b.H(f7, this.f17390a);
    }

    public final boolean d(float f7, float f10) {
        if (this.e != f7) {
            this.e = f7;
            this.f17391b.r(this.f17390a, f7, f10, this);
            return true;
        }
        return false;
    }

    public e(int i10, d dVar, Interpolator interpolator, long j10, float f7) {
        this.f17390a = i10;
        this.f17391b = dVar;
        this.f17392c = interpolator;
        this.d = j10;
        this.e = f7;
    }
}
