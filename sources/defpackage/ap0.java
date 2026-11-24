package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
public abstract class ap0 extends FrameLayout {
    public ObjectAnimator a;
    public zw8 b;
    public fu c;
    public Paint d;
    public float e;
    public boolean f;
    public float h;
    public boolean n;
    public il0 r;

    public final void a() {
        ObjectAnimator objectAnimator = this.a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.a.cancel();
            this.a = null;
        }
    }

    public final void b() {
        fu fuVar = this.c;
        il0 il0Var = this.r;
        if (il0Var != null) {
            il0Var.setBounds(0, ((int) this.h) - gl.L(25.0f), getMeasuredWidth(), gl.L(5.0f) + getMeasuredHeight());
            fuVar.invalidateOutline();
            fuVar.invalidate();
        }
    }

    public final void c() {
        if (!this.f) {
            this.f = true;
            a();
            fu fuVar = this.c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fuVar, FrameLayout.TRANSLATION_Y, fuVar.getTranslationY(), (getMeasuredHeight() - this.h) + gl.L(40.0f));
            this.a = ofFloat;
            ofFloat.addListener(new g0(this, (byte) 23));
            this.a.setDuration(150L);
            this.a.setInterpolator(s33.f);
            this.a.start();
            ep0 ep0Var = ((cx1) this).w.m0;
            if (ep0Var != null) {
                ep0Var.setOpened(false);
            }
        }
    }

    public final void d(boolean z) {
        if (this.f) {
            return;
        }
        fu fuVar = this.c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fuVar, FrameLayout.TRANSLATION_Y, fuVar.getTranslationY(), 0.0f);
        this.a = ofFloat;
        if (z) {
            ofFloat.setDuration(320L);
            this.a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.a.setInterpolator(s33.f);
        }
        this.a.start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.h - gl.L(24.0f)) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public o39 getListView() {
        return this.c;
    }

    @Override
    public int getNestedScrollAxes() {
        return this.b.b();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        fu fuVar = this.c;
        super.onMeasure(i, i2);
        if (this.n && !this.f) {
            fuVar.setTranslationY(gl.L(16.0f) + (fuVar.getMeasuredHeight() - fuVar.getPaddingTop()));
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
        fu fuVar = this.c;
        if (!this.f) {
            a();
            float translationY = fuVar.getTranslationY();
            float f = 0.0f;
            if (translationY > 0.0f && i2 > 0) {
                float f2 = translationY - i2;
                iArr[1] = i2;
                if (f2 >= 0.0f) {
                    f = f2;
                }
                fuVar.setTranslationY(f);
                invalidate();
            }
        }
    }

    @Override
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        fu fuVar = this.c;
        if (!this.f) {
            a();
            if (i4 != 0) {
                float translationY = fuVar.getTranslationY() - i4;
                if (translationY < 0.0f) {
                    translationY = 0.0f;
                }
                fuVar.setTranslationY(translationY);
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
        if (this.c.getTranslationY() > gl.L(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(il0 il0Var) {
        this.r = il0Var;
        il0Var.r(gl.L(22.0f));
        this.r.q(gl.L(5.0f));
        fu fuVar = this.c;
        cl0 cl0Var = il0Var.T;
        if (cl0Var == null) {
            cl0Var = new cl0(il0Var, (byte) 0);
            il0Var.T = cl0Var;
        }
        fuVar.setOutlineProvider(cl0Var);
    }
}
