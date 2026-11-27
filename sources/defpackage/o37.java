package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class o37 extends hm {
    public final q37 a;

    public o37(q37 q37Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.a = q37Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        q37 q37Var = this.a;
        int i6 = q37Var.E;
        int i7 = i5 + i3;
        int i8 = this.measuredSize;
        q37Var.c.set((int) f, ik8.g(i7, i8, 2, i6), (int) (f + i8), ((i7 + i8) / 2) + i6);
    }
}
