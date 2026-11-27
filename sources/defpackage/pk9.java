package defpackage;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;
public abstract class pk9 extends dk9 implements jq3 {
    public static Paint p0;
    public static ColorMatrixColorFilter q0;
    public final boolean X;
    public final ImageReceiver Y;
    public final ImageReceiver Z;
    public Bitmap a0;
    public RadialProgress2 b0;
    public int c0;
    public int d0;
    public boolean e0;
    public final int f0;
    public int g0;
    public boolean h0;
    public boolean i0;
    public int j0;
    public int k0;
    public final int l0;
    public boolean m0;
    public final Path n0;
    public final dl9 o0;

    public pk9(hl9 hl9Var, Rect rect, int i, boolean z) {
        super(hl9Var, rect, i);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.Y = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.Z = imageReceiver2;
        this.g0 = -1;
        this.l0 = hl.L(48.0f);
        this.n0 = new Path();
        this.o0 = new dl9();
        this.X = z;
        this.f0 = lq3.q(hl9Var.a).k();
        imageReceiver.A1 = true;
        imageReceiver2.A1 = true;
        imageReceiver.h1 = new pq8(this, (byte) 9);
    }

    @Override
    public final int A() {
        return 1;
    }

    @Override
    public final void B(boolean z) {
        s0(false);
    }

    @Override
    public final CharSequence D(int i) {
        int i2;
        if (p0()) {
            i2 = 2131753926;
        } else {
            i2 = 2131753941;
        }
        String M0 = ob6.M0(i2, null);
        if (q0() && !this.o0.b()) {
            return TextUtils.concat(M0, ", ", ob6.M0(2131744919, null));
        }
        return M0;
    }

    @Override
    public final int H() {
        Rect rect = this.b;
        return rect.top + this.d0 + rect.bottom;
    }

    @Override
    public final int I() {
        return J();
    }

    @Override
    public final int J() {
        Rect rect = this.b;
        return rect.left + this.c0 + rect.right;
    }

    @Override
    public final void N(String str) {
        RadialProgress2 radialProgress2 = this.b0;
        if (radialProgress2 != null) {
            radialProgress2.o(true, 1.0f);
        }
        if (o0() && (h0() || this.m0)) {
            i0(true);
        }
        s0(true);
    }

    @Override
    public final void S() {
        View view = this.W;
        ImageReceiver imageReceiver = this.Y;
        imageReceiver.p0(view);
        imageReceiver.I();
        View view2 = this.W;
        ImageReceiver imageReceiver2 = this.Z;
        imageReceiver2.p0(view2);
        imageReceiver2.I();
        s0(false);
    }

    @Override
    public final boolean T(int i, View view) {
        if (q0()) {
            dl9 dl9Var = this.o0;
            if (!dl9Var.b && dl9Var.f == null) {
                ImageReceiver imageReceiver = this.Y;
                float f = imageReceiver.N0;
                float f2 = imageReceiver.O0;
                dl9Var.c(this.W, (f / 2.0f) + imageReceiver.L0, (f2 / 2.0f) + imageReceiver.M0, f, f2);
                return true;
            }
        }
        hl9 hl9Var = this.a;
        rb2 rb2Var = hl9Var.F;
        if (rb2Var != null) {
            rb2Var.P0(hl9Var.E, m0());
            return true;
        }
        return false;
    }

    @Override
    public final void U() {
        this.Y.K();
        this.Z.K();
        this.a0 = null;
        lq3.q(this.a.a).v(this);
    }

    @Override
    public final void V(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pk9.V(android.graphics.Canvas):void");
    }

    @Override
    public final boolean X(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pk9.X(android.view.MotionEvent):boolean");
    }

    @Override
    public final int getObserverTag() {
        return this.f0;
    }

    public boolean h0() {
        return true;
    }

    @Override
    public final void i(long j, long j2) {
        float f;
        RadialProgress2 radialProgress2 = this.b0;
        if (radialProgress2 != null) {
            if (j2 <= 0) {
                f = 0.0f;
            } else {
                f = ((float) j) / ((float) j2);
            }
            radialProgress2.o(true, Math.min(1.0f, f));
        }
        if (this.g0 != 1) {
            s0(true);
        }
    }

    public abstract void i0(boolean z);

    public boolean j0() {
        if ((lq3.q(this.a.a).m() & 1) != 0) {
            return true;
        }
        return false;
    }

    public abstract boolean k0();

    public final void l0() {
        boolean z;
        this.Y.i0(0.0f, 0.0f, this.c0, this.d0);
        int i = this.c0;
        int i2 = this.l0;
        this.j0 = (i - i2) / 2;
        this.k0 = (this.d0 - i2) / 2;
        boolean j0 = j0();
        this.e0 = j0;
        if (!j0 && !k0()) {
            z = false;
        } else {
            z = true;
        }
        i0(z);
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
        Bitmap n;
        ImageReceiver imageReceiver = this.Z;
        Bitmap n2 = imageReceiver.n();
        ImageReceiver imageReceiver2 = this.Y;
        if ((n2 == null || imageReceiver2.m() == null) && (n = imageReceiver2.n()) != null && !n.isRecycled()) {
            if (n != this.a0 || imageReceiver.n() == null) {
                this.a0 = n;
                imageReceiver.f0(Utilities.D(n, false));
                ColorMatrixColorFilter colorMatrixColorFilter = q0;
                if (colorMatrixColorFilter == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    hl.l2(colorMatrix, 0.9f);
                    hl.i(colorMatrix, 0.6f);
                    ColorMatrixColorFilter colorMatrixColorFilter2 = new ColorMatrixColorFilter(colorMatrix);
                    q0 = colorMatrixColorFilter2;
                    colorMatrixColorFilter = colorMatrixColorFilter2;
                }
                imageReceiver.p1 = colorMatrixColorFilter;
            }
        }
    }

    public final void s0(boolean z) {
        boolean z2;
        RadialProgress2 radialProgress2 = this.b0;
        View view = this.W;
        int i = this.l0;
        if (radialProgress2 == null) {
            if (view != null) {
                RadialProgress2 radialProgress22 = new RadialProgress2(view, null);
                this.b0 = radialProgress22;
                radialProgress22.d = -1;
                radialProgress22.setColors(1711276032, 2130706432, -1, -2500135);
                RadialProgress2 radialProgress23 = this.b0;
                int i2 = this.j0;
                int i3 = this.k0;
                radialProgress23.p(i2, i3, i2 + i, i + i3);
            }
        } else if (view != null) {
            radialProgress2.m(view);
            RadialProgress2 radialProgress24 = this.b0;
            int i4 = this.j0;
            int i5 = this.k0;
            radialProgress24.p(i4, i5, i4 + i, i + i5);
        }
        String n0 = n0();
        if (TextUtils.isEmpty(n0)) {
            this.g0 = -1;
            RadialProgress2 radialProgress25 = this.b0;
            if (radialProgress25 != null) {
                radialProgress25.setIcon(4, false, false);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver = this.Y;
        lm m = imageReceiver.m();
        if (m != null && (m.s() || imageReceiver.F())) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean k0 = k0();
        hl9 hl9Var = this.a;
        if (!k0 && (!o0() || !z2)) {
            lq3.q(hl9Var.a).a(n0, null, this);
            float f = 0.0f;
            if (!this.e0 && !this.m0 && !xb4.G(hl9Var.a).S(n0)) {
                if (p0()) {
                    this.g0 = 3;
                    RadialProgress2 radialProgress26 = this.b0;
                    if (radialProgress26 != null) {
                        radialProgress26.setIcon(0, true, z);
                    }
                } else {
                    this.g0 = 0;
                    RadialProgress2 radialProgress27 = this.b0;
                    if (radialProgress27 != null) {
                        radialProgress27.setIcon(2, true, z);
                    }
                }
            } else {
                this.g0 = 1;
                Float s = in5.z().s(n0);
                if (s != null) {
                    f = s.floatValue();
                }
                RadialProgress2 radialProgress28 = this.b0;
                if (radialProgress28 != null) {
                    radialProgress28.setIcon(3, true, z);
                }
            }
            RadialProgress2 radialProgress29 = this.b0;
            if (radialProgress29 != null) {
                radialProgress29.o(false, f);
            }
        } else {
            lq3.q(hl9Var.a).v(this);
            if (p0() && !z2) {
                this.g0 = 3;
                RadialProgress2 radialProgress210 = this.b0;
                if (radialProgress210 != null) {
                    radialProgress210.setIcon(0, false, z);
                }
            } else if (o0() && !z2 && !h0() && !this.m0) {
                this.g0 = 2;
                RadialProgress2 radialProgress211 = this.b0;
                if (radialProgress211 != null) {
                    radialProgress211.setIcon(8, false, z);
                }
            } else {
                this.g0 = -1;
                RadialProgress2 radialProgress212 = this.b0;
                if (radialProgress212 != null) {
                    radialProgress212.setIcon(4, false, z);
                }
            }
        }
        View view2 = this.W;
        if (view2 != null) {
            view2.invalidate();
        }
    }

    public final void t0(ImageReceiver imageReceiver, boolean z) {
        int L;
        int i;
        if (z) {
            imageReceiver.q0(0);
            return;
        }
        int i2 = xea.U0;
        if (i2 > 2) {
            L = hl.L(i2 - 2);
        } else {
            L = hl.L(i2);
        }
        int min = Math.min(hl.L(3.0f), L);
        hl9 hl9Var = this.a;
        if (hl9Var.C()) {
            imageReceiver.q0(hl.L(12.0f));
            return;
        }
        boolean z2 = this.X;
        if (z2 && !hl9Var.A() && (hl9Var.D() || !hl9Var.F())) {
            i = L;
        } else {
            i = min;
        }
        if (!z2 || (hl9Var.D() && hl9Var.F())) {
            L = min;
        }
        imageReceiver.r0(i, L, min, min);
    }

    @Override
    public final void z(int i, Rect rect) {
        int i2;
        Rect rect2 = this.b;
        int i3 = rect2.left;
        int i4 = (this.a.C - i3) - rect2.right;
        int i5 = this.c0;
        if (i4 > i5) {
            i2 = (i4 - i5) / 2;
        } else {
            i2 = 0;
        }
        int i6 = i2 + i3;
        int i7 = ((int) this.N) + rect2.top;
        rect.set(i6, i7, i5 + i6, this.d0 + i7);
    }

    @Override
    public final void l(long j, long j2) {
    }
}
