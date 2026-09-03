package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.mt0;
import org.telegram.ui.yh;
public final class y0 extends FrameLayout {
    public float f5549a;
    public float f5550b;
    public final mt0 f5551c;

    public y0(mt0 mt0Var, Context context) {
        super(context);
        this.f5551c = mt0Var;
        new Path();
        setWillNotDraw(false);
        Paint paint = mt0Var.E1;
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
        mt0 mt0Var = this.f5551c;
        dg.e2 e2Var = mt0Var.H1;
        Paint paint = mt0Var.F1;
        Paint paint2 = mt0Var.E1;
        Paint paint3 = mt0Var.G1;
        barView = mt0Var.getBarView();
        Rect rect = AndroidUtilities.rectTmp2;
        int left = barView.getLeft();
        x0 x0Var = mt0Var.D1;
        rect.set(AndroidUtilities.lerp(left, x0Var.getLeft(), mt0Var.K1), AndroidUtilities.lerp(barView.getTop(), x0Var.getTop(), mt0Var.K1), AndroidUtilities.lerp(barView.getRight(), x0Var.getRight(), mt0Var.K1), AndroidUtilities.lerp(barView.getBottom(), x0Var.getBottom(), mt0Var.K1));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), mt0Var.K1);
        if (mt0Var.Z1 != null) {
            rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            mt0Var.Z1.p(lerp);
            mt0Var.Z1.setBounds(rect);
            mt0Var.Z1.draw(canvas2);
        } else {
            canvas2.drawRoundRect(rectF, lerp, lerp, mt0Var.L1);
        }
        if (barView.getChildCount() >= 1 && mt0Var.K1 != 1.0f) {
            canvas2.save();
            canvas2.translate(barView.getLeft(), barView.getTop());
            View childAt = barView.getChildAt(0);
            if (barView instanceof i2) {
                childAt = ((i2) barView).getColorClickableView();
            }
            if (childAt.getAlpha() != 0.0f) {
                canvas2.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
                paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - mt0Var.K1) * 255.0f));
                int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
                int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
                float x10 = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
                float y10 = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
                int i10 = e2Var.f4524a;
                int i11 = mt0Var.f5108e1;
                View view = childAt;
                if (i11 != -1) {
                    if (i11 == 0) {
                        viewGroup = mt0Var.f5126q1;
                    } else if (i11 == 2) {
                        viewGroup = mt0Var.f5127r1;
                    } else {
                        viewGroup = null;
                    }
                    if (viewGroup == null) {
                        viewGroup2 = barView;
                    } else {
                        viewGroup2 = viewGroup;
                    }
                    View childAt2 = viewGroup2.getChildAt(0);
                    if (viewGroup instanceof i2) {
                        childAt2 = ((i2) viewGroup).getColorClickableView();
                    }
                    x10 = AndroidUtilities.lerp(x10, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), mt0Var.f5110f1);
                    y10 = AndroidUtilities.lerp(y10, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), mt0Var.f5110f1);
                }
                if (x0Var != null && x0Var.getChildCount() > 0) {
                    View childAt3 = x0Var.getChildAt(0);
                    x10 = AndroidUtilities.lerp(x10, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (x0Var.getX() - barView.getLeft()), mt0Var.K1);
                    y10 = AndroidUtilities.lerp(y10, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (x0Var.getY() - barView.getTop()), mt0Var.K1);
                    i10 = i0.a.d(mt0Var.K1, e2Var.f4524a, mt0Var.S1.b(0));
                }
                float f10 = x10;
                float f11 = y10;
                if (f10 != this.f5549a || f11 != this.f5550b) {
                    this.f5549a = f10;
                    this.f5550b = f11;
                    paint2.setShader(new SweepGradient(f10, f11, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
                }
                float min = (Math.min(width, height) / 2.0f) - AndroidUtilities.dp(0.5f);
                if (x0Var != null && x0Var.getChildCount() > 0) {
                    View childAt4 = x0Var.getChildAt(0);
                    min = AndroidUtilities.lerp(min, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f), mt0Var.K1);
                }
                float f12 = min;
                rectF.set(f10 - f12, f11 - f12, f10 + f12, f11 + f12);
                canvas2 = canvas;
                canvas2.drawArc(rectF, 0.0f, 360.0f, false, paint2);
                paint.setColor(i10);
                paint.setAlpha((int) (view.getAlpha() * paint.getAlpha()));
                paint3.setColor(i10);
                paint3.setAlpha((int) (view.getAlpha() * 255.0f));
                float dp = f12 - AndroidUtilities.dp(3.0f);
                if (x0Var != null && x0Var.getSelectedColorIndex() != 0) {
                    dp = AndroidUtilities.lerp(f12 - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(2.0f) + f12, mt0Var.K1);
                }
                c2.w1(f10, f11, dp, paint.getColor(), canvas2);
                if (x0Var != null && x0Var.getSelectedColorIndex() == 0) {
                    paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * mt0Var.K1));
                    canvas2.drawCircle(f10, f11, yh.c(1.0f, mt0Var.K1, paint3.getStrokeWidth() + AndroidUtilities.dp(3.0f), f12), paint3);
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        w0 w0Var = this.f5551c.f5101a1;
        if (w0Var != null) {
            w0Var.invalidate();
        }
    }
}
