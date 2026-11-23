package ki;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.kr;
public abstract class u extends FrameLayout {
    public ObjectAnimator f19059a;
    public e2.r0 f19060b;
    public di.b1 f19061c;
    public Paint d;
    public float f19062e;
    public boolean f19063f;
    public float h;
    public boolean f19064n;
    public fh.g f19065r;

    public final void a() {
        ObjectAnimator objectAnimator = this.f19059a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f19059a.cancel();
            this.f19059a = null;
        }
    }

    public final void b() {
        di.b1 b1Var = this.f19061c;
        fh.g gVar = this.f19065r;
        if (gVar != null) {
            gVar.setBounds(0, ((int) this.h) - org.telegram.messenger.g0.L(25.0f), getMeasuredWidth(), org.telegram.messenger.g0.L(5.0f) + getMeasuredHeight());
            b1Var.invalidateOutline();
            b1Var.invalidate();
        }
    }

    public final void c() {
        if (!this.f19063f) {
            this.f19063f = true;
            a();
            di.b1 b1Var = this.f19061c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(b1Var, FrameLayout.TRANSLATION_Y, b1Var.getTranslationY(), (getMeasuredHeight() - this.h) + org.telegram.messenger.g0.L(40.0f));
            this.f19059a = ofFloat;
            ofFloat.addListener(new ai.g0(this, 28));
            this.f19059a.setDuration(150L);
            this.f19059a.setInterpolator(kr.f36858f);
            this.f19059a.start();
            y yVar = ((ff) this).f35116w.m0;
            if (yVar != null) {
                yVar.setOpened(false);
            }
        }
    }

    public final void d(boolean z10) {
        if (this.f19063f) {
            return;
        }
        di.b1 b1Var = this.f19061c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(b1Var, FrameLayout.TRANSLATION_Y, b1Var.getTranslationY(), 0.0f);
        this.f19059a = ofFloat;
        if (z10) {
            ofFloat.setDuration(320L);
            this.f19059a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.f19059a.setInterpolator(kr.f36858f);
        }
        this.f19059a.start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.h - org.telegram.messenger.g0.L(24.0f)) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public ek0 getListView() {
        return this.f19061c;
    }

    @Override
    public int getNestedScrollAxes() {
        return this.f19060b.b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        di.b1 b1Var = this.f19061c;
        super.onMeasure(i7, i10);
        if (this.f19064n && !this.f19063f) {
            b1Var.setTranslationY(org.telegram.messenger.g0.L(16.0f) + (b1Var.getMeasuredHeight() - b1Var.getPaddingTop()));
            d(true);
            this.f19064n = false;
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
        di.b1 b1Var = this.f19061c;
        if (!this.f19063f) {
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
        di.b1 b1Var = this.f19061c;
        if (!this.f19063f) {
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
        this.f19060b.f10677a = i7;
        if (this.f19063f) {
            return;
        }
        a();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        if (!this.f19063f && i7 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f19060b.f10677a = 0;
        boolean z10 = this.f19063f;
        if (z10 || z10) {
            return;
        }
        if (this.f19061c.getTranslationY() > org.telegram.messenger.g0.L(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(fh.g gVar) {
        this.f19065r = gVar;
        gVar.r(org.telegram.messenger.g0.L(22.0f));
        this.f19065r.q(org.telegram.messenger.g0.L(5.0f));
        di.b1 b1Var = this.f19061c;
        if (gVar.S == null) {
            gVar.S = new fh.a(gVar, 0);
        }
        b1Var.setOutlineProvider(gVar.S);
    }
}
