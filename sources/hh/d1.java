package hh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

public final class d1 extends e5 {

    public final float[] f9111w0;

    public final Path f9112x0;

    public final float[] f9113y0;

    public final l1 f9114z0;

    public d1(l1 l1Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, b1 b1Var, ag.l2 l2Var, ag.l2 l2Var2, ag.l2 l2Var3, ag.l2 l2Var4, ag.l2 l2Var5, ag.l2 l2Var6) {
        super(context, c6Var, b1Var, l2Var, null, l2Var2, l2Var3, l2Var4, l2Var5, l2Var6);
        this.f9114z0 = l1Var;
        this.f9111w0 = new float[3];
        this.f9112x0 = new Path();
        this.f9113y0 = new float[8];
    }

    @Override
    public final void d(j4 j4Var) {
        super.d(j4Var);
        this.f9114z0.T(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f9112x0);
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
        l1 l1Var = this.f9114z0;
        ImageView imageView = l1Var.f9646i0;
        if (imageView != null && org.telegram.ui.ActionBar.g6.B1(imageView.getBackground(), i10, false)) {
            l1Var.f9646i0.invalidate();
        }
        ImageView imageView2 = l1Var.f9647j0;
        if (imageView2 != null && org.telegram.ui.ActionBar.g6.B1(imageView2.getBackground(), i10, false)) {
            l1Var.f9647j0.invalidate();
        }
        for (h1 h1Var : l1Var.V) {
            Drawable background = h1Var.getBackground();
            org.telegram.ui.Components.j6 j6Var = (org.telegram.ui.Components.j6) h1Var.d;
            if (org.telegram.ui.ActionBar.g6.B1(background, i10, false)) {
                h1Var.invalidate();
            }
            int iD = i0.b.d(0.33f, i10, -1);
            float[] fArr = this.f9111w0;
            Color.colorToHSV(iD, fArr);
            fArr[1] = Math.min(1.0f, fArr[1] * 1.1f);
            fArr[2] = Math.min(1.0f, fArr[2] * 1.1f);
            int iHSVToColor = Color.HSVToColor(fArr);
            if (j6Var.getSizeableBackground() instanceof u4) {
                ((u4) j6Var.getSizeableBackground()).f10140b.setColor(iHSVToColor);
                j6Var.invalidate();
            } else if (org.telegram.ui.ActionBar.g6.B1(j6Var.getSizeableBackground(), iHSVToColor, false)) {
                j6Var.invalidate();
            }
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float fDp = AndroidUtilities.dp(12.0f);
        float[] fArr = this.f9113y0;
        fArr[3] = fDp;
        fArr[2] = fDp;
        fArr[1] = fDp;
        fArr[0] = fDp;
        Path path = this.f9112x0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i10, i11, this.f9113y0, Path.Direction.CW);
    }
}
