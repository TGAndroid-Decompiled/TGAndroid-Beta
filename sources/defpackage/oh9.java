package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.telegram.tgnet.TLObject;
public final class oh9 extends MetricAffectingSpan {
    public final rh9 a;
    public final int b;
    public final boolean c;
    public boolean d;
    public int e;

    public oh9(rh9 rh9Var, int i, boolean z) {
        this.a = rh9Var;
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
            typeface = gl.o();
        } else if (i5 >= 1 && i5 <= 6) {
            if (TLObject.hasFlag(i4, 32)) {
                typeface = gl.n1("fonts/rmediumitalic.ttf");
            } else {
                typeface = gl.o();
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
                    typeface = gl.n1("fonts/rmediumitalic.ttf");
                } else {
                    typeface = gl.o();
                }
            } else if (z) {
                typeface = gl.n1("fonts/ritalic.ttf");
            } else {
                typeface = null;
            }
        }
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i6 = gba.T0;
        if (i5 == 14 && this.d) {
            L = gl.L(i6);
        } else {
            switch (i5) {
                case 1:
                    L = gl.L(i6 + 4);
                    break;
                case 2:
                    L = gl.L(i6 + 2);
                    break;
                case 3:
                    L = gl.L(i6 + 1);
                    break;
                case 4:
                case 5:
                case 6:
                    L = gl.L(i6);
                    break;
                case 7:
                case 13:
                    L = gl.L(i6 - 2);
                    break;
                case 8:
                    int i7 = i6 - 2;
                    L = gl.L(Math.max(Math.min(10, i7), i7 - this.e));
                    break;
                case 9:
                case 11:
                case 12:
                    L = gl.L(i6 - 2);
                    break;
                case 10:
                    L = gl.L(i6 - 2);
                    break;
                case 14:
                    L = gl.L(Math.max(8, i6 - 2));
                    break;
                case 15:
                    L = gl.L(i6 - 2);
                    break;
                default:
                    L = gl.L(i6);
                    break;
            }
        }
        if (TLObject.hasFlag(i4, 6144)) {
            L -= gl.L(4.0f);
        }
        textPaint.setTextSize(L);
        if (!this.c) {
            textPaint.setFlags(TLObject.setFlag(TLObject.setFlag(textPaint.getFlags(), 8, TLObject.hasFlag(i4, 64)), 16, TLObject.hasFlag(i4, 128)));
            if (i5 != 8) {
                rh9 rh9Var = this.a;
                if (i5 == 11) {
                    if (rh9Var.D()) {
                        i3 = bkb.Sb;
                    } else {
                        i3 = bkb.Md;
                    }
                    v0 = bkb.v0(i3, rh9Var.D);
                } else if (i5 == 10) {
                    if (rh9Var.D()) {
                        i2 = bkb.Vc;
                    } else {
                        i2 = bkb.Uc;
                    }
                    v0 = bkb.p1(0.5f, bkb.v0(i2, rh9Var.D));
                } else {
                    if (rh9Var.D()) {
                        i = bkb.Vc;
                    } else {
                        i = bkb.Uc;
                    }
                    v0 = bkb.v0(i, rh9Var.D);
                }
                textPaint.setColor(v0);
            }
        }
        if (TLObject.hasFlag(i4, 4096)) {
            textPaint.baselineShift -= gl.L(6.0f);
        } else if (TLObject.hasFlag(i4, 2048)) {
            textPaint.baselineShift = gl.L(2.0f) + textPaint.baselineShift;
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
