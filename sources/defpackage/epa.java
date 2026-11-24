package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
public final class epa extends ssa {
    public final float[] H0;
    public final Path I0;
    public final float[] J0;
    public final kpa K0;

    public epa(kpa kpaVar, Context context, ylb ylbVar, c0a c0aVar, x10 x10Var, x10 x10Var2, x10 x10Var3, x10 x10Var4, x10 x10Var5, x10 x10Var6) {
        super(context, ylbVar, c0aVar, x10Var, null, x10Var2, x10Var3, x10Var4, x10Var5, x10Var6);
        this.K0 = kpaVar;
        this.H0 = new float[3];
        this.I0 = new Path();
        this.J0 = new float[8];
    }

    @Override
    public final void d(xra xraVar) {
        super.d(xraVar);
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
        return gm.L(315.0f);
    }

    @Override
    public final float getRealHeight() {
        return gm.L(315.0f);
    }

    @Override
    public final void k(int i) {
        ec0[] ec0VarArr;
        kpa kpaVar = this.K0;
        ImageView imageView = kpaVar.i2;
        ImageView imageView2 = kpaVar.h2;
        if (imageView2 != null && cmb.F1(imageView2.getBackground(), i, false)) {
            imageView2.invalidate();
        }
        if (imageView != null && cmb.F1(imageView.getBackground(), i, false)) {
            imageView.invalidate();
        }
        for (ec0 ec0Var : kpaVar.U1) {
            Drawable background = ec0Var.getBackground();
            io ioVar = (io) ec0Var.d;
            if (cmb.F1(background, i, false)) {
                ec0Var.invalidate();
            }
            int f = on2.f(0.33f, i, -1);
            float[] fArr = this.H0;
            Color.colorToHSV(f, fArr);
            fArr[1] = Math.min(1.0f, fArr[1] * 1.1f);
            fArr[2] = Math.min(1.0f, fArr[2] * 1.1f);
            int HSVToColor = Color.HSVToColor(fArr);
            if (ioVar.getSizeableBackground() instanceof isa) {
                ((isa) ioVar.getSizeableBackground()).b.setColor(HSVToColor);
                ioVar.invalidate();
            } else if (cmb.F1(ioVar.getSizeableBackground(), HSVToColor, false)) {
                ioVar.invalidate();
            }
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float L = gm.L(12.0f);
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
