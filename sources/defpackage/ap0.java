package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
public abstract class ap0 extends FrameLayout {
    public ObjectAnimator a;
    public m09 b;
    public gu c;
    public Paint d;
    public float e;
    public boolean f;
    public float h;
    public boolean n;
    public jl0 r;

    public final void a() {
        ObjectAnimator objectAnimator = this.a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.a.cancel();
            this.a = null;
        }
    }

    public final void b() {
        gu guVar = this.c;
        jl0 jl0Var = this.r;
        if (jl0Var != null) {
            jl0Var.setBounds(0, ((int) this.h) - hl.L(25.0f), getMeasuredWidth(), hl.L(5.0f) + getMeasuredHeight());
            guVar.invalidateOutline();
            guVar.invalidate();
        }
    }

    public final void c() {
        if (!this.f) {
            this.f = true;
            a();
            gu guVar = this.c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(guVar, FrameLayout.TRANSLATION_Y, guVar.getTranslationY(), (getMeasuredHeight() - this.h) + hl.L(40.0f));
            this.a = ofFloat;
            ofFloat.addListener(new h0(this, (byte) 23));
            this.a.setDuration(150L);
            this.a.setInterpolator(k43.f);
            this.a.start();
            ep0 ep0Var = ((qx1) this).w.m0;
            if (ep0Var != null) {
                ep0Var.setOpened(false);
            }
        }
    }

    public final void d(boolean z) {
        if (this.f) {
            return;
        }
        gu guVar = this.c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(guVar, FrameLayout.TRANSLATION_Y, guVar.getTranslationY(), 0.0f);
        this.a = ofFloat;
        if (z) {
            ofFloat.setDuration(320L);
            this.a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.a.setInterpolator(k43.f);
        }
        this.a.start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.h - hl.L(24.0f)) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public d79 getListView() {
        return this.c;
    }

    @Override
    public int getNestedScrollAxes() {
        return this.b.b();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        gu guVar = this.c;
        super.onMeasure(i, i2);
        if (this.n && !this.f) {
            guVar.setTranslationY(hl.L(16.0f) + (guVar.getMeasuredHeight() - guVar.getPaddingTop()));
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
        gu guVar = this.c;
        if (!this.f) {
            a();
            float translationY = guVar.getTranslationY();
            float f = 0.0f;
            if (translationY > 0.0f && i2 > 0) {
                float f2 = translationY - i2;
                iArr[1] = i2;
                if (f2 >= 0.0f) {
                    f = f2;
                }
                guVar.setTranslationY(f);
                invalidate();
            }
        }
    }

    @Override
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        gu guVar = this.c;
        if (!this.f) {
            a();
            if (i4 != 0) {
                float translationY = guVar.getTranslationY() - i4;
                if (translationY < 0.0f) {
                    translationY = 0.0f;
                }
                guVar.setTranslationY(translationY);
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
        if (this.c.getTranslationY() > hl.L(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(jl0 jl0Var) {
        this.r = jl0Var;
        jl0Var.r(hl.L(22.0f));
        this.r.q(hl.L(5.0f));
        gu guVar = this.c;
        dl0 dl0Var = jl0Var.T;
        if (dl0Var == null) {
            dl0Var = new dl0(jl0Var, (byte) 0);
            jl0Var.T = dl0Var;
        }
        guVar.setOutlineProvider(dl0Var);
    }
}
