package org.telegram.messenger;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.telegram.tgnet.TLObject;
public final class av extends MetricAffectingSpan {
    public final ev f22997a;
    public final int f22998b;
    public final boolean f22999c;
    public boolean d;
    public int f23000e;

    public av(ev evVar, int i7, boolean z10) {
        this.f22997a = evVar;
        this.f22998b = i7;
        this.f22999c = z10;
    }

    public final void a(TextPaint textPaint) {
        boolean z10;
        Typeface typeface;
        int L;
        int i7;
        int w02;
        int i10;
        int i11;
        int i12 = this.f22998b;
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
        int i14 = bz.W0;
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
                    L = g0.L(Math.max(Math.min(10, i15), i15 - this.f23000e));
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
        if (!this.f22999c) {
            textPaint.setFlags(TLObject.setFlag(TLObject.setFlag(textPaint.getFlags(), 8, TLObject.hasFlag(i12, 64)), 16, TLObject.hasFlag(i12, 128)));
            if (i13 != 8) {
                ev evVar = this.f22997a;
                if (i13 == 11) {
                    if (evVar.E()) {
                        i11 = org.telegram.ui.ActionBar.m6.Tb;
                    } else {
                        i11 = org.telegram.ui.ActionBar.m6.Nd;
                    }
                    w02 = org.telegram.ui.ActionBar.m6.w0(i11, evVar.D);
                } else if (i13 == 10) {
                    if (evVar.E()) {
                        i10 = org.telegram.ui.ActionBar.m6.Wc;
                    } else {
                        i10 = org.telegram.ui.ActionBar.m6.Vc;
                    }
                    w02 = org.telegram.ui.ActionBar.m6.r1(0.5f, org.telegram.ui.ActionBar.m6.w0(i10, evVar.D));
                } else {
                    if (evVar.E()) {
                        i7 = org.telegram.ui.ActionBar.m6.Wc;
                    } else {
                        i7 = org.telegram.ui.ActionBar.m6.Vc;
                    }
                    w02 = org.telegram.ui.ActionBar.m6.w0(i7, evVar.D);
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
