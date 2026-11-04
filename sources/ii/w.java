package ii;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.ui.Components.te;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;
public abstract class w extends FrameLayout {
    public ObjectAnimator f15277a;
    public d2.t0 f15278b;
    public ci.j1 f15279c;
    public Paint d;
    public float f15280e;
    public boolean f15281f;
    public float h;
    public boolean f15282n;
    public gh.g f15283r;

    public final void a() {
        ObjectAnimator objectAnimator = this.f15277a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f15277a.cancel();
            this.f15277a = null;
        }
    }

    public final void b() {
        ci.j1 j1Var = this.f15279c;
        gh.g gVar = this.f15283r;
        if (gVar != null) {
            gVar.setBounds(0, ((int) this.h) - org.telegram.messenger.g0.L(25.0f), getMeasuredWidth(), org.telegram.messenger.g0.L(5.0f) + getMeasuredHeight());
            j1Var.invalidateOutline();
            j1Var.invalidate();
        }
    }

    public final void c() {
        if (!this.f15281f) {
            this.f15281f = true;
            a();
            ci.j1 j1Var = this.f15279c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(j1Var, FrameLayout.TRANSLATION_Y, j1Var.getTranslationY(), (getMeasuredHeight() - this.h) + org.telegram.messenger.g0.L(40.0f));
            this.f15277a = ofFloat;
            ofFloat.addListener(new ai.e1(this, 28));
            this.f15277a.setDuration(150L);
            this.f15277a.setInterpolator(xq.f40452f);
            this.f15277a.start();
            a0 a0Var = ((te) this).f38398w.m0;
            if (a0Var != null) {
                a0Var.setOpened(false);
            }
        }
    }

    public final void d(boolean z10) {
        if (this.f15281f) {
            return;
        }
        ci.j1 j1Var = this.f15279c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(j1Var, FrameLayout.TRANSLATION_Y, j1Var.getTranslationY(), 0.0f);
        this.f15277a = ofFloat;
        if (z10) {
            ofFloat.setDuration(320L);
            this.f15277a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.f15277a.setInterpolator(xq.f40452f);
        }
        this.f15277a.start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.h - org.telegram.messenger.g0.L(24.0f)) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public tj0 getListView() {
        return this.f15279c;
    }

    @Override
    public int getNestedScrollAxes() {
        return this.f15278b.b();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        ci.j1 j1Var = this.f15279c;
        super.onMeasure(i3, i10);
        if (this.f15282n && !this.f15281f) {
            j1Var.setTranslationY(org.telegram.messenger.g0.L(16.0f) + (j1Var.getMeasuredHeight() - j1Var.getPaddingTop()));
            d(true);
            this.f15282n = false;
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
    public final void onNestedPreScroll(View view, int i3, int i10, int[] iArr) {
        ci.j1 j1Var = this.f15279c;
        if (!this.f15281f) {
            a();
            float translationY = j1Var.getTranslationY();
            float f10 = 0.0f;
            if (translationY > 0.0f && i10 > 0) {
                float f11 = translationY - i10;
                iArr[1] = i10;
                if (f11 >= 0.0f) {
                    f10 = f11;
                }
                j1Var.setTranslationY(f10);
                invalidate();
            }
        }
    }

    @Override
    public final void onNestedScroll(View view, int i3, int i10, int i11, int i12) {
        ci.j1 j1Var = this.f15279c;
        if (!this.f15281f) {
            a();
            if (i12 != 0) {
                float translationY = j1Var.getTranslationY() - i12;
                if (translationY < 0.0f) {
                    translationY = 0.0f;
                }
                j1Var.setTranslationY(translationY);
                invalidate();
            }
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        this.f15278b.f8413a = i3;
        if (this.f15281f) {
            return;
        }
        a();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        if (!this.f15281f && i3 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f15278b.f8413a = 0;
        boolean z10 = this.f15281f;
        if (z10 || z10) {
            return;
        }
        if (this.f15279c.getTranslationY() > org.telegram.messenger.g0.L(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(gh.g gVar) {
        this.f15283r = gVar;
        gVar.r(org.telegram.messenger.g0.L(22.0f));
        this.f15283r.q(org.telegram.messenger.g0.L(5.0f));
        ci.j1 j1Var = this.f15279c;
        if (gVar.S == null) {
            gVar.S = new gh.a(gVar, 0);
        }
        j1Var.setOutlineProvider(gVar.S);
    }
}
