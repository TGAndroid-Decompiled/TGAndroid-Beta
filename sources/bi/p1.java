package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class p1 extends b7 {
    public final float[] D0;
    public final Path E0;
    public final float[] F0;
    public final x1 G0;

    public p1(x1 x1Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, a3.d dVar, bh.f fVar, bh.f fVar2, bh.f fVar3, bh.f fVar4, bh.f fVar5, bh.f fVar6) {
        super(context, u6Var, dVar, fVar, null, fVar2, fVar3, fVar4, fVar5, fVar6);
        this.G0 = x1Var;
        this.D0 = new float[3];
        this.E0 = new Path();
        this.F0 = new float[8];
    }

    @Override
    public final void d(c6 c6Var) {
        super.d(c6Var);
        this.G0.U(true);
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
        return AndroidUtilities.dp(315.0f);
    }

    @Override
    public final float getRealHeight() {
        return AndroidUtilities.dp(315.0f);
    }

    @Override
    public final void k(int i10) {
        t1[] t1VarArr;
        x1 x1Var = this.G0;
        ImageView imageView = x1Var.m0;
        if (imageView != null && org.telegram.ui.ActionBar.y6.E1(imageView.getBackground(), i10, false)) {
            x1Var.m0.invalidate();
        }
        ImageView imageView2 = x1Var.f5654n0;
        if (imageView2 != null && org.telegram.ui.ActionBar.y6.E1(imageView2.getBackground(), i10, false)) {
            x1Var.f5654n0.invalidate();
        }
        for (t1 t1Var : x1Var.Z) {
            Drawable background = t1Var.getBackground();
            org.telegram.ui.Components.s6 s6Var = (org.telegram.ui.Components.s6) t1Var.d;
            if (org.telegram.ui.ActionBar.y6.E1(background, i10, false)) {
                t1Var.invalidate();
            }
            int f7 = i0.a.f(0.33f, i10, -1);
            float[] fArr = this.D0;
            Color.colorToHSV(f7, fArr);
            fArr[1] = Math.min(1.0f, fArr[1] * 1.1f);
            fArr[2] = Math.min(1.0f, fArr[2] * 1.1f);
            int HSVToColor = Color.HSVToColor(fArr);
            if (s6Var.getSizeableBackground() instanceof p6) {
                ((p6) s6Var.getSizeableBackground()).f5231b.setColor(HSVToColor);
                s6Var.invalidate();
            } else if (org.telegram.ui.ActionBar.y6.E1(s6Var.getSizeableBackground(), HSVToColor, false)) {
                s6Var.invalidate();
            }
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float dp = AndroidUtilities.dp(12.0f);
        float[] fArr = this.F0;
        fArr[3] = dp;
        fArr[2] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        Path path = this.E0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i10, i11, this.F0, Path.Direction.CW);
    }
}
