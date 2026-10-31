package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class su extends qu {
    public final ru[] W;
    public final int X;
    public int Y;
    public ru Z;
    public ru f17957a0;
    public final ge.b f17958b0;

    public su(vv vvVar, Rect rect, int i10, TL_iv.pageBlockButtonRow pageblockbuttonrow) {
        super(vvVar, rect, i10);
        this.Y = -1;
        this.f17958b0 = new ge.b(new l2.f(this, 11));
        this.W = new ru[pageblockbuttonrow.buttons.size()];
        int size = pageblockbuttonrow.buttons.size();
        for (int i11 = 0; i11 < size; i11++) {
            ru[] ruVarArr = this.W;
            TL_keyboard.PageButton pageButton = pageblockbuttonrow.buttons.get(i11);
            ruVarArr[i11] = new ru(vvVar, i10, vvVar.l(pageButton.text, vv.R(16, 13)), pageButton, pageButton.type, pageButton.style, sf.c.c(pageButton, TL_keyboard.TL_inlineButtonTypeDisabled.class), false, false, false, false, null, new ms(this, 6));
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
        k0(j0());
    }

    public static ru h0(su suVar, float f7, float f10) {
        int c10;
        int i10;
        suVar.l0();
        ru[] ruVarArr = suVar.W;
        if (ruVarArr.length == 0) {
            c10 = i0.L(suVar.f17621a.M + 18);
        } else {
            c10 = ruVarArr[0].c();
        }
        float H = (suVar.H() - c10) / 2.0f;
        if (f10 >= H && f10 <= H + c10) {
            for (ru ruVar : ruVarArr) {
                if (f7 >= ruVar.d && f7 <= i10 + ruVar.e) {
                    return ruVar;
                }
            }
            return null;
        }
        return null;
    }

    public static void i0(su suVar, ru ruVar) {
        ru ruVar2 = suVar.Z;
        if (ruVar2 != ruVar) {
            if (ruVar2 != null) {
                ruVar2.m(false);
            }
            suVar.Z = ruVar;
            if (ruVar != null) {
                ruVar.m(true);
            }
        }
    }

    @Override
    public final int H() {
        int c10;
        ru[] ruVarArr = this.W;
        if (ruVarArr.length == 0) {
            c10 = i0.L(this.f17621a.M + 18);
        } else {
            c10 = ruVarArr[0].c();
        }
        Rect rect = this.f17622b;
        return i0.L(4.333f) + rect.top + c10 + rect.bottom;
    }

    @Override
    public final int J() {
        Rect rect = this.f17622b;
        return j0() + rect.left + rect.right;
    }

    @Override
    public final boolean P() {
        if (this.f17957a0 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void S() {
        ru[] ruVarArr;
        for (ru ruVar : this.W) {
            ruVar.f17780a.i(this.V);
        }
    }

    @Override
    public final void U() {
        ru[] ruVarArr;
        for (ru ruVar : this.W) {
            ruVar.f17780a.f(this.V);
        }
    }

    @Override
    public final boolean X(MotionEvent motionEvent) {
        View view = this.V;
        if (view == null) {
            return false;
        }
        return this.f17958b0.a(view, motionEvent);
    }

    public final int j0() {
        ru[] ruVarArr = this.W;
        int length = ruVarArr.length;
        if (length == 0) {
            return 0;
        }
        int L = (length - 1) * i0.L(7.0f);
        for (ru ruVar : ruVarArr) {
            L += ruVar.h();
        }
        return Math.min(this.f17623c, L);
    }

    public final void k0(int i10) {
        int i11;
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        this.Y = i10;
        ru[] ruVarArr = this.W;
        int length = ruVarArr.length;
        if (length != 0) {
            int L = i0.L(7.0f);
            int i18 = 1;
            int i19 = (length - 1) * L;
            int max = Math.max(0, i10 - i19);
            int i20 = 0;
            for (ru ruVar : ruVarArr) {
                int h = ruVar.h();
                ruVar.e = h;
                i20 += h;
            }
            int i21 = this.X;
            if (i20 > max) {
                int i22 = 0;
                for (ru ruVar2 : ruVarArr) {
                    i22 += ruVar2.e - ruVar2.e();
                }
                if (i22 <= 0) {
                    for (ru ruVar3 : ruVarArr) {
                        ruVar3.e = ruVar3.e();
                    }
                } else {
                    int min = Math.min(i20 - max, i22);
                    int i23 = 0;
                    int i24 = 0;
                    while (i23 < ruVarArr.length) {
                        ru ruVar4 = ruVarArr[i23];
                        int e = ruVar4.e - ruVar4.e();
                        if (i23 == ruVarArr.length - i18) {
                            i17 = min - i24;
                            i15 = i18;
                            i16 = min;
                        } else {
                            i15 = i18;
                            i16 = min;
                            i17 = (int) ((min * e) / i22);
                        }
                        int min2 = Math.min(i17, e);
                        ruVar4.e -= min2;
                        i24 += min2;
                        i23++;
                        i18 = i15;
                        min = i16;
                    }
                }
                i11 = i18;
            } else {
                i11 = 1;
                if (i21 == 4) {
                    boolean[] zArr = new boolean[ruVarArr.length];
                    int length2 = ruVarArr.length;
                    for (boolean z11 = true; z11 && length2 > 0; z11 = z10) {
                        int i25 = max / length2;
                        z10 = false;
                        for (int i26 = 0; i26 < ruVarArr.length; i26++) {
                            if (!zArr[i26] && (i13 = ruVarArr[i26].e) > i25) {
                                zArr[i26] = true;
                                max -= i13;
                                length2--;
                                z10 = true;
                            }
                        }
                    }
                    if (length2 > 0) {
                        int i27 = max / length2;
                        int i28 = max - (length2 * i27);
                        for (int i29 = 0; i29 < ruVarArr.length; i29++) {
                            if (!zArr[i29]) {
                                ru ruVar5 = ruVarArr[i29];
                                int i30 = i28 - 1;
                                if (i28 > 0) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                                ruVar5.e = i12 + i27;
                                i28 = i30;
                            }
                        }
                    }
                }
            }
            for (ru ruVar6 : ruVarArr) {
                i19 += ruVar6.e;
            }
            int c10 = m1.j.c(i21);
            if (c10 != i11) {
                if (c10 != 2) {
                    i14 = 0;
                } else {
                    i14 = (i10 - i19) / 2;
                }
            } else {
                i14 = i10 - i19;
            }
            for (ru ruVar7 : ruVarArr) {
                ruVar7.d = i14;
                i14 += ruVar7.e + L;
            }
        }
    }

    public final void l0() {
        vv vvVar = this.f17621a;
        int i10 = vvVar.C;
        int i11 = vvVar.S;
        Rect rect = this.f17622b;
        int max = Math.max(0, ((((i10 + i11) + vvVar.T) - (i11 * 2)) - rect.left) - rect.right);
        if (this.Y != max) {
            k0(max);
        }
    }

    @Override
    public final void q(Canvas canvas) {
        ru[] ruVarArr;
        l0();
        for (ru ruVar : this.W) {
            canvas.save();
            canvas.translate(ruVar.d, Math.round((H() - ruVar.c()) / 2.0f));
            ruVar.a(canvas);
            canvas.restore();
        }
    }
}
