package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
public final class itb extends wb2 {
    public final Path Ld;
    public final Paint Md;
    public final int Nd;
    public final int Od;
    public final int Pd;
    public final ktb Qd;

    public itb(ktb ktbVar, Context context, int i, vnb vnbVar, int i2, int i3, int i4) {
        super(context, i, false, null, vnbVar);
        this.Qd = ktbVar;
        this.Nd = i2;
        this.Od = i3;
        this.Pd = i4;
        this.Ld = new Path();
        this.Md = new Paint(1);
    }

    @Override
    public final void j1(Canvas canvas) {
        this.S4 = 0;
        this.T4 = this.Q4.size() - 1;
        super.j1(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        int e2 = e2(this.Nd);
        float X1 = X1(e2);
        float W1 = W1(e2);
        RectF rectF = hl.P;
        rectF.set(getPollButtonsLeft(), X1, getPollButtonsRight(), W1);
        Path path = this.Ld;
        path.rewind();
        path.addRoundRect(rectF, hl.L(8.0f), hl.L(8.0f), Path.Direction.CW);
        Paint paint = this.Md;
        paint.setColor(0);
        paint.setShadowLayer(hl.L(2.0f), 0.0f, hl.L(0.66f), aob.p1(this.Qd.y * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, hl.L(8.0f), hl.L(8.0f), paint);
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
