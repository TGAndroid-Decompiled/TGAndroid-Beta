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
public final class i5 extends FrameLayout {
    public float f14420a;
    public float f14421b;
    public final sg.k0 f14422c;
    public final u9 d;

    public i5(u9 u9Var, Context context, sg.k0 k0Var) {
        super(context);
        this.d = u9Var;
        this.f14422c = k0Var;
        new Path();
        setWillNotDraw(false);
        Paint paint = u9Var.f14670h1;
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
        u9 u9Var = this.d;
        sg.h1 h1Var = u9Var.f14676k1;
        Paint paint = u9Var.f14672i1;
        Paint paint2 = u9Var.f14670h1;
        Paint paint3 = u9Var.f14674j1;
        barView = u9Var.getBarView();
        RectF rectF = org.telegram.messenger.g0.P;
        int left = barView.getLeft();
        u4 u4Var = u9Var.f14668g1;
        rectF.set(org.telegram.messenger.g0.W1(u9Var.n1, left, u4Var.getLeft()), org.telegram.messenger.g0.W1(u9Var.n1, barView.getTop(), u4Var.getTop()), org.telegram.messenger.g0.W1(u9Var.n1, barView.getRight(), u4Var.getRight()), org.telegram.messenger.g0.W1(u9Var.n1, barView.getBottom(), u4Var.getBottom()));
        float W1 = org.telegram.messenger.g0.W1(u9Var.n1, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(24.0f));
        canvas2.drawRoundRect(rectF, W1, W1, u9Var.f14681o1);
        if (barView.getChildCount() >= 1 && u9Var.n1 != 1.0f) {
            canvas2.save();
            canvas2.translate(barView.getLeft(), barView.getTop());
            View childAt = barView.getChildAt(0);
            if (barView instanceof tg.e1) {
                childAt = ((tg.e1) barView).getColorClickableView();
            }
            if (childAt.getAlpha() != 0.0f) {
                canvas2.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
                paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - u9Var.n1) * 255.0f));
                int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
                int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
                float x10 = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
                float y10 = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
                int i7 = h1Var.f56644a;
                int i10 = u9Var.J0;
                View view = childAt;
                if (i10 != -1) {
                    if (i10 == 0) {
                        viewGroup = u9Var.U0;
                    } else if (i10 == 2) {
                        viewGroup = u9Var.V0;
                    } else {
                        viewGroup = null;
                    }
                    if (viewGroup == null) {
                        viewGroup2 = barView;
                    } else {
                        viewGroup2 = viewGroup;
                    }
                    View childAt2 = viewGroup2.getChildAt(0);
                    if (viewGroup instanceof tg.e1) {
                        childAt2 = ((tg.e1) viewGroup).getColorClickableView();
                    }
                    x10 = org.telegram.messenger.g0.T1(x10, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), u9Var.K0);
                    y10 = org.telegram.messenger.g0.T1(y10, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), u9Var.K0);
                }
                if (u4Var != null && u4Var.getChildCount() > 0) {
                    View childAt3 = u4Var.getChildAt(0);
                    x10 = org.telegram.messenger.g0.T1(x10, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (u4Var.getX() - barView.getLeft()), u9Var.n1);
                    y10 = org.telegram.messenger.g0.T1(y10, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (u4Var.getY() - barView.getTop()), u9Var.n1);
                    i7 = i0.a.f(u9Var.n1, h1Var.f56644a, this.f14422c.b(0));
                }
                float f10 = x10;
                float f11 = y10;
                if (f10 != this.f14420a || f11 != this.f14421b) {
                    this.f14420a = f10;
                    this.f14421b = f11;
                    paint2.setShader(new SweepGradient(f10, f11, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
                }
                float min = (Math.min(width, height) / 2.0f) - org.telegram.messenger.g0.L(0.5f);
                if (u4Var != null && u4Var.getChildCount() > 0) {
                    View childAt4 = u4Var.getChildAt(0);
                    min = org.telegram.messenger.g0.T1(min, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - org.telegram.messenger.g0.L(2.0f), u9Var.n1);
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
                if (u4Var != null && u4Var.getSelectedColorIndex() != 0) {
                    L = org.telegram.messenger.g0.T1(f12 - org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(2.0f) + f12, u9Var.n1);
                }
                tg.y0.A1(f10, f11, L, paint.getColor(), canvas2);
                if (u4Var != null && u4Var.getSelectedColorIndex() == 0) {
                    paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * u9Var.n1));
                    canvas2.drawCircle(f10, f11, com.google.android.gms.internal.vision.e2.t(1.0f, u9Var.n1, paint3.getStrokeWidth() + org.telegram.messenger.g0.L(3.0f), f12), paint3);
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
