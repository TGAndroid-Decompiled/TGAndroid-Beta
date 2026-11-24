package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class g37 extends gn {
    public final j37 a;

    public g37(j37 j37Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.a = j37Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6 = i5 + i3;
        int i7 = this.measuredSize;
        this.a.c.set((int) f, (i6 - i7) / 2, (int) (f + i7), (i6 + i7) / 2);
    }
}
