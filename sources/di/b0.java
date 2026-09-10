package di;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wr;
public abstract class b0 extends FrameLayout {
    public ObjectAnimator f6530a;
    public b2.q0 f6531b;
    public bi.y1 f6532c;
    public Paint d;
    public float e;
    public boolean f6533f;
    public float h;
    public boolean f6534n;
    public bh.d f6535r;

    public final void a() {
        ObjectAnimator objectAnimator = this.f6530a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f6530a.cancel();
            this.f6530a = null;
        }
    }

    public final void b() {
        bi.y1 y1Var = this.f6532c;
        bh.d dVar = this.f6535r;
        if (dVar != null) {
            dVar.setBounds(0, ((int) this.h) - AndroidUtilities.dp(25.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + getMeasuredHeight());
            y1Var.invalidateOutline();
            y1Var.invalidate();
        }
    }

    public final void c() {
        if (!this.f6533f) {
            this.f6533f = true;
            a();
            bi.y1 y1Var = this.f6532c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y1Var, FrameLayout.TRANSLATION_Y, y1Var.getTranslationY(), (getMeasuredHeight() - this.h) + AndroidUtilities.dp(40.0f));
            this.f6530a = ofFloat;
            ofFloat.addListener(new bi.h(this, 9));
            this.f6530a.setDuration(150L);
            this.f6530a.setInterpolator(wr.f28819f);
            this.f6530a.start();
            f0 f0Var = ((pf) this).v.f20885l0;
            if (f0Var != null) {
                f0Var.setOpened(false);
            }
        }
    }

    public final void d(boolean z10) {
        if (this.f6533f) {
            return;
        }
        bi.y1 y1Var = this.f6532c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y1Var, FrameLayout.TRANSLATION_Y, y1Var.getTranslationY(), 0.0f);
        this.f6530a = ofFloat;
        if (z10) {
            ofFloat.setDuration(320L);
            this.f6530a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.f6530a.setInterpolator(wr.f28819f);
        }
        this.f6530a.start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.h - AndroidUtilities.dp(24.0f)) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public vl0 getListView() {
        return this.f6532c;
    }

    @Override
    public int getNestedScrollAxes() {
        b2.q0 q0Var = this.f6531b;
        return q0Var.f1897b | q0Var.f1896a;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        bi.y1 y1Var = this.f6532c;
        super.onMeasure(i10, i11);
        if (this.f6534n && !this.f6533f) {
            y1Var.setTranslationY(AndroidUtilities.dp(16.0f) + (y1Var.getMeasuredHeight() - y1Var.getPaddingTop()));
            d(true);
            this.f6534n = false;
        }
        b();
    }

    @Override
    public final boolean onNestedFling(View view, float f7, float f10, boolean z10) {
        return false;
    }

    @Override
    public final boolean onNestedPreFling(View view, float f7, float f10) {
        return false;
    }

    @Override
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        bi.y1 y1Var = this.f6532c;
        if (!this.f6533f) {
            a();
            float translationY = y1Var.getTranslationY();
            float f7 = 0.0f;
            if (translationY > 0.0f && i11 > 0) {
                float f10 = translationY - i11;
                iArr[1] = i11;
                if (f10 >= 0.0f) {
                    f7 = f10;
                }
                y1Var.setTranslationY(f7);
                invalidate();
            }
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        bi.y1 y1Var = this.f6532c;
        if (!this.f6533f) {
            a();
            if (i13 != 0) {
                float translationY = y1Var.getTranslationY() - i13;
                if (translationY < 0.0f) {
                    translationY = 0.0f;
                }
                y1Var.setTranslationY(translationY);
                invalidate();
            }
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f6531b.f1896a = i10;
        if (this.f6533f) {
            return;
        }
        a();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if (!this.f6533f && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f6531b.f1896a = 0;
        boolean z10 = this.f6533f;
        if (z10 || z10) {
            return;
        }
        if (this.f6532c.getTranslationY() > AndroidUtilities.dp(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(bh.d dVar) {
        this.f6535r = dVar;
        dVar.p(AndroidUtilities.dp(22.0f));
        this.f6535r.o(AndroidUtilities.dp(5.0f));
        bi.y1 y1Var = this.f6532c;
        if (dVar.f2274i == null) {
            dVar.f2274i = new bh.b(dVar, 0);
        }
        y1Var.setOutlineProvider(dVar.f2274i);
    }
}
