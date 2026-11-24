package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class yl5 extends FrameLayout {
    public final xl5 a;
    public final be0 b;
    public AnimatorSet c;
    public boolean d;
    public boolean e;
    public final boolean f;

    public yl5(Activity activity) {
        super(activity);
        xl5 xl5Var = new xl5(gl.L(104.0f), gl.L(111.0f), gl.L(12.0f), 8);
        this.a = xl5Var;
        xl5Var.b(3.0d);
        if (!xl5Var.e) {
            invalidate();
        }
        xl5Var.e = true;
        be0 be0Var = new be0(activity);
        this.b = be0Var;
        addView(be0Var, nme.e(135, 135, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.c.setInterpolator(s33.g);
        this.c.setDuration(3000L);
        boolean e = e66.e(512);
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
        this.c.setInterpolator(s33.g);
        this.c.setDuration(400L);
        this.c.start();
    }

    public final void b(boolean z, boolean z2) {
        ValueAnimator ofFloat;
        if (this.e != z) {
            this.e = z;
            xl5 xl5Var = this.a;
            if (z) {
                xl5Var.b(3.0d);
            }
            if (xl5Var.h != z) {
                xl5Var.h = z;
                ValueAnimator valueAnimator = xl5Var.j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    xl5Var.j.cancel();
                }
                if (z) {
                    ofFloat = ValueAnimator.ofFloat(xl5Var.i, 0.0f);
                    xl5Var.j = ofFloat;
                    xl5Var.k = (int) (2000.0f / gl.t);
                } else {
                    xl5Var.k = 0;
                    ofFloat = ValueAnimator.ofFloat(xl5Var.i, 1.0f);
                    xl5Var.j = ofFloat;
                }
                ofFloat.addUpdateListener(new ni4(xl5Var, (byte) 10));
                ValueAnimator valueAnimator2 = xl5Var.j;
                if (z2) {
                    valueAnimator2.setDuration(150L);
                } else {
                    valueAnimator2.setDuration(1000L);
                }
                xl5Var.j.start();
                invalidate();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f) {
            xl5 xl5Var = this.a;
            xl5Var.c();
            xl5Var.a(canvas, getWidth() / 2, getHeight() / 2, this);
        }
        super.onDraw(canvas);
    }

    public void setAmplitude(double d) {
        if (this.e) {
            return;
        }
        int i = (d > 1.5d ? 1 : (d == 1.5d ? 0 : -1));
        xl5 xl5Var = this.a;
        if (i > 0) {
            xl5Var.b(d);
        } else {
            xl5Var.b(0.0d);
        }
    }

    public void setRoundRadius(int i) {
        this.b.setRoundRadius(i);
    }

    public void setShowWaves(boolean z) {
        xl5 xl5Var = this.a;
        if (xl5Var.e != z) {
            invalidate();
        }
        xl5Var.e = z;
    }
}
