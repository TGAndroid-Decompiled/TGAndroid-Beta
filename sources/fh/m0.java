package fh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class m0 extends gh.g5 {
    public final Path f6612w0;
    public final float[] f6613x0;
    public final int f6614y0;
    public final r0 f6615z0;

    public m0(r0 r0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var, af.e eVar, n nVar, n nVar2, n nVar3, n nVar4, n nVar5, n nVar6, int i9) {
        super(context, b6Var, eVar, nVar, null, nVar2, nVar3, nVar4, nVar5, nVar6);
        this.f6615z0 = r0Var;
        this.f6614y0 = i9;
        this.f6612w0 = new Path();
        this.f6613x0 = new float[8];
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f6612w0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f8108b) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final int getFinalHeight() {
        return AndroidUtilities.dp(this.f6614y0);
    }

    @Override
    public final float getRealHeight() {
        return AndroidUtilities.dp(this.f6614y0);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        o0 o0Var = this.f6615z0.Y;
        if (o0Var != null) {
            o0Var.invalidate();
        }
    }

    @Override
    public final void j(int i9) {
        this.f6615z0.Y.setRibbonColor(i9);
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        float dp = AndroidUtilities.dp(12.0f);
        float[] fArr = this.f6613x0;
        fArr[3] = dp;
        fArr[2] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        Path path = this.f6612w0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i9, i10, this.f6613x0, Path.Direction.CW);
    }
}
