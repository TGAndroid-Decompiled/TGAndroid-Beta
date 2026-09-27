package le;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import ci.xa;
public final class f {
    public final int f14207a;
    public final e f14208b;
    public final Interpolator f14209c;
    public final long d;
    public float e;
    public float f14210f;
    public boolean f14211g;
    public ValueAnimator h;

    public f(int i10, e eVar, Interpolator interpolator, long j3) {
        this.f14207a = i10;
        this.f14208b = eVar;
        this.f14209c = interpolator;
        this.d = j3;
    }

    public final void a(float f7) {
        long j3;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f14211g) {
                b();
            }
            float f10 = this.e;
            int i10 = this.f14207a;
            e eVar = this.f14208b;
            if (f10 == f7) {
                eVar.C(f10, i10);
                return;
            }
            if (!this.f14211g) {
                this.f14211g = true;
            }
            float f11 = f7 - f10;
            if (Build.VERSION.SDK_INT >= 26 && !ValueAnimator.areAnimatorsEnabled()) {
                j3 = 0;
            } else {
                j3 = this.d;
            }
            if (j3 <= 0) {
                d(f7, 1.0f);
                if (this.f14211g) {
                    this.f14211g = false;
                }
                eVar.C(f7, i10);
                return;
            }
            this.f14210f = f7;
            DecelerateInterpolator decelerateInterpolator = ke.a.f13577a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.setDuration(j3);
            this.h.setInterpolator(this.f14209c);
            this.h.addUpdateListener(new xa(this, f10, f11, 1));
            this.h.addListener(new d(this, f10, f11, 0));
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
        if (!this.f14211g) {
            return false;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f14211g) {
                this.f14211g = false;
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
        this.f14208b.C(f7, this.f14207a);
    }

    public final boolean d(float f7, float f10) {
        if (this.e != f7) {
            this.e = f7;
            this.f14208b.D(this.f14207a, f7, f10, this);
            return true;
        }
        return false;
    }

    public f(int i10, e eVar, Interpolator interpolator, long j3, float f7) {
        this.f14207a = i10;
        this.f14208b = eVar;
        this.f14209c = interpolator;
        this.d = j3;
        this.e = f7;
    }
}
