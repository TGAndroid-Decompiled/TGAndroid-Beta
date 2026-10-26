package hi;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nf;
public abstract class e0 extends FrameLayout {
    public ObjectAnimator f12947a;
    public b2.v0 f12948b;
    public bi.r1 f12949c;
    public Paint d;
    public float e;
    public boolean f12950f;
    public float h;
    public boolean f12951n;
    public eh.d f12952r;

    public final void a() {
        ObjectAnimator objectAnimator = this.f12947a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f12947a.cancel();
            this.f12947a = null;
        }
    }

    public final void b() {
        bi.r1 r1Var = this.f12949c;
        eh.d dVar = this.f12952r;
        if (dVar != null) {
            dVar.setBounds(0, ((int) this.h) - AndroidUtilities.dp(25.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + getMeasuredHeight());
            r1Var.invalidateOutline();
            r1Var.invalidate();
        }
    }

    public final void c() {
        if (!this.f12950f) {
            this.f12950f = true;
            a();
            bi.r1 r1Var = this.f12949c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r1Var, FrameLayout.TRANSLATION_Y, r1Var.getTranslationY(), (getMeasuredHeight() - this.h) + AndroidUtilities.dp(40.0f));
            this.f12947a = ofFloat;
            ofFloat.addListener(new bh.b(this, 27));
            this.f12947a.setDuration(150L);
            this.f12947a.setInterpolator(ds.f27586f);
            this.f12947a.start();
            i0 i0Var = ((nf) this).v.f25913l0;
            if (i0Var != null) {
                i0Var.setOpened(false);
            }
        }
    }

    public final void d(boolean z10) {
        if (this.f12950f) {
            return;
        }
        bi.r1 r1Var = this.f12949c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r1Var, FrameLayout.TRANSLATION_Y, r1Var.getTranslationY(), 0.0f);
        this.f12947a = ofFloat;
        if (z10) {
            ofFloat.setDuration(320L);
            this.f12947a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.f12947a.setInterpolator(ds.f27586f);
        }
        this.f12947a.start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.h - AndroidUtilities.dp(24.0f)) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public mm0 getListView() {
        return this.f12949c;
    }

    @Override
    public int getNestedScrollAxes() {
        return this.f12948b.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        bi.r1 r1Var = this.f12949c;
        super.onMeasure(i10, i11);
        if (this.f12951n && !this.f12950f) {
            r1Var.setTranslationY(AndroidUtilities.dp(16.0f) + (r1Var.getMeasuredHeight() - r1Var.getPaddingTop()));
            d(true);
            this.f12951n = false;
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
        bi.r1 r1Var = this.f12949c;
        if (!this.f12950f) {
            a();
            float translationY = r1Var.getTranslationY();
            float f7 = 0.0f;
            if (translationY > 0.0f && i11 > 0) {
                float f10 = translationY - i11;
                iArr[1] = i11;
                if (f10 >= 0.0f) {
                    f7 = f10;
                }
                r1Var.setTranslationY(f7);
                invalidate();
            }
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        bi.r1 r1Var = this.f12949c;
        if (!this.f12950f) {
            a();
            if (i13 != 0) {
                float translationY = r1Var.getTranslationY() - i13;
                if (translationY < 0.0f) {
                    translationY = 0.0f;
                }
                r1Var.setTranslationY(translationY);
                invalidate();
            }
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f12948b.f3511a = i10;
        if (this.f12950f) {
            return;
        }
        a();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if (!this.f12950f && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f12948b.f3511a = 0;
        boolean z10 = this.f12950f;
        if (z10 || z10) {
            return;
        }
        if (this.f12949c.getTranslationY() > AndroidUtilities.dp(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(eh.d dVar) {
        this.f12952r = dVar;
        dVar.x(AndroidUtilities.dp(22.0f));
        this.f12952r.w(AndroidUtilities.dp(5.0f));
        bi.r1 r1Var = this.f12949c;
        if (dVar.f9967y == null) {
            dVar.f9967y = new eh.b(dVar, 0);
        }
        r1Var.setOutlineProvider(dVar.f9967y);
    }
}
