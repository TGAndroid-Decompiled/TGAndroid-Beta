package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.o31;
public final class vt extends xt implements x5, cs {
    public final zi X;
    public final TLRPC.Document Y;
    public final RadialProgress2 Z;
    public final mm0 f26091a0;
    public final TextPaint f26092b0;
    public StaticLayout f26093c0;
    public StaticLayout f26094d0;
    public String f26095e0;
    public final int f26096f0;
    public final int f26097g0;
    public final int f26098h0;
    public int f26099i0;
    public int f26100j0;
    public int f26101k0;
    public int f26102l0;
    public boolean m0;
    public final RectF f26103n0;
    public int f26104o0;
    public boolean f26105p0;
    public boolean f26106q0;
    public final int f26107r0;

    public vt(cv cvVar, Rect rect, int i3, TL_iv.pageBlockAudio pageblockaudio) {
        super(cvVar, rect, i3);
        TLRPC.Document document;
        this.f26092b0 = new TextPaint(1);
        int L = g0.L(16.0f);
        this.f26096f0 = L;
        int L2 = g0.L(9.0f);
        this.f26097g0 = L2;
        int L3 = g0.L(44.0f);
        this.f26098h0 = L3;
        this.f26102l0 = -1;
        this.f26103n0 = new RectF();
        zi ziVar = (zi) cvVar.f22075m.get(pageblockaudio);
        this.X = ziVar;
        if (ziVar != null) {
            document = ziVar.F0();
        } else {
            document = null;
        }
        this.Y = document;
        this.f26107r0 = z5.q(cvVar.f22065a).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.Z = radialProgress2;
        radialProgress2.setCircleRadius(g0.L(24.0f));
        radialProgress2.r(L, L2, L + L3, L3 + L2);
        mm0 mm0Var = new mm0(null);
        this.f26091a0 = mm0Var;
        mm0Var.h = new p1(this, 14);
        k0();
        l0(false);
    }

    @Override
    public final void C(boolean z10) {
        l0(true);
    }

    @Override
    public final int I() {
        Rect rect = this.f26435b;
        return g0.L(62.0f) + rect.top + rect.bottom;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final void M(String str) {
        this.Z.p(true, 1.0f);
        l0(true);
    }

    @Override
    public final boolean Q() {
        return this.f26091a0.f36191e;
    }

    @Override
    public final void T() {
        View view = this.W;
        if (view != null) {
            this.Z.n(view);
            this.f26091a0.f36204s = this.W;
        }
        l0(false);
        cv cvVar = this.f26434a;
        int i3 = cvVar.f22065a;
        int i10 = cvVar.f22065a;
        hs.f(i3).c(this, hs.f23239h2);
        hs.f(i10).c(this, hs.f23227f2);
        hs.f(i10).c(this, hs.f23233g2);
        hs.f(i10).c(this, hs.f23221e2);
    }

    @Override
    public final void V() {
        cv cvVar = this.f26434a;
        z5.q(cvVar.f22065a).v(this);
        int i3 = cvVar.f22065a;
        hs.f(i3).n(this, hs.f23239h2);
        hs.f(i3).n(this, hs.f23227f2);
        hs.f(i3).n(this, hs.f23233g2);
        hs.f(i3).n(this, hs.f23221e2);
    }

    @Override
    public final void W(Canvas canvas) {
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Drawable drawable;
        if (this.X != null && this.Y != null) {
            int i19 = this.f26102l0;
            int i20 = this.f26436c;
            cv cvVar = this.f26434a;
            if (i19 != i20 + cvVar.S + cvVar.T || this.m0 != i0()) {
                k0();
            }
            canvas.save();
            canvas.translate(-cvVar.S, 0.0f);
            if (cvVar.E()) {
                i3 = org.telegram.ui.ActionBar.k6.Bc;
            } else {
                i3 = org.telegram.ui.ActionBar.k6.We;
            }
            if (cvVar.E()) {
                i10 = org.telegram.ui.ActionBar.k6.Cc;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.Xe;
            }
            if (cvVar.E()) {
                i11 = org.telegram.ui.ActionBar.k6.Db;
            } else {
                i11 = org.telegram.ui.ActionBar.k6.f27979id;
            }
            if (cvVar.E()) {
                i12 = org.telegram.ui.ActionBar.k6.Eb;
            } else {
                i12 = org.telegram.ui.ActionBar.k6.f27995jd;
            }
            RadialProgress2 radialProgress2 = this.Z;
            radialProgress2.g(i3, i10, i11, i12);
            if (cvVar.E()) {
                i13 = org.telegram.ui.ActionBar.k6.f28145rc;
            } else {
                i13 = org.telegram.ui.ActionBar.k6.f28109pe;
            }
            radialProgress2.d = org.telegram.ui.ActionBar.k6.w0(i13, cvVar.D);
            radialProgress2.draw(canvas);
            if (cvVar.E()) {
                i14 = org.telegram.ui.ActionBar.k6.f28013kc;
            } else {
                i14 = org.telegram.ui.ActionBar.k6.ie;
            }
            int w02 = org.telegram.ui.ActionBar.k6.w0(i14, cvVar.D);
            if (cvVar.E()) {
                i15 = org.telegram.ui.ActionBar.k6.f28031lc;
            } else {
                i15 = org.telegram.ui.ActionBar.k6.f27996je;
            }
            int w03 = org.telegram.ui.ActionBar.k6.w0(i15, cvVar.D);
            if (cvVar.E()) {
                i16 = org.telegram.ui.ActionBar.k6.f28068nc;
            } else {
                i16 = org.telegram.ui.ActionBar.k6.f28033le;
            }
            int w04 = org.telegram.ui.ActionBar.k6.w0(i16, cvVar.D);
            if (cvVar.E()) {
                i17 = org.telegram.ui.ActionBar.k6.f28068nc;
            } else {
                i17 = org.telegram.ui.ActionBar.k6.f28033le;
            }
            int w05 = org.telegram.ui.ActionBar.k6.w0(i17, cvVar.D);
            if (cvVar.E()) {
                i18 = org.telegram.ui.ActionBar.k6.f28049mc;
            } else {
                i18 = org.telegram.ui.ActionBar.k6.ke;
            }
            int w06 = org.telegram.ui.ActionBar.k6.w0(i18, cvVar.D);
            mm0 mm0Var = this.f26091a0;
            mm0Var.g(w02, w03, w04, w05, w06);
            canvas.save();
            canvas.translate(this.f26099i0, this.f26100j0);
            mm0Var.b(canvas);
            canvas.restore();
            StaticLayout staticLayout = this.f26094d0;
            int i21 = this.f26096f0;
            if (staticLayout != null) {
                canvas.save();
                canvas.translate(g0.L(54.0f) + i21, g0.L(6.0f) + this.f26100j0);
                this.f26094d0.draw(canvas);
                canvas.restore();
            }
            if (this.f26093c0 != null) {
                canvas.save();
                canvas.translate(g0.L(54.0f) + i21, this.f26100j0 - g0.L(16.0f));
                this.f26093c0.draw(canvas);
                canvas.restore();
            }
            boolean z10 = this.m0;
            RectF rectF = this.f26103n0;
            if (z10) {
                if (cvVar.E()) {
                    org.telegram.ui.ActionBar.e6 e6Var = cvVar.D;
                    if (e6Var != null) {
                        drawable = e6Var.getDrawable("drawableMsgOutMenu");
                    } else {
                        drawable = null;
                    }
                    if (drawable == null) {
                        drawable = org.telegram.ui.ActionBar.k6.R0("drawableMsgOutMenu");
                    }
                } else {
                    drawable = org.telegram.ui.ActionBar.k6.f27859c4;
                }
                int L = (this.f26102l0 + this.f26435b.right) - g0.L(32.0f);
                int L2 = g0.L(7.0f);
                drawable.setBounds(L, L2, drawable.getIntrinsicWidth() + L, drawable.getIntrinsicHeight() + L2);
                drawable.draw(canvas);
                rectF.set(L - g0.L(8.0f), 0.0f, g0.L(8.0f) + drawable.getIntrinsicWidth() + L, g0.L(54.0f));
            } else {
                rectF.setEmpty();
            }
            canvas.restore();
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        int i3;
        int i10;
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        cv cvVar = this.f26434a;
        float f10 = x10 + cvVar.S;
        float y9 = motionEvent.getY();
        boolean contains = this.f26103n0.contains(f10, y9);
        if (actionMasked == 0 && contains) {
            this.f26106q0 = true;
            return true;
        }
        boolean z11 = this.f26106q0;
        TLRPC.Document document = this.Y;
        if (z11) {
            if (actionMasked == 2 && !contains) {
                this.f26106q0 = false;
                return true;
            } else if (actionMasked == 1 || actionMasked == 3) {
                if (actionMasked == 1 && contains) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f26106q0 = false;
                if (z10 && i0()) {
                    View view = this.W;
                    if (view != null) {
                        view.playSoundEffect(0);
                    }
                    cvVar.F.K(cvVar.E, document, F());
                    return true;
                }
                return true;
            }
        }
        if (this.f26091a0.e(f10 - this.f26099i0, y9 - this.f26100j0, actionMasked)) {
            if (actionMasked == 0) {
                a0(true);
            }
            if (actionMasked == 1 || actionMasked == 3) {
                a0(false);
            }
            View view2 = this.W;
            if (view2 != null) {
                view2.invalidate();
                return true;
            }
        } else if (actionMasked == 0) {
            if (this.f26104o0 != -1) {
                if (f10 >= this.f26096f0 && f10 <= g0.L(48.0f) + i3) {
                    if (y9 >= this.f26097g0 && y9 <= g0.L(48.0f) + i10) {
                        this.f26105p0 = true;
                        View view3 = this.W;
                        if (view3 != null) {
                            view3.invalidate();
                            return true;
                        }
                    }
                }
            }
            return this.f26105p0;
        } else {
            if (actionMasked == 1) {
                if (this.f26105p0) {
                    this.f26105p0 = false;
                    View view4 = this.W;
                    if (view4 != null) {
                        view4.playSoundEffect(0);
                    }
                    int i11 = cvVar.f22065a;
                    int i12 = this.f26104o0;
                    RadialProgress2 radialProgress2 = this.Z;
                    if (i12 == 0) {
                        if (MediaController.B().o0(cvVar.f22074l, this.X, 0L, false, null, 0L)) {
                            this.f26104o0 = 1;
                            radialProgress2.setIcon(j0(), false, true);
                            View view5 = this.W;
                            if (view5 != null) {
                                view5.invalidate();
                            }
                        }
                    } else if (i12 == 1) {
                        if (MediaController.B().R(this.X, true)) {
                            this.f26104o0 = 0;
                            radialProgress2.setIcon(j0(), false, true);
                            View view6 = this.W;
                            if (view6 != null) {
                                view6.invalidate();
                            }
                        }
                    } else if (i12 == 2) {
                        radialProgress2.p(false, 0.0f);
                        w7.G(i11).X(document, cvVar.f22066b, 1, 1);
                        this.f26104o0 = 3;
                        radialProgress2.setIcon(j0(), true, true);
                        View view7 = this.W;
                        if (view7 != null) {
                            view7.invalidate();
                        }
                    } else if (i12 == 3) {
                        w7.G(i11).f(document);
                        this.f26104o0 = 2;
                        radialProgress2.setIcon(j0(), false, true);
                        View view8 = this.W;
                        if (view8 != null) {
                            view8.invalidate();
                        }
                    }
                    View view9 = this.W;
                    if (view9 != null) {
                        view9.invalidate();
                    }
                }
            } else if (actionMasked == 3) {
                this.f26105p0 = false;
            }
            return this.f26105p0;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        zi ziVar;
        zi ziVar2 = this.X;
        if (ziVar2 != null) {
            if (i3 == hs.f23239h2) {
                l0(true);
            } else if (i3 != hs.f23227f2 && i3 != hs.f23233g2) {
                if (i3 == hs.f23221e2 && ziVar2.f1() == ((Integer) objArr[0]).intValue() && (ziVar = MediaController.B().f21348v0) != null) {
                    ziVar2.f26828b0 = ziVar.f26828b0;
                    ziVar2.f26851g0 = ziVar.f26851g0;
                    ziVar2.f26855h0 = ziVar.f26855h0;
                    m0();
                }
            } else {
                l0(true);
            }
        }
    }

    @Override
    public final int getObserverTag() {
        return this.f26107r0;
    }

    @Override
    public final void i(long j10, long j11) {
        float f10;
        if (j11 <= 0) {
            f10 = 0.0f;
        } else {
            f10 = ((float) j10) / ((float) j11);
        }
        this.Z.p(true, Math.min(1.0f, f10));
        if (this.f26104o0 != 3) {
            l0(true);
        }
    }

    public final boolean i0() {
        cv cvVar;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Cells.l1 l1Var;
        if (this.Y != null && (q1Var = (cvVar = this.f26434a).E) != null && (l1Var = cvVar.F) != null && l1Var.b0(q1Var)) {
            return true;
        }
        return false;
    }

    public final int j0() {
        int i3 = this.f26104o0;
        if (i3 == 1) {
            return 1;
        }
        if (i3 == 2) {
            return 2;
        }
        if (i3 == 3) {
            return 3;
        }
        return 0;
    }

    public final void k0() {
        float f10;
        String str;
        String str2;
        SpannableStringBuilder spannableStringBuilder;
        cv cvVar = this.f26434a;
        this.f26102l0 = this.f26436c + cvVar.S + cvVar.T;
        this.m0 = i0();
        int L = g0.L(50.0f) + this.f26096f0;
        int i3 = this.f26098h0;
        int i10 = L + i3;
        this.f26099i0 = i10;
        int i11 = this.f26102l0 - i10;
        if (this.m0) {
            f10 = 42.0f;
        } else {
            f10 = 18.0f;
        }
        this.f26101k0 = k2.p1.d(f10, i11, 0);
        zi ziVar = this.X;
        if (ziVar != null) {
            str = ziVar.x1(false);
        } else {
            str = null;
        }
        if (ziVar != null) {
            str2 = ziVar.z1(false);
        } else {
            str2 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str2);
        int i12 = this.f26097g0;
        if (isEmpty && TextUtils.isEmpty(str)) {
            this.f26093c0 = null;
            this.f26100j0 = ((i3 - g0.L(30.0f)) / 2) + i12;
        } else {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                spannableStringBuilder = new SpannableStringBuilder(a1.g.C(str, " - ", str2));
            } else if (!TextUtils.isEmpty(str2)) {
                spannableStringBuilder = new SpannableStringBuilder(str2);
            } else {
                spannableStringBuilder = new SpannableStringBuilder(str);
            }
            if (!TextUtils.isEmpty(str)) {
                spannableStringBuilder.setSpan(new o31(g0.o()), 0, str.length(), 18);
            }
            this.f26092b0.setTextSize(g0.L(16.0f));
            int L2 = g0.L(50.0f) + this.f26101k0;
            this.f26093c0 = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.k6.O2, L2, TextUtils.TruncateAt.END), this.f26092b0, L2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f26100j0 = g0.L(11.0f) + ((i3 - g0.L(30.0f)) / 2) + i12;
        }
        this.f26091a0.i(this.f26101k0, g0.L(30.0f));
    }

    public final void l0(boolean z10) {
        File K;
        boolean z11;
        int i3 = this.f26434a.f22065a;
        TLRPC.Document document = this.Y;
        String r5 = w7.r(null, document);
        int i10 = 1;
        if (document == null) {
            K = null;
        } else {
            w7.G(i3);
            K = w7.K(document, null, true, true);
        }
        if (K != null && K.exists()) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean isEmpty = TextUtils.isEmpty(r5);
        RadialProgress2 radialProgress2 = this.Z;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        zi ziVar = this.X;
        if (z11) {
            z5.q(i3).v(this);
            if (MediaController.B().I(ziVar) && !MediaController.B().H()) {
                this.f26104o0 = 1;
            } else {
                this.f26104o0 = 0;
            }
            radialProgress2.setIcon(j0(), false, z10);
        } else {
            z5.q(i3).a(r5, null, this);
            if (az.B0 && ziVar != null && ziVar.J3() && !zi.S5(ziVar.f26868k) && !m5.C(zi.B0(ziVar.f26868k))) {
                if (!MediaController.B().I(ziVar) || MediaController.B().H()) {
                    i10 = 0;
                }
                this.f26104o0 = i10;
                radialProgress2.setIcon(j0(), false, z10);
            } else {
                float f10 = 0.0f;
                if (!w7.G(i3).T(r5)) {
                    this.f26104o0 = 2;
                    radialProgress2.p(z10, 0.0f);
                    radialProgress2.setIcon(j0(), false, z10);
                } else {
                    this.f26104o0 = 3;
                    Float w10 = zb.D().w(r5);
                    if (w10 != null) {
                        f10 = w10.floatValue();
                    }
                    radialProgress2.p(z10, f10);
                    radialProgress2.setIcon(j0(), true, z10);
                }
            }
        }
        m0();
    }

    public final void m0() {
        zi ziVar;
        int i3;
        int i10;
        TLRPC.Document document = this.Y;
        if (document != null && (ziVar = this.X) != null) {
            mm0 mm0Var = this.f26091a0;
            if (!mm0Var.f36191e) {
                mm0Var.h(ziVar.f26828b0);
            }
            if (MediaController.B().I(ziVar)) {
                i3 = ziVar.f26851g0;
            } else {
                int i11 = 0;
                while (true) {
                    if (i11 < document.attributes.size()) {
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                            i3 = (int) documentAttribute.duration;
                            break;
                        }
                        i11++;
                    } else {
                        i3 = 0;
                        break;
                    }
                }
            }
            String g02 = g0.g0(i3, false, false);
            String str = this.f26095e0;
            TextPaint textPaint = this.f26092b0;
            if (str == null || !str.equals(g02)) {
                this.f26095e0 = g02;
                textPaint.setTextSize(g0.L(16.0f));
                this.f26094d0 = new StaticLayout(g02, textPaint, (int) Math.ceil(textPaint.measureText(g02)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            cv cvVar = this.f26434a;
            if (cvVar.E()) {
                i10 = org.telegram.ui.ActionBar.k6.Tc;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.Sc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(i10, cvVar.D));
            View view = this.W;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    @Override
    public final void o(long j10, long j11) {
    }
}
