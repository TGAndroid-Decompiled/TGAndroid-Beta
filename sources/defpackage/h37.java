package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class h37 extends gn {
    public final j37 a;

    public h37(j37 j37Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.a = j37Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        j37 j37Var = this.a;
        int i6 = j37Var.E;
        int i7 = i5 + i3;
        int i8 = this.measuredSize;
        j37Var.c.set((int) f, wi8.g(i7, i8, 2, i6), (int) (f + i8), ((i7 + i8) / 2) + i6);
    }
}
