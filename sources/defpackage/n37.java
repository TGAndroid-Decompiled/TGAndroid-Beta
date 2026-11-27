package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class n37 extends hm {
    public final q37 a;

    public n37(q37 q37Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.a = q37Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6 = i5 + i3;
        int i7 = this.measuredSize;
        this.a.c.set((int) f, (i6 - i7) / 2, (int) (f + i7), (i6 + i7) / 2);
    }
}
