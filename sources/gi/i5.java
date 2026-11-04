package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class i5 extends FrameLayout {
    public float f12969a;
    public float f12970b;
    public final tg.k0 f12971c;
    public final x9 d;

    public i5(x9 x9Var, Context context, tg.k0 k0Var) {
        super(context);
        this.d = x9Var;
        this.f12971c = k0Var;
        new Path();
        setWillNotDraw(false);
        Paint paint = x9Var.f13209h1;
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
        x9 x9Var = this.d;
        tg.h1 h1Var = x9Var.k1;
        Paint paint = x9Var.f13211i1;
        Paint paint2 = x9Var.f13209h1;
        Paint paint3 = x9Var.f13213j1;
        barView = x9Var.getBarView();
        RectF rectF = org.telegram.messenger.g0.P;
        int left = barView.getLeft();
        u4 u4Var = x9Var.f13207g1;
        rectF.set(org.telegram.messenger.g0.W1(x9Var.f13218n1, left, u4Var.getLeft()), org.telegram.messenger.g0.W1(x9Var.f13218n1, barView.getTop(), u4Var.getTop()), org.telegram.messenger.g0.W1(x9Var.f13218n1, barView.getRight(), u4Var.getRight()), org.telegram.messenger.g0.W1(x9Var.f13218n1, barView.getBottom(), u4Var.getBottom()));
        float W1 = org.telegram.messenger.g0.W1(x9Var.f13218n1, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(24.0f));
        canvas2.drawRoundRect(rectF, W1, W1, x9Var.f13220o1);
        if (barView.getChildCount() >= 1 && x9Var.f13218n1 != 1.0f) {
            canvas2.save();
            canvas2.translate(barView.getLeft(), barView.getTop());
            View childAt = barView.getChildAt(0);
            if (barView instanceof ug.d1) {
                childAt = ((ug.d1) barView).getColorClickableView();
            }
            if (childAt.getAlpha() != 0.0f) {
                canvas2.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
                paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - x9Var.f13218n1) * 255.0f));
                int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
                int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
                float x10 = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
                float y9 = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
                int i3 = h1Var.f55186a;
                int i10 = x9Var.J0;
                View view = childAt;
                if (i10 != -1) {
                    if (i10 == 0) {
                        viewGroup = x9Var.U0;
                    } else if (i10 == 2) {
                        viewGroup = x9Var.V0;
                    } else {
                        viewGroup = null;
                    }
                    if (viewGroup == null) {
                        viewGroup2 = barView;
                    } else {
                        viewGroup2 = viewGroup;
                    }
                    View childAt2 = viewGroup2.getChildAt(0);
                    if (viewGroup instanceof ug.d1) {
                        childAt2 = ((ug.d1) viewGroup).getColorClickableView();
                    }
                    x10 = org.telegram.messenger.g0.T1(x10, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), x9Var.K0);
                    y9 = org.telegram.messenger.g0.T1(y9, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), x9Var.K0);
                }
                if (u4Var != null && u4Var.getChildCount() > 0) {
                    View childAt3 = u4Var.getChildAt(0);
                    x10 = org.telegram.messenger.g0.T1(x10, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (u4Var.getX() - barView.getLeft()), x9Var.f13218n1);
                    y9 = org.telegram.messenger.g0.T1(y9, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (u4Var.getY() - barView.getTop()), x9Var.f13218n1);
                    i3 = i0.a.f(x9Var.f13218n1, h1Var.f55186a, this.f12971c.b(0));
                }
                float f10 = x10;
                float f11 = y9;
                if (f10 != this.f12969a || f11 != this.f12970b) {
                    this.f12969a = f10;
                    this.f12970b = f11;
                    paint2.setShader(new SweepGradient(f10, f11, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
                }
                float min = (Math.min(width, height) / 2.0f) - org.telegram.messenger.g0.L(0.5f);
                if (u4Var != null && u4Var.getChildCount() > 0) {
                    View childAt4 = u4Var.getChildAt(0);
                    min = org.telegram.messenger.g0.T1(min, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - org.telegram.messenger.g0.L(2.0f), x9Var.f13218n1);
                }
                float f12 = min;
                rectF.set(f10 - f12, f11 - f12, f10 + f12, f11 + f12);
                canvas2 = canvas;
                canvas2.drawArc(rectF, 0.0f, 360.0f, false, paint2);
                paint.setColor(i3);
                paint.setAlpha((int) (view.getAlpha() * paint.getAlpha()));
                paint3.setColor(i3);
                paint3.setAlpha((int) (view.getAlpha() * 255.0f));
                float L = f12 - org.telegram.messenger.g0.L(3.0f);
                if (u4Var != null && u4Var.getSelectedColorIndex() != 0) {
                    L = org.telegram.messenger.g0.T1(f12 - org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(2.0f) + f12, x9Var.f13218n1);
                }
                ug.x0.A1(f10, f11, L, paint.getColor(), canvas2);
                if (u4Var != null && u4Var.getSelectedColorIndex() == 0) {
                    paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * x9Var.f13218n1));
                    canvas2.drawCircle(f10, f11, a1.g.D(1.0f, x9Var.f13218n1, paint3.getStrokeWidth() + org.telegram.messenger.g0.L(3.0f), f12), paint3);
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        t4 t4Var = this.d.E0;
        if (t4Var != null) {
            t4Var.invalidate();
        }
    }
}
