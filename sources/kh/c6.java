package kh;

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
public final class c6 extends FrameLayout {
    public float f15037a;
    public float f15038b;
    public final xf.s0 f15039c;
    public final ya d;

    public c6(ya yaVar, Context context, xf.s0 s0Var) {
        super(context);
        this.d = yaVar;
        this.f15039c = s0Var;
        new Path();
        setWillNotDraw(false);
        Paint paint = yaVar.f15304t1;
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
        ya yaVar = this.d;
        xf.q1 q1Var = yaVar.f15310w1;
        Paint paint = yaVar.f15306u1;
        Paint paint2 = yaVar.f15304t1;
        Paint paint3 = yaVar.f15308v1;
        barView = yaVar.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        int left = barView.getLeft();
        h5 h5Var = yaVar.f15302s1;
        rectF.set(AndroidUtilities.lerp(left, h5Var.getLeft(), yaVar.f15316z1), AndroidUtilities.lerp(barView.getTop(), h5Var.getTop(), yaVar.f15316z1), AndroidUtilities.lerp(barView.getRight(), h5Var.getRight(), yaVar.f15316z1), AndroidUtilities.lerp(barView.getBottom(), h5Var.getBottom(), yaVar.f15316z1));
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), yaVar.f15316z1);
        canvas2.drawRoundRect(rectF, lerp, lerp, yaVar.A1);
        if (barView.getChildCount() >= 1 && yaVar.f15316z1 != 1.0f) {
            canvas2.save();
            canvas2.translate(barView.getLeft(), barView.getTop());
            View childAt = barView.getChildAt(0);
            if (barView instanceof yf.o1) {
                childAt = ((yf.o1) barView).getColorClickableView();
            }
            if (childAt.getAlpha() != 0.0f) {
                canvas2.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
                paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - yaVar.f15316z1) * 255.0f));
                int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
                int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
                float x10 = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
                float y10 = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
                int i9 = q1Var.f49333a;
                int i10 = yaVar.V0;
                View view = childAt;
                if (i10 != -1) {
                    if (i10 == 0) {
                        viewGroup = yaVar.f15279g1;
                    } else if (i10 == 2) {
                        viewGroup = yaVar.f15281h1;
                    } else {
                        viewGroup = null;
                    }
                    if (viewGroup == null) {
                        viewGroup2 = barView;
                    } else {
                        viewGroup2 = viewGroup;
                    }
                    View childAt2 = viewGroup2.getChildAt(0);
                    if (viewGroup instanceof yf.o1) {
                        childAt2 = ((yf.o1) viewGroup).getColorClickableView();
                    }
                    x10 = AndroidUtilities.lerp(x10, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), yaVar.W0);
                    y10 = AndroidUtilities.lerp(y10, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), yaVar.W0);
                }
                if (h5Var != null && h5Var.getChildCount() > 0) {
                    View childAt3 = h5Var.getChildAt(0);
                    x10 = AndroidUtilities.lerp(x10, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (h5Var.getX() - barView.getLeft()), yaVar.f15316z1);
                    y10 = AndroidUtilities.lerp(y10, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (h5Var.getY() - barView.getTop()), yaVar.f15316z1);
                    i9 = i0.a.d(yaVar.f15316z1, q1Var.f49333a, this.f15039c.b(0));
                }
                float f10 = x10;
                float f11 = y10;
                if (f10 != this.f15037a || f11 != this.f15038b) {
                    this.f15037a = f10;
                    this.f15038b = f11;
                    paint2.setShader(new SweepGradient(f10, f11, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
                }
                float min = (Math.min(width, height) / 2.0f) - AndroidUtilities.dp(0.5f);
                if (h5Var != null && h5Var.getChildCount() > 0) {
                    View childAt4 = h5Var.getChildAt(0);
                    min = AndroidUtilities.lerp(min, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f), yaVar.f15316z1);
                }
                float f12 = min;
                rectF.set(f10 - f12, f11 - f12, f10 + f12, f11 + f12);
                canvas2 = canvas;
                canvas2.drawArc(rectF, 0.0f, 360.0f, false, paint2);
                paint.setColor(i9);
                paint.setAlpha((int) (view.getAlpha() * paint.getAlpha()));
                paint3.setColor(i9);
                paint3.setAlpha((int) (view.getAlpha() * 255.0f));
                float dp = f12 - AndroidUtilities.dp(3.0f);
                if (h5Var != null && h5Var.getSelectedColorIndex() != 0) {
                    dp = AndroidUtilities.lerp(f12 - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(2.0f) + f12, yaVar.f15316z1);
                }
                yf.i1.x1(f10, f11, dp, paint.getColor(), canvas2);
                if (h5Var != null && h5Var.getSelectedColorIndex() == 0) {
                    paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * yaVar.f15316z1));
                    canvas2.drawCircle(f10, f11, j3.r0.C(1.0f, yaVar.f15316z1, paint3.getStrokeWidth() + AndroidUtilities.dp(3.0f), f12), paint3);
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        g5 g5Var = this.d.Q0;
        if (g5Var != null) {
            g5Var.invalidate();
        }
    }
}
