package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;
public final class h00 extends ssa {
    public final Path H0;
    public final float[] I0;
    public final short J0;
    public final m00 K0;

    public h00(m00 m00Var, Context context, ylb ylbVar, f00 f00Var, x10 x10Var, x10 x10Var2, x10 x10Var3, x10 x10Var4, x10 x10Var5, x10 x10Var6, int i) {
        super(context, ylbVar, f00Var, x10Var, null, x10Var2, x10Var3, x10Var4, x10Var5, x10Var6);
        this.K0 = m00Var;
        this.J0 = i;
        this.H0 = new Path();
        this.I0 = new float[8];
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.H0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.b) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final int getFinalHeight() {
        return gm.L(this.J0);
    }

    @Override
    public final float getRealHeight() {
        return gm.L(this.J0);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        j00 j00Var = this.K0.X1;
        if (j00Var != null) {
            j00Var.invalidate();
        }
    }

    @Override
    public final void k(int i) {
        this.K0.X1.setRibbonColor(i);
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float L = gm.L(12.0f);
        float[] fArr = this.I0;
        fArr[3] = L;
        fArr[2] = L;
        fArr[1] = L;
        fArr[0] = L;
        Path path = this.H0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i, i2, this.I0, Path.Direction.CW);
    }
}
