package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
public final class ena extends rqa {
    public final float[] H0;
    public final Path I0;
    public final float[] J0;
    public final kna K0;

    public ena(kna knaVar, Context context, wjb wjbVar, z6a z6aVar, x00 x00Var, x00 x00Var2, x00 x00Var3, x00 x00Var4, x00 x00Var5, x00 x00Var6) {
        super(context, wjbVar, z6aVar, x00Var, null, x00Var2, x00Var3, x00Var4, x00Var5, x00Var6);
        this.K0 = knaVar;
        this.H0 = new float[3];
        this.I0 = new Path();
        this.J0 = new float[8];
    }

    @Override
    public final void d(xpa xpaVar) {
        super.d(xpaVar);
        this.K0.c1(true);
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
        return gl.L(315.0f);
    }

    @Override
    public final float getRealHeight() {
        return gl.L(315.0f);
    }

    @Override
    public final void k(int i) {
        eb0[] eb0VarArr;
        kna knaVar = this.K0;
        ImageView imageView = knaVar.i2;
        ImageView imageView2 = knaVar.h2;
        if (imageView2 != null && bkb.F1(imageView2.getBackground(), i, false)) {
            imageView2.invalidate();
        }
        if (imageView != null && bkb.F1(imageView.getBackground(), i, false)) {
            imageView.invalidate();
        }
        for (eb0 eb0Var : knaVar.U1) {
            Drawable background = eb0Var.getBackground();
            hn hnVar = (hn) eb0Var.d;
            if (bkb.F1(background, i, false)) {
                eb0Var.invalidate();
            }
            int f = bm2.f(0.33f, i, -1);
            float[] fArr = this.H0;
            Color.colorToHSV(f, fArr);
            fArr[1] = Math.min(1.0f, fArr[1] * 1.1f);
            fArr[2] = Math.min(1.0f, fArr[2] * 1.1f);
            int HSVToColor = Color.HSVToColor(fArr);
            if (hnVar.getSizeableBackground() instanceof iqa) {
                ((iqa) hnVar.getSizeableBackground()).b.setColor(HSVToColor);
                hnVar.invalidate();
            } else if (bkb.F1(hnVar.getSizeableBackground(), HSVToColor, false)) {
                hnVar.invalidate();
            }
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float L = gl.L(12.0f);
        float[] fArr = this.J0;
        fArr[3] = L;
        fArr[2] = L;
        fArr[1] = L;
        fArr[0] = L;
        Path path = this.I0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i, i2, this.J0, Path.Direction.CW);
    }
}
