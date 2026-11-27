package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class c41 extends FrameLayout {
    public final byte a = 0;
    public int b;
    public final Object c;
    public final Object d;
    public final fn7 e;

    public c41(g41 g41Var, Context context) {
        super(context);
        this.e = g41Var;
        this.b = -1;
        this.c = new Rect();
        this.d = new mm(220L, this, k43.h);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                pm3 pm3Var = (pm3) this.d;
                Path path = (Path) this.c;
                n12 n12Var = (n12) this.e;
                jl0 jl0Var = n12Var.y2;
                if (jl0Var != null) {
                    jl0Var.setBounds(0, (int) n12Var.S3, getMeasuredWidth(), getMeasuredHeight());
                    jl0Var.draw(canvas);
                }
                float L = hl.L(20.0f);
                int L2 = hl.L(7.0f);
                int L3 = hl.L(7.0f);
                RectF rectF = hl.P;
                float f = L2;
                rectF.set(getPaddingLeft(), f, getWidth() - getPaddingRight(), getHeight() - L3);
                path.rewind();
                path.addRoundRect(rectF, L, L, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF, 255, 31);
                super.dispatchDraw(canvas);
                rectF.set(getPaddingLeft(), f, getWidth() - getPaddingRight(), hl.L(6.0f) + L2);
                pm3Var.r(canvas, rectF, 1, 1.0f);
                rectF.set(getPaddingLeft(), (getHeight() - L3) - hl.L(6.0f), getWidth() - getPaddingRight(), getHeight() - L3);
                pm3Var.r(canvas, rectF, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.a) {
            case 0:
                float width = getWidth() / 2.0f;
                g41 g41Var = (g41) this.e;
                float e = ((mm) this.d).e(false, g41Var.n.getWidth());
                Rect rect = (Rect) this.c;
                float f = e / 2.0f;
                rect.set((int) (width - (g41Var.n.getScaleX() * f)), (int) (((1.0f - g41Var.n.getScaleY()) * g41Var.n.getHeight()) + g41Var.n.getY()), (int) ((g41Var.n.getScaleX() * f) + width), (int) (g41Var.n.getY() + g41Var.n.getHeight()));
                g41Var.r.setBounds(rect);
                g41Var.r.draw(canvas);
                return super.drawChild(canvas, view, j);
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 1:
                int i5 = this.b;
                ImageView imageView = ((n12) this.e).v1;
                int top = i5 - imageView.getTop();
                super.onLayout(z, i, i2, i3, i4);
                this.b = getHeight();
                if (imageView.getVisibility() == 0 && getHeight() - imageView.getTop() != top) {
                    imageView.setTranslationY(imageView.getTranslationY() + ((getHeight() - imageView.getTop()) - top));
                    imageView.animate().translationY(0.0f).setDuration(320L).setInterpolator(k43.h).start();
                    return;
                }
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                g41 g41Var = (g41) this.e;
                g41Var.n.measure(i, i2);
                invalidate();
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(this.b, hl.L(36.0f) + g41Var.n.getMeasuredHeight()), 1073741824));
                if (this.b < 0) {
                    this.b = getMeasuredHeight();
                    return;
                }
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    public c41(n12 n12Var, Context context) {
        super(context);
        this.e = n12Var;
        this.c = new Path();
        this.d = new pm3((byte) 7);
    }
}
