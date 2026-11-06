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
public abstract class ru extends fu implements x5 {
    public static Paint f25335o0;
    public static ColorMatrixColorFilter f25336p0;
    public final boolean W;
    public final ImageReceiver X;
    public final ImageReceiver Y;
    public Bitmap Z;
    public RadialProgress2 f25337a0;
    public int f25338b0;
    public int f25339c0;
    public boolean f25340d0;
    public final int f25341e0;
    public int f25342f0;
    public boolean f25343g0;
    public boolean f25344h0;
    public int f25345i0;
    public int f25346j0;
    public final int f25347k0;
    public boolean f25348l0;
    public final Path m0;
    public final fv f25349n0;

    public ru(kv kvVar, Rect rect, int i7, boolean z9) {
        super(kvVar, rect, i7);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.X = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.Y = imageReceiver2;
        this.f25342f0 = -1;
        this.f25347k0 = g0.L(48.0f);
        this.m0 = new Path();
        this.f25349n0 = new fv();
        this.W = z9;
        this.f25341e0 = z5.q(kvVar.f23763a).k();
        imageReceiver.f21233z1 = true;
        imageReceiver2.f21233z1 = true;
        imageReceiver.f21192g1 = new h9.f1(this, 24);
    }

    @Override
    public final void A(int i7, Rect rect) {
        int i10;
        Rect rect2 = this.f22451b;
        int i11 = rect2.left;
        int i12 = (this.f22450a.C - i11) - rect2.right;
        int i13 = this.f25338b0;
        if (i12 > i13) {
            i10 = (i12 - i13) / 2;
        } else {
            i10 = 0;
        }
        int i14 = i10 + i11;
        int i15 = ((int) this.M) + rect2.top;
        rect.set(i14, i15, i13 + i14, this.f25339c0 + i15);
    }

    @Override
    public final int B() {
        return 1;
    }

    @Override
    public final void C(boolean z9) {
        t0(false);
    }

    @Override
    public final CharSequence E(int i7) {
        int i10;
        if (q0()) {
            i10 = 2131753933;
        } else {
            i10 = 2131753948;
        }
        String M0 = hd.M0(i10, null);
        if (r0() && !this.f25349n0.b()) {
            return TextUtils.concat(M0, ", ", hd.M0(2131745263, null));
        }
        return M0;
    }

    @Override
    public final int I() {
        Rect rect = this.f22451b;
        return rect.top + this.f25339c0 + rect.bottom;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final int K() {
        Rect rect = this.f22451b;
        return rect.left + this.f25338b0 + rect.right;
    }

    @Override
    public final void M(String str) {
        RadialProgress2 radialProgress2 = this.f25337a0;
        if (radialProgress2 != null) {
            radialProgress2.p(true, 1.0f);
        }
        if (p0() && (i0() || this.f25348l0)) {
            j0(true);
        }
        t0(true);
    }

    @Override
    public final void T() {
        View view = this.V;
        ImageReceiver imageReceiver = this.X;
        imageReceiver.H0(view);
        imageReceiver.P();
        View view2 = this.V;
        ImageReceiver imageReceiver2 = this.Y;
        imageReceiver2.H0(view2);
        imageReceiver2.P();
        t0(false);
    }

    @Override
    public final boolean U(int i7, View view) {
        if (r0()) {
            fv fvVar = this.f25349n0;
            if (!fvVar.f22462b && fvVar.f22465f == null) {
                ImageReceiver imageReceiver = this.X;
                float f10 = imageReceiver.M0;
                float f11 = imageReceiver.N0;
                fvVar.c(this.V, imageReceiver.K0 + (f10 / 2.0f), (f11 / 2.0f) + imageReceiver.L0, f10, f11);
                return true;
            }
        }
        kv kvVar = this.f22450a;
        org.telegram.ui.Cells.l1 l1Var = kvVar.F;
        if (l1Var != null) {
            l1Var.b2(kvVar.E, n0());
            return true;
        }
        return false;
    }

    @Override
    public final void V() {
        this.X.R();
        this.Y.R();
        this.Z = null;
        z5.q(this.f22450a.f23763a).v(this);
    }

    @Override
    public final void W(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ru.W(android.graphics.Canvas):void");
    }

    @Override
    public final boolean Y(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ru.Y(android.view.MotionEvent):boolean");
    }

    @Override
    public final int getObserverTag() {
        return this.f25341e0;
    }

    @Override
    public final void i(long j3, long j10) {
        float f10;
        RadialProgress2 radialProgress2 = this.f25337a0;
        if (radialProgress2 != null) {
            if (j10 <= 0) {
                f10 = 0.0f;
            } else {
                f10 = ((float) j3) / ((float) j10);
            }
            radialProgress2.p(true, Math.min(1.0f, f10));
        }
        if (this.f25342f0 != 1) {
            t0(true);
        }
    }

    public boolean i0() {
        return true;
    }

    public abstract void j0(boolean z9);

    public boolean k0() {
        if ((z5.q(this.f22450a.f23763a).m() & 1) != 0) {
            return true;
        }
        return false;
    }

    public abstract boolean l0();

    public final void m0() {
        boolean z9;
        this.X.y0(0.0f, 0.0f, this.f25338b0, this.f25339c0);
        int i7 = this.f25338b0;
        int i10 = this.f25347k0;
        this.f25345i0 = (i7 - i10) / 2;
        this.f25346j0 = (this.f25339c0 - i10) / 2;
        boolean k02 = k0();
        this.f25340d0 = k02;
        if (!k02 && !l0()) {
            z9 = false;
        } else {
            z9 = true;
        }
        j0(z9);
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
        ImageReceiver imageReceiver = this.Y;
        Bitmap n11 = imageReceiver.n();
        ImageReceiver imageReceiver2 = this.X;
        if ((n11 == null || imageReceiver2.m() == null) && (n10 = imageReceiver2.n()) != null && !n10.isRecycled()) {
            if (n10 != this.Z || imageReceiver.n() == null) {
                this.Z = n10;
                imageReceiver.v0(Utilities.D(n10, false));
                if (f25336p0 == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    g0.n2(colorMatrix, 0.9f);
                    g0.i(colorMatrix, 0.6f);
                    f25336p0 = new ColorMatrixColorFilter(colorMatrix);
                }
                imageReceiver.f21206o1 = f25336p0;
            }
        }
    }

    public final void t0(boolean z9) {
        View view;
        boolean z10;
        View view2;
        RadialProgress2 radialProgress2 = this.f25337a0;
        int i7 = this.f25347k0;
        if (radialProgress2 == null && (view2 = this.V) != null) {
            RadialProgress2 radialProgress22 = new RadialProgress2(view2, null);
            this.f25337a0 = radialProgress22;
            radialProgress22.d = -1;
            radialProgress22.setColors(1711276032, 2130706432, -1, -2500135);
            RadialProgress2 radialProgress23 = this.f25337a0;
            int i10 = this.f25345i0;
            int i11 = this.f25346j0;
            radialProgress23.r(i10, i11, i10 + i7, i7 + i11);
        } else if (radialProgress2 != null && (view = this.V) != null) {
            radialProgress2.n(view);
            RadialProgress2 radialProgress24 = this.f25337a0;
            int i12 = this.f25345i0;
            int i13 = this.f25346j0;
            radialProgress24.r(i12, i13, i12 + i7, i7 + i13);
        }
        String o02 = o0();
        if (TextUtils.isEmpty(o02)) {
            this.f25342f0 = -1;
            RadialProgress2 radialProgress25 = this.f25337a0;
            if (radialProgress25 != null) {
                radialProgress25.setIcon(4, false, false);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver = this.X;
        org.telegram.ui.Components.v5 m10 = imageReceiver.m();
        if (m10 != null && (m10.s() || imageReceiver.M())) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean l02 = l0();
        kv kvVar = this.f22450a;
        if (!l02 && (!p0() || !z10)) {
            z5.q(kvVar.f23763a).a(o02, null, this);
            float f10 = 0.0f;
            if (!this.f25340d0 && !this.f25348l0 && !w7.G(kvVar.f23763a).S(o02)) {
                if (q0()) {
                    this.f25342f0 = 3;
                    RadialProgress2 radialProgress26 = this.f25337a0;
                    if (radialProgress26 != null) {
                        radialProgress26.setIcon(0, true, z9);
                    }
                } else {
                    this.f25342f0 = 0;
                    RadialProgress2 radialProgress27 = this.f25337a0;
                    if (radialProgress27 != null) {
                        radialProgress27.setIcon(2, true, z9);
                    }
                }
            } else {
                this.f25342f0 = 1;
                Float w10 = gc.D().w(o02);
                if (w10 != null) {
                    f10 = w10.floatValue();
                }
                RadialProgress2 radialProgress28 = this.f25337a0;
                if (radialProgress28 != null) {
                    radialProgress28.setIcon(3, true, z9);
                }
            }
            RadialProgress2 radialProgress29 = this.f25337a0;
            if (radialProgress29 != null) {
                radialProgress29.p(false, f10);
            }
        } else {
            z5.q(kvVar.f23763a).v(this);
            if (q0() && !z10) {
                this.f25342f0 = 3;
                RadialProgress2 radialProgress210 = this.f25337a0;
                if (radialProgress210 != null) {
                    radialProgress210.setIcon(0, false, z9);
                }
            } else if (p0() && !z10 && !i0() && !this.f25348l0) {
                this.f25342f0 = 2;
                RadialProgress2 radialProgress211 = this.f25337a0;
                if (radialProgress211 != null) {
                    radialProgress211.setIcon(8, false, z9);
                }
            } else {
                this.f25342f0 = -1;
                RadialProgress2 radialProgress212 = this.f25337a0;
                if (radialProgress212 != null) {
                    radialProgress212.setIcon(4, false, z9);
                }
            }
        }
        View view3 = this.V;
        if (view3 != null) {
            view3.invalidate();
        }
    }

    public final void u0(ImageReceiver imageReceiver, boolean z9) {
        int L;
        int i7;
        if (z9) {
            imageReceiver.J0(0);
            return;
        }
        int i10 = iz.Y0;
        if (i10 > 2) {
            L = g0.L(i10 - 2);
        } else {
            L = g0.L(i10);
        }
        int min = Math.min(g0.L(3.0f), L);
        kv kvVar = this.f22450a;
        if (kvVar.D()) {
            imageReceiver.J0(g0.L(12.0f));
            return;
        }
        boolean z10 = this.W;
        if (z10 && !kvVar.B() && (kvVar.E() || !kvVar.G())) {
            i7 = L;
        } else {
            i7 = min;
        }
        if (!z10 || (kvVar.E() && kvVar.G())) {
            L = min;
        }
        imageReceiver.K0(i7, L, min, min);
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
