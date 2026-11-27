package defpackage;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
public final class rk1 {
    public final long[] a;
    public final CharSequence[] b;
    public final CharSequence[] c;
    public final StaticLayout[] d;
    public final StaticLayout[] e;
    public int f;
    public int g;
    public DecimalFormat h;

    public rk1(long r24, long r26, boolean r28, float r29, int r30, android.text.TextPaint r31, android.text.TextPaint r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rk1.<init>(long, long, boolean, float, int, android.text.TextPaint, android.text.TextPaint):void");
    }

    public final void a(Canvas canvas, int i, int i2, float f, float f2, TextPaint textPaint) {
        StaticLayout[] staticLayoutArr;
        CharSequence[] charSequenceArr;
        StaticLayout[] staticLayoutArr2 = this.e;
        StaticLayout[] staticLayoutArr3 = this.d;
        if (i == 0) {
            staticLayoutArr = staticLayoutArr3;
        } else {
            staticLayoutArr = staticLayoutArr2;
        }
        StaticLayout staticLayout = staticLayoutArr[i2];
        if (staticLayout == null) {
            if (i == 0) {
                charSequenceArr = this.b;
            } else {
                charSequenceArr = this.c;
            }
            CharSequence charSequence = charSequenceArr[i2];
            if (i == 0) {
                staticLayoutArr2 = staticLayoutArr3;
            }
            staticLayout = new StaticLayout(charSequence, textPaint, hl.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            staticLayoutArr2[i2] = staticLayout;
        }
        canvas.save();
        canvas.translate(f, textPaint.ascent() + f2);
        staticLayout.draw(canvas);
        canvas.restore();
    }

    public final CharSequence b(int i, TextPaint textPaint, long j, int i2) {
        int i3 = 2;
        if (i2 == 1) {
            if (i == 1) {
                return "≈" + di0.h().e(j, "USD");
            }
            if (this.h == null) {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                decimalFormatSymbols.setDecimalSeparator('.');
                DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                this.h = decimalFormat;
                decimalFormat.setMinimumFractionDigits(2);
                this.h.setMaximumFractionDigits(6);
                this.h.setGroupingUsed(false);
            }
            DecimalFormat decimalFormat2 = this.h;
            if (j <= 1000000000) {
                i3 = 6;
            }
            decimalFormat2.setMaximumFractionDigits(i3);
            return ij1.L("TON " + this.h.format(j / 1.0E9d), textPaint, 0.8f, -hl.L(0.66f), false);
        } else if (i2 == 2) {
            if (i == 1) {
                return "≈" + di0.h().e(j, "USD");
            }
            return nza.b1(false, "XTR ".concat(ob6.E(j, ' ')), 0.65f, null);
        } else {
            return hl.o0((int) j, 0);
        }
    }
}
