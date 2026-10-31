package nh;

import android.content.Context;
import android.graphics.Matrix;
import android.os.SystemClock;
import android.view.TextureView;
import android.view.View;
import li.w0;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.oe0;
import org.telegram.ui.Components.x9;
public final class f extends TextureView {
    public final int f13816a;
    public final Object f13817b;

    public f(Object obj, Context context, int i10) {
        super(context);
        this.f13816a = i10;
        this.f13817b = obj;
    }

    @Override
    public void invalidate() {
        w0 w0Var;
        switch (this.f13816a) {
            case 1:
                d50 d50Var = (d50) this.f13817b;
                if (!d50Var.H0 && (w0Var = d50Var.Q) != null && w0Var.f12298a == 3) {
                    d50Var.H0 = true;
                    try {
                        d50Var.F0 = SystemClock.elapsedRealtimeNanos();
                        d50Var.D();
                    } finally {
                        d50Var.H0 = false;
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
    public void onMeasure(int i10, int i11) {
        switch (this.f13816a) {
            case 0:
                h hVar = (h) this.f13817b;
                setMeasuredDimension(hVar.f13833g, hVar.h);
                return;
            case 1:
            default:
                super.onMeasure(i10, i11);
                return;
            case 2:
                View.MeasureSpec.getSize(i10);
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        switch (this.f13816a) {
            case 2:
                super.setTransform(matrix);
                gz gzVar = ((oe0) this.f13817b).f29051l0;
                if (gzVar != null) {
                    int width = getWidth();
                    int height = getHeight();
                    x9 x9Var = gzVar.I;
                    if (x9Var != null) {
                        Matrix matrix2 = x9Var.v;
                        matrix.invert(matrix2);
                        float f7 = width;
                        float f10 = height;
                        matrix2.preScale(f7, f10);
                        matrix2.postScale(1.0f / f7, 1.0f / f10);
                        x9Var.c(matrix2);
                        gzVar.c(false, false, false);
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
