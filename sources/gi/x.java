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
    public ObjectAnimator f11533a;
    public b2.u0 f11534b;
    public ai.u1 f11535c;
    public Paint d;
    public float e;
    public boolean f11536f;
    public float h;
    public boolean f11537n;
    public dh.d f11538r;

    public final void a() {
        ObjectAnimator objectAnimator = this.f11533a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f11533a.cancel();
            this.f11533a = null;
        }
    }

    public final void b() {
        ai.u1 u1Var = this.f11535c;
        dh.d dVar = this.f11538r;
        if (dVar != null) {
            dVar.setBounds(0, ((int) this.h) - AndroidUtilities.dp(25.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + getMeasuredHeight());
            u1Var.invalidateOutline();
            u1Var.invalidate();
        }
    }

    public final void c() {
        if (!this.f11536f) {
            this.f11536f = true;
            a();
            ai.u1 u1Var = this.f11535c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(u1Var, FrameLayout.TRANSLATION_Y, u1Var.getTranslationY(), (getMeasuredHeight() - this.h) + AndroidUtilities.dp(40.0f));
            this.f11533a = ofFloat;
            ofFloat.addListener(new ah.b(this, 25));
            this.f11533a.setDuration(150L);
            this.f11533a.setInterpolator(bs.f25030f);
            this.f11533a.start();
            b0 b0Var = ((nf) this).v.f23974l0;
            if (b0Var != null) {
                b0Var.setOpened(false);
            }
        }
    }

    public final void d(boolean z10) {
        if (this.f11536f) {
            return;
        }
        ai.u1 u1Var = this.f11535c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(u1Var, FrameLayout.TRANSLATION_Y, u1Var.getTranslationY(), 0.0f);
        this.f11533a = ofFloat;
        if (z10) {
            ofFloat.setDuration(320L);
            this.f11533a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.f11533a.setInterpolator(bs.f25030f);
        }
        this.f11533a.start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.h - AndroidUtilities.dp(24.0f)) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public im0 getListView() {
        return this.f11535c;
    }

    @Override
    public int getNestedScrollAxes() {
        return this.f11534b.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ai.u1 u1Var = this.f11535c;
        super.onMeasure(i10, i11);
        if (this.f11537n && !this.f11536f) {
            u1Var.setTranslationY(AndroidUtilities.dp(16.0f) + (u1Var.getMeasuredHeight() - u1Var.getPaddingTop()));
            d(true);
            this.f11537n = false;
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
        ai.u1 u1Var = this.f11535c;
        if (!this.f11536f) {
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
        ai.u1 u1Var = this.f11535c;
        if (!this.f11536f) {
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
        this.f11534b.f4056a = i10;
        if (this.f11536f) {
            return;
        }
        a();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if (!this.f11536f && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f11534b.f4056a = 0;
        boolean z10 = this.f11536f;
        if (z10 || z10) {
            return;
        }
        if (this.f11535c.getTranslationY() > AndroidUtilities.dp(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(dh.d dVar) {
        this.f11538r = dVar;
        dVar.q(AndroidUtilities.dp(22.0f));
        this.f11538r.p(AndroidUtilities.dp(5.0f));
        ai.u1 u1Var = this.f11535c;
        if (dVar.f8017k == null) {
            dVar.f8017k = new dh.b(dVar, 0);
        }
        u1Var.setOutlineProvider(dVar.f8017k);
    }
}
