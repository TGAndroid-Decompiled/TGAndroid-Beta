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
public final class ow5 extends FrameLayout {
    public float a;
    public float b;
    public final q88 c;

    public ow5(q88 q88Var, Context context) {
        super(context);
        this.c = q88Var;
        setWillNotDraw(false);
        Paint paint = q88Var.x1;
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
        q88 q88Var = this.c;
        mcb mcbVar = q88Var.A1;
        Paint paint = q88Var.y1;
        Paint paint2 = q88Var.x1;
        Paint paint3 = q88Var.z1;
        barView = q88Var.getBarView();
        Rect rect = gl.Q;
        int left = barView.getLeft();
        nw5 nw5Var = q88Var.w1;
        rect.set(gl.U1(q88Var.D1, left, nw5Var.getLeft()), gl.U1(q88Var.D1, barView.getTop(), nw5Var.getTop()), gl.U1(q88Var.D1, barView.getRight(), nw5Var.getRight()), gl.U1(q88Var.D1, barView.getBottom(), nw5Var.getBottom()));
        RectF rectF = gl.P;
        rectF.set(rect);
        float U1 = gl.U1(q88Var.D1, gl.L(32.0f), gl.L(24.0f));
        if (q88Var.W1 != null) {
            rect.inset(-gl.L(4.0f), -gl.L(4.0f));
            q88Var.W1.r(U1);
            q88Var.W1.setBounds(rect);
            q88Var.W1.draw(canvas);
        } else {
            canvas.drawRoundRect(rectF, U1, U1, q88Var.E1);
        }
        if (barView.getChildCount() >= 1 && q88Var.D1 != 1.0f) {
            canvas.save();
            canvas.translate(barView.getLeft(), barView.getTop());
            View childAt = barView.getChildAt(0);
            if (barView instanceof hs7) {
                childAt = ((hs7) barView).getColorClickableView();
            }
            if (childAt.getAlpha() != 0.0f) {
                canvas.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
                paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - q88Var.D1) * 255.0f));
                int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
                int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
                float x = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
                float y = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
                int i = mcbVar.a;
                int i2 = q88Var.X0;
                View view = childAt;
                if (i2 != -1) {
                    if (i2 == 0) {
                        viewGroup = q88Var.j1;
                    } else if (i2 == 2) {
                        viewGroup = q88Var.k1;
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
                    x = gl.R1(x, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), q88Var.Y0);
                    y = gl.R1(y, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), q88Var.Y0);
                }
                if (nw5Var != null && nw5Var.getChildCount() > 0) {
                    View childAt3 = nw5Var.getChildAt(0);
                    x = gl.R1(x, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (nw5Var.getX() - barView.getLeft()), q88Var.D1);
                    y = gl.R1(y, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (nw5Var.getY() - barView.getTop()), q88Var.D1);
                    i = bm2.f(q88Var.D1, mcbVar.a, q88Var.L1.b(0));
                }
                float f = x;
                float f2 = y;
                if (f != this.a || f2 != this.b) {
                    this.a = f;
                    this.b = f2;
                    paint2.setShader(new SweepGradient(f, f2, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
                }
                float min = (Math.min(width, height) / 2.0f) - gl.L(0.5f);
                if (nw5Var != null && nw5Var.getChildCount() > 0) {
                    View childAt4 = nw5Var.getChildAt(0);
                    min = gl.R1(min, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - gl.L(2.0f), q88Var.D1);
                }
                float f3 = min;
                rectF.set(f - f3, f2 - f3, f + f3, f2 + f3);
                canvas2 = canvas;
                canvas2.drawArc(rectF, 0.0f, 360.0f, false, paint2);
                paint.setColor(i);
                paint.setAlpha((int) (view.getAlpha() * paint.getAlpha()));
                paint3.setColor(i);
                paint3.setAlpha((int) (view.getAlpha() * 255.0f));
                float L = f3 - gl.L(3.0f);
                if (nw5Var != null && nw5Var.getSelectedColorIndex() != 0) {
                    L = gl.R1(f3 - gl.L(3.0f), gl.L(2.0f) + f3, q88Var.D1);
                }
                as7.A1(f, f2, L, paint.getColor(), canvas2);
                if (nw5Var != null && nw5Var.getSelectedColorIndex() == 0) {
                    paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * q88Var.D1));
                    canvas2.drawCircle(f, f2, ls6.B(1.0f, q88Var.D1, paint3.getStrokeWidth() + gl.L(3.0f), f3), paint3);
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
        yc ycVar = this.c.T0;
        if (ycVar != null) {
            ycVar.invalidate();
        }
    }
}
