package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.os.SystemClock;
import android.view.TextureView;
import android.view.View;
import org.telegram.ui.Components.q;
public final class ro5 extends TextureView {
    public final byte a;
    public final Object b;

    public ro5(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void invalidate() {
        tl9 tl9Var;
        switch (this.a) {
            case 0:
                q qVar = (q) this.b;
                if (!qVar.K0 && (tl9Var = qVar.S) != null && tl9Var.a == 3) {
                    qVar.K0 = true;
                    try {
                        qVar.I0 = SystemClock.elapsedRealtimeNanos();
                        qVar.B();
                    } finally {
                        qVar.K0 = false;
                    }
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 1:
                View.MeasureSpec.getSize(i);
                super.onMeasure(i, i2);
                return;
            case 2:
                pla plaVar = (pla) this.b;
                setMeasuredDimension(plaVar.g, plaVar.h);
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final void setTransform(Matrix matrix) {
        switch (this.a) {
            case 1:
                super.setTransform(matrix);
                td4 td4Var = ((l58) this.b).m0;
                if (td4Var != null) {
                    int width = getWidth();
                    int height = getHeight();
                    xl0 xl0Var = td4Var.J;
                    if (xl0Var != null) {
                        Matrix matrix2 = xl0Var.v;
                        matrix.invert(matrix2);
                        float f = width;
                        float f2 = height;
                        matrix2.preScale(f, f2);
                        matrix2.postScale(1.0f / f, 1.0f / f2);
                        xl0Var.c(matrix2);
                        td4Var.b(false, false, false);
                        return;
                    }
                    return;
                }
                return;
            default:
                super.setTransform(matrix);
                return;
        }
    }
}
