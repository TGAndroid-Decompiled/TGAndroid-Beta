package org.telegram.messenger;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.telegram.tgnet.TLObject;
public final class gv extends MetricAffectingSpan {
    public final kv f22745a;
    public final int f22746b;
    public final boolean f22747c;
    public boolean d;
    public int f22748e;

    public gv(kv kvVar, int i7, boolean z9) {
        this.f22745a = kvVar;
        this.f22746b = i7;
        this.f22747c = z9;
    }

    public final void a(TextPaint textPaint) {
        boolean z9;
        Typeface typeface;
        int L;
        int i7;
        int w02;
        int i10;
        int i11;
        int i12 = this.f22746b;
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
                z9 = false;
            } else {
                z9 = true;
            }
            if (hasFlag && z9) {
                typeface = g0.o1("fonts/rmediumitalic.ttf");
            } else if (hasFlag) {
                typeface = g0.o();
            } else if (z9) {
                typeface = g0.o1("fonts/ritalic.ttf");
            } else {
                typeface = null;
            }
        }
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i14 = iz.W0;
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
                    L = g0.L(Math.max(Math.min(10, i15), i15 - this.f22748e));
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
        if (!this.f22747c) {
            textPaint.setFlags(TLObject.setFlag(TLObject.setFlag(textPaint.getFlags(), 8, TLObject.hasFlag(i12, 64)), 16, TLObject.hasFlag(i12, 128)));
            if (i13 != 8) {
                kv kvVar = this.f22745a;
                if (i13 == 11) {
                    if (kvVar.E()) {
                        i11 = org.telegram.ui.ActionBar.l6.Qb;
                    } else {
                        i11 = org.telegram.ui.ActionBar.l6.Kd;
                    }
                    w02 = org.telegram.ui.ActionBar.l6.w0(i11, kvVar.D);
                } else if (i13 == 10) {
                    if (kvVar.E()) {
                        i10 = org.telegram.ui.ActionBar.l6.Tc;
                    } else {
                        i10 = org.telegram.ui.ActionBar.l6.Sc;
                    }
                    w02 = org.telegram.ui.ActionBar.l6.r1(0.5f, org.telegram.ui.ActionBar.l6.w0(i10, kvVar.D));
                } else {
                    if (kvVar.E()) {
                        i7 = org.telegram.ui.ActionBar.l6.Tc;
                    } else {
                        i7 = org.telegram.ui.ActionBar.l6.Sc;
                    }
                    w02 = org.telegram.ui.ActionBar.l6.w0(i7, kvVar.D);
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
