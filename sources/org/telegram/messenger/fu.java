package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class fu extends au {
    public static Paint f23973c0;
    public final boolean X;
    public final ArrayList Y;
    public final int[] Z;
    public final int f23974a0;
    public tt f23975b0;

    public fu(fv fvVar, Rect rect, int i7, TL_iv.pageBlockCollage pageblockcollage, boolean z10) {
        super(fvVar, rect, i7);
        float f10;
        int i10;
        float f11;
        int round;
        float f12;
        int round2;
        int i11;
        tt ttVar;
        this.Y = new ArrayList();
        this.X = z10;
        int i12 = 0;
        for (int i13 = 0; i13 < pageblockcollage.items.size(); i13++) {
            TL_iv.PageBlock pageBlock = pageblockcollage.items.get(i13);
            if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                ttVar = new tt(fvVar, (TL_iv.pageBlockPhoto) pageBlock);
            } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
                ttVar = new tt(fvVar, (TL_iv.pageBlockVideo) pageBlock);
            } else {
                ttVar = null;
            }
            if (ttVar != null) {
                this.Y.add(ttVar);
            }
        }
        int i14 = this.f22970c;
        ArrayList arrayList = this.Y;
        this.Z = new int[arrayList.size()];
        if (arrayList.isEmpty()) {
            this.f23974a0 = 0;
            return;
        }
        int i15 = 1;
        if (arrayList.size() == 1) {
            tt ttVar2 = (tt) arrayList.get(0);
            float f13 = ttVar2.F;
            f13 = f13 <= 0.0f ? 1.0f : f13;
            int i16 = (int) (i14 / f13);
            Point point = g0.f24046q;
            int max = (int) (Math.max(point.x, point.y) * 0.55f);
            if (i16 > max) {
                i14 = (int) (max * f13);
                i16 = max;
            }
            ttVar2.l(0, 0, i14, i16);
            this.Z[0] = 15;
            this.f23974a0 = i16;
            return;
        }
        float[] fArr = new float[arrayList.size()];
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            fArr[i17] = ((tt) arrayList.get(i17)).F;
        }
        yi[] e10 = fv.e(fArr);
        int i18 = 0;
        for (yi yiVar : e10) {
            i18 = Math.max(i18, (int) yiVar.d);
        }
        int i19 = i18 + 1;
        float[] fArr2 = new float[i19];
        for (yi yiVar2 : e10) {
            byte b10 = yiVar2.f28094c;
            if (b10 == yiVar2.d) {
                fArr2[b10] = Math.max(fArr2[b10], yiVar2.f28096f);
            }
        }
        int length = e10.length;
        int i20 = 0;
        while (i20 < length) {
            yi yiVar3 = e10[i20];
            int i21 = yiVar3.f28094c;
            byte b11 = yiVar3.d;
            if (i21 != b11) {
                int i22 = (b11 - i21) + i15;
                float[] fArr3 = yiVar3.f28102m;
                if (fArr3 != null && fArr3.length == i22) {
                    int i23 = 0;
                    while (i23 < i22) {
                        int i24 = yiVar3.f28094c + i23;
                        fArr2[i24] = Math.max(fArr2[i24], yiVar3.f28102m[i23]);
                        i23++;
                        i15 = i15;
                    }
                } else {
                    i11 = i15;
                    float f14 = yiVar3.f28096f / i22;
                    while (i21 <= yiVar3.d) {
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
        Point point2 = g0.f24046q;
        float max2 = Math.max(point2.x, point2.y) * 0.5f;
        int[] iArr = new int[i18 + 2];
        float f15 = 0.0f;
        for (int i25 = 0; i25 <= i18; i25++) {
            iArr[i25] = Math.round(f15 * max2);
            f15 += fArr2[i25];
        }
        iArr[i19] = Math.round(f15 * max2);
        if (this.f22968a.D()) {
            f10 = 3.0f;
        } else {
            f10 = 2.0f;
        }
        int L = g0.L(f10);
        int i26 = 0;
        while (i26 < e10.length) {
            yi yiVar4 = e10[i26];
            int i27 = iArr[yiVar4.f28094c];
            int i28 = iArr[yiVar4.d + 1] - i27;
            float f16 = 1000.0f;
            if (yiVar4.f28099j > 0) {
                round = Math.round((i10 * i14) / 1000.0f);
                f11 = 1000.0f;
            } else {
                int i29 = i12;
                int i30 = i29;
                while (i29 < e10.length) {
                    if (i29 == i26) {
                        f12 = f16;
                    } else {
                        yi yiVar5 = e10[i29];
                        f12 = f16;
                        byte b12 = yiVar5.f28094c;
                        byte b13 = yiVar4.f28094c;
                        if (b12 <= b13 && yiVar5.d >= b13 && yiVar5.f28092a < yiVar4.f28092a) {
                            i30 += yiVar5.f28095e;
                        }
                    }
                    i29++;
                    f16 = f12;
                }
                f11 = f16;
                round = Math.round((i30 * i14) / f11);
            }
            if ((yiVar4.f28101l & 2) != 0) {
                round2 = i14 - round;
            } else {
                round2 = Math.round((yiVar4.f28095e * i14) / f11) - L;
            }
            if ((yiVar4.f28101l & 8) == 0) {
                i28 -= L;
            }
            ((tt) arrayList.get(i26)).l(round, i27, Math.max(0, round2), Math.max(0, i28));
            this.Z[i26] = yiVar4.f28101l;
            i26++;
            i12 = 0;
        }
        this.f23974a0 = iArr[i19];
    }

    @Override
    public final void A(int i7, Rect rect) {
        if (i7 >= 0) {
            ArrayList arrayList = this.Y;
            if (i7 < arrayList.size()) {
                tt ttVar = (tt) arrayList.get(i7);
                Rect rect2 = this.f22969b;
                int i10 = rect2.left + ttVar.G;
                int i11 = ((int) this.N) + rect2.top + ttVar.H;
                rect.set(i10, i11, ttVar.I + i10, ttVar.J + i11);
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
                return ((tt) arrayList.get(i7)).f();
            }
            return null;
        }
        return null;
    }

    @Override
    public final int I() {
        return this.f23974a0;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final int K() {
        Rect rect = this.f22969b;
        return rect.left + this.f22970c + rect.right;
    }

    @Override
    public final void T() {
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            tt ttVar = (tt) obj;
            View view = this.W;
            ttVar.T = view;
            ImageReceiver imageReceiver = ttVar.f27078c;
            imageReceiver.H0(view);
            imageReceiver.P();
            ImageReceiver imageReceiver2 = ttVar.d;
            imageReceiver2.H0(view);
            imageReceiver2.P();
            ttVar.d(view);
            ttVar.m(view, false);
        }
    }

    @Override
    public final boolean U(int i7, View view) {
        if (i7 >= 0) {
            ArrayList arrayList = this.Y;
            if (i7 < arrayList.size()) {
                return ((tt) arrayList.get(i7)).j(view);
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
            tt ttVar = (tt) obj;
            ttVar.f27078c.R();
            ttVar.d.R();
            ttVar.f27079e = null;
            a6.q(ttVar.f27076a.f23976a).v(ttVar);
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
        fu fuVar = this;
        boolean z14 = true;
        if (f23973c0 == null) {
            Paint paint = new Paint(1);
            f23973c0 = paint;
            paint.setColor(251658240);
        }
        boolean R = fuVar.R();
        int L2 = g0.L(2.0f);
        fv fvVar = fuVar.f22968a;
        if (!R && !fvVar.D()) {
            i7 = fvVar.S - L2;
        } else {
            i7 = 0;
        }
        if (!R && !fvVar.D()) {
            i10 = fvVar.T - L2;
        } else {
            i10 = 0;
        }
        int i19 = fuVar.f22970c;
        if (i19 > 0 && (i7 > 0 || i10 > 0)) {
            f10 = ((i19 + i7) + i10) / i19;
        } else {
            f10 = 1.0f;
        }
        int i20 = 0;
        while (true) {
            ArrayList arrayList = fuVar.Y;
            if (i20 < arrayList.size()) {
                tt ttVar = (tt) arrayList.get(i20);
                int i21 = ttVar.G;
                ImageReceiver imageReceiver = ttVar.f27078c;
                int round = Math.round(i21 * f10) - i7;
                int round2 = Math.round(ttVar.I * f10);
                int[] iArr = fuVar.Z;
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
                    int i22 = cz.Y0;
                    f11 = 1.0f;
                    if (i22 > 2) {
                        L = g0.L(i22 - 2);
                    } else {
                        L = g0.L(i22);
                    }
                    int min = Math.min(g0.L(3.0f), L);
                    if (fvVar.D()) {
                        imageReceiver.J0(g0.L(12.0f));
                    } else {
                        boolean z15 = fuVar.X;
                        if (z10 && z12) {
                            if (z15 && !fvVar.B() && (fvVar.E() || !fvVar.G())) {
                                i12 = L;
                            } else {
                                i12 = min;
                            }
                        } else {
                            i12 = 0;
                        }
                        if (z10 && z13) {
                            if (!z15 || fvVar.B() || (fvVar.E() && fvVar.G())) {
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
                imageReceiver.y0(f12, ttVar.H, round2, ttVar.J);
                if (!imageReceiver.I() || imageReceiver.f22672i1 != f11) {
                    canvas.drawRect(f12, ttVar.H, round + round2, i14 + ttVar.J, f23973c0);
                }
                ttVar.c(canvas);
                i20++;
                z14 = true;
                fuVar = this;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        ArrayList arrayList = this.Y;
        int actionMasked = motionEvent.getActionMasked();
        Rect rect = this.f22969b;
        motionEvent.offsetLocation(-rect.left, -rect.top);
        try {
            if (actionMasked == 0) {
                this.f23975b0 = null;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    tt ttVar = (tt) arrayList.get(i7);
                    if (ttVar.g(motionEvent.getX(), motionEvent.getY()) && ttVar.k(this.W, motionEvent)) {
                        this.f23975b0 = ttVar;
                        return true;
                    }
                }
            } else {
                tt ttVar2 = this.f23975b0;
                if (ttVar2 != null) {
                    boolean k10 = ttVar2.k(this.W, motionEvent);
                    if (actionMasked == 1 || actionMasked == 3) {
                        this.f23975b0 = null;
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
