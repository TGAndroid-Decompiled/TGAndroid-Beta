package org.telegram.messenger;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.telegram.tgnet.TLObject;
public final class sv extends MetricAffectingSpan {
    public final wv f18166a;
    public final int f18167b;
    public final boolean f18168c;
    public boolean d;
    public int e;

    public sv(wv wvVar, int i10, boolean z10) {
        this.f18166a = wvVar;
        this.f18167b = i10;
        this.f18168c = z10;
    }

    public final void a(TextPaint textPaint) {
        boolean z10;
        Typeface typeface;
        int L;
        int i10;
        int w02;
        int i11;
        int i12;
        int i13 = this.f18167b;
        int i14 = i13 & 15;
        if (i14 == 8) {
            typeface = Typeface.MONOSPACE;
        } else if (i14 == 11) {
            typeface = i0.o();
        } else if (i14 >= 1 && i14 <= 6) {
            if (TLObject.hasFlag(i13, 32)) {
                typeface = i0.o1("fonts/rmediumitalic.ttf");
            } else {
                typeface = i0.o();
            }
        } else if (TLObject.hasFlag(i13, 256)) {
            typeface = Typeface.MONOSPACE;
        } else {
            boolean hasFlag = TLObject.hasFlag(i13, 16);
            if (!TLObject.hasFlag(i13, 32) && i14 != 12) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (hasFlag && z10) {
                typeface = i0.o1("fonts/rmediumitalic.ttf");
            } else if (hasFlag) {
                typeface = i0.o();
            } else if (z10) {
                typeface = i0.o1("fonts/ritalic.ttf");
            } else {
                typeface = null;
            }
        }
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i15 = uz.W0;
        if (i14 == 14 && this.d) {
            L = i0.L(i15);
        } else {
            switch (i14) {
                case 1:
                    L = i0.L(i15 + 4);
                    break;
                case 2:
                    L = i0.L(i15 + 2);
                    break;
                case 3:
                    L = i0.L(i15 + 1);
                    break;
                case 4:
                case 5:
                case 6:
                    L = i0.L(i15);
                    break;
                case 7:
                case 13:
                    L = i0.L(i15 - 2);
                    break;
                case 8:
                    int i16 = i15 - 2;
                    L = i0.L(Math.max(Math.min(10, i16), i16 - this.e));
                    break;
                case 9:
                case 11:
                case 12:
                    L = i0.L(i15 - 2);
                    break;
                case 10:
                    L = i0.L(i15 - 2);
                    break;
                case 14:
                    L = i0.L(Math.max(8, i15 - 2));
                    break;
                case 15:
                    L = i0.L(i15 - 2);
                    break;
                default:
                    L = i0.L(i15);
                    break;
            }
        }
        if (TLObject.hasFlag(i13, 6144)) {
            L -= i0.L(4.0f);
        }
        textPaint.setTextSize(L);
        if (!this.f18168c) {
            textPaint.setFlags(TLObject.setFlag(TLObject.setFlag(textPaint.getFlags(), 8, TLObject.hasFlag(i13, 64)), 16, TLObject.hasFlag(i13, 128)));
            if (i14 != 8) {
                wv wvVar = this.f18166a;
                if (i14 == 11) {
                    if (wvVar.E()) {
                        i12 = org.telegram.ui.ActionBar.t6.Qb;
                    } else {
                        i12 = org.telegram.ui.ActionBar.t6.Kd;
                    }
                    w02 = org.telegram.ui.ActionBar.t6.w0(i12, wvVar.D);
                } else if (i14 == 10) {
                    if (wvVar.E()) {
                        i11 = org.telegram.ui.ActionBar.t6.Tc;
                    } else {
                        i11 = org.telegram.ui.ActionBar.t6.Sc;
                    }
                    w02 = org.telegram.ui.ActionBar.t6.r1(0.5f, org.telegram.ui.ActionBar.t6.w0(i11, wvVar.D));
                } else {
                    if (wvVar.E()) {
                        i10 = org.telegram.ui.ActionBar.t6.Tc;
                    } else {
                        i10 = org.telegram.ui.ActionBar.t6.Sc;
                    }
                    w02 = org.telegram.ui.ActionBar.t6.w0(i10, wvVar.D);
                }
                textPaint.setColor(w02);
            }
        }
        if (TLObject.hasFlag(i13, 4096)) {
            textPaint.baselineShift -= i0.L(6.0f);
        } else if (TLObject.hasFlag(i13, 2048)) {
            textPaint.baselineShift = i0.L(2.0f) + textPaint.baselineShift;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
