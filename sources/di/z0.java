package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
public final class z0 extends z5 {
    public final float[] H0;
    public final Path I0;
    public final float[] J0;
    public final h1 K0;

    public z0(h1 h1Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, ca.r rVar, bi.o oVar, bi.o oVar2, bi.o oVar3, bi.o oVar4, bi.o oVar5, bi.o oVar6) {
        super(context, h6Var, rVar, oVar, null, oVar2, oVar3, oVar4, oVar5, oVar6);
        this.K0 = h1Var;
        this.H0 = new float[3];
        this.I0 = new Path();
        this.J0 = new float[8];
    }

    @Override
    public final void d(e5 e5Var) {
        super.d(e5Var);
        this.K0.i1(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.I0);
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
        d1[] d1VarArr;
        h1 h1Var = this.K0;
        ImageView imageView = h1Var.f8933i2;
        if (imageView != null && org.telegram.ui.ActionBar.m6.H1(imageView.getBackground(), i7, false)) {
            h1Var.f8933i2.invalidate();
        }
        ImageView imageView2 = h1Var.f8934j2;
        if (imageView2 != null && org.telegram.ui.ActionBar.m6.H1(imageView2.getBackground(), i7, false)) {
            h1Var.f8934j2.invalidate();
        }
        for (d1 d1Var : h1Var.V1) {
            Drawable background = d1Var.getBackground();
            org.telegram.ui.Components.o6 o6Var = (org.telegram.ui.Components.o6) d1Var.d;
            if (org.telegram.ui.ActionBar.m6.H1(background, i7, false)) {
                d1Var.invalidate();
            }
            int f10 = i0.a.f(0.33f, i7, -1);
            float[] fArr = this.H0;
            Color.colorToHSV(f10, fArr);
            fArr[1] = Math.min(1.0f, fArr[1] * 1.1f);
            fArr[2] = Math.min(1.0f, fArr[2] * 1.1f);
            int HSVToColor = Color.HSVToColor(fArr);
            if (o6Var.getSizeableBackground() instanceof p5) {
                ((p5) o6Var.getSizeableBackground()).f9530b.setColor(HSVToColor);
                o6Var.invalidate();
            } else if (org.telegram.ui.ActionBar.m6.H1(o6Var.getSizeableBackground(), HSVToColor, false)) {
                o6Var.invalidate();
            }
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        float L = org.telegram.messenger.g0.L(12.0f);
        float[] fArr = this.J0;
        fArr[3] = L;
        fArr[2] = L;
        fArr[1] = L;
        fArr[0] = L;
        Path path = this.I0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i7, i10, this.J0, Path.Direction.CW);
    }
}
