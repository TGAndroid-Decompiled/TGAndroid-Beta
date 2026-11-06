package ng;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import bi.dd;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import org.telegram.messenger.g0;
import org.telegram.messenger.r1;
import org.telegram.ui.zd;
public final class d {
    public final long[] f20548a;
    public final CharSequence[] f20549b;
    public final CharSequence[] f20550c;
    public final StaticLayout[] d;
    public final StaticLayout[] f20551e;
    public int f20552f;
    public int f20553g;
    public DecimalFormat h;

    public d(long r24, long r26, boolean r28, float r29, int r30, android.text.TextPaint r31, android.text.TextPaint r32) {
        throw new UnsupportedOperationException("Method not decompiled: ng.d.<init>(long, long, boolean, float, int, android.text.TextPaint, android.text.TextPaint):void");
    }

    public final void a(Canvas canvas, int i7, int i10, float f10, float f11, TextPaint textPaint) {
        StaticLayout[] staticLayoutArr;
        CharSequence[] charSequenceArr;
        StaticLayout[] staticLayoutArr2 = this.f20551e;
        StaticLayout[] staticLayoutArr3 = this.d;
        if (i7 == 0) {
            staticLayoutArr = staticLayoutArr3;
        } else {
            staticLayoutArr = staticLayoutArr2;
        }
        StaticLayout staticLayout = staticLayoutArr[i10];
        if (staticLayout == null) {
            if (i7 == 0) {
                charSequenceArr = this.f20549b;
            } else {
                charSequenceArr = this.f20550c;
            }
            CharSequence charSequence = charSequenceArr[i10];
            if (i7 == 0) {
                staticLayoutArr2 = staticLayoutArr3;
            }
            StaticLayout staticLayout2 = new StaticLayout(charSequence, textPaint, g0.f22544q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            staticLayoutArr2[i10] = staticLayout2;
            staticLayout = staticLayout2;
        }
        canvas.save();
        canvas.translate(f10, textPaint.ascent() + f11);
        staticLayout.draw(canvas);
        canvas.restore();
    }

    public final CharSequence b(int i7, TextPaint textPaint, long j3, int i10) {
        int i11 = 2;
        if (i10 == 1) {
            if (i7 == 1) {
                return "≈" + r1.i().f(j3, "USD");
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
            if (j3 <= 1000000000) {
                i11 = 6;
            }
            decimalFormat2.setMaximumFractionDigits(i11);
            return zd.K("TON " + this.h.format(j3 / 1.0E9d), textPaint, 0.8f, -g0.L(0.66f), false);
        } else if (i10 == 2) {
            if (i7 == 1) {
                return "≈" + r1.i().f(j3, "USD");
            }
            return dd.a1(false, jg.g.m(j3, ' ', new StringBuilder("XTR ")), 0.65f, null);
        } else {
            return g0.o0((int) j3, 0);
        }
    }
}
