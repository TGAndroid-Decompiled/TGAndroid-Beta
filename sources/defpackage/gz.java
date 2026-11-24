package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;
public final class gz extends rqa {
    public final Path H0;
    public final float[] I0;
    public final short J0;
    public final lz K0;

    public gz(lz lzVar, Context context, wjb wjbVar, b1 b1Var, x00 x00Var, x00 x00Var2, x00 x00Var3, x00 x00Var4, x00 x00Var5, x00 x00Var6, int i) {
        super(context, wjbVar, b1Var, x00Var, null, x00Var2, x00Var3, x00Var4, x00Var5, x00Var6);
        this.K0 = lzVar;
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
        return gl.L(this.J0);
    }

    @Override
    public final float getRealHeight() {
        return gl.L(this.J0);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        iz izVar = this.K0.X1;
        if (izVar != null) {
            izVar.invalidate();
        }
    }

    @Override
    public final void k(int i) {
        this.K0.X1.setRibbonColor(i);
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float L = gl.L(12.0f);
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
