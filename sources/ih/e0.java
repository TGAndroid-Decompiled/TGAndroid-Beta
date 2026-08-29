package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
public final class e0 extends jh.d5 {
    public final Path f9113w0;
    public final float[] f9114x0;
    public final g0 f9115y0;

    public e0(g0 g0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, w wVar, bg.n nVar, bg.n nVar2, bg.n nVar3, bg.n nVar4, bg.n nVar5, bg.n nVar6) {
        super(context, c6Var, wVar, nVar, null, nVar2, nVar3, nVar4, nVar5, nVar6);
        this.f9115y0 = g0Var;
        this.f9113w0 = new Path();
        this.f9114x0 = new float[8];
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f9113w0);
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
    public final void j(int i10) {
        g0 g0Var = this.f9115y0;
        TextView textView = g0Var.X;
        if (textView != null && g6.B1(textView.getBackground(), i10, false)) {
            g0Var.X.invalidate();
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float dp = AndroidUtilities.dp(12.0f);
        float[] fArr = this.f9114x0;
        fArr[3] = dp;
        fArr[2] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        Path path = this.f9113w0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i10, i11, this.f9114x0, Path.Direction.CW);
    }
}
