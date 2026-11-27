package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class fk9 extends dk9 {
    public final ek9[] X;
    public final int Y;
    public int Z;
    public ek9 a0;
    public ek9 b0;
    public final dj2 c0;

    public fk9(hl9 hl9Var, Rect rect, int i, TL_iv.pageBlockButtonRow pageblockbuttonrow) {
        super(hl9Var, rect, i);
        this.Z = -1;
        this.c0 = new dj2(new l09(this, (byte) 5));
        this.X = new ek9[pageblockbuttonrow.buttons.size()];
        int size = pageblockbuttonrow.buttons.size();
        for (int i2 = 0; i2 < size; i2++) {
            ek9[] ek9VarArr = this.X;
            TL_keyboard.PageButton pageButton = pageblockbuttonrow.buttons.get(i2);
            ek9VarArr[i2] = new ek9(hl9Var, i, hl9Var.l(pageButton.text, hl9.Q(16, 13)), pageButton, pageButton.type, pageButton.style, ehb.c(pageButton, TL_keyboard.TL_inlineButtonTypeDisabled.class), false, false, false, false, null, new v59(this, (byte) 10));
        }
        if (pageblockbuttonrow.align_left) {
            this.Y = 1;
        } else if (pageblockbuttonrow.align_center) {
            this.Y = 3;
        } else if (pageblockbuttonrow.align_right) {
            this.Y = 2;
        } else {
            this.Y = 4;
        }
        j0(i0());
    }

    @Override
    public final int H() {
        int c;
        ek9[] ek9VarArr = this.X;
        if (ek9VarArr.length == 0) {
            c = hl.L(this.a.M + 18);
        } else {
            c = ek9VarArr[0].c();
        }
        Rect rect = this.b;
        return hl.L(4.333f) + rect.top + c + rect.bottom;
    }

    @Override
    public final int J() {
        Rect rect = this.b;
        return i0() + rect.left + rect.right;
    }

    @Override
    public final boolean P() {
        if (this.b0 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void S() {
        ek9[] ek9VarArr;
        for (ek9 ek9Var : this.X) {
            ek9Var.a.i(this.W);
        }
    }

    @Override
    public final void U() {
        ek9[] ek9VarArr;
        for (ek9 ek9Var : this.X) {
            ek9Var.a.f(this.W);
        }
    }

    @Override
    public final boolean X(MotionEvent motionEvent) {
        View view = this.W;
        if (view == null) {
            return false;
        }
        return this.c0.a(view, motionEvent);
    }

    public final ek9 h0(float f, float f2) {
        int c;
        int i;
        l0();
        ek9[] ek9VarArr = this.X;
        if (ek9VarArr.length == 0) {
            c = hl.L(this.a.M + 18);
        } else {
            c = ek9VarArr[0].c();
        }
        float H = (H() - c) / 2.0f;
        if (f2 >= H && f2 <= H + c) {
            for (ek9 ek9Var : ek9VarArr) {
                if (f >= ek9Var.d && f <= i + ek9Var.e) {
                    return ek9Var;
                }
            }
            return null;
        }
        return null;
    }

    public final int i0() {
        ek9[] ek9VarArr = this.X;
        int length = ek9VarArr.length;
        if (length == 0) {
            return 0;
        }
        int L = (length - 1) * hl.L(7.0f);
        for (ek9 ek9Var : ek9VarArr) {
            L += ek9Var.h();
        }
        return Math.min(this.c, L);
    }

    public final void j0(int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        this.Z = i;
        ek9[] ek9VarArr = this.X;
        int length = ek9VarArr.length;
        if (length != 0) {
            int L = hl.L(7.0f);
            int i7 = (length - 1) * L;
            int max = Math.max(0, i - i7);
            int i8 = 0;
            for (ek9 ek9Var : ek9VarArr) {
                int h = ek9Var.h();
                ek9Var.e = h;
                i8 += h;
            }
            int i9 = this.Y;
            if (i8 > max) {
                int i10 = 0;
                for (ek9 ek9Var2 : ek9VarArr) {
                    i10 += ek9Var2.e - ek9Var2.e();
                }
                if (i10 <= 0) {
                    for (ek9 ek9Var3 : ek9VarArr) {
                        ek9Var3.e = ek9Var3.e();
                    }
                } else {
                    int min = Math.min(i8 - max, i10);
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < ek9VarArr.length) {
                        ek9 ek9Var4 = ek9VarArr[i11];
                        int e = ek9Var4.e - ek9Var4.e();
                        if (i11 == ek9VarArr.length - 1) {
                            i6 = min - i12;
                            i5 = i11;
                        } else {
                            i5 = i11;
                            i6 = (int) ((min * e) / i10);
                        }
                        int min2 = Math.min(i6, e);
                        ek9Var4.e -= min2;
                        i12 += min2;
                        i11 = i5 + 1;
                    }
                }
            } else if (i9 == 4) {
                boolean[] zArr = new boolean[ek9VarArr.length];
                int length2 = ek9VarArr.length;
                for (boolean z2 = true; z2 && length2 > 0; z2 = z) {
                    int i13 = max / length2;
                    z = false;
                    for (int i14 = 0; i14 < ek9VarArr.length; i14++) {
                        if (!zArr[i14] && (i3 = ek9VarArr[i14].e) > i13) {
                            zArr[i14] = true;
                            max -= i3;
                            length2--;
                            z = true;
                        }
                    }
                }
                if (length2 > 0) {
                    int i15 = max / length2;
                    int i16 = max - (length2 * i15);
                    for (int i17 = 0; i17 < ek9VarArr.length; i17++) {
                        if (!zArr[i17]) {
                            ek9 ek9Var5 = ek9VarArr[i17];
                            int i18 = i16 - 1;
                            if (i16 > 0) {
                                i2 = 1;
                            } else {
                                i2 = 0;
                            }
                            ek9Var5.e = i2 + i15;
                            i16 = i18;
                        }
                    }
                }
            }
            for (ek9 ek9Var6 : ek9VarArr) {
                i7 += ek9Var6.e;
            }
            int F = ik8.F(i9);
            if (F != 1) {
                if (F != 2) {
                    i4 = 0;
                } else {
                    i4 = (i - i7) / 2;
                }
            } else {
                i4 = i - i7;
            }
            for (ek9 ek9Var7 : ek9VarArr) {
                ek9Var7.d = i4;
                i4 += ek9Var7.e + L;
            }
        }
    }

    public final void k0(ek9 ek9Var) {
        ek9 ek9Var2 = this.a0;
        if (ek9Var2 != ek9Var) {
            if (ek9Var2 != null) {
                ek9Var2.m(false);
            }
            this.a0 = ek9Var;
            if (ek9Var != null) {
                ek9Var.m(true);
            }
        }
    }

    public final void l0() {
        hl9 hl9Var = this.a;
        int i = hl9Var.C;
        int i2 = hl9Var.S;
        Rect rect = this.b;
        int max = Math.max(0, ((((i + i2) + hl9Var.T) - (i2 << 1)) - rect.left) - rect.right);
        if (this.Z != max) {
            j0(max);
        }
    }

    @Override
    public final void p(Canvas canvas) {
        ek9[] ek9VarArr;
        l0();
        for (ek9 ek9Var : this.X) {
            canvas.save();
            canvas.translate(ek9Var.d, Math.round((H() - ek9Var.c()) / 2.0f));
            ek9Var.a(canvas);
            canvas.restore();
        }
    }
}
