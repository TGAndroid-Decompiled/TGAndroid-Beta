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
    public ObjectAnimator f10126a;
    public b2.q0 f10127b;
    public bi.o0 f10128c;
    public Paint d;
    public float f10129e;
    public boolean f10130f;
    public float h;
    public boolean f10131n;
    public dh.d f10132r;

    public final void a() {
        ObjectAnimator objectAnimator = this.f10126a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f10126a.cancel();
            this.f10126a = null;
        }
    }

    public final void b() {
        bi.o0 o0Var = this.f10128c;
        dh.d dVar = this.f10132r;
        if (dVar != null) {
            dVar.setBounds(0, ((int) this.h) - AndroidUtilities.dp(25.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + getMeasuredHeight());
            o0Var.invalidateOutline();
            o0Var.invalidate();
        }
    }

    public final void c() {
        if (!this.f10130f) {
            this.f10130f = true;
            a();
            bi.o0 o0Var = this.f10128c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(o0Var, FrameLayout.TRANSLATION_Y, o0Var.getTranslationY(), (getMeasuredHeight() - this.h) + AndroidUtilities.dp(40.0f));
            this.f10126a = ofFloat;
            ofFloat.addListener(new ah.b(this, 23));
            this.f10126a.setDuration(150L);
            this.f10126a.setInterpolator(pr.f29493f);
            this.f10126a.start();
            c0 c0Var = ((of) this).v.f23758l0;
            if (c0Var != null) {
                c0Var.setOpened(false);
            }
        }
    }

    public final void d(boolean z10) {
        if (this.f10130f) {
            return;
        }
        bi.o0 o0Var = this.f10128c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(o0Var, FrameLayout.TRANSLATION_Y, o0Var.getTranslationY(), 0.0f);
        this.f10126a = ofFloat;
        if (z10) {
            ofFloat.setDuration(320L);
            this.f10126a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.f10126a.setInterpolator(pr.f29493f);
        }
        this.f10126a.start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.h - AndroidUtilities.dp(24.0f)) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public ll0 getListView() {
        return this.f10128c;
    }

    @Override
    public int getNestedScrollAxes() {
        b2.q0 q0Var = this.f10127b;
        return q0Var.f2288b | q0Var.f2287a;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        bi.o0 o0Var = this.f10128c;
        super.onMeasure(i10, i11);
        if (this.f10131n && !this.f10130f) {
            o0Var.setTranslationY(AndroidUtilities.dp(16.0f) + (o0Var.getMeasuredHeight() - o0Var.getPaddingTop()));
            d(true);
            this.f10131n = false;
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
        bi.o0 o0Var = this.f10128c;
        if (!this.f10130f) {
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
        bi.o0 o0Var = this.f10128c;
        if (!this.f10130f) {
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
        this.f10127b.f2287a = i10;
        if (this.f10130f) {
            return;
        }
        a();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if (!this.f10130f && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f10127b.f2287a = 0;
        boolean z10 = this.f10130f;
        if (z10 || z10) {
            return;
        }
        if (this.f10128c.getTranslationY() > AndroidUtilities.dp(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(dh.d dVar) {
        this.f10132r = dVar;
        dVar.p(AndroidUtilities.dp(22.0f));
        this.f10132r.o(AndroidUtilities.dp(5.0f));
        bi.o0 o0Var = this.f10128c;
        if (dVar.f6865i == null) {
            dVar.f6865i = new dh.b(dVar, 0);
        }
        o0Var.setOutlineProvider(dVar.f6865i);
    }
}
