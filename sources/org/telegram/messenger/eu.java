package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class eu extends zt {
    public static Paint f23767c0;
    public final boolean X;
    public final ArrayList Y;
    public final int[] Z;
    public final int f23768a0;
    public st f23769b0;

    public eu(ev evVar, Rect rect, int i7, TL_iv.pageBlockCollage pageblockcollage, boolean z10) {
        super(evVar, rect, i7);
        float f10;
        int i10;
        float f11;
        int round;
        float f12;
        int round2;
        int i11;
        st stVar;
        this.Y = new ArrayList();
        this.X = z10;
        int i12 = 0;
        for (int i13 = 0; i13 < pageblockcollage.items.size(); i13++) {
            TL_iv.PageBlock pageBlock = pageblockcollage.items.get(i13);
            if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                stVar = new st(evVar, (TL_iv.pageBlockPhoto) pageBlock);
            } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
                stVar = new st(evVar, (TL_iv.pageBlockVideo) pageBlock);
            } else {
                stVar = null;
            }
            if (stVar != null) {
                this.Y.add(stVar);
            }
        }
        int i14 = this.f28353c;
        ArrayList arrayList = this.Y;
        this.Z = new int[arrayList.size()];
        if (arrayList.isEmpty()) {
            this.f23768a0 = 0;
            return;
        }
        int i15 = 1;
        if (arrayList.size() == 1) {
            st stVar2 = (st) arrayList.get(0);
            float f13 = stVar2.F;
            f13 = f13 <= 0.0f ? 1.0f : f13;
            int i16 = (int) (i14 / f13);
            Point point = g0.f24121q;
            int max = (int) (Math.max(point.x, point.y) * 0.55f);
            if (i16 > max) {
                i14 = (int) (max * f13);
                i16 = max;
            }
            stVar2.l(0, 0, i14, i16);
            this.Z[0] = 15;
            this.f23768a0 = i16;
            return;
        }
        float[] fArr = new float[arrayList.size()];
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            fArr[i17] = ((st) arrayList.get(i17)).F;
        }
        xi[] e10 = ev.e(fArr);
        int i18 = 0;
        for (xi xiVar : e10) {
            i18 = Math.max(i18, (int) xiVar.d);
        }
        int i19 = i18 + 1;
        float[] fArr2 = new float[i19];
        for (xi xiVar2 : e10) {
            byte b10 = xiVar2.f27884c;
            if (b10 == xiVar2.d) {
                fArr2[b10] = Math.max(fArr2[b10], xiVar2.f27886f);
            }
        }
        int length = e10.length;
        int i20 = 0;
        while (i20 < length) {
            xi xiVar3 = e10[i20];
            int i21 = xiVar3.f27884c;
            byte b11 = xiVar3.d;
            if (i21 != b11) {
                int i22 = (b11 - i21) + i15;
                float[] fArr3 = xiVar3.f27892m;
                if (fArr3 != null && fArr3.length == i22) {
                    int i23 = 0;
                    while (i23 < i22) {
                        int i24 = xiVar3.f27884c + i23;
                        fArr2[i24] = Math.max(fArr2[i24], xiVar3.f27892m[i23]);
                        i23++;
                        i15 = i15;
                    }
                } else {
                    i11 = i15;
                    float f14 = xiVar3.f27886f / i22;
                    while (i21 <= xiVar3.d) {
                        fArr2[i21] = Math.max(fArr2[i21], f14);
                        i21++;
                    }
                    i20++;
                    i15 = i11;
                }
            }
            i11 = i15;
            i20++;
            i15 = i11;
        }
        Point point2 = g0.f24121q;
        float max2 = Math.max(point2.x, point2.y) * 0.5f;
        int[] iArr = new int[i18 + 2];
        float f15 = 0.0f;
        for (int i25 = 0; i25 <= i18; i25++) {
            iArr[i25] = Math.round(f15 * max2);
            f15 += fArr2[i25];
        }
        iArr[i19] = Math.round(f15 * max2);
        if (this.f28351a.D()) {
            f10 = 3.0f;
        } else {
            f10 = 2.0f;
        }
        int L = g0.L(f10);
        int i26 = 0;
        while (i26 < e10.length) {
            xi xiVar4 = e10[i26];
            int i27 = iArr[xiVar4.f27884c];
            int i28 = iArr[xiVar4.d + 1] - i27;
            float f16 = 1000.0f;
            if (xiVar4.f27889j > 0) {
                round = Math.round((i10 * i14) / 1000.0f);
                f11 = 1000.0f;
            } else {
                int i29 = i12;
                int i30 = i29;
                while (i29 < e10.length) {
                    if (i29 == i26) {
                        f12 = f16;
                    } else {
                        xi xiVar5 = e10[i29];
                        f12 = f16;
                        byte b12 = xiVar5.f27884c;
                        byte b13 = xiVar4.f27884c;
                        if (b12 <= b13 && xiVar5.d >= b13 && xiVar5.f27882a < xiVar4.f27882a) {
                            i30 += xiVar5.f27885e;
                        }
                    }
                    i29++;
                    f16 = f12;
                }
                f11 = f16;
                round = Math.round((i30 * i14) / f11);
            }
            if ((xiVar4.f27891l & 2) != 0) {
                round2 = i14 - round;
            } else {
                round2 = Math.round((xiVar4.f27885e * i14) / f11) - L;
            }
            if ((xiVar4.f27891l & 8) == 0) {
                i28 -= L;
            }
            ((st) arrayList.get(i26)).l(round, i27, Math.max(0, round2), Math.max(0, i28));
            this.Z[i26] = xiVar4.f27891l;
            i26++;
            i12 = 0;
        }
        this.f23768a0 = iArr[i19];
    }

    @Override
    public final void A(int i7, Rect rect) {
        if (i7 >= 0) {
            ArrayList arrayList = this.Y;
            if (i7 < arrayList.size()) {
                st stVar = (st) arrayList.get(i7);
                Rect rect2 = this.f28352b;
                int i10 = rect2.left + stVar.G;
                int i11 = ((int) this.N) + rect2.top + stVar.H;
                rect.set(i10, i11, stVar.I + i10, stVar.J + i11);
            }
        }
    }

    @Override
    public final int B() {
        return this.Y.size();
    }

    @Override
    public final CharSequence E(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.Y;
            if (i7 < arrayList.size()) {
                return ((st) arrayList.get(i7)).f();
            }
            return null;
        }
        return null;
    }

    @Override
    public final int I() {
        return this.f23768a0;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final int K() {
        Rect rect = this.f28352b;
        return rect.left + this.f28353c + rect.right;
    }

    @Override
    public final void T() {
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            st stVar = (st) obj;
            View view = this.W;
            stVar.T = view;
            ImageReceiver imageReceiver = stVar.f26852c;
            imageReceiver.H0(view);
            imageReceiver.P();
            ImageReceiver imageReceiver2 = stVar.d;
            imageReceiver2.H0(view);
            imageReceiver2.P();
            stVar.d(view);
            stVar.m(view, false);
        }
    }

    @Override
    public final boolean U(int i7, View view) {
        if (i7 >= 0) {
            ArrayList arrayList = this.Y;
            if (i7 < arrayList.size()) {
                return ((st) arrayList.get(i7)).j(view);
            }
            return false;
        }
        return false;
    }

    @Override
    public final void V() {
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            st stVar = (st) obj;
            stVar.f26852c.R();
            stVar.d.R();
            stVar.f26853e = null;
            a6.q(stVar.f26850a.f23770a).v(stVar);
        }
    }

    @Override
    public final void W(Canvas canvas) {
        int i7;
        int i10;
        float f10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f11;
        int L;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        eu euVar = this;
        boolean z14 = true;
        if (f23767c0 == null) {
            Paint paint = new Paint(1);
            f23767c0 = paint;
            paint.setColor(251658240);
        }
        boolean R = euVar.R();
        int L2 = g0.L(2.0f);
        ev evVar = euVar.f28351a;
        if (!R && !evVar.D()) {
            i7 = evVar.S - L2;
        } else {
            i7 = 0;
        }
        if (!R && !evVar.D()) {
            i10 = evVar.T - L2;
        } else {
            i10 = 0;
        }
        int i19 = euVar.f28353c;
        if (i19 > 0 && (i7 > 0 || i10 > 0)) {
            f10 = ((i19 + i7) + i10) / i19;
        } else {
            f10 = 1.0f;
        }
        int i20 = 0;
        while (true) {
            ArrayList arrayList = euVar.Y;
            if (i20 < arrayList.size()) {
                st stVar = (st) arrayList.get(i20);
                int i21 = stVar.G;
                ImageReceiver imageReceiver = stVar.f26852c;
                int round = Math.round(i21 * f10) - i7;
                int round2 = Math.round(stVar.I * f10);
                int[] iArr = euVar.Z;
                if (iArr != null && i20 < iArr.length) {
                    i11 = iArr[i20];
                } else {
                    i11 = 0;
                }
                if ((i11 & 4) != 0) {
                    z10 = z14;
                } else {
                    z10 = false;
                }
                if ((i11 & 8) != 0) {
                    z11 = z14;
                } else {
                    z11 = false;
                }
                if ((i11 & 1) != 0) {
                    z12 = z14;
                } else {
                    z12 = false;
                }
                if ((i11 & 2) != 0) {
                    z13 = z14;
                } else {
                    z13 = false;
                }
                if (R) {
                    int L3 = g0.L(8.0f);
                    if (z10 && z12) {
                        i15 = L3;
                    } else {
                        i15 = 0;
                    }
                    if (z10 && z13) {
                        i16 = L3;
                    } else {
                        i16 = 0;
                    }
                    if (z11 && z13) {
                        i17 = L3;
                    } else {
                        i17 = 0;
                    }
                    if (z11 && z12) {
                        i18 = L3;
                    } else {
                        i18 = 0;
                    }
                    imageReceiver.K0(i15, i16, i17, i18);
                    f11 = 1.0f;
                } else {
                    int i22 = bz.Y0;
                    f11 = 1.0f;
                    if (i22 > 2) {
                        L = g0.L(i22 - 2);
                    } else {
                        L = g0.L(i22);
                    }
                    int min = Math.min(g0.L(3.0f), L);
                    if (evVar.D()) {
                        imageReceiver.J0(g0.L(12.0f));
                    } else {
                        boolean z15 = euVar.X;
                        if (z10 && z12) {
                            if (z15 && !evVar.B() && (evVar.E() || !evVar.G())) {
                                i12 = L;
                            } else {
                                i12 = min;
                            }
                        } else {
                            i12 = 0;
                        }
                        if (z10 && z13) {
                            if (!z15 || evVar.B() || (evVar.E() && evVar.G())) {
                                L = min;
                            }
                        } else {
                            L = 0;
                        }
                        if (z11 && z13) {
                            i13 = min;
                        } else {
                            i13 = 0;
                        }
                        imageReceiver.K0(i12, L, i13, (z11 && z12) ? 0 : 0);
                    }
                }
                float f12 = round;
                imageReceiver.y0(f12, stVar.H, round2, stVar.J);
                if (!imageReceiver.I() || imageReceiver.f22644i1 != f11) {
                    canvas.drawRect(f12, stVar.H, round + round2, i14 + stVar.J, f23767c0);
                }
                stVar.c(canvas);
                i20++;
                z14 = true;
                euVar = this;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        ArrayList arrayList = this.Y;
        int actionMasked = motionEvent.getActionMasked();
        Rect rect = this.f28352b;
        motionEvent.offsetLocation(-rect.left, -rect.top);
        try {
            if (actionMasked == 0) {
                this.f23769b0 = null;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    st stVar = (st) arrayList.get(i7);
                    if (stVar.g(motionEvent.getX(), motionEvent.getY()) && stVar.k(this.W, motionEvent)) {
                        this.f23769b0 = stVar;
                        return true;
                    }
                }
            } else {
                st stVar2 = this.f23769b0;
                if (stVar2 != null) {
                    boolean k10 = stVar2.k(this.W, motionEvent);
                    if (actionMasked == 1 || actionMasked == 3) {
                        this.f23769b0 = null;
                    }
                    return k10;
                }
            }
            return false;
        } finally {
            motionEvent.offsetLocation(rect.left, rect.top);
        }
    }
}
