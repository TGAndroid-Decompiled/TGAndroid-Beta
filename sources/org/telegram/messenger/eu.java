package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class eu extends cu {
    public final du[] X;
    public final int Y;
    public int Z;
    public du f23367a0;
    public du f23368b0;
    public final org.telegram.ui.Cells.k9 f23369c0;

    public eu(iv ivVar, Rect rect, int i7, TL_iv.pageBlockButtonRow pageblockbuttonrow) {
        super(ivVar, rect, i7);
        this.Z = -1;
        this.f23369c0 = new org.telegram.ui.Cells.k9(new hi.l0(this, 25));
        this.X = new du[pageblockbuttonrow.buttons.size()];
        int size = pageblockbuttonrow.buttons.size();
        for (int i10 = 0; i10 < size; i10++) {
            du[] duVarArr = this.X;
            TL_keyboard.PageButton pageButton = pageblockbuttonrow.buttons.get(i10);
            duVarArr[i10] = new du(ivVar, i7, ivVar.l(pageButton.text, iv.R(16, 13)), pageButton, pageButton.type, pageButton.style, cg.c.c(pageButton, TL_keyboard.TL_inlineButtonTypeDisabled.class), false, false, false, false, null, new as(this, 5));
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

    public static du i0(eu euVar, float f10, float f11) {
        int c10;
        int i7;
        euVar.m0();
        du[] duVarArr = euVar.X;
        if (duVarArr.length == 0) {
            c10 = g0.L(euVar.f22941a.M + 18);
        } else {
            c10 = duVarArr[0].c();
        }
        float I = (euVar.I() - c10) / 2.0f;
        if (f11 >= I && f11 <= I + c10) {
            for (du duVar : duVarArr) {
                if (f10 >= duVar.d && f10 <= i7 + duVar.f23144e) {
                    return duVar;
                }
            }
            return null;
        }
        return null;
    }

    public static void j0(eu euVar, du duVar) {
        du duVar2 = euVar.f23367a0;
        if (duVar2 != duVar) {
            if (duVar2 != null) {
                duVar2.m(false);
            }
            euVar.f23367a0 = duVar;
            if (duVar != null) {
                duVar.m(true);
            }
        }
    }

    @Override
    public final int I() {
        int c10;
        du[] duVarArr = this.X;
        if (duVarArr.length == 0) {
            c10 = g0.L(this.f22941a.M + 18);
        } else {
            c10 = duVarArr[0].c();
        }
        Rect rect = this.f22942b;
        return g0.L(4.333f) + rect.top + c10 + rect.bottom;
    }

    @Override
    public final int K() {
        Rect rect = this.f22942b;
        return k0() + rect.left + rect.right;
    }

    @Override
    public final boolean Q() {
        if (this.f23368b0 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void T() {
        du[] duVarArr;
        for (du duVar : this.X) {
            duVar.f23141a.i(this.W);
        }
    }

    @Override
    public final void V() {
        du[] duVarArr;
        for (du duVar : this.X) {
            duVar.f23141a.f(this.W);
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        View view = this.W;
        if (view == null) {
            return false;
        }
        return this.f23369c0.a(view, motionEvent);
    }

    public final int k0() {
        du[] duVarArr = this.X;
        int length = duVarArr.length;
        if (length == 0) {
            return 0;
        }
        int L = (length - 1) * g0.L(7.0f);
        for (du duVar : duVarArr) {
            L += duVar.h();
        }
        return Math.min(this.f22943c, L);
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
        du[] duVarArr = this.X;
        int length = duVarArr.length;
        if (length != 0) {
            int L = g0.L(7.0f);
            int i17 = 1;
            int i18 = (length - 1) * L;
            int max = Math.max(0, i7 - i18);
            int i19 = 0;
            for (du duVar : duVarArr) {
                int h = duVar.h();
                duVar.f23144e = h;
                i19 += h;
            }
            int i20 = this.Y;
            if (i19 > max) {
                int i21 = 0;
                for (du duVar2 : duVarArr) {
                    i21 += duVar2.f23144e - duVar2.e();
                }
                if (i21 <= 0) {
                    for (du duVar3 : duVarArr) {
                        duVar3.f23144e = duVar3.e();
                    }
                } else {
                    int min = Math.min(i19 - max, i21);
                    int i22 = 0;
                    int i23 = 0;
                    while (i22 < duVarArr.length) {
                        du duVar4 = duVarArr[i22];
                        int e10 = duVar4.f23144e - duVar4.e();
                        if (i22 == duVarArr.length - i17) {
                            i16 = min - i23;
                            i14 = i17;
                            i15 = min;
                        } else {
                            i14 = i17;
                            i15 = min;
                            i16 = (int) ((min * e10) / i21);
                        }
                        int min2 = Math.min(i16, e10);
                        duVar4.f23144e -= min2;
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
                    boolean[] zArr = new boolean[duVarArr.length];
                    int length2 = duVarArr.length;
                    for (boolean z11 = true; z11 && length2 > 0; z11 = z10) {
                        int i24 = max / length2;
                        z10 = false;
                        for (int i25 = 0; i25 < duVarArr.length; i25++) {
                            if (!zArr[i25] && (i12 = duVarArr[i25].f23144e) > i24) {
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
                        for (int i28 = 0; i28 < duVarArr.length; i28++) {
                            if (!zArr[i28]) {
                                du duVar5 = duVarArr[i28];
                                int i29 = i27 - 1;
                                if (i27 > 0) {
                                    i11 = 1;
                                } else {
                                    i11 = 0;
                                }
                                duVar5.f23144e = i11 + i26;
                                i27 = i29;
                            }
                        }
                    }
                }
            }
            for (du duVar6 : duVarArr) {
                i18 += duVar6.f23144e;
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
            for (du duVar7 : duVarArr) {
                duVar7.d = i13;
                i13 += duVar7.f23144e + L;
            }
        }
    }

    public final void m0() {
        iv ivVar = this.f22941a;
        int i7 = ivVar.C;
        int i10 = ivVar.S;
        Rect rect = this.f22942b;
        int max = Math.max(0, ((((i7 + i10) + ivVar.T) - (i10 * 2)) - rect.left) - rect.right);
        if (this.Z != max) {
            l0(max);
        }
    }

    @Override
    public final void q(Canvas canvas) {
        du[] duVarArr;
        m0();
        for (du duVar : this.X) {
            canvas.save();
            canvas.translate(duVar.d, Math.round((I() - duVar.c()) / 2.0f));
            duVar.a(canvas);
            canvas.restore();
        }
    }
}
