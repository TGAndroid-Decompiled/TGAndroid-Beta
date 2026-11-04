package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TextView;
public final class q0 extends ci.f6 {
    public final Path E0;
    public final float[] F0;
    public final s0 G0;

    public q0(s0 s0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, h0 h0Var, t tVar, t tVar2, t tVar3, t tVar4, t tVar5, t tVar6) {
        super(context, e6Var, h0Var, tVar, null, tVar2, tVar3, tVar4, tVar5, tVar6);
        this.G0 = s0Var;
        this.E0 = new Path();
        this.F0 = new float[8];
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.E0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final int getFinalHeight() {
        return org.telegram.messenger.g0.L(288.0f);
    }

    @Override
    public final float getRealHeight() {
        return org.telegram.messenger.g0.L(288.0f);
    }

    @Override
    public final void k(int i3) {
        s0 s0Var = this.G0;
        TextView textView = s0Var.U1;
        if (textView != null && org.telegram.ui.ActionBar.k6.H1(textView.getBackground(), i3, false)) {
            s0Var.U1.invalidate();
        }
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        float L = org.telegram.messenger.g0.L(12.0f);
        float[] fArr = this.F0;
        fArr[3] = L;
        fArr[2] = L;
        fArr[1] = L;
        fArr[0] = L;
        Path path = this.E0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i3, i10, this.F0, Path.Direction.CW);
    }
}
