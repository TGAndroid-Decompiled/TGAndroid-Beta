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
public final class pi9 extends qi9 implements cr3, jm7 {
    public final k47 X;
    public final TLRPC.Document Y;
    public final RadialProgress2 Z;
    public final ax9 a0;
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

    public pi9(uj9 uj9Var, Rect rect, int i, TL_iv.pageBlockAudio pageblockaudio) {
        super(uj9Var, rect, i);
        TLRPC.Document document;
        this.b0 = new TextPaint(1);
        int L = gm.L(16.0f);
        this.f0 = L;
        int L2 = gm.L(9.0f);
        this.g0 = L2;
        int L3 = gm.L(44.0f);
        this.h0 = L3;
        this.l0 = -1;
        this.n0 = new RectF();
        k47 k47Var = (k47) uj9Var.m.get(pageblockaudio);
        this.X = k47Var;
        if (k47Var != null) {
            document = k47Var.F0();
        } else {
            document = null;
        }
        this.Y = document;
        this.r0 = er3.q(uj9Var.a).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.Z = radialProgress2;
        radialProgress2.setCircleRadius(gm.L(24.0f));
        radialProgress2.p(L, L2, L + L3, L3 + L2);
        ax9 ax9Var = new ax9(null);
        this.a0 = ax9Var;
        ax9Var.h = new yf9(this, (byte) 3);
        j0();
        k0(false);
    }

    @Override
    public final void A(boolean z) {
        k0(true);
    }

    @Override
    public final int I() {
        return J();
    }

    @Override
    public final void N(String str) {
        this.Z.o(true, 1.0f);
        k0(true);
    }

    @Override
    public final boolean P() {
        return this.a0.e;
    }

    @Override
    public final void S() {
        View view = this.W;
        if (view != null) {
            this.Z.m(view);
            this.a0.s = this.W;
        }
        k0(false);
        uj9 uj9Var = this.a;
        int i = uj9Var.a;
        int i2 = uj9Var.a;
        nm7.f(i).b(this, nm7.h2);
        nm7.f(i2).b(this, nm7.f2);
        nm7.f(i2).b(this, nm7.g2);
        nm7.f(i2).b(this, nm7.e2);
    }

    @Override
    public final void U() {
        uj9 uj9Var = this.a;
        er3.q(uj9Var.a).v(this);
        int i = uj9Var.a;
        nm7.f(i).n(this, nm7.h2);
        nm7.f(i).n(this, nm7.f2);
        nm7.f(i).n(this, nm7.g2);
        nm7.f(i).n(this, nm7.e2);
    }

    @Override
    public final void V(Canvas canvas) {
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
            uj9 uj9Var = this.a;
            if (i11 != i12 + uj9Var.S + uj9Var.T || this.m0 != h0()) {
                j0();
            }
            canvas.save();
            canvas.translate(-uj9Var.S, 0.0f);
            if (uj9Var.D()) {
                i = cmb.Dc;
            } else {
                i = cmb.Ye;
            }
            if (uj9Var.D()) {
                i2 = cmb.Ec;
            } else {
                i2 = cmb.Ze;
            }
            if (uj9Var.D()) {
                i3 = cmb.Fb;
            } else {
                i3 = cmb.kd;
            }
            if (uj9Var.D()) {
                i4 = cmb.Gb;
            } else {
                i4 = cmb.ld;
            }
            RadialProgress2 radialProgress2 = this.Z;
            radialProgress2.g(i, i2, i3, i4);
            if (uj9Var.D()) {
                i5 = cmb.tc;
            } else {
                i5 = cmb.re;
            }
            radialProgress2.d = cmb.v0(i5, uj9Var.D);
            radialProgress2.draw(canvas);
            if (uj9Var.D()) {
                i6 = cmb.mc;
            } else {
                i6 = cmb.ke;
            }
            int v0 = cmb.v0(i6, uj9Var.D);
            if (uj9Var.D()) {
                i7 = cmb.nc;
            } else {
                i7 = cmb.le;
            }
            int v02 = cmb.v0(i7, uj9Var.D);
            if (uj9Var.D()) {
                i8 = cmb.pc;
            } else {
                i8 = cmb.ne;
            }
            int v03 = cmb.v0(i8, uj9Var.D);
            if (uj9Var.D()) {
                i9 = cmb.pc;
            } else {
                i9 = cmb.ne;
            }
            int v04 = cmb.v0(i9, uj9Var.D);
            if (uj9Var.D()) {
                i10 = cmb.oc;
            } else {
                i10 = cmb.me;
            }
            int v05 = cmb.v0(i10, uj9Var.D);
            ax9 ax9Var = this.a0;
            ax9Var.f(v0, v02, v03, v04, v05);
            canvas.save();
            canvas.translate(this.i0, this.j0);
            ax9Var.b(canvas);
            canvas.restore();
            StaticLayout staticLayout = this.d0;
            int i13 = this.f0;
            if (staticLayout != null) {
                canvas.save();
                canvas.translate(gm.L(54.0f) + i13, gm.L(6.0f) + this.j0);
                this.d0.draw(canvas);
                canvas.restore();
            }
            if (this.c0 != null) {
                canvas.save();
                canvas.translate(gm.L(54.0f) + i13, this.j0 - gm.L(16.0f));
                this.c0.draw(canvas);
                canvas.restore();
            }
            boolean z = this.m0;
            RectF rectF = this.n0;
            if (z) {
                if (uj9Var.D()) {
                    ylb ylbVar = uj9Var.D;
                    if (ylbVar != null) {
                        drawable = ylbVar.getDrawable("drawableMsgOutMenu");
                    } else {
                        drawable = null;
                    }
                    if (drawable == null) {
                        drawable = cmb.P0("drawableMsgOutMenu");
                    }
                } else {
                    drawable = cmb.b4;
                }
                int L = (this.l0 + this.b.right) - gm.L(32.0f);
                int L2 = gm.L(7.0f);
                drawable.setBounds(L, L2, drawable.getIntrinsicWidth() + L, drawable.getIntrinsicHeight() + L2);
                drawable.draw(canvas);
                rectF.set(L - gm.L(8.0f), 0.0f, gm.L(8.0f) + drawable.getIntrinsicWidth() + L, gm.L(54.0f));
            } else {
                rectF.setEmpty();
            }
            canvas.restore();
        }
    }

    @Override
    public final boolean X(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi9.X(android.view.MotionEvent):boolean");
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        k47 k47Var;
        k47 k47Var2 = this.X;
        if (k47Var2 != null) {
            if (i == nm7.h2) {
                k0(true);
            } else if (i != nm7.f2 && i != nm7.g2) {
                if (i == nm7.e2 && k47Var2.e1() == ((Integer) objArr[0]).intValue() && (k47Var = MediaController.w().v0) != null) {
                    k47Var2.b0 = k47Var.b0;
                    k47Var2.i0 = k47Var.i0;
                    k47Var2.j0 = k47Var.j0;
                    l0();
                }
            } else {
                k0(true);
            }
        }
    }

    @Override
    public final int getObserverTag() {
        return this.r0;
    }

    public final boolean h0() {
        uj9 uj9Var;
        rc2 rc2Var;
        mc2 mc2Var;
        if (this.Y != null && (rc2Var = (uj9Var = this.a).E) != null && (mc2Var = uj9Var.F) != null && mc2Var.Z1(rc2Var)) {
            return true;
        }
        return false;
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
            k0(true);
        }
    }

    public final int i0() {
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

    public final void j0() {
        float f;
        String str;
        String str2;
        SpannableStringBuilder spannableStringBuilder;
        uj9 uj9Var = this.a;
        this.l0 = this.c + uj9Var.S + uj9Var.T;
        this.m0 = h0();
        int L = gm.L(50.0f) + this.f0;
        int i = this.h0;
        int i2 = L + i;
        this.i0 = i2;
        int i3 = this.l0 - i2;
        if (this.m0) {
            f = 42.0f;
        } else {
            f = 18.0f;
        }
        this.k0 = b10.c(f, i3, 0);
        k47 k47Var = this.X;
        if (k47Var != null) {
            str = k47Var.w1(false);
        } else {
            str = null;
        }
        if (k47Var != null) {
            str2 = k47Var.y1(false);
        } else {
            str2 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str2);
        int i4 = this.g0;
        if (isEmpty && TextUtils.isEmpty(str)) {
            this.c0 = null;
            this.j0 = ((i - gm.L(30.0f)) / 2) + i4;
        } else {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                spannableStringBuilder = new SpannableStringBuilder(td4.q(str, " - ", str2));
            } else if (!TextUtils.isEmpty(str2)) {
                spannableStringBuilder = new SpannableStringBuilder(str2);
            } else {
                spannableStringBuilder = new SpannableStringBuilder(str);
            }
            if (!TextUtils.isEmpty(str)) {
                spannableStringBuilder.setSpan(new z5c(gm.o()), 0, str.length(), 18);
            }
            this.b0.setTextSize(gm.L(16.0f));
            int L2 = gm.L(50.0f) + this.k0;
            this.c0 = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, cmb.N2, L2, TextUtils.TruncateAt.END), this.b0, L2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.j0 = gm.L(11.0f) + ((i - gm.L(30.0f)) / 2) + i4;
        }
        this.a0.h(this.k0, gm.L(30.0f));
    }

    public final void k0(boolean z) {
        File J;
        boolean z2;
        int i = this.a.a;
        TLRPC.Document document = this.Y;
        String r = bc4.r(null, document);
        byte b = 1;
        if (document == null) {
            J = null;
        } else {
            bc4.G(i);
            J = bc4.J(document, null, true, true);
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
        k47 k47Var = this.X;
        if (z2) {
            er3.q(i).v(this);
            if (MediaController.w().D(k47Var) && !MediaController.w().C()) {
                this.o0 = (byte) 1;
            } else {
                this.o0 = (byte) 0;
            }
            radialProgress2.setIcon(i0(), false, z);
        } else {
            er3.q(i).a(r, null, this);
            if (gda.x0 && k47Var != null && k47Var.I3() && !k47.Q5(k47Var.k) && !pg3.B(k47.B0(k47Var.k))) {
                if (!MediaController.w().D(k47Var) || MediaController.w().C()) {
                    b = 0;
                }
                this.o0 = b;
                radialProgress2.setIcon(i0(), false, z);
            } else {
                float f = 0.0f;
                if (!bc4.G(i).S(r)) {
                    this.o0 = (byte) 2;
                    radialProgress2.o(z, 0.0f);
                    radialProgress2.setIcon(i0(), false, z);
                } else {
                    this.o0 = (byte) 3;
                    Float s = fn5.z().s(r);
                    if (s != null) {
                        f = s.floatValue();
                    }
                    radialProgress2.o(z, f);
                    radialProgress2.setIcon(i0(), true, z);
                }
            }
        }
        l0();
    }

    public final void l0() {
        k47 k47Var;
        int i;
        int i2;
        TLRPC.Document document = this.Y;
        if (document != null && (k47Var = this.X) != null) {
            ax9 ax9Var = this.a0;
            if (!ax9Var.e) {
                ax9Var.g(k47Var.b0);
            }
            if (MediaController.w().D(k47Var)) {
                i = k47Var.i0;
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
            String g0 = gm.g0(i, false, false);
            String str = this.e0;
            TextPaint textPaint = this.b0;
            if (str == null || !str.equals(g0)) {
                this.e0 = g0;
                textPaint.setTextSize(gm.L(16.0f));
                this.d0 = new StaticLayout(g0, textPaint, (int) Math.ceil(textPaint.measureText(g0)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            uj9 uj9Var = this.a;
            if (uj9Var.D()) {
                i2 = cmb.Vc;
            } else {
                i2 = cmb.Uc;
            }
            textPaint.setColor(cmb.v0(i2, uj9Var.D));
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
