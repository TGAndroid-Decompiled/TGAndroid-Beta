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
public final class oy5 extends FrameLayout {
    public float a;
    public float b;
    public final sa8 c;

    public oy5(sa8 sa8Var, Context context) {
        super(context);
        this.c = sa8Var;
        setWillNotDraw(false);
        Paint paint = sa8Var.x1;
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
        sa8 sa8Var = this.c;
        oeb oebVar = sa8Var.A1;
        Paint paint = sa8Var.y1;
        Paint paint2 = sa8Var.x1;
        Paint paint3 = sa8Var.z1;
        barView = sa8Var.getBarView();
        Rect rect = gm.Q;
        int left = barView.getLeft();
        ny5 ny5Var = sa8Var.w1;
        rect.set(gm.U1(sa8Var.D1, left, ny5Var.getLeft()), gm.U1(sa8Var.D1, barView.getTop(), ny5Var.getTop()), gm.U1(sa8Var.D1, barView.getRight(), ny5Var.getRight()), gm.U1(sa8Var.D1, barView.getBottom(), ny5Var.getBottom()));
        RectF rectF = gm.P;
        rectF.set(rect);
        float U1 = gm.U1(sa8Var.D1, gm.L(32.0f), gm.L(24.0f));
        if (sa8Var.W1 != null) {
            rect.inset(-gm.L(4.0f), -gm.L(4.0f));
            sa8Var.W1.r(U1);
            sa8Var.W1.setBounds(rect);
            sa8Var.W1.draw(canvas);
        } else {
            canvas.drawRoundRect(rectF, U1, U1, sa8Var.E1);
        }
        if (barView.getChildCount() >= 1 && sa8Var.D1 != 1.0f) {
            canvas.save();
            canvas.translate(barView.getLeft(), barView.getTop());
            View childAt = barView.getChildAt(0);
            if (barView instanceof iu7) {
                childAt = ((iu7) barView).getColorClickableView();
            }
            if (childAt.getAlpha() != 0.0f) {
                canvas.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
                paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - sa8Var.D1) * 255.0f));
                int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
                int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
                float x = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
                float y = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
                int i = oebVar.a;
                int i2 = sa8Var.X0;
                View view = childAt;
                if (i2 != -1) {
                    if (i2 == 0) {
                        viewGroup = sa8Var.j1;
                    } else if (i2 == 2) {
                        viewGroup = sa8Var.k1;
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
                    x = gm.R1(x, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), sa8Var.Y0);
                    y = gm.R1(y, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), sa8Var.Y0);
                }
                if (ny5Var != null && ny5Var.getChildCount() > 0) {
                    View childAt3 = ny5Var.getChildAt(0);
                    x = gm.R1(x, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (ny5Var.getX() - barView.getLeft()), sa8Var.D1);
                    y = gm.R1(y, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (ny5Var.getY() - barView.getTop()), sa8Var.D1);
                    i = on2.f(sa8Var.D1, oebVar.a, sa8Var.L1.b(0));
                }
                float f = x;
                float f2 = y;
                if (f != this.a || f2 != this.b) {
                    this.a = f;
                    this.b = f2;
                    paint2.setShader(new SweepGradient(f, f2, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
                }
                float min = (Math.min(width, height) / 2.0f) - gm.L(0.5f);
                if (ny5Var != null && ny5Var.getChildCount() > 0) {
                    View childAt4 = ny5Var.getChildAt(0);
                    min = gm.R1(min, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - gm.L(2.0f), sa8Var.D1);
                }
                float f3 = min;
                rectF.set(f - f3, f2 - f3, f + f3, f2 + f3);
                canvas2 = canvas;
                canvas2.drawArc(rectF, 0.0f, 360.0f, false, paint2);
                paint.setColor(i);
                paint.setAlpha((int) (view.getAlpha() * paint.getAlpha()));
                paint3.setColor(i);
                paint3.setAlpha((int) (view.getAlpha() * 255.0f));
                float L = f3 - gm.L(3.0f);
                if (ny5Var != null && ny5Var.getSelectedColorIndex() != 0) {
                    L = gm.R1(f3 - gm.L(3.0f), gm.L(2.0f) + f3, sa8Var.D1);
                }
                bu7.A1(f, f2, L, paint.getColor(), canvas2);
                if (ny5Var != null && ny5Var.getSelectedColorIndex() == 0) {
                    paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * sa8Var.D1));
                    canvas2.drawCircle(f, f2, kt6.B(1.0f, sa8Var.D1, paint3.getStrokeWidth() + gm.L(3.0f), f3), paint3);
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
        yd ydVar = this.c.T0;
        if (ydVar != null) {
            ydVar.invalidate();
        }
    }
}
