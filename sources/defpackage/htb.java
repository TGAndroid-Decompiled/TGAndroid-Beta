package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class htb extends FrameLayout {
    public final byte a;
    public final ktb b;

    public htb(ktb ktbVar, Activity activity, byte b) {
        super(activity);
        this.a = b;
        this.b = ktbVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        wb2 wb2Var;
        switch (this.a) {
            case 0:
                ktb ktbVar = this.b;
                if (ktbVar.y > 0.0f && ktbVar.w != null) {
                    ktbVar.x.reset();
                    float width = getWidth() / ktbVar.r.getWidth();
                    ktbVar.x.postScale(width, width);
                    ktbVar.s.setLocalMatrix(ktbVar.x);
                    ktbVar.w.setAlpha((int) (ktbVar.y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ktbVar.w);
                } else {
                    canvas2 = canvas;
                }
                if (ktbVar.O && (wb2Var = ktbVar.L) != null) {
                    wb2Var.c6 = ktbVar.P;
                    wb2Var.invalidate();
                    ktbVar.O = false;
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
                ktb ktbVar = this.b;
                if (view != ktbVar.K && view != ktbVar.J) {
                    return super.drawChild(canvas, view, j);
                }
                canvas.save();
                canvas.clipRect(0.0f, hl.R1(ktbVar.M, 0.0f, ktbVar.y), getWidth(), hl.R1(ktbVar.N, getHeight(), ktbVar.y));
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
                ktb ktbVar = this.b;
                ktbVar.e();
                for (int i3 = 0; i3 < getChildCount(); i3++) {
                    View childAt = getChildAt(i3);
                    ViewGroup viewGroup = ktbVar.T;
                    if (childAt == viewGroup) {
                        float f = ktbVar.U;
                        if (f > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = ktbVar.R;
                    if (childAt == viewGroup2) {
                        float f2 = ktbVar.S;
                        if (f2 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    i49 i49Var = ktbVar.Q;
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
                ktb ktbVar = this.b;
                uk0.c(ktbVar.F, ktbVar.b);
                ktbVar.G.d();
                return;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                return;
        }
    }
}
