package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class ug8 extends FrameLayout {
    public final byte a;
    public final xg8 b;

    public ug8(xg8 xg8Var, Activity activity, byte b) {
        super(activity);
        this.a = b;
        this.b = xg8Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        rc2 rc2Var;
        switch (this.a) {
            case 0:
                xg8 xg8Var = this.b;
                if (xg8Var.E > 0.0f && xg8Var.x != null) {
                    xg8Var.y.reset();
                    float width = getWidth() / xg8Var.s.getWidth();
                    xg8Var.y.postScale(width, width);
                    xg8Var.w.setLocalMatrix(xg8Var.y);
                    xg8Var.x.setAlpha((int) (xg8Var.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), xg8Var.x);
                } else {
                    canvas2 = canvas;
                }
                if (xg8Var.P && (rc2Var = xg8Var.M) != null) {
                    rc2Var.d6 = xg8Var.Q;
                    rc2Var.invalidate();
                    xg8Var.P = false;
                }
                super.dispatchDraw(canvas2);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.b.b(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.a) {
            case 1:
                xg8 xg8Var = this.b;
                if (view != xg8Var.L && view != xg8Var.K) {
                    return super.drawChild(canvas, view, j);
                }
                canvas.save();
                canvas.clipRect(0.0f, gm.R1(xg8Var.N, 0.0f, xg8Var.E), getWidth(), gm.R1(xg8Var.O, getHeight(), xg8Var.E));
                boolean drawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                super.onLayout(z, i, i2, i3, i4);
                this.b.d();
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 2:
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                xg8 xg8Var = this.b;
                xg8Var.e();
                for (int i3 = 0; i3 < getChildCount(); i3++) {
                    View childAt = getChildAt(i3);
                    ViewGroup viewGroup = xg8Var.U;
                    if (childAt == viewGroup) {
                        float f = xg8Var.V;
                        if (f > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = xg8Var.S;
                    if (childAt == viewGroup2) {
                        float f2 = xg8Var.T;
                        if (f2 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    v29 v29Var = xg8Var.R;
                    if (childAt == v29Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(v29Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                    }
                }
                setMeasuredDimension(size, size2);
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                super.onSizeChanged(i, i2, i3, i4);
                xg8 xg8Var = this.b;
                tl0.c(xg8Var.G, xg8Var.c);
                xg8Var.H.d();
                return;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                return;
        }
    }
}
