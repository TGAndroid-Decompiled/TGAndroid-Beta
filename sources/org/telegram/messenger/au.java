package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
public final class au extends ReplacementSpan {
    public final yt f21585a;
    public final TL_iv.textButton f21586b;
    public final RectF f21587c = new RectF();
    public float d;
    public boolean f21588e;
    public int f21589f;
    public View h;

    public au(org.telegram.messenger.cv r21, int r22, org.telegram.tgnet.tl.TL_iv.textButton r23, java.lang.Boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.au.<init>(org.telegram.messenger.cv, int, org.telegram.tgnet.tl.TL_iv$textButton, java.lang.Boolean):void");
    }

    public final void a(View view) {
        this.h = view;
        this.f21585a.f26633a.i(view);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int i14;
        float f11;
        yt ytVar = this.f21585a;
        int i15 = ytVar.f26633a.f21894s;
        int i16 = 0;
        if (i15 > 0 && this.f21589f > 0) {
            i14 = 1;
        } else {
            i14 = 0;
        }
        if (i14 == 0 && i15 > 0 && (charSequence instanceof Spanned)) {
            yu[] yuVarArr = (yu[]) ((Spanned) charSequence).getSpans(i3, i10, yu.class);
            int length = yuVarArr.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    break;
                } else if ((yuVarArr[i17].f26657b & 15) == 14) {
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
        if (!ytVar.f26649s) {
            i16 = g0.L(1.0f);
        }
        int round = Math.round(f10 + i16);
        int ceil = (int) Math.ceil((f11 - (ytVar.c() / 2.0f)) + (i14 ^ 1));
        float f12 = round;
        float f13 = ceil;
        this.f21587c.set(f12, f13, round + ytVar.f26636e, ytVar.c() + ceil);
        canvas.translate(f12, f13);
        ytVar.a(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i10, Paint.FontMetricsInt fontMetricsInt) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 0;
        if (this.f21588e && fontMetricsInt != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i11 = fontMetricsInt.top;
        } else {
            i11 = 0;
        }
        if (z10) {
            i12 = fontMetricsInt.ascent;
        } else {
            i12 = 0;
        }
        if (z10) {
            i13 = fontMetricsInt.descent;
        } else {
            i13 = 0;
        }
        if (z10) {
            i14 = fontMetricsInt.bottom;
        } else {
            i14 = 0;
        }
        if (z10) {
            i15 = fontMetricsInt.leading;
        } else {
            i15 = 0;
        }
        int L = g0.L(8.0f);
        int L2 = g0.L(10.0f);
        yt ytVar = this.f21585a;
        if (fontMetricsInt != null && ytVar.f26649s) {
            float f10 = this.d;
            int i17 = (int) (((-L2) - L) * f10);
            fontMetricsInt.top = i17;
            int i18 = (int) ((L2 - L) * f10);
            fontMetricsInt.bottom = i18;
            fontMetricsInt.ascent = i17;
            fontMetricsInt.descent = i18;
            fontMetricsInt.leading = 0;
        }
        if (z10) {
            fontMetricsInt.top = i11;
            fontMetricsInt.ascent = i12;
            fontMetricsInt.descent = i13;
            fontMetricsInt.bottom = i14;
            fontMetricsInt.leading = i15;
            int i19 = this.f21589f;
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
        int i24 = ytVar.f26636e;
        if (!ytVar.f26649s) {
            i16 = g0.L(1.0f) * 2;
        }
        return i24 + i16;
    }
}
