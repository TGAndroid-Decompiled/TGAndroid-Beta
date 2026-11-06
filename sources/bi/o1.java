package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
public final class o1 extends e7 {
    public final float[] D0;
    public final Path E0;
    public final float[] F0;
    public final w1 G0;

    public o1(w1 w1Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, a3.f fVar, l1 l1Var, l1 l1Var2, l1 l1Var3, l1 l1Var4, l1 l1Var5, l1 l1Var6) {
        super(context, f6Var, fVar, l1Var, null, l1Var2, l1Var3, l1Var4, l1Var5, l1Var6);
        this.G0 = w1Var;
        this.D0 = new float[3];
        this.E0 = new Path();
        this.F0 = new float[8];
    }

    @Override
    public final void d(g6 g6Var) {
        super.d(g6Var);
        this.G0.h1(true);
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
        return org.telegram.messenger.g0.L(315.0f);
    }

    @Override
    public final float getRealHeight() {
        return org.telegram.messenger.g0.L(315.0f);
    }

    @Override
    public final void k(int i7) {
        s1[] s1VarArr;
        w1 w1Var = this.G0;
        ImageView imageView = w1Var.f4938e2;
        if (imageView != null && org.telegram.ui.ActionBar.k6.H1(imageView.getBackground(), i7, false)) {
            w1Var.f4938e2.invalidate();
        }
        ImageView imageView2 = w1Var.f4939f2;
        if (imageView2 != null && org.telegram.ui.ActionBar.k6.H1(imageView2.getBackground(), i7, false)) {
            w1Var.f4939f2.invalidate();
        }
        for (s1 s1Var : w1Var.R1) {
            Drawable background = s1Var.getBackground();
            org.telegram.ui.Components.j6 j6Var = (org.telegram.ui.Components.j6) s1Var.d;
            if (org.telegram.ui.ActionBar.k6.H1(background, i7, false)) {
                s1Var.invalidate();
            }
            int f10 = i0.a.f(0.33f, i7, -1);
            float[] fArr = this.D0;
            Color.colorToHSV(f10, fArr);
            fArr[1] = Math.min(1.0f, fArr[1] * 1.1f);
            fArr[2] = Math.min(1.0f, fArr[2] * 1.1f);
            int HSVToColor = Color.HSVToColor(fArr);
            if (j6Var.getSizeableBackground() instanceof t6) {
                ((t6) j6Var.getSizeableBackground()).f4750b.setColor(HSVToColor);
                j6Var.invalidate();
            } else if (org.telegram.ui.ActionBar.k6.H1(j6Var.getSizeableBackground(), HSVToColor, false)) {
                j6Var.invalidate();
            }
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        float L = org.telegram.messenger.g0.L(12.0f);
        float[] fArr = this.F0;
        fArr[3] = L;
        fArr[2] = L;
        fArr[1] = L;
        fArr[0] = L;
        Path path = this.E0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i7, i10, this.F0, Path.Direction.CW);
    }
}
