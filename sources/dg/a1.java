package dg;

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
import org.telegram.ui.ft0;
import org.telegram.ui.yh;
public final class a1 extends FrameLayout {
    public float f4347a;
    public float f4348b;
    public final ft0 f4349c;

    public a1(ft0 ft0Var, Context context) {
        super(context);
        this.f4349c = ft0Var;
        new Path();
        setWillNotDraw(false);
        Paint paint = ft0Var.E1;
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
        ft0 ft0Var = this.f4349c;
        cg.f2 f2Var = ft0Var.H1;
        Paint paint = ft0Var.F1;
        Paint paint2 = ft0Var.E1;
        Paint paint3 = ft0Var.G1;
        barView = ft0Var.getBarView();
        Rect rect = AndroidUtilities.rectTmp2;
        int left = barView.getLeft();
        z0 z0Var = ft0Var.D1;
        rect.set(AndroidUtilities.lerp(left, z0Var.getLeft(), ft0Var.K1), AndroidUtilities.lerp(barView.getTop(), z0Var.getTop(), ft0Var.K1), AndroidUtilities.lerp(barView.getRight(), z0Var.getRight(), ft0Var.K1), AndroidUtilities.lerp(barView.getBottom(), z0Var.getBottom(), ft0Var.K1));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), ft0Var.K1);
        if (ft0Var.Z1 != null) {
            rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            ft0Var.Z1.p(lerp);
            ft0Var.Z1.setBounds(rect);
            ft0Var.Z1.draw(canvas2);
        } else {
            canvas2.drawRoundRect(rectF, lerp, lerp, ft0Var.L1);
        }
        if (barView.getChildCount() >= 1 && ft0Var.K1 != 1.0f) {
            canvas2.save();
            canvas2.translate(barView.getLeft(), barView.getTop());
            View childAt = barView.getChildAt(0);
            if (barView instanceof k2) {
                childAt = ((k2) barView).getColorClickableView();
            }
            if (childAt.getAlpha() != 0.0f) {
                canvas2.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
                paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - ft0Var.K1) * 255.0f));
                int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
                int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
                float x10 = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
                float y10 = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
                int i10 = f2Var.f2401a;
                int i11 = ft0Var.f4465e1;
                View view = childAt;
                if (i11 != -1) {
                    if (i11 == 0) {
                        viewGroup = ft0Var.f4483q1;
                    } else if (i11 == 2) {
                        viewGroup = ft0Var.f4484r1;
                    } else {
                        viewGroup = null;
                    }
                    if (viewGroup == null) {
                        viewGroup2 = barView;
                    } else {
                        viewGroup2 = viewGroup;
                    }
                    View childAt2 = viewGroup2.getChildAt(0);
                    if (viewGroup instanceof k2) {
                        childAt2 = ((k2) viewGroup).getColorClickableView();
                    }
                    x10 = AndroidUtilities.lerp(x10, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), ft0Var.f4467f1);
                    y10 = AndroidUtilities.lerp(y10, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), ft0Var.f4467f1);
                }
                if (z0Var != null && z0Var.getChildCount() > 0) {
                    View childAt3 = z0Var.getChildAt(0);
                    x10 = AndroidUtilities.lerp(x10, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (z0Var.getX() - barView.getLeft()), ft0Var.K1);
                    y10 = AndroidUtilities.lerp(y10, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (z0Var.getY() - barView.getTop()), ft0Var.K1);
                    i10 = i0.a.d(ft0Var.K1, f2Var.f2401a, ft0Var.S1.b(0));
                }
                float f10 = x10;
                float f11 = y10;
                if (f10 != this.f4347a || f11 != this.f4348b) {
                    this.f4347a = f10;
                    this.f4348b = f11;
                    paint2.setShader(new SweepGradient(f10, f11, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
                }
                float min = (Math.min(width, height) / 2.0f) - AndroidUtilities.dp(0.5f);
                if (z0Var != null && z0Var.getChildCount() > 0) {
                    View childAt4 = z0Var.getChildAt(0);
                    min = AndroidUtilities.lerp(min, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f), ft0Var.K1);
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
                if (z0Var != null && z0Var.getSelectedColorIndex() != 0) {
                    dp = AndroidUtilities.lerp(f12 - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(2.0f) + f12, ft0Var.K1);
                }
                e2.x1(f10, f11, dp, paint.getColor(), canvas2);
                if (z0Var != null && z0Var.getSelectedColorIndex() == 0) {
                    paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * ft0Var.K1));
                    canvas2.drawCircle(f10, f11, yh.c(1.0f, ft0Var.K1, paint3.getStrokeWidth() + AndroidUtilities.dp(3.0f), f12), paint3);
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        y0 y0Var = this.f4349c.f4458a1;
        if (y0Var != null) {
            y0Var.invalidate();
        }
    }
}
