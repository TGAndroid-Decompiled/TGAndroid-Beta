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
    public ObjectAnimator f9653a;
    public b2.v0 f9654b;
    public bi.o0 f9655c;
    public Paint d;
    public float e;
    public boolean f9656f;
    public float h;
    public boolean f9657n;
    public dh.d f9658r;

    public final void a() {
        ObjectAnimator objectAnimator = this.f9653a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f9653a.cancel();
            this.f9653a = null;
        }
    }

    public final void b() {
        bi.o0 o0Var = this.f9655c;
        dh.d dVar = this.f9658r;
        if (dVar != null) {
            dVar.setBounds(0, ((int) this.h) - AndroidUtilities.dp(25.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + getMeasuredHeight());
            o0Var.invalidateOutline();
            o0Var.invalidate();
        }
    }

    public final void c() {
        if (!this.f9656f) {
            this.f9656f = true;
            a();
            bi.o0 o0Var = this.f9655c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(o0Var, FrameLayout.TRANSLATION_Y, o0Var.getTranslationY(), (getMeasuredHeight() - this.h) + AndroidUtilities.dp(40.0f));
            this.f9653a = ofFloat;
            ofFloat.addListener(new ah.b(this, 23));
            this.f9653a.setDuration(150L);
            this.f9653a.setInterpolator(es.f24465f);
            this.f9653a.start();
            b0 b0Var = ((pf) this).v.f22619l0;
            if (b0Var != null) {
                b0Var.setOpened(false);
            }
        }
    }

    public final void d(boolean z10) {
        if (this.f9656f) {
            return;
        }
        bi.o0 o0Var = this.f9655c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(o0Var, FrameLayout.TRANSLATION_Y, o0Var.getTranslationY(), 0.0f);
        this.f9653a = ofFloat;
        if (z10) {
            ofFloat.setDuration(320L);
            this.f9653a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.f9653a.setInterpolator(es.f24465f);
        }
        this.f9653a.start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.h - AndroidUtilities.dp(24.0f)) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public mm0 getListView() {
        return this.f9655c;
    }

    @Override
    public int getNestedScrollAxes() {
        return this.f9654b.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        bi.o0 o0Var = this.f9655c;
        super.onMeasure(i10, i11);
        if (this.f9657n && !this.f9656f) {
            o0Var.setTranslationY(AndroidUtilities.dp(16.0f) + (o0Var.getMeasuredHeight() - o0Var.getPaddingTop()));
            d(true);
            this.f9657n = false;
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
        bi.o0 o0Var = this.f9655c;
        if (!this.f9656f) {
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
        bi.o0 o0Var = this.f9655c;
        if (!this.f9656f) {
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
        this.f9654b.f2448a = i10;
        if (this.f9656f) {
            return;
        }
        a();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if (!this.f9656f && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f9654b.f2448a = 0;
        boolean z10 = this.f9656f;
        if (z10 || z10) {
            return;
        }
        if (this.f9655c.getTranslationY() > AndroidUtilities.dp(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(dh.d dVar) {
        this.f9658r = dVar;
        dVar.q(AndroidUtilities.dp(22.0f));
        this.f9658r.p(AndroidUtilities.dp(5.0f));
        bi.o0 o0Var = this.f9655c;
        if (dVar.f6562k == null) {
            dVar.f6562k = new dh.b(dVar, 0);
        }
        o0Var.setOutlineProvider(dVar.f6562k);
    }
}
