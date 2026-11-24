package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class b51 extends FrameLayout {
    public final byte a = 0;
    public int b;
    public final Object c;
    public final Object d;
    public final jm7 e;

    public b51(f51 f51Var, Context context) {
        super(context);
        this.e = f51Var;
        this.b = -1;
        this.c = new Rect();
        this.d = new ln(220L, this, d53.h);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                in3 in3Var = (in3) this.d;
                Path path = (Path) this.c;
                i22 i22Var = (i22) this.e;
                im0 im0Var = i22Var.y2;
                if (im0Var != null) {
                    im0Var.setBounds(0, (int) i22Var.S3, getMeasuredWidth(), getMeasuredHeight());
                    im0Var.draw(canvas);
                }
                float L = gm.L(20.0f);
                int L2 = gm.L(7.0f);
                int L3 = gm.L(7.0f);
                RectF rectF = gm.P;
                float f = L2;
                rectF.set(getPaddingLeft(), f, getWidth() - getPaddingRight(), getHeight() - L3);
                path.rewind();
                path.addRoundRect(rectF, L, L, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF, 255, 31);
                super.dispatchDraw(canvas);
                rectF.set(getPaddingLeft(), f, getWidth() - getPaddingRight(), gm.L(6.0f) + L2);
                in3Var.r(canvas, rectF, 1, 1.0f);
                rectF.set(getPaddingLeft(), (getHeight() - L3) - gm.L(6.0f), getWidth() - getPaddingRight(), getHeight() - L3);
                in3Var.r(canvas, rectF, 3, 1.0f);
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
                f51 f51Var = (f51) this.e;
                float e = ((ln) this.d).e(false, f51Var.n.getWidth());
                Rect rect = (Rect) this.c;
                float f = e / 2.0f;
                rect.set((int) (width - (f51Var.n.getScaleX() * f)), (int) (((1.0f - f51Var.n.getScaleY()) * f51Var.n.getHeight()) + f51Var.n.getY()), (int) ((f51Var.n.getScaleX() * f) + width), (int) (f51Var.n.getY() + f51Var.n.getHeight()));
                f51Var.r.setBounds(rect);
                f51Var.r.draw(canvas);
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
                ImageView imageView = ((i22) this.e).v1;
                int top = i5 - imageView.getTop();
                super.onLayout(z, i, i2, i3, i4);
                this.b = getHeight();
                if (imageView.getVisibility() == 0 && getHeight() - imageView.getTop() != top) {
                    imageView.setTranslationY(imageView.getTranslationY() + ((getHeight() - imageView.getTop()) - top));
                    imageView.animate().translationY(0.0f).setDuration(320L).setInterpolator(d53.h).start();
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
                f51 f51Var = (f51) this.e;
                f51Var.n.measure(i, i2);
                invalidate();
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(this.b, gm.L(36.0f) + f51Var.n.getMeasuredHeight()), 1073741824));
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

    public b51(i22 i22Var, Context context) {
        super(context);
        this.e = i22Var;
        this.c = new Path();
        this.d = new in3((byte) 7);
    }
}
