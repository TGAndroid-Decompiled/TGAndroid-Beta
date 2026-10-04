package le;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import ci.xa;
public final class e {
    public final int f15441a;
    public final d f15442b;
    public final Interpolator f15443c;
    public final long d;
    public float f15444e;
    public float f15445f;
    public boolean f15446g;
    public ValueAnimator h;

    public e(int i10, d dVar, Interpolator interpolator, long j3) {
        this.f15441a = i10;
        this.f15442b = dVar;
        this.f15443c = interpolator;
        this.d = j3;
    }

    public final void a(float f7) {
        long j3;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f15446g) {
                b();
            }
            float f10 = this.f15444e;
            int i10 = this.f15441a;
            d dVar = this.f15442b;
            if (f10 == f7) {
                dVar.V(f10, i10);
                return;
            }
            if (!this.f15446g) {
                this.f15446g = true;
            }
            float f11 = f7 - f10;
            if (Build.VERSION.SDK_INT >= 26 && !ValueAnimator.areAnimatorsEnabled()) {
                j3 = 0;
            } else {
                j3 = this.d;
            }
            if (j3 <= 0) {
                d(f7, 1.0f);
                if (this.f15446g) {
                    this.f15446g = false;
                }
                dVar.V(f7, i10);
                return;
            }
            this.f15445f = f7;
            DecelerateInterpolator decelerateInterpolator = ke.a.f14759a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.setDuration(j3);
            this.h.setInterpolator(this.f15443c);
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
        if (!this.f15446g) {
            return false;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f15446g) {
                this.f15446g = false;
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
        this.f15442b.V(f7, this.f15441a);
    }

    public final boolean d(float f7, float f10) {
        if (this.f15444e != f7) {
            this.f15444e = f7;
            this.f15442b.a0(this.f15441a, f7, f10, this);
            return true;
        }
        return false;
    }

    public e(int i10, d dVar, Interpolator interpolator, long j3, float f7) {
        this.f15441a = i10;
        this.f15442b = dVar;
        this.f15443c = interpolator;
        this.d = j3;
        this.f15444e = f7;
    }
}
