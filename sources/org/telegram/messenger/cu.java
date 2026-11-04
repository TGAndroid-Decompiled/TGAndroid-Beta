package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class cu extends xt {
    public static Paint f22062c0;
    public final boolean X;
    public final ArrayList Y;
    public final int[] Z;
    public final int f22063a0;
    public qt f22064b0;

    public cu(cv cvVar, Rect rect, int i3, TL_iv.pageBlockCollage pageblockcollage, boolean z10) {
        super(cvVar, rect, i3);
        float f10;
        int i10;
        float f11;
        int round;
        float f12;
        int round2;
        int i11;
        qt qtVar;
        this.Y = new ArrayList();
        this.X = z10;
        int i12 = 0;
        for (int i13 = 0; i13 < pageblockcollage.items.size(); i13++) {
            TL_iv.PageBlock pageBlock = pageblockcollage.items.get(i13);
            if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                qtVar = new qt(cvVar, (TL_iv.pageBlockPhoto) pageBlock);
            } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
                qtVar = new qt(cvVar, (TL_iv.pageBlockVideo) pageBlock);
            } else {
                qtVar = null;
            }
            if (qtVar != null) {
                this.Y.add(qtVar);
            }
        }
        int i14 = this.f26436c;
        ArrayList arrayList = this.Y;
        this.Z = new int[arrayList.size()];
        if (arrayList.isEmpty()) {
            this.f22063a0 = 0;
            return;
        }
        int i15 = 1;
        if (arrayList.size() == 1) {
            qt qtVar2 = (qt) arrayList.get(0);
            float f13 = qtVar2.F;
            f13 = f13 <= 0.0f ? 1.0f : f13;
            int i16 = (int) (i14 / f13);
            Point point = g0.f22608q;
            int max = (int) (Math.max(point.x, point.y) * 0.55f);
            if (i16 > max) {
                i14 = (int) (max * f13);
                i16 = max;
            }
            qtVar2.l(0, 0, i14, i16);
            this.Z[0] = 15;
            this.f22063a0 = i16;
            return;
        }
        float[] fArr = new float[arrayList.size()];
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            fArr[i17] = ((qt) arrayList.get(i17)).F;
        }
        ri[] e10 = cv.e(fArr);
        int i18 = 0;
        for (ri riVar : e10) {
            i18 = Math.max(i18, (int) riVar.d);
        }
        int i19 = i18 + 1;
        float[] fArr2 = new float[i19];
        for (ri riVar2 : e10) {
            byte b10 = riVar2.f25142c;
            if (b10 == riVar2.d) {
                fArr2[b10] = Math.max(fArr2[b10], riVar2.f25144f);
            }
        }
        int length = e10.length;
        int i20 = 0;
        while (i20 < length) {
            ri riVar3 = e10[i20];
            int i21 = riVar3.f25142c;
            byte b11 = riVar3.d;
            if (i21 != b11) {
                int i22 = (b11 - i21) + i15;
                float[] fArr3 = riVar3.f25150m;
                if (fArr3 != null && fArr3.length == i22) {
                    int i23 = 0;
                    while (i23 < i22) {
                        int i24 = riVar3.f25142c + i23;
                        fArr2[i24] = Math.max(fArr2[i24], riVar3.f25150m[i23]);
                        i23++;
                        i15 = i15;
                    }
                } else {
                    i11 = i15;
                    float f14 = riVar3.f25144f / i22;
                    while (i21 <= riVar3.d) {
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
        Point point2 = g0.f22608q;
        float max2 = Math.max(point2.x, point2.y) * 0.5f;
        int[] iArr = new int[i18 + 2];
        float f15 = 0.0f;
        for (int i25 = 0; i25 <= i18; i25++) {
            iArr[i25] = Math.round(f15 * max2);
            f15 += fArr2[i25];
        }
        iArr[i19] = Math.round(f15 * max2);
        if (this.f26434a.D()) {
            f10 = 3.0f;
        } else {
            f10 = 2.0f;
        }
        int L = g0.L(f10);
        int i26 = 0;
        while (i26 < e10.length) {
            ri riVar4 = e10[i26];
            int i27 = iArr[riVar4.f25142c];
            int i28 = iArr[riVar4.d + 1] - i27;
            float f16 = 1000.0f;
            if (riVar4.f25147j > 0) {
                round = Math.round((i10 * i14) / 1000.0f);
                f11 = 1000.0f;
            } else {
                int i29 = i12;
                int i30 = i29;
                while (i29 < e10.length) {
                    if (i29 == i26) {
                        f12 = f16;
                    } else {
                        ri riVar5 = e10[i29];
                        f12 = f16;
                        byte b12 = riVar5.f25142c;
                        byte b13 = riVar4.f25142c;
                        if (b12 <= b13 && riVar5.d >= b13 && riVar5.f25140a < riVar4.f25140a) {
                            i30 += riVar5.f25143e;
                        }
                    }
                    i29++;
                    f16 = f12;
                }
                f11 = f16;
                round = Math.round((i30 * i14) / f11);
            }
            if ((riVar4.f25149l & 2) != 0) {
                round2 = i14 - round;
            } else {
                round2 = Math.round((riVar4.f25143e * i14) / f11) - L;
            }
            if ((riVar4.f25149l & 8) == 0) {
                i28 -= L;
            }
            ((qt) arrayList.get(i26)).l(round, i27, Math.max(0, round2), Math.max(0, i28));
            this.Z[i26] = riVar4.f25149l;
            i26++;
            i12 = 0;
        }
        this.f22063a0 = iArr[i19];
    }

    @Override
    public final void A(int i3, Rect rect) {
        if (i3 >= 0) {
            ArrayList arrayList = this.Y;
            if (i3 < arrayList.size()) {
                qt qtVar = (qt) arrayList.get(i3);
                Rect rect2 = this.f26435b;
                int i10 = rect2.left + qtVar.G;
                int i11 = ((int) this.N) + rect2.top + qtVar.H;
                rect.set(i10, i11, qtVar.I + i10, qtVar.J + i11);
            }
        }
    }

    @Override
    public final int B() {
        return this.Y.size();
    }

    @Override
    public final CharSequence E(int i3) {
        if (i3 >= 0) {
            ArrayList arrayList = this.Y;
            if (i3 < arrayList.size()) {
                return ((qt) arrayList.get(i3)).f();
            }
            return null;
        }
        return null;
    }

    @Override
    public final int I() {
        return this.f22063a0;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final int K() {
        Rect rect = this.f26435b;
        return rect.left + this.f26436c + rect.right;
    }

    @Override
    public final void T() {
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            qt qtVar = (qt) obj;
            View view = this.W;
            qtVar.T = view;
            ImageReceiver imageReceiver = qtVar.f24952c;
            imageReceiver.H0(view);
            imageReceiver.P();
            ImageReceiver imageReceiver2 = qtVar.d;
            imageReceiver2.H0(view);
            imageReceiver2.P();
            qtVar.d(view);
            qtVar.m(view, false);
        }
    }

    @Override
    public final boolean U(int i3, View view) {
        if (i3 >= 0) {
            ArrayList arrayList = this.Y;
            if (i3 < arrayList.size()) {
                return ((qt) arrayList.get(i3)).j(view);
            }
            return false;
        }
        return false;
    }

    @Override
    public final void V() {
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            qt qtVar = (qt) obj;
            qtVar.f24952c.R();
            qtVar.d.R();
            qtVar.f24953e = null;
            z5.q(qtVar.f24950a.f22065a).v(qtVar);
        }
    }

    @Override
    public final void W(Canvas canvas) {
        int i3;
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
        cu cuVar = this;
        boolean z14 = true;
        if (f22062c0 == null) {
            Paint paint = new Paint(1);
            f22062c0 = paint;
            paint.setColor(251658240);
        }
        boolean R = cuVar.R();
        int L2 = g0.L(2.0f);
        cv cvVar = cuVar.f26434a;
        if (!R && !cvVar.D()) {
            i3 = cvVar.S - L2;
        } else {
            i3 = 0;
        }
        if (!R && !cvVar.D()) {
            i10 = cvVar.T - L2;
        } else {
            i10 = 0;
        }
        int i19 = cuVar.f26436c;
        if (i19 > 0 && (i3 > 0 || i10 > 0)) {
            f10 = ((i19 + i3) + i10) / i19;
        } else {
            f10 = 1.0f;
        }
        int i20 = 0;
        while (true) {
            ArrayList arrayList = cuVar.Y;
            if (i20 < arrayList.size()) {
                qt qtVar = (qt) arrayList.get(i20);
                int i21 = qtVar.G;
                ImageReceiver imageReceiver = qtVar.f24952c;
                int round = Math.round(i21 * f10) - i3;
                int round2 = Math.round(qtVar.I * f10);
                int[] iArr = cuVar.Z;
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
                    int i22 = az.Y0;
                    f11 = 1.0f;
                    if (i22 > 2) {
                        L = g0.L(i22 - 2);
                    } else {
                        L = g0.L(i22);
                    }
                    int min = Math.min(g0.L(3.0f), L);
                    if (cvVar.D()) {
                        imageReceiver.J0(g0.L(12.0f));
                    } else {
                        boolean z15 = cuVar.X;
                        if (z10 && z12) {
                            if (z15 && !cvVar.B() && (cvVar.E() || !cvVar.G())) {
                                i12 = L;
                            } else {
                                i12 = min;
                            }
                        } else {
                            i12 = 0;
                        }
                        if (z10 && z13) {
                            if (!z15 || cvVar.B() || (cvVar.E() && cvVar.G())) {
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
                imageReceiver.y0(f12, qtVar.H, round2, qtVar.J);
                if (!imageReceiver.I() || imageReceiver.f21249i1 != f11) {
                    canvas.drawRect(f12, qtVar.H, round + round2, i14 + qtVar.J, f22062c0);
                }
                qtVar.c(canvas);
                i20++;
                z14 = true;
                cuVar = this;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        ArrayList arrayList = this.Y;
        int actionMasked = motionEvent.getActionMasked();
        Rect rect = this.f26435b;
        motionEvent.offsetLocation(-rect.left, -rect.top);
        try {
            if (actionMasked == 0) {
                this.f22064b0 = null;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    qt qtVar = (qt) arrayList.get(i3);
                    if (qtVar.g(motionEvent.getX(), motionEvent.getY()) && qtVar.k(this.W, motionEvent)) {
                        this.f22064b0 = qtVar;
                        return true;
                    }
                }
            } else {
                qt qtVar2 = this.f22064b0;
                if (qtVar2 != null) {
                    boolean k10 = qtVar2.k(this.W, motionEvent);
                    if (actionMasked == 1 || actionMasked == 3) {
                        this.f22064b0 = null;
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
