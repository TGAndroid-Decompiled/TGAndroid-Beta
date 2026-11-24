package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_iv;
public final class sg9 extends mg9 {
    public static Paint c0;
    public final boolean X;
    public final ArrayList Y;
    public final int[] Z;
    public final int a0;
    public gg9 b0;

    public sg9(rh9 rh9Var, Rect rect, int i, TL_iv.pageBlockCollage pageblockcollage, boolean z) {
        super(rh9Var, rect, i);
        float f;
        int i2;
        float f2;
        int round;
        float f3;
        int round2;
        int i3;
        gg9 gg9Var;
        this.Y = new ArrayList();
        this.X = z;
        int i4 = 0;
        for (int i5 = 0; i5 < pageblockcollage.items.size(); i5++) {
            TL_iv.PageBlock pageBlock = pageblockcollage.items.get(i5);
            if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                gg9Var = new gg9(rh9Var, (TL_iv.pageBlockPhoto) pageBlock);
            } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
                gg9Var = new gg9(rh9Var, (TL_iv.pageBlockVideo) pageBlock);
            } else {
                gg9Var = null;
            }
            if (gg9Var != null) {
                this.Y.add(gg9Var);
            }
        }
        int i6 = this.c;
        ArrayList arrayList = this.Y;
        this.Z = new int[arrayList.size()];
        if (arrayList.isEmpty()) {
            this.a0 = 0;
            return;
        }
        int i7 = 1;
        if (arrayList.size() == 1) {
            gg9 gg9Var2 = (gg9) arrayList.get(0);
            float f4 = gg9Var2.F;
            f4 = f4 <= 0.0f ? 1.0f : f4;
            int i8 = (int) (i6 / f4);
            Point point = gl.q;
            int max = (int) (Math.max(point.x, point.y) * 0.55f);
            if (i8 > max) {
                i6 = (int) (max * f4);
                i8 = max;
            }
            gg9Var2.m(0, 0, i6, i8);
            this.Z[0] = 15;
            this.a0 = i8;
            return;
        }
        float[] fArr = new float[arrayList.size()];
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            fArr[i9] = ((gg9) arrayList.get(i9)).F;
        }
        c27[] e = rh9.e(fArr);
        int i10 = 0;
        for (c27 c27Var : e) {
            i10 = Math.max(i10, (int) c27Var.d);
        }
        int i11 = i10 + 1;
        float[] fArr2 = new float[i11];
        for (c27 c27Var2 : e) {
            byte b = c27Var2.c;
            if (b == c27Var2.d) {
                fArr2[b] = Math.max(fArr2[b], c27Var2.f);
            }
        }
        int length = e.length;
        int i12 = 0;
        while (i12 < length) {
            c27 c27Var3 = e[i12];
            int i13 = c27Var3.c;
            byte b2 = c27Var3.d;
            if (i13 != b2) {
                int i14 = (b2 - i13) + i7;
                float[] fArr3 = c27Var3.m;
                if (fArr3 != null && fArr3.length == i14) {
                    int i15 = 0;
                    while (i15 < i14) {
                        int i16 = c27Var3.c + i15;
                        fArr2[i16] = Math.max(fArr2[i16], c27Var3.m[i15]);
                        i15++;
                        i7 = i7;
                    }
                } else {
                    i3 = i7;
                    float f5 = c27Var3.f / i14;
                    while (i13 <= c27Var3.d) {
                        fArr2[i13] = Math.max(fArr2[i13], f5);
                        i13++;
                    }
                    i12++;
                    i7 = i3;
                }
            }
            i3 = i7;
            i12++;
            i7 = i3;
        }
        Point point2 = gl.q;
        float max2 = Math.max(point2.x, point2.y) * 0.5f;
        int[] iArr = new int[i10 + 2];
        float f6 = 0.0f;
        for (int i17 = 0; i17 <= i10; i17++) {
            iArr[i17] = Math.round(f6 * max2);
            f6 += fArr2[i17];
        }
        iArr[i11] = Math.round(f6 * max2);
        if (this.a.C()) {
            f = 3.0f;
        } else {
            f = 2.0f;
        }
        int L = gl.L(f);
        int i18 = 0;
        while (i18 < e.length) {
            c27 c27Var4 = e[i18];
            int i19 = iArr[c27Var4.c];
            int i20 = iArr[c27Var4.d + 1] - i19;
            float f7 = 1000.0f;
            if (c27Var4.j > 0) {
                round = Math.round((i2 * i6) / 1000.0f);
                f2 = 1000.0f;
            } else {
                int i21 = i4;
                int i22 = i21;
                while (i21 < e.length) {
                    if (i21 == i18) {
                        f3 = f7;
                    } else {
                        c27 c27Var5 = e[i21];
                        f3 = f7;
                        byte b3 = c27Var5.c;
                        byte b4 = c27Var4.c;
                        if (b3 <= b4 && c27Var5.d >= b4 && c27Var5.a < c27Var4.a) {
                            i22 += c27Var5.e;
                        }
                    }
                    i21++;
                    f7 = f3;
                }
                f2 = f7;
                round = Math.round((i22 * i6) / f2);
            }
            if ((c27Var4.l & 2) != 0) {
                round2 = i6 - round;
            } else {
                round2 = Math.round((c27Var4.e * i6) / f2) - L;
            }
            if ((c27Var4.l & 8) == 0) {
                i20 -= L;
            }
            ((gg9) arrayList.get(i18)).m(round, i19, Math.max(0, round2), Math.max(0, i20));
            this.Z[i18] = c27Var4.l;
            i18++;
            i4 = 0;
        }
        this.a0 = iArr[i11];
    }

    @Override
    public final void A(int i, Rect rect) {
        if (i >= 0) {
            ArrayList arrayList = this.Y;
            if (i < arrayList.size()) {
                gg9 gg9Var = (gg9) arrayList.get(i);
                Rect rect2 = this.b;
                int i2 = rect2.left + gg9Var.G;
                int i3 = ((int) this.N) + rect2.top + gg9Var.H;
                rect.set(i2, i3, gg9Var.I + i2, gg9Var.J + i3);
            }
        }
    }

    @Override
    public final int C() {
        return this.Y.size();
    }

    @Override
    public final CharSequence E(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.Y;
            if (i < arrayList.size()) {
                return ((gg9) arrayList.get(i)).f();
            }
            return null;
        }
        return null;
    }

    @Override
    public final int I() {
        return this.a0;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final int K() {
        Rect rect = this.b;
        return rect.left + this.c + rect.right;
    }

    @Override
    public final void T() {
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            gg9 gg9Var = (gg9) obj;
            View view = this.W;
            gg9Var.T = view;
            ImageReceiver imageReceiver = gg9Var.c;
            imageReceiver.p0(view);
            imageReceiver.I();
            ImageReceiver imageReceiver2 = gg9Var.d;
            imageReceiver2.p0(view);
            imageReceiver2.I();
            gg9Var.d(view);
            gg9Var.n(view, false);
        }
    }

    @Override
    public final boolean U(int i, View view) {
        if (i >= 0) {
            ArrayList arrayList = this.Y;
            if (i < arrayList.size()) {
                return ((gg9) arrayList.get(i)).j(view);
            }
            return false;
        }
        return false;
    }

    @Override
    public final void V() {
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            gg9 gg9Var = (gg9) obj;
            gg9Var.c.K();
            gg9Var.d.K();
            gg9Var.e = null;
            up3.q(gg9Var.a.a).v(gg9Var);
        }
    }

    @Override
    public final void W(Canvas canvas) {
        int i;
        int i2;
        float f;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float f2;
        int L;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        sg9 sg9Var = this;
        boolean z5 = true;
        if (c0 == null) {
            Paint paint = new Paint(1);
            c0 = paint;
            paint.setColor(251658240);
        }
        boolean R = sg9Var.R();
        int L2 = gl.L(2.0f);
        rh9 rh9Var = sg9Var.a;
        if (!R && !rh9Var.C()) {
            i = rh9Var.S - L2;
        } else {
            i = 0;
        }
        if (!R && !rh9Var.C()) {
            i2 = rh9Var.T - L2;
        } else {
            i2 = 0;
        }
        int i11 = sg9Var.c;
        if (i11 > 0 && (i > 0 || i2 > 0)) {
            f = ((i11 + i) + i2) / i11;
        } else {
            f = 1.0f;
        }
        int i12 = 0;
        while (true) {
            ArrayList arrayList = sg9Var.Y;
            if (i12 < arrayList.size()) {
                gg9 gg9Var = (gg9) arrayList.get(i12);
                int i13 = gg9Var.G;
                ImageReceiver imageReceiver = gg9Var.c;
                int round = Math.round(i13 * f) - i;
                int round2 = Math.round(gg9Var.I * f);
                int[] iArr = sg9Var.Z;
                if (iArr != null && i12 < iArr.length) {
                    i3 = iArr[i12];
                } else {
                    i3 = 0;
                }
                if ((i3 & 4) != 0) {
                    z = z5;
                } else {
                    z = false;
                }
                if ((i3 & 8) != 0) {
                    z2 = z5;
                } else {
                    z2 = false;
                }
                if ((i3 & 1) != 0) {
                    z3 = z5;
                } else {
                    z3 = false;
                }
                if ((i3 & 2) != 0) {
                    z4 = z5;
                } else {
                    z4 = false;
                }
                if (R) {
                    int L3 = gl.L(8.0f);
                    if (z && z3) {
                        i7 = L3;
                    } else {
                        i7 = 0;
                    }
                    if (z && z4) {
                        i8 = L3;
                    } else {
                        i8 = 0;
                    }
                    if (z2 && z4) {
                        i9 = L3;
                    } else {
                        i9 = 0;
                    }
                    if (z2 && z3) {
                        i10 = L3;
                    } else {
                        i10 = 0;
                    }
                    imageReceiver.r0(i7, i8, i9, i10);
                    f2 = 1.0f;
                } else {
                    int i14 = gba.U0;
                    f2 = 1.0f;
                    if (i14 > 2) {
                        L = gl.L(i14 - 2);
                    } else {
                        L = gl.L(i14);
                    }
                    int min = Math.min(gl.L(3.0f), L);
                    if (rh9Var.C()) {
                        imageReceiver.q0(gl.L(12.0f));
                    } else {
                        boolean z6 = sg9Var.X;
                        if (z && z3) {
                            if (z6 && !rh9Var.A() && (rh9Var.D() || !rh9Var.F())) {
                                i4 = L;
                            } else {
                                i4 = min;
                            }
                        } else {
                            i4 = 0;
                        }
                        if (z && z4) {
                            if (!z6 || rh9Var.A() || (rh9Var.D() && rh9Var.F())) {
                                L = min;
                            }
                        } else {
                            L = 0;
                        }
                        if (z2 && z4) {
                            i5 = min;
                        } else {
                            i5 = 0;
                        }
                        imageReceiver.r0(i4, L, i5, (z2 && z3) ? 0 : 0);
                    }
                }
                float f3 = round;
                imageReceiver.i0(f3, gg9Var.H, round2, gg9Var.J);
                if (!imageReceiver.B() || imageReceiver.i1 != f2) {
                    canvas.drawRect(f3, gg9Var.H, round + round2, i6 + gg9Var.J, c0);
                }
                gg9Var.c(canvas);
                i12++;
                z5 = true;
                sg9Var = this;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        ArrayList arrayList = this.Y;
        int actionMasked = motionEvent.getActionMasked();
        Rect rect = this.b;
        motionEvent.offsetLocation(-rect.left, -rect.top);
        try {
            if (actionMasked == 0) {
                this.b0 = null;
                for (int i = 0; i < arrayList.size(); i++) {
                    gg9 gg9Var = (gg9) arrayList.get(i);
                    if (gg9Var.g(motionEvent.getX(), motionEvent.getY()) && gg9Var.k(this.W, motionEvent)) {
                        this.b0 = gg9Var;
                        return true;
                    }
                }
            } else {
                gg9 gg9Var2 = this.b0;
                if (gg9Var2 != null) {
                    boolean k = gg9Var2.k(this.W, motionEvent);
                    if (actionMasked == 1 || actionMasked == 3) {
                        this.b0 = null;
                    }
                    return k;
                }
            }
            return false;
        } finally {
            motionEvent.offsetLocation(rect.left, rect.top);
        }
    }
}
