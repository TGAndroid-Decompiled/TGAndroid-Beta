package ki;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.ve;
public abstract class w extends FrameLayout {
    public ObjectAnimator f18607a;
    public e2.r0 f18608b;
    public di.c1 f18609c;
    public Paint d;
    public float f18610e;
    public boolean f18611f;
    public float h;
    public boolean f18612n;
    public fh.g f18613r;

    public final void a() {
        ObjectAnimator objectAnimator = this.f18607a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f18607a.cancel();
            this.f18607a = null;
        }
    }

    public final void b() {
        di.c1 c1Var = this.f18609c;
        fh.g gVar = this.f18613r;
        if (gVar != null) {
            gVar.setBounds(0, ((int) this.h) - org.telegram.messenger.g0.L(25.0f), getMeasuredWidth(), org.telegram.messenger.g0.L(5.0f) + getMeasuredHeight());
            c1Var.invalidateOutline();
            c1Var.invalidate();
        }
    }

    public final void c() {
        if (!this.f18611f) {
            this.f18611f = true;
            a();
            di.c1 c1Var = this.f18609c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c1Var, FrameLayout.TRANSLATION_Y, c1Var.getTranslationY(), (getMeasuredHeight() - this.h) + org.telegram.messenger.g0.L(40.0f));
            this.f18607a = ofFloat;
            ofFloat.addListener(new ai.i0(this, 28));
            this.f18607a.setDuration(150L);
            this.f18607a.setInterpolator(er.f34420f);
            this.f18607a.start();
            a0 a0Var = ((ve) this).f40386w.m0;
            if (a0Var != null) {
                a0Var.setOpened(false);
            }
        }
    }

    public final void d(boolean z10) {
        if (this.f18611f) {
            return;
        }
        di.c1 c1Var = this.f18609c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c1Var, FrameLayout.TRANSLATION_Y, c1Var.getTranslationY(), 0.0f);
        this.f18607a = ofFloat;
        if (z10) {
            ofFloat.setDuration(320L);
            this.f18607a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.f18607a.setInterpolator(er.f34420f);
        }
        this.f18607a.start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.h - org.telegram.messenger.g0.L(24.0f)) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public uj0 getListView() {
        return this.f18609c;
    }

    @Override
    public int getNestedScrollAxes() {
        return this.f18608b.b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        di.c1 c1Var = this.f18609c;
        super.onMeasure(i7, i10);
        if (this.f18612n && !this.f18611f) {
            c1Var.setTranslationY(org.telegram.messenger.g0.L(16.0f) + (c1Var.getMeasuredHeight() - c1Var.getPaddingTop()));
            d(true);
            this.f18612n = false;
        }
        b();
    }

    @Override
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return false;
    }

    @Override
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override
    public final void onNestedPreScroll(View view, int i7, int i10, int[] iArr) {
        di.c1 c1Var = this.f18609c;
        if (!this.f18611f) {
            a();
            float translationY = c1Var.getTranslationY();
            float f10 = 0.0f;
            if (translationY > 0.0f && i10 > 0) {
                float f11 = translationY - i10;
                iArr[1] = i10;
                if (f11 >= 0.0f) {
                    f10 = f11;
                }
                c1Var.setTranslationY(f10);
                invalidate();
            }
        }
    }

    @Override
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        di.c1 c1Var = this.f18609c;
        if (!this.f18611f) {
            a();
            if (i12 != 0) {
                float translationY = c1Var.getTranslationY() - i12;
                if (translationY < 0.0f) {
                    translationY = 0.0f;
                }
                c1Var.setTranslationY(translationY);
                invalidate();
            }
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        this.f18608b.f10369a = i7;
        if (this.f18611f) {
            return;
        }
        a();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        if (!this.f18611f && i7 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f18608b.f10369a = 0;
        boolean z10 = this.f18611f;
        if (z10 || z10) {
            return;
        }
        if (this.f18609c.getTranslationY() > org.telegram.messenger.g0.L(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(fh.g gVar) {
        this.f18613r = gVar;
        gVar.r(org.telegram.messenger.g0.L(22.0f));
        this.f18613r.q(org.telegram.messenger.g0.L(5.0f));
        di.c1 c1Var = this.f18609c;
        if (gVar.S == null) {
            gVar.S = new fh.a(gVar, 0);
        }
        c1Var.setOutlineProvider(gVar.S);
    }
}
