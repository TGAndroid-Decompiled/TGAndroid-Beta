package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.os.SystemClock;
import android.view.TextureView;
import android.view.View;
import org.telegram.ui.Components.q;
public final class rq5 extends TextureView {
    public final byte a;
    public final Object b;

    public rq5(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void invalidate() {
        tn9 tn9Var;
        switch (this.a) {
            case 0:
                q qVar = (q) this.b;
                if (!qVar.K0 && (tn9Var = qVar.S) != null && tn9Var.a == 3) {
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
                qna qnaVar = (qna) this.b;
                setMeasuredDimension(qnaVar.g, qnaVar.h);
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
                uf4 uf4Var = ((n78) this.b).m0;
                if (uf4Var != null) {
                    int width = getWidth();
                    int height = getHeight();
                    xm0 xm0Var = uf4Var.J;
                    if (xm0Var != null) {
                        Matrix matrix2 = xm0Var.v;
                        matrix.invert(matrix2);
                        float f = width;
                        float f2 = height;
                        matrix2.preScale(f, f2);
                        matrix2.postScale(1.0f / f, 1.0f / f2);
                        xm0Var.c(matrix2);
                        uf4Var.b(false, false, false);
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
