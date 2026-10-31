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
public abstract class cv extends qu implements z5 {
    public static Paint f15076o0;
    public static ColorMatrixColorFilter f15077p0;
    public final boolean W;
    public final ImageReceiver X;
    public final ImageReceiver Y;
    public Bitmap Z;
    public RadialProgress2 f15078a0;
    public int f15079b0;
    public int f15080c0;
    public boolean f15081d0;
    public final int f15082e0;
    public int f15083f0;
    public boolean f15084g0;
    public boolean f15085h0;
    public int f15086i0;
    public int f15087j0;
    public final int f15088k0;
    public boolean f15089l0;
    public final Path m0;
    public final qv f15090n0;

    public cv(vv vvVar, Rect rect, int i10, boolean z10) {
        super(vvVar, rect, i10);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.X = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.Y = imageReceiver2;
        this.f15083f0 = -1;
        this.f15088k0 = i0.L(48.0f);
        this.m0 = new Path();
        this.f15090n0 = new qv();
        this.W = z10;
        this.f15082e0 = b6.q(vvVar.f18986a).k();
        imageReceiver.f14424z1 = true;
        imageReceiver2.f14424z1 = true;
        imageReceiver.f14382g1 = new n2.u(this, 6);
    }

    @Override
    public final void A(int i10, Rect rect) {
        int i11;
        Rect rect2 = this.f17622b;
        int i12 = rect2.left;
        int i13 = (this.f17621a.C - i12) - rect2.right;
        int i14 = this.f15079b0;
        if (i13 > i14) {
            i11 = (i13 - i14) / 2;
        } else {
            i11 = 0;
        }
        int i15 = i11 + i12;
        int i16 = ((int) this.M) + rect2.top;
        rect.set(i15, i16, i14 + i15, this.f15080c0 + i16);
    }

    @Override
    public final int B() {
        return 1;
    }

    @Override
    public final void C(boolean z10) {
        s0(false);
    }

    @Override
    public final CharSequence E(int i10) {
        int i11;
        if (p0()) {
            i11 = 2131753933;
        } else {
            i11 = 2131753948;
        }
        String L0 = cd.L0(i11, null);
        if (q0() && !this.f15090n0.b()) {
            return TextUtils.concat(L0, ", ", cd.L0(2131745280, null));
        }
        return L0;
    }

    @Override
    public final int H() {
        Rect rect = this.f17622b;
        return rect.top + this.f15080c0 + rect.bottom;
    }

    @Override
    public final int I() {
        return J();
    }

    @Override
    public final int J() {
        Rect rect = this.f17622b;
        return rect.left + this.f15079b0 + rect.right;
    }

    @Override
    public final void M(String str) {
        RadialProgress2 radialProgress2 = this.f15078a0;
        if (radialProgress2 != null) {
            radialProgress2.p(true, 1.0f);
        }
        if (o0() && (h0() || this.f15089l0)) {
            i0(true);
        }
        s0(true);
    }

    @Override
    public final void S() {
        View view = this.V;
        ImageReceiver imageReceiver = this.X;
        imageReceiver.H0(view);
        imageReceiver.P();
        View view2 = this.V;
        ImageReceiver imageReceiver2 = this.Y;
        imageReceiver2.H0(view2);
        imageReceiver2.P();
        s0(false);
    }

    @Override
    public final boolean T(int i10, View view) {
        if (q0()) {
            qv qvVar = this.f15090n0;
            if (!qvVar.f17632b && qvVar.f17634f == null) {
                ImageReceiver imageReceiver = this.X;
                float f7 = imageReceiver.M0;
                float f10 = imageReceiver.N0;
                qvVar.c(this.V, imageReceiver.K0 + (f7 / 2.0f), (f10 / 2.0f) + imageReceiver.L0, f7, f10);
                return true;
            }
        }
        vv vvVar = this.f17621a;
        org.telegram.ui.Cells.l1 l1Var = vvVar.F;
        if (l1Var != null) {
            l1Var.W1(vvVar.E, m0());
            return true;
        }
        return false;
    }

    @Override
    public final void U() {
        this.X.R();
        this.Y.R();
        this.Z = null;
        b6.q(this.f17621a.f18986a).v(this);
    }

    @Override
    public final void V(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.cv.V(android.graphics.Canvas):void");
    }

    @Override
    public final boolean X(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.cv.X(android.view.MotionEvent):boolean");
    }

    @Override
    public final int getObserverTag() {
        return this.f15082e0;
    }

    public boolean h0() {
        return true;
    }

    @Override
    public final void i(long j10, long j11) {
        float f7;
        RadialProgress2 radialProgress2 = this.f15078a0;
        if (radialProgress2 != null) {
            if (j11 <= 0) {
                f7 = 0.0f;
            } else {
                f7 = ((float) j10) / ((float) j11);
            }
            radialProgress2.p(true, Math.min(1.0f, f7));
        }
        if (this.f15083f0 != 1) {
            s0(true);
        }
    }

    public abstract void i0(boolean z10);

    public boolean j0() {
        if ((b6.q(this.f17621a.f18986a).m() & 1) != 0) {
            return true;
        }
        return false;
    }

    public abstract boolean k0();

    public final void l0() {
        boolean z10;
        this.X.y0(0.0f, 0.0f, this.f15079b0, this.f15080c0);
        int i10 = this.f15079b0;
        int i11 = this.f15088k0;
        this.f15086i0 = (i10 - i11) / 2;
        this.f15087j0 = (this.f15080c0 - i11) / 2;
        boolean j02 = j0();
        this.f15081d0 = j02;
        if (!j02 && !k0()) {
            z10 = false;
        } else {
            z10 = true;
        }
        i0(z10);
    }

    public abstract TL_iv.PageBlock m0();

    public abstract String n0();

    public boolean o0() {
        return false;
    }

    public boolean p0() {
        return false;
    }

    public abstract boolean q0();

    public final void r0() {
        Bitmap n10;
        ImageReceiver imageReceiver = this.Y;
        Bitmap n11 = imageReceiver.n();
        ImageReceiver imageReceiver2 = this.X;
        if ((n11 == null || imageReceiver2.m() == null) && (n10 = imageReceiver2.n()) != null && !n10.isRecycled()) {
            if (n10 != this.Z || imageReceiver.n() == null) {
                this.Z = n10;
                imageReceiver.v0(Utilities.D(n10, false));
                if (f15077p0 == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    i0.n2(colorMatrix, 0.9f);
                    i0.i(colorMatrix, 0.6f);
                    f15077p0 = new ColorMatrixColorFilter(colorMatrix);
                }
                imageReceiver.f14397o1 = f15077p0;
            }
        }
    }

    public final void s0(boolean z10) {
        View view;
        boolean z11;
        View view2;
        RadialProgress2 radialProgress2 = this.f15078a0;
        int i10 = this.f15088k0;
        if (radialProgress2 == null && (view2 = this.V) != null) {
            RadialProgress2 radialProgress22 = new RadialProgress2(view2, null);
            this.f15078a0 = radialProgress22;
            radialProgress22.d = -1;
            radialProgress22.setColors(1711276032, 2130706432, -1, -2500135);
            RadialProgress2 radialProgress23 = this.f15078a0;
            int i11 = this.f15086i0;
            int i12 = this.f15087j0;
            radialProgress23.r(i11, i12, i11 + i10, i10 + i12);
        } else if (radialProgress2 != null && (view = this.V) != null) {
            radialProgress2.n(view);
            RadialProgress2 radialProgress24 = this.f15078a0;
            int i13 = this.f15086i0;
            int i14 = this.f15087j0;
            radialProgress24.r(i13, i14, i13 + i10, i10 + i14);
        }
        String n02 = n0();
        if (TextUtils.isEmpty(n02)) {
            this.f15083f0 = -1;
            RadialProgress2 radialProgress25 = this.f15078a0;
            if (radialProgress25 != null) {
                radialProgress25.setIcon(4, false, false);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver = this.X;
        org.telegram.ui.Components.s5 m10 = imageReceiver.m();
        if (m10 != null && (m10.s() || imageReceiver.M())) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean k02 = k0();
        vv vvVar = this.f17621a;
        if (!k02 && (!o0() || !z11)) {
            b6.q(vvVar.f18986a).a(n02, null, this);
            float f7 = 0.0f;
            if (!this.f15081d0 && !this.f15089l0 && !b8.G(vvVar.f18986a).T(n02)) {
                if (p0()) {
                    this.f15083f0 = 3;
                    RadialProgress2 radialProgress26 = this.f15078a0;
                    if (radialProgress26 != null) {
                        radialProgress26.setIcon(0, true, z10);
                    }
                } else {
                    this.f15083f0 = 0;
                    RadialProgress2 radialProgress27 = this.f15078a0;
                    if (radialProgress27 != null) {
                        radialProgress27.setIcon(2, true, z10);
                    }
                }
            } else {
                this.f15083f0 = 1;
                Float w9 = hc.D().w(n02);
                if (w9 != null) {
                    f7 = w9.floatValue();
                }
                RadialProgress2 radialProgress28 = this.f15078a0;
                if (radialProgress28 != null) {
                    radialProgress28.setIcon(3, true, z10);
                }
            }
            RadialProgress2 radialProgress29 = this.f15078a0;
            if (radialProgress29 != null) {
                radialProgress29.p(false, f7);
            }
        } else {
            b6.q(vvVar.f18986a).v(this);
            if (p0() && !z11) {
                this.f15083f0 = 3;
                RadialProgress2 radialProgress210 = this.f15078a0;
                if (radialProgress210 != null) {
                    radialProgress210.setIcon(0, false, z10);
                }
            } else if (o0() && !z11 && !h0() && !this.f15089l0) {
                this.f15083f0 = 2;
                RadialProgress2 radialProgress211 = this.f15078a0;
                if (radialProgress211 != null) {
                    radialProgress211.setIcon(8, false, z10);
                }
            } else {
                this.f15083f0 = -1;
                RadialProgress2 radialProgress212 = this.f15078a0;
                if (radialProgress212 != null) {
                    radialProgress212.setIcon(4, false, z10);
                }
            }
        }
        View view3 = this.V;
        if (view3 != null) {
            view3.invalidate();
        }
    }

    public final void t0(ImageReceiver imageReceiver, boolean z10) {
        int L;
        int i10;
        if (z10) {
            imageReceiver.J0(0);
            return;
        }
        int i11 = tz.Y0;
        if (i11 > 2) {
            L = i0.L(i11 - 2);
        } else {
            L = i0.L(i11);
        }
        int min = Math.min(i0.L(3.0f), L);
        vv vvVar = this.f17621a;
        if (vvVar.D()) {
            imageReceiver.J0(i0.L(12.0f));
            return;
        }
        boolean z11 = this.W;
        if (z11 && !vvVar.B() && (vvVar.E() || !vvVar.G())) {
            i10 = L;
        } else {
            i10 = min;
        }
        if (!z11 || (vvVar.E() && vvVar.G())) {
            L = min;
        }
        imageReceiver.K0(i10, L, min, min);
    }

    @Override
    public final void n(long j10, long j11) {
    }
}
