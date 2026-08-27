package gh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

public final class g0 extends hh.e5 {

    public final Path f7258w0;

    public final float[] f7259x0;

    public final i0 f7260y0;

    public g0(i0 i0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, y yVar, ag.l2 l2Var, ag.l2 l2Var2, ag.l2 l2Var3, ag.l2 l2Var4, ag.l2 l2Var5, ag.l2 l2Var6) {
        super(context, c6Var, yVar, l2Var, null, l2Var2, l2Var3, l2Var4, l2Var5, l2Var6);
        this.f7260y0 = i0Var;
        this.f7258w0 = new Path();
        this.f7259x0 = new float[8];
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f7258w0);
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
        i0 i0Var = this.f7260y0;
        TextView textView = i0Var.X;
        if (textView == null || !org.telegram.ui.ActionBar.g6.B1(textView.getBackground(), i10, false)) {
            return;
        }
        i0Var.X.invalidate();
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float fDp = AndroidUtilities.dp(12.0f);
        float[] fArr = this.f7259x0;
        fArr[3] = fDp;
        fArr[2] = fDp;
        fArr[1] = fDp;
        fArr[0] = fDp;
        Path path = this.f7258w0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i10, i11, this.f7259x0, Path.Direction.CW);
    }
}
