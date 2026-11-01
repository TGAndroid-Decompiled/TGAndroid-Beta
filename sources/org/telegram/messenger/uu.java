package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
public final class uu extends ReplacementSpan {
    public final su f18476a;
    public final TL_iv.textButton f18477b;
    public final RectF f18478c = new RectF();
    public float d;
    public boolean e;
    public int f18479f;
    public View h;

    public uu(org.telegram.messenger.wv r21, int r22, org.telegram.tgnet.tl.TL_iv.textButton r23, java.lang.Boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.uu.<init>(org.telegram.messenger.wv, int, org.telegram.tgnet.tl.TL_iv$textButton, java.lang.Boolean):void");
    }

    public final void a(View view) {
        this.h = view;
        this.f18476a.f18144a.i(view);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15;
        float f10;
        su suVar = this.f18476a;
        int i16 = suVar.f18144a.f18909s;
        int i17 = 0;
        if (i16 > 0 && this.f18479f > 0) {
            i15 = 1;
        } else {
            i15 = 0;
        }
        if (i15 == 0 && i16 > 0 && (charSequence instanceof Spanned)) {
            sv[] svVarArr = (sv[]) ((Spanned) charSequence).getSpans(i10, i11, sv.class);
            int length = svVarArr.length;
            int i18 = 0;
            while (true) {
                if (i18 >= length) {
                    break;
                } else if ((svVarArr[i18].f18167b & 15) == 14) {
                    i15 = 1;
                    break;
                } else {
                    i18++;
                }
            }
        }
        if (i15 != 0) {
            f10 = (i12 + i14) / 2.0f;
        } else {
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            f10 = ((fontMetricsInt.ascent + fontMetricsInt.descent) / 2.0f) + i13;
        }
        canvas.save();
        if (!suVar.f18159s) {
            i17 = i0.L(1.0f);
        }
        int round = Math.round(f7 + i17);
        int ceil = (int) Math.ceil((f10 - (suVar.c() / 2.0f)) + (i15 ^ 1));
        float f11 = round;
        float f12 = ceil;
        this.f18478c.set(f11, f12, round + suVar.e, suVar.c() + ceil);
        canvas.translate(f11, f12);
        suVar.a(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = 0;
        if (this.e && fontMetricsInt != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i12 = fontMetricsInt.top;
        } else {
            i12 = 0;
        }
        if (z10) {
            i13 = fontMetricsInt.ascent;
        } else {
            i13 = 0;
        }
        if (z10) {
            i14 = fontMetricsInt.descent;
        } else {
            i14 = 0;
        }
        if (z10) {
            i15 = fontMetricsInt.bottom;
        } else {
            i15 = 0;
        }
        if (z10) {
            i16 = fontMetricsInt.leading;
        } else {
            i16 = 0;
        }
        int L = i0.L(8.0f);
        int L2 = i0.L(10.0f);
        su suVar = this.f18476a;
        if (fontMetricsInt != null && suVar.f18159s) {
            float f7 = this.d;
            int i18 = (int) (((-L2) - L) * f7);
            fontMetricsInt.top = i18;
            int i19 = (int) ((L2 - L) * f7);
            fontMetricsInt.bottom = i19;
            fontMetricsInt.ascent = i18;
            fontMetricsInt.descent = i19;
            fontMetricsInt.leading = 0;
        }
        if (z10) {
            fontMetricsInt.top = i12;
            fontMetricsInt.ascent = i13;
            fontMetricsInt.descent = i14;
            fontMetricsInt.bottom = i15;
            fontMetricsInt.leading = i16;
            int i20 = this.f18479f;
            int i21 = i14 - i13;
            if (i20 > i21) {
                int i22 = i20 - i21;
                int i23 = (i22 + 1) / 2;
                int i24 = i13 - i23;
                fontMetricsInt.ascent = i24;
                fontMetricsInt.descent = i14 + (i22 - i23);
                fontMetricsInt.top = Math.min(i12, i24);
                fontMetricsInt.bottom = Math.max(fontMetricsInt.bottom, fontMetricsInt.descent);
            }
        }
        int i25 = suVar.e;
        if (!suVar.f18159s) {
            i17 = i0.L(1.0f) * 2;
        }
        return i25 + i17;
    }
}
