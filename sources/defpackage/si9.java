package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class si9 extends qi9 {
    public final ri9[] X;
    public final int Y;
    public int Z;
    public ri9 a0;
    public ri9 b0;
    public final vj2 c0;

    public si9(uj9 uj9Var, Rect rect, int i, TL_iv.pageBlockButtonRow pageblockbuttonrow) {
        super(uj9Var, rect, i);
        this.Z = -1;
        this.c0 = new vj2(new oo8(this, (byte) 8));
        this.X = new ri9[pageblockbuttonrow.buttons.size()];
        int size = pageblockbuttonrow.buttons.size();
        for (int i2 = 0; i2 < size; i2++) {
            ri9[] ri9VarArr = this.X;
            TL_keyboard.PageButton pageButton = pageblockbuttonrow.buttons.get(i2);
            ri9VarArr[i2] = new ri9(uj9Var, i, uj9Var.l(pageButton.text, uj9.Q(16, 13)), pageButton, pageButton.type, pageButton.style, kfb.c(pageButton, TL_keyboard.TL_inlineButtonTypeDisabled.class), false, false, false, false, null, new kf9(this, (byte) 2));
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
        int d;
        ri9[] ri9VarArr = this.X;
        if (ri9VarArr.length == 0) {
            d = gm.L(this.a.M + 18);
        } else {
            d = ri9VarArr[0].d();
        }
        Rect rect = this.b;
        return gm.L(4.333f) + rect.top + d + rect.bottom;
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
        for (ri9 ri9Var : this.X) {
            ri9Var.a(this.W);
        }
    }

    @Override
    public final void U() {
        ri9[] ri9VarArr;
        for (ri9 ri9Var : this.X) {
            ri9Var.a.f(this.W);
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

    public final ri9 h0(float f, float f2) {
        int d;
        int i;
        l0();
        ri9[] ri9VarArr = this.X;
        if (ri9VarArr.length == 0) {
            d = gm.L(this.a.M + 18);
        } else {
            d = ri9VarArr[0].d();
        }
        float H = (H() - d) / 2.0f;
        if (f2 >= H && f2 <= H + d) {
            for (ri9 ri9Var : ri9VarArr) {
                if (f >= ri9Var.d && f <= i + ri9Var.e) {
                    return ri9Var;
                }
            }
            return null;
        }
        return null;
    }

    public final int i0() {
        ri9[] ri9VarArr = this.X;
        int length = ri9VarArr.length;
        if (length == 0) {
            return 0;
        }
        int L = (length - 1) * gm.L(7.0f);
        for (ri9 ri9Var : ri9VarArr) {
            L += ri9Var.i();
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
        ri9[] ri9VarArr = this.X;
        int length = ri9VarArr.length;
        if (length != 0) {
            int L = gm.L(7.0f);
            int i7 = (length - 1) * L;
            int max = Math.max(0, i - i7);
            int i8 = 0;
            for (ri9 ri9Var : ri9VarArr) {
                int i9 = ri9Var.i();
                ri9Var.e = i9;
                i8 += i9;
            }
            int i10 = this.Y;
            if (i8 > max) {
                int i11 = 0;
                for (ri9 ri9Var2 : ri9VarArr) {
                    i11 += ri9Var2.e - ri9Var2.f();
                }
                if (i11 <= 0) {
                    for (ri9 ri9Var3 : ri9VarArr) {
                        ri9Var3.e = ri9Var3.f();
                    }
                } else {
                    int min = Math.min(i8 - max, i11);
                    int i12 = 0;
                    int i13 = 0;
                    while (i12 < ri9VarArr.length) {
                        ri9 ri9Var4 = ri9VarArr[i12];
                        int f = ri9Var4.e - ri9Var4.f();
                        if (i12 == ri9VarArr.length - 1) {
                            i6 = min - i13;
                            i5 = i12;
                        } else {
                            i5 = i12;
                            i6 = (int) ((min * f) / i11);
                        }
                        int min2 = Math.min(i6, f);
                        ri9Var4.e -= min2;
                        i13 += min2;
                        i12 = i5 + 1;
                    }
                }
            } else if (i10 == 4) {
                boolean[] zArr = new boolean[ri9VarArr.length];
                int length2 = ri9VarArr.length;
                for (boolean z2 = true; z2 && length2 > 0; z2 = z) {
                    int i14 = max / length2;
                    z = false;
                    for (int i15 = 0; i15 < ri9VarArr.length; i15++) {
                        if (!zArr[i15] && (i3 = ri9VarArr[i15].e) > i14) {
                            zArr[i15] = true;
                            max -= i3;
                            length2--;
                            z = true;
                        }
                    }
                }
                if (length2 > 0) {
                    int i16 = max / length2;
                    int i17 = max - (length2 * i16);
                    for (int i18 = 0; i18 < ri9VarArr.length; i18++) {
                        if (!zArr[i18]) {
                            ri9 ri9Var5 = ri9VarArr[i18];
                            int i19 = i17 - 1;
                            if (i17 > 0) {
                                i2 = 1;
                            } else {
                                i2 = 0;
                            }
                            ri9Var5.e = i2 + i16;
                            i17 = i19;
                        }
                    }
                }
            }
            for (ri9 ri9Var6 : ri9VarArr) {
                i7 += ri9Var6.e;
            }
            int F = wi8.F(i10);
            if (F != 1) {
                if (F != 2) {
                    i4 = 0;
                } else {
                    i4 = (i - i7) / 2;
                }
            } else {
                i4 = i - i7;
            }
            for (ri9 ri9Var7 : ri9VarArr) {
                ri9Var7.d = i4;
                i4 += ri9Var7.e + L;
            }
        }
    }

    public final void k0(ri9 ri9Var) {
        ri9 ri9Var2 = this.a0;
        if (ri9Var2 != ri9Var) {
            if (ri9Var2 != null) {
                ri9Var2.n(false);
            }
            this.a0 = ri9Var;
            if (ri9Var != null) {
                ri9Var.n(true);
            }
        }
    }

    public final void l0() {
        uj9 uj9Var = this.a;
        int i = uj9Var.C;
        int i2 = uj9Var.S;
        Rect rect = this.b;
        int max = Math.max(0, ((((i + i2) + uj9Var.T) - (i2 << 1)) - rect.left) - rect.right);
        if (this.Z != max) {
            j0(max);
        }
    }

    @Override
    public final void p(Canvas canvas) {
        ri9[] ri9VarArr;
        l0();
        for (ri9 ri9Var : this.X) {
            canvas.save();
            canvas.translate(ri9Var.d, Math.round((H() - ri9Var.d()) / 2.0f));
            ri9Var.b(canvas);
            canvas.restore();
        }
    }
}
