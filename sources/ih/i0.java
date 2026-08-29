package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class i0 extends jh.d5 {
    public final Path f9232w0;
    public final float[] f9233x0;
    public final int f9234y0;
    public final n0 f9235z0;

    public i0(n0 n0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, cg.m2 m2Var, bg.n nVar, bg.n nVar2, bg.n nVar3, bg.n nVar4, bg.n nVar5, bg.n nVar6, int i10) {
        super(context, c6Var, m2Var, nVar, null, nVar2, nVar3, nVar4, nVar5, nVar6);
        this.f9235z0 = n0Var;
        this.f9234y0 = i10;
        this.f9232w0 = new Path();
        this.f9233x0 = new float[8];
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f9232w0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f11907b) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final int getFinalHeight() {
        return AndroidUtilities.dp(this.f9234y0);
    }

    @Override
    public final float getRealHeight() {
        return AndroidUtilities.dp(this.f9234y0);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        k0 k0Var = this.f9235z0.Y;
        if (k0Var != null) {
            k0Var.invalidate();
        }
    }

    @Override
    public final void j(int i10) {
        this.f9235z0.Y.setRibbonColor(i10);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float dp = AndroidUtilities.dp(12.0f);
        float[] fArr = this.f9233x0;
        fArr[3] = dp;
        fArr[2] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        Path path = this.f9232w0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i10, i11, this.f9233x0, Path.Direction.CW);
    }
}
