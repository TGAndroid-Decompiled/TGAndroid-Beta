package bi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
public final class x6 extends FrameLayout {
    public final h2 f5028a;
    public final w6 f5029b;
    public final w6 f5030c;
    public final w6 d;
    public boolean f5031e;
    public final h6.m f5032f;
    public final RectF h;

    public x6(Context context, org.telegram.ui.ActionBar.f6 f6Var, h2 h2Var) {
        super(context);
        this.f5032f = new h6.m(28);
        this.h = new RectF();
        this.f5028a = h2Var;
        w6 w6Var = new w6(context, f6Var);
        this.f5029b = w6Var;
        w6 w6Var2 = new w6(context, f6Var);
        this.f5030c = w6Var2;
        w6 w6Var3 = new w6(context, f6Var);
        this.d = w6Var3;
        addView(w6Var, c8.ha.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(w6Var2, c8.ha.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(w6Var3, c8.ha.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
    }

    public final void a(n6 n6Var, float f10, boolean z9, n6 n6Var2, float f11, boolean z10, n6 n6Var3, float f12, boolean z11) {
        h2 h2Var = this.f5028a;
        w6 w6Var = this.f5029b;
        if (n6Var != null) {
            if (z9) {
                f10 = Math.max(0.5f, f10);
            }
            w6Var.setVisibility(0);
            w6Var.f(n6Var.f4408a, n6Var.f4409b, h2Var);
            w6Var.setTranslationY(org.telegram.messenger.g0.L(36.0f) * ((f10 - 0.5f) / 1.5f));
        } else {
            w6Var.setVisibility(4);
        }
        w6 w6Var2 = this.f5030c;
        if (n6Var2 != null) {
            float f13 = f11;
            if (z10) {
                f13 = Math.max(0.5f, f13);
            }
            float f14 = (f13 - 0.5f) / 1.5f;
            w6Var2.setVisibility(0);
            w6Var2.f(n6Var2.f4408a, n6Var2.f4409b, h2Var);
            w6Var2.setTranslationY(org.telegram.messenger.g0.L(36.0f) * f14);
            if (z10 && f14 <= 0.0f && !this.f5031e) {
                this.f5031e = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ah.h(w6Var2, 6));
                ofFloat.setDuration(180L);
                ofFloat.start();
            }
        } else {
            w6Var2.setVisibility(4);
        }
        w6 w6Var3 = this.d;
        if (n6Var3 != null) {
            float f15 = f12;
            if (z11) {
                f15 = Math.max(0.5f, f15);
            }
            w6Var3.setVisibility(0);
            w6Var3.f(n6Var3.f4408a, n6Var3.f4409b, h2Var);
            w6Var3.setTranslationY(org.telegram.messenger.g0.L(36.0f) * ((f15 - 0.5f) / 1.5f));
            return;
        }
        w6Var3.setVisibility(4);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        RectF rectF = this.h;
        rectF.set(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.L(8.0f));
        h6.m mVar = this.f5032f;
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
