package mh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class b1 extends c5 {
    public final i1 A0;
    public final float[] f13721x0;
    public final Path f13722y0;
    public final float[] f13723z0;

    public b1(i1 i1Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, z0 z0Var, eg.m mVar, eg.m mVar2, eg.m mVar3, eg.m mVar4, eg.m mVar5, eg.m mVar6) {
        super(context, g6Var, z0Var, mVar, null, mVar2, mVar3, mVar4, mVar5, mVar6);
        this.A0 = i1Var;
        this.f13721x0 = new float[3];
        this.f13722y0 = new Path();
        this.f13723z0 = new float[8];
    }

    @Override
    public final void d(c5.d dVar) {
        super.d(dVar);
        this.A0.T(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f13722y0);
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
        eg.t3[] t3VarArr;
        i1 i1Var = this.A0;
        ImageView imageView = i1Var.f14209j0;
        if (imageView != null && org.telegram.ui.ActionBar.k6.B1(imageView.getBackground(), i10, false)) {
            i1Var.f14209j0.invalidate();
        }
        ImageView imageView2 = i1Var.f14210k0;
        if (imageView2 != null && org.telegram.ui.ActionBar.k6.B1(imageView2.getBackground(), i10, false)) {
            i1Var.f14210k0.invalidate();
        }
        for (eg.t3 t3Var : i1Var.W) {
            Drawable background = t3Var.getBackground();
            org.telegram.ui.Components.k6 k6Var = (org.telegram.ui.Components.k6) t3Var.f5496b;
            if (org.telegram.ui.ActionBar.k6.B1(background, i10, false)) {
                t3Var.invalidate();
            }
            int d = i0.a.d(0.33f, i10, -1);
            float[] fArr = this.f13721x0;
            Color.colorToHSV(d, fArr);
            fArr[1] = Math.min(1.0f, fArr[1] * 1.1f);
            fArr[2] = Math.min(1.0f, fArr[2] * 1.1f);
            int HSVToColor = Color.HSVToColor(fArr);
            if (k6Var.getSizeableBackground() instanceof s4) {
                ((s4) k6Var.getSizeableBackground()).f14734b.setColor(HSVToColor);
                k6Var.invalidate();
            } else if (org.telegram.ui.ActionBar.k6.B1(k6Var.getSizeableBackground(), HSVToColor, false)) {
                k6Var.invalidate();
            }
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float dp = AndroidUtilities.dp(12.0f);
        float[] fArr = this.f13723z0;
        fArr[3] = dp;
        fArr[2] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        Path path = this.f13722y0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i10, i11, this.f13723z0, Path.Direction.CW);
    }
}
