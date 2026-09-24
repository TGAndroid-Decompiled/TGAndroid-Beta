package ei;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.wl0;
public abstract class y extends FrameLayout {
    public ObjectAnimator f8720a;
    public b2.q0 f8721b;
    public ai.w0 f8722c;
    public Paint d;
    public float e;
    public boolean f8723f;
    public float h;
    public boolean f8724n;
    public ch.d f8725r;

    public final void a() {
        ObjectAnimator objectAnimator = this.f8720a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f8720a.cancel();
            this.f8720a = null;
        }
    }

    public final void b() {
        ai.w0 w0Var = this.f8722c;
        ch.d dVar = this.f8725r;
        if (dVar != null) {
            dVar.setBounds(0, ((int) this.h) - AndroidUtilities.dp(25.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + getMeasuredHeight());
            w0Var.invalidateOutline();
            w0Var.invalidate();
        }
    }

    public final void c() {
        if (!this.f8723f) {
            this.f8723f = true;
            a();
            ai.w0 w0Var = this.f8722c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(w0Var, FrameLayout.TRANSLATION_Y, w0Var.getTranslationY(), (getMeasuredHeight() - this.h) + AndroidUtilities.dp(40.0f));
            this.f8720a = ofFloat;
            ofFloat.addListener(new ai.b(this, 20));
            this.f8720a.setDuration(150L);
            this.f8720a.setInterpolator(rr.f28022f);
            this.f8720a.start();
            c0 c0Var = ((of) this).v.f22007l0;
            if (c0Var != null) {
                c0Var.setOpened(false);
            }
        }
    }

    public final void d(boolean z10) {
        if (this.f8723f) {
            return;
        }
        ai.w0 w0Var = this.f8722c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(w0Var, FrameLayout.TRANSLATION_Y, w0Var.getTranslationY(), 0.0f);
        this.f8720a = ofFloat;
        if (z10) {
            ofFloat.setDuration(320L);
            this.f8720a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.f8720a.setInterpolator(rr.f28022f);
        }
        this.f8720a.start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.h - AndroidUtilities.dp(24.0f)) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public wl0 getListView() {
        return this.f8722c;
    }

    @Override
    public int getNestedScrollAxes() {
        b2.q0 q0Var = this.f8721b;
        return q0Var.f3196b | q0Var.f3195a;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ai.w0 w0Var = this.f8722c;
        super.onMeasure(i10, i11);
        if (this.f8724n && !this.f8723f) {
            w0Var.setTranslationY(AndroidUtilities.dp(16.0f) + (w0Var.getMeasuredHeight() - w0Var.getPaddingTop()));
            d(true);
            this.f8724n = false;
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
        ai.w0 w0Var = this.f8722c;
        if (!this.f8723f) {
            a();
            float translationY = w0Var.getTranslationY();
            float f7 = 0.0f;
            if (translationY > 0.0f && i11 > 0) {
                float f10 = translationY - i11;
                iArr[1] = i11;
                if (f10 >= 0.0f) {
                    f7 = f10;
                }
                w0Var.setTranslationY(f7);
                invalidate();
            }
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        ai.w0 w0Var = this.f8722c;
        if (!this.f8723f) {
            a();
            if (i13 != 0) {
                float translationY = w0Var.getTranslationY() - i13;
                if (translationY < 0.0f) {
                    translationY = 0.0f;
                }
                w0Var.setTranslationY(translationY);
                invalidate();
            }
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f8721b.f3195a = i10;
        if (this.f8723f) {
            return;
        }
        a();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if (!this.f8723f && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f8721b.f3195a = 0;
        boolean z10 = this.f8723f;
        if (z10 || z10) {
            return;
        }
        if (this.f8722c.getTranslationY() > AndroidUtilities.dp(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(ch.d dVar) {
        this.f8725r = dVar;
        dVar.q(AndroidUtilities.dp(22.0f));
        this.f8725r.p(AndroidUtilities.dp(5.0f));
        ai.w0 w0Var = this.f8722c;
        if (dVar.f4281k == null) {
            dVar.f4281k = new ch.b(dVar, 0);
        }
        w0Var.setOutlineProvider(dVar.f4281k);
    }
}
