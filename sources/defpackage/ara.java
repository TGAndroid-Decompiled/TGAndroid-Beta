package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
public final class ara extends sua {
    public final float[] H0;
    public final Path I0;
    public final float[] J0;
    public final gra K0;

    public ara(gra graVar, Context context, vnb vnbVar, uoa uoaVar, y00 y00Var, y00 y00Var2, y00 y00Var3, y00 y00Var4, y00 y00Var5, y00 y00Var6) {
        super(context, vnbVar, uoaVar, y00Var, null, y00Var2, y00Var3, y00Var4, y00Var5, y00Var6);
        this.K0 = graVar;
        this.H0 = new float[3];
        this.I0 = new Path();
        this.J0 = new float[8];
    }

    @Override
    public final void d(yta ytaVar) {
        super.d(ytaVar);
        this.K0.d1(true);
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
        return hl.L(315.0f);
    }

    @Override
    public final float getRealHeight() {
        return hl.L(315.0f);
    }

    @Override
    public final void k(int i) {
        gb0[] gb0VarArr;
        gra graVar = this.K0;
        ImageView imageView = graVar.i2;
        ImageView imageView2 = graVar.h2;
        if (imageView2 != null && aob.F1(imageView2.getBackground(), i, false)) {
            imageView2.invalidate();
        }
        if (imageView != null && aob.F1(imageView.getBackground(), i, false)) {
            imageView.invalidate();
        }
        for (gb0 gb0Var : graVar.U1) {
            Drawable background = gb0Var.getBackground();
            in inVar = (in) gb0Var.d;
            if (aob.F1(background, i, false)) {
                gb0Var.invalidate();
            }
            int f = vm2.f(0.33f, i, -1);
            float[] fArr = this.H0;
            Color.colorToHSV(f, fArr);
            fArr[1] = Math.min(1.0f, fArr[1] * 1.1f);
            fArr[2] = Math.min(1.0f, fArr[2] * 1.1f);
            int HSVToColor = Color.HSVToColor(fArr);
            if (inVar.getSizeableBackground() instanceof jua) {
                ((jua) inVar.getSizeableBackground()).b.setColor(HSVToColor);
                inVar.invalidate();
            } else if (aob.F1(inVar.getSizeableBackground(), HSVToColor, false)) {
                inVar.invalidate();
            }
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float L = hl.L(12.0f);
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
