package fi;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.pr;
public abstract class y extends FrameLayout {
    public ObjectAnimator f10098a;
    public b2.q0 f10099b;
    public bi.o0 f10100c;
    public Paint d;
    public float f10101e;
    public boolean f10102f;
    public float h;
    public boolean f10103n;
    public dh.d f10104r;

    public final void a() {
        ObjectAnimator objectAnimator = this.f10098a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f10098a.cancel();
            this.f10098a = null;
        }
    }

    public final void b() {
        bi.o0 o0Var = this.f10100c;
        dh.d dVar = this.f10104r;
        if (dVar != null) {
            dVar.setBounds(0, ((int) this.h) - AndroidUtilities.dp(25.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + getMeasuredHeight());
            o0Var.invalidateOutline();
            o0Var.invalidate();
        }
    }

    public final void c() {
        if (!this.f10102f) {
            this.f10102f = true;
            a();
            bi.o0 o0Var = this.f10100c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(o0Var, FrameLayout.TRANSLATION_Y, o0Var.getTranslationY(), (getMeasuredHeight() - this.h) + AndroidUtilities.dp(40.0f));
            this.f10098a = ofFloat;
            ofFloat.addListener(new ah.b(this, 23));
            this.f10098a.setDuration(150L);
            this.f10098a.setInterpolator(pr.f29466f);
            this.f10098a.start();
            c0 c0Var = ((of) this).v.f23731l0;
            if (c0Var != null) {
                c0Var.setOpened(false);
            }
        }
    }

    public final void d(boolean z10) {
        if (this.f10102f) {
            return;
        }
        bi.o0 o0Var = this.f10100c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(o0Var, FrameLayout.TRANSLATION_Y, o0Var.getTranslationY(), 0.0f);
        this.f10098a = ofFloat;
        if (z10) {
            ofFloat.setDuration(320L);
            this.f10098a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.f10098a.setInterpolator(pr.f29466f);
        }
        this.f10098a.start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.h - AndroidUtilities.dp(24.0f)) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public ll0 getListView() {
        return this.f10100c;
    }

    @Override
    public int getNestedScrollAxes() {
        b2.q0 q0Var = this.f10099b;
        return q0Var.f2261b | q0Var.f2260a;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        bi.o0 o0Var = this.f10100c;
        super.onMeasure(i10, i11);
        if (this.f10103n && !this.f10102f) {
            o0Var.setTranslationY(AndroidUtilities.dp(16.0f) + (o0Var.getMeasuredHeight() - o0Var.getPaddingTop()));
            d(true);
            this.f10103n = false;
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
        bi.o0 o0Var = this.f10100c;
        if (!this.f10102f) {
            a();
            float translationY = o0Var.getTranslationY();
            float f7 = 0.0f;
            if (translationY > 0.0f && i11 > 0) {
                float f10 = translationY - i11;
                iArr[1] = i11;
                if (f10 >= 0.0f) {
                    f7 = f10;
                }
                o0Var.setTranslationY(f7);
                invalidate();
            }
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        bi.o0 o0Var = this.f10100c;
        if (!this.f10102f) {
            a();
            if (i13 != 0) {
                float translationY = o0Var.getTranslationY() - i13;
                if (translationY < 0.0f) {
                    translationY = 0.0f;
                }
                o0Var.setTranslationY(translationY);
                invalidate();
            }
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f10099b.f2260a = i10;
        if (this.f10102f) {
            return;
        }
        a();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if (!this.f10102f && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f10099b.f2260a = 0;
        boolean z10 = this.f10102f;
        if (z10 || z10) {
            return;
        }
        if (this.f10100c.getTranslationY() > AndroidUtilities.dp(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(dh.d dVar) {
        this.f10104r = dVar;
        dVar.p(AndroidUtilities.dp(22.0f));
        this.f10104r.o(AndroidUtilities.dp(5.0f));
        bi.o0 o0Var = this.f10100c;
        if (dVar.f6837i == null) {
            dVar.f6837i = new dh.b(dVar, 0);
        }
        o0Var.setOutlineProvider(dVar.f6837i);
    }
}
