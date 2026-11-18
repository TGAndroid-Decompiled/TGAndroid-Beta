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
public final class h5 extends FrameLayout {
    public float f14726a;
    public float f14727b;
    public final sg.k0 f14728c;
    public final v9 d;

    public h5(v9 v9Var, Context context, sg.k0 k0Var) {
        super(context);
        this.d = v9Var;
        this.f14728c = k0Var;
        new Path();
        setWillNotDraw(false);
        Paint paint = v9Var.f14909h1;
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
        v9 v9Var = this.d;
        sg.h1 h1Var = v9Var.f14915k1;
        Paint paint = v9Var.f14911i1;
        Paint paint2 = v9Var.f14909h1;
        Paint paint3 = v9Var.f14913j1;
        barView = v9Var.getBarView();
        RectF rectF = org.telegram.messenger.g0.P;
        int left = barView.getLeft();
        s4 s4Var = v9Var.f14907g1;
        rectF.set(org.telegram.messenger.g0.W1(v9Var.n1, left, s4Var.getLeft()), org.telegram.messenger.g0.W1(v9Var.n1, barView.getTop(), s4Var.getTop()), org.telegram.messenger.g0.W1(v9Var.n1, barView.getRight(), s4Var.getRight()), org.telegram.messenger.g0.W1(v9Var.n1, barView.getBottom(), s4Var.getBottom()));
        float W1 = org.telegram.messenger.g0.W1(v9Var.n1, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(24.0f));
        canvas2.drawRoundRect(rectF, W1, W1, v9Var.f14920o1);
        if (barView.getChildCount() >= 1 && v9Var.n1 != 1.0f) {
            canvas2.save();
            canvas2.translate(barView.getLeft(), barView.getTop());
            View childAt = barView.getChildAt(0);
            if (barView instanceof tg.e1) {
                childAt = ((tg.e1) barView).getColorClickableView();
            }
            if (childAt.getAlpha() != 0.0f) {
                canvas2.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
                paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - v9Var.n1) * 255.0f));
                int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
                int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
                float x10 = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
                float y10 = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
                int i7 = h1Var.f57218a;
                int i10 = v9Var.J0;
                View view = childAt;
                if (i10 != -1) {
                    if (i10 == 0) {
                        viewGroup = v9Var.U0;
                    } else if (i10 == 2) {
                        viewGroup = v9Var.V0;
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
                    x10 = org.telegram.messenger.g0.T1(x10, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), v9Var.K0);
                    y10 = org.telegram.messenger.g0.T1(y10, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), v9Var.K0);
                }
                if (s4Var != null && s4Var.getChildCount() > 0) {
                    View childAt3 = s4Var.getChildAt(0);
                    x10 = org.telegram.messenger.g0.T1(x10, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (s4Var.getX() - barView.getLeft()), v9Var.n1);
                    y10 = org.telegram.messenger.g0.T1(y10, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (s4Var.getY() - barView.getTop()), v9Var.n1);
                    i7 = i0.a.f(v9Var.n1, h1Var.f57218a, this.f14728c.b(0));
                }
                float f10 = x10;
                float f11 = y10;
                if (f10 != this.f14726a || f11 != this.f14727b) {
                    this.f14726a = f10;
                    this.f14727b = f11;
                    paint2.setShader(new SweepGradient(f10, f11, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
                }
                float min = (Math.min(width, height) / 2.0f) - org.telegram.messenger.g0.L(0.5f);
                if (s4Var != null && s4Var.getChildCount() > 0) {
                    View childAt4 = s4Var.getChildAt(0);
                    min = org.telegram.messenger.g0.T1(min, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - org.telegram.messenger.g0.L(2.0f), v9Var.n1);
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
                if (s4Var != null && s4Var.getSelectedColorIndex() != 0) {
                    L = org.telegram.messenger.g0.T1(f12 - org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(2.0f) + f12, v9Var.n1);
                }
                tg.y0.A1(f10, f11, L, paint.getColor(), canvas2);
                if (s4Var != null && s4Var.getSelectedColorIndex() == 0) {
                    paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * v9Var.n1));
                    canvas2.drawCircle(f10, f11, com.google.android.gms.internal.vision.e2.t(1.0f, v9Var.n1, paint3.getStrokeWidth() + org.telegram.messenger.g0.L(3.0f), f12), paint3);
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        r4 r4Var = this.d.E0;
        if (r4Var != null) {
            r4Var.invalidate();
        }
    }
}
