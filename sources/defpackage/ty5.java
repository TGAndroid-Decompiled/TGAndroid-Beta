package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class ty5 extends FrameLayout {
    public float a;
    public float b;
    public final hc8 c;

    public ty5(hc8 hc8Var, Context context) {
        super(context);
        this.c = hc8Var;
        setWillNotDraw(false);
        Paint paint = hc8Var.r1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(hl.L(2.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ViewGroup barView;
        Canvas canvas2;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.onDraw(canvas);
        hc8 hc8Var = this.c;
        igb igbVar = hc8Var.u1;
        Paint paint = hc8Var.s1;
        Paint paint2 = hc8Var.r1;
        Paint paint3 = hc8Var.t1;
        barView = hc8Var.getBarView();
        Rect rect = hl.Q;
        int left = barView.getLeft();
        sy5 sy5Var = hc8Var.q1;
        rect.set(hl.U1(hc8Var.x1, left, sy5Var.getLeft()), hl.U1(hc8Var.x1, barView.getTop(), sy5Var.getTop()), hl.U1(hc8Var.x1, barView.getRight(), sy5Var.getRight()), hl.U1(hc8Var.x1, barView.getBottom(), sy5Var.getBottom()));
        RectF rectF = hl.P;
        rectF.set(rect);
        float U1 = hl.U1(hc8Var.x1, hl.L(32.0f), hl.L(24.0f));
        if (hc8Var.Q1 != null) {
            rect.inset(-hl.L(4.0f), -hl.L(4.0f));
            hc8Var.Q1.r(U1);
            hc8Var.Q1.setBounds(rect);
            hc8Var.Q1.draw(canvas);
        } else {
            canvas.drawRoundRect(rectF, U1, U1, hc8Var.y1);
        }
        if (barView.getChildCount() >= 1 && hc8Var.x1 != 1.0f) {
            canvas.save();
            canvas.translate(barView.getLeft(), barView.getTop());
            View childAt = barView.getChildAt(0);
            if (barView instanceof nv7) {
                childAt = ((nv7) barView).getColorClickableView();
            }
            if (childAt.getAlpha() != 0.0f) {
                canvas.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
                paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - hc8Var.x1) * 255.0f));
                int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
                int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
                float x = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
                float y = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
                int i = igbVar.a;
                int i2 = hc8Var.R0;
                View view = childAt;
                if (i2 != -1) {
                    if (i2 == 0) {
                        viewGroup = hc8Var.d1;
                    } else if (i2 == 2) {
                        viewGroup = hc8Var.e1;
                    } else {
                        viewGroup = null;
                    }
                    if (viewGroup == null) {
                        viewGroup2 = barView;
                    } else {
                        viewGroup2 = viewGroup;
                    }
                    View childAt2 = viewGroup2.getChildAt(0);
                    if (viewGroup instanceof nv7) {
                        childAt2 = ((nv7) viewGroup).getColorClickableView();
                    }
                    x = hl.R1(x, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), hc8Var.S0);
                    y = hl.R1(y, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), hc8Var.S0);
                }
                if (sy5Var != null && sy5Var.getChildCount() > 0) {
                    View childAt3 = sy5Var.getChildAt(0);
                    x = hl.R1(x, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (sy5Var.getX() - barView.getLeft()), hc8Var.x1);
                    y = hl.R1(y, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (sy5Var.getY() - barView.getTop()), hc8Var.x1);
                    i = vm2.f(hc8Var.x1, igbVar.a, hc8Var.F1.b(0));
                }
                float f = x;
                float f2 = y;
                if (f != this.a || f2 != this.b) {
                    this.a = f;
                    this.b = f2;
                    paint2.setShader(new SweepGradient(f, f2, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
                }
                float min = (Math.min(width, height) / 2.0f) - hl.L(0.5f);
                if (sy5Var != null && sy5Var.getChildCount() > 0) {
                    View childAt4 = sy5Var.getChildAt(0);
                    min = hl.R1(min, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - hl.L(2.0f), hc8Var.x1);
                }
                float f3 = min;
                rectF.set(f - f3, f2 - f3, f + f3, f2 + f3);
                canvas2 = canvas;
                canvas2.drawArc(rectF, 0.0f, 360.0f, false, paint2);
                paint.setColor(i);
                paint.setAlpha((int) (view.getAlpha() * paint.getAlpha()));
                paint3.setColor(i);
                paint3.setAlpha((int) (view.getAlpha() * 255.0f));
                float L = f3 - hl.L(3.0f);
                if (sy5Var != null && sy5Var.getSelectedColorIndex() != 0) {
                    L = hl.R1(f3 - hl.L(3.0f), hl.L(2.0f) + f3, hc8Var.x1);
                }
                gv7.B1(f, f2, L, paint.getColor(), canvas2);
                if (sy5Var != null && sy5Var.getSelectedColorIndex() == 0) {
                    paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * hc8Var.x1));
                    canvas2.drawCircle(f, f2, qu6.B(1.0f, hc8Var.x1, paint3.getStrokeWidth() + hl.L(3.0f), f3), paint3);
                }
            } else {
                canvas2 = canvas;
            }
            canvas2.restore();
        }
    }

    @Override
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        zc zcVar = this.c.N0;
        if (zcVar != null) {
            zcVar.invalidate();
        }
    }
}
