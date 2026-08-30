package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class c1 extends c5 {
    public final j1 A0;
    public final float[] f12201x0;
    public final Path f12202y0;
    public final float[] f12203z0;

    public c1(j1 j1Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, a1 a1Var, dg.m mVar, dg.m mVar2, dg.m mVar3, dg.m mVar4, dg.m mVar5, dg.m mVar6) {
        super(context, f6Var, a1Var, mVar, null, mVar2, mVar3, mVar4, mVar5, mVar6);
        this.A0 = j1Var;
        this.f12201x0 = new float[3];
        this.f12202y0 = new Path();
        this.f12203z0 = new float[8];
    }

    @Override
    public final void d(c5.d dVar) {
        super.d(dVar);
        this.A0.T(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f12202y0);
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
        dg.v3[] v3VarArr;
        j1 j1Var = this.A0;
        ImageView imageView = j1Var.f12645j0;
        if (imageView != null && org.telegram.ui.ActionBar.j6.B1(imageView.getBackground(), i10, false)) {
            j1Var.f12645j0.invalidate();
        }
        ImageView imageView2 = j1Var.f12646k0;
        if (imageView2 != null && org.telegram.ui.ActionBar.j6.B1(imageView2.getBackground(), i10, false)) {
            j1Var.f12646k0.invalidate();
        }
        for (dg.v3 v3Var : j1Var.W) {
            Drawable background = v3Var.getBackground();
            org.telegram.ui.Components.k6 k6Var = (org.telegram.ui.Components.k6) v3Var.f4831b;
            if (org.telegram.ui.ActionBar.j6.B1(background, i10, false)) {
                v3Var.invalidate();
            }
            int d = i0.a.d(0.33f, i10, -1);
            float[] fArr = this.f12201x0;
            Color.colorToHSV(d, fArr);
            fArr[1] = Math.min(1.0f, fArr[1] * 1.1f);
            fArr[2] = Math.min(1.0f, fArr[2] * 1.1f);
            int HSVToColor = Color.HSVToColor(fArr);
            if (k6Var.getSizeableBackground() instanceof s4) {
                ((s4) k6Var.getSizeableBackground()).f13067b.setColor(HSVToColor);
                k6Var.invalidate();
            } else if (org.telegram.ui.ActionBar.j6.B1(k6Var.getSizeableBackground(), HSVToColor, false)) {
                k6Var.invalidate();
            }
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float dp = AndroidUtilities.dp(12.0f);
        float[] fArr = this.f12203z0;
        fArr[3] = dp;
        fArr[2] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        Path path = this.f12202y0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i10, i11, this.f12203z0, Path.Direction.CW);
    }
}
