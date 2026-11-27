package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class gi8 extends FrameLayout {
    public final byte a;
    public final ji8 b;

    public gi8(ji8 ji8Var, Activity activity, byte b) {
        super(activity);
        this.a = b;
        this.b = ji8Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        wb2 wb2Var;
        switch (this.a) {
            case 0:
                ji8 ji8Var = this.b;
                if (ji8Var.E > 0.0f && ji8Var.x != null) {
                    ji8Var.y.reset();
                    float width = getWidth() / ji8Var.s.getWidth();
                    ji8Var.y.postScale(width, width);
                    ji8Var.w.setLocalMatrix(ji8Var.y);
                    ji8Var.x.setAlpha((int) (ji8Var.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ji8Var.x);
                } else {
                    canvas2 = canvas;
                }
                if (ji8Var.P && (wb2Var = ji8Var.M) != null) {
                    wb2Var.d6 = ji8Var.Q;
                    wb2Var.invalidate();
                    ji8Var.P = false;
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
                ji8 ji8Var = this.b;
                if (view != ji8Var.L && view != ji8Var.K) {
                    return super.drawChild(canvas, view, j);
                }
                canvas.save();
                canvas.clipRect(0.0f, hl.R1(ji8Var.N, 0.0f, ji8Var.E), getWidth(), hl.R1(ji8Var.O, getHeight(), ji8Var.E));
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
                ji8 ji8Var = this.b;
                ji8Var.e();
                for (int i3 = 0; i3 < getChildCount(); i3++) {
                    View childAt = getChildAt(i3);
                    ViewGroup viewGroup = ji8Var.U;
                    if (childAt == viewGroup) {
                        float f = ji8Var.V;
                        if (f > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = ji8Var.S;
                    if (childAt == viewGroup2) {
                        float f2 = ji8Var.T;
                        if (f2 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    i49 i49Var = ji8Var.R;
                    if (childAt == i49Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i49Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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
                ji8 ji8Var = this.b;
                uk0.c(ji8Var.G, ji8Var.c);
                ji8Var.H.d();
                return;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                return;
        }
    }
}
