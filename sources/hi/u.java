package hi;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import bi.t5;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.ve;
import org.telegram.ui.Components.xq;
public abstract class u extends FrameLayout {
    public ObjectAnimator f14965a;
    public e2.r0 f14966b;
    public bi.q1 f14967c;
    public Paint d;
    public float f14968e;
    public boolean f14969f;
    public float h;
    public boolean f14970n;
    public fh.g f14971r;

    public final void a() {
        ObjectAnimator objectAnimator = this.f14965a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f14965a.cancel();
            this.f14965a = null;
        }
    }

    public final void b() {
        bi.q1 q1Var = this.f14967c;
        fh.g gVar = this.f14971r;
        if (gVar != null) {
            gVar.setBounds(0, ((int) this.h) - org.telegram.messenger.g0.L(25.0f), getMeasuredWidth(), org.telegram.messenger.g0.L(5.0f) + getMeasuredHeight());
            q1Var.invalidateOutline();
            q1Var.invalidate();
        }
    }

    public final void c() {
        if (!this.f14969f) {
            this.f14969f = true;
            a();
            bi.q1 q1Var = this.f14967c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(q1Var, FrameLayout.TRANSLATION_Y, q1Var.getTranslationY(), (getMeasuredHeight() - this.h) + org.telegram.messenger.g0.L(40.0f));
            this.f14965a = ofFloat;
            ofFloat.addListener(new t5(this, 26));
            this.f14965a.setDuration(150L);
            this.f14965a.setInterpolator(xq.f40458f);
            this.f14965a.start();
            y yVar = ((ve) this).f39047w.f31087l0;
            if (yVar != null) {
                yVar.setOpened(false);
            }
        }
    }

    public final void d(boolean z9) {
        if (this.f14969f) {
            return;
        }
        bi.q1 q1Var = this.f14967c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(q1Var, FrameLayout.TRANSLATION_Y, q1Var.getTranslationY(), 0.0f);
        this.f14965a = ofFloat;
        if (z9) {
            ofFloat.setDuration(320L);
            this.f14965a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.f14965a.setInterpolator(xq.f40458f);
        }
        this.f14965a.start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.h - org.telegram.messenger.g0.L(24.0f)) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public qj0 getListView() {
        return this.f14967c;
    }

    @Override
    public int getNestedScrollAxes() {
        return this.f14966b.b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        bi.q1 q1Var = this.f14967c;
        super.onMeasure(i7, i10);
        if (this.f14970n && !this.f14969f) {
            q1Var.setTranslationY(org.telegram.messenger.g0.L(16.0f) + (q1Var.getMeasuredHeight() - q1Var.getPaddingTop()));
            d(true);
            this.f14970n = false;
        }
        b();
    }

    @Override
    public final boolean onNestedFling(View view, float f10, float f11, boolean z9) {
        return false;
    }

    @Override
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override
    public final void onNestedPreScroll(View view, int i7, int i10, int[] iArr) {
        bi.q1 q1Var = this.f14967c;
        if (!this.f14969f) {
            a();
            float translationY = q1Var.getTranslationY();
            float f10 = 0.0f;
            if (translationY > 0.0f && i10 > 0) {
                float f11 = translationY - i10;
                iArr[1] = i10;
                if (f11 >= 0.0f) {
                    f10 = f11;
                }
                q1Var.setTranslationY(f10);
                invalidate();
            }
        }
    }

    @Override
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        bi.q1 q1Var = this.f14967c;
        if (!this.f14969f) {
            a();
            if (i12 != 0) {
                float translationY = q1Var.getTranslationY() - i12;
                if (translationY < 0.0f) {
                    translationY = 0.0f;
                }
                q1Var.setTranslationY(translationY);
                invalidate();
            }
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        this.f14966b.f10533a = i7;
        if (this.f14969f) {
            return;
        }
        a();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        if (!this.f14969f && i7 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f14966b.f10533a = 0;
        boolean z9 = this.f14969f;
        if (z9 || z9) {
            return;
        }
        if (this.f14967c.getTranslationY() > org.telegram.messenger.g0.L(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(fh.g gVar) {
        this.f14971r = gVar;
        gVar.r(org.telegram.messenger.g0.L(22.0f));
        this.f14971r.q(org.telegram.messenger.g0.L(5.0f));
        bi.q1 q1Var = this.f14967c;
        if (gVar.R == null) {
            gVar.R = new fh.a(gVar, 0);
        }
        q1Var.setOutlineProvider(gVar.R);
    }
}
