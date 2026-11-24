package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class y74 {
    public final byte a;
    public final x74 b;
    public Interpolator c;
    public long d;
    public byte e;
    public float f;
    public float g;
    public boolean h;
    public ValueAnimator i;

    public y74(int i, x74 x74Var, Interpolator interpolator, long j, float f) {
        this.a = i;
        this.b = x74Var;
        this.c = interpolator;
        this.d = j;
        this.f = f;
    }

    public final void a(float f) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.h) {
                b();
            }
            float f2 = this.f;
            int i = (f2 > f ? 1 : (f2 == f ? 0 : -1));
            byte b = this.a;
            x74 x74Var = this.b;
            if (i == 0) {
                x74Var.F(f2, b);
                return;
            }
            if (!this.h) {
                this.h = true;
            }
            float f3 = f - f2;
            long j = this.d;
            if (Build.VERSION.SDK_INT >= 26 && !ValueAnimator.areAnimatorsEnabled()) {
                j = 0;
            }
            if (j <= 0) {
                d(f, 1.0f);
                if (this.h) {
                    this.h = false;
                }
                x74Var.F(f, b);
                return;
            }
            this.g = f;
            DecelerateInterpolator decelerateInterpolator = tn.a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.i = ofFloat;
            ofFloat.setDuration(j);
            this.i.setInterpolator(this.c);
            this.i.addUpdateListener(new qx1(this, f2, f3, (byte) 3));
            this.i.addListener(new w74(this, f2, f3, (byte) 0));
            long j2 = this.e;
            if (j2 != 0) {
                this.i.setStartDelay(j2);
            }
            try {
                this.i.start();
                return;
            } catch (Throwable th) {
                Log.e("tgx", "Cannot start animation", th);
                c(f);
                return;
            }
        }
        wn4.f();
    }

    public final boolean b() {
        if (this.h) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.h) {
                    this.h = false;
                }
                ValueAnimator valueAnimator = this.i;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.i = null;
                    return true;
                }
                return true;
            }
            wn4.f();
        }
        return false;
    }

    public final void c(float f) {
        boolean b = b();
        if (!d(f, 1.0f) && !b) {
            return;
        }
        this.b.F(f, this.a);
    }

    public final boolean d(float f, float f2) {
        if (this.f != f) {
            this.f = f;
            this.b.p(this.a, f, f2, this);
            return true;
        }
        return false;
    }

    public y74(int i, x74 x74Var, Interpolator interpolator, long j) {
        this.a = i;
        this.b = x74Var;
        this.c = interpolator;
        this.d = j;
    }
}
