package jh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class c1 extends d5 {
    public final float[] f11845w0;
    public final Path f11846x0;
    public final float[] f11847y0;
    public final j1 f11848z0;

    public c1(j1 j1Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, a1 a1Var, bg.n nVar, bg.n nVar2, bg.n nVar3, bg.n nVar4, bg.n nVar5, bg.n nVar6) {
        super(context, c6Var, a1Var, nVar, null, nVar2, nVar3, nVar4, nVar5, nVar6);
        this.f11848z0 = j1Var;
        this.f11845w0 = new float[3];
        this.f11846x0 = new Path();
        this.f11847y0 = new float[8];
    }

    @Override
    public final void d(a5.d dVar) {
        super.d(dVar);
        this.f11848z0.T(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f11846x0);
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
    public final void j(int i10) {
        bg.z3[] z3VarArr;
        j1 j1Var = this.f11848z0;
        ImageView imageView = j1Var.f12291i0;
        if (imageView != null && org.telegram.ui.ActionBar.g6.B1(imageView.getBackground(), i10, false)) {
            j1Var.f12291i0.invalidate();
        }
        ImageView imageView2 = j1Var.f12292j0;
        if (imageView2 != null && org.telegram.ui.ActionBar.g6.B1(imageView2.getBackground(), i10, false)) {
            j1Var.f12292j0.invalidate();
        }
        for (bg.z3 z3Var : j1Var.V) {
            Drawable background = z3Var.getBackground();
            org.telegram.ui.Components.o6 o6Var = (org.telegram.ui.Components.o6) z3Var.f2639b;
            if (org.telegram.ui.ActionBar.g6.B1(background, i10, false)) {
                z3Var.invalidate();
            }
            int d = i0.a.d(0.33f, i10, -1);
            float[] fArr = this.f11845w0;
            Color.colorToHSV(d, fArr);
            fArr[1] = Math.min(1.0f, fArr[1] * 1.1f);
            fArr[2] = Math.min(1.0f, fArr[2] * 1.1f);
            int HSVToColor = Color.HSVToColor(fArr);
            if (o6Var.getSizeableBackground() instanceof t4) {
                ((t4) o6Var.getSizeableBackground()).f12839b.setColor(HSVToColor);
                o6Var.invalidate();
            } else if (org.telegram.ui.ActionBar.g6.B1(o6Var.getSizeableBackground(), HSVToColor, false)) {
                o6Var.invalidate();
            }
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float dp = AndroidUtilities.dp(12.0f);
        float[] fArr = this.f11847y0;
        fArr[3] = dp;
        fArr[2] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        Path path = this.f11846x0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i10, i11, this.f11847y0, Path.Direction.CW);
    }
}
