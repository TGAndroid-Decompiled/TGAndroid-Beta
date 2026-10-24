package ei;

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
public final class b6 extends FrameLayout {
    public float f8796a;
    public float f8797b;
    public final qg.u0 f8798c;
    public final xa d;

    public b6(xa xaVar, Context context, qg.u0 u0Var) {
        super(context);
        this.d = xaVar;
        this.f8798c = u0Var;
        new Path();
        setWillNotDraw(false);
        Paint paint = xaVar.f9054x1;
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
        xa xaVar = this.d;
        qg.s1 s1Var = xaVar.A1;
        Paint paint = xaVar.f9056y1;
        Paint paint2 = xaVar.f9054x1;
        Paint paint3 = xaVar.f9058z1;
        barView = xaVar.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        int left = barView.getLeft();
        g5 g5Var = xaVar.f9052w1;
        rectF.set(AndroidUtilities.lerp(left, g5Var.getLeft(), xaVar.D1), AndroidUtilities.lerp(barView.getTop(), g5Var.getTop(), xaVar.D1), AndroidUtilities.lerp(barView.getRight(), g5Var.getRight(), xaVar.D1), AndroidUtilities.lerp(barView.getBottom(), g5Var.getBottom(), xaVar.D1));
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), xaVar.D1);
        canvas2.drawRoundRect(rectF, lerp, lerp, xaVar.E1);
        if (barView.getChildCount() >= 1 && xaVar.D1 != 1.0f) {
            canvas2.save();
            canvas2.translate(barView.getLeft(), barView.getTop());
            View childAt = barView.getChildAt(0);
            if (barView instanceof rg.p1) {
                childAt = ((rg.p1) barView).getColorClickableView();
            }
            if (childAt.getAlpha() != 0.0f) {
                canvas2.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
                paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - xaVar.D1) * 255.0f));
                int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
                int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
                float x10 = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
                float y3 = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
                int i10 = s1Var.f45065a;
                int i11 = xaVar.Z0;
                View view = childAt;
                if (i11 != -1) {
                    if (i11 == 0) {
                        viewGroup = xaVar.f9029k1;
                    } else if (i11 == 2) {
                        viewGroup = xaVar.l1;
                    } else {
                        viewGroup = null;
                    }
                    if (viewGroup == null) {
                        viewGroup2 = barView;
                    } else {
                        viewGroup2 = viewGroup;
                    }
                    View childAt2 = viewGroup2.getChildAt(0);
                    if (viewGroup instanceof rg.p1) {
                        childAt2 = ((rg.p1) viewGroup).getColorClickableView();
                    }
                    x10 = AndroidUtilities.lerp(x10, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), xaVar.f9010a1);
                    y3 = AndroidUtilities.lerp(y3, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), xaVar.f9010a1);
                }
                if (g5Var != null && g5Var.getChildCount() > 0) {
                    View childAt3 = g5Var.getChildAt(0);
                    x10 = AndroidUtilities.lerp(x10, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (g5Var.getX() - barView.getLeft()), xaVar.D1);
                    y3 = AndroidUtilities.lerp(y3, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (g5Var.getY() - barView.getTop()), xaVar.D1);
                    i10 = i0.a.f(xaVar.D1, s1Var.f45065a, this.f8798c.b(0));
                }
                float f7 = x10;
                float f10 = y3;
                if (f7 != this.f8796a || f10 != this.f8797b) {
                    this.f8796a = f7;
                    this.f8797b = f10;
                    paint2.setShader(new SweepGradient(f7, f10, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
                }
                float min = (Math.min(width, height) / 2.0f) - AndroidUtilities.dp(0.5f);
                if (g5Var != null && g5Var.getChildCount() > 0) {
                    View childAt4 = g5Var.getChildAt(0);
                    min = AndroidUtilities.lerp(min, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f), xaVar.D1);
                }
                float f11 = min;
                rectF.set(f7 - f11, f10 - f11, f7 + f11, f10 + f11);
                canvas2 = canvas;
                canvas2.drawArc(rectF, 0.0f, 360.0f, false, paint2);
                paint.setColor(i10);
                paint.setAlpha((int) (view.getAlpha() * paint.getAlpha()));
                paint3.setColor(i10);
                paint3.setAlpha((int) (view.getAlpha() * 255.0f));
                float dp = f11 - AndroidUtilities.dp(3.0f);
                if (g5Var != null && g5Var.getSelectedColorIndex() != 0) {
                    dp = AndroidUtilities.lerp(f11 - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(2.0f) + f11, xaVar.D1);
                }
                rg.j1.D1(f7, f10, dp, paint.getColor(), canvas2);
                if (g5Var != null && g5Var.getSelectedColorIndex() == 0) {
                    paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * xaVar.D1));
                    canvas2.drawCircle(f7, f10, com.google.android.gms.internal.play_billing.k3.D(1.0f, xaVar.D1, paint3.getStrokeWidth() + AndroidUtilities.dp(3.0f), f11), paint3);
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        f5 f5Var = this.d.U0;
        if (f5Var != null) {
            f5Var.invalidate();
        }
    }
}
