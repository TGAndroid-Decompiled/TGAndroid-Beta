package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class s1 extends e7 {
    public final float[] D0;
    public final Path E0;
    public final float[] F0;
    public final a2 G0;

    public s1(a2 a2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, p1 p1Var, ah.f fVar, ah.f fVar2, ah.f fVar3, ah.f fVar4, ah.f fVar5, ah.f fVar6) {
        super(context, d6Var, p1Var, fVar, null, fVar2, fVar3, fVar4, fVar5, fVar6);
        this.G0 = a2Var;
        this.D0 = new float[3];
        this.E0 = new Path();
        this.F0 = new float[8];
    }

    @Override
    public final void d(g6 g6Var) {
        super.d(g6Var);
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
        w1[] w1VarArr;
        a2 a2Var = this.G0;
        ImageView imageView = a2Var.m0;
        if (imageView != null && org.telegram.ui.ActionBar.h6.C1(imageView.getBackground(), i10, false)) {
            a2Var.m0.invalidate();
        }
        ImageView imageView2 = a2Var.f937n0;
        if (imageView2 != null && org.telegram.ui.ActionBar.h6.C1(imageView2.getBackground(), i10, false)) {
            a2Var.f937n0.invalidate();
        }
        for (w1 w1Var : a2Var.Z) {
            Drawable background = w1Var.getBackground();
            org.telegram.ui.Components.q6 q6Var = (org.telegram.ui.Components.q6) w1Var.d;
            if (org.telegram.ui.ActionBar.h6.C1(background, i10, false)) {
                w1Var.invalidate();
            }
            int f7 = i0.a.f(0.33f, i10, -1);
            float[] fArr = this.D0;
            Color.colorToHSV(f7, fArr);
            fArr[1] = Math.min(1.0f, fArr[1] * 1.1f);
            fArr[2] = Math.min(1.0f, fArr[2] * 1.1f);
            int HSVToColor = Color.HSVToColor(fArr);
            if (q6Var.getSizeableBackground() instanceof t6) {
                ((t6) q6Var.getSizeableBackground()).f2203b.setColor(HSVToColor);
                q6Var.invalidate();
            } else if (org.telegram.ui.ActionBar.h6.C1(q6Var.getSizeableBackground(), HSVToColor, false)) {
                q6Var.invalidate();
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
