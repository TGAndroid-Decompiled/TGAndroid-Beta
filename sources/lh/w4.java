package lh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.i20;
public final class w4 extends FrameLayout {
    public final o1 f13273a;
    public final v4 f13274b;
    public final v4 f13275c;
    public final v4 d;
    public boolean e;
    public final i20 f13276f;
    public final RectF h;

    public w4(Context context, org.telegram.ui.ActionBar.f6 f6Var, o1 o1Var) {
        super(context);
        this.f13276f = new i20();
        this.h = new RectF();
        this.f13273a = o1Var;
        v4 v4Var = new v4(context, f6Var);
        this.f13274b = v4Var;
        v4 v4Var2 = new v4(context, f6Var);
        this.f13275c = v4Var2;
        v4 v4Var3 = new v4(context, f6Var);
        this.d = v4Var3;
        addView(v4Var, k7.b6.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(v4Var2, k7.b6.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(v4Var3, k7.b6.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
    }

    public final void a(m4 m4Var, float f10, boolean z4, m4 m4Var2, float f11, boolean z10, m4 m4Var3, float f12, boolean z11) {
        o1 o1Var = this.f13273a;
        v4 v4Var = this.f13274b;
        if (m4Var != null) {
            if (z4) {
                f10 = Math.max(0.5f, f10);
            }
            v4Var.setVisibility(0);
            v4Var.e(m4Var.f12780a, m4Var.f12781b, o1Var);
            v4Var.setTranslationY(AndroidUtilities.dp(36.0f) * ((f10 - 0.5f) / 1.5f));
        } else {
            v4Var.setVisibility(4);
        }
        v4 v4Var2 = this.f13275c;
        if (m4Var2 != null) {
            float f13 = f11;
            if (z10) {
                f13 = Math.max(0.5f, f13);
            }
            float f14 = (f13 - 0.5f) / 1.5f;
            v4Var2.setVisibility(0);
            v4Var2.e(m4Var2.f12780a, m4Var2.f12781b, o1Var);
            v4Var2.setTranslationY(AndroidUtilities.dp(36.0f) * f14);
            if (z10 && f14 <= 0.0f && !this.e) {
                this.e = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new dg.o1(v4Var2, 14));
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
            v4Var3.e(m4Var3.f12780a, m4Var3.f12781b, o1Var);
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
        i20 i20Var = this.f13276f;
        i20Var.b(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, getHeight() - AndroidUtilities.dp(8.0f), getWidth(), getHeight());
        i20Var.b(canvas, rectF, 3, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(37.66f), 1073741824));
    }
}
