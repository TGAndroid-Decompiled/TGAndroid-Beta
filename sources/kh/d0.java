package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public final class d0 extends lh.c5 {
    public final Path f10641x0;
    public final float[] f10642y0;
    public final f0 f10643z0;

    public d0(f0 f0Var, Context context, f6 f6Var, v vVar, dg.m mVar, dg.m mVar2, dg.m mVar3, dg.m mVar4, dg.m mVar5, dg.m mVar6) {
        super(context, f6Var, vVar, mVar, null, mVar2, mVar3, mVar4, mVar5, mVar6);
        this.f10643z0 = f0Var;
        this.f10641x0 = new Path();
        this.f10642y0 = new float[8];
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f10641x0);
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
        f0 f0Var = this.f10643z0;
        TextView textView = f0Var.Y;
        if (textView != null && j6.B1(textView.getBackground(), i10, false)) {
            f0Var.Y.invalidate();
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float dp = AndroidUtilities.dp(12.0f);
        float[] fArr = this.f10642y0;
        fArr[3] = dp;
        fArr[2] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        Path path = this.f10641x0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i10, i11, this.f10642y0, Path.Direction.CW);
    }
}
