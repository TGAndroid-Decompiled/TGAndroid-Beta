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
public abstract class y extends FrameLayout {
    public ObjectAnimator f8732a;
    public b2.q0 f8733b;
    public ai.w0 f8734c;
    public Paint d;
    public float e;
    public boolean f8735f;
    public float h;
    public boolean f8736n;
    public ch.d f8737r;

    public final void a() {
        ObjectAnimator objectAnimator = this.f8732a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f8732a.cancel();
            this.f8732a = null;
        }
    }

    public final void b() {
        ai.w0 w0Var = this.f8734c;
        ch.d dVar = this.f8737r;
        if (dVar != null) {
            dVar.setBounds(0, ((int) this.h) - AndroidUtilities.dp(25.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + getMeasuredHeight());
            w0Var.invalidateOutline();
            w0Var.invalidate();
        }
    }

    public final void c() {
        if (!this.f8735f) {
            this.f8735f = true;
            a();
            ai.w0 w0Var = this.f8734c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(w0Var, FrameLayout.TRANSLATION_Y, w0Var.getTranslationY(), (getMeasuredHeight() - this.h) + AndroidUtilities.dp(40.0f));
            this.f8732a = ofFloat;
            ofFloat.addListener(new ai.b(this, 20));
            this.f8732a.setDuration(150L);
            this.f8732a.setInterpolator(tr.f28636f);
            this.f8732a.start();
            c0 c0Var = ((pf) this).v.f22043l0;
            if (c0Var != null) {
                c0Var.setOpened(false);
            }
        }
    }

    public final void d(boolean z10) {
        if (this.f8735f) {
            return;
        }
        ai.w0 w0Var = this.f8734c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(w0Var, FrameLayout.TRANSLATION_Y, w0Var.getTranslationY(), 0.0f);
        this.f8732a = ofFloat;
        if (z10) {
            ofFloat.setDuration(320L);
            this.f8732a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.f8732a.setInterpolator(tr.f28636f);
        }
        this.f8732a.start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.h - AndroidUtilities.dp(24.0f)) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public zl0 getListView() {
        return this.f8734c;
    }

    @Override
    public int getNestedScrollAxes() {
        b2.q0 q0Var = this.f8733b;
        return q0Var.f3203b | q0Var.f3202a;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ai.w0 w0Var = this.f8734c;
        super.onMeasure(i10, i11);
        if (this.f8736n && !this.f8735f) {
            w0Var.setTranslationY(AndroidUtilities.dp(16.0f) + (w0Var.getMeasuredHeight() - w0Var.getPaddingTop()));
            d(true);
            this.f8736n = false;
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
        ai.w0 w0Var = this.f8734c;
        if (!this.f8735f) {
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
        ai.w0 w0Var = this.f8734c;
        if (!this.f8735f) {
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
        this.f8733b.f3202a = i10;
        if (this.f8735f) {
            return;
        }
        a();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if (!this.f8735f && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f8733b.f3202a = 0;
        boolean z10 = this.f8735f;
        if (z10 || z10) {
            return;
        }
        if (this.f8734c.getTranslationY() > AndroidUtilities.dp(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(ch.d dVar) {
        this.f8737r = dVar;
        dVar.q(AndroidUtilities.dp(22.0f));
        this.f8737r.p(AndroidUtilities.dp(5.0f));
        ai.w0 w0Var = this.f8734c;
        if (dVar.f4288k == null) {
            dVar.f4288k = new ch.b(dVar, 0);
        }
        w0Var.setOutlineProvider(dVar.f4288k);
    }
}
