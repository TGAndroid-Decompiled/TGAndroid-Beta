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
    public au f23255a0;
    public au f23256b0;
    public final org.telegram.ui.Cells.l9 f23257c0;

    public bu(ev evVar, Rect rect, int i7, TL_iv.pageBlockButtonRow pageblockbuttonrow) {
        super(evVar, rect, i7);
        this.Z = -1;
        this.f23257c0 = new org.telegram.ui.Cells.l9(new j6.r(this, 22));
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
        int d;
        int i7;
        buVar.m0();
        au[] auVarArr = buVar.X;
        if (auVarArr.length == 0) {
            d = g0.L(buVar.f28441a.M + 18);
        } else {
            d = auVarArr[0].d();
        }
        float I = (buVar.I() - d) / 2.0f;
        if (f11 >= I && f11 <= I + d) {
            for (au auVar : auVarArr) {
                if (f10 >= auVar.d && f10 <= i7 + auVar.f23060e) {
                    return auVar;
                }
            }
            return null;
        }
        return null;
    }

    public static void j0(bu buVar, au auVar) {
        au auVar2 = buVar.f23255a0;
        if (auVar2 != auVar) {
            if (auVar2 != null) {
                auVar2.n(false);
            }
            buVar.f23255a0 = auVar;
            if (auVar != null) {
                auVar.n(true);
            }
        }
    }

    @Override
    public final int I() {
        int d;
        au[] auVarArr = this.X;
        if (auVarArr.length == 0) {
            d = g0.L(this.f28441a.M + 18);
        } else {
            d = auVarArr[0].d();
        }
        Rect rect = this.f28442b;
        return g0.L(4.333f) + rect.top + d + rect.bottom;
    }

    @Override
    public final int K() {
        Rect rect = this.f28442b;
        return k0() + rect.left + rect.right;
    }

    @Override
    public final boolean Q() {
        if (this.f23256b0 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void T() {
        for (au auVar : this.X) {
            auVar.a(this.W);
        }
    }

    @Override
    public final void V() {
        au[] auVarArr;
        for (au auVar : this.X) {
            auVar.f23057a.f(this.W);
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        View view = this.W;
        if (view == null) {
            return false;
        }
        return this.f23257c0.a(view, motionEvent);
    }

    public final int k0() {
        au[] auVarArr = this.X;
        int length = auVarArr.length;
        if (length == 0) {
            return 0;
        }
        int L = (length - 1) * g0.L(7.0f);
        for (au auVar : auVarArr) {
            L += auVar.i();
        }
        return Math.min(this.f28443c, L);
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
                int i20 = auVar.i();
                auVar.f23060e = i20;
                i19 += i20;
            }
            int i21 = this.Y;
            if (i19 > max) {
                int i22 = 0;
                for (au auVar2 : auVarArr) {
                    i22 += auVar2.f23060e - auVar2.f();
                }
                if (i22 <= 0) {
                    for (au auVar3 : auVarArr) {
                        auVar3.f23060e = auVar3.f();
                    }
                } else {
                    int min = Math.min(i19 - max, i22);
                    int i23 = 0;
                    int i24 = 0;
                    while (i23 < auVarArr.length) {
                        au auVar4 = auVarArr[i23];
                        int f10 = auVar4.f23060e - auVar4.f();
                        if (i23 == auVarArr.length - i17) {
                            i16 = min - i24;
                            i14 = i17;
                            i15 = min;
                        } else {
                            i14 = i17;
                            i15 = min;
                            i16 = (int) ((min * f10) / i22);
                        }
                        int min2 = Math.min(i16, f10);
                        auVar4.f23060e -= min2;
                        i24 += min2;
                        i23++;
                        i17 = i14;
                        min = i15;
                    }
                }
                i10 = i17;
            } else {
                i10 = 1;
                if (i21 == 4) {
                    boolean[] zArr = new boolean[auVarArr.length];
                    int length2 = auVarArr.length;
                    for (boolean z11 = true; z11 && length2 > 0; z11 = z10) {
                        int i25 = max / length2;
                        z10 = false;
                        for (int i26 = 0; i26 < auVarArr.length; i26++) {
                            if (!zArr[i26] && (i12 = auVarArr[i26].f23060e) > i25) {
                                zArr[i26] = true;
                                max -= i12;
                                length2--;
                                z10 = true;
                            }
                        }
                    }
                    if (length2 > 0) {
                        int i27 = max / length2;
                        int i28 = max - (length2 * i27);
                        for (int i29 = 0; i29 < auVarArr.length; i29++) {
                            if (!zArr[i29]) {
                                au auVar5 = auVarArr[i29];
                                int i30 = i28 - 1;
                                if (i28 > 0) {
                                    i11 = 1;
                                } else {
                                    i11 = 0;
                                }
                                auVar5.f23060e = i11 + i27;
                                i28 = i30;
                            }
                        }
                    }
                }
            }
            for (au auVar6 : auVarArr) {
                i18 += auVar6.f23060e;
            }
            int c10 = p1.g.c(i21);
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
                i13 += auVar7.f23060e + L;
            }
        }
    }

    public final void m0() {
        ev evVar = this.f28441a;
        int i7 = evVar.C;
        int i10 = evVar.S;
        Rect rect = this.f28442b;
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
            canvas.translate(auVar.d, Math.round((I() - auVar.d()) / 2.0f));
            auVar.b(canvas);
            canvas.restore();
        }
    }
}
