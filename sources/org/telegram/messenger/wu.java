package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class wu extends ru {
    public static Paint f19327b0;
    public final boolean W;
    public final ArrayList X;
    public final int[] Y;
    public final int Z;
    public ku f19328a0;

    public wu(wv wvVar, Rect rect, int i10, TL_iv.pageBlockCollage pageblockcollage, boolean z10) {
        super(wvVar, rect, i10);
        float f7;
        int i11;
        float f10;
        int round;
        float f11;
        int round2;
        int i12;
        ku kuVar;
        this.X = new ArrayList();
        this.W = z10;
        int i13 = 0;
        for (int i14 = 0; i14 < pageblockcollage.items.size(); i14++) {
            TL_iv.PageBlock pageBlock = pageblockcollage.items.get(i14);
            if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                kuVar = new ku(wvVar, (TL_iv.pageBlockPhoto) pageBlock);
            } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
                kuVar = new ku(wvVar, (TL_iv.pageBlockVideo) pageBlock);
            } else {
                kuVar = null;
            }
            if (kuVar != null) {
                this.X.add(kuVar);
            }
        }
        int i15 = this.f17969c;
        ArrayList arrayList = this.X;
        this.Y = new int[arrayList.size()];
        if (arrayList.isEmpty()) {
            this.Z = 0;
            return;
        }
        int i16 = 1;
        if (arrayList.size() == 1) {
            ku kuVar2 = (ku) arrayList.get(0);
            float f12 = kuVar2.E;
            f12 = f12 <= 0.0f ? 1.0f : f12;
            int i17 = (int) (i15 / f12);
            Point point = i0.f16172q;
            int max = (int) (Math.max(point.x, point.y) * 0.55f);
            if (i17 > max) {
                i15 = (int) (max * f12);
                i17 = max;
            }
            kuVar2.l(0, 0, i15, i17);
            this.Y[0] = 15;
            this.Z = i17;
            return;
        }
        float[] fArr = new float[arrayList.size()];
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            fArr[i18] = ((ku) arrayList.get(i18)).E;
        }
        cj[] e = wv.e(fArr);
        int i19 = 0;
        for (cj cjVar : e) {
            i19 = Math.max(i19, (int) cjVar.d);
        }
        int i20 = i19 + 1;
        float[] fArr2 = new float[i20];
        for (cj cjVar2 : e) {
            byte b10 = cjVar2.f15160c;
            if (b10 == cjVar2.d) {
                fArr2[b10] = Math.max(fArr2[b10], cjVar2.f15161f);
            }
        }
        int length = e.length;
        int i21 = 0;
        while (i21 < length) {
            cj cjVar3 = e[i21];
            int i22 = cjVar3.f15160c;
            byte b11 = cjVar3.d;
            if (i22 != b11) {
                int i23 = (b11 - i22) + i16;
                float[] fArr3 = cjVar3.f15167m;
                if (fArr3 != null && fArr3.length == i23) {
                    int i24 = 0;
                    while (i24 < i23) {
                        int i25 = cjVar3.f15160c + i24;
                        fArr2[i25] = Math.max(fArr2[i25], cjVar3.f15167m[i24]);
                        i24++;
                        i16 = i16;
                    }
                } else {
                    i12 = i16;
                    float f13 = cjVar3.f15161f / i23;
                    while (i22 <= cjVar3.d) {
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
        Point point2 = i0.f16172q;
        float max2 = Math.max(point2.x, point2.y) * 0.5f;
        int[] iArr = new int[i19 + 2];
        float f14 = 0.0f;
        for (int i26 = 0; i26 <= i19; i26++) {
            iArr[i26] = Math.round(f14 * max2);
            f14 += fArr2[i26];
        }
        iArr[i20] = Math.round(f14 * max2);
        if (this.f17967a.D()) {
            f7 = 3.0f;
        } else {
            f7 = 2.0f;
        }
        int L = i0.L(f7);
        int i27 = 0;
        while (i27 < e.length) {
            cj cjVar4 = e[i27];
            int i28 = iArr[cjVar4.f15160c];
            int i29 = iArr[cjVar4.d + 1] - i28;
            float f15 = 1000.0f;
            if (cjVar4.f15164j > 0) {
                round = Math.round((i11 * i15) / 1000.0f);
                f10 = 1000.0f;
            } else {
                int i30 = i13;
                int i31 = i30;
                while (i30 < e.length) {
                    if (i30 == i27) {
                        f11 = f15;
                    } else {
                        cj cjVar5 = e[i30];
                        f11 = f15;
                        byte b12 = cjVar5.f15160c;
                        byte b13 = cjVar4.f15160c;
                        if (b12 <= b13 && cjVar5.d >= b13 && cjVar5.f15158a < cjVar4.f15158a) {
                            i31 += cjVar5.e;
                        }
                    }
                    i30++;
                    f15 = f11;
                }
                f10 = f15;
                round = Math.round((i31 * i15) / f10);
            }
            if ((cjVar4.f15166l & 2) != 0) {
                round2 = i15 - round;
            } else {
                round2 = Math.round((cjVar4.e * i15) / f10) - L;
            }
            if ((cjVar4.f15166l & 8) == 0) {
                i29 -= L;
            }
            ((ku) arrayList.get(i27)).l(round, i28, Math.max(0, round2), Math.max(0, i29));
            this.Y[i27] = cjVar4.f15166l;
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
                ku kuVar = (ku) arrayList.get(i10);
                Rect rect2 = this.f17968b;
                int i11 = rect2.left + kuVar.F;
                int i12 = ((int) this.M) + rect2.top + kuVar.G;
                rect.set(i11, i12, kuVar.H + i11, kuVar.I + i12);
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
                return ((ku) arrayList.get(i10)).f();
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
        Rect rect = this.f17968b;
        return rect.left + this.f17969c + rect.right;
    }

    @Override
    public final void S() {
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ku kuVar = (ku) obj;
            View view = this.V;
            kuVar.S = view;
            ImageReceiver imageReceiver = kuVar.f16790c;
            imageReceiver.H0(view);
            imageReceiver.P();
            ImageReceiver imageReceiver2 = kuVar.d;
            imageReceiver2.H0(view);
            imageReceiver2.P();
            kuVar.d(view);
            kuVar.m(view, false);
        }
    }

    @Override
    public final boolean T(int i10, View view) {
        if (i10 >= 0) {
            ArrayList arrayList = this.X;
            if (i10 < arrayList.size()) {
                return ((ku) arrayList.get(i10)).j(view);
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
            ku kuVar = (ku) obj;
            kuVar.f16790c.R();
            kuVar.d.R();
            kuVar.e = null;
            b6.q(kuVar.f16788a.f19329a).v(kuVar);
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
        wu wuVar = this;
        boolean z14 = true;
        if (f19327b0 == null) {
            Paint paint = new Paint(1);
            f19327b0 = paint;
            paint.setColor(251658240);
        }
        boolean Q = wuVar.Q();
        int L2 = i0.L(2.0f);
        wv wvVar = wuVar.f17967a;
        if (!Q && !wvVar.D()) {
            i10 = wvVar.S - L2;
        } else {
            i10 = 0;
        }
        if (!Q && !wvVar.D()) {
            i11 = wvVar.T - L2;
        } else {
            i11 = 0;
        }
        int i20 = wuVar.f17969c;
        if (i20 > 0 && (i10 > 0 || i11 > 0)) {
            f7 = ((i20 + i10) + i11) / i20;
        } else {
            f7 = 1.0f;
        }
        int i21 = 0;
        while (true) {
            ArrayList arrayList = wuVar.X;
            if (i21 < arrayList.size()) {
                ku kuVar = (ku) arrayList.get(i21);
                int i22 = kuVar.F;
                ImageReceiver imageReceiver = kuVar.f16790c;
                int round = Math.round(i22 * f7) - i10;
                int round2 = Math.round(kuVar.H * f7);
                int[] iArr = wuVar.Y;
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
                    int i23 = uz.Y0;
                    f10 = 1.0f;
                    if (i23 > 2) {
                        L = i0.L(i23 - 2);
                    } else {
                        L = i0.L(i23);
                    }
                    int min = Math.min(i0.L(3.0f), L);
                    if (wvVar.D()) {
                        imageReceiver.J0(i0.L(12.0f));
                    } else {
                        boolean z15 = wuVar.W;
                        if (z10 && z12) {
                            if (z15 && !wvVar.B() && (wvVar.E() || !wvVar.G())) {
                                i13 = L;
                            } else {
                                i13 = min;
                            }
                        } else {
                            i13 = 0;
                        }
                        if (z10 && z13) {
                            if (!z15 || wvVar.B() || (wvVar.E() && wvVar.G())) {
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
                imageReceiver.y0(f11, kuVar.G, round2, kuVar.I);
                if (!imageReceiver.I() || imageReceiver.f14385h1 != f10) {
                    canvas.drawRect(f11, kuVar.G, round + round2, i15 + kuVar.I, f19327b0);
                }
                kuVar.c(canvas);
                i21++;
                z14 = true;
                wuVar = this;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean X(MotionEvent motionEvent) {
        ArrayList arrayList = this.X;
        int actionMasked = motionEvent.getActionMasked();
        Rect rect = this.f17968b;
        motionEvent.offsetLocation(-rect.left, -rect.top);
        try {
            if (actionMasked == 0) {
                this.f19328a0 = null;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ku kuVar = (ku) arrayList.get(i10);
                    if (kuVar.g(motionEvent.getX(), motionEvent.getY()) && kuVar.k(this.V, motionEvent)) {
                        this.f19328a0 = kuVar;
                        return true;
                    }
                }
            } else {
                ku kuVar2 = this.f19328a0;
                if (kuVar2 != null) {
                    boolean k10 = kuVar2.k(this.V, motionEvent);
                    if (actionMasked == 1 || actionMasked == 3) {
                        this.f19328a0 = null;
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
