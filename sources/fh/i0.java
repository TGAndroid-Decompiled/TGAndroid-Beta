package fh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class i0 extends gh.g5 {
    public final Path f6508w0;
    public final float[] f6509x0;
    public final k0 f6510y0;

    public i0(k0 k0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var, a0 a0Var, n nVar, n nVar2, n nVar3, n nVar4, n nVar5, n nVar6) {
        super(context, b6Var, a0Var, nVar, null, nVar2, nVar3, nVar4, nVar5, nVar6);
        this.f6510y0 = k0Var;
        this.f6508w0 = new Path();
        this.f6509x0 = new float[8];
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f6508w0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final int getFinalHeight() {
        return AndroidUtilities.dp(288.0f);
    }

    @Override
    public final float getRealHeight() {
        return AndroidUtilities.dp(288.0f);
    }

    @Override
    public final void j(int i9) {
        k0 k0Var = this.f6510y0;
        TextView textView = k0Var.X;
        if (textView != null && org.telegram.ui.ActionBar.f6.B1(textView.getBackground(), i9, false)) {
            k0Var.X.invalidate();
        }
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        float dp = AndroidUtilities.dp(12.0f);
        float[] fArr = this.f6509x0;
        fArr[3] = dp;
        fArr[2] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        Path path = this.f6508w0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i9, i10, this.f6509x0, Path.Direction.CW);
    }
}
