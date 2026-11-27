package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
public final class gk9 extends ReplacementSpan {
    public final ek9 a;
    public final TL_iv.textButton b;
    public final RectF c = new RectF();
    public float d;
    public boolean e;
    public int f;
    public View h;

    public gk9(defpackage.hl9 r21, int r22, org.telegram.tgnet.tl.TL_iv.textButton r23, java.lang.Boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk9.<init>(hl9, int, org.telegram.tgnet.tl.TL_iv$textButton, java.lang.Boolean):void");
    }

    public final void a(View view) {
        this.h = view;
        this.a.a.i(view);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        float f2;
        ek9 ek9Var = this.a;
        int i7 = ek9Var.a.s;
        int i8 = 0;
        if (i7 > 0 && this.f > 0) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        if (i6 == 0 && i7 > 0 && (charSequence instanceof Spanned)) {
            el9[] el9VarArr = (el9[]) ((Spanned) charSequence).getSpans(i, i2, el9.class);
            int length = el9VarArr.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                } else if ((el9VarArr[i9].b & 15) == 14) {
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
        if (!ek9Var.s) {
            i8 = hl.L(1.0f);
        }
        int round = Math.round(f + i8);
        int ceil = (int) Math.ceil((f2 - (ek9Var.c() / 2.0f)) + (i6 ^ 1));
        float f3 = round;
        float f4 = ceil;
        this.c.set(f3, f4, round + ek9Var.e, ek9Var.c() + ceil);
        canvas.translate(f3, f4);
        ek9Var.a(canvas);
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
        int L = hl.L(8.0f);
        int L2 = hl.L(10.0f);
        ek9 ek9Var = this.a;
        if (fontMetricsInt != null && ek9Var.s) {
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
        int i16 = ek9Var.e;
        if (!ek9Var.s) {
            i8 = hl.L(1.0f) << 1;
        }
        return i16 + i8;
    }
}
