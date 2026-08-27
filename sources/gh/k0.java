package gh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class k0 extends hh.e5 {

    public final Path f7371w0;

    public final float[] f7372x0;

    public final int f7373y0;

    public final p0 f7374z0;

    public k0(p0 p0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, f2.r rVar, ag.l2 l2Var, ag.l2 l2Var2, ag.l2 l2Var3, ag.l2 l2Var4, ag.l2 l2Var5, ag.l2 l2Var6, int i10) {
        super(context, c6Var, rVar, l2Var, null, l2Var2, l2Var3, l2Var4, l2Var5, l2Var6);
        this.f7374z0 = p0Var;
        this.f7373y0 = i10;
        this.f7371w0 = new Path();
        this.f7372x0 = new float[8];
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f7371w0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f9174b) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final int getFinalHeight() {
        return AndroidUtilities.dp(this.f7373y0);
    }

    @Override
    public final float getRealHeight() {
        return AndroidUtilities.dp(this.f7373y0);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        m0 m0Var = this.f7374z0.Y;
        if (m0Var != null) {
            m0Var.invalidate();
        }
    }

    @Override
    public final void j(int i10) {
        this.f7374z0.Y.setRibbonColor(i10);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float fDp = AndroidUtilities.dp(12.0f);
        float[] fArr = this.f7372x0;
        fArr[3] = fDp;
        fArr[2] = fDp;
        fArr[1] = fDp;
        fArr[0] = fDp;
        Path path = this.f7371w0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i10, i11, this.f7372x0, Path.Direction.CW);
    }
}
