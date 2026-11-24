package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
public final class vg8 extends rc2 {
    public final Path Ld;
    public final Paint Md;
    public final byte[] Nd;
    public final int Od;
    public final int Pd;
    public final xg8 Qd;

    public vg8(xg8 xg8Var, Context context, int i, ylb ylbVar, byte[] bArr, int i2, int i3) {
        super(context, i, false, null, ylbVar);
        this.Qd = xg8Var;
        this.Nd = bArr;
        this.Od = i2;
        this.Pd = i3;
        this.Ld = new Path();
        this.Md = new Paint(1);
    }

    @Override
    public final void j1(Canvas canvas) {
        this.S4 = 0;
        this.T4 = this.Q4.size() - 1;
        this.U4 = (-gm.L(7.0f)) * this.Qd.E;
        super.j1(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        canvas.save();
        int Y1 = Y1(this.Nd);
        float X1 = X1(Y1);
        float W1 = W1(Y1);
        RectF rectF = gm.P;
        rectF.set(getPollButtonsLeft(), X1, getPollButtonsRight(), W1);
        float f2 = rectF.top;
        float L = gm.L(3.0f);
        xg8 xg8Var = this.Qd;
        if (xg8Var.W) {
            f = -gm.L(3.0f);
        } else {
            f = 0.0f;
        }
        rectF.top = gm.R1(L, f, xg8Var.E) + f2;
        float f3 = rectF.bottom;
        boolean z = xg8Var.W;
        float L2 = gm.L(3.0f);
        if (!z) {
            L2 = gm.R1(L2, 0.0f, xg8Var.E);
        }
        rectF.bottom = f3 + L2;
        Path path = this.Ld;
        path.rewind();
        path.addRoundRect(rectF, gm.L(8.0f), gm.L(8.0f), Path.Direction.CW);
        Paint paint = this.Md;
        paint.setColor(0);
        paint.setShadowLayer(gm.L(2.0f), 0.0f, gm.L(0.66f), cmb.p1(xg8Var.E * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, gm.L(8.0f), gm.L(8.0f), paint);
        canvas.clipPath(path);
        d1(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(this.Od, this.Pd);
    }

    @Override
    public final void setPressed(boolean z) {
    }
}
