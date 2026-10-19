package gi;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.nf;
public abstract class x extends FrameLayout {
    public ObjectAnimator f11534a;
    public b2.u0 f11535b;
    public ai.u1 f11536c;
    public Paint d;
    public float e;
    public boolean f11537f;
    public float h;
    public boolean f11538n;
    public dh.d f11539r;

    public final void a() {
        ObjectAnimator objectAnimator = this.f11534a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f11534a.cancel();
            this.f11534a = null;
        }
    }

    public final void b() {
        ai.u1 u1Var = this.f11536c;
        dh.d dVar = this.f11539r;
        if (dVar != null) {
            dVar.setBounds(0, ((int) this.h) - AndroidUtilities.dp(25.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + getMeasuredHeight());
            u1Var.invalidateOutline();
            u1Var.invalidate();
        }
    }

    public final void c() {
        if (!this.f11537f) {
            this.f11537f = true;
            a();
            ai.u1 u1Var = this.f11536c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(u1Var, FrameLayout.TRANSLATION_Y, u1Var.getTranslationY(), (getMeasuredHeight() - this.h) + AndroidUtilities.dp(40.0f));
            this.f11534a = ofFloat;
            ofFloat.addListener(new ah.b(this, 25));
            this.f11534a.setDuration(150L);
            this.f11534a.setInterpolator(bs.f25014f);
            this.f11534a.start();
            b0 b0Var = ((nf) this).v.f23977l0;
            if (b0Var != null) {
                b0Var.setOpened(false);
            }
        }
    }

    public final void d(boolean z10) {
        if (this.f11537f) {
            return;
        }
        ai.u1 u1Var = this.f11536c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(u1Var, FrameLayout.TRANSLATION_Y, u1Var.getTranslationY(), 0.0f);
        this.f11534a = ofFloat;
        if (z10) {
            ofFloat.setDuration(320L);
            this.f11534a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.f11534a.setInterpolator(bs.f25014f);
        }
        this.f11534a.start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.h - AndroidUtilities.dp(24.0f)) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public im0 getListView() {
        return this.f11536c;
    }

    @Override
    public int getNestedScrollAxes() {
        return this.f11535b.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ai.u1 u1Var = this.f11536c;
        super.onMeasure(i10, i11);
        if (this.f11538n && !this.f11537f) {
            u1Var.setTranslationY(AndroidUtilities.dp(16.0f) + (u1Var.getMeasuredHeight() - u1Var.getPaddingTop()));
            d(true);
            this.f11538n = false;
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
        ai.u1 u1Var = this.f11536c;
        if (!this.f11537f) {
            a();
            float translationY = u1Var.getTranslationY();
            float f7 = 0.0f;
            if (translationY > 0.0f && i11 > 0) {
                float f10 = translationY - i11;
                iArr[1] = i11;
                if (f10 >= 0.0f) {
                    f7 = f10;
                }
                u1Var.setTranslationY(f7);
                invalidate();
            }
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        ai.u1 u1Var = this.f11536c;
        if (!this.f11537f) {
            a();
            if (i13 != 0) {
                float translationY = u1Var.getTranslationY() - i13;
                if (translationY < 0.0f) {
                    translationY = 0.0f;
                }
                u1Var.setTranslationY(translationY);
                invalidate();
            }
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f11535b.f4055a = i10;
        if (this.f11537f) {
            return;
        }
        a();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if (!this.f11537f && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f11535b.f4055a = 0;
        boolean z10 = this.f11537f;
        if (z10 || z10) {
            return;
        }
        if (this.f11536c.getTranslationY() > AndroidUtilities.dp(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(dh.d dVar) {
        this.f11539r = dVar;
        dVar.q(AndroidUtilities.dp(22.0f));
        this.f11539r.p(AndroidUtilities.dp(5.0f));
        ai.u1 u1Var = this.f11536c;
        if (dVar.f8017k == null) {
            dVar.f8017k = new dh.b(dVar, 0);
        }
        u1Var.setOutlineProvider(dVar.f8017k);
    }
}
