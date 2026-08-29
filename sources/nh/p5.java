package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.th;
public final class p5 extends FrameLayout {
    public float f18352a;
    public float f18353b;
    public final ag.h1 f18354c;
    public final ja d;

    public p5(ja jaVar, Context context, ag.h1 h1Var) {
        super(context);
        this.d = jaVar;
        this.f18354c = h1Var;
        new Path();
        setWillNotDraw(false);
        Paint paint = jaVar.f18659t1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ViewGroup barView;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        ja jaVar = this.d;
        ag.k2 k2Var = jaVar.f18665w1;
        Paint paint = jaVar.f18661u1;
        Paint paint2 = jaVar.f18659t1;
        Paint paint3 = jaVar.f18663v1;
        barView = jaVar.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        int left = barView.getLeft();
        x4 x4Var = jaVar.f18657s1;
        rectF.set(AndroidUtilities.lerp(left, x4Var.getLeft(), jaVar.f18671z1), AndroidUtilities.lerp(barView.getTop(), x4Var.getTop(), jaVar.f18671z1), AndroidUtilities.lerp(barView.getRight(), x4Var.getRight(), jaVar.f18671z1), AndroidUtilities.lerp(barView.getBottom(), x4Var.getBottom(), jaVar.f18671z1));
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), jaVar.f18671z1);
        canvas2.drawRoundRect(rectF, lerp, lerp, jaVar.A1);
        if (barView.getChildCount() >= 1 && jaVar.f18671z1 != 1.0f) {
            canvas2.save();
            canvas2.translate(barView.getLeft(), barView.getTop());
            View childAt = barView.getChildAt(0);
            if (barView instanceof bg.n2) {
                childAt = ((bg.n2) barView).getColorClickableView();
            }
            if (childAt.getAlpha() != 0.0f) {
                canvas2.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
                paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - jaVar.f18671z1) * 255.0f));
                int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
                int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
                float x4 = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
                float y8 = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
                int i10 = k2Var.f571a;
                int i11 = jaVar.V0;
                View view = childAt;
                if (i11 != -1) {
                    if (i11 == 0) {
                        viewGroup = jaVar.f18634g1;
                    } else if (i11 == 2) {
                        viewGroup = jaVar.f18636h1;
                    } else {
                        viewGroup = null;
                    }
                    if (viewGroup == null) {
                        viewGroup2 = barView;
                    } else {
                        viewGroup2 = viewGroup;
                    }
                    View childAt2 = viewGroup2.getChildAt(0);
                    if (viewGroup instanceof bg.n2) {
                        childAt2 = ((bg.n2) viewGroup).getColorClickableView();
                    }
                    x4 = AndroidUtilities.lerp(x4, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), jaVar.W0);
                    y8 = AndroidUtilities.lerp(y8, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), jaVar.W0);
                }
                if (x4Var != null && x4Var.getChildCount() > 0) {
                    View childAt3 = x4Var.getChildAt(0);
                    x4 = AndroidUtilities.lerp(x4, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (x4Var.getX() - barView.getLeft()), jaVar.f18671z1);
                    y8 = AndroidUtilities.lerp(y8, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (x4Var.getY() - barView.getTop()), jaVar.f18671z1);
                    i10 = i0.a.d(jaVar.f18671z1, k2Var.f571a, this.f18354c.b(0));
                }
                float f9 = x4;
                float f10 = y8;
                if (f9 != this.f18352a || f10 != this.f18353b) {
                    this.f18352a = f9;
                    this.f18353b = f10;
                    paint2.setShader(new SweepGradient(f9, f10, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
                }
                float min = (Math.min(width, height) / 2.0f) - AndroidUtilities.dp(0.5f);
                if (x4Var != null && x4Var.getChildCount() > 0) {
                    View childAt4 = x4Var.getChildAt(0);
                    min = AndroidUtilities.lerp(min, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f), jaVar.f18671z1);
                }
                float f11 = min;
                rectF.set(f9 - f11, f10 - f11, f9 + f11, f10 + f11);
                canvas2 = canvas;
                canvas2.drawArc(rectF, 0.0f, 360.0f, false, paint2);
                paint.setColor(i10);
                paint.setAlpha((int) (view.getAlpha() * paint.getAlpha()));
                paint3.setColor(i10);
                paint3.setAlpha((int) (view.getAlpha() * 255.0f));
                float dp = f11 - AndroidUtilities.dp(3.0f);
                if (x4Var != null && x4Var.getSelectedColorIndex() != 0) {
                    dp = AndroidUtilities.lerp(f11 - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(2.0f) + f11, jaVar.f18671z1);
                }
                bg.h2.x1(f9, f10, dp, paint.getColor(), canvas2);
                if (x4Var != null && x4Var.getSelectedColorIndex() == 0) {
                    paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * jaVar.f18671z1));
                    canvas2.drawCircle(f9, f10, th.b(1.0f, jaVar.f18671z1, paint3.getStrokeWidth() + AndroidUtilities.dp(3.0f), f11), paint3);
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void setTranslationY(float f9) {
        super.setTranslationY(f9);
        w4 w4Var = this.d.Q0;
        if (w4Var != null) {
            w4Var.invalidate();
        }
    }
}
