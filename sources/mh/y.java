package mh;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.df;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.wk0;
public abstract class y extends FrameLayout {
    public ObjectAnimator f18204a;
    public d5.p f18205b;
    public gh.f1 f18206c;
    public Paint d;
    public float f18207e;
    public boolean f18208f;
    public float h;
    public boolean f18209n;
    public kg.d f18210r;

    public final void a() {
        ObjectAnimator objectAnimator = this.f18204a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f18204a.cancel();
            this.f18204a = null;
        }
    }

    public final void b() {
        gh.f1 f1Var = this.f18206c;
        kg.d dVar = this.f18210r;
        if (dVar != null) {
            dVar.setBounds(0, ((int) this.h) - AndroidUtilities.dp(25.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + getMeasuredHeight());
            f1Var.invalidateOutline();
            f1Var.invalidate();
        }
    }

    public final void c() {
        if (!this.f18208f) {
            this.f18208f = true;
            a();
            gh.f1 f1Var = this.f18206c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(f1Var, FrameLayout.TRANSLATION_Y, f1Var.getTranslationY(), (getMeasuredHeight() - this.h) + AndroidUtilities.dp(40.0f));
            this.f18204a = ofFloat;
            ofFloat.addListener(new x(this, 0));
            this.f18204a.setDuration(150L);
            this.f18204a.setInterpolator(gr.f28844f);
            this.f18204a.start();
            c0 c0Var = ((df) this).v.f26120h0;
            if (c0Var != null) {
                c0Var.setOpened(false);
            }
        }
    }

    public final void d(boolean z10) {
        if (this.f18208f) {
            return;
        }
        gh.f1 f1Var = this.f18206c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(f1Var, FrameLayout.TRANSLATION_Y, f1Var.getTranslationY(), 0.0f);
        this.f18204a = ofFloat;
        if (z10) {
            ofFloat.setDuration(320L);
            this.f18204a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.f18204a.setInterpolator(gr.f28844f);
        }
        this.f18204a.start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.h - AndroidUtilities.dp(24.0f)) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public wk0 getListView() {
        return this.f18206c;
    }

    @Override
    public int getNestedScrollAxes() {
        d5.p pVar = this.f18205b;
        return pVar.f4377b | pVar.f4376a;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        gh.f1 f1Var = this.f18206c;
        super.onMeasure(i9, i10);
        if (this.f18209n && !this.f18208f) {
            f1Var.setTranslationY(AndroidUtilities.dp(16.0f) + (f1Var.getMeasuredHeight() - f1Var.getPaddingTop()));
            d(true);
            this.f18209n = false;
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
    public final void onNestedPreScroll(View view, int i9, int i10, int[] iArr) {
        gh.f1 f1Var = this.f18206c;
        if (!this.f18208f) {
            a();
            float translationY = f1Var.getTranslationY();
            float f10 = 0.0f;
            if (translationY > 0.0f && i10 > 0) {
                float f11 = translationY - i10;
                iArr[1] = i10;
                if (f11 >= 0.0f) {
                    f10 = f11;
                }
                f1Var.setTranslationY(f10);
                invalidate();
            }
        }
    }

    @Override
    public final void onNestedScroll(View view, int i9, int i10, int i11, int i12) {
        gh.f1 f1Var = this.f18206c;
        if (!this.f18208f) {
            a();
            if (i12 != 0) {
                float translationY = f1Var.getTranslationY() - i12;
                if (translationY < 0.0f) {
                    translationY = 0.0f;
                }
                f1Var.setTranslationY(translationY);
                invalidate();
            }
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i9) {
        this.f18205b.f4376a = i9;
        if (this.f18208f) {
            return;
        }
        a();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i9) {
        if (!this.f18208f && i9 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f18205b.f4376a = 0;
        boolean z10 = this.f18208f;
        if (z10 || z10) {
            return;
        }
        if (this.f18206c.getTranslationY() > AndroidUtilities.dp(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(kg.d dVar) {
        this.f18210r = dVar;
        dVar.p(AndroidUtilities.dp(22.0f));
        this.f18210r.o(AndroidUtilities.dp(5.0f));
        gh.f1 f1Var = this.f18206c;
        if (dVar.f14821i == null) {
            dVar.f14821i = new kg.b(dVar, 0);
        }
        f1Var.setOutlineProvider(dVar.f14821i);
    }
}
