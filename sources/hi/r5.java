package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class r5 extends FrameLayout {
    public float f15293a;
    public float f15294b;
    public final sg.j0 f15295c;
    public final pa d;

    public r5(pa paVar, Context context, sg.j0 j0Var) {
        super(context);
        this.d = paVar;
        this.f15295c = j0Var;
        new Path();
        setWillNotDraw(false);
        Paint paint = paVar.f15566h1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ViewGroup barView;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        pa paVar = this.d;
        sg.g1 g1Var = paVar.f15573k1;
        Paint paint = paVar.f15568i1;
        Paint paint2 = paVar.f15566h1;
        Paint paint3 = paVar.f15570j1;
        barView = paVar.getBarView();
        RectF rectF = org.telegram.messenger.g0.P;
        int left = barView.getLeft();
        d5 d5Var = paVar.f15564g1;
        rectF.set(org.telegram.messenger.g0.W1(paVar.n1, left, d5Var.getLeft()), org.telegram.messenger.g0.W1(paVar.n1, barView.getTop(), d5Var.getTop()), org.telegram.messenger.g0.W1(paVar.n1, barView.getRight(), d5Var.getRight()), org.telegram.messenger.g0.W1(paVar.n1, barView.getBottom(), d5Var.getBottom()));
        float W1 = org.telegram.messenger.g0.W1(paVar.n1, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(24.0f));
        canvas2.drawRoundRect(rectF, W1, W1, paVar.f15581o1);
        if (barView.getChildCount() >= 1 && paVar.n1 != 1.0f) {
            canvas2.save();
            canvas2.translate(barView.getLeft(), barView.getTop());
            View childAt = barView.getChildAt(0);
            if (barView instanceof tg.j1) {
                childAt = ((tg.j1) barView).getColorClickableView();
            }
            if (childAt.getAlpha() != 0.0f) {
                canvas2.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
                paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - paVar.n1) * 255.0f));
                int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
                int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
                float x10 = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
                float y10 = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
                int i7 = g1Var.f57335a;
                int i10 = paVar.J0;
                View view = childAt;
                if (i10 != -1) {
                    if (i10 == 0) {
                        viewGroup = paVar.U0;
                    } else if (i10 == 2) {
                        viewGroup = paVar.V0;
                    } else {
                        viewGroup = null;
                    }
                    if (viewGroup == null) {
                        viewGroup2 = barView;
                    } else {
                        viewGroup2 = viewGroup;
                    }
                    View childAt2 = viewGroup2.getChildAt(0);
                    if (viewGroup instanceof tg.j1) {
                        childAt2 = ((tg.j1) viewGroup).getColorClickableView();
                    }
                    x10 = org.telegram.messenger.g0.T1(x10, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), paVar.K0);
                    y10 = org.telegram.messenger.g0.T1(y10, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), paVar.K0);
                }
                if (d5Var != null && d5Var.getChildCount() > 0) {
                    View childAt3 = d5Var.getChildAt(0);
                    x10 = org.telegram.messenger.g0.T1(x10, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (d5Var.getX() - barView.getLeft()), paVar.n1);
                    y10 = org.telegram.messenger.g0.T1(y10, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (d5Var.getY() - barView.getTop()), paVar.n1);
                    i7 = i0.a.f(paVar.n1, g1Var.f57335a, this.f15295c.b(0));
                }
                float f10 = x10;
                float f11 = y10;
                if (f10 != this.f15293a || f11 != this.f15294b) {
                    this.f15293a = f10;
                    this.f15294b = f11;
                    paint2.setShader(new SweepGradient(f10, f11, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
                }
                float min = (Math.min(width, height) / 2.0f) - org.telegram.messenger.g0.L(0.5f);
                if (d5Var != null && d5Var.getChildCount() > 0) {
                    View childAt4 = d5Var.getChildAt(0);
                    min = org.telegram.messenger.g0.T1(min, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - org.telegram.messenger.g0.L(2.0f), paVar.n1);
                }
                float f12 = min;
                rectF.set(f10 - f12, f11 - f12, f10 + f12, f11 + f12);
                canvas2 = canvas;
                canvas2.drawArc(rectF, 0.0f, 360.0f, false, paint2);
                paint.setColor(i7);
                paint.setAlpha((int) (view.getAlpha() * paint.getAlpha()));
                paint3.setColor(i7);
                paint3.setAlpha((int) (view.getAlpha() * 255.0f));
                float L = f12 - org.telegram.messenger.g0.L(3.0f);
                if (d5Var != null && d5Var.getSelectedColorIndex() != 0) {
                    L = org.telegram.messenger.g0.T1(f12 - org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(2.0f) + f12, paVar.n1);
                }
                tg.d1.A1(f10, f11, L, paint.getColor(), canvas2);
                if (d5Var != null && d5Var.getSelectedColorIndex() == 0) {
                    paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * paVar.n1));
                    canvas2.drawCircle(f10, f11, com.google.android.gms.internal.vision.e2.t(1.0f, paVar.n1, paint3.getStrokeWidth() + org.telegram.messenger.g0.L(3.0f), f12), paint3);
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        c5 c5Var = this.d.E0;
        if (c5Var != null) {
            c5Var.invalidate();
        }
    }
}
