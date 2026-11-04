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
public abstract class ju extends xt implements x5 {
    public static Paint f23711p0;
    public static ColorMatrixColorFilter f23712q0;
    public final boolean X;
    public final ImageReceiver Y;
    public final ImageReceiver Z;
    public Bitmap f23713a0;
    public RadialProgress2 f23714b0;
    public int f23715c0;
    public int f23716d0;
    public boolean f23717e0;
    public final int f23718f0;
    public int f23719g0;
    public boolean f23720h0;
    public boolean f23721i0;
    public int f23722j0;
    public int f23723k0;
    public final int f23724l0;
    public boolean m0;
    public final Path f23725n0;
    public final xu f23726o0;

    public ju(cv cvVar, Rect rect, int i3, boolean z10) {
        super(cvVar, rect, i3);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.Y = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.Z = imageReceiver2;
        this.f23719g0 = -1;
        this.f23724l0 = g0.L(48.0f);
        this.f23725n0 = new Path();
        this.f23726o0 = new xu();
        this.X = z10;
        this.f23718f0 = z5.q(cvVar.f22065a).k();
        imageReceiver.A1 = true;
        imageReceiver2.A1 = true;
        imageReceiver.f21247h1 = new hi.d(this, 25);
    }

    @Override
    public final void A(int i3, Rect rect) {
        int i10;
        Rect rect2 = this.f26435b;
        int i11 = rect2.left;
        int i12 = (this.f26434a.C - i11) - rect2.right;
        int i13 = this.f23715c0;
        if (i12 > i13) {
            i10 = (i12 - i13) / 2;
        } else {
            i10 = 0;
        }
        int i14 = i10 + i11;
        int i15 = ((int) this.N) + rect2.top;
        rect.set(i14, i15, i13 + i14, this.f23716d0 + i15);
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
    public final CharSequence E(int i3) {
        int i10;
        if (q0()) {
            i10 = 2131753933;
        } else {
            i10 = 2131753948;
        }
        String M0 = bd.M0(i10, null);
        if (r0() && !this.f23726o0.b()) {
            return TextUtils.concat(M0, ", ", bd.M0(2131745272, null));
        }
        return M0;
    }

    @Override
    public final int I() {
        Rect rect = this.f26435b;
        return rect.top + this.f23716d0 + rect.bottom;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final int K() {
        Rect rect = this.f26435b;
        return rect.left + this.f23715c0 + rect.right;
    }

    @Override
    public final void M(String str) {
        RadialProgress2 radialProgress2 = this.f23714b0;
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
    public final boolean U(int i3, View view) {
        if (r0()) {
            xu xuVar = this.f23726o0;
            if (!xuVar.f26446b && xuVar.f26449f == null) {
                ImageReceiver imageReceiver = this.Y;
                float f10 = imageReceiver.N0;
                float f11 = imageReceiver.O0;
                xuVar.c(this.W, imageReceiver.L0 + (f10 / 2.0f), (f11 / 2.0f) + imageReceiver.M0, f10, f11);
                return true;
            }
        }
        cv cvVar = this.f26434a;
        org.telegram.ui.Cells.l1 l1Var = cvVar.F;
        if (l1Var != null) {
            l1Var.e2(cvVar.E, n0());
            return true;
        }
        return false;
    }

    @Override
    public final void V() {
        this.Y.R();
        this.Z.R();
        this.f23713a0 = null;
        z5.q(this.f26434a.f22065a).v(this);
    }

    @Override
    public final void W(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ju.W(android.graphics.Canvas):void");
    }

    @Override
    public final boolean Y(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ju.Y(android.view.MotionEvent):boolean");
    }

    @Override
    public final int getObserverTag() {
        return this.f23718f0;
    }

    @Override
    public final void i(long j10, long j11) {
        float f10;
        RadialProgress2 radialProgress2 = this.f23714b0;
        if (radialProgress2 != null) {
            if (j11 <= 0) {
                f10 = 0.0f;
            } else {
                f10 = ((float) j10) / ((float) j11);
            }
            radialProgress2.p(true, Math.min(1.0f, f10));
        }
        if (this.f23719g0 != 1) {
            t0(true);
        }
    }

    public boolean i0() {
        return true;
    }

    public abstract void j0(boolean z10);

    public boolean k0() {
        if ((z5.q(this.f26434a.f22065a).m() & 1) != 0) {
            return true;
        }
        return false;
    }

    public abstract boolean l0();

    public final void m0() {
        boolean z10;
        this.Y.y0(0.0f, 0.0f, this.f23715c0, this.f23716d0);
        int i3 = this.f23715c0;
        int i10 = this.f23724l0;
        this.f23722j0 = (i3 - i10) / 2;
        this.f23723k0 = (this.f23716d0 - i10) / 2;
        boolean k02 = k0();
        this.f23717e0 = k02;
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
        Bitmap n4;
        ImageReceiver imageReceiver = this.Z;
        Bitmap n10 = imageReceiver.n();
        ImageReceiver imageReceiver2 = this.Y;
        if ((n10 == null || imageReceiver2.m() == null) && (n4 = imageReceiver2.n()) != null && !n4.isRecycled()) {
            if (n4 != this.f23713a0 || imageReceiver.n() == null) {
                this.f23713a0 = n4;
                imageReceiver.v0(Utilities.D(n4, false));
                if (f23712q0 == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    g0.n2(colorMatrix, 0.9f);
                    g0.i(colorMatrix, 0.6f);
                    f23712q0 = new ColorMatrixColorFilter(colorMatrix);
                }
                imageReceiver.f21261p1 = f23712q0;
            }
        }
    }

    public final void t0(boolean z10) {
        View view;
        boolean z11;
        View view2;
        RadialProgress2 radialProgress2 = this.f23714b0;
        int i3 = this.f23724l0;
        if (radialProgress2 == null && (view2 = this.W) != null) {
            RadialProgress2 radialProgress22 = new RadialProgress2(view2, null);
            this.f23714b0 = radialProgress22;
            radialProgress22.d = -1;
            radialProgress22.setColors(1711276032, 2130706432, -1, -2500135);
            RadialProgress2 radialProgress23 = this.f23714b0;
            int i10 = this.f23722j0;
            int i11 = this.f23723k0;
            radialProgress23.r(i10, i11, i10 + i3, i3 + i11);
        } else if (radialProgress2 != null && (view = this.W) != null) {
            radialProgress2.n(view);
            RadialProgress2 radialProgress24 = this.f23714b0;
            int i12 = this.f23722j0;
            int i13 = this.f23723k0;
            radialProgress24.r(i12, i13, i12 + i3, i3 + i13);
        }
        String o02 = o0();
        if (TextUtils.isEmpty(o02)) {
            this.f23719g0 = -1;
            RadialProgress2 radialProgress25 = this.f23714b0;
            if (radialProgress25 != null) {
                radialProgress25.setIcon(4, false, false);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver = this.Y;
        org.telegram.ui.Components.t5 m10 = imageReceiver.m();
        if (m10 != null && (m10.s() || imageReceiver.M())) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean l02 = l0();
        cv cvVar = this.f26434a;
        if (!l02 && (!p0() || !z11)) {
            z5.q(cvVar.f22065a).a(o02, null, this);
            float f10 = 0.0f;
            if (!this.f23717e0 && !this.m0 && !w7.G(cvVar.f22065a).T(o02)) {
                if (q0()) {
                    this.f23719g0 = 3;
                    RadialProgress2 radialProgress26 = this.f23714b0;
                    if (radialProgress26 != null) {
                        radialProgress26.setIcon(0, true, z10);
                    }
                } else {
                    this.f23719g0 = 0;
                    RadialProgress2 radialProgress27 = this.f23714b0;
                    if (radialProgress27 != null) {
                        radialProgress27.setIcon(2, true, z10);
                    }
                }
            } else {
                this.f23719g0 = 1;
                Float w10 = zb.D().w(o02);
                if (w10 != null) {
                    f10 = w10.floatValue();
                }
                RadialProgress2 radialProgress28 = this.f23714b0;
                if (radialProgress28 != null) {
                    radialProgress28.setIcon(3, true, z10);
                }
            }
            RadialProgress2 radialProgress29 = this.f23714b0;
            if (radialProgress29 != null) {
                radialProgress29.p(false, f10);
            }
        } else {
            z5.q(cvVar.f22065a).v(this);
            if (q0() && !z11) {
                this.f23719g0 = 3;
                RadialProgress2 radialProgress210 = this.f23714b0;
                if (radialProgress210 != null) {
                    radialProgress210.setIcon(0, false, z10);
                }
            } else if (p0() && !z11 && !i0() && !this.m0) {
                this.f23719g0 = 2;
                RadialProgress2 radialProgress211 = this.f23714b0;
                if (radialProgress211 != null) {
                    radialProgress211.setIcon(8, false, z10);
                }
            } else {
                this.f23719g0 = -1;
                RadialProgress2 radialProgress212 = this.f23714b0;
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
        int i3;
        if (z10) {
            imageReceiver.J0(0);
            return;
        }
        int i10 = az.Y0;
        if (i10 > 2) {
            L = g0.L(i10 - 2);
        } else {
            L = g0.L(i10);
        }
        int min = Math.min(g0.L(3.0f), L);
        cv cvVar = this.f26434a;
        if (cvVar.D()) {
            imageReceiver.J0(g0.L(12.0f));
            return;
        }
        boolean z11 = this.X;
        if (z11 && !cvVar.B() && (cvVar.E() || !cvVar.G())) {
            i3 = L;
        } else {
            i3 = min;
        }
        if (!z11 || (cvVar.E() && cvVar.G())) {
            L = min;
        }
        imageReceiver.K0(i3, L, min, min);
    }

    @Override
    public final void o(long j10, long j11) {
    }
}
