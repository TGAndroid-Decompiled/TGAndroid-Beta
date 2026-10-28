package hi;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.nf;
import org.telegram.ui.Components.nm0;
public abstract class e0 extends FrameLayout {
    public ObjectAnimator f12946a;
    public b2.v0 f12947b;
    public bi.r1 f12948c;
    public Paint d;
    public float e;
    public boolean f12949f;
    public float h;
    public boolean f12950n;
    public eh.d f12951r;

    public final void a() {
        ObjectAnimator objectAnimator = this.f12946a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f12946a.cancel();
            this.f12946a = null;
        }
    }

    public final void b() {
        bi.r1 r1Var = this.f12948c;
        eh.d dVar = this.f12951r;
        if (dVar != null) {
            dVar.setBounds(0, ((int) this.h) - AndroidUtilities.dp(25.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + getMeasuredHeight());
            r1Var.invalidateOutline();
            r1Var.invalidate();
        }
    }

    public final void c() {
        if (!this.f12949f) {
            this.f12949f = true;
            a();
            bi.r1 r1Var = this.f12948c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r1Var, FrameLayout.TRANSLATION_Y, r1Var.getTranslationY(), (getMeasuredHeight() - this.h) + AndroidUtilities.dp(40.0f));
            this.f12946a = ofFloat;
            ofFloat.addListener(new bh.b(this, 27));
            this.f12946a.setDuration(150L);
            this.f12946a.setInterpolator(ds.f27530f);
            this.f12946a.start();
            i0 i0Var = ((nf) this).v.f25915l0;
            if (i0Var != null) {
                i0Var.setOpened(false);
            }
        }
    }

    public final void d(boolean z10) {
        if (this.f12949f) {
            return;
        }
        bi.r1 r1Var = this.f12948c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r1Var, FrameLayout.TRANSLATION_Y, r1Var.getTranslationY(), 0.0f);
        this.f12946a = ofFloat;
        if (z10) {
            ofFloat.setDuration(320L);
            this.f12946a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.f12946a.setInterpolator(ds.f27530f);
        }
        this.f12946a.start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.h - AndroidUtilities.dp(24.0f)) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public nm0 getListView() {
        return this.f12948c;
    }

    @Override
    public int getNestedScrollAxes() {
        return this.f12947b.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        bi.r1 r1Var = this.f12948c;
        super.onMeasure(i10, i11);
        if (this.f12950n && !this.f12949f) {
            r1Var.setTranslationY(AndroidUtilities.dp(16.0f) + (r1Var.getMeasuredHeight() - r1Var.getPaddingTop()));
            d(true);
            this.f12950n = false;
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
        bi.r1 r1Var = this.f12948c;
        if (!this.f12949f) {
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
        bi.r1 r1Var = this.f12948c;
        if (!this.f12949f) {
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
        this.f12947b.f3511a = i10;
        if (this.f12949f) {
            return;
        }
        a();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if (!this.f12949f && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f12947b.f3511a = 0;
        boolean z10 = this.f12949f;
        if (z10 || z10) {
            return;
        }
        if (this.f12948c.getTranslationY() > AndroidUtilities.dp(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(eh.d dVar) {
        this.f12951r = dVar;
        dVar.x(AndroidUtilities.dp(22.0f));
        this.f12951r.w(AndroidUtilities.dp(5.0f));
        bi.r1 r1Var = this.f12948c;
        if (dVar.f9966y == null) {
            dVar.f9966y = new eh.b(dVar, 0);
        }
        r1Var.setOutlineProvider(dVar.f9966y);
    }
}
