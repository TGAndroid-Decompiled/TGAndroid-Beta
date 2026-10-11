package ei;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.rm0;
public abstract class y extends FrameLayout {
    public ObjectAnimator f9492a;
    public b2.q0 f9493b;
    public ai.w0 f9494c;
    public Paint d;
    public float f9495e;
    public boolean f9496f;
    public float h;
    public boolean f9497n;
    public ch.d f9498r;

    public final void a() {
        ObjectAnimator objectAnimator = this.f9492a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f9492a.cancel();
            this.f9492a = null;
        }
    }

    public final void b() {
        ai.w0 w0Var = this.f9494c;
        ch.d dVar = this.f9498r;
        if (dVar != null) {
            dVar.setBounds(0, ((int) this.h) - AndroidUtilities.dp(25.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + getMeasuredHeight());
            w0Var.invalidateOutline();
            w0Var.invalidate();
        }
    }

    public final void c() {
        if (!this.f9496f) {
            this.f9496f = true;
            a();
            ai.w0 w0Var = this.f9494c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(w0Var, FrameLayout.TRANSLATION_Y, w0Var.getTranslationY(), (getMeasuredHeight() - this.h) + AndroidUtilities.dp(40.0f));
            this.f9492a = ofFloat;
            ofFloat.addListener(new ai.b(this, 20));
            this.f9492a.setDuration(150L);
            this.f9492a.setInterpolator(is.f27500f);
            this.f9492a.start();
            c0 c0Var = ((qf) this).v.f23948l0;
            if (c0Var != null) {
                c0Var.setOpened(false);
            }
        }
    }

    public final void d(boolean z10) {
        if (this.f9496f) {
            return;
        }
        ai.w0 w0Var = this.f9494c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(w0Var, FrameLayout.TRANSLATION_Y, w0Var.getTranslationY(), 0.0f);
        this.f9492a = ofFloat;
        if (z10) {
            ofFloat.setDuration(320L);
            this.f9492a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.f9492a.setInterpolator(is.f27500f);
        }
        this.f9492a.start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.h - AndroidUtilities.dp(24.0f)) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public rm0 getListView() {
        return this.f9494c;
    }

    @Override
    public int getNestedScrollAxes() {
        return this.f9493b.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ai.w0 w0Var = this.f9494c;
        super.onMeasure(i10, i11);
        if (this.f9497n && !this.f9496f) {
            w0Var.setTranslationY(AndroidUtilities.dp(16.0f) + (w0Var.getMeasuredHeight() - w0Var.getPaddingTop()));
            d(true);
            this.f9497n = false;
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
        ai.w0 w0Var = this.f9494c;
        if (!this.f9496f) {
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
        ai.w0 w0Var = this.f9494c;
        if (!this.f9496f) {
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
        this.f9493b.f3533a = i10;
        if (this.f9496f) {
            return;
        }
        a();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if (!this.f9496f && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f9493b.f3533a = 0;
        boolean z10 = this.f9496f;
        if (z10 || z10) {
            return;
        }
        if (this.f9494c.getTranslationY() > AndroidUtilities.dp(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(ch.d dVar) {
        this.f9498r = dVar;
        dVar.q(AndroidUtilities.dp(22.0f));
        this.f9498r.p(AndroidUtilities.dp(5.0f));
        ai.w0 w0Var = this.f9494c;
        if (dVar.f4685k == null) {
            dVar.f4685k = new ch.b(dVar, 0);
        }
        w0Var.setOutlineProvider(dVar.f4685k);
    }
}
