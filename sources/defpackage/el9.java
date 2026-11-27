package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.telegram.tgnet.TLObject;
public final class el9 extends MetricAffectingSpan {
    public final hl9 a;
    public final int b;
    public final boolean c;
    public boolean d;
    public int e;

    public el9(hl9 hl9Var, int i, boolean z) {
        this.a = hl9Var;
        this.b = i;
        this.c = z;
    }

    public final void a(TextPaint textPaint) {
        boolean z;
        Typeface typeface;
        int L;
        int i;
        int v0;
        int i2;
        int i3;
        int i4 = this.b;
        int i5 = i4 & 15;
        if (i5 == 8) {
            typeface = Typeface.MONOSPACE;
        } else if (i5 == 11) {
            typeface = hl.o();
        } else if (i5 >= 1 && i5 <= 6) {
            if (TLObject.hasFlag(i4, 32)) {
                typeface = hl.n1("fonts/rmediumitalic.ttf");
            } else {
                typeface = hl.o();
            }
        } else if (TLObject.hasFlag(i4, 256)) {
            typeface = Typeface.MONOSPACE;
        } else {
            boolean hasFlag = TLObject.hasFlag(i4, 16);
            if (!TLObject.hasFlag(i4, 32) && i5 != 12) {
                z = false;
            } else {
                z = true;
            }
            if (hasFlag) {
                if (z) {
                    typeface = hl.n1("fonts/rmediumitalic.ttf");
                } else {
                    typeface = hl.o();
                }
            } else if (z) {
                typeface = hl.n1("fonts/ritalic.ttf");
            } else {
                typeface = null;
            }
        }
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i6 = xea.S0;
        if (i5 == 14 && this.d) {
            L = hl.L(i6);
        } else {
            switch (i5) {
                case 1:
                    L = hl.L(i6 + 4);
                    break;
                case 2:
                    L = hl.L(i6 + 2);
                    break;
                case 3:
                    L = hl.L(i6 + 1);
                    break;
                case 4:
                case 5:
                case 6:
                    L = hl.L(i6);
                    break;
                case 7:
                case 13:
                    L = hl.L(i6 - 2);
                    break;
                case 8:
                    int i7 = i6 - 2;
                    L = hl.L(Math.max(Math.min(10, i7), i7 - this.e));
                    break;
                case 9:
                case 11:
                case 12:
                    L = hl.L(i6 - 2);
                    break;
                case 10:
                    L = hl.L(i6 - 2);
                    break;
                case 14:
                    L = hl.L(Math.max(8, i6 - 2));
                    break;
                case 15:
                    L = hl.L(i6 - 2);
                    break;
                default:
                    L = hl.L(i6);
                    break;
            }
        }
        if (TLObject.hasFlag(i4, 6144)) {
            L -= hl.L(4.0f);
        }
        textPaint.setTextSize(L);
        if (!this.c) {
            textPaint.setFlags(TLObject.setFlag(TLObject.setFlag(textPaint.getFlags(), 8, TLObject.hasFlag(i4, 64)), 16, TLObject.hasFlag(i4, 128)));
            if (i5 != 8) {
                hl9 hl9Var = this.a;
                if (i5 == 11) {
                    if (hl9Var.D()) {
                        i3 = aob.Tb;
                    } else {
                        i3 = aob.Nd;
                    }
                    v0 = aob.v0(i3, hl9Var.D);
                } else if (i5 == 10) {
                    if (hl9Var.D()) {
                        i2 = aob.Wc;
                    } else {
                        i2 = aob.Vc;
                    }
                    v0 = aob.p1(0.5f, aob.v0(i2, hl9Var.D));
                } else {
                    if (hl9Var.D()) {
                        i = aob.Wc;
                    } else {
                        i = aob.Vc;
                    }
                    v0 = aob.v0(i, hl9Var.D);
                }
                textPaint.setColor(v0);
            }
        }
        if (TLObject.hasFlag(i4, 4096)) {
            textPaint.baselineShift -= hl.L(6.0f);
        } else if (TLObject.hasFlag(i4, 2048)) {
            textPaint.baselineShift = hl.L(2.0f) + textPaint.baselineShift;
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
