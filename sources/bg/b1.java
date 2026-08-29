package bg;

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
import org.telegram.ui.th;
import org.telegram.ui.ws0;
public final class b1 extends FrameLayout {
    public float f2105a;
    public float f2106b;
    public final ws0 f2107c;

    public b1(ws0 ws0Var, Context context) {
        super(context);
        this.f2107c = ws0Var;
        new Path();
        setWillNotDraw(false);
        Paint paint = ws0Var.D1;
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
        ws0 ws0Var = this.f2107c;
        ag.k2 k2Var = ws0Var.G1;
        Paint paint = ws0Var.E1;
        Paint paint2 = ws0Var.D1;
        Paint paint3 = ws0Var.F1;
        barView = ws0Var.getBarView();
        Rect rect = AndroidUtilities.rectTmp2;
        int left = barView.getLeft();
        a1 a1Var = ws0Var.C1;
        rect.set(AndroidUtilities.lerp(left, a1Var.getLeft(), ws0Var.J1), AndroidUtilities.lerp(barView.getTop(), a1Var.getTop(), ws0Var.J1), AndroidUtilities.lerp(barView.getRight(), a1Var.getRight(), ws0Var.J1), AndroidUtilities.lerp(barView.getBottom(), a1Var.getBottom(), ws0Var.J1));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), ws0Var.J1);
        if (ws0Var.Y1 != null) {
            rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            ws0Var.Y1.p(lerp);
            ws0Var.Y1.setBounds(rect);
            ws0Var.Y1.draw(canvas2);
        } else {
            canvas2.drawRoundRect(rectF, lerp, lerp, ws0Var.K1);
        }
        if (barView.getChildCount() >= 1 && ws0Var.J1 != 1.0f) {
            canvas2.save();
            canvas2.translate(barView.getLeft(), barView.getTop());
            View childAt = barView.getChildAt(0);
            if (barView instanceof n2) {
                childAt = ((n2) barView).getColorClickableView();
            }
            if (childAt.getAlpha() != 0.0f) {
                canvas2.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
                paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - ws0Var.J1) * 255.0f));
                int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
                int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
                float x4 = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
                float y8 = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
                int i10 = k2Var.f571a;
                int i11 = ws0Var.f2229d1;
                View view = childAt;
                if (i11 != -1) {
                    if (i11 == 0) {
                        viewGroup = ws0Var.f2247p1;
                    } else if (i11 == 2) {
                        viewGroup = ws0Var.f2248q1;
                    } else {
                        viewGroup = null;
                    }
                    if (viewGroup == null) {
                        viewGroup2 = barView;
                    } else {
                        viewGroup2 = viewGroup;
                    }
                    View childAt2 = viewGroup2.getChildAt(0);
                    if (viewGroup instanceof n2) {
                        childAt2 = ((n2) viewGroup).getColorClickableView();
                    }
                    x4 = AndroidUtilities.lerp(x4, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), ws0Var.f2231e1);
                    y8 = AndroidUtilities.lerp(y8, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), ws0Var.f2231e1);
                }
                if (a1Var != null && a1Var.getChildCount() > 0) {
                    View childAt3 = a1Var.getChildAt(0);
                    x4 = AndroidUtilities.lerp(x4, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (a1Var.getX() - barView.getLeft()), ws0Var.J1);
                    y8 = AndroidUtilities.lerp(y8, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (a1Var.getY() - barView.getTop()), ws0Var.J1);
                    i10 = i0.a.d(ws0Var.J1, k2Var.f571a, ws0Var.R1.b(0));
                }
                float f9 = x4;
                float f10 = y8;
                if (f9 != this.f2105a || f10 != this.f2106b) {
                    this.f2105a = f9;
                    this.f2106b = f10;
                    paint2.setShader(new SweepGradient(f9, f10, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
                }
                float min = (Math.min(width, height) / 2.0f) - AndroidUtilities.dp(0.5f);
                if (a1Var != null && a1Var.getChildCount() > 0) {
                    View childAt4 = a1Var.getChildAt(0);
                    min = AndroidUtilities.lerp(min, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f), ws0Var.J1);
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
                if (a1Var != null && a1Var.getSelectedColorIndex() != 0) {
                    dp = AndroidUtilities.lerp(f11 - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(2.0f) + f11, ws0Var.J1);
                }
                h2.x1(f9, f10, dp, paint.getColor(), canvas2);
                if (a1Var != null && a1Var.getSelectedColorIndex() == 0) {
                    paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * ws0Var.J1));
                    canvas2.drawCircle(f9, f10, th.b(1.0f, ws0Var.J1, paint3.getStrokeWidth() + AndroidUtilities.dp(3.0f), f11), paint3);
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void setTranslationY(float f9) {
        super.setTranslationY(f9);
        z0 z0Var = this.f2107c.Z0;
        if (z0Var != null) {
            z0Var.invalidate();
        }
    }
}
