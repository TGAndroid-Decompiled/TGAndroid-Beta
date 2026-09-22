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
public final class m6 extends FrameLayout {
    public float f5042a;
    public float f5043b;
    public final pg.u0 f5044c;
    public final qb d;

    public m6(qb qbVar, Context context, pg.u0 u0Var) {
        super(context);
        this.d = qbVar;
        this.f5044c = u0Var;
        new Path();
        setWillNotDraw(false);
        Paint paint = qbVar.f5452x1;
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
        qb qbVar = this.d;
        pg.t1 t1Var = qbVar.A1;
        Paint paint = qbVar.f5454y1;
        Paint paint2 = qbVar.f5452x1;
        Paint paint3 = qbVar.f5456z1;
        barView = qbVar.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        int left = barView.getLeft();
        r5 r5Var = qbVar.f5450w1;
        rectF.set(AndroidUtilities.lerp(left, r5Var.getLeft(), qbVar.D1), AndroidUtilities.lerp(barView.getTop(), r5Var.getTop(), qbVar.D1), AndroidUtilities.lerp(barView.getRight(), r5Var.getRight(), qbVar.D1), AndroidUtilities.lerp(barView.getBottom(), r5Var.getBottom(), qbVar.D1));
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), qbVar.D1);
        canvas2.drawRoundRect(rectF, lerp, lerp, qbVar.E1);
        if (barView.getChildCount() >= 1 && qbVar.D1 != 1.0f) {
            canvas2.save();
            canvas2.translate(barView.getLeft(), barView.getTop());
            View childAt = barView.getChildAt(0);
            if (barView instanceof qg.p1) {
                childAt = ((qg.p1) barView).getColorClickableView();
            }
            if (childAt.getAlpha() != 0.0f) {
                canvas2.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
                paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - qbVar.D1) * 255.0f));
                int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
                int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
                float x10 = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
                float y3 = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
                int i10 = t1Var.f41314a;
                int i11 = qbVar.Z0;
                View view = childAt;
                if (i11 != -1) {
                    if (i11 == 0) {
                        viewGroup = qbVar.f5427k1;
                    } else if (i11 == 2) {
                        viewGroup = qbVar.l1;
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
                    x10 = AndroidUtilities.lerp(x10, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), qbVar.f5408a1);
                    y3 = AndroidUtilities.lerp(y3, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), qbVar.f5408a1);
                }
                if (r5Var != null && r5Var.getChildCount() > 0) {
                    View childAt3 = r5Var.getChildAt(0);
                    x10 = AndroidUtilities.lerp(x10, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (r5Var.getX() - barView.getLeft()), qbVar.D1);
                    y3 = AndroidUtilities.lerp(y3, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (r5Var.getY() - barView.getTop()), qbVar.D1);
                    i10 = i0.a.d(qbVar.D1, t1Var.f41314a, this.f5044c.b(0));
                }
                float f7 = x10;
                float f10 = y3;
                if (f7 != this.f5042a || f10 != this.f5043b) {
                    this.f5042a = f7;
                    this.f5043b = f10;
                    paint2.setShader(new SweepGradient(f7, f10, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
                }
                float min = (Math.min(width, height) / 2.0f) - AndroidUtilities.dp(0.5f);
                if (r5Var != null && r5Var.getChildCount() > 0) {
                    View childAt4 = r5Var.getChildAt(0);
                    min = AndroidUtilities.lerp(min, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f), qbVar.D1);
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
                if (r5Var != null && r5Var.getSelectedColorIndex() != 0) {
                    dp = AndroidUtilities.lerp(f11 - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(2.0f) + f11, qbVar.D1);
                }
                qg.j1.y1(f7, f10, dp, paint.getColor(), canvas2);
                if (r5Var != null && r5Var.getSelectedColorIndex() == 0) {
                    paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * qbVar.D1));
                    canvas2.drawCircle(f7, f10, com.google.android.gms.internal.vision.e2.b(1.0f, qbVar.D1, paint3.getStrokeWidth() + AndroidUtilities.dp(3.0f), f11), paint3);
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        q5 q5Var = this.d.U0;
        if (q5Var != null) {
            q5Var.invalidate();
        }
    }
}
