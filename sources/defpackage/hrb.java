package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class hrb extends FrameLayout {
    public final byte a;
    public final krb b;

    public hrb(krb krbVar, Activity activity, byte b) {
        super(activity);
        this.a = b;
        this.b = krbVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        rc2 rc2Var;
        switch (this.a) {
            case 0:
                krb krbVar = this.b;
                if (krbVar.y > 0.0f && krbVar.w != null) {
                    krbVar.x.reset();
                    float width = getWidth() / krbVar.r.getWidth();
                    krbVar.x.postScale(width, width);
                    krbVar.s.setLocalMatrix(krbVar.x);
                    krbVar.w.setAlpha((int) (krbVar.y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), krbVar.w);
                } else {
                    canvas2 = canvas;
                }
                if (krbVar.O && (rc2Var = krbVar.L) != null) {
                    rc2Var.c6 = krbVar.P;
                    rc2Var.invalidate();
                    krbVar.O = false;
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
                krb krbVar = this.b;
                if (view != krbVar.K && view != krbVar.J) {
                    return super.drawChild(canvas, view, j);
                }
                canvas.save();
                canvas.clipRect(0.0f, gm.R1(krbVar.M, 0.0f, krbVar.y), getWidth(), gm.R1(krbVar.N, getHeight(), krbVar.y));
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
                krb krbVar = this.b;
                krbVar.e();
                for (int i3 = 0; i3 < getChildCount(); i3++) {
                    View childAt = getChildAt(i3);
                    ViewGroup viewGroup = krbVar.T;
                    if (childAt == viewGroup) {
                        float f = krbVar.U;
                        if (f > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = krbVar.R;
                    if (childAt == viewGroup2) {
                        float f2 = krbVar.S;
                        if (f2 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    v29 v29Var = krbVar.Q;
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
                krb krbVar = this.b;
                tl0.c(krbVar.F, krbVar.b);
                krbVar.G.d();
                return;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                return;
        }
    }
}
