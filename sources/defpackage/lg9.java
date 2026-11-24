package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;
public final class lg9 extends mg9 implements sp3, gk7 {
    public final k27 X;
    public final TLRPC.Document Y;
    public final RadialProgress2 Z;
    public final xu9 a0;
    public final TextPaint b0;
    public StaticLayout c0;
    public StaticLayout d0;
    public String e0;
    public final int f0;
    public final int g0;
    public final int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public boolean m0;
    public final RectF n0;
    public byte o0;
    public boolean p0;
    public boolean q0;
    public final int r0;

    public lg9(rh9 rh9Var, Rect rect, int i, TL_iv.pageBlockAudio pageblockaudio) {
        super(rh9Var, rect, i);
        TLRPC.Document document;
        this.b0 = new TextPaint(1);
        int L = gl.L(16.0f);
        this.f0 = L;
        int L2 = gl.L(9.0f);
        this.g0 = L2;
        int L3 = gl.L(44.0f);
        this.h0 = L3;
        this.l0 = -1;
        this.n0 = new RectF();
        k27 k27Var = (k27) rh9Var.m.get(pageblockaudio);
        this.X = k27Var;
        if (k27Var != null) {
            document = k27Var.F0();
        } else {
            document = null;
        }
        this.Y = document;
        this.r0 = up3.q(rh9Var.a).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.Z = radialProgress2;
        radialProgress2.setCircleRadius(gl.L(24.0f));
        radialProgress2.p(L, L2, L + L3, L3 + L2);
        xu9 xu9Var = new xu9(null);
        this.a0 = xu9Var;
        xu9Var.h = new k88(this, (byte) 29);
        k0();
        l0(false);
    }

    @Override
    public final void B(boolean z) {
        l0(true);
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final void N(String str) {
        this.Z.o(true, 1.0f);
        l0(true);
    }

    @Override
    public final boolean Q() {
        return this.a0.e;
    }

    @Override
    public final void T() {
        View view = this.W;
        if (view != null) {
            this.Z.m(view);
            this.a0.s = this.W;
        }
        l0(false);
        rh9 rh9Var = this.a;
        int i = rh9Var.a;
        int i2 = rh9Var.a;
        kk7.f(i).b(this, kk7.g2);
        kk7.f(i2).b(this, kk7.e2);
        kk7.f(i2).b(this, kk7.f2);
        kk7.f(i2).b(this, kk7.d2);
    }

    @Override
    public final void V() {
        rh9 rh9Var = this.a;
        up3.q(rh9Var.a).v(this);
        int i = rh9Var.a;
        kk7.f(i).n(this, kk7.g2);
        kk7.f(i).n(this, kk7.e2);
        kk7.f(i).n(this, kk7.f2);
        kk7.f(i).n(this, kk7.d2);
    }

    @Override
    public final void W(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Drawable drawable;
        if (this.X != null && this.Y != null) {
            int i11 = this.l0;
            int i12 = this.c;
            rh9 rh9Var = this.a;
            if (i11 != i12 + rh9Var.S + rh9Var.T || this.m0 != i0()) {
                k0();
            }
            canvas.save();
            canvas.translate(-rh9Var.S, 0.0f);
            if (rh9Var.D()) {
                i = bkb.Dc;
            } else {
                i = bkb.Ye;
            }
            if (rh9Var.D()) {
                i2 = bkb.Ec;
            } else {
                i2 = bkb.Ze;
            }
            if (rh9Var.D()) {
                i3 = bkb.Fb;
            } else {
                i3 = bkb.kd;
            }
            if (rh9Var.D()) {
                i4 = bkb.Gb;
            } else {
                i4 = bkb.ld;
            }
            RadialProgress2 radialProgress2 = this.Z;
            radialProgress2.g(i, i2, i3, i4);
            if (rh9Var.D()) {
                i5 = bkb.tc;
            } else {
                i5 = bkb.re;
            }
            radialProgress2.d = bkb.v0(i5, rh9Var.D);
            radialProgress2.draw(canvas);
            if (rh9Var.D()) {
                i6 = bkb.mc;
            } else {
                i6 = bkb.ke;
            }
            int v0 = bkb.v0(i6, rh9Var.D);
            if (rh9Var.D()) {
                i7 = bkb.nc;
            } else {
                i7 = bkb.le;
            }
            int v02 = bkb.v0(i7, rh9Var.D);
            if (rh9Var.D()) {
                i8 = bkb.pc;
            } else {
                i8 = bkb.ne;
            }
            int v03 = bkb.v0(i8, rh9Var.D);
            if (rh9Var.D()) {
                i9 = bkb.pc;
            } else {
                i9 = bkb.ne;
            }
            int v04 = bkb.v0(i9, rh9Var.D);
            if (rh9Var.D()) {
                i10 = bkb.oc;
            } else {
                i10 = bkb.me;
            }
            int v05 = bkb.v0(i10, rh9Var.D);
            xu9 xu9Var = this.a0;
            xu9Var.f(v0, v02, v03, v04, v05);
            canvas.save();
            canvas.translate(this.i0, this.j0);
            xu9Var.b(canvas);
            canvas.restore();
            StaticLayout staticLayout = this.d0;
            int i13 = this.f0;
            if (staticLayout != null) {
                canvas.save();
                canvas.translate(gl.L(54.0f) + i13, gl.L(6.0f) + this.j0);
                this.d0.draw(canvas);
                canvas.restore();
            }
            if (this.c0 != null) {
                canvas.save();
                canvas.translate(gl.L(54.0f) + i13, this.j0 - gl.L(16.0f));
                this.c0.draw(canvas);
                canvas.restore();
            }
            boolean z = this.m0;
            RectF rectF = this.n0;
            if (z) {
                if (rh9Var.D()) {
                    wjb wjbVar = rh9Var.D;
                    if (wjbVar != null) {
                        drawable = wjbVar.getDrawable("drawableMsgOutMenu");
                    } else {
                        drawable = null;
                    }
                    if (drawable == null) {
                        drawable = bkb.P0("drawableMsgOutMenu");
                    }
                } else {
                    drawable = bkb.b4;
                }
                int L = (this.l0 + this.b.right) - gl.L(32.0f);
                int L2 = gl.L(7.0f);
                drawable.setBounds(L, L2, drawable.getIntrinsicWidth() + L, drawable.getIntrinsicHeight() + L2);
                drawable.draw(canvas);
                rectF.set(L - gl.L(8.0f), 0.0f, gl.L(8.0f) + drawable.getIntrinsicWidth() + L, gl.L(54.0f));
            } else {
                rectF.setEmpty();
            }
            canvas.restore();
        }
    }

    @Override
    public final boolean Y(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lg9.Y(android.view.MotionEvent):boolean");
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        k27 k27Var;
        k27 k27Var2 = this.X;
        if (k27Var2 != null) {
            if (i == kk7.g2) {
                l0(true);
            } else if (i != kk7.e2 && i != kk7.f2) {
                if (i == kk7.d2 && k27Var2.e1() == ((Integer) objArr[0]).intValue() && (k27Var = MediaController.w().v0) != null) {
                    k27Var2.b0 = k27Var.b0;
                    k27Var2.i0 = k27Var.i0;
                    k27Var2.j0 = k27Var.j0;
                    m0();
                }
            } else {
                l0(true);
            }
        }
    }

    @Override
    public final int getObserverTag() {
        return this.r0;
    }

    @Override
    public final void i(long j, long j2) {
        float f;
        if (j2 <= 0) {
            f = 0.0f;
        } else {
            f = ((float) j) / ((float) j2);
        }
        this.Z.o(true, Math.min(1.0f, f));
        if (this.o0 != 3) {
            l0(true);
        }
    }

    public final boolean i0() {
        rh9 rh9Var;
        gb2 gb2Var;
        bb2 bb2Var;
        if (this.Y != null && (gb2Var = (rh9Var = this.a).E) != null && (bb2Var = rh9Var.F) != null && bb2Var.l2(gb2Var)) {
            return true;
        }
        return false;
    }

    public final int j0() {
        byte b = this.o0;
        if (b == 1) {
            return 1;
        }
        if (b == 2) {
            return 2;
        }
        if (b == 3) {
            return 3;
        }
        return 0;
    }

    public final void k0() {
        float f;
        String str;
        String str2;
        SpannableStringBuilder spannableStringBuilder;
        rh9 rh9Var = this.a;
        this.l0 = this.c + rh9Var.S + rh9Var.T;
        this.m0 = i0();
        int L = gl.L(50.0f) + this.f0;
        int i = this.h0;
        int i2 = L + i;
        this.i0 = i2;
        int i3 = this.l0 - i2;
        if (this.m0) {
            f = 42.0f;
        } else {
            f = 18.0f;
        }
        this.k0 = b00.c(f, i3, 0);
        k27 k27Var = this.X;
        if (k27Var != null) {
            str = k27Var.w1(false);
        } else {
            str = null;
        }
        if (k27Var != null) {
            str2 = k27Var.y1(false);
        } else {
            str2 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str2);
        int i4 = this.g0;
        if (isEmpty && TextUtils.isEmpty(str)) {
            this.c0 = null;
            this.j0 = ((i - gl.L(30.0f)) / 2) + i4;
        } else {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                spannableStringBuilder = new SpannableStringBuilder(tb4.p(str, " - ", str2));
            } else if (!TextUtils.isEmpty(str2)) {
                spannableStringBuilder = new SpannableStringBuilder(str2);
            } else {
                spannableStringBuilder = new SpannableStringBuilder(str);
            }
            if (!TextUtils.isEmpty(str)) {
                spannableStringBuilder.setSpan(new z3c(gl.o()), 0, str.length(), 18);
            }
            this.b0.setTextSize(gl.L(16.0f));
            int L2 = gl.L(50.0f) + this.k0;
            this.c0 = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, bkb.N2, L2, TextUtils.TruncateAt.END), this.b0, L2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.j0 = gl.L(11.0f) + ((i - gl.L(30.0f)) / 2) + i4;
        }
        this.a0.h(this.k0, gl.L(30.0f));
    }

    public final void l0(boolean z) {
        File J;
        boolean z2;
        int i = this.a.a;
        TLRPC.Document document = this.Y;
        String r = ba4.r(null, document);
        byte b = 1;
        if (document == null) {
            J = null;
        } else {
            ba4.G(i);
            J = ba4.J(document, null, true, true);
        }
        if (J != null && J.exists()) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean isEmpty = TextUtils.isEmpty(r);
        RadialProgress2 radialProgress2 = this.Z;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        k27 k27Var = this.X;
        if (z2) {
            up3.q(i).v(this);
            if (MediaController.w().D(k27Var) && !MediaController.w().C()) {
                this.o0 = (byte) 1;
            } else {
                this.o0 = (byte) 0;
            }
            radialProgress2.setIcon(j0(), false, z);
        } else {
            up3.q(i).a(r, null, this);
            if (gba.x0 && k27Var != null && k27Var.I3() && !k27.Q5(k27Var.k) && !cf3.B(k27.B0(k27Var.k))) {
                if (!MediaController.w().D(k27Var) || MediaController.w().C()) {
                    b = 0;
                }
                this.o0 = b;
                radialProgress2.setIcon(j0(), false, z);
            } else {
                float f = 0.0f;
                if (!ba4.G(i).S(r)) {
                    this.o0 = (byte) 2;
                    radialProgress2.o(z, 0.0f);
                    radialProgress2.setIcon(j0(), false, z);
                } else {
                    this.o0 = (byte) 3;
                    Float s = fl5.z().s(r);
                    if (s != null) {
                        f = s.floatValue();
                    }
                    radialProgress2.o(z, f);
                    radialProgress2.setIcon(j0(), true, z);
                }
            }
        }
        m0();
    }

    public final void m0() {
        k27 k27Var;
        int i;
        int i2;
        TLRPC.Document document = this.Y;
        if (document != null && (k27Var = this.X) != null) {
            xu9 xu9Var = this.a0;
            if (!xu9Var.e) {
                xu9Var.g(k27Var.b0);
            }
            if (MediaController.w().D(k27Var)) {
                i = k27Var.i0;
            } else {
                int i3 = 0;
                while (true) {
                    if (i3 < document.attributes.size()) {
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                            i = (int) documentAttribute.duration;
                            break;
                        }
                        i3++;
                    } else {
                        i = 0;
                        break;
                    }
                }
            }
            String g0 = gl.g0(i, false, false);
            String str = this.e0;
            TextPaint textPaint = this.b0;
            if (str == null || !str.equals(g0)) {
                this.e0 = g0;
                textPaint.setTextSize(gl.L(16.0f));
                this.d0 = new StaticLayout(g0, textPaint, (int) Math.ceil(textPaint.measureText(g0)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            rh9 rh9Var = this.a;
            if (rh9Var.D()) {
                i2 = bkb.Vc;
            } else {
                i2 = bkb.Uc;
            }
            textPaint.setColor(bkb.v0(i2, rh9Var.D));
            View view = this.W;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    @Override
    public final void l(long j, long j2) {
    }
}
