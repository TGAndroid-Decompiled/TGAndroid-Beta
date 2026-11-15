package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
public final class q5 extends FrameLayout {
    public final s1 f9267a;
    public final p5 f9268b;
    public final p5 f9269c;
    public final p5 d;
    public boolean f9270e;
    public final h6.m f9271f;
    public final RectF h;

    public q5(Context context, org.telegram.ui.ActionBar.e6 e6Var, s1 s1Var) {
        super(context);
        this.f9271f = new h6.m(29);
        this.h = new RectF();
        this.f9267a = s1Var;
        p5 p5Var = new p5(context, e6Var);
        this.f9268b = p5Var;
        p5 p5Var2 = new p5(context, e6Var);
        this.f9269c = p5Var2;
        p5 p5Var3 = new p5(context, e6Var);
        this.d = p5Var3;
        addView(p5Var, c8.ja.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(p5Var2, c8.ja.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(p5Var3, c8.ja.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
    }

    public final void a(g5 g5Var, float f10, boolean z10, g5 g5Var2, float f11, boolean z11, g5 g5Var3, float f12, boolean z12) {
        s1 s1Var = this.f9267a;
        p5 p5Var = this.f9268b;
        if (g5Var != null) {
            if (z10) {
                f10 = Math.max(0.5f, f10);
            }
            p5Var.setVisibility(0);
            p5Var.f(g5Var.f8597a, g5Var.f8598b, s1Var);
            p5Var.setTranslationY(org.telegram.messenger.g0.L(36.0f) * ((f10 - 0.5f) / 1.5f));
        } else {
            p5Var.setVisibility(4);
        }
        p5 p5Var2 = this.f9269c;
        if (g5Var2 != null) {
            float f13 = f11;
            if (z11) {
                f13 = Math.max(0.5f, f13);
            }
            float f14 = (f13 - 0.5f) / 1.5f;
            p5Var2.setVisibility(0);
            p5Var2.f(g5Var2.f8597a, g5Var2.f8598b, s1Var);
            p5Var2.setTranslationY(org.telegram.messenger.g0.L(36.0f) * f14);
            if (z11 && f14 <= 0.0f && !this.f9270e) {
                this.f9270e = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ah.h(p5Var2, 8));
                ofFloat.setDuration(180L);
                ofFloat.start();
            }
        } else {
            p5Var2.setVisibility(4);
        }
        p5 p5Var3 = this.d;
        if (g5Var3 != null) {
            float f15 = f12;
            if (z12) {
                f15 = Math.max(0.5f, f15);
            }
            p5Var3.setVisibility(0);
            p5Var3.f(g5Var3.f8597a, g5Var3.f8598b, s1Var);
            p5Var3.setTranslationY(org.telegram.messenger.g0.L(36.0f) * ((f15 - 0.5f) / 1.5f));
            return;
        }
        p5Var3.setVisibility(4);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        RectF rectF = this.h;
        rectF.set(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.L(8.0f));
        h6.m mVar = this.f9271f;
        mVar.m(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, getHeight() - org.telegram.messenger.g0.L(8.0f), getWidth(), getHeight());
        mVar.m(canvas, rectF, 3, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(37.66f), 1073741824));
    }
}
