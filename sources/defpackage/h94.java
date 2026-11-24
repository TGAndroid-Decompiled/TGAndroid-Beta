package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
public final class h94 {
    public final byte a;
    public final g94 b;
    public Interpolator c;
    public long d;
    public byte e;
    public float f;
    public float g;
    public boolean h;
    public ValueAnimator i;

    public h94(int i, g94 g94Var, Interpolator interpolator, long j, float f) {
        this.a = i;
        this.b = g94Var;
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
            g94 g94Var = this.b;
            if (i == 0) {
                g94Var.V(f2, b);
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
                g94Var.V(f, b);
                return;
            }
            this.g = f;
            DecelerateInterpolator decelerateInterpolator = uo.a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.i = ofFloat;
            ofFloat.setDuration(j);
            this.i.setInterpolator(this.c);
            this.i.addUpdateListener(new dz1(this, f2, f3, (byte) 3));
            this.i.addListener(new f94(this, f2, f3, (byte) 0));
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
        zo4.f();
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
            zo4.f();
        }
        return false;
    }

    public final void c(float f) {
        boolean b = b();
        if (!d(f, 1.0f) && !b) {
            return;
        }
        this.b.V(f, this.a);
    }

    public final boolean d(float f, float f2) {
        if (this.f != f) {
            this.f = f;
            this.b.D(this.a, f, f2, this);
            return true;
        }
        return false;
    }

    public h94(int i, g94 g94Var, Interpolator interpolator, long j) {
        this.a = i;
        this.b = g94Var;
        this.c = interpolator;
        this.d = j;
    }
}
