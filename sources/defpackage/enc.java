package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class enc extends FrameLayout {
    public final byte a;
    public final goc b;

    public enc(goc gocVar, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = gocVar;
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
                goc gocVar = this.b;
                if (gocVar.q0) {
                    va vaVar = gocVar.a;
                    if (vaVar != null) {
                        i3 = vaVar.getPaddingTop();
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
                va vaVar2 = gocVar.a;
                if (vaVar2 != null) {
                    i2 = vaVar2.getPaddingBottom();
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
                goc gocVar = this.b;
                hs1 hs1Var = gocVar.s0;
                va vaVar = gocVar.a;
                if (vaVar != null) {
                    i5 = vaVar.getPaddingTop();
                } else {
                    i5 = 0;
                }
                int i7 = -i5;
                int i8 = i3 - i;
                int i9 = i4 - i2;
                va vaVar2 = gocVar.a;
                if (vaVar2 != null) {
                    i6 = vaVar2.getPaddingBottom();
                } else {
                    i6 = 0;
                }
                hs1Var.layout(0, i7, i8, i6 + i9);
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
        goc gocVar = this.b;
        switch (b) {
            case 0:
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size, size2);
                hs1 hs1Var = gocVar.s0;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                va vaVar = gocVar.a;
                int i4 = 0;
                if (vaVar != null) {
                    i3 = vaVar.getPaddingTop();
                } else {
                    i3 = 0;
                }
                int i5 = i3 + size2;
                va vaVar2 = gocVar.a;
                if (vaVar2 != null) {
                    i4 = vaVar2.getPaddingBottom();
                }
                hs1Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i4 + i5, 1073741824));
                return;
            default:
                super.onMeasure(i, i2);
                setMeasuredDimension(getMeasuredWidth(), (int) Math.ceil(gocVar.T.c(gm.L(4.0f))));
                return;
        }
    }

    private final void a(boolean z) {
    }
}
