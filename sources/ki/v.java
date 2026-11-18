package ki;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.ef;
import org.telegram.ui.Components.lr;
public abstract class v extends FrameLayout {
    public ObjectAnimator f18981a;
    public e2.r0 f18982b;
    public di.b1 f18983c;
    public Paint d;
    public float f18984e;
    public boolean f18985f;
    public float h;
    public boolean f18986n;
    public fh.g f18987r;

    public final void a() {
        ObjectAnimator objectAnimator = this.f18981a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f18981a.cancel();
            this.f18981a = null;
        }
    }

    public final void b() {
        di.b1 b1Var = this.f18983c;
        fh.g gVar = this.f18987r;
        if (gVar != null) {
            gVar.setBounds(0, ((int) this.h) - org.telegram.messenger.g0.L(25.0f), getMeasuredWidth(), org.telegram.messenger.g0.L(5.0f) + getMeasuredHeight());
            b1Var.invalidateOutline();
            b1Var.invalidate();
        }
    }

    public final void c() {
        if (!this.f18985f) {
            this.f18985f = true;
            a();
            di.b1 b1Var = this.f18983c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(b1Var, FrameLayout.TRANSLATION_Y, b1Var.getTranslationY(), (getMeasuredHeight() - this.h) + org.telegram.messenger.g0.L(40.0f));
            this.f18981a = ofFloat;
            ofFloat.addListener(new ai.j0(this, 28));
            this.f18981a.setDuration(150L);
            this.f18981a.setInterpolator(lr.f37208f);
            this.f18981a.start();
            z zVar = ((ef) this).f34689w.m0;
            if (zVar != null) {
                zVar.setOpened(false);
            }
        }
    }

    public final void d(boolean z10) {
        if (this.f18985f) {
            return;
        }
        di.b1 b1Var = this.f18983c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(b1Var, FrameLayout.TRANSLATION_Y, b1Var.getTranslationY(), 0.0f);
        this.f18981a = ofFloat;
        if (z10) {
            ofFloat.setDuration(320L);
            this.f18981a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.f18981a.setInterpolator(lr.f37208f);
        }
        this.f18981a.start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.h - org.telegram.messenger.g0.L(24.0f)) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public ck0 getListView() {
        return this.f18983c;
    }

    @Override
    public int getNestedScrollAxes() {
        return this.f18982b.b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        di.b1 b1Var = this.f18983c;
        super.onMeasure(i7, i10);
        if (this.f18986n && !this.f18985f) {
            b1Var.setTranslationY(org.telegram.messenger.g0.L(16.0f) + (b1Var.getMeasuredHeight() - b1Var.getPaddingTop()));
            d(true);
            this.f18986n = false;
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
        di.b1 b1Var = this.f18983c;
        if (!this.f18985f) {
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
        di.b1 b1Var = this.f18983c;
        if (!this.f18985f) {
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
        this.f18982b.f10687a = i7;
        if (this.f18985f) {
            return;
        }
        a();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        if (!this.f18985f && i7 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f18982b.f10687a = 0;
        boolean z10 = this.f18985f;
        if (z10 || z10) {
            return;
        }
        if (this.f18983c.getTranslationY() > org.telegram.messenger.g0.L(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(fh.g gVar) {
        this.f18987r = gVar;
        gVar.r(org.telegram.messenger.g0.L(22.0f));
        this.f18987r.q(org.telegram.messenger.g0.L(5.0f));
        di.b1 b1Var = this.f18983c;
        if (gVar.S == null) {
            gVar.S = new fh.a(gVar, 0);
        }
        b1Var.setOutlineProvider(gVar.S);
    }
}
