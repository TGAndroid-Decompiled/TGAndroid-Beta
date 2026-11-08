package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class hu extends fu {
    public final gu[] W;
    public final int X;
    public int Y;
    public gu Z;
    public gu f22970a0;
    public final org.telegram.ui.Cells.l9 f22971b0;

    public hu(kv kvVar, Rect rect, int i7, TL_iv.pageBlockButtonRow pageblockbuttonrow) {
        super(kvVar, rect, i7);
        this.Y = -1;
        this.f22971b0 = new org.telegram.ui.Cells.l9(new gf.g(this, 25));
        this.W = new gu[pageblockbuttonrow.buttons.size()];
        int size = pageblockbuttonrow.buttons.size();
        for (int i10 = 0; i10 < size; i10++) {
            gu[] guVarArr = this.W;
            TL_keyboard.PageButton pageButton = pageblockbuttonrow.buttons.get(i10);
            guVarArr[i10] = new gu(kvVar, i7, kvVar.l(pageButton.text, kv.R(16, 13)), pageButton, pageButton.type, pageButton.style, cg.c.c(pageButton, TL_keyboard.TL_inlineButtonTypeDisabled.class), false, false, false, false, null, new ds(this, 5));
        }
        if (pageblockbuttonrow.align_left) {
            this.X = 1;
        } else if (pageblockbuttonrow.align_center) {
            this.X = 3;
        } else if (pageblockbuttonrow.align_right) {
            this.X = 2;
        } else {
            this.X = 4;
        }
        l0(k0());
    }

    public static gu i0(hu huVar, float f10, float f11) {
        int c10;
        int i7;
        huVar.m0();
        gu[] guVarArr = huVar.W;
        if (guVarArr.length == 0) {
            c10 = g0.L(huVar.f22469a.M + 18);
        } else {
            c10 = guVarArr[0].c();
        }
        float I = (huVar.I() - c10) / 2.0f;
        if (f11 >= I && f11 <= I + c10) {
            for (gu guVar : guVarArr) {
                if (f10 >= guVar.d && f10 <= i7 + guVar.f22725e) {
                    return guVar;
                }
            }
            return null;
        }
        return null;
    }

    public static void j0(hu huVar, gu guVar) {
        gu guVar2 = huVar.Z;
        if (guVar2 != guVar) {
            if (guVar2 != null) {
                guVar2.m(false);
            }
            huVar.Z = guVar;
            if (guVar != null) {
                guVar.m(true);
            }
        }
    }

    @Override
    public final int I() {
        int c10;
        gu[] guVarArr = this.W;
        if (guVarArr.length == 0) {
            c10 = g0.L(this.f22469a.M + 18);
        } else {
            c10 = guVarArr[0].c();
        }
        Rect rect = this.f22470b;
        return g0.L(4.333f) + rect.top + c10 + rect.bottom;
    }

    @Override
    public final int K() {
        Rect rect = this.f22470b;
        return k0() + rect.left + rect.right;
    }

    @Override
    public final boolean Q() {
        if (this.f22970a0 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void T() {
        gu[] guVarArr;
        for (gu guVar : this.W) {
            guVar.f22722a.i(this.V);
        }
    }

    @Override
    public final void V() {
        gu[] guVarArr;
        for (gu guVar : this.W) {
            guVar.f22722a.f(this.V);
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        View view = this.V;
        if (view == null) {
            return false;
        }
        return this.f22971b0.a(view, motionEvent);
    }

    public final int k0() {
        gu[] guVarArr = this.W;
        int length = guVarArr.length;
        if (length == 0) {
            return 0;
        }
        int L = (length - 1) * g0.L(7.0f);
        for (gu guVar : guVarArr) {
            L += guVar.h();
        }
        return Math.min(this.f22471c, L);
    }

    public final void l0(int i7) {
        int i10;
        int i11;
        boolean z9;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        this.Y = i7;
        gu[] guVarArr = this.W;
        int length = guVarArr.length;
        if (length != 0) {
            int L = g0.L(7.0f);
            int i17 = 1;
            int i18 = (length - 1) * L;
            int max = Math.max(0, i7 - i18);
            int i19 = 0;
            for (gu guVar : guVarArr) {
                int h = guVar.h();
                guVar.f22725e = h;
                i19 += h;
            }
            int i20 = this.X;
            if (i19 > max) {
                int i21 = 0;
                for (gu guVar2 : guVarArr) {
                    i21 += guVar2.f22725e - guVar2.e();
                }
                if (i21 <= 0) {
                    for (gu guVar3 : guVarArr) {
                        guVar3.f22725e = guVar3.e();
                    }
                } else {
                    int min = Math.min(i19 - max, i21);
                    int i22 = 0;
                    int i23 = 0;
                    while (i22 < guVarArr.length) {
                        gu guVar4 = guVarArr[i22];
                        int e10 = guVar4.f22725e - guVar4.e();
                        if (i22 == guVarArr.length - i17) {
                            i16 = min - i23;
                            i14 = i17;
                            i15 = min;
                        } else {
                            i14 = i17;
                            i15 = min;
                            i16 = (int) ((min * e10) / i21);
                        }
                        int min2 = Math.min(i16, e10);
                        guVar4.f22725e -= min2;
                        i23 += min2;
                        i22++;
                        i17 = i14;
                        min = i15;
                    }
                }
                i10 = i17;
            } else {
                i10 = 1;
                if (i20 == 4) {
                    boolean[] zArr = new boolean[guVarArr.length];
                    int length2 = guVarArr.length;
                    for (boolean z10 = true; z10 && length2 > 0; z10 = z9) {
                        int i24 = max / length2;
                        z9 = false;
                        for (int i25 = 0; i25 < guVarArr.length; i25++) {
                            if (!zArr[i25] && (i12 = guVarArr[i25].f22725e) > i24) {
                                zArr[i25] = true;
                                max -= i12;
                                length2--;
                                z9 = true;
                            }
                        }
                    }
                    if (length2 > 0) {
                        int i26 = max / length2;
                        int i27 = max - (length2 * i26);
                        for (int i28 = 0; i28 < guVarArr.length; i28++) {
                            if (!zArr[i28]) {
                                gu guVar5 = guVarArr[i28];
                                int i29 = i27 - 1;
                                if (i27 > 0) {
                                    i11 = 1;
                                } else {
                                    i11 = 0;
                                }
                                guVar5.f22725e = i11 + i26;
                                i27 = i29;
                            }
                        }
                    }
                }
            }
            for (gu guVar6 : guVarArr) {
                i18 += guVar6.f22725e;
            }
            int c10 = p1.g.c(i20);
            if (c10 != i10) {
                if (c10 != 2) {
                    i13 = 0;
                } else {
                    i13 = (i7 - i18) / 2;
                }
            } else {
                i13 = i7 - i18;
            }
            for (gu guVar7 : guVarArr) {
                guVar7.d = i13;
                i13 += guVar7.f22725e + L;
            }
        }
    }

    public final void m0() {
        kv kvVar = this.f22469a;
        int i7 = kvVar.C;
        int i10 = kvVar.S;
        Rect rect = this.f22470b;
        int max = Math.max(0, ((((i7 + i10) + kvVar.T) - (i10 * 2)) - rect.left) - rect.right);
        if (this.Y != max) {
            l0(max);
        }
    }

    @Override
    public final void q(Canvas canvas) {
        gu[] guVarArr;
        m0();
        for (gu guVar : this.W) {
            canvas.save();
            canvas.translate(guVar.d, Math.round((I() - guVar.c()) / 2.0f));
            guVar.a(canvas);
            canvas.restore();
        }
    }
}
