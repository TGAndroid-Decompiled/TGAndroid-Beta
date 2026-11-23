package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class cu extends au {
    public final bu[] X;
    public final int Y;
    public int Z;
    public bu f23372a0;
    public bu f23373b0;
    public final org.telegram.ui.Cells.m9 f23374c0;

    public cu(fv fvVar, Rect rect, int i7, TL_iv.pageBlockButtonRow pageblockbuttonrow) {
        super(fvVar, rect, i7);
        this.Z = -1;
        this.f23374c0 = new org.telegram.ui.Cells.m9(new h9.g1(this, 25));
        this.X = new bu[pageblockbuttonrow.buttons.size()];
        int size = pageblockbuttonrow.buttons.size();
        for (int i10 = 0; i10 < size; i10++) {
            bu[] buVarArr = this.X;
            TL_keyboard.PageButton pageButton = pageblockbuttonrow.buttons.get(i10);
            buVarArr[i10] = new bu(fvVar, i7, fvVar.l(pageButton.text, fv.R(16, 13)), pageButton, pageButton.type, pageButton.style, cg.c.c(pageButton, TL_keyboard.TL_inlineButtonTypeDisabled.class), false, false, false, false, null, new yr(this, 5));
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
        l0(k0());
    }

    public static bu i0(cu cuVar, float f10, float f11) {
        int c10;
        int i7;
        cuVar.m0();
        bu[] buVarArr = cuVar.X;
        if (buVarArr.length == 0) {
            c10 = g0.L(cuVar.f22968a.M + 18);
        } else {
            c10 = buVarArr[0].c();
        }
        float I = (cuVar.I() - c10) / 2.0f;
        if (f11 >= I && f11 <= I + c10) {
            for (bu buVar : buVarArr) {
                if (f10 >= buVar.d && f10 <= i7 + buVar.f23164e) {
                    return buVar;
                }
            }
            return null;
        }
        return null;
    }

    public static void j0(cu cuVar, bu buVar) {
        bu buVar2 = cuVar.f23372a0;
        if (buVar2 != buVar) {
            if (buVar2 != null) {
                buVar2.m(false);
            }
            cuVar.f23372a0 = buVar;
            if (buVar != null) {
                buVar.m(true);
            }
        }
    }

    @Override
    public final int I() {
        int c10;
        bu[] buVarArr = this.X;
        if (buVarArr.length == 0) {
            c10 = g0.L(this.f22968a.M + 18);
        } else {
            c10 = buVarArr[0].c();
        }
        Rect rect = this.f22969b;
        return g0.L(4.333f) + rect.top + c10 + rect.bottom;
    }

    @Override
    public final int K() {
        Rect rect = this.f22969b;
        return k0() + rect.left + rect.right;
    }

    @Override
    public final boolean Q() {
        if (this.f23373b0 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void T() {
        bu[] buVarArr;
        for (bu buVar : this.X) {
            buVar.f23161a.i(this.W);
        }
    }

    @Override
    public final void V() {
        bu[] buVarArr;
        for (bu buVar : this.X) {
            buVar.f23161a.f(this.W);
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        View view = this.W;
        if (view == null) {
            return false;
        }
        return this.f23374c0.a(view, motionEvent);
    }

    public final int k0() {
        bu[] buVarArr = this.X;
        int length = buVarArr.length;
        if (length == 0) {
            return 0;
        }
        int L = (length - 1) * g0.L(7.0f);
        for (bu buVar : buVarArr) {
            L += buVar.h();
        }
        return Math.min(this.f22970c, L);
    }

    public final void l0(int i7) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        this.Z = i7;
        bu[] buVarArr = this.X;
        int length = buVarArr.length;
        if (length != 0) {
            int L = g0.L(7.0f);
            int i17 = 1;
            int i18 = (length - 1) * L;
            int max = Math.max(0, i7 - i18);
            int i19 = 0;
            for (bu buVar : buVarArr) {
                int h = buVar.h();
                buVar.f23164e = h;
                i19 += h;
            }
            int i20 = this.Y;
            if (i19 > max) {
                int i21 = 0;
                for (bu buVar2 : buVarArr) {
                    i21 += buVar2.f23164e - buVar2.e();
                }
                if (i21 <= 0) {
                    for (bu buVar3 : buVarArr) {
                        buVar3.f23164e = buVar3.e();
                    }
                } else {
                    int min = Math.min(i19 - max, i21);
                    int i22 = 0;
                    int i23 = 0;
                    while (i22 < buVarArr.length) {
                        bu buVar4 = buVarArr[i22];
                        int e10 = buVar4.f23164e - buVar4.e();
                        if (i22 == buVarArr.length - i17) {
                            i16 = min - i23;
                            i14 = i17;
                            i15 = min;
                        } else {
                            i14 = i17;
                            i15 = min;
                            i16 = (int) ((min * e10) / i21);
                        }
                        int min2 = Math.min(i16, e10);
                        buVar4.f23164e -= min2;
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
                    boolean[] zArr = new boolean[buVarArr.length];
                    int length2 = buVarArr.length;
                    for (boolean z11 = true; z11 && length2 > 0; z11 = z10) {
                        int i24 = max / length2;
                        z10 = false;
                        for (int i25 = 0; i25 < buVarArr.length; i25++) {
                            if (!zArr[i25] && (i12 = buVarArr[i25].f23164e) > i24) {
                                zArr[i25] = true;
                                max -= i12;
                                length2--;
                                z10 = true;
                            }
                        }
                    }
                    if (length2 > 0) {
                        int i26 = max / length2;
                        int i27 = max - (length2 * i26);
                        for (int i28 = 0; i28 < buVarArr.length; i28++) {
                            if (!zArr[i28]) {
                                bu buVar5 = buVarArr[i28];
                                int i29 = i27 - 1;
                                if (i27 > 0) {
                                    i11 = 1;
                                } else {
                                    i11 = 0;
                                }
                                buVar5.f23164e = i11 + i26;
                                i27 = i29;
                            }
                        }
                    }
                }
            }
            for (bu buVar6 : buVarArr) {
                i18 += buVar6.f23164e;
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
            for (bu buVar7 : buVarArr) {
                buVar7.d = i13;
                i13 += buVar7.f23164e + L;
            }
        }
    }

    public final void m0() {
        fv fvVar = this.f22968a;
        int i7 = fvVar.C;
        int i10 = fvVar.S;
        Rect rect = this.f22969b;
        int max = Math.max(0, ((((i7 + i10) + fvVar.T) - (i10 * 2)) - rect.left) - rect.right);
        if (this.Z != max) {
            l0(max);
        }
    }

    @Override
    public final void q(Canvas canvas) {
        bu[] buVarArr;
        m0();
        for (bu buVar : this.X) {
            canvas.save();
            canvas.translate(buVar.d, Math.round((I() - buVar.c()) / 2.0f));
            buVar.a(canvas);
            canvas.restore();
        }
    }
}
