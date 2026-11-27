package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class v41 {
    public View a;
    public final float b;
    public final float c;
    public final float d;
    public byte e;
    public Runnable f;
    public ValueAnimator g;
    public final float h;
    public boolean i;
    public float j;

    public v41(cx7 cx7Var) {
        this.e = (byte) 0;
        this.h = 1.0f;
        this.a = cx7Var;
        this.b = 1.5f;
        this.c = 1.0f;
        this.d = 2.0f;
    }

    public final float a(float f) {
        return qd4.A(1.0f, this.j, f, 1.0f - f) * this.h;
    }

    public void b() {
        View view = this.a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z) {
        float f;
        if (this.i != z) {
            this.i = z;
            ValueAnimator valueAnimator = this.g;
            this.g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f2 = this.j;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            this.g = ofFloat;
            ofFloat.addUpdateListener(new g0(this, (byte) 22));
            this.g.addListener(new z7((byte) 9, this, z));
            boolean z2 = this.i;
            ValueAnimator valueAnimator2 = this.g;
            if (z2) {
                valueAnimator2.setInterpolator(k43.f);
                this.g.setDuration(this.b * 60.0f);
                this.g.setStartDelay(0L);
            } else {
                valueAnimator2.setInterpolator(new OvershootInterpolator(this.d));
                this.g.setDuration(this.c * 350.0f);
                this.g.setStartDelay(this.e);
            }
            this.g.start();
        }
    }

    public v41(View view, float f, float f2) {
        this.e = (byte) 0;
        this.h = 1.0f;
        this.a = view;
        this.c = f;
        this.b = f;
        this.d = f2;
    }

    public v41(View view) {
        this(view, 1.0f, 5.0f);
    }
}
