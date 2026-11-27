package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
public final class e96 extends ReplacementSpan {
    public final byte a;
    public final Object b;
    public final Paint c;
    public final pkb d;

    public e96(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new RectF();
                this.c = new Paint(1);
                this.d = new pkb(ob6.M0(2131748579, null), 9.0f, hl.o());
                return;
            default:
                this.b = new RectF();
                this.c = new Paint(1);
                this.d = new pkb(ob6.M0(2131748579, null), 8.0f, hl.o());
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        byte b = this.a;
        pkb pkbVar = this.d;
        Object obj = this.b;
        Paint paint2 = this.c;
        switch (b) {
            case 0:
                float L = ((i3 + i5) / 2.0f) + hl.L(0.0f);
                RectF rectF = (RectF) obj;
                rectF.set(f, L - hl.L(6.0f), pkbVar.j() + f + hl.L(8.0f), hl.L(6.0f) + L);
                paint2.setColor(-572850);
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint2);
                this.d.c(hl.L(4.0f) + f, L, 1.0f, -1, canvas);
                return;
            case 1:
                float L2 = ((i3 + i5) / 2.0f) + hl.L(1.33f);
                RectF rectF2 = (RectF) obj;
                rectF2.set(f, L2 - hl.L(7.0f), pkbVar.j() + f + hl.L(12.0f), hl.L(7.0f) + L2);
                paint2.setColor(-572850);
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint2);
                this.d.c(hl.L(6.0f) + f, L2, 1.0f, -1, canvas);
                return;
            default:
                float L3 = ((i3 + i5) / 2.0f) + hl.L(1.0f);
                paint2.setColor(aob.v0(aob.Fi, (vnb) obj));
                RectF rectF3 = hl.P;
                rectF3.set(f, L3 - hl.L(9.0f), hl.L(16.0f) + f + pkbVar.c, hl.L(9.0f) + L3);
                canvas.drawRoundRect(rectF3, hl.L(9.0f), hl.L(9.0f), paint2);
                this.d.c(f + hl.L(8.0f), L3, 1.0f, -1, canvas);
                return;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.a) {
            case 0:
                return (int) (this.d.j() + hl.L(8.0f));
            case 1:
                return (int) (this.d.j() + hl.L(12.0f));
            default:
                return (int) (hl.L(16.0f) + this.d.c);
        }
    }

    public e96(vnb vnbVar) {
        this.a = (byte) 2;
        this.b = vnbVar;
        this.d = new pkb(ob6.M0(2131744894, null), 12.0f, hl.o());
        this.c = new Paint(1);
    }
}
