package mh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.h20;
public final class w4 extends FrameLayout {
    public final n1 f14980a;
    public final v4 f14981b;
    public final v4 f14982c;
    public final v4 d;
    public boolean f14983e;
    public final h20 f14984f;
    public final RectF h;

    public w4(Context context, org.telegram.ui.ActionBar.g6 g6Var, n1 n1Var) {
        super(context);
        this.f14984f = new h20();
        this.h = new RectF();
        this.f14980a = n1Var;
        v4 v4Var = new v4(context, g6Var);
        this.f14981b = v4Var;
        v4 v4Var2 = new v4(context, g6Var);
        this.f14982c = v4Var2;
        v4 v4Var3 = new v4(context, g6Var);
        this.d = v4Var3;
        addView(v4Var, k7.c6.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(v4Var2, k7.c6.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(v4Var3, k7.c6.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
    }

    public final void a(m4 m4Var, float f10, boolean z4, m4 m4Var2, float f11, boolean z10, m4 m4Var3, float f12, boolean z11) {
        n1 n1Var = this.f14980a;
        v4 v4Var = this.f14981b;
        if (m4Var != null) {
            if (z4) {
                f10 = Math.max(0.5f, f10);
            }
            v4Var.setVisibility(0);
            v4Var.e(m4Var.f14449a, m4Var.f14450b, n1Var);
            v4Var.setTranslationY(AndroidUtilities.dp(36.0f) * ((f10 - 0.5f) / 1.5f));
        } else {
            v4Var.setVisibility(4);
        }
        v4 v4Var2 = this.f14982c;
        if (m4Var2 != null) {
            float f13 = f11;
            if (z10) {
                f13 = Math.max(0.5f, f13);
            }
            float f14 = (f13 - 0.5f) / 1.5f;
            v4Var2.setVisibility(0);
            v4Var2.e(m4Var2.f14449a, m4Var2.f14450b, n1Var);
            v4Var2.setTranslationY(AndroidUtilities.dp(36.0f) * f14);
            if (z10 && f14 <= 0.0f && !this.f14983e) {
                this.f14983e = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new eg.m1(v4Var2, 14));
                ofFloat.setDuration(180L);
                ofFloat.start();
            }
        } else {
            v4Var2.setVisibility(4);
        }
        v4 v4Var3 = this.d;
        if (m4Var3 != null) {
            float f15 = f12;
            if (z11) {
                f15 = Math.max(0.5f, f15);
            }
            v4Var3.setVisibility(0);
            v4Var3.e(m4Var3.f14449a, m4Var3.f14450b, n1Var);
            v4Var3.setTranslationY(AndroidUtilities.dp(36.0f) * ((f15 - 0.5f) / 1.5f));
            return;
        }
        v4Var3.setVisibility(4);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        RectF rectF = this.h;
        rectF.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(8.0f));
        h20 h20Var = this.f14984f;
        h20Var.b(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, getHeight() - AndroidUtilities.dp(8.0f), getWidth(), getHeight());
        h20Var.b(canvas, rectF, 3, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(37.66f), 1073741824));
    }
}
