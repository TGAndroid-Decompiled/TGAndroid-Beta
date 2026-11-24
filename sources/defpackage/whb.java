package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
public final class whb extends ela {
    public final in3 m0;
    public final ylb n0;
    public final uhb o0;

    public whb(Context context, ylb ylbVar, uhb uhbVar) {
        super(context, null);
        this.n0 = ylbVar;
        this.o0 = uhbVar;
        this.m0 = new in3((byte) 7);
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
            RectF rectF = gm.P;
            rectF.set(0.0f, 0.0f, gm.L(45.0f), getHeight());
            this.m0.r(canvas, rectF, 0, 1.0f);
            canvas.restore();
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final ylb getResourceProvider() {
        return this.n0;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(gm.q.x, 1073741824);
        uhb uhbVar = this.o0;
        uhbVar.measure(makeMeasureSpec, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), uhbVar.getMeasuredHeight() + gm.L(24.0f));
    }
}
