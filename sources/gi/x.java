package gi;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nf;
public abstract class x extends FrameLayout {
    public ObjectAnimator f11559a;
    public b2.u0 f11560b;
    public ai.u1 f11561c;
    public Paint d;
    public float e;
    public boolean f11562f;
    public float h;
    public boolean f11563n;
    public dh.d f11564r;

    public final void a() {
        ObjectAnimator objectAnimator = this.f11559a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f11559a.cancel();
            this.f11559a = null;
        }
    }

    public final void b() {
        ai.u1 u1Var = this.f11561c;
        dh.d dVar = this.f11564r;
        if (dVar != null) {
            dVar.setBounds(0, ((int) this.h) - AndroidUtilities.dp(25.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + getMeasuredHeight());
            u1Var.invalidateOutline();
            u1Var.invalidate();
        }
    }

    public final void c() {
        if (!this.f11562f) {
            this.f11562f = true;
            a();
            ai.u1 u1Var = this.f11561c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(u1Var, FrameLayout.TRANSLATION_Y, u1Var.getTranslationY(), (getMeasuredHeight() - this.h) + AndroidUtilities.dp(40.0f));
            this.f11559a = ofFloat;
            ofFloat.addListener(new ah.b(this, 25));
            this.f11559a.setDuration(150L);
            this.f11559a.setInterpolator(bs.f25133f);
            this.f11559a.start();
            b0 b0Var = ((nf) this).v.f24120l0;
            if (b0Var != null) {
                b0Var.setOpened(false);
            }
        }
    }

    public final void d(boolean z10) {
        if (this.f11562f) {
            return;
        }
        ai.u1 u1Var = this.f11561c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(u1Var, FrameLayout.TRANSLATION_Y, u1Var.getTranslationY(), 0.0f);
        this.f11559a = ofFloat;
        if (z10) {
            ofFloat.setDuration(320L);
            this.f11559a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.f11559a.setInterpolator(bs.f25133f);
        }
        this.f11559a.start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.h - AndroidUtilities.dp(24.0f)) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public mm0 getListView() {
        return this.f11561c;
    }

    @Override
    public int getNestedScrollAxes() {
        return this.f11560b.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ai.u1 u1Var = this.f11561c;
        super.onMeasure(i10, i11);
        if (this.f11563n && !this.f11562f) {
            u1Var.setTranslationY(AndroidUtilities.dp(16.0f) + (u1Var.getMeasuredHeight() - u1Var.getPaddingTop()));
            d(true);
            this.f11563n = false;
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
        ai.u1 u1Var = this.f11561c;
        if (!this.f11562f) {
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
        ai.u1 u1Var = this.f11561c;
        if (!this.f11562f) {
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
        this.f11560b.f4060a = i10;
        if (this.f11562f) {
            return;
        }
        a();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if (!this.f11562f && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f11560b.f4060a = 0;
        boolean z10 = this.f11562f;
        if (z10 || z10) {
            return;
        }
        if (this.f11561c.getTranslationY() > AndroidUtilities.dp(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(dh.d dVar) {
        this.f11564r = dVar;
        dVar.q(AndroidUtilities.dp(22.0f));
        this.f11564r.p(AndroidUtilities.dp(5.0f));
        ai.u1 u1Var = this.f11561c;
        if (dVar.f8027w == null) {
            dVar.f8027w = new dh.b(dVar, 0);
        }
        u1Var.setOutlineProvider(dVar.f8027w);
    }
}
