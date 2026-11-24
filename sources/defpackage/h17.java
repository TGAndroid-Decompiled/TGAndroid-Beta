package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class h17 extends gm {
    public final j17 a;

    public h17(j17 j17Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.a = j17Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        j17 j17Var = this.a;
        int i6 = j17Var.E;
        int i7 = i5 + i3;
        int i8 = this.measuredSize;
        j17Var.c.set((int) f, ug8.g(i7, i8, 2, i6), (int) (f + i8), ((i7 + i8) / 2) + i6);
    }
}
