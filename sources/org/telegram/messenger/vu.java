package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class vu extends qu {
    public static Paint f18984b0;
    public final boolean W;
    public final ArrayList X;
    public final int[] Y;
    public final int Z;
    public ju f18985a0;

    public vu(vv vvVar, Rect rect, int i10, TL_iv.pageBlockCollage pageblockcollage, boolean z10) {
        super(vvVar, rect, i10);
        float f7;
        int i11;
        float f10;
        int round;
        float f11;
        int round2;
        int i12;
        ju juVar;
        this.X = new ArrayList();
        this.W = z10;
        int i13 = 0;
        for (int i14 = 0; i14 < pageblockcollage.items.size(); i14++) {
            TL_iv.PageBlock pageBlock = pageblockcollage.items.get(i14);
            if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                juVar = new ju(vvVar, (TL_iv.pageBlockPhoto) pageBlock);
            } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
                juVar = new ju(vvVar, (TL_iv.pageBlockVideo) pageBlock);
            } else {
                juVar = null;
            }
            if (juVar != null) {
                this.X.add(juVar);
            }
        }
        int i15 = this.f17623c;
        ArrayList arrayList = this.X;
        this.Y = new int[arrayList.size()];
        if (arrayList.isEmpty()) {
            this.Z = 0;
            return;
        }
        int i16 = 1;
        if (arrayList.size() == 1) {
            ju juVar2 = (ju) arrayList.get(0);
            float f12 = juVar2.E;
            f12 = f12 <= 0.0f ? 1.0f : f12;
            int i17 = (int) (i15 / f12);
            Point point = i0.f16026q;
            int max = (int) (Math.max(point.x, point.y) * 0.55f);
            if (i17 > max) {
                i15 = (int) (max * f12);
                i17 = max;
            }
            juVar2.l(0, 0, i15, i17);
            this.Y[0] = 15;
            this.Z = i17;
            return;
        }
        float[] fArr = new float[arrayList.size()];
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            fArr[i18] = ((ju) arrayList.get(i18)).E;
        }
        bj[] e = vv.e(fArr);
        int i19 = 0;
        for (bj bjVar : e) {
            i19 = Math.max(i19, (int) bjVar.d);
        }
        int i20 = i19 + 1;
        float[] fArr2 = new float[i20];
        for (bj bjVar2 : e) {
            byte b10 = bjVar2.f14777c;
            if (b10 == bjVar2.d) {
                fArr2[b10] = Math.max(fArr2[b10], bjVar2.f14778f);
            }
        }
        int length = e.length;
        int i21 = 0;
        while (i21 < length) {
            bj bjVar3 = e[i21];
            int i22 = bjVar3.f14777c;
            byte b11 = bjVar3.d;
            if (i22 != b11) {
                int i23 = (b11 - i22) + i16;
                float[] fArr3 = bjVar3.f14784m;
                if (fArr3 != null && fArr3.length == i23) {
                    int i24 = 0;
                    while (i24 < i23) {
                        int i25 = bjVar3.f14777c + i24;
                        fArr2[i25] = Math.max(fArr2[i25], bjVar3.f14784m[i24]);
                        i24++;
                        i16 = i16;
                    }
                } else {
                    i12 = i16;
                    float f13 = bjVar3.f14778f / i23;
                    while (i22 <= bjVar3.d) {
                        fArr2[i22] = Math.max(fArr2[i22], f13);
                        i22++;
                    }
                    i21++;
                    i16 = i12;
                }
            }
            i12 = i16;
            i21++;
            i16 = i12;
        }
        Point point2 = i0.f16026q;
        float max2 = Math.max(point2.x, point2.y) * 0.5f;
        int[] iArr = new int[i19 + 2];
        float f14 = 0.0f;
        for (int i26 = 0; i26 <= i19; i26++) {
            iArr[i26] = Math.round(f14 * max2);
            f14 += fArr2[i26];
        }
        iArr[i20] = Math.round(f14 * max2);
        if (this.f17621a.D()) {
            f7 = 3.0f;
        } else {
            f7 = 2.0f;
        }
        int L = i0.L(f7);
        int i27 = 0;
        while (i27 < e.length) {
            bj bjVar4 = e[i27];
            int i28 = iArr[bjVar4.f14777c];
            int i29 = iArr[bjVar4.d + 1] - i28;
            float f15 = 1000.0f;
            if (bjVar4.f14781j > 0) {
                round = Math.round((i11 * i15) / 1000.0f);
                f10 = 1000.0f;
            } else {
                int i30 = i13;
                int i31 = i30;
                while (i30 < e.length) {
                    if (i30 == i27) {
                        f11 = f15;
                    } else {
                        bj bjVar5 = e[i30];
                        f11 = f15;
                        byte b12 = bjVar5.f14777c;
                        byte b13 = bjVar4.f14777c;
                        if (b12 <= b13 && bjVar5.d >= b13 && bjVar5.f14775a < bjVar4.f14775a) {
                            i31 += bjVar5.e;
                        }
                    }
                    i30++;
                    f15 = f11;
                }
                f10 = f15;
                round = Math.round((i31 * i15) / f10);
            }
            if ((bjVar4.f14783l & 2) != 0) {
                round2 = i15 - round;
            } else {
                round2 = Math.round((bjVar4.e * i15) / f10) - L;
            }
            if ((bjVar4.f14783l & 8) == 0) {
                i29 -= L;
            }
            ((ju) arrayList.get(i27)).l(round, i28, Math.max(0, round2), Math.max(0, i29));
            this.Y[i27] = bjVar4.f14783l;
            i27++;
            i13 = 0;
        }
        this.Z = iArr[i20];
    }

    @Override
    public final void A(int i10, Rect rect) {
        if (i10 >= 0) {
            ArrayList arrayList = this.X;
            if (i10 < arrayList.size()) {
                ju juVar = (ju) arrayList.get(i10);
                Rect rect2 = this.f17622b;
                int i11 = rect2.left + juVar.F;
                int i12 = ((int) this.M) + rect2.top + juVar.G;
                rect.set(i11, i12, juVar.H + i11, juVar.I + i12);
            }
        }
    }

    @Override
    public final int B() {
        return this.X.size();
    }

    @Override
    public final CharSequence E(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.X;
            if (i10 < arrayList.size()) {
                return ((ju) arrayList.get(i10)).f();
            }
            return null;
        }
        return null;
    }

    @Override
    public final int H() {
        return this.Z;
    }

    @Override
    public final int I() {
        return J();
    }

    @Override
    public final int J() {
        Rect rect = this.f17622b;
        return rect.left + this.f17623c + rect.right;
    }

    @Override
    public final void S() {
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ju juVar = (ju) obj;
            View view = this.V;
            juVar.S = view;
            ImageReceiver imageReceiver = juVar.f16437c;
            imageReceiver.H0(view);
            imageReceiver.P();
            ImageReceiver imageReceiver2 = juVar.d;
            imageReceiver2.H0(view);
            imageReceiver2.P();
            juVar.d(view);
            juVar.m(view, false);
        }
    }

    @Override
    public final boolean T(int i10, View view) {
        if (i10 >= 0) {
            ArrayList arrayList = this.X;
            if (i10 < arrayList.size()) {
                return ((ju) arrayList.get(i10)).j(view);
            }
            return false;
        }
        return false;
    }

    @Override
    public final void U() {
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ju juVar = (ju) obj;
            juVar.f16437c.R();
            juVar.d.R();
            juVar.e = null;
            b6.q(juVar.f16435a.f18986a).v(juVar);
        }
    }

    @Override
    public final void V(Canvas canvas) {
        int i10;
        int i11;
        float f7;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f10;
        int L;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        vu vuVar = this;
        boolean z14 = true;
        if (f18984b0 == null) {
            Paint paint = new Paint(1);
            f18984b0 = paint;
            paint.setColor(251658240);
        }
        boolean Q = vuVar.Q();
        int L2 = i0.L(2.0f);
        vv vvVar = vuVar.f17621a;
        if (!Q && !vvVar.D()) {
            i10 = vvVar.S - L2;
        } else {
            i10 = 0;
        }
        if (!Q && !vvVar.D()) {
            i11 = vvVar.T - L2;
        } else {
            i11 = 0;
        }
        int i20 = vuVar.f17623c;
        if (i20 > 0 && (i10 > 0 || i11 > 0)) {
            f7 = ((i20 + i10) + i11) / i20;
        } else {
            f7 = 1.0f;
        }
        int i21 = 0;
        while (true) {
            ArrayList arrayList = vuVar.X;
            if (i21 < arrayList.size()) {
                ju juVar = (ju) arrayList.get(i21);
                int i22 = juVar.F;
                ImageReceiver imageReceiver = juVar.f16437c;
                int round = Math.round(i22 * f7) - i10;
                int round2 = Math.round(juVar.H * f7);
                int[] iArr = vuVar.Y;
                if (iArr != null && i21 < iArr.length) {
                    i12 = iArr[i21];
                } else {
                    i12 = 0;
                }
                if ((i12 & 4) != 0) {
                    z10 = z14;
                } else {
                    z10 = false;
                }
                if ((i12 & 8) != 0) {
                    z11 = z14;
                } else {
                    z11 = false;
                }
                if ((i12 & 1) != 0) {
                    z12 = z14;
                } else {
                    z12 = false;
                }
                if ((i12 & 2) != 0) {
                    z13 = z14;
                } else {
                    z13 = false;
                }
                if (Q) {
                    int L3 = i0.L(8.0f);
                    if (z10 && z12) {
                        i16 = L3;
                    } else {
                        i16 = 0;
                    }
                    if (z10 && z13) {
                        i17 = L3;
                    } else {
                        i17 = 0;
                    }
                    if (z11 && z13) {
                        i18 = L3;
                    } else {
                        i18 = 0;
                    }
                    if (z11 && z12) {
                        i19 = L3;
                    } else {
                        i19 = 0;
                    }
                    imageReceiver.K0(i16, i17, i18, i19);
                    f10 = 1.0f;
                } else {
                    int i23 = tz.Y0;
                    f10 = 1.0f;
                    if (i23 > 2) {
                        L = i0.L(i23 - 2);
                    } else {
                        L = i0.L(i23);
                    }
                    int min = Math.min(i0.L(3.0f), L);
                    if (vvVar.D()) {
                        imageReceiver.J0(i0.L(12.0f));
                    } else {
                        boolean z15 = vuVar.W;
                        if (z10 && z12) {
                            if (z15 && !vvVar.B() && (vvVar.E() || !vvVar.G())) {
                                i13 = L;
                            } else {
                                i13 = min;
                            }
                        } else {
                            i13 = 0;
                        }
                        if (z10 && z13) {
                            if (!z15 || vvVar.B() || (vvVar.E() && vvVar.G())) {
                                L = min;
                            }
                        } else {
                            L = 0;
                        }
                        if (z11 && z13) {
                            i14 = min;
                        } else {
                            i14 = 0;
                        }
                        imageReceiver.K0(i13, L, i14, (z11 && z12) ? 0 : 0);
                    }
                }
                float f11 = round;
                imageReceiver.y0(f11, juVar.G, round2, juVar.I);
                if (!imageReceiver.I() || imageReceiver.f14384h1 != f10) {
                    canvas.drawRect(f11, juVar.G, round + round2, i15 + juVar.I, f18984b0);
                }
                juVar.c(canvas);
                i21++;
                z14 = true;
                vuVar = this;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean X(MotionEvent motionEvent) {
        ArrayList arrayList = this.X;
        int actionMasked = motionEvent.getActionMasked();
        Rect rect = this.f17622b;
        motionEvent.offsetLocation(-rect.left, -rect.top);
        try {
            if (actionMasked == 0) {
                this.f18985a0 = null;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ju juVar = (ju) arrayList.get(i10);
                    if (juVar.g(motionEvent.getX(), motionEvent.getY()) && juVar.k(this.V, motionEvent)) {
                        this.f18985a0 = juVar;
                        return true;
                    }
                }
            } else {
                ju juVar2 = this.f18985a0;
                if (juVar2 != null) {
                    boolean k10 = juVar2.k(this.V, motionEvent);
                    if (actionMasked == 1 || actionMasked == 3) {
                        this.f18985a0 = null;
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
