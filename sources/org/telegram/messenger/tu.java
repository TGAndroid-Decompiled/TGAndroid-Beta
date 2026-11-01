package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class tu extends ru {
    public final su[] W;
    public final int X;
    public int Y;
    public su Z;
    public su f18308a0;
    public final ge.b f18309b0;

    public tu(wv wvVar, Rect rect, int i10, TL_iv.pageBlockButtonRow pageblockbuttonrow) {
        super(wvVar, rect, i10);
        this.Y = -1;
        this.f18309b0 = new ge.b(new l2.f(this, 11));
        this.W = new su[pageblockbuttonrow.buttons.size()];
        int size = pageblockbuttonrow.buttons.size();
        for (int i11 = 0; i11 < size; i11++) {
            su[] suVarArr = this.W;
            TL_keyboard.PageButton pageButton = pageblockbuttonrow.buttons.get(i11);
            suVarArr[i11] = new su(wvVar, i10, wvVar.l(pageButton.text, wv.R(16, 13)), pageButton, pageButton.type, pageButton.style, sf.c.c(pageButton, TL_keyboard.TL_inlineButtonTypeDisabled.class), false, false, false, false, null, new ns(this, 6));
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

    public static su h0(tu tuVar, float f7, float f10) {
        int c10;
        int i10;
        tuVar.l0();
        su[] suVarArr = tuVar.W;
        if (suVarArr.length == 0) {
            c10 = i0.L(tuVar.f17967a.M + 18);
        } else {
            c10 = suVarArr[0].c();
        }
        float H = (tuVar.H() - c10) / 2.0f;
        if (f10 >= H && f10 <= H + c10) {
            for (su suVar : suVarArr) {
                if (f7 >= suVar.d && f7 <= i10 + suVar.e) {
                    return suVar;
                }
            }
            return null;
        }
        return null;
    }

    public static void i0(tu tuVar, su suVar) {
        su suVar2 = tuVar.Z;
        if (suVar2 != suVar) {
            if (suVar2 != null) {
                suVar2.m(false);
            }
            tuVar.Z = suVar;
            if (suVar != null) {
                suVar.m(true);
            }
        }
    }

    @Override
    public final int H() {
        int c10;
        su[] suVarArr = this.W;
        if (suVarArr.length == 0) {
            c10 = i0.L(this.f17967a.M + 18);
        } else {
            c10 = suVarArr[0].c();
        }
        Rect rect = this.f17968b;
        return i0.L(4.333f) + rect.top + c10 + rect.bottom;
    }

    @Override
    public final int J() {
        Rect rect = this.f17968b;
        return j0() + rect.left + rect.right;
    }

    @Override
    public final boolean P() {
        if (this.f18308a0 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void S() {
        su[] suVarArr;
        for (su suVar : this.W) {
            suVar.f18144a.i(this.V);
        }
    }

    @Override
    public final void U() {
        su[] suVarArr;
        for (su suVar : this.W) {
            suVar.f18144a.f(this.V);
        }
    }

    @Override
    public final boolean X(MotionEvent motionEvent) {
        View view = this.V;
        if (view == null) {
            return false;
        }
        return this.f18309b0.a(view, motionEvent);
    }

    public final int j0() {
        su[] suVarArr = this.W;
        int length = suVarArr.length;
        if (length == 0) {
            return 0;
        }
        int L = (length - 1) * i0.L(7.0f);
        for (su suVar : suVarArr) {
            L += suVar.h();
        }
        return Math.min(this.f17969c, L);
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
        su[] suVarArr = this.W;
        int length = suVarArr.length;
        if (length != 0) {
            int L = i0.L(7.0f);
            int i18 = 1;
            int i19 = (length - 1) * L;
            int max = Math.max(0, i10 - i19);
            int i20 = 0;
            for (su suVar : suVarArr) {
                int h = suVar.h();
                suVar.e = h;
                i20 += h;
            }
            int i21 = this.X;
            if (i20 > max) {
                int i22 = 0;
                for (su suVar2 : suVarArr) {
                    i22 += suVar2.e - suVar2.e();
                }
                if (i22 <= 0) {
                    for (su suVar3 : suVarArr) {
                        suVar3.e = suVar3.e();
                    }
                } else {
                    int min = Math.min(i20 - max, i22);
                    int i23 = 0;
                    int i24 = 0;
                    while (i23 < suVarArr.length) {
                        su suVar4 = suVarArr[i23];
                        int e = suVar4.e - suVar4.e();
                        if (i23 == suVarArr.length - i18) {
                            i17 = min - i24;
                            i15 = i18;
                            i16 = min;
                        } else {
                            i15 = i18;
                            i16 = min;
                            i17 = (int) ((min * e) / i22);
                        }
                        int min2 = Math.min(i17, e);
                        suVar4.e -= min2;
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
                    boolean[] zArr = new boolean[suVarArr.length];
                    int length2 = suVarArr.length;
                    for (boolean z11 = true; z11 && length2 > 0; z11 = z10) {
                        int i25 = max / length2;
                        z10 = false;
                        for (int i26 = 0; i26 < suVarArr.length; i26++) {
                            if (!zArr[i26] && (i13 = suVarArr[i26].e) > i25) {
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
                        for (int i29 = 0; i29 < suVarArr.length; i29++) {
                            if (!zArr[i29]) {
                                su suVar5 = suVarArr[i29];
                                int i30 = i28 - 1;
                                if (i28 > 0) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                                suVar5.e = i12 + i27;
                                i28 = i30;
                            }
                        }
                    }
                }
            }
            for (su suVar6 : suVarArr) {
                i19 += suVar6.e;
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
            for (su suVar7 : suVarArr) {
                suVar7.d = i14;
                i14 += suVar7.e + L;
            }
        }
    }

    public final void l0() {
        wv wvVar = this.f17967a;
        int i10 = wvVar.C;
        int i11 = wvVar.S;
        Rect rect = this.f17968b;
        int max = Math.max(0, ((((i10 + i11) + wvVar.T) - (i11 * 2)) - rect.left) - rect.right);
        if (this.Y != max) {
            k0(max);
        }
    }

    @Override
    public final void q(Canvas canvas) {
        su[] suVarArr;
        l0();
        for (su suVar : this.W) {
            canvas.save();
            canvas.translate(suVar.d, Math.round((H() - suVar.c()) / 2.0f));
            suVar.a(canvas);
            canvas.restore();
        }
    }
}
