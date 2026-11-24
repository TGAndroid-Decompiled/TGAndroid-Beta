package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
public final class a96 extends ReplacementSpan {
    public final byte a;
    public final Object b;
    public final Paint c;
    public final uib d;

    public a96(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new RectF();
                this.c = new Paint(1);
                this.d = new uib(jb6.M0(2131748582, null), 9.0f, gm.o());
                return;
            default:
                this.b = new RectF();
                this.c = new Paint(1);
                this.d = new uib(jb6.M0(2131748582, null), 8.0f, gm.o());
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        byte b = this.a;
        uib uibVar = this.d;
        Object obj = this.b;
        Paint paint2 = this.c;
        switch (b) {
            case 0:
                float L = ((i3 + i5) / 2.0f) + gm.L(0.0f);
                RectF rectF = (RectF) obj;
                rectF.set(f, L - gm.L(6.0f), uibVar.j() + f + gm.L(8.0f), gm.L(6.0f) + L);
                paint2.setColor(-572850);
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint2);
                this.d.c(gm.L(4.0f) + f, L, 1.0f, -1, canvas);
                return;
            case 1:
                float L2 = ((i3 + i5) / 2.0f) + gm.L(1.33f);
                RectF rectF2 = (RectF) obj;
                rectF2.set(f, L2 - gm.L(7.0f), uibVar.j() + f + gm.L(12.0f), gm.L(7.0f) + L2);
                paint2.setColor(-572850);
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint2);
                this.d.c(gm.L(6.0f) + f, L2, 1.0f, -1, canvas);
                return;
            default:
                float L3 = ((i3 + i5) / 2.0f) + gm.L(1.0f);
                paint2.setColor(cmb.v0(cmb.Ei, (ylb) obj));
                RectF rectF3 = gm.P;
                rectF3.set(f, L3 - gm.L(9.0f), gm.L(16.0f) + f + uibVar.c, gm.L(9.0f) + L3);
                canvas.drawRoundRect(rectF3, gm.L(9.0f), gm.L(9.0f), paint2);
                this.d.c(f + gm.L(8.0f), L3, 1.0f, -1, canvas);
                return;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.a) {
            case 0:
                return (int) (this.d.j() + gm.L(8.0f));
            case 1:
                return (int) (this.d.j() + gm.L(12.0f));
            default:
                return (int) (gm.L(16.0f) + this.d.c);
        }
    }

    public a96(ylb ylbVar) {
        this.a = (byte) 2;
        this.b = ylbVar;
        this.d = new uib(jb6.M0(2131744926, null), 12.0f, gm.o());
        this.c = new Paint(1);
    }
}
