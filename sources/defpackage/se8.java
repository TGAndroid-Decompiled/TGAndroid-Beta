package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class se8 extends FrameLayout {
    public final byte a;
    public final ve8 b;

    public se8(ve8 ve8Var, Activity activity, byte b) {
        super(activity);
        this.a = b;
        this.b = ve8Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        gb2 gb2Var;
        switch (this.a) {
            case 0:
                ve8 ve8Var = this.b;
                if (ve8Var.E > 0.0f && ve8Var.x != null) {
                    ve8Var.y.reset();
                    float width = getWidth() / ve8Var.s.getWidth();
                    ve8Var.y.postScale(width, width);
                    ve8Var.w.setLocalMatrix(ve8Var.y);
                    ve8Var.x.setAlpha((int) (ve8Var.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ve8Var.x);
                } else {
                    canvas2 = canvas;
                }
                if (ve8Var.P && (gb2Var = ve8Var.M) != null) {
                    gb2Var.d6 = ve8Var.Q;
                    gb2Var.invalidate();
                    ve8Var.P = false;
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
                ve8 ve8Var = this.b;
                if (view != ve8Var.L && view != ve8Var.K) {
                    return super.drawChild(canvas, view, j);
                }
                canvas.save();
                canvas.clipRect(0.0f, gl.R1(ve8Var.N, 0.0f, ve8Var.E), getWidth(), gl.R1(ve8Var.O, getHeight(), ve8Var.E));
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
                ve8 ve8Var = this.b;
                ve8Var.e();
                for (int i3 = 0; i3 < getChildCount(); i3++) {
                    View childAt = getChildAt(i3);
                    ViewGroup viewGroup = ve8Var.U;
                    if (childAt == viewGroup) {
                        float f = ve8Var.V;
                        if (f > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = ve8Var.S;
                    if (childAt == viewGroup2) {
                        float f2 = ve8Var.T;
                        if (f2 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    t09 t09Var = ve8Var.R;
                    if (childAt == t09Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(t09Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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
                ve8 ve8Var = this.b;
                tk0.c(ve8Var.G, ve8Var.c);
                ve8Var.H.d();
                return;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                return;
        }
    }
}
