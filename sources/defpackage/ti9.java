package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
public final class ti9 extends ReplacementSpan {
    public final ri9 a;
    public final TL_iv.textButton b;
    public final RectF c = new RectF();
    public float d;
    public boolean e;
    public int f;
    public View h;

    public ti9(defpackage.uj9 r21, int r22, org.telegram.tgnet.tl.TL_iv.textButton r23, java.lang.Boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ti9.<init>(uj9, int, org.telegram.tgnet.tl.TL_iv$textButton, java.lang.Boolean):void");
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        float f2;
        ri9 ri9Var = this.a;
        int i7 = ri9Var.a.s;
        int i8 = 0;
        if (i7 > 0 && this.f > 0) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        if (i6 == 0 && i7 > 0 && (charSequence instanceof Spanned)) {
            rj9[] rj9VarArr = (rj9[]) ((Spanned) charSequence).getSpans(i, i2, rj9.class);
            int length = rj9VarArr.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                } else if ((rj9VarArr[i9].b & 15) == 14) {
                    i6 = 1;
                    break;
                } else {
                    i9++;
                }
            }
        }
        if (i6 != 0) {
            f2 = (i3 + i5) / 2.0f;
        } else {
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            f2 = ((fontMetricsInt.ascent + fontMetricsInt.descent) / 2.0f) + i4;
        }
        canvas.save();
        if (!ri9Var.s) {
            i8 = gm.L(1.0f);
        }
        int round = Math.round(f + i8);
        int ceil = (int) Math.ceil((f2 - (ri9Var.d() / 2.0f)) + (i6 ^ 1));
        float f3 = round;
        float f4 = ceil;
        this.c.set(f3, f4, round + ri9Var.e, ri9Var.d() + ceil);
        canvas.translate(f3, f4);
        ri9Var.b(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        if (this.e && fontMetricsInt != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i3 = fontMetricsInt.top;
            i4 = fontMetricsInt.ascent;
            i5 = fontMetricsInt.descent;
            i6 = fontMetricsInt.bottom;
            i7 = fontMetricsInt.leading;
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        int L = gm.L(8.0f);
        int L2 = gm.L(10.0f);
        ri9 ri9Var = this.a;
        if (fontMetricsInt != null && ri9Var.s) {
            float f = this.d;
            int i9 = (int) (((-L2) - L) * f);
            fontMetricsInt.top = i9;
            int i10 = (int) ((L2 - L) * f);
            fontMetricsInt.bottom = i10;
            fontMetricsInt.ascent = i9;
            fontMetricsInt.descent = i10;
            fontMetricsInt.leading = 0;
        }
        if (z) {
            fontMetricsInt.top = i3;
            fontMetricsInt.ascent = i4;
            fontMetricsInt.descent = i5;
            fontMetricsInt.bottom = i6;
            fontMetricsInt.leading = i7;
            int i11 = this.f;
            int i12 = i5 - i4;
            if (i11 > i12) {
                int i13 = i11 - i12;
                int i14 = (i13 + 1) / 2;
                int i15 = i4 - i14;
                fontMetricsInt.ascent = i15;
                fontMetricsInt.descent = i5 + (i13 - i14);
                fontMetricsInt.top = Math.min(i3, i15);
                fontMetricsInt.bottom = Math.max(fontMetricsInt.bottom, fontMetricsInt.descent);
            }
        }
        int i16 = ri9Var.e;
        if (!ri9Var.s) {
            i8 = gm.L(1.0f) << 1;
        }
        return i16 + i8;
    }
}
