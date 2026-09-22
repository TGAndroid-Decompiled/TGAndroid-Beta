package le;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import ci.bb;
public final class e {
    public final int f13977a;
    public final d f13978b;
    public final Interpolator f13979c;
    public final long d;
    public float e;
    public float f13980f;
    public boolean f13981g;
    public ValueAnimator h;

    public e(int i10, d dVar, Interpolator interpolator, long j3) {
        this.f13977a = i10;
        this.f13978b = dVar;
        this.f13979c = interpolator;
        this.d = j3;
    }

    public final void a(float f7) {
        long j3;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f13981g) {
                b();
            }
            float f10 = this.e;
            int i10 = this.f13977a;
            d dVar = this.f13978b;
            if (f10 == f7) {
                dVar.C(f10, i10);
                return;
            }
            if (!this.f13981g) {
                this.f13981g = true;
            }
            float f11 = f7 - f10;
            if (Build.VERSION.SDK_INT >= 26 && !ValueAnimator.areAnimatorsEnabled()) {
                j3 = 0;
            } else {
                j3 = this.d;
            }
            if (j3 <= 0) {
                d(f7, 1.0f);
                if (this.f13981g) {
                    this.f13981g = false;
                }
                dVar.C(f7, i10);
                return;
            }
            this.f13980f = f7;
            DecelerateInterpolator decelerateInterpolator = ke.a.f13589a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.setDuration(j3);
            this.h.setInterpolator(this.f13979c);
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
        if (!this.f13981g) {
            return false;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f13981g) {
                this.f13981g = false;
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
        this.f13978b.C(f7, this.f13977a);
    }

    public final boolean d(float f7, float f10) {
        if (this.e != f7) {
            this.e = f7;
            this.f13978b.D(this.f13977a, f7, f10, this);
            return true;
        }
        return false;
    }

    public e(int i10, d dVar, Interpolator interpolator, long j3, float f7) {
        this.f13977a = i10;
        this.f13978b = dVar;
        this.f13979c = interpolator;
        this.d = j3;
        this.e = f7;
    }
}
