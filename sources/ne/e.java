package ne;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import ei.ja;
public final class e {
    public final int f17384a;
    public final d f17385b;
    public final Interpolator f17386c;
    public final long d;
    public float e;
    public float f17387f;
    public boolean f17388g;
    public ValueAnimator h;

    public e(int i10, d dVar, Interpolator interpolator, long j10) {
        this.f17384a = i10;
        this.f17385b = dVar;
        this.f17386c = interpolator;
        this.d = j10;
    }

    public final void a(float f7) {
        long j10;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f17388g) {
                b();
            }
            float f10 = this.e;
            int i10 = (f10 > f7 ? 1 : (f10 == f7 ? 0 : -1));
            int i11 = this.f17384a;
            d dVar = this.f17385b;
            if (i10 == 0) {
                dVar.E(f10, i11);
                return;
            }
            if (!this.f17388g) {
                this.f17388g = true;
            }
            float f11 = f7 - f10;
            if (Build.VERSION.SDK_INT >= 26 && !ValueAnimator.areAnimatorsEnabled()) {
                j10 = 0;
            } else {
                j10 = this.d;
            }
            if (j10 <= 0) {
                d(f7, 1.0f);
                if (this.f17388g) {
                    this.f17388g = false;
                }
                dVar.E(f7, i11);
                return;
            }
            this.f17387f = f7;
            DecelerateInterpolator decelerateInterpolator = me.a.f16847a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.setDuration(j10);
            this.h.setInterpolator(this.f17386c);
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
        if (!this.f17388g) {
            return false;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f17388g) {
                this.f17388g = false;
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
        this.f17385b.E(f7, this.f17384a);
    }

    public final boolean d(float f7, float f10) {
        if (this.e != f7) {
            this.e = f7;
            this.f17385b.u(this.f17384a, f7, f10, this);
            return true;
        }
        return false;
    }

    public e(int i10, d dVar, Interpolator interpolator, long j10, float f7) {
        this.f17384a = i10;
        this.f17385b = dVar;
        this.f17386c = interpolator;
        this.d = j10;
        this.e = f7;
    }
}
