package di;

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
    public float f7642a;
    public float f7643b;
    public final qg.s0 f7644c;
    public final rb d;

    public m6(rb rbVar, Context context, qg.s0 s0Var) {
        super(context);
        this.d = rbVar;
        this.f7644c = s0Var;
        new Path();
        setWillNotDraw(false);
        Paint paint = rbVar.f7997x1;
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
        rb rbVar = this.d;
        qg.q1 q1Var = rbVar.A1;
        Paint paint = rbVar.f7999y1;
        Paint paint2 = rbVar.f7997x1;
        Paint paint3 = rbVar.f8001z1;
        barView = rbVar.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        int left = barView.getLeft();
        r5 r5Var = rbVar.f7995w1;
        rectF.set(AndroidUtilities.lerp(left, r5Var.getLeft(), rbVar.D1), AndroidUtilities.lerp(barView.getTop(), r5Var.getTop(), rbVar.D1), AndroidUtilities.lerp(barView.getRight(), r5Var.getRight(), rbVar.D1), AndroidUtilities.lerp(barView.getBottom(), r5Var.getBottom(), rbVar.D1));
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), rbVar.D1);
        canvas2.drawRoundRect(rectF, lerp, lerp, rbVar.E1);
        if (barView.getChildCount() >= 1 && rbVar.D1 != 1.0f) {
            canvas2.save();
            canvas2.translate(barView.getLeft(), barView.getTop());
            View childAt = barView.getChildAt(0);
            if (barView instanceof rg.q1) {
                childAt = ((rg.q1) barView).getColorClickableView();
            }
            if (childAt.getAlpha() != 0.0f) {
                canvas2.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
                paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - rbVar.D1) * 255.0f));
                int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
                int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
                float x10 = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
                float y3 = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
                int i10 = q1Var.f44541a;
                int i11 = rbVar.Z0;
                View view = childAt;
                if (i11 != -1) {
                    if (i11 == 0) {
                        viewGroup = rbVar.f7972k1;
                    } else if (i11 == 2) {
                        viewGroup = rbVar.l1;
                    } else {
                        viewGroup = null;
                    }
                    if (viewGroup == null) {
                        viewGroup2 = barView;
                    } else {
                        viewGroup2 = viewGroup;
                    }
                    View childAt2 = viewGroup2.getChildAt(0);
                    if (viewGroup instanceof rg.q1) {
                        childAt2 = ((rg.q1) viewGroup).getColorClickableView();
                    }
                    x10 = AndroidUtilities.lerp(x10, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), rbVar.f7953a1);
                    y3 = AndroidUtilities.lerp(y3, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), rbVar.f7953a1);
                }
                if (r5Var != null && r5Var.getChildCount() > 0) {
                    View childAt3 = r5Var.getChildAt(0);
                    x10 = AndroidUtilities.lerp(x10, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (r5Var.getX() - barView.getLeft()), rbVar.D1);
                    y3 = AndroidUtilities.lerp(y3, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (r5Var.getY() - barView.getTop()), rbVar.D1);
                    i10 = i0.a.d(rbVar.D1, q1Var.f44541a, this.f7644c.b(0));
                }
                float f7 = x10;
                float f10 = y3;
                if (f7 != this.f7642a || f10 != this.f7643b) {
                    this.f7642a = f7;
                    this.f7643b = f10;
                    paint2.setShader(new SweepGradient(f7, f10, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
                }
                float min = (Math.min(width, height) / 2.0f) - AndroidUtilities.dp(0.5f);
                if (r5Var != null && r5Var.getChildCount() > 0) {
                    View childAt4 = r5Var.getChildAt(0);
                    min = AndroidUtilities.lerp(min, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f), rbVar.D1);
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
                    dp = AndroidUtilities.lerp(f11 - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(2.0f) + f11, rbVar.D1);
                }
                rg.k1.w1(f7, f10, dp, paint.getColor(), canvas2);
                if (r5Var != null && r5Var.getSelectedColorIndex() == 0) {
                    paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * rbVar.D1));
                    canvas2.drawCircle(f7, f10, com.google.android.gms.internal.vision.e2.b(1.0f, rbVar.D1, paint3.getStrokeWidth() + AndroidUtilities.dp(3.0f), f11), paint3);
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
