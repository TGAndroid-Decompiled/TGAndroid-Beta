package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
public final class a1 extends w5 {
    public final float[] E0;
    public final Path F0;
    public final float[] G0;
    public final i1 H0;

    public a1(i1 i1Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, ch.w wVar, bi.o oVar, bi.o oVar2, bi.o oVar3, bi.o oVar4, bi.o oVar5, bi.o oVar6) {
        super(context, e6Var, wVar, oVar, null, oVar2, oVar3, oVar4, oVar5, oVar6);
        this.H0 = i1Var;
        this.E0 = new float[3];
        this.F0 = new Path();
        this.G0 = new float[8];
    }

    @Override
    public final void d(b5 b5Var) {
        super.d(b5Var);
        this.H0.h1(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.F0);
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
        e1[] e1VarArr;
        i1 i1Var = this.H0;
        ImageView imageView = i1Var.f8770i2;
        if (imageView != null && org.telegram.ui.ActionBar.j6.H1(imageView.getBackground(), i7, false)) {
            i1Var.f8770i2.invalidate();
        }
        ImageView imageView2 = i1Var.f8771j2;
        if (imageView2 != null && org.telegram.ui.ActionBar.j6.H1(imageView2.getBackground(), i7, false)) {
            i1Var.f8771j2.invalidate();
        }
        for (e1 e1Var : i1Var.V1) {
            Drawable background = e1Var.getBackground();
            org.telegram.ui.Components.h6 h6Var = (org.telegram.ui.Components.h6) e1Var.d;
            if (org.telegram.ui.ActionBar.j6.H1(background, i7, false)) {
                e1Var.invalidate();
            }
            int f10 = i0.a.f(0.33f, i7, -1);
            float[] fArr = this.E0;
            Color.colorToHSV(f10, fArr);
            fArr[1] = Math.min(1.0f, fArr[1] * 1.1f);
            fArr[2] = Math.min(1.0f, fArr[2] * 1.1f);
            int HSVToColor = Color.HSVToColor(fArr);
            if (h6Var.getSizeableBackground() instanceof m5) {
                ((m5) h6Var.getSizeableBackground()).f9057b.setColor(HSVToColor);
                h6Var.invalidate();
            } else if (org.telegram.ui.ActionBar.j6.H1(h6Var.getSizeableBackground(), HSVToColor, false)) {
                h6Var.invalidate();
            }
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        float L = org.telegram.messenger.g0.L(12.0f);
        float[] fArr = this.G0;
        fArr[3] = L;
        fArr[2] = L;
        fArr[1] = L;
        fArr[0] = L;
        Path path = this.F0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i7, i10, this.G0, Path.Direction.CW);
    }
}
