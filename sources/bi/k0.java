package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TextView;
public final class k0 extends di.z5 {
    public final Path H0;
    public final float[] I0;
    public final m0 J0;

    public k0(m0 m0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, b0 b0Var, o oVar, o oVar2, o oVar3, o oVar4, o oVar5, o oVar6) {
        super(context, h6Var, b0Var, oVar, null, oVar2, oVar3, oVar4, oVar5, oVar6);
        this.J0 = m0Var;
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
    public final int getFinalHeight() {
        return org.telegram.messenger.g0.L(288.0f);
    }

    @Override
    public final float getRealHeight() {
        return org.telegram.messenger.g0.L(288.0f);
    }

    @Override
    public final void k(int i7) {
        m0 m0Var = this.J0;
        TextView textView = m0Var.X1;
        if (textView != null && org.telegram.ui.ActionBar.m6.H1(textView.getBackground(), i7, false)) {
            m0Var.X1.invalidate();
        }
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
