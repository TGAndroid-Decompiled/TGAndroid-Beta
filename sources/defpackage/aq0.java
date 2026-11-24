package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
public abstract class aq0 extends FrameLayout {
    public ObjectAnimator a;
    public az8 b;
    public fv c;
    public Paint d;
    public float e;
    public boolean f;
    public float h;
    public boolean n;
    public im0 r;

    public final void a() {
        ObjectAnimator objectAnimator = this.a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.a.cancel();
            this.a = null;
        }
    }

    public final void b() {
        fv fvVar = this.c;
        im0 im0Var = this.r;
        if (im0Var != null) {
            im0Var.setBounds(0, ((int) this.h) - gm.L(25.0f), getMeasuredWidth(), gm.L(5.0f) + getMeasuredHeight());
            fvVar.invalidateOutline();
            fvVar.invalidate();
        }
    }

    public final void c() {
        if (!this.f) {
            this.f = true;
            a();
            fv fvVar = this.c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fvVar, FrameLayout.TRANSLATION_Y, fvVar.getTranslationY(), (getMeasuredHeight() - this.h) + gm.L(40.0f));
            this.a = ofFloat;
            ofFloat.addListener(new g0(this, (byte) 25));
            this.a.setDuration(150L);
            this.a.setInterpolator(d53.f);
            this.a.start();
            eq0 eq0Var = ((py1) this).w.m0;
            if (eq0Var != null) {
                eq0Var.setOpened(false);
            }
        }
    }

    public final void d(boolean z) {
        if (this.f) {
            return;
        }
        fv fvVar = this.c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fvVar, FrameLayout.TRANSLATION_Y, fvVar.getTranslationY(), 0.0f);
        this.a = ofFloat;
        if (z) {
            ofFloat.setDuration(320L);
            this.a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.a.setInterpolator(d53.f);
        }
        this.a.start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.h - gm.L(24.0f)) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public r59 getListView() {
        return this.c;
    }

    @Override
    public int getNestedScrollAxes() {
        return this.b.b();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        fv fvVar = this.c;
        super.onMeasure(i, i2);
        if (this.n && !this.f) {
            fvVar.setTranslationY(gm.L(16.0f) + (fvVar.getMeasuredHeight() - fvVar.getPaddingTop()));
            d(true);
            this.n = false;
        }
        b();
    }

    @Override
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        fv fvVar = this.c;
        if (!this.f) {
            a();
            float translationY = fvVar.getTranslationY();
            float f = 0.0f;
            if (translationY > 0.0f && i2 > 0) {
                float f2 = translationY - i2;
                iArr[1] = i2;
                if (f2 >= 0.0f) {
                    f = f2;
                }
                fvVar.setTranslationY(f);
                invalidate();
            }
        }
    }

    @Override
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        fv fvVar = this.c;
        if (!this.f) {
            a();
            if (i4 != 0) {
                float translationY = fvVar.getTranslationY() - i4;
                if (translationY < 0.0f) {
                    translationY = 0.0f;
                }
                fvVar.setTranslationY(translationY);
                invalidate();
            }
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.b.b = i;
        if (this.f) {
            return;
        }
        a();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if (!this.f && i == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.b.b = 0;
        boolean z = this.f;
        if (z || z) {
            return;
        }
        if (this.c.getTranslationY() > gm.L(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(im0 im0Var) {
        this.r = im0Var;
        im0Var.r(gm.L(22.0f));
        this.r.q(gm.L(5.0f));
        fv fvVar = this.c;
        cm0 cm0Var = im0Var.T;
        if (cm0Var == null) {
            cm0Var = new cm0(im0Var, (byte) 0);
            im0Var.T = cm0Var;
        }
        fvVar.setOutlineProvider(cm0Var);
    }
}
