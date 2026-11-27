package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;
public final class hz extends sua {
    public final Path H0;
    public final float[] I0;
    public final short J0;
    public final mz K0;

    public hz(mz mzVar, Context context, vnb vnbVar, c1 c1Var, y00 y00Var, y00 y00Var2, y00 y00Var3, y00 y00Var4, y00 y00Var5, y00 y00Var6, int i) {
        super(context, vnbVar, c1Var, y00Var, null, y00Var2, y00Var3, y00Var4, y00Var5, y00Var6);
        this.K0 = mzVar;
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
        return hl.L(this.J0);
    }

    @Override
    public final float getRealHeight() {
        return hl.L(this.J0);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        jz jzVar = this.K0.X1;
        if (jzVar != null) {
            jzVar.invalidate();
        }
    }

    @Override
    public final void k(int i) {
        this.K0.X1.setRibbonColor(i);
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float L = hl.L(12.0f);
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
