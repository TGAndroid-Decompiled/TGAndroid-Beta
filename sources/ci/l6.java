package ci;

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
public final class l6 extends FrameLayout {
    public float f4960a;
    public float f4961b;
    public final pg.u0 f4962c;
    public final nb d;

    public l6(nb nbVar, Context context, pg.u0 u0Var) {
        super(context);
        this.d = nbVar;
        this.f4962c = u0Var;
        new Path();
        setWillNotDraw(false);
        Paint paint = nbVar.f5375x1;
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
        nb nbVar = this.d;
        pg.t1 t1Var = nbVar.A1;
        Paint paint = nbVar.f5377y1;
        Paint paint2 = nbVar.f5375x1;
        Paint paint3 = nbVar.f5379z1;
        barView = nbVar.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        int left = barView.getLeft();
        q5 q5Var = nbVar.f5373w1;
        rectF.set(AndroidUtilities.lerp(left, q5Var.getLeft(), nbVar.D1), AndroidUtilities.lerp(barView.getTop(), q5Var.getTop(), nbVar.D1), AndroidUtilities.lerp(barView.getRight(), q5Var.getRight(), nbVar.D1), AndroidUtilities.lerp(barView.getBottom(), q5Var.getBottom(), nbVar.D1));
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), nbVar.D1);
        canvas2.drawRoundRect(rectF, lerp, lerp, nbVar.E1);
        if (barView.getChildCount() >= 1 && nbVar.D1 != 1.0f) {
            canvas2.save();
            canvas2.translate(barView.getLeft(), barView.getTop());
            View childAt = barView.getChildAt(0);
            if (barView instanceof qg.p1) {
                childAt = ((qg.p1) barView).getColorClickableView();
            }
            if (childAt.getAlpha() != 0.0f) {
                canvas2.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
                paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - nbVar.D1) * 255.0f));
                int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
                int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
                float x10 = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
                float y3 = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
                int i10 = t1Var.f41266a;
                int i11 = nbVar.Z0;
                View view = childAt;
                if (i11 != -1) {
                    if (i11 == 0) {
                        viewGroup = nbVar.f5350k1;
                    } else if (i11 == 2) {
                        viewGroup = nbVar.l1;
                    } else {
                        viewGroup = null;
                    }
                    if (viewGroup == null) {
                        viewGroup2 = barView;
                    } else {
                        viewGroup2 = viewGroup;
                    }
                    View childAt2 = viewGroup2.getChildAt(0);
                    if (viewGroup instanceof qg.p1) {
                        childAt2 = ((qg.p1) viewGroup).getColorClickableView();
                    }
                    x10 = AndroidUtilities.lerp(x10, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), nbVar.f5331a1);
                    y3 = AndroidUtilities.lerp(y3, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), nbVar.f5331a1);
                }
                if (q5Var != null && q5Var.getChildCount() > 0) {
                    View childAt3 = q5Var.getChildAt(0);
                    x10 = AndroidUtilities.lerp(x10, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (q5Var.getX() - barView.getLeft()), nbVar.D1);
                    y3 = AndroidUtilities.lerp(y3, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (q5Var.getY() - barView.getTop()), nbVar.D1);
                    i10 = i0.a.d(nbVar.D1, t1Var.f41266a, this.f4962c.b(0));
                }
                float f7 = x10;
                float f10 = y3;
                if (f7 != this.f4960a || f10 != this.f4961b) {
                    this.f4960a = f7;
                    this.f4961b = f10;
                    paint2.setShader(new SweepGradient(f7, f10, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
                }
                float min = (Math.min(width, height) / 2.0f) - AndroidUtilities.dp(0.5f);
                if (q5Var != null && q5Var.getChildCount() > 0) {
                    View childAt4 = q5Var.getChildAt(0);
                    min = AndroidUtilities.lerp(min, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f), nbVar.D1);
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
                if (q5Var != null && q5Var.getSelectedColorIndex() != 0) {
                    dp = AndroidUtilities.lerp(f11 - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(2.0f) + f11, nbVar.D1);
                }
                qg.j1.x1(f7, f10, dp, paint.getColor(), canvas2);
                if (q5Var != null && q5Var.getSelectedColorIndex() == 0) {
                    paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * nbVar.D1));
                    canvas2.drawCircle(f7, f10, com.google.android.gms.internal.vision.e2.b(1.0f, nbVar.D1, paint3.getStrokeWidth() + AndroidUtilities.dp(3.0f), f11), paint3);
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        p5 p5Var = this.d.U0;
        if (p5Var != null) {
            p5Var.invalidate();
        }
    }
}
