package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
public final class vfb extends cja {
    public final xl3 m0;
    public final wjb n0;
    public final tfb o0;

    public vfb(Context context, wjb wjbVar, tfb tfbVar) {
        super(context, null);
        this.n0 = wjbVar;
        this.o0 = tfbVar;
        this.m0 = new xl3((byte) 7);
    }

    @Override
    public final boolean O() {
        return false;
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.o0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.save();
            RectF rectF = gl.P;
            rectF.set(0.0f, 0.0f, gl.L(45.0f), getHeight());
            this.m0.s(canvas, rectF, 0, 1.0f);
            canvas.restore();
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final wjb getResourceProvider() {
        return this.n0;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(gl.q.x, 1073741824);
        tfb tfbVar = this.o0;
        tfbVar.measure(makeMeasureSpec, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), tfbVar.getMeasuredHeight() + gl.L(24.0f));
    }
}
