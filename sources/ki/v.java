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
    public ObjectAnimator f18978a;
    public e2.r0 f18979b;
    public di.b1 f18980c;
    public Paint d;
    public float f18981e;
    public boolean f18982f;
    public float h;
    public boolean f18983n;
    public fh.g f18984r;

    public final void a() {
        ObjectAnimator objectAnimator = this.f18978a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f18978a.cancel();
            this.f18978a = null;
        }
    }

    public final void b() {
        di.b1 b1Var = this.f18980c;
        fh.g gVar = this.f18984r;
        if (gVar != null) {
            gVar.setBounds(0, ((int) this.h) - org.telegram.messenger.g0.L(25.0f), getMeasuredWidth(), org.telegram.messenger.g0.L(5.0f) + getMeasuredHeight());
            b1Var.invalidateOutline();
            b1Var.invalidate();
        }
    }

    public final void c() {
        if (!this.f18982f) {
            this.f18982f = true;
            a();
            di.b1 b1Var = this.f18980c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(b1Var, FrameLayout.TRANSLATION_Y, b1Var.getTranslationY(), (getMeasuredHeight() - this.h) + org.telegram.messenger.g0.L(40.0f));
            this.f18978a = ofFloat;
            ofFloat.addListener(new ai.j0(this, 28));
            this.f18978a.setDuration(150L);
            this.f18978a.setInterpolator(lr.f37208f);
            this.f18978a.start();
            z zVar = ((ef) this).f34689w.m0;
            if (zVar != null) {
                zVar.setOpened(false);
            }
        }
    }

    public final void d(boolean z10) {
        if (this.f18982f) {
            return;
        }
        di.b1 b1Var = this.f18980c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(b1Var, FrameLayout.TRANSLATION_Y, b1Var.getTranslationY(), 0.0f);
        this.f18978a = ofFloat;
        if (z10) {
            ofFloat.setDuration(320L);
            this.f18978a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.f18978a.setInterpolator(lr.f37208f);
        }
        this.f18978a.start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.h - org.telegram.messenger.g0.L(24.0f)) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public ck0 getListView() {
        return this.f18980c;
    }

    @Override
    public int getNestedScrollAxes() {
        return this.f18979b.b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        di.b1 b1Var = this.f18980c;
        super.onMeasure(i7, i10);
        if (this.f18983n && !this.f18982f) {
            b1Var.setTranslationY(org.telegram.messenger.g0.L(16.0f) + (b1Var.getMeasuredHeight() - b1Var.getPaddingTop()));
            d(true);
            this.f18983n = false;
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
        di.b1 b1Var = this.f18980c;
        if (!this.f18982f) {
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
        di.b1 b1Var = this.f18980c;
        if (!this.f18982f) {
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
        this.f18979b.f10684a = i7;
        if (this.f18982f) {
            return;
        }
        a();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        if (!this.f18982f && i7 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f18979b.f10684a = 0;
        boolean z10 = this.f18982f;
        if (z10 || z10) {
            return;
        }
        if (this.f18980c.getTranslationY() > org.telegram.messenger.g0.L(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(fh.g gVar) {
        this.f18984r = gVar;
        gVar.r(org.telegram.messenger.g0.L(22.0f));
        this.f18984r.q(org.telegram.messenger.g0.L(5.0f));
        di.b1 b1Var = this.f18980c;
        if (gVar.S == null) {
            gVar.S = new fh.a(gVar, 0);
        }
        b1Var.setOutlineProvider(gVar.S);
    }
}
