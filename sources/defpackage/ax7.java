package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class ax7 extends FrameLayout {
    public float a;
    public float b;
    public final a78 c;
    public final vab d;

    public ax7(vab vabVar, Context context, a78 a78Var) {
        super(context);
        this.d = vabVar;
        this.c = a78Var;
        setWillNotDraw(false);
        Paint paint = vabVar.h1;
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
        vab vabVar = this.d;
        igb igbVar = vabVar.k1;
        Paint paint = vabVar.i1;
        Paint paint2 = vabVar.h1;
        Paint paint3 = vabVar.j1;
        barView = vabVar.getBarView();
        RectF rectF = hl.P;
        int left = barView.getLeft();
        pw7 pw7Var = vabVar.g1;
        rectF.set(hl.U1(vabVar.n1, left, pw7Var.getLeft()), hl.U1(vabVar.n1, barView.getTop(), pw7Var.getTop()), hl.U1(vabVar.n1, barView.getRight(), pw7Var.getRight()), hl.U1(vabVar.n1, barView.getBottom(), pw7Var.getBottom()));
        float U1 = hl.U1(vabVar.n1, hl.L(32.0f), hl.L(24.0f));
        canvas.drawRoundRect(rectF, U1, U1, vabVar.o1);
        if (barView.getChildCount() >= 1 && vabVar.n1 != 1.0f) {
            canvas.save();
            canvas.translate(barView.getLeft(), barView.getTop());
            View childAt = barView.getChildAt(0);
            if (barView instanceof nv7) {
                childAt = ((nv7) barView).getColorClickableView();
            }
            if (childAt.getAlpha() != 0.0f) {
                canvas.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
                paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - vabVar.n1) * 255.0f));
                int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
                int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
                float x = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
                float y = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
                int i = igbVar.a;
                int i2 = vabVar.J0;
                View view = childAt;
                if (i2 != -1) {
                    if (i2 == 0) {
                        viewGroup = vabVar.U0;
                    } else if (i2 == 2) {
                        viewGroup = vabVar.V0;
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
                    x = hl.R1(x, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), vabVar.K0);
                    y = hl.R1(y, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), vabVar.K0);
                }
                if (pw7Var != null && pw7Var.getChildCount() > 0) {
                    View childAt3 = pw7Var.getChildAt(0);
                    x = hl.R1(x, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (pw7Var.getX() - barView.getLeft()), vabVar.n1);
                    y = hl.R1(y, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (pw7Var.getY() - barView.getTop()), vabVar.n1);
                    i = vm2.f(vabVar.n1, igbVar.a, this.c.b(0));
                }
                if (x != this.a || y != this.b) {
                    this.a = x;
                    this.b = y;
                    paint2.setShader(new SweepGradient(x, y, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
                }
                float min = (Math.min(width, height) / 2.0f) - hl.L(0.5f);
                if (pw7Var != null && pw7Var.getChildCount() > 0) {
                    View childAt4 = pw7Var.getChildAt(0);
                    min = hl.R1(min, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - hl.L(2.0f), vabVar.n1);
                }
                float f = min;
                rectF.set(x - f, y - f, x + f, y + f);
                canvas2 = canvas;
                canvas2.drawArc(rectF, 0.0f, 360.0f, false, paint2);
                paint.setColor(i);
                paint.setAlpha((int) (view.getAlpha() * paint.getAlpha()));
                paint3.setColor(i);
                paint3.setAlpha((int) (view.getAlpha() * 255.0f));
                float L = f - hl.L(3.0f);
                if (pw7Var != null && pw7Var.getSelectedColorIndex() != 0) {
                    L = hl.R1(f - hl.L(3.0f), hl.L(2.0f) + f, vabVar.n1);
                }
                gv7.B1(x, y, L, paint.getColor(), canvas2);
                if (pw7Var != null && pw7Var.getSelectedColorIndex() == 0) {
                    paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * vabVar.n1));
                    canvas2.drawCircle(x, y, qu6.B(1.0f, vabVar.n1, paint3.getStrokeWidth() + hl.L(3.0f), f), paint3);
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
        ow7 ow7Var = this.d.E0;
        if (ow7Var != null) {
            ow7Var.invalidate();
        }
    }
}
