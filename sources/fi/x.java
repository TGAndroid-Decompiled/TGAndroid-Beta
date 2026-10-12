package fi;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.pf;
public abstract class x extends FrameLayout {
    public ObjectAnimator f9650a;
    public b2.v0 f9651b;
    public bi.o0 f9652c;
    public Paint d;
    public float e;
    public boolean f9653f;
    public float h;
    public boolean f9654n;
    public dh.d f9655r;

    public final void a() {
        ObjectAnimator objectAnimator = this.f9650a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f9650a.cancel();
            this.f9650a = null;
        }
    }

    public final void b() {
        bi.o0 o0Var = this.f9652c;
        dh.d dVar = this.f9655r;
        if (dVar != null) {
            dVar.setBounds(0, ((int) this.h) - AndroidUtilities.dp(25.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + getMeasuredHeight());
            o0Var.invalidateOutline();
            o0Var.invalidate();
        }
    }

    public final void c() {
        if (!this.f9653f) {
            this.f9653f = true;
            a();
            bi.o0 o0Var = this.f9652c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(o0Var, FrameLayout.TRANSLATION_Y, o0Var.getTranslationY(), (getMeasuredHeight() - this.h) + AndroidUtilities.dp(40.0f));
            this.f9650a = ofFloat;
            ofFloat.addListener(new ah.b(this, 23));
            this.f9650a.setDuration(150L);
            this.f9650a.setInterpolator(es.f24771f);
            this.f9650a.start();
            b0 b0Var = ((pf) this).v.f22919l0;
            if (b0Var != null) {
                b0Var.setOpened(false);
            }
        }
    }

    public final void d(boolean z10) {
        if (this.f9653f) {
            return;
        }
        bi.o0 o0Var = this.f9652c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(o0Var, FrameLayout.TRANSLATION_Y, o0Var.getTranslationY(), 0.0f);
        this.f9650a = ofFloat;
        if (z10) {
            ofFloat.setDuration(320L);
            this.f9650a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.f9650a.setInterpolator(es.f24771f);
        }
        this.f9650a.start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.h - AndroidUtilities.dp(24.0f)) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public mm0 getListView() {
        return this.f9652c;
    }

    @Override
    public int getNestedScrollAxes() {
        return this.f9651b.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        bi.o0 o0Var = this.f9652c;
        super.onMeasure(i10, i11);
        if (this.f9654n && !this.f9653f) {
            o0Var.setTranslationY(AndroidUtilities.dp(16.0f) + (o0Var.getMeasuredHeight() - o0Var.getPaddingTop()));
            d(true);
            this.f9654n = false;
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
        bi.o0 o0Var = this.f9652c;
        if (!this.f9653f) {
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
        bi.o0 o0Var = this.f9652c;
        if (!this.f9653f) {
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
        this.f9651b.f2444a = i10;
        if (this.f9653f) {
            return;
        }
        a();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if (!this.f9653f && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f9651b.f2444a = 0;
        boolean z10 = this.f9653f;
        if (z10 || z10) {
            return;
        }
        if (this.f9652c.getTranslationY() > AndroidUtilities.dp(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(dh.d dVar) {
        this.f9655r = dVar;
        dVar.q(AndroidUtilities.dp(22.0f));
        this.f9655r.p(AndroidUtilities.dp(5.0f));
        bi.o0 o0Var = this.f9652c;
        if (dVar.f6559k == null) {
            dVar.f6559k = new dh.b(dVar, 0);
        }
        o0Var.setOutlineProvider(dVar.f6559k);
    }
}
