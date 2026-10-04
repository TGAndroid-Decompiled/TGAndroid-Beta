package ei;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.zl0;
public abstract class z extends FrameLayout {
    public ObjectAnimator f9494a;
    public b2.q0 f9495b;
    public ai.w0 f9496c;
    public Paint d;
    public float f9497e;
    public boolean f9498f;
    public float h;
    public boolean f9499n;
    public ch.d f9500r;

    public final void a() {
        ObjectAnimator objectAnimator = this.f9494a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f9494a.cancel();
            this.f9494a = null;
        }
    }

    public final void b() {
        ai.w0 w0Var = this.f9496c;
        ch.d dVar = this.f9500r;
        if (dVar != null) {
            dVar.setBounds(0, ((int) this.h) - AndroidUtilities.dp(25.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + getMeasuredHeight());
            w0Var.invalidateOutline();
            w0Var.invalidate();
        }
    }

    public final void c() {
        if (!this.f9498f) {
            this.f9498f = true;
            a();
            ai.w0 w0Var = this.f9496c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(w0Var, FrameLayout.TRANSLATION_Y, w0Var.getTranslationY(), (getMeasuredHeight() - this.h) + AndroidUtilities.dp(40.0f));
            this.f9494a = ofFloat;
            ofFloat.addListener(new ai.b(this, 20));
            this.f9494a.setDuration(150L);
            this.f9494a.setInterpolator(tr.f31141f);
            this.f9494a.start();
            d0 d0Var = ((pf) this).v.f23917l0;
            if (d0Var != null) {
                d0Var.setOpened(false);
            }
        }
    }

    public final void d(boolean z10) {
        if (this.f9498f) {
            return;
        }
        ai.w0 w0Var = this.f9496c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(w0Var, FrameLayout.TRANSLATION_Y, w0Var.getTranslationY(), 0.0f);
        this.f9494a = ofFloat;
        if (z10) {
            ofFloat.setDuration(320L);
            this.f9494a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.f9494a.setInterpolator(tr.f31141f);
        }
        this.f9494a.start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.h - AndroidUtilities.dp(24.0f)) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public zl0 getListView() {
        return this.f9496c;
    }

    @Override
    public int getNestedScrollAxes() {
        return this.f9495b.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ai.w0 w0Var = this.f9496c;
        super.onMeasure(i10, i11);
        if (this.f9499n && !this.f9498f) {
            w0Var.setTranslationY(AndroidUtilities.dp(16.0f) + (w0Var.getMeasuredHeight() - w0Var.getPaddingTop()));
            d(true);
            this.f9499n = false;
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
        ai.w0 w0Var = this.f9496c;
        if (!this.f9498f) {
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
        ai.w0 w0Var = this.f9496c;
        if (!this.f9498f) {
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
        this.f9495b.f3454a = i10;
        if (this.f9498f) {
            return;
        }
        a();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if (!this.f9498f && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f9495b.f3454a = 0;
        boolean z10 = this.f9498f;
        if (z10 || z10) {
            return;
        }
        if (this.f9496c.getTranslationY() > AndroidUtilities.dp(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(ch.d dVar) {
        this.f9500r = dVar;
        dVar.z(AndroidUtilities.dp(22.0f));
        this.f9500r.y(AndroidUtilities.dp(5.0f));
        ai.w0 w0Var = this.f9496c;
        if (dVar.f4633m == null) {
            dVar.f4633m = new ch.b(dVar, 0);
        }
        w0Var.setOutlineProvider(dVar.f4633m);
    }
}
