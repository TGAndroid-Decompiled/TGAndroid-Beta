package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class auc extends ReplacementSpan {
    public final String a;
    public final String b;
    public final boolean c;
    public float d;
    public int e;
    public int f;
    public cuc h;
    public cuc n;
    public final duc r;

    public auc(duc ducVar, String str, boolean z, boolean z2) {
        String str2;
        this.r = ducVar;
        this.a = str;
        if (z) {
            str2 = ducVar.Q;
        } else {
            str2 = "";
        }
        this.b = str2;
        this.c = z2;
    }

    public final int a() {
        int i = this.e;
        return Math.round((duc.T.getInterpolation(this.r.J) * (this.f - i)) + i);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Canvas canvas2;
        Paint paint2;
        int i6;
        float textSize = paint.getTextSize();
        if (this.c) {
            paint.setTextSize((28.0f * textSize) / 44.0f);
        }
        float f2 = f - this.d;
        cuc cucVar = this.n;
        if (cucVar != null) {
            paint2 = paint;
            i6 = i4;
            canvas2 = canvas;
            cucVar.b(canvas2, paint2, this.b, f2, i6);
        } else {
            canvas2 = canvas;
            paint2 = paint;
            i6 = i4;
        }
        this.h.b(canvas2, paint2, this.a, f2, i6);
        paint2.setTextSize(textSize);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            paint.getFontMetricsInt(fontMetricsInt);
        }
        return a();
    }
}
