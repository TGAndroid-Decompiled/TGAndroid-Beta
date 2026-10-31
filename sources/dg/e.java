package dg;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import org.telegram.messenger.i0;
import org.telegram.messenger.u1;
import org.telegram.ui.le;
import rh.h8;
public final class e {
    public final long[] f5894a;
    public final CharSequence[] f5895b;
    public final CharSequence[] f5896c;
    public final StaticLayout[] d;
    public final StaticLayout[] e;
    public int f5897f;
    public int f5898g;
    public DecimalFormat h;

    public e(long r24, long r26, boolean r28, float r29, int r30, android.text.TextPaint r31, android.text.TextPaint r32) {
        throw new UnsupportedOperationException("Method not decompiled: dg.e.<init>(long, long, boolean, float, int, android.text.TextPaint, android.text.TextPaint):void");
    }

    public final void a(Canvas canvas, int i10, int i11, float f7, float f10, TextPaint textPaint) {
        StaticLayout[] staticLayoutArr;
        CharSequence[] charSequenceArr;
        StaticLayout[] staticLayoutArr2 = this.e;
        StaticLayout[] staticLayoutArr3 = this.d;
        if (i10 == 0) {
            staticLayoutArr = staticLayoutArr3;
        } else {
            staticLayoutArr = staticLayoutArr2;
        }
        StaticLayout staticLayout = staticLayoutArr[i11];
        if (staticLayout == null) {
            if (i10 == 0) {
                charSequenceArr = this.f5895b;
            } else {
                charSequenceArr = this.f5896c;
            }
            CharSequence charSequence = charSequenceArr[i11];
            if (i10 == 0) {
                staticLayoutArr2 = staticLayoutArr3;
            }
            StaticLayout staticLayout2 = new StaticLayout(charSequence, textPaint, i0.f16026q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            staticLayoutArr2[i11] = staticLayout2;
            staticLayout = staticLayout2;
        }
        canvas.save();
        canvas.translate(f7, textPaint.ascent() + f10);
        staticLayout.draw(canvas);
        canvas.restore();
    }

    public final CharSequence b(int i10, TextPaint textPaint, long j10, int i11) {
        int i12 = 2;
        if (i11 == 1) {
            if (i10 == 1) {
                return "≈" + u1.i().f(j10, "USD");
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
            if (j10 <= 1000000000) {
                i12 = 6;
            }
            decimalFormat2.setMaximumFractionDigits(i12);
            return le.K("TON " + this.h.format(j10 / 1.0E9d), textPaint, 0.8f, -i0.L(0.66f), false);
        } else if (i11 == 2) {
            if (i10 == 1) {
                return "≈" + u1.i().f(j10, "USD");
            }
            return h8.Z0(false, i0.a.k(j10, ' ', new StringBuilder("XTR ")), 0.65f, null);
        } else {
            return i0.o0((int) j10, 0);
        }
    }
}
