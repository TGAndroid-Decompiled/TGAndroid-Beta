package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
public final class te8 extends gb2 {
    public final Path Ld;
    public final Paint Md;
    public final byte[] Nd;
    public final int Od;
    public final int Pd;
    public final ve8 Qd;

    public te8(ve8 ve8Var, Context context, int i, wjb wjbVar, byte[] bArr, int i2, int i3) {
        super(context, i, false, null, wjbVar);
        this.Qd = ve8Var;
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
        this.U4 = (-gl.L(7.0f)) * this.Qd.E;
        super.j1(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        canvas.save();
        int Y1 = Y1(this.Nd);
        float X1 = X1(Y1);
        float W1 = W1(Y1);
        RectF rectF = gl.P;
        rectF.set(getPollButtonsLeft(), X1, getPollButtonsRight(), W1);
        float f2 = rectF.top;
        float L = gl.L(3.0f);
        ve8 ve8Var = this.Qd;
        if (ve8Var.W) {
            f = -gl.L(3.0f);
        } else {
            f = 0.0f;
        }
        rectF.top = gl.R1(L, f, ve8Var.E) + f2;
        float f3 = rectF.bottom;
        boolean z = ve8Var.W;
        float L2 = gl.L(3.0f);
        if (!z) {
            L2 = gl.R1(L2, 0.0f, ve8Var.E);
        }
        rectF.bottom = f3 + L2;
        Path path = this.Ld;
        path.rewind();
        path.addRoundRect(rectF, gl.L(8.0f), gl.L(8.0f), Path.Direction.CW);
        Paint paint = this.Md;
        paint.setColor(0);
        paint.setShadowLayer(gl.L(2.0f), 0.0f, gl.L(0.66f), bkb.p1(ve8Var.E * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, gl.L(8.0f), gl.L(8.0f), paint);
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
