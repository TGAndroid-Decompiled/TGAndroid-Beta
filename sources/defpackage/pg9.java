package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class pg9 extends mg9 {
    public final og9[] X;
    public final int Y;
    public int Z;
    public og9 a0;
    public og9 b0;
    public final hi2 c0;

    public pg9(rh9 rh9Var, Rect rect, int i, TL_iv.pageBlockButtonRow pageblockbuttonrow) {
        super(rh9Var, rect, i);
        this.Z = -1;
        this.c0 = new hi2(new v39(this, (byte) 4));
        this.X = new og9[pageblockbuttonrow.buttons.size()];
        int size = pageblockbuttonrow.buttons.size();
        for (int i2 = 0; i2 < size; i2++) {
            og9[] og9VarArr = this.X;
            TL_keyboard.PageButton pageButton = pageblockbuttonrow.buttons.get(i2);
            og9VarArr[i2] = new og9(rh9Var, i, rh9Var.l(pageButton.text, rh9.Q(16, 13)), pageButton, pageButton.type, pageButton.style, jdb.c(pageButton, TL_keyboard.TL_inlineButtonTypeDisabled.class), false, false, false, false, null, new sr8(this, (byte) 24));
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
        k0(j0());
    }

    @Override
    public final int I() {
        int c;
        og9[] og9VarArr = this.X;
        if (og9VarArr.length == 0) {
            c = gl.L(this.a.M + 18);
        } else {
            c = og9VarArr[0].c();
        }
        Rect rect = this.b;
        return gl.L(4.333f) + rect.top + c + rect.bottom;
    }

    @Override
    public final int K() {
        Rect rect = this.b;
        return j0() + rect.left + rect.right;
    }

    @Override
    public final boolean Q() {
        if (this.b0 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void T() {
        og9[] og9VarArr;
        for (og9 og9Var : this.X) {
            og9Var.a.i(this.W);
        }
    }

    @Override
    public final void V() {
        og9[] og9VarArr;
        for (og9 og9Var : this.X) {
            og9Var.a.f(this.W);
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        View view = this.W;
        if (view == null) {
            return false;
        }
        return this.c0.a(view, motionEvent);
    }

    public final og9 i0(float f, float f2) {
        int c;
        int i;
        m0();
        og9[] og9VarArr = this.X;
        if (og9VarArr.length == 0) {
            c = gl.L(this.a.M + 18);
        } else {
            c = og9VarArr[0].c();
        }
        float I = (I() - c) / 2.0f;
        if (f2 >= I && f2 <= I + c) {
            for (og9 og9Var : og9VarArr) {
                if (f >= og9Var.d && f <= i + og9Var.e) {
                    return og9Var;
                }
            }
            return null;
        }
        return null;
    }

    public final int j0() {
        og9[] og9VarArr = this.X;
        int length = og9VarArr.length;
        if (length == 0) {
            return 0;
        }
        int L = (length - 1) * gl.L(7.0f);
        for (og9 og9Var : og9VarArr) {
            L += og9Var.h();
        }
        return Math.min(this.c, L);
    }

    public final void k0(int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        this.Z = i;
        og9[] og9VarArr = this.X;
        int length = og9VarArr.length;
        if (length != 0) {
            int L = gl.L(7.0f);
            int i7 = (length - 1) * L;
            int max = Math.max(0, i - i7);
            int i8 = 0;
            for (og9 og9Var : og9VarArr) {
                int h = og9Var.h();
                og9Var.e = h;
                i8 += h;
            }
            int i9 = this.Y;
            if (i8 > max) {
                int i10 = 0;
                for (og9 og9Var2 : og9VarArr) {
                    i10 += og9Var2.e - og9Var2.e();
                }
                if (i10 <= 0) {
                    for (og9 og9Var3 : og9VarArr) {
                        og9Var3.e = og9Var3.e();
                    }
                } else {
                    int min = Math.min(i8 - max, i10);
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < og9VarArr.length) {
                        og9 og9Var4 = og9VarArr[i11];
                        int e = og9Var4.e - og9Var4.e();
                        if (i11 == og9VarArr.length - 1) {
                            i6 = min - i12;
                            i5 = i11;
                        } else {
                            i5 = i11;
                            i6 = (int) ((min * e) / i10);
                        }
                        int min2 = Math.min(i6, e);
                        og9Var4.e -= min2;
                        i12 += min2;
                        i11 = i5 + 1;
                    }
                }
            } else if (i9 == 4) {
                boolean[] zArr = new boolean[og9VarArr.length];
                int length2 = og9VarArr.length;
                for (boolean z2 = true; z2 && length2 > 0; z2 = z) {
                    int i13 = max / length2;
                    z = false;
                    for (int i14 = 0; i14 < og9VarArr.length; i14++) {
                        if (!zArr[i14] && (i3 = og9VarArr[i14].e) > i13) {
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
                    for (int i17 = 0; i17 < og9VarArr.length; i17++) {
                        if (!zArr[i17]) {
                            og9 og9Var5 = og9VarArr[i17];
                            int i18 = i16 - 1;
                            if (i16 > 0) {
                                i2 = 1;
                            } else {
                                i2 = 0;
                            }
                            og9Var5.e = i2 + i15;
                            i16 = i18;
                        }
                    }
                }
            }
            for (og9 og9Var6 : og9VarArr) {
                i7 += og9Var6.e;
            }
            int F = ug8.F(i9);
            if (F != 1) {
                if (F != 2) {
                    i4 = 0;
                } else {
                    i4 = (i - i7) / 2;
                }
            } else {
                i4 = i - i7;
            }
            for (og9 og9Var7 : og9VarArr) {
                og9Var7.d = i4;
                i4 += og9Var7.e + L;
            }
        }
    }

    public final void l0(og9 og9Var) {
        og9 og9Var2 = this.a0;
        if (og9Var2 != og9Var) {
            if (og9Var2 != null) {
                og9Var2.m(false);
            }
            this.a0 = og9Var;
            if (og9Var != null) {
                og9Var.m(true);
            }
        }
    }

    public final void m0() {
        rh9 rh9Var = this.a;
        int i = rh9Var.C;
        int i2 = rh9Var.S;
        Rect rect = this.b;
        int max = Math.max(0, ((((i + i2) + rh9Var.T) - (i2 << 1)) - rect.left) - rect.right);
        if (this.Z != max) {
            k0(max);
        }
    }

    @Override
    public final void q(Canvas canvas) {
        og9[] og9VarArr;
        m0();
        for (og9 og9Var : this.X) {
            canvas.save();
            canvas.translate(og9Var.d, Math.round((I() - og9Var.c()) / 2.0f));
            og9Var.a(canvas);
            canvas.restore();
        }
    }
}
