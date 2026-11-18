package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;
public final class o0 extends di.z5 {
    public final Path H0;
    public final float[] I0;
    public final int J0;
    public final t0 K0;

    public o0(t0 t0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, a3.f fVar, o oVar, o oVar2, o oVar3, o oVar4, o oVar5, o oVar6, int i7) {
        super(context, i6Var, fVar, oVar, null, oVar2, oVar3, oVar4, oVar5, oVar6);
        this.K0 = t0Var;
        this.J0 = i7;
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f10124b) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final int getFinalHeight() {
        return org.telegram.messenger.g0.L(this.J0);
    }

    @Override
    public final float getRealHeight() {
        return org.telegram.messenger.g0.L(this.J0);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        q0 q0Var = this.K0.Y1;
        if (q0Var != null) {
            q0Var.invalidate();
        }
    }

    @Override
    public final void k(int i7) {
        this.K0.Y1.setRibbonColor(i7);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        float L = org.telegram.messenger.g0.L(12.0f);
        float[] fArr = this.I0;
        fArr[3] = L;
        fArr[2] = L;
        fArr[1] = L;
        fArr[0] = L;
        Path path = this.H0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i7, i10, this.I0, Path.Direction.CW);
    }
}
