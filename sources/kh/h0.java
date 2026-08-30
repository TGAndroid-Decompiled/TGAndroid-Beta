package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class h0 extends lh.c5 {
    public final m0 A0;
    public final Path f10633x0;
    public final float[] f10634y0;
    public final int f10635z0;

    public h0(m0 m0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, ef.e eVar, dg.m mVar, dg.m mVar2, dg.m mVar3, dg.m mVar4, dg.m mVar5, dg.m mVar6, int i10) {
        super(context, f6Var, eVar, mVar, null, mVar2, mVar3, mVar4, mVar5, mVar6);
        this.A0 = m0Var;
        this.f10635z0 = i10;
        this.f10633x0 = new Path();
        this.f10634y0 = new float[8];
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f10633x0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f12215b) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final int getFinalHeight() {
        return AndroidUtilities.dp(this.f10635z0);
    }

    @Override
    public final float getRealHeight() {
        return AndroidUtilities.dp(this.f10635z0);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        j0 j0Var = this.A0.Z;
        if (j0Var != null) {
            j0Var.invalidate();
        }
    }

    @Override
    public final void j(int i10) {
        this.A0.Z.setRibbonColor(i10);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float dp = AndroidUtilities.dp(12.0f);
        float[] fArr = this.f10634y0;
        fArr[3] = dp;
        fArr[2] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        Path path = this.f10633x0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i10, i11, this.f10634y0, Path.Direction.CW);
    }
}
