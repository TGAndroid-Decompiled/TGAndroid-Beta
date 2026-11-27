package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class bo5 extends FrameLayout {
    public final ao5 a;
    public final de0 b;
    public AnimatorSet c;
    public boolean d;
    public boolean e;
    public final boolean f;

    public bo5(Activity activity) {
        super(activity);
        ao5 ao5Var = new ao5(hl.L(104.0f), hl.L(111.0f), hl.L(12.0f), 8);
        this.a = ao5Var;
        ao5Var.b(3.0d);
        if (!ao5Var.e) {
            invalidate();
        }
        ao5Var.e = true;
        de0 de0Var = new de0(activity);
        this.b = de0Var;
        addView(de0Var, tre.e(135, 135, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.c.setInterpolator(k43.g);
        this.c.setDuration(3000L);
        boolean e = i86.e(512);
        this.f = e;
        if (e) {
            this.c.start();
        }
        setClipChildren(false);
    }

    public final void a() {
        if (this.d) {
            return;
        }
        AnimatorSet animatorSet = this.c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.d = true;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.c = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, getScaleX(), 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, getScaleY(), 1.05f, 1.0f));
        this.c.setInterpolator(k43.g);
        this.c.setDuration(400L);
        this.c.start();
    }

    public final void b(boolean z, boolean z2) {
        ValueAnimator ofFloat;
        if (this.e != z) {
            this.e = z;
            ao5 ao5Var = this.a;
            if (z) {
                ao5Var.b(3.0d);
            }
            if (ao5Var.h != z) {
                ao5Var.h = z;
                ValueAnimator valueAnimator = ao5Var.j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    ao5Var.j.cancel();
                }
                if (z) {
                    ofFloat = ValueAnimator.ofFloat(ao5Var.i, 0.0f);
                    ao5Var.j = ofFloat;
                    ao5Var.k = (int) (2000.0f / hl.t);
                } else {
                    ao5Var.k = 0;
                    ofFloat = ValueAnimator.ofFloat(ao5Var.i, 1.0f);
                    ao5Var.j = ofFloat;
                }
                ofFloat.addUpdateListener(new ch4(ao5Var, (byte) 12));
                ValueAnimator valueAnimator2 = ao5Var.j;
                if (z2) {
                    valueAnimator2.setDuration(150L);
                } else {
                    valueAnimator2.setDuration(1000L);
                }
                ao5Var.j.start();
                invalidate();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f) {
            ao5 ao5Var = this.a;
            ao5Var.c();
            ao5Var.a(canvas, getWidth() / 2, getHeight() / 2, this);
        }
        super.onDraw(canvas);
    }

    public void setAmplitude(double d) {
        if (this.e) {
            return;
        }
        int i = (d > 1.5d ? 1 : (d == 1.5d ? 0 : -1));
        ao5 ao5Var = this.a;
        if (i > 0) {
            ao5Var.b(d);
        } else {
            ao5Var.b(0.0d);
        }
    }

    public void setRoundRadius(int i) {
        this.b.setRoundRadius(i);
    }

    public void setShowWaves(boolean z) {
        ao5 ao5Var = this.a;
        if (ao5Var.e != z) {
            invalidate();
        }
        ao5Var.e = z;
    }
}
