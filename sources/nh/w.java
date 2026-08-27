package nh;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import lh.h9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ze;
import org.telegram.ui.Components.zk0;

public abstract class w extends FrameLayout {

    public ObjectAnimator f19008a;

    public d5.p f19009b;

    public hh.f1 f19010c;
    public Paint d;

    public float f19011e;

    public boolean f19012f;
    public float h;

    public boolean f19013n;

    public lg.d f19014r;

    public final void a() {
        ObjectAnimator objectAnimator = this.f19008a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f19008a.cancel();
            this.f19008a = null;
        }
    }

    public final void b() {
        hh.f1 f1Var = this.f19010c;
        lg.d dVar = this.f19014r;
        if (dVar != null) {
            dVar.setBounds(0, ((int) this.h) - AndroidUtilities.dp(25.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + getMeasuredHeight());
            f1Var.invalidateOutline();
            f1Var.invalidate();
        }
    }

    public final void c() {
        if (this.f19012f) {
            return;
        }
        this.f19012f = true;
        a();
        hh.f1 f1Var = this.f19010c;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(f1Var, (Property<hh.f1, Float>) FrameLayout.TRANSLATION_Y, f1Var.getTranslationY(), (getMeasuredHeight() - this.h) + AndroidUtilities.dp(40.0f));
        this.f19008a = objectAnimatorOfFloat;
        objectAnimatorOfFloat.addListener(new h9(this, 2));
        this.f19008a.setDuration(150L);
        this.f19008a.setInterpolator(er.f28122f);
        this.f19008a.start();
        a0 a0Var = ((ze) this).v.f26116h0;
        if (a0Var != null) {
            a0Var.setOpened(false);
        }
    }

    public final void d(boolean z10) {
        if (this.f19012f) {
            return;
        }
        hh.f1 f1Var = this.f19010c;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(f1Var, (Property<hh.f1, Float>) FrameLayout.TRANSLATION_Y, f1Var.getTranslationY(), 0.0f);
        this.f19008a = objectAnimatorOfFloat;
        if (z10) {
            objectAnimatorOfFloat.setDuration(320L);
            this.f19008a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            objectAnimatorOfFloat.setDuration(150L);
            this.f19008a.setInterpolator(er.f28122f);
        }
        this.f19008a.start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.h - AndroidUtilities.dp(24.0f)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public zk0 getListView() {
        return this.f19010c;
    }

    @Override
    public int getNestedScrollAxes() {
        d5.p pVar = this.f19009b;
        return pVar.f4822b | pVar.f4821a;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        hh.f1 f1Var = this.f19010c;
        super.onMeasure(i10, i11);
        if (this.f19013n && !this.f19012f) {
            f1Var.setTranslationY(AndroidUtilities.dp(16.0f) + (f1Var.getMeasuredHeight() - f1Var.getPaddingTop()));
            d(true);
            this.f19013n = false;
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
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        hh.f1 f1Var = this.f19010c;
        if (this.f19012f) {
            return;
        }
        a();
        float translationY = f1Var.getTranslationY();
        if (translationY <= 0.0f || i11 <= 0) {
            return;
        }
        float f10 = translationY - i11;
        iArr[1] = i11;
        f1Var.setTranslationY(f10 >= 0.0f ? f10 : 0.0f);
        invalidate();
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        hh.f1 f1Var = this.f19010c;
        if (this.f19012f) {
            return;
        }
        a();
        if (i13 != 0) {
            float translationY = f1Var.getTranslationY() - i13;
            if (translationY < 0.0f) {
                translationY = 0.0f;
            }
            f1Var.setTranslationY(translationY);
            invalidate();
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f19009b.f4821a = i10;
        if (this.f19012f) {
            return;
        }
        a();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return !this.f19012f && i10 == 2;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f19009b.f4821a = 0;
        boolean z10 = this.f19012f;
        if (z10 || z10) {
            return;
        }
        if (this.f19010c.getTranslationY() > AndroidUtilities.dp(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(lg.d dVar) {
        this.f19014r = dVar;
        dVar.p(AndroidUtilities.dp(22.0f));
        this.f19014r.o(AndroidUtilities.dp(5.0f));
        hh.f1 f1Var = this.f19010c;
        if (dVar.f15599i == null) {
            dVar.f15599i = new lg.b(dVar, 0);
        }
        f1Var.setOutlineProvider(dVar.f15599i);
    }
}
