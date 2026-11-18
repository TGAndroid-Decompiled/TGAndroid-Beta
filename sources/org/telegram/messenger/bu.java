package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class bu extends zt {
    public final au[] X;
    public final int Y;
    public int Z;
    public au f23130a0;
    public au f23131b0;
    public final org.telegram.ui.Cells.m9 f23132c0;

    public bu(ev evVar, Rect rect, int i7, TL_iv.pageBlockButtonRow pageblockbuttonrow) {
        super(evVar, rect, i7);
        this.Z = -1;
        this.f23132c0 = new org.telegram.ui.Cells.m9(new h9.g1(this, 25));
        this.X = new au[pageblockbuttonrow.buttons.size()];
        int size = pageblockbuttonrow.buttons.size();
        for (int i10 = 0; i10 < size; i10++) {
            au[] auVarArr = this.X;
            TL_keyboard.PageButton pageButton = pageblockbuttonrow.buttons.get(i10);
            auVarArr[i10] = new au(evVar, i7, evVar.l(pageButton.text, ev.R(16, 13)), pageButton, pageButton.type, pageButton.style, cg.c.c(pageButton, TL_keyboard.TL_inlineButtonTypeDisabled.class), false, false, false, false, null, new xr(this, 5));
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

    public static au i0(bu buVar, float f10, float f11) {
        int c10;
        int i7;
        buVar.m0();
        au[] auVarArr = buVar.X;
        if (auVarArr.length == 0) {
            c10 = g0.L(buVar.f28349a.M + 18);
        } else {
            c10 = auVarArr[0].c();
        }
        float I = (buVar.I() - c10) / 2.0f;
        if (f11 >= I && f11 <= I + c10) {
            for (au auVar : auVarArr) {
                if (f10 >= auVar.d && f10 <= i7 + auVar.f22949e) {
                    return auVar;
                }
            }
            return null;
        }
        return null;
    }

    public static void j0(bu buVar, au auVar) {
        au auVar2 = buVar.f23130a0;
        if (auVar2 != auVar) {
            if (auVar2 != null) {
                auVar2.m(false);
            }
            buVar.f23130a0 = auVar;
            if (auVar != null) {
                auVar.m(true);
            }
        }
    }

    @Override
    public final int I() {
        int c10;
        au[] auVarArr = this.X;
        if (auVarArr.length == 0) {
            c10 = g0.L(this.f28349a.M + 18);
        } else {
            c10 = auVarArr[0].c();
        }
        Rect rect = this.f28350b;
        return g0.L(4.333f) + rect.top + c10 + rect.bottom;
    }

    @Override
    public final int K() {
        Rect rect = this.f28350b;
        return k0() + rect.left + rect.right;
    }

    @Override
    public final boolean Q() {
        if (this.f23131b0 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void T() {
        au[] auVarArr;
        for (au auVar : this.X) {
            auVar.f22946a.i(this.W);
        }
    }

    @Override
    public final void V() {
        au[] auVarArr;
        for (au auVar : this.X) {
            auVar.f22946a.f(this.W);
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        View view = this.W;
        if (view == null) {
            return false;
        }
        return this.f23132c0.a(view, motionEvent);
    }

    public final int k0() {
        au[] auVarArr = this.X;
        int length = auVarArr.length;
        if (length == 0) {
            return 0;
        }
        int L = (length - 1) * g0.L(7.0f);
        for (au auVar : auVarArr) {
            L += auVar.h();
        }
        return Math.min(this.f28351c, L);
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
        au[] auVarArr = this.X;
        int length = auVarArr.length;
        if (length != 0) {
            int L = g0.L(7.0f);
            int i17 = 1;
            int i18 = (length - 1) * L;
            int max = Math.max(0, i7 - i18);
            int i19 = 0;
            for (au auVar : auVarArr) {
                int h = auVar.h();
                auVar.f22949e = h;
                i19 += h;
            }
            int i20 = this.Y;
            if (i19 > max) {
                int i21 = 0;
                for (au auVar2 : auVarArr) {
                    i21 += auVar2.f22949e - auVar2.e();
                }
                if (i21 <= 0) {
                    for (au auVar3 : auVarArr) {
                        auVar3.f22949e = auVar3.e();
                    }
                } else {
                    int min = Math.min(i19 - max, i21);
                    int i22 = 0;
                    int i23 = 0;
                    while (i22 < auVarArr.length) {
                        au auVar4 = auVarArr[i22];
                        int e10 = auVar4.f22949e - auVar4.e();
                        if (i22 == auVarArr.length - i17) {
                            i16 = min - i23;
                            i14 = i17;
                            i15 = min;
                        } else {
                            i14 = i17;
                            i15 = min;
                            i16 = (int) ((min * e10) / i21);
                        }
                        int min2 = Math.min(i16, e10);
                        auVar4.f22949e -= min2;
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
                    boolean[] zArr = new boolean[auVarArr.length];
                    int length2 = auVarArr.length;
                    for (boolean z11 = true; z11 && length2 > 0; z11 = z10) {
                        int i24 = max / length2;
                        z10 = false;
                        for (int i25 = 0; i25 < auVarArr.length; i25++) {
                            if (!zArr[i25] && (i12 = auVarArr[i25].f22949e) > i24) {
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
                        for (int i28 = 0; i28 < auVarArr.length; i28++) {
                            if (!zArr[i28]) {
                                au auVar5 = auVarArr[i28];
                                int i29 = i27 - 1;
                                if (i27 > 0) {
                                    i11 = 1;
                                } else {
                                    i11 = 0;
                                }
                                auVar5.f22949e = i11 + i26;
                                i27 = i29;
                            }
                        }
                    }
                }
            }
            for (au auVar6 : auVarArr) {
                i18 += auVar6.f22949e;
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
            for (au auVar7 : auVarArr) {
                auVar7.d = i13;
                i13 += auVar7.f22949e + L;
            }
        }
    }

    public final void m0() {
        ev evVar = this.f28349a;
        int i7 = evVar.C;
        int i10 = evVar.S;
        Rect rect = this.f28350b;
        int max = Math.max(0, ((((i7 + i10) + evVar.T) - (i10 * 2)) - rect.left) - rect.right);
        if (this.Z != max) {
            l0(max);
        }
    }

    @Override
    public final void q(Canvas canvas) {
        au[] auVarArr;
        m0();
        for (au auVar : this.X) {
            canvas.save();
            canvas.translate(auVar.d, Math.round((I() - auVar.c()) / 2.0f));
            auVar.a(canvas);
            canvas.restore();
        }
    }
}
