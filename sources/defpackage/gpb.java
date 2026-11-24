package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class gpb extends FrameLayout {
    public final byte a;
    public final jpb b;

    public gpb(jpb jpbVar, Activity activity, byte b) {
        super(activity);
        this.a = b;
        this.b = jpbVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        gb2 gb2Var;
        switch (this.a) {
            case 0:
                jpb jpbVar = this.b;
                if (jpbVar.y > 0.0f && jpbVar.w != null) {
                    jpbVar.x.reset();
                    float width = getWidth() / jpbVar.r.getWidth();
                    jpbVar.x.postScale(width, width);
                    jpbVar.s.setLocalMatrix(jpbVar.x);
                    jpbVar.w.setAlpha((int) (jpbVar.y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), jpbVar.w);
                } else {
                    canvas2 = canvas;
                }
                if (jpbVar.O && (gb2Var = jpbVar.L) != null) {
                    gb2Var.c6 = jpbVar.P;
                    gb2Var.invalidate();
                    jpbVar.O = false;
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
                jpb jpbVar = this.b;
                if (view != jpbVar.K && view != jpbVar.J) {
                    return super.drawChild(canvas, view, j);
                }
                canvas.save();
                canvas.clipRect(0.0f, gl.R1(jpbVar.M, 0.0f, jpbVar.y), getWidth(), gl.R1(jpbVar.N, getHeight(), jpbVar.y));
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
                jpb jpbVar = this.b;
                jpbVar.e();
                for (int i3 = 0; i3 < getChildCount(); i3++) {
                    View childAt = getChildAt(i3);
                    ViewGroup viewGroup = jpbVar.T;
                    if (childAt == viewGroup) {
                        float f = jpbVar.U;
                        if (f > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = jpbVar.R;
                    if (childAt == viewGroup2) {
                        float f2 = jpbVar.S;
                        if (f2 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    t09 t09Var = jpbVar.Q;
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
                jpb jpbVar = this.b;
                tk0.c(jpbVar.F, jpbVar.b);
                jpbVar.G.d();
                return;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                return;
        }
    }
}
