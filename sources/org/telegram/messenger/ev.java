package org.telegram.messenger;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.telegram.tgnet.TLObject;
public final class ev extends MetricAffectingSpan {
    public final iv f23367a;
    public final int f23368b;
    public final boolean f23369c;
    public boolean d;
    public int f23370e;

    public ev(iv ivVar, int i7, boolean z10) {
        this.f23367a = ivVar;
        this.f23368b = i7;
        this.f23369c = z10;
    }

    public final void a(TextPaint textPaint) {
        boolean z10;
        Typeface typeface;
        int L;
        int i7;
        int w02;
        int i10;
        int i11;
        int i12 = this.f23368b;
        int i13 = i12 & 15;
        if (i13 == 8) {
            typeface = Typeface.MONOSPACE;
        } else if (i13 == 11) {
            typeface = g0.o();
        } else if (i13 >= 1 && i13 <= 6) {
            if (TLObject.hasFlag(i12, 32)) {
                typeface = g0.o1("fonts/rmediumitalic.ttf");
            } else {
                typeface = g0.o();
            }
        } else if (TLObject.hasFlag(i12, 256)) {
            typeface = Typeface.MONOSPACE;
        } else {
            boolean hasFlag = TLObject.hasFlag(i12, 16);
            if (!TLObject.hasFlag(i12, 32) && i13 != 12) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (hasFlag && z10) {
                typeface = g0.o1("fonts/rmediumitalic.ttf");
            } else if (hasFlag) {
                typeface = g0.o();
            } else if (z10) {
                typeface = g0.o1("fonts/ritalic.ttf");
            } else {
                typeface = null;
            }
        }
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i14 = gz.W0;
        if (i13 == 14 && this.d) {
            L = g0.L(i14);
        } else {
            switch (i13) {
                case 1:
                    L = g0.L(i14 + 4);
                    break;
                case 2:
                    L = g0.L(i14 + 2);
                    break;
                case 3:
                    L = g0.L(i14 + 1);
                    break;
                case 4:
                case 5:
                case 6:
                    L = g0.L(i14);
                    break;
                case 7:
                case 13:
                    L = g0.L(i14 - 2);
                    break;
                case 8:
                    int i15 = i14 - 2;
                    L = g0.L(Math.max(Math.min(10, i15), i15 - this.f23370e));
                    break;
                case 9:
                case 11:
                case 12:
                    L = g0.L(i14 - 2);
                    break;
                case 10:
                    L = g0.L(i14 - 2);
                    break;
                case 14:
                    L = g0.L(Math.max(8, i14 - 2));
                    break;
                case 15:
                    L = g0.L(i14 - 2);
                    break;
                default:
                    L = g0.L(i14);
                    break;
            }
        }
        if (TLObject.hasFlag(i12, 6144)) {
            L -= g0.L(4.0f);
        }
        textPaint.setTextSize(L);
        if (!this.f23369c) {
            textPaint.setFlags(TLObject.setFlag(TLObject.setFlag(textPaint.getFlags(), 8, TLObject.hasFlag(i12, 64)), 16, TLObject.hasFlag(i12, 128)));
            if (i13 != 8) {
                iv ivVar = this.f23367a;
                if (i13 == 11) {
                    if (ivVar.E()) {
                        i11 = org.telegram.ui.ActionBar.j6.Tb;
                    } else {
                        i11 = org.telegram.ui.ActionBar.j6.Nd;
                    }
                    w02 = org.telegram.ui.ActionBar.j6.w0(i11, ivVar.D);
                } else if (i13 == 10) {
                    if (ivVar.E()) {
                        i10 = org.telegram.ui.ActionBar.j6.Wc;
                    } else {
                        i10 = org.telegram.ui.ActionBar.j6.Vc;
                    }
                    w02 = org.telegram.ui.ActionBar.j6.r1(0.5f, org.telegram.ui.ActionBar.j6.w0(i10, ivVar.D));
                } else {
                    if (ivVar.E()) {
                        i7 = org.telegram.ui.ActionBar.j6.Wc;
                    } else {
                        i7 = org.telegram.ui.ActionBar.j6.Vc;
                    }
                    w02 = org.telegram.ui.ActionBar.j6.w0(i7, ivVar.D);
                }
                textPaint.setColor(w02);
            }
        }
        if (TLObject.hasFlag(i12, 4096)) {
            textPaint.baselineShift -= g0.L(6.0f);
        } else if (TLObject.hasFlag(i12, 2048)) {
            textPaint.baselineShift = g0.L(2.0f) + textPaint.baselineShift;
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
