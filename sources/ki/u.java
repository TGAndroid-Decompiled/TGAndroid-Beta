package ki;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ef;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.nr;
public abstract class u extends FrameLayout {
    public ObjectAnimator f18991a;
    public e2.r0 f18992b;
    public di.b1 f18993c;
    public Paint d;
    public float f18994e;
    public boolean f18995f;
    public float h;
    public boolean f18996n;
    public fh.g f18997r;

    public final void a() {
        ObjectAnimator objectAnimator = this.f18991a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f18991a.cancel();
            this.f18991a = null;
        }
    }

    public final void b() {
        di.b1 b1Var = this.f18993c;
        fh.g gVar = this.f18997r;
        if (gVar != null) {
            gVar.setBounds(0, ((int) this.h) - org.telegram.messenger.g0.L(25.0f), getMeasuredWidth(), org.telegram.messenger.g0.L(5.0f) + getMeasuredHeight());
            b1Var.invalidateOutline();
            b1Var.invalidate();
        }
    }

    public final void c() {
        if (!this.f18995f) {
            this.f18995f = true;
            a();
            di.b1 b1Var = this.f18993c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(b1Var, FrameLayout.TRANSLATION_Y, b1Var.getTranslationY(), (getMeasuredHeight() - this.h) + org.telegram.messenger.g0.L(40.0f));
            this.f18991a = ofFloat;
            ofFloat.addListener(new ai.k0(this, 28));
            this.f18991a.setDuration(150L);
            this.f18991a.setInterpolator(nr.f37960f);
            this.f18991a.start();
            y yVar = ((ef) this).f34780w.m0;
            if (yVar != null) {
                yVar.setOpened(false);
            }
        }
    }

    public final void d(boolean z10) {
        if (this.f18995f) {
            return;
        }
        di.b1 b1Var = this.f18993c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(b1Var, FrameLayout.TRANSLATION_Y, b1Var.getTranslationY(), 0.0f);
        this.f18991a = ofFloat;
        if (z10) {
            ofFloat.setDuration(320L);
            this.f18991a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.f18991a.setInterpolator(nr.f37960f);
        }
        this.f18991a.start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.h - org.telegram.messenger.g0.L(24.0f)) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public ek0 getListView() {
        return this.f18993c;
    }

    @Override
    public int getNestedScrollAxes() {
        return this.f18992b.b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        di.b1 b1Var = this.f18993c;
        super.onMeasure(i7, i10);
        if (this.f18996n && !this.f18995f) {
            b1Var.setTranslationY(org.telegram.messenger.g0.L(16.0f) + (b1Var.getMeasuredHeight() - b1Var.getPaddingTop()));
            d(true);
            this.f18996n = false;
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
        di.b1 b1Var = this.f18993c;
        if (!this.f18995f) {
            a();
            float translationY = b1Var.getTranslationY();
            float f10 = 0.0f;
            if (translationY > 0.0f && i10 > 0) {
                float f11 = translationY - i10;
                iArr[1] = i10;
                if (f11 >= 0.0f) {
                    f10 = f11;
                }
                b1Var.setTranslationY(f10);
                invalidate();
            }
        }
    }

    @Override
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        di.b1 b1Var = this.f18993c;
        if (!this.f18995f) {
            a();
            if (i12 != 0) {
                float translationY = b1Var.getTranslationY() - i12;
                if (translationY < 0.0f) {
                    translationY = 0.0f;
                }
                b1Var.setTranslationY(translationY);
                invalidate();
            }
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        this.f18992b.f10716a = i7;
        if (this.f18995f) {
            return;
        }
        a();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        if (!this.f18995f && i7 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f18992b.f10716a = 0;
        boolean z10 = this.f18995f;
        if (z10 || z10) {
            return;
        }
        if (this.f18993c.getTranslationY() > org.telegram.messenger.g0.L(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(fh.g gVar) {
        this.f18997r = gVar;
        gVar.r(org.telegram.messenger.g0.L(22.0f));
        this.f18997r.q(org.telegram.messenger.g0.L(5.0f));
        di.b1 b1Var = this.f18993c;
        if (gVar.S == null) {
            gVar.S = new fh.a(gVar, 0);
        }
        b1Var.setOutlineProvider(gVar.S);
    }
}
