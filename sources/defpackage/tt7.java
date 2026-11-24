package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class tt7 extends FrameLayout {
    public float a;
    public float b;
    public final k38 c;
    public final x6b d;

    public tt7(x6b x6bVar, Context context, k38 k38Var) {
        super(context);
        this.d = x6bVar;
        this.c = k38Var;
        setWillNotDraw(false);
        Paint paint = x6bVar.n1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gl.L(2.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ViewGroup barView;
        Canvas canvas2;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.onDraw(canvas);
        x6b x6bVar = this.d;
        mcb mcbVar = x6bVar.q1;
        Paint paint = x6bVar.o1;
        Paint paint2 = x6bVar.n1;
        Paint paint3 = x6bVar.p1;
        barView = x6bVar.getBarView();
        RectF rectF = gl.P;
        int left = barView.getLeft();
        it7 it7Var = x6bVar.m1;
        rectF.set(gl.U1(x6bVar.t1, left, it7Var.getLeft()), gl.U1(x6bVar.t1, barView.getTop(), it7Var.getTop()), gl.U1(x6bVar.t1, barView.getRight(), it7Var.getRight()), gl.U1(x6bVar.t1, barView.getBottom(), it7Var.getBottom()));
        float U1 = gl.U1(x6bVar.t1, gl.L(32.0f), gl.L(24.0f));
        canvas.drawRoundRect(rectF, U1, U1, x6bVar.u1);
        if (barView.getChildCount() >= 1 && x6bVar.t1 != 1.0f) {
            canvas.save();
            canvas.translate(barView.getLeft(), barView.getTop());
            View childAt = barView.getChildAt(0);
            if (barView instanceof hs7) {
                childAt = ((hs7) barView).getColorClickableView();
            }
            if (childAt.getAlpha() != 0.0f) {
                canvas.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
                paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - x6bVar.t1) * 255.0f));
                int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
                int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
                float x = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
                float y = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
                int i = mcbVar.a;
                int i2 = x6bVar.P0;
                View view = childAt;
                if (i2 != -1) {
                    if (i2 == 0) {
                        viewGroup = x6bVar.a1;
                    } else if (i2 == 2) {
                        viewGroup = x6bVar.b1;
                    } else {
                        viewGroup = null;
                    }
                    if (viewGroup == null) {
                        viewGroup2 = barView;
                    } else {
                        viewGroup2 = viewGroup;
                    }
                    View childAt2 = viewGroup2.getChildAt(0);
                    if (viewGroup instanceof hs7) {
                        childAt2 = ((hs7) viewGroup).getColorClickableView();
                    }
                    x = gl.R1(x, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), x6bVar.Q0);
                    y = gl.R1(y, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), x6bVar.Q0);
                }
                if (it7Var != null && it7Var.getChildCount() > 0) {
                    View childAt3 = it7Var.getChildAt(0);
                    x = gl.R1(x, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (it7Var.getX() - barView.getLeft()), x6bVar.t1);
                    y = gl.R1(y, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (it7Var.getY() - barView.getTop()), x6bVar.t1);
                    i = bm2.f(x6bVar.t1, mcbVar.a, this.c.b(0));
                }
                if (x != this.a || y != this.b) {
                    this.a = x;
                    this.b = y;
                    paint2.setShader(new SweepGradient(x, y, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
                }
                float min = (Math.min(width, height) / 2.0f) - gl.L(0.5f);
                if (it7Var != null && it7Var.getChildCount() > 0) {
                    View childAt4 = it7Var.getChildAt(0);
                    min = gl.R1(min, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - gl.L(2.0f), x6bVar.t1);
                }
                float f = min;
                rectF.set(x - f, y - f, x + f, y + f);
                canvas2 = canvas;
                canvas2.drawArc(rectF, 0.0f, 360.0f, false, paint2);
                paint.setColor(i);
                paint.setAlpha((int) (view.getAlpha() * paint.getAlpha()));
                paint3.setColor(i);
                paint3.setAlpha((int) (view.getAlpha() * 255.0f));
                float L = f - gl.L(3.0f);
                if (it7Var != null && it7Var.getSelectedColorIndex() != 0) {
                    L = gl.R1(f - gl.L(3.0f), gl.L(2.0f) + f, x6bVar.t1);
                }
                as7.A1(x, y, L, paint.getColor(), canvas2);
                if (it7Var != null && it7Var.getSelectedColorIndex() == 0) {
                    paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * x6bVar.t1));
                    canvas2.drawCircle(x, y, ls6.B(1.0f, x6bVar.t1, paint3.getStrokeWidth() + gl.L(3.0f), f), paint3);
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
        ht7 ht7Var = this.d.K0;
        if (ht7Var != null) {
            ht7Var.invalidate();
        }
    }
}
