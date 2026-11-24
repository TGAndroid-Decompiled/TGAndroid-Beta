package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class uv7 extends FrameLayout {
    public float a;
    public float b;
    public final m58 c;
    public final z8b d;

    public uv7(z8b z8bVar, Context context, m58 m58Var) {
        super(context);
        this.d = z8bVar;
        this.c = m58Var;
        setWillNotDraw(false);
        Paint paint = z8bVar.n1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gm.L(2.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ViewGroup barView;
        Canvas canvas2;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.onDraw(canvas);
        z8b z8bVar = this.d;
        oeb oebVar = z8bVar.q1;
        Paint paint = z8bVar.o1;
        Paint paint2 = z8bVar.n1;
        Paint paint3 = z8bVar.p1;
        barView = z8bVar.getBarView();
        RectF rectF = gm.P;
        int left = barView.getLeft();
        jv7 jv7Var = z8bVar.m1;
        rectF.set(gm.U1(z8bVar.t1, left, jv7Var.getLeft()), gm.U1(z8bVar.t1, barView.getTop(), jv7Var.getTop()), gm.U1(z8bVar.t1, barView.getRight(), jv7Var.getRight()), gm.U1(z8bVar.t1, barView.getBottom(), jv7Var.getBottom()));
        float U1 = gm.U1(z8bVar.t1, gm.L(32.0f), gm.L(24.0f));
        canvas.drawRoundRect(rectF, U1, U1, z8bVar.u1);
        if (barView.getChildCount() >= 1 && z8bVar.t1 != 1.0f) {
            canvas.save();
            canvas.translate(barView.getLeft(), barView.getTop());
            View childAt = barView.getChildAt(0);
            if (barView instanceof iu7) {
                childAt = ((iu7) barView).getColorClickableView();
            }
            if (childAt.getAlpha() != 0.0f) {
                canvas.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
                paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - z8bVar.t1) * 255.0f));
                int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
                int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
                float x = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
                float y = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
                int i = oebVar.a;
                int i2 = z8bVar.P0;
                View view = childAt;
                if (i2 != -1) {
                    if (i2 == 0) {
                        viewGroup = z8bVar.a1;
                    } else if (i2 == 2) {
                        viewGroup = z8bVar.b1;
                    } else {
                        viewGroup = null;
                    }
                    if (viewGroup == null) {
                        viewGroup2 = barView;
                    } else {
                        viewGroup2 = viewGroup;
                    }
                    View childAt2 = viewGroup2.getChildAt(0);
                    if (viewGroup instanceof iu7) {
                        childAt2 = ((iu7) viewGroup).getColorClickableView();
                    }
                    x = gm.R1(x, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), z8bVar.Q0);
                    y = gm.R1(y, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), z8bVar.Q0);
                }
                if (jv7Var != null && jv7Var.getChildCount() > 0) {
                    View childAt3 = jv7Var.getChildAt(0);
                    x = gm.R1(x, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (jv7Var.getX() - barView.getLeft()), z8bVar.t1);
                    y = gm.R1(y, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (jv7Var.getY() - barView.getTop()), z8bVar.t1);
                    i = on2.f(z8bVar.t1, oebVar.a, this.c.b(0));
                }
                if (x != this.a || y != this.b) {
                    this.a = x;
                    this.b = y;
                    paint2.setShader(new SweepGradient(x, y, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
                }
                float min = (Math.min(width, height) / 2.0f) - gm.L(0.5f);
                if (jv7Var != null && jv7Var.getChildCount() > 0) {
                    View childAt4 = jv7Var.getChildAt(0);
                    min = gm.R1(min, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - gm.L(2.0f), z8bVar.t1);
                }
                float f = min;
                rectF.set(x - f, y - f, x + f, y + f);
                canvas2 = canvas;
                canvas2.drawArc(rectF, 0.0f, 360.0f, false, paint2);
                paint.setColor(i);
                paint.setAlpha((int) (view.getAlpha() * paint.getAlpha()));
                paint3.setColor(i);
                paint3.setAlpha((int) (view.getAlpha() * 255.0f));
                float L = f - gm.L(3.0f);
                if (jv7Var != null && jv7Var.getSelectedColorIndex() != 0) {
                    L = gm.R1(f - gm.L(3.0f), gm.L(2.0f) + f, z8bVar.t1);
                }
                bu7.A1(x, y, L, paint.getColor(), canvas2);
                if (jv7Var != null && jv7Var.getSelectedColorIndex() == 0) {
                    paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * z8bVar.t1));
                    canvas2.drawCircle(x, y, kt6.B(1.0f, z8bVar.t1, paint3.getStrokeWidth() + gm.L(3.0f), f), paint3);
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
        iv7 iv7Var = this.d.K0;
        if (iv7Var != null) {
            iv7Var.invalidate();
        }
    }
}
