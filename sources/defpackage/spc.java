package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class spc extends FrameLayout {
    public final byte a;
    public final uqc b;

    public spc(uqc uqcVar, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = uqcVar;
    }

    @Override
    public final void dispatchSetPressed(boolean z) {
        switch (this.a) {
            case 0:
                return;
            default:
                super.dispatchSetPressed(z);
                return;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        int i2;
        int i3;
        switch (this.a) {
            case 0:
                uqc uqcVar = this.b;
                if (uqcVar.q0) {
                    wa waVar = uqcVar.a;
                    if (waVar != null) {
                        i3 = waVar.getPaddingTop();
                    } else {
                        i3 = 0;
                    }
                    i = -i3;
                } else {
                    i = 0;
                }
                canvas.save();
                int width = getWidth();
                int height = getHeight();
                wa waVar2 = uqcVar.a;
                if (waVar2 != null) {
                    i2 = waVar2.getPaddingBottom();
                } else {
                    i2 = 0;
                }
                canvas.clipRect(0, i, width, i2 + height);
                boolean drawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        switch (this.a) {
            case 0:
                super.onAttachedToWindow();
                if (getParent() instanceof ViewGroup) {
                    ((ViewGroup) getParent()).setClipChildren(false);
                    return;
                }
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        switch (this.a) {
            case 0:
                uqc uqcVar = this.b;
                ir1 ir1Var = uqcVar.s0;
                wa waVar = uqcVar.a;
                if (waVar != null) {
                    i5 = waVar.getPaddingTop();
                } else {
                    i5 = 0;
                }
                int i7 = -i5;
                int i8 = i3 - i;
                int i9 = i4 - i2;
                wa waVar2 = uqcVar.a;
                if (waVar2 != null) {
                    i6 = waVar2.getPaddingBottom();
                } else {
                    i6 = 0;
                }
                ir1Var.layout(0, i7, i8, i6 + i9);
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        byte b = this.a;
        uqc uqcVar = this.b;
        switch (b) {
            case 0:
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size, size2);
                int i4 = 0;
                uqcVar.d1(0);
                uqcVar.d1(1);
                ir1 ir1Var = uqcVar.s0;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                wa waVar = uqcVar.a;
                if (waVar != null) {
                    i3 = waVar.getPaddingTop();
                } else {
                    i3 = 0;
                }
                int i5 = i3 + size2;
                wa waVar2 = uqcVar.a;
                if (waVar2 != null) {
                    i4 = waVar2.getPaddingBottom();
                }
                ir1Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i4 + i5, 1073741824));
                return;
            default:
                super.onMeasure(i, i2);
                setMeasuredDimension(getMeasuredWidth(), (int) Math.ceil(uqcVar.T.c(hl.L(4.0f))));
                return;
        }
    }

    private final void a(boolean z) {
    }
}
