package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
public final class iu extends ReplacementSpan {
    public final gu f23343a;
    public final TL_iv.textButton f23344b;
    public final RectF f23345c = new RectF();
    public float d;
    public boolean f23346e;
    public int f23347f;
    public View h;

    public iu(org.telegram.messenger.kv r21, int r22, org.telegram.tgnet.tl.TL_iv.textButton r23, java.lang.Boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.iu.<init>(org.telegram.messenger.kv, int, org.telegram.tgnet.tl.TL_iv$textButton, java.lang.Boolean):void");
    }

    public final void a(View view) {
        this.h = view;
        this.f23343a.f22705a.i(view);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int i14;
        float f11;
        gu guVar = this.f23343a;
        int i15 = guVar.f22705a.f23599s;
        int i16 = 0;
        if (i15 > 0 && this.f23347f > 0) {
            i14 = 1;
        } else {
            i14 = 0;
        }
        if (i14 == 0 && i15 > 0 && (charSequence instanceof Spanned)) {
            gv[] gvVarArr = (gv[]) ((Spanned) charSequence).getSpans(i7, i10, gv.class);
            int length = gvVarArr.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    break;
                } else if ((gvVarArr[i17].f22729b & 15) == 14) {
                    i14 = 1;
                    break;
                } else {
                    i17++;
                }
            }
        }
        if (i14 != 0) {
            f11 = (i11 + i13) / 2.0f;
        } else {
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            f11 = ((fontMetricsInt.ascent + fontMetricsInt.descent) / 2.0f) + i12;
        }
        canvas.save();
        if (!guVar.f22721s) {
            i16 = g0.L(1.0f);
        }
        int round = Math.round(f10 + i16);
        int ceil = (int) Math.ceil((f11 - (guVar.c() / 2.0f)) + (i14 ^ 1));
        float f12 = round;
        float f13 = ceil;
        this.f23345c.set(f12, f13, round + guVar.f22708e, guVar.c() + ceil);
        canvas.translate(f12, f13);
        guVar.a(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        boolean z9;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 0;
        if (this.f23346e && fontMetricsInt != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            i11 = fontMetricsInt.top;
        } else {
            i11 = 0;
        }
        if (z9) {
            i12 = fontMetricsInt.ascent;
        } else {
            i12 = 0;
        }
        if (z9) {
            i13 = fontMetricsInt.descent;
        } else {
            i13 = 0;
        }
        if (z9) {
            i14 = fontMetricsInt.bottom;
        } else {
            i14 = 0;
        }
        if (z9) {
            i15 = fontMetricsInt.leading;
        } else {
            i15 = 0;
        }
        int L = g0.L(8.0f);
        int L2 = g0.L(10.0f);
        gu guVar = this.f23343a;
        if (fontMetricsInt != null && guVar.f22721s) {
            float f10 = this.d;
            int i17 = (int) (((-L2) - L) * f10);
            fontMetricsInt.top = i17;
            int i18 = (int) ((L2 - L) * f10);
            fontMetricsInt.bottom = i18;
            fontMetricsInt.ascent = i17;
            fontMetricsInt.descent = i18;
            fontMetricsInt.leading = 0;
        }
        if (z9) {
            fontMetricsInt.top = i11;
            fontMetricsInt.ascent = i12;
            fontMetricsInt.descent = i13;
            fontMetricsInt.bottom = i14;
            fontMetricsInt.leading = i15;
            int i19 = this.f23347f;
            int i20 = i13 - i12;
            if (i19 > i20) {
                int i21 = i19 - i20;
                int i22 = (i21 + 1) / 2;
                int i23 = i12 - i22;
                fontMetricsInt.ascent = i23;
                fontMetricsInt.descent = i13 + (i21 - i22);
                fontMetricsInt.top = Math.min(i11, i23);
                fontMetricsInt.bottom = Math.max(fontMetricsInt.bottom, fontMetricsInt.descent);
            }
        }
        int i24 = guVar.f22708e;
        if (!guVar.f22721s) {
            i16 = g0.L(1.0f) * 2;
        }
        return i24 + i16;
    }
}
