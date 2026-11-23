package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;
public abstract class mu extends au implements y5 {
    public static Paint f25594p0;
    public static ColorMatrixColorFilter f25595q0;
    public final boolean X;
    public final ImageReceiver Y;
    public final ImageReceiver Z;
    public Bitmap f25596a0;
    public RadialProgress2 f25597b0;
    public int f25598c0;
    public int f25599d0;
    public boolean f25600e0;
    public final int f25601f0;
    public int f25602g0;
    public boolean f25603h0;
    public boolean f25604i0;
    public int f25605j0;
    public int f25606k0;
    public final int f25607l0;
    public boolean m0;
    public final Path f25608n0;
    public final av f25609o0;

    public mu(fv fvVar, Rect rect, int i7, boolean z10) {
        super(fvVar, rect, i7);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.Y = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.Z = imageReceiver2;
        this.f25602g0 = -1;
        this.f25607l0 = g0.L(48.0f);
        this.f25608n0 = new Path();
        this.f25609o0 = new av();
        this.X = z10;
        this.f25601f0 = a6.q(fvVar.f23940a).k();
        imageReceiver.A1 = true;
        imageReceiver2.A1 = true;
        imageReceiver.f22634h1 = new hi.x4(this, 25);
    }

    @Override
    public final void A(int i7, Rect rect) {
        int i10;
        Rect rect2 = this.f22933b;
        int i11 = rect2.left;
        int i12 = (this.f22932a.C - i11) - rect2.right;
        int i13 = this.f25598c0;
        if (i12 > i13) {
            i10 = (i12 - i13) / 2;
        } else {
            i10 = 0;
        }
        int i14 = i10 + i11;
        int i15 = ((int) this.N) + rect2.top;
        rect.set(i14, i15, i13 + i14, this.f25599d0 + i15);
    }

    @Override
    public final int B() {
        return 1;
    }

    @Override
    public final void C(boolean z10) {
        t0(false);
    }

    @Override
    public final CharSequence E(int i7) {
        int i10;
        if (q0()) {
            i10 = 2131753930;
        } else {
            i10 = 2131753945;
        }
        String N0 = hd.N0(i10, null);
        if (r0() && !this.f25609o0.b()) {
            return TextUtils.concat(N0, ", ", hd.N0(2131745021, null));
        }
        return N0;
    }

    @Override
    public final int I() {
        Rect rect = this.f22933b;
        return rect.top + this.f25599d0 + rect.bottom;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final int K() {
        Rect rect = this.f22933b;
        return rect.left + this.f25598c0 + rect.right;
    }

    @Override
    public final void N(String str) {
        RadialProgress2 radialProgress2 = this.f25597b0;
        if (radialProgress2 != null) {
            radialProgress2.p(true, 1.0f);
        }
        if (p0() && (i0() || this.m0)) {
            j0(true);
        }
        t0(true);
    }

    @Override
    public final void T() {
        View view = this.W;
        ImageReceiver imageReceiver = this.Y;
        imageReceiver.H0(view);
        imageReceiver.P();
        View view2 = this.W;
        ImageReceiver imageReceiver2 = this.Z;
        imageReceiver2.H0(view2);
        imageReceiver2.P();
        t0(false);
    }

    @Override
    public final boolean U(int i7, View view) {
        if (r0()) {
            av avVar = this.f25609o0;
            if (!avVar.f22944b && avVar.f22947f == null) {
                ImageReceiver imageReceiver = this.Y;
                float f10 = imageReceiver.N0;
                float f11 = imageReceiver.O0;
                avVar.c(this.W, imageReceiver.L0 + (f10 / 2.0f), (f11 / 2.0f) + imageReceiver.M0, f10, f11);
                return true;
            }
        }
        fv fvVar = this.f22932a;
        org.telegram.ui.Cells.m1 m1Var = fvVar.F;
        if (m1Var != null) {
            m1Var.p2(fvVar.E, n0());
            return true;
        }
        return false;
    }

    @Override
    public final void V() {
        this.Y.R();
        this.Z.R();
        this.f25596a0 = null;
        a6.q(this.f22932a.f23940a).v(this);
    }

    @Override
    public final void W(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.mu.W(android.graphics.Canvas):void");
    }

    @Override
    public final boolean Y(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.mu.Y(android.view.MotionEvent):boolean");
    }

    @Override
    public final int getObserverTag() {
        return this.f25601f0;
    }

    @Override
    public final void i(long j3, long j10) {
        float f10;
        RadialProgress2 radialProgress2 = this.f25597b0;
        if (radialProgress2 != null) {
            if (j10 <= 0) {
                f10 = 0.0f;
            } else {
                f10 = ((float) j3) / ((float) j10);
            }
            radialProgress2.p(true, Math.min(1.0f, f10));
        }
        if (this.f25602g0 != 1) {
            t0(true);
        }
    }

    public boolean i0() {
        return true;
    }

    public abstract void j0(boolean z10);

    public boolean k0() {
        if ((a6.q(this.f22932a.f23940a).m() & 1) != 0) {
            return true;
        }
        return false;
    }

    public abstract boolean l0();

    public final void m0() {
        boolean z10;
        this.Y.y0(0.0f, 0.0f, this.f25598c0, this.f25599d0);
        int i7 = this.f25598c0;
        int i10 = this.f25607l0;
        this.f25605j0 = (i7 - i10) / 2;
        this.f25606k0 = (this.f25599d0 - i10) / 2;
        boolean k02 = k0();
        this.f25600e0 = k02;
        if (!k02 && !l0()) {
            z10 = false;
        } else {
            z10 = true;
        }
        j0(z10);
    }

    public abstract TL_iv.PageBlock n0();

    public abstract String o0();

    public boolean p0() {
        return false;
    }

    public boolean q0() {
        return false;
    }

    public abstract boolean r0();

    public final void s0() {
        Bitmap n10;
        ImageReceiver imageReceiver = this.Z;
        Bitmap n11 = imageReceiver.n();
        ImageReceiver imageReceiver2 = this.Y;
        if ((n11 == null || imageReceiver2.m() == null) && (n10 = imageReceiver2.n()) != null && !n10.isRecycled()) {
            if (n10 != this.f25596a0 || imageReceiver.n() == null) {
                this.f25596a0 = n10;
                imageReceiver.v0(Utilities.D(n10, false));
                if (f25595q0 == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    g0.n2(colorMatrix, 0.9f);
                    g0.i(colorMatrix, 0.6f);
                    f25595q0 = new ColorMatrixColorFilter(colorMatrix);
                }
                imageReceiver.f22648p1 = f25595q0;
            }
        }
    }

    public final void t0(boolean z10) {
        View view;
        boolean z11;
        View view2;
        RadialProgress2 radialProgress2 = this.f25597b0;
        int i7 = this.f25607l0;
        if (radialProgress2 == null && (view2 = this.W) != null) {
            RadialProgress2 radialProgress22 = new RadialProgress2(view2, null);
            this.f25597b0 = radialProgress22;
            radialProgress22.d = -1;
            radialProgress22.setColors(1711276032, 2130706432, -1, -2500135);
            RadialProgress2 radialProgress23 = this.f25597b0;
            int i10 = this.f25605j0;
            int i11 = this.f25606k0;
            radialProgress23.r(i10, i11, i10 + i7, i7 + i11);
        } else if (radialProgress2 != null && (view = this.W) != null) {
            radialProgress2.n(view);
            RadialProgress2 radialProgress24 = this.f25597b0;
            int i12 = this.f25605j0;
            int i13 = this.f25606k0;
            radialProgress24.r(i12, i13, i12 + i7, i7 + i13);
        }
        String o02 = o0();
        if (TextUtils.isEmpty(o02)) {
            this.f25602g0 = -1;
            RadialProgress2 radialProgress25 = this.f25597b0;
            if (radialProgress25 != null) {
                radialProgress25.setIcon(4, false, false);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver = this.Y;
        org.telegram.ui.Components.c6 m10 = imageReceiver.m();
        if (m10 != null && (m10.s() || imageReceiver.M())) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean l02 = l0();
        fv fvVar = this.f22932a;
        if (!l02 && (!p0() || !z11)) {
            a6.q(fvVar.f23940a).a(o02, null, this);
            float f10 = 0.0f;
            if (!this.f25600e0 && !this.m0 && !w7.G(fvVar.f23940a).S(o02)) {
                if (q0()) {
                    this.f25602g0 = 3;
                    RadialProgress2 radialProgress26 = this.f25597b0;
                    if (radialProgress26 != null) {
                        radialProgress26.setIcon(0, true, z10);
                    }
                } else {
                    this.f25602g0 = 0;
                    RadialProgress2 radialProgress27 = this.f25597b0;
                    if (radialProgress27 != null) {
                        radialProgress27.setIcon(2, true, z10);
                    }
                }
            } else {
                this.f25602g0 = 1;
                Float w10 = fc.D().w(o02);
                if (w10 != null) {
                    f10 = w10.floatValue();
                }
                RadialProgress2 radialProgress28 = this.f25597b0;
                if (radialProgress28 != null) {
                    radialProgress28.setIcon(3, true, z10);
                }
            }
            RadialProgress2 radialProgress29 = this.f25597b0;
            if (radialProgress29 != null) {
                radialProgress29.p(false, f10);
            }
        } else {
            a6.q(fvVar.f23940a).v(this);
            if (q0() && !z11) {
                this.f25602g0 = 3;
                RadialProgress2 radialProgress210 = this.f25597b0;
                if (radialProgress210 != null) {
                    radialProgress210.setIcon(0, false, z10);
                }
            } else if (p0() && !z11 && !i0() && !this.m0) {
                this.f25602g0 = 2;
                RadialProgress2 radialProgress211 = this.f25597b0;
                if (radialProgress211 != null) {
                    radialProgress211.setIcon(8, false, z10);
                }
            } else {
                this.f25602g0 = -1;
                RadialProgress2 radialProgress212 = this.f25597b0;
                if (radialProgress212 != null) {
                    radialProgress212.setIcon(4, false, z10);
                }
            }
        }
        View view3 = this.W;
        if (view3 != null) {
            view3.invalidate();
        }
    }

    public final void u0(ImageReceiver imageReceiver, boolean z10) {
        int L;
        int i7;
        if (z10) {
            imageReceiver.J0(0);
            return;
        }
        int i10 = cz.Y0;
        if (i10 > 2) {
            L = g0.L(i10 - 2);
        } else {
            L = g0.L(i10);
        }
        int min = Math.min(g0.L(3.0f), L);
        fv fvVar = this.f22932a;
        if (fvVar.D()) {
            imageReceiver.J0(g0.L(12.0f));
            return;
        }
        boolean z11 = this.X;
        if (z11 && !fvVar.B() && (fvVar.E() || !fvVar.G())) {
            i7 = L;
        } else {
            i7 = min;
        }
        if (!z11 || (fvVar.E() && fvVar.G())) {
            L = min;
        }
        imageReceiver.K0(i7, L, min, min);
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
