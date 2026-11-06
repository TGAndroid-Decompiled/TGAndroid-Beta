package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class ku extends fu {
    public static Paint f23761b0;
    public final boolean W;
    public final ArrayList X;
    public final int[] Y;
    public final int Z;
    public yt f23762a0;

    public ku(kv kvVar, Rect rect, int i7, TL_iv.pageBlockCollage pageblockcollage, boolean z9) {
        super(kvVar, rect, i7);
        float f10;
        int i10;
        float f11;
        int round;
        float f12;
        int round2;
        int i11;
        yt ytVar;
        this.X = new ArrayList();
        this.W = z9;
        int i12 = 0;
        for (int i13 = 0; i13 < pageblockcollage.items.size(); i13++) {
            TL_iv.PageBlock pageBlock = pageblockcollage.items.get(i13);
            if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                ytVar = new yt(kvVar, (TL_iv.pageBlockPhoto) pageBlock);
            } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
                ytVar = new yt(kvVar, (TL_iv.pageBlockVideo) pageBlock);
            } else {
                ytVar = null;
            }
            if (ytVar != null) {
                this.X.add(ytVar);
            }
        }
        int i14 = this.f22452c;
        ArrayList arrayList = this.X;
        this.Y = new int[arrayList.size()];
        if (arrayList.isEmpty()) {
            this.Z = 0;
            return;
        }
        int i15 = 1;
        if (arrayList.size() == 1) {
            yt ytVar2 = (yt) arrayList.get(0);
            float f13 = ytVar2.E;
            f13 = f13 <= 0.0f ? 1.0f : f13;
            int i16 = (int) (i14 / f13);
            Point point = g0.f22544q;
            int max = (int) (Math.max(point.x, point.y) * 0.55f);
            if (i16 > max) {
                i14 = (int) (max * f13);
                i16 = max;
            }
            ytVar2.l(0, 0, i14, i16);
            this.Y[0] = 15;
            this.Z = i16;
            return;
        }
        float[] fArr = new float[arrayList.size()];
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            fArr[i17] = ((yt) arrayList.get(i17)).E;
        }
        aj[] e10 = kv.e(fArr);
        int i18 = 0;
        for (aj ajVar : e10) {
            i18 = Math.max(i18, (int) ajVar.d);
        }
        int i19 = i18 + 1;
        float[] fArr2 = new float[i19];
        for (aj ajVar2 : e10) {
            byte b10 = ajVar2.f21444c;
            if (b10 == ajVar2.d) {
                fArr2[b10] = Math.max(fArr2[b10], ajVar2.f21446f);
            }
        }
        int length = e10.length;
        int i20 = 0;
        while (i20 < length) {
            aj ajVar3 = e10[i20];
            int i21 = ajVar3.f21444c;
            byte b11 = ajVar3.d;
            if (i21 != b11) {
                int i22 = (b11 - i21) + i15;
                float[] fArr3 = ajVar3.f21452m;
                if (fArr3 != null && fArr3.length == i22) {
                    int i23 = 0;
                    while (i23 < i22) {
                        int i24 = ajVar3.f21444c + i23;
                        fArr2[i24] = Math.max(fArr2[i24], ajVar3.f21452m[i23]);
                        i23++;
                        i15 = i15;
                    }
                } else {
                    i11 = i15;
                    float f14 = ajVar3.f21446f / i22;
                    while (i21 <= ajVar3.d) {
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
        Point point2 = g0.f22544q;
        float max2 = Math.max(point2.x, point2.y) * 0.5f;
        int[] iArr = new int[i18 + 2];
        float f15 = 0.0f;
        for (int i25 = 0; i25 <= i18; i25++) {
            iArr[i25] = Math.round(f15 * max2);
            f15 += fArr2[i25];
        }
        iArr[i19] = Math.round(f15 * max2);
        if (this.f22450a.D()) {
            f10 = 3.0f;
        } else {
            f10 = 2.0f;
        }
        int L = g0.L(f10);
        int i26 = 0;
        while (i26 < e10.length) {
            aj ajVar4 = e10[i26];
            int i27 = iArr[ajVar4.f21444c];
            int i28 = iArr[ajVar4.d + 1] - i27;
            float f16 = 1000.0f;
            if (ajVar4.f21449j > 0) {
                round = Math.round((i10 * i14) / 1000.0f);
                f11 = 1000.0f;
            } else {
                int i29 = i12;
                int i30 = i29;
                while (i29 < e10.length) {
                    if (i29 == i26) {
                        f12 = f16;
                    } else {
                        aj ajVar5 = e10[i29];
                        f12 = f16;
                        byte b12 = ajVar5.f21444c;
                        byte b13 = ajVar4.f21444c;
                        if (b12 <= b13 && ajVar5.d >= b13 && ajVar5.f21442a < ajVar4.f21442a) {
                            i30 += ajVar5.f21445e;
                        }
                    }
                    i29++;
                    f16 = f12;
                }
                f11 = f16;
                round = Math.round((i30 * i14) / f11);
            }
            if ((ajVar4.f21451l & 2) != 0) {
                round2 = i14 - round;
            } else {
                round2 = Math.round((ajVar4.f21445e * i14) / f11) - L;
            }
            if ((ajVar4.f21451l & 8) == 0) {
                i28 -= L;
            }
            ((yt) arrayList.get(i26)).l(round, i27, Math.max(0, round2), Math.max(0, i28));
            this.Y[i26] = ajVar4.f21451l;
            i26++;
            i12 = 0;
        }
        this.Z = iArr[i19];
    }

    @Override
    public final void A(int i7, Rect rect) {
        if (i7 >= 0) {
            ArrayList arrayList = this.X;
            if (i7 < arrayList.size()) {
                yt ytVar = (yt) arrayList.get(i7);
                Rect rect2 = this.f22451b;
                int i10 = rect2.left + ytVar.F;
                int i11 = ((int) this.M) + rect2.top + ytVar.G;
                rect.set(i10, i11, ytVar.H + i10, ytVar.I + i11);
            }
        }
    }

    @Override
    public final int B() {
        return this.X.size();
    }

    @Override
    public final CharSequence E(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.X;
            if (i7 < arrayList.size()) {
                return ((yt) arrayList.get(i7)).f();
            }
            return null;
        }
        return null;
    }

    @Override
    public final int I() {
        return this.Z;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final int K() {
        Rect rect = this.f22451b;
        return rect.left + this.f22452c + rect.right;
    }

    @Override
    public final void T() {
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            yt ytVar = (yt) obj;
            View view = this.V;
            ytVar.S = view;
            ImageReceiver imageReceiver = ytVar.f26714c;
            imageReceiver.H0(view);
            imageReceiver.P();
            ImageReceiver imageReceiver2 = ytVar.d;
            imageReceiver2.H0(view);
            imageReceiver2.P();
            ytVar.d(view);
            ytVar.m(view, false);
        }
    }

    @Override
    public final boolean U(int i7, View view) {
        if (i7 >= 0) {
            ArrayList arrayList = this.X;
            if (i7 < arrayList.size()) {
                return ((yt) arrayList.get(i7)).j(view);
            }
            return false;
        }
        return false;
    }

    @Override
    public final void V() {
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            yt ytVar = (yt) obj;
            ytVar.f26714c.R();
            ytVar.d.R();
            ytVar.f26715e = null;
            z5.q(ytVar.f26712a.f23763a).v(ytVar);
        }
    }

    @Override
    public final void W(Canvas canvas) {
        int i7;
        int i10;
        float f10;
        int i11;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        float f11;
        int L;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        ku kuVar = this;
        boolean z13 = true;
        if (f23761b0 == null) {
            Paint paint = new Paint(1);
            f23761b0 = paint;
            paint.setColor(251658240);
        }
        boolean R = kuVar.R();
        int L2 = g0.L(2.0f);
        kv kvVar = kuVar.f22450a;
        if (!R && !kvVar.D()) {
            i7 = kvVar.S - L2;
        } else {
            i7 = 0;
        }
        if (!R && !kvVar.D()) {
            i10 = kvVar.T - L2;
        } else {
            i10 = 0;
        }
        int i19 = kuVar.f22452c;
        if (i19 > 0 && (i7 > 0 || i10 > 0)) {
            f10 = ((i19 + i7) + i10) / i19;
        } else {
            f10 = 1.0f;
        }
        int i20 = 0;
        while (true) {
            ArrayList arrayList = kuVar.X;
            if (i20 < arrayList.size()) {
                yt ytVar = (yt) arrayList.get(i20);
                int i21 = ytVar.F;
                ImageReceiver imageReceiver = ytVar.f26714c;
                int round = Math.round(i21 * f10) - i7;
                int round2 = Math.round(ytVar.H * f10);
                int[] iArr = kuVar.Y;
                if (iArr != null && i20 < iArr.length) {
                    i11 = iArr[i20];
                } else {
                    i11 = 0;
                }
                if ((i11 & 4) != 0) {
                    z9 = z13;
                } else {
                    z9 = false;
                }
                if ((i11 & 8) != 0) {
                    z10 = z13;
                } else {
                    z10 = false;
                }
                if ((i11 & 1) != 0) {
                    z11 = z13;
                } else {
                    z11 = false;
                }
                if ((i11 & 2) != 0) {
                    z12 = z13;
                } else {
                    z12 = false;
                }
                if (R) {
                    int L3 = g0.L(8.0f);
                    if (z9 && z11) {
                        i15 = L3;
                    } else {
                        i15 = 0;
                    }
                    if (z9 && z12) {
                        i16 = L3;
                    } else {
                        i16 = 0;
                    }
                    if (z10 && z12) {
                        i17 = L3;
                    } else {
                        i17 = 0;
                    }
                    if (z10 && z11) {
                        i18 = L3;
                    } else {
                        i18 = 0;
                    }
                    imageReceiver.K0(i15, i16, i17, i18);
                    f11 = 1.0f;
                } else {
                    int i22 = iz.Y0;
                    f11 = 1.0f;
                    if (i22 > 2) {
                        L = g0.L(i22 - 2);
                    } else {
                        L = g0.L(i22);
                    }
                    int min = Math.min(g0.L(3.0f), L);
                    if (kvVar.D()) {
                        imageReceiver.J0(g0.L(12.0f));
                    } else {
                        boolean z14 = kuVar.W;
                        if (z9 && z11) {
                            if (z14 && !kvVar.B() && (kvVar.E() || !kvVar.G())) {
                                i12 = L;
                            } else {
                                i12 = min;
                            }
                        } else {
                            i12 = 0;
                        }
                        if (z9 && z12) {
                            if (!z14 || kvVar.B() || (kvVar.E() && kvVar.G())) {
                                L = min;
                            }
                        } else {
                            L = 0;
                        }
                        if (z10 && z12) {
                            i13 = min;
                        } else {
                            i13 = 0;
                        }
                        imageReceiver.K0(i12, L, i13, (z10 && z11) ? 0 : 0);
                    }
                }
                float f12 = round;
                imageReceiver.y0(f12, ytVar.G, round2, ytVar.I);
                if (!imageReceiver.I() || imageReceiver.f21194h1 != f11) {
                    canvas.drawRect(f12, ytVar.G, round + round2, i14 + ytVar.I, f23761b0);
                }
                ytVar.c(canvas);
                i20++;
                z13 = true;
                kuVar = this;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        ArrayList arrayList = this.X;
        int actionMasked = motionEvent.getActionMasked();
        Rect rect = this.f22451b;
        motionEvent.offsetLocation(-rect.left, -rect.top);
        try {
            if (actionMasked == 0) {
                this.f23762a0 = null;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    yt ytVar = (yt) arrayList.get(i7);
                    if (ytVar.g(motionEvent.getX(), motionEvent.getY()) && ytVar.k(this.V, motionEvent)) {
                        this.f23762a0 = ytVar;
                        return true;
                    }
                }
            } else {
                yt ytVar2 = this.f23762a0;
                if (ytVar2 != null) {
                    boolean k10 = ytVar2.k(this.V, motionEvent);
                    if (actionMasked == 1 || actionMasked == 3) {
                        this.f23762a0 = null;
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
