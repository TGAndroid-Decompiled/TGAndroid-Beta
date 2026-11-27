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
public final class ck9 extends dk9 implements jq3, fn7 {
    public final r47 X;
    public final TLRPC.Document Y;
    public final RadialProgress2 Z;
    public final ry9 a0;
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

    public ck9(hl9 hl9Var, Rect rect, int i, TL_iv.pageBlockAudio pageblockaudio) {
        super(hl9Var, rect, i);
        TLRPC.Document document;
        this.b0 = new TextPaint(1);
        int L = hl.L(16.0f);
        this.f0 = L;
        int L2 = hl.L(9.0f);
        this.g0 = L2;
        int L3 = hl.L(44.0f);
        this.h0 = L3;
        this.l0 = -1;
        this.n0 = new RectF();
        r47 r47Var = (r47) hl9Var.m.get(pageblockaudio);
        this.X = r47Var;
        if (r47Var != null) {
            document = r47Var.F0();
        } else {
            document = null;
        }
        this.Y = document;
        this.r0 = lq3.q(hl9Var.a).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.Z = radialProgress2;
        radialProgress2.setCircleRadius(hl.L(24.0f));
        radialProgress2.p(L, L2, L + L3, L3 + L2);
        ry9 ry9Var = new ry9(null);
        this.a0 = ry9Var;
        ry9Var.h = new ye9(this, (byte) 6);
        j0();
        k0(false);
    }

    @Override
    public final void B(boolean z) {
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
        hl9 hl9Var = this.a;
        int i = hl9Var.a;
        int i2 = hl9Var.a;
        jn7.f(i).b(this, jn7.h2);
        jn7.f(i2).b(this, jn7.f2);
        jn7.f(i2).b(this, jn7.g2);
        jn7.f(i2).b(this, jn7.e2);
    }

    @Override
    public final void U() {
        hl9 hl9Var = this.a;
        lq3.q(hl9Var.a).v(this);
        int i = hl9Var.a;
        jn7.f(i).n(this, jn7.h2);
        jn7.f(i).n(this, jn7.f2);
        jn7.f(i).n(this, jn7.g2);
        jn7.f(i).n(this, jn7.e2);
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
            hl9 hl9Var = this.a;
            if (i11 != i12 + hl9Var.S + hl9Var.T || this.m0 != h0()) {
                j0();
            }
            canvas.save();
            canvas.translate(-hl9Var.S, 0.0f);
            if (hl9Var.D()) {
                i = aob.Ec;
            } else {
                i = aob.Ze;
            }
            if (hl9Var.D()) {
                i2 = aob.Fc;
            } else {
                i2 = aob.af;
            }
            if (hl9Var.D()) {
                i3 = aob.Gb;
            } else {
                i3 = aob.ld;
            }
            if (hl9Var.D()) {
                i4 = aob.Hb;
            } else {
                i4 = aob.md;
            }
            RadialProgress2 radialProgress2 = this.Z;
            radialProgress2.g(i, i2, i3, i4);
            if (hl9Var.D()) {
                i5 = aob.uc;
            } else {
                i5 = aob.se;
            }
            radialProgress2.d = aob.v0(i5, hl9Var.D);
            radialProgress2.draw(canvas);
            if (hl9Var.D()) {
                i6 = aob.nc;
            } else {
                i6 = aob.le;
            }
            int v0 = aob.v0(i6, hl9Var.D);
            if (hl9Var.D()) {
                i7 = aob.oc;
            } else {
                i7 = aob.me;
            }
            int v02 = aob.v0(i7, hl9Var.D);
            if (hl9Var.D()) {
                i8 = aob.qc;
            } else {
                i8 = aob.oe;
            }
            int v03 = aob.v0(i8, hl9Var.D);
            if (hl9Var.D()) {
                i9 = aob.qc;
            } else {
                i9 = aob.oe;
            }
            int v04 = aob.v0(i9, hl9Var.D);
            if (hl9Var.D()) {
                i10 = aob.pc;
            } else {
                i10 = aob.ne;
            }
            int v05 = aob.v0(i10, hl9Var.D);
            ry9 ry9Var = this.a0;
            ry9Var.f(v0, v02, v03, v04, v05);
            canvas.save();
            canvas.translate(this.i0, this.j0);
            ry9Var.b(canvas);
            canvas.restore();
            StaticLayout staticLayout = this.d0;
            int i13 = this.f0;
            if (staticLayout != null) {
                canvas.save();
                canvas.translate(hl.L(54.0f) + i13, hl.L(6.0f) + this.j0);
                this.d0.draw(canvas);
                canvas.restore();
            }
            if (this.c0 != null) {
                canvas.save();
                canvas.translate(hl.L(54.0f) + i13, this.j0 - hl.L(16.0f));
                this.c0.draw(canvas);
                canvas.restore();
            }
            boolean z = this.m0;
            RectF rectF = this.n0;
            if (z) {
                if (hl9Var.D()) {
                    vnb vnbVar = hl9Var.D;
                    if (vnbVar != null) {
                        drawable = vnbVar.getDrawable("drawableMsgOutMenu");
                    } else {
                        drawable = null;
                    }
                    if (drawable == null) {
                        drawable = aob.P0("drawableMsgOutMenu");
                    }
                } else {
                    drawable = aob.c4;
                }
                int L = (this.l0 + this.b.right) - hl.L(32.0f);
                int L2 = hl.L(7.0f);
                drawable.setBounds(L, L2, drawable.getIntrinsicWidth() + L, drawable.getIntrinsicHeight() + L2);
                drawable.draw(canvas);
                rectF.set(L - hl.L(8.0f), 0.0f, hl.L(8.0f) + drawable.getIntrinsicWidth() + L, hl.L(54.0f));
            } else {
                rectF.setEmpty();
            }
            canvas.restore();
        }
    }

    @Override
    public final boolean X(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck9.X(android.view.MotionEvent):boolean");
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        r47 r47Var;
        r47 r47Var2 = this.X;
        if (r47Var2 != null) {
            if (i == jn7.h2) {
                k0(true);
            } else if (i != jn7.f2 && i != jn7.g2) {
                if (i == jn7.e2 && r47Var2.e1() == ((Integer) objArr[0]).intValue() && (r47Var = MediaController.z().v0) != null) {
                    r47Var2.b0 = r47Var.b0;
                    r47Var2.i0 = r47Var.i0;
                    r47Var2.j0 = r47Var.j0;
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
        hl9 hl9Var;
        wb2 wb2Var;
        rb2 rb2Var;
        if (this.Y != null && (wb2Var = (hl9Var = this.a).E) != null && (rb2Var = hl9Var.F) != null && rb2Var.W1(wb2Var)) {
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
        hl9 hl9Var = this.a;
        this.l0 = this.c + hl9Var.S + hl9Var.T;
        this.m0 = h0();
        int L = hl.L(50.0f) + this.f0;
        int i = this.h0;
        int i2 = L + i;
        this.i0 = i2;
        int i3 = this.l0 - i2;
        if (this.m0) {
            f = 42.0f;
        } else {
            f = 18.0f;
        }
        this.k0 = c00.d(f, i3, 0);
        r47 r47Var = this.X;
        if (r47Var != null) {
            str = r47Var.w1(false);
        } else {
            str = null;
        }
        if (r47Var != null) {
            str2 = r47Var.y1(false);
        } else {
            str2 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str2);
        int i4 = this.g0;
        if (isEmpty && TextUtils.isEmpty(str)) {
            this.c0 = null;
            this.j0 = ((i - hl.L(30.0f)) / 2) + i4;
        } else {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                spannableStringBuilder = new SpannableStringBuilder(qd4.p(str, " - ", str2));
            } else if (!TextUtils.isEmpty(str2)) {
                spannableStringBuilder = new SpannableStringBuilder(str2);
            } else {
                spannableStringBuilder = new SpannableStringBuilder(str);
            }
            if (!TextUtils.isEmpty(str)) {
                spannableStringBuilder.setSpan(new y7c(hl.o()), 0, str.length(), 18);
            }
            this.b0.setTextSize(hl.L(16.0f));
            int L2 = hl.L(50.0f) + this.k0;
            this.c0 = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, aob.O2, L2, TextUtils.TruncateAt.END), this.b0, L2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.j0 = hl.L(11.0f) + ((i - hl.L(30.0f)) / 2) + i4;
        }
        this.a0.h(this.k0, hl.L(30.0f));
    }

    public final void k0(boolean z) {
        File J;
        boolean z2;
        int i = this.a.a;
        TLRPC.Document document = this.Y;
        String r = xb4.r(null, document);
        byte b = 1;
        if (document == null) {
            J = null;
        } else {
            xb4.G(i);
            J = xb4.J(document, null, true, true);
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
        r47 r47Var = this.X;
        if (z2) {
            lq3.q(i).v(this);
            if (MediaController.z().H(r47Var) && !MediaController.z().G()) {
                this.o0 = (byte) 1;
            } else {
                this.o0 = (byte) 0;
            }
            radialProgress2.setIcon(i0(), false, z);
        } else {
            lq3.q(i).a(r, null, this);
            if (xea.x0 && r47Var != null && r47Var.I3() && !r47.Q5(r47Var.k) && !wf3.B(r47.B0(r47Var.k))) {
                if (!MediaController.z().H(r47Var) || MediaController.z().G()) {
                    b = 0;
                }
                this.o0 = b;
                radialProgress2.setIcon(i0(), false, z);
            } else {
                float f = 0.0f;
                if (!xb4.G(i).S(r)) {
                    this.o0 = (byte) 2;
                    radialProgress2.o(z, 0.0f);
                    radialProgress2.setIcon(i0(), false, z);
                } else {
                    this.o0 = (byte) 3;
                    Float s = in5.z().s(r);
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
        r47 r47Var;
        int i;
        int i2;
        TLRPC.Document document = this.Y;
        if (document != null && (r47Var = this.X) != null) {
            ry9 ry9Var = this.a0;
            if (!ry9Var.e) {
                ry9Var.g(r47Var.b0);
            }
            if (MediaController.z().H(r47Var)) {
                i = r47Var.i0;
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
            String g0 = hl.g0(i, false, false);
            String str = this.e0;
            TextPaint textPaint = this.b0;
            if (str == null || !str.equals(g0)) {
                this.e0 = g0;
                textPaint.setTextSize(hl.L(16.0f));
                this.d0 = new StaticLayout(g0, textPaint, (int) Math.ceil(textPaint.measureText(g0)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            hl9 hl9Var = this.a;
            if (hl9Var.D()) {
                i2 = aob.Wc;
            } else {
                i2 = aob.Vc;
            }
            textPaint.setColor(aob.v0(i2, hl9Var.D));
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
