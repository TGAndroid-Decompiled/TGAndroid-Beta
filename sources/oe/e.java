package oe;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import fi.fa;
public final class e {
    public final int f19330a;
    public final d f19331b;
    public final Interpolator f19332c;
    public final long d;
    public long e;
    public float f19333f;
    public float f19334g;
    public boolean h;
    public ValueAnimator f19335i;

    public e(int i10, d dVar, Interpolator interpolator, long j10) {
        this.f19330a = i10;
        this.f19331b = dVar;
        this.f19332c = interpolator;
        this.d = j10;
    }

    public final void a(float f7) {
        long j10;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.h) {
                b();
            }
            float f10 = this.f19333f;
            int i10 = (f10 > f7 ? 1 : (f10 == f7 ? 0 : -1));
            int i11 = this.f19330a;
            d dVar = this.f19331b;
            if (i10 == 0) {
                dVar.z(f10, i11);
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
                dVar.z(f7, i11);
                return;
            }
            this.f19334g = f7;
            DecelerateInterpolator decelerateInterpolator = ne.a.f18778a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f19335i = ofFloat;
            ofFloat.setDuration(j10);
            this.f19335i.setInterpolator(this.f19332c);
            this.f19335i.addUpdateListener(new fa(this, f10, f11, 1));
            this.f19335i.addListener(new c(this, f10, f11, 0));
            long j11 = this.e;
            if (j11 != 0) {
                this.f19335i.setStartDelay(j11);
            }
            try {
                this.f19335i.start();
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
            ValueAnimator valueAnimator = this.f19335i;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f19335i = null;
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
        this.f19331b.z(f7, this.f19330a);
    }

    public final boolean d(float f7, float f10) {
        if (this.f19333f != f7) {
            this.f19333f = f7;
            this.f19331b.E(this.f19330a, f7, f10, this);
            return true;
        }
        return false;
    }

    public e(int i10, d dVar, Interpolator interpolator, long j10, float f7) {
        this.f19330a = i10;
        this.f19331b = dVar;
        this.f19332c = interpolator;
        this.d = j10;
        this.f19333f = f7;
    }
}
