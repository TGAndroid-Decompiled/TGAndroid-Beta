package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
public final class h0 extends mh.c5 {
    public final m0 A0;
    public final Path f12788x0;
    public final float[] f12789y0;
    public final int f12790z0;

    public h0(m0 m0Var, Context context, g6 g6Var, eh.m mVar, eg.m mVar2, eg.m mVar3, eg.m mVar4, eg.m mVar5, eg.m mVar6, eg.m mVar7, int i10) {
        super(context, g6Var, mVar, mVar2, null, mVar3, mVar4, mVar5, mVar6, mVar7);
        this.A0 = m0Var;
        this.f12790z0 = i10;
        this.f12788x0 = new Path();
        this.f12789y0 = new float[8];
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f12788x0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f13799b) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final int getFinalHeight() {
        return AndroidUtilities.dp(this.f12790z0);
    }

    @Override
    public final float getRealHeight() {
        return AndroidUtilities.dp(this.f12790z0);
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
        float[] fArr = this.f12789y0;
        fArr[3] = dp;
        fArr[2] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        Path path = this.f12788x0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i10, i11, this.f12789y0, Path.Direction.CW);
    }
}
