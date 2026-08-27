package lh;

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

    public float f15682a;

    public float f15683b;

    public final yf.r0 f15684c;
    public final va d;

    public b6(va vaVar, Context context, yf.r0 r0Var) {
        super(context);
        this.d = vaVar;
        this.f15684c = r0Var;
        new Path();
        setWillNotDraw(false);
        Paint paint = vaVar.f15994t1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ViewGroup viewGroup;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        va vaVar = this.d;
        yf.p1 p1Var = vaVar.f16000w1;
        Paint paint = vaVar.f15996u1;
        Paint paint2 = vaVar.f15994t1;
        Paint paint3 = vaVar.f15998v1;
        ViewGroup barView = vaVar.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        int left = barView.getLeft();
        g5 g5Var = vaVar.f15992s1;
        rectF.set(AndroidUtilities.lerp(left, g5Var.getLeft(), vaVar.f16006z1), AndroidUtilities.lerp(barView.getTop(), g5Var.getTop(), vaVar.f16006z1), AndroidUtilities.lerp(barView.getRight(), g5Var.getRight(), vaVar.f16006z1), AndroidUtilities.lerp(barView.getBottom(), g5Var.getBottom(), vaVar.f16006z1));
        float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), vaVar.f16006z1);
        canvas2.drawRoundRect(rectF, fLerp, fLerp, vaVar.A1);
        if (barView.getChildCount() < 1 || vaVar.f16006z1 == 1.0f) {
            return;
        }
        canvas2.save();
        canvas2.translate(barView.getLeft(), barView.getTop());
        View childAt = barView.getChildAt(0);
        if (barView instanceof zf.o1) {
            childAt = ((zf.o1) barView).getColorClickableView();
        }
        if (childAt.getAlpha() != 0.0f) {
            canvas2.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
            paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - vaVar.f16006z1) * 255.0f));
            int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
            int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
            float x8 = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
            float y10 = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
            int iD = p1Var.f50034a;
            int i10 = vaVar.V0;
            View view = childAt;
            if (i10 != -1) {
                if (i10 == 0) {
                    viewGroup = vaVar.f15969g1;
                } else {
                    viewGroup = i10 == 2 ? vaVar.f15971h1 : null;
                }
                View childAt2 = (viewGroup == null ? barView : viewGroup).getChildAt(0);
                if (viewGroup instanceof zf.o1) {
                    childAt2 = ((zf.o1) viewGroup).getColorClickableView();
                }
                x8 = AndroidUtilities.lerp(x8, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), vaVar.W0);
                y10 = AndroidUtilities.lerp(y10, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), vaVar.W0);
            }
            if (g5Var != null && g5Var.getChildCount() > 0) {
                View childAt3 = g5Var.getChildAt(0);
                x8 = AndroidUtilities.lerp(x8, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (g5Var.getX() - barView.getLeft()), vaVar.f16006z1);
                y10 = AndroidUtilities.lerp(y10, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (g5Var.getY() - barView.getTop()), vaVar.f16006z1);
                iD = i0.b.d(vaVar.f16006z1, p1Var.f50034a, this.f15684c.b(0));
            }
            float f10 = x8;
            float f11 = y10;
            if (f10 != this.f15682a || f11 != this.f15683b) {
                this.f15682a = f10;
                this.f15683b = f11;
                paint2.setShader(new SweepGradient(f10, f11, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
            }
            float fMin = (Math.min(width, height) / 2.0f) - AndroidUtilities.dp(0.5f);
            if (g5Var != null && g5Var.getChildCount() > 0) {
                View childAt4 = g5Var.getChildAt(0);
                fMin = AndroidUtilities.lerp(fMin, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f), vaVar.f16006z1);
            }
            float f12 = fMin;
            rectF.set(f10 - f12, f11 - f12, f10 + f12, f11 + f12);
            canvas2 = canvas;
            canvas2.drawArc(rectF, 0.0f, 360.0f, false, paint2);
            paint.setColor(iD);
            paint.setAlpha((int) (view.getAlpha() * paint.getAlpha()));
            paint3.setColor(iD);
            paint3.setAlpha((int) (view.getAlpha() * 255.0f));
            float fDp = f12 - AndroidUtilities.dp(3.0f);
            if (g5Var != null && g5Var.getSelectedColorIndex() != 0) {
                fDp = AndroidUtilities.lerp(f12 - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(2.0f) + f12, vaVar.f16006z1);
            }
            zf.i1.x1(f10, f11, fDp, paint.getColor(), canvas2);
            if (g5Var != null && g5Var.getSelectedColorIndex() == 0) {
                paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * vaVar.f16006z1));
                canvas2.drawCircle(f10, f11, org.telegram.ui.Cells.pa.b(1.0f, vaVar.f16006z1, paint3.getStrokeWidth() + AndroidUtilities.dp(3.0f), f12), paint3);
            }
        }
        canvas2.restore();
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        f5 f5Var = this.d.Q0;
        if (f5Var != null) {
            f5Var.invalidate();
        }
    }
}
