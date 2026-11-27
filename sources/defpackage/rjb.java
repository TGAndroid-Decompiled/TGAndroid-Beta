package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
public final class rjb extends wma {
    public final pm3 g0;
    public final vnb h0;
    public final pjb i0;

    public rjb(Context context, vnb vnbVar, pjb pjbVar) {
        super(context, null);
        this.h0 = vnbVar;
        this.i0 = pjbVar;
        this.g0 = new pm3((byte) 7);
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
        if (view == this.i0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.save();
            RectF rectF = hl.P;
            rectF.set(0.0f, 0.0f, hl.L(45.0f), getHeight());
            this.g0.r(canvas, rectF, 0, 1.0f);
            canvas.restore();
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final vnb getResourceProvider() {
        return this.h0;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(hl.q.x, 1073741824);
        pjb pjbVar = this.i0;
        pjbVar.measure(makeMeasureSpec, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), pjbVar.getMeasuredHeight() + hl.L(24.0f));
    }
}
