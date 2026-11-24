package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.telegram.tgnet.TLObject;
public final class rj9 extends MetricAffectingSpan {
    public final uj9 a;
    public final int b;
    public final boolean c;
    public boolean d;
    public int e;

    public rj9(uj9 uj9Var, int i, boolean z) {
        this.a = uj9Var;
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
            typeface = gm.o();
        } else if (i5 >= 1 && i5 <= 6) {
            if (TLObject.hasFlag(i4, 32)) {
                typeface = gm.n1("fonts/rmediumitalic.ttf");
            } else {
                typeface = gm.o();
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
                    typeface = gm.n1("fonts/rmediumitalic.ttf");
                } else {
                    typeface = gm.o();
                }
            } else if (z) {
                typeface = gm.n1("fonts/ritalic.ttf");
            } else {
                typeface = null;
            }
        }
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i6 = gda.S0;
        if (i5 == 14 && this.d) {
            L = gm.L(i6);
        } else {
            switch (i5) {
                case 1:
                    L = gm.L(i6 + 4);
                    break;
                case 2:
                    L = gm.L(i6 + 2);
                    break;
                case 3:
                    L = gm.L(i6 + 1);
                    break;
                case 4:
                case 5:
                case 6:
                    L = gm.L(i6);
                    break;
                case 7:
                case 13:
                    L = gm.L(i6 - 2);
                    break;
                case 8:
                    int i7 = i6 - 2;
                    L = gm.L(Math.max(Math.min(10, i7), i7 - this.e));
                    break;
                case 9:
                case 11:
                case 12:
                    L = gm.L(i6 - 2);
                    break;
                case 10:
                    L = gm.L(i6 - 2);
                    break;
                case 14:
                    L = gm.L(Math.max(8, i6 - 2));
                    break;
                case 15:
                    L = gm.L(i6 - 2);
                    break;
                default:
                    L = gm.L(i6);
                    break;
            }
        }
        if (TLObject.hasFlag(i4, 6144)) {
            L -= gm.L(4.0f);
        }
        textPaint.setTextSize(L);
        if (!this.c) {
            textPaint.setFlags(TLObject.setFlag(TLObject.setFlag(textPaint.getFlags(), 8, TLObject.hasFlag(i4, 64)), 16, TLObject.hasFlag(i4, 128)));
            if (i5 != 8) {
                uj9 uj9Var = this.a;
                if (i5 == 11) {
                    if (uj9Var.D()) {
                        i3 = cmb.Sb;
                    } else {
                        i3 = cmb.Md;
                    }
                    v0 = cmb.v0(i3, uj9Var.D);
                } else if (i5 == 10) {
                    if (uj9Var.D()) {
                        i2 = cmb.Vc;
                    } else {
                        i2 = cmb.Uc;
                    }
                    v0 = cmb.p1(0.5f, cmb.v0(i2, uj9Var.D));
                } else {
                    if (uj9Var.D()) {
                        i = cmb.Vc;
                    } else {
                        i = cmb.Uc;
                    }
                    v0 = cmb.v0(i, uj9Var.D);
                }
                textPaint.setColor(v0);
            }
        }
        if (TLObject.hasFlag(i4, 4096)) {
            textPaint.baselineShift -= gm.L(6.0f);
        } else if (TLObject.hasFlag(i4, 2048)) {
            textPaint.baselineShift = gm.L(2.0f) + textPaint.baselineShift;
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
