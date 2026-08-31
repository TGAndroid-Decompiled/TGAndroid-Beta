package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
public final class d0 extends mh.c5 {
    public final Path f12658x0;
    public final float[] f12659y0;
    public final f0 f12660z0;

    public d0(f0 f0Var, Context context, g6 g6Var, v vVar, eg.m mVar, eg.m mVar2, eg.m mVar3, eg.m mVar4, eg.m mVar5, eg.m mVar6) {
        super(context, g6Var, vVar, mVar, null, mVar2, mVar3, mVar4, mVar5, mVar6);
        this.f12660z0 = f0Var;
        this.f12658x0 = new Path();
        this.f12659y0 = new float[8];
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f12658x0);
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
        f0 f0Var = this.f12660z0;
        TextView textView = f0Var.Y;
        if (textView != null && k6.B1(textView.getBackground(), i10, false)) {
            f0Var.Y.invalidate();
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float dp = AndroidUtilities.dp(12.0f);
        float[] fArr = this.f12659y0;
        fArr[3] = dp;
        fArr[2] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        Path path = this.f12658x0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i10, i11, this.f12659y0, Path.Direction.CW);
    }
}
