package ci;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
public final class z5 extends FrameLayout {
    public final y1 f6458a;
    public final y5 f6459b;
    public final y5 f6460c;
    public final y5 d;
    public boolean f6461e;
    public final k4.j f6462f;
    public final RectF h;

    public z5(Context context, org.telegram.ui.ActionBar.e6 e6Var, y1 y1Var) {
        super(context);
        this.f6462f = new k4.j(24);
        this.h = new RectF();
        this.f6458a = y1Var;
        y5 y5Var = new y5(context, e6Var);
        this.f6459b = y5Var;
        y5 y5Var2 = new y5(context, e6Var);
        this.f6460c = y5Var2;
        y5 y5Var3 = new y5(context, e6Var);
        this.d = y5Var3;
        addView(y5Var, mf.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(y5Var2, mf.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(y5Var3, mf.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
    }

    public final void a(p5 p5Var, float f10, boolean z10, p5 p5Var2, float f11, boolean z11, p5 p5Var3, float f12, boolean z12) {
        y1 y1Var = this.f6458a;
        y5 y5Var = this.f6459b;
        if (p5Var != null) {
            if (z10) {
                f10 = Math.max(0.5f, f10);
            }
            y5Var.setVisibility(0);
            y5Var.f(p5Var.f5748a, p5Var.f5749b, y1Var);
            y5Var.setTranslationY(org.telegram.messenger.g0.L(36.0f) * ((f10 - 0.5f) / 1.5f));
        } else {
            y5Var.setVisibility(4);
        }
        y5 y5Var2 = this.f6460c;
        if (p5Var2 != null) {
            float f13 = f11;
            if (z11) {
                f13 = Math.max(0.5f, f13);
            }
            float f14 = (f13 - 0.5f) / 1.5f;
            y5Var2.setVisibility(0);
            y5Var2.f(p5Var2.f5748a, p5Var2.f5749b, y1Var);
            y5Var2.setTranslationY(org.telegram.messenger.g0.L(36.0f) * f14);
            if (z11 && f14 <= 0.0f && !this.f6461e) {
                this.f6461e = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new bh.f(y5Var2, 6));
                ofFloat.setDuration(180L);
                ofFloat.start();
            }
        } else {
            y5Var2.setVisibility(4);
        }
        y5 y5Var3 = this.d;
        if (p5Var3 != null) {
            float f15 = f12;
            if (z12) {
                f15 = Math.max(0.5f, f15);
            }
            y5Var3.setVisibility(0);
            y5Var3.f(p5Var3.f5748a, p5Var3.f5749b, y1Var);
            y5Var3.setTranslationY(org.telegram.messenger.g0.L(36.0f) * ((f15 - 0.5f) / 1.5f));
            return;
        }
        y5Var3.setVisibility(4);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        RectF rectF = this.h;
        rectF.set(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.L(8.0f));
        k4.j jVar = this.f6462f;
        jVar.w(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, getHeight() - org.telegram.messenger.g0.L(8.0f), getWidth(), getHeight());
        jVar.w(canvas, rectF, 3, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(37.66f), 1073741824));
    }
}
