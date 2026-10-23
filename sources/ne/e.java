package ne;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import ei.ja;
public final class e {
    public final int f17451a;
    public final d f17452b;
    public final Interpolator f17453c;
    public final long d;
    public float e;
    public float f17454f;
    public boolean f17455g;
    public ValueAnimator h;

    public e(int i10, d dVar, Interpolator interpolator, long j10) {
        this.f17451a = i10;
        this.f17452b = dVar;
        this.f17453c = interpolator;
        this.d = j10;
    }

    public final void a(float f7) {
        long j10;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f17455g) {
                b();
            }
            float f10 = this.e;
            int i10 = (f10 > f7 ? 1 : (f10 == f7 ? 0 : -1));
            int i11 = this.f17451a;
            d dVar = this.f17452b;
            if (i10 == 0) {
                dVar.H(f10, i11);
                return;
            }
            if (!this.f17455g) {
                this.f17455g = true;
            }
            float f11 = f7 - f10;
            if (Build.VERSION.SDK_INT >= 26 && !ValueAnimator.areAnimatorsEnabled()) {
                j10 = 0;
            } else {
                j10 = this.d;
            }
            if (j10 <= 0) {
                d(f7, 1.0f);
                if (this.f17455g) {
                    this.f17455g = false;
                }
                dVar.H(f7, i11);
                return;
            }
            this.f17454f = f7;
            DecelerateInterpolator decelerateInterpolator = me.a.f16916a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.setDuration(j10);
            this.h.setInterpolator(this.f17453c);
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
        if (!this.f17455g) {
            return false;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f17455g) {
                this.f17455g = false;
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
        this.f17452b.H(f7, this.f17451a);
    }

    public final boolean d(float f7, float f10) {
        if (this.e != f7) {
            this.e = f7;
            this.f17452b.o(this.f17451a, f7, f10, this);
            return true;
        }
        return false;
    }

    public e(int i10, d dVar, Interpolator interpolator, long j10, float f7) {
        this.f17451a = i10;
        this.f17452b = dVar;
        this.f17453c = interpolator;
        this.d = j10;
        this.e = f7;
    }
}
