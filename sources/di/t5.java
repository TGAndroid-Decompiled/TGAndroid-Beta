package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
public final class t5 extends FrameLayout {
    public final q1 f9825a;
    public final s5 f9826b;
    public final s5 f9827c;
    public final s5 d;
    public boolean f9828e;
    public final h6.m f9829f;
    public final RectF h;

    public t5(Context context, org.telegram.ui.ActionBar.h6 h6Var, q1 q1Var) {
        super(context);
        this.f9829f = new h6.m(29);
        this.h = new RectF();
        this.f9825a = q1Var;
        s5 s5Var = new s5(context, h6Var);
        this.f9826b = s5Var;
        s5 s5Var2 = new s5(context, h6Var);
        this.f9827c = s5Var2;
        s5 s5Var3 = new s5(context, h6Var);
        this.d = s5Var3;
        addView(s5Var, c8.ma.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(s5Var2, c8.ma.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(s5Var3, c8.ma.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
    }

    public final void a(j5 j5Var, float f10, boolean z10, j5 j5Var2, float f11, boolean z11, j5 j5Var3, float f12, boolean z12) {
        q1 q1Var = this.f9825a;
        s5 s5Var = this.f9826b;
        if (j5Var != null) {
            if (z10) {
                f10 = Math.max(0.5f, f10);
            }
            s5Var.setVisibility(0);
            s5Var.f(j5Var.f9100a, j5Var.f9101b, q1Var);
            s5Var.setTranslationY(org.telegram.messenger.g0.L(36.0f) * ((f10 - 0.5f) / 1.5f));
        } else {
            s5Var.setVisibility(4);
        }
        s5 s5Var2 = this.f9827c;
        if (j5Var2 != null) {
            float f13 = f11;
            if (z11) {
                f13 = Math.max(0.5f, f13);
            }
            float f14 = (f13 - 0.5f) / 1.5f;
            s5Var2.setVisibility(0);
            s5Var2.f(j5Var2.f9100a, j5Var2.f9101b, q1Var);
            s5Var2.setTranslationY(org.telegram.messenger.g0.L(36.0f) * f14);
            if (z11 && f14 <= 0.0f && !this.f9828e) {
                this.f9828e = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ah.g(s5Var2, 8));
                ofFloat.setDuration(180L);
                ofFloat.start();
            }
        } else {
            s5Var2.setVisibility(4);
        }
        s5 s5Var3 = this.d;
        if (j5Var3 != null) {
            float f15 = f12;
            if (z12) {
                f15 = Math.max(0.5f, f15);
            }
            s5Var3.setVisibility(0);
            s5Var3.f(j5Var3.f9100a, j5Var3.f9101b, q1Var);
            s5Var3.setTranslationY(org.telegram.messenger.g0.L(36.0f) * ((f15 - 0.5f) / 1.5f));
            return;
        }
        s5Var3.setVisibility(4);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        RectF rectF = this.h;
        rectF.set(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.L(8.0f));
        h6.m mVar = this.f9829f;
        mVar.n(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, getHeight() - org.telegram.messenger.g0.L(8.0f), getWidth(), getHeight());
        mVar.n(canvas, rectF, 3, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(37.66f), 1073741824));
    }
}
