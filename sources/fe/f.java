package fe;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class f {
    public final int f7028a;
    public final e f7029b;
    public final Interpolator f7030c;
    public final long d;
    public long e;
    public float f7031f;
    public float f7032g;
    public boolean h;
    public ValueAnimator f7033i;

    public f(int i10, e eVar, Interpolator interpolator, long j10) {
        this.f7028a = i10;
        this.f7029b = eVar;
        this.f7030c = interpolator;
        this.d = j10;
    }

    public final void a(float f7) {
        long j10;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.h) {
                b();
            }
            float f10 = this.f7031f;
            int i10 = (f10 > f7 ? 1 : (f10 == f7 ? 0 : -1));
            int i11 = this.f7028a;
            e eVar = this.f7029b;
            if (i10 == 0) {
                eVar.E(f10, i11);
                return;
            }
            if (!this.h) {
                this.h = true;
            }
            float f11 = f7 - f10;
            if (Build.VERSION.SDK_INT >= 26 && !ValueAnimator.areAnimatorsEnabled()) {
                j10 = 0;
            } else {
                j10 = this.d;
            }
            if (j10 <= 0) {
                d(f7, 1.0f);
                if (this.h) {
                    this.h = false;
                }
                eVar.E(f7, i11);
                return;
            }
            this.f7032g = f7;
            DecelerateInterpolator decelerateInterpolator = ee.a.f6489a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f7033i = ofFloat;
            ofFloat.setDuration(j10);
            this.f7033i.setInterpolator(this.f7030c);
            this.f7033i.addUpdateListener(new c(this, f10, f11, 0));
            this.f7033i.addListener(new d(this, f10, f11, 0));
            long j11 = this.e;
            if (j11 != 0) {
                this.f7033i.setStartDelay(j11);
            }
            try {
                this.f7033i.start();
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
        if (!this.h) {
            return false;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.h) {
                this.h = false;
            }
            ValueAnimator valueAnimator = this.f7033i;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f7033i = null;
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
        this.f7029b.E(f7, this.f7028a);
    }

    public final boolean d(float f7, float f10) {
        if (this.f7031f != f7) {
            this.f7031f = f7;
            this.f7029b.v(this.f7028a, f7, f10, this);
            return true;
        }
        return false;
    }

    public f(int i10, e eVar, Interpolator interpolator, long j10, float f7) {
        this.f7028a = i10;
        this.f7029b = eVar;
        this.f7030c = interpolator;
        this.d = j10;
        this.f7031f = f7;
    }
}
