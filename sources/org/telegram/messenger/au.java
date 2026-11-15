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
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.y31;
public final class au extends cu implements x5, is {
    public final gj X;
    public final TLRPC.Document Y;
    public final RadialProgress2 Z;
    public final nm0 f22586a0;
    public final TextPaint f22587b0;
    public StaticLayout f22588c0;
    public StaticLayout f22589d0;
    public String f22590e0;
    public final int f22591f0;
    public final int f22592g0;
    public final int f22593h0;
    public int f22594i0;
    public int f22595j0;
    public int f22596k0;
    public int f22597l0;
    public boolean m0;
    public final RectF f22598n0;
    public int f22599o0;
    public boolean f22600p0;
    public boolean f22601q0;
    public final int f22602r0;

    public au(iv ivVar, Rect rect, int i7, TL_iv.pageBlockAudio pageblockaudio) {
        super(ivVar, rect, i7);
        TLRPC.Document document;
        this.f22587b0 = new TextPaint(1);
        int L = g0.L(16.0f);
        this.f22591f0 = L;
        int L2 = g0.L(9.0f);
        this.f22592g0 = L2;
        int L3 = g0.L(44.0f);
        this.f22593h0 = L3;
        this.f22597l0 = -1;
        this.f22598n0 = new RectF();
        gj gjVar = (gj) ivVar.f24450m.get(pageblockaudio);
        this.X = gjVar;
        if (gjVar != null) {
            document = gjVar.F0();
        } else {
            document = null;
        }
        this.Y = document;
        this.f22602r0 = z5.q(ivVar.f24440a).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.Z = radialProgress2;
        radialProgress2.setCircleRadius(g0.L(24.0f));
        radialProgress2.r(L, L2, L + L3, L3 + L2);
        nm0 nm0Var = new nm0(null);
        this.f22586a0 = nm0Var;
        nm0Var.h = new j1(this, 15);
        k0();
        l0(false);
    }

    @Override
    public final void C(boolean z10) {
        l0(true);
    }

    @Override
    public final int I() {
        Rect rect = this.f22934b;
        return g0.L(62.0f) + rect.top + rect.bottom;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final void N(String str) {
        this.Z.p(true, 1.0f);
        l0(true);
    }

    @Override
    public final boolean Q() {
        return this.f22586a0.f37640e;
    }

    @Override
    public final void T() {
        View view = this.W;
        if (view != null) {
            this.Z.n(view);
            this.f22586a0.f37653s = this.W;
        }
        l0(false);
        iv ivVar = this.f22933a;
        int i7 = ivVar.f24440a;
        int i10 = ivVar.f24440a;
        ns.f(i7).c(this, ns.f25506h2);
        ns.f(i10).c(this, ns.f25494f2);
        ns.f(i10).c(this, ns.f25500g2);
        ns.f(i10).c(this, ns.f25488e2);
    }

    @Override
    public final void V() {
        iv ivVar = this.f22933a;
        z5.q(ivVar.f24440a).v(this);
        int i7 = ivVar.f24440a;
        ns.f(i7).n(this, ns.f25506h2);
        ns.f(i7).n(this, ns.f25494f2);
        ns.f(i7).n(this, ns.f25500g2);
        ns.f(i7).n(this, ns.f25488e2);
    }

    @Override
    public final void W(Canvas canvas) {
        int i7;
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
            int i19 = this.f22597l0;
            int i20 = this.f22935c;
            iv ivVar = this.f22933a;
            if (i19 != i20 + ivVar.S + ivVar.T || this.m0 != i0()) {
                k0();
            }
            canvas.save();
            canvas.translate(-ivVar.S, 0.0f);
            if (ivVar.E()) {
                i7 = org.telegram.ui.ActionBar.j6.Ec;
            } else {
                i7 = org.telegram.ui.ActionBar.j6.Ze;
            }
            if (ivVar.E()) {
                i10 = org.telegram.ui.ActionBar.j6.Fc;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.f28800af;
            }
            if (ivVar.E()) {
                i11 = org.telegram.ui.ActionBar.j6.Gb;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.f29003ld;
            }
            if (ivVar.E()) {
                i12 = org.telegram.ui.ActionBar.j6.Hb;
            } else {
                i12 = org.telegram.ui.ActionBar.j6.f29019md;
            }
            RadialProgress2 radialProgress2 = this.Z;
            radialProgress2.g(i7, i10, i11, i12);
            if (ivVar.E()) {
                i13 = org.telegram.ui.ActionBar.j6.f29171uc;
            } else {
                i13 = org.telegram.ui.ActionBar.j6.f29134se;
            }
            radialProgress2.d = org.telegram.ui.ActionBar.j6.w0(i13, ivVar.D);
            radialProgress2.draw(canvas);
            if (ivVar.E()) {
                i14 = org.telegram.ui.ActionBar.j6.f29037nc;
            } else {
                i14 = org.telegram.ui.ActionBar.j6.le;
            }
            int w02 = org.telegram.ui.ActionBar.j6.w0(i14, ivVar.D);
            if (ivVar.E()) {
                i15 = org.telegram.ui.ActionBar.j6.f29055oc;
            } else {
                i15 = org.telegram.ui.ActionBar.j6.f29020me;
            }
            int w03 = org.telegram.ui.ActionBar.j6.w0(i15, ivVar.D);
            if (ivVar.E()) {
                i16 = org.telegram.ui.ActionBar.j6.f29095qc;
            } else {
                i16 = org.telegram.ui.ActionBar.j6.f29057oe;
            }
            int w04 = org.telegram.ui.ActionBar.j6.w0(i16, ivVar.D);
            if (ivVar.E()) {
                i17 = org.telegram.ui.ActionBar.j6.f29095qc;
            } else {
                i17 = org.telegram.ui.ActionBar.j6.f29057oe;
            }
            int w05 = org.telegram.ui.ActionBar.j6.w0(i17, ivVar.D);
            if (ivVar.E()) {
                i18 = org.telegram.ui.ActionBar.j6.f29075pc;
            } else {
                i18 = org.telegram.ui.ActionBar.j6.ne;
            }
            int w06 = org.telegram.ui.ActionBar.j6.w0(i18, ivVar.D);
            nm0 nm0Var = this.f22586a0;
            nm0Var.g(w02, w03, w04, w05, w06);
            canvas.save();
            canvas.translate(this.f22594i0, this.f22595j0);
            nm0Var.b(canvas);
            canvas.restore();
            StaticLayout staticLayout = this.f22589d0;
            int i21 = this.f22591f0;
            if (staticLayout != null) {
                canvas.save();
                canvas.translate(g0.L(54.0f) + i21, g0.L(6.0f) + this.f22595j0);
                this.f22589d0.draw(canvas);
                canvas.restore();
            }
            if (this.f22588c0 != null) {
                canvas.save();
                canvas.translate(g0.L(54.0f) + i21, this.f22595j0 - g0.L(16.0f));
                this.f22588c0.draw(canvas);
                canvas.restore();
            }
            boolean z10 = this.m0;
            RectF rectF = this.f22598n0;
            if (z10) {
                if (ivVar.E()) {
                    org.telegram.ui.ActionBar.e6 e6Var = ivVar.D;
                    if (e6Var != null) {
                        drawable = e6Var.getDrawable("drawableMsgOutMenu");
                    } else {
                        drawable = null;
                    }
                    if (drawable == null) {
                        drawable = org.telegram.ui.ActionBar.j6.R0("drawableMsgOutMenu");
                    }
                } else {
                    drawable = org.telegram.ui.ActionBar.j6.f28829c4;
                }
                int L = (this.f22597l0 + this.f22934b.right) - g0.L(32.0f);
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
        int i7;
        int i10;
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        iv ivVar = this.f22933a;
        float f10 = x10 + ivVar.S;
        float y10 = motionEvent.getY();
        boolean contains = this.f22598n0.contains(f10, y10);
        if (actionMasked == 0 && contains) {
            this.f22601q0 = true;
            return true;
        }
        boolean z11 = this.f22601q0;
        TLRPC.Document document = this.Y;
        if (z11) {
            if (actionMasked == 2 && !contains) {
                this.f22601q0 = false;
                return true;
            } else if (actionMasked == 1 || actionMasked == 3) {
                if (actionMasked == 1 && contains) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f22601q0 = false;
                if (z10 && i0()) {
                    View view = this.W;
                    if (view != null) {
                        view.playSoundEffect(0);
                    }
                    ivVar.F.K(ivVar.E, document, F());
                    return true;
                }
                return true;
            }
        }
        if (this.f22586a0.e(f10 - this.f22594i0, y10 - this.f22595j0, actionMasked)) {
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
            if (this.f22599o0 != -1) {
                if (f10 >= this.f22591f0 && f10 <= g0.L(48.0f) + i7) {
                    if (y10 >= this.f22592g0 && y10 <= g0.L(48.0f) + i10) {
                        this.f22600p0 = true;
                        View view3 = this.W;
                        if (view3 != null) {
                            view3.invalidate();
                            return true;
                        }
                    }
                }
            }
            return this.f22600p0;
        } else {
            if (actionMasked == 1) {
                if (this.f22600p0) {
                    this.f22600p0 = false;
                    View view4 = this.W;
                    if (view4 != null) {
                        view4.playSoundEffect(0);
                    }
                    int i11 = ivVar.f24440a;
                    int i12 = this.f22599o0;
                    RadialProgress2 radialProgress2 = this.Z;
                    if (i12 == 0) {
                        if (MediaController.B().o0(ivVar.f24449l, this.X, 0L, false, null, 0L)) {
                            this.f22599o0 = 1;
                            radialProgress2.setIcon(j0(), false, true);
                            View view5 = this.W;
                            if (view5 != null) {
                                view5.invalidate();
                            }
                        }
                    } else if (i12 == 1) {
                        if (MediaController.B().R(this.X, true)) {
                            this.f22599o0 = 0;
                            radialProgress2.setIcon(j0(), false, true);
                            View view6 = this.W;
                            if (view6 != null) {
                                view6.invalidate();
                            }
                        }
                    } else if (i12 == 2) {
                        radialProgress2.p(false, 0.0f);
                        w7.G(i11).W(document, ivVar.f24441b, 1, 1);
                        this.f22599o0 = 3;
                        radialProgress2.setIcon(j0(), true, true);
                        View view7 = this.W;
                        if (view7 != null) {
                            view7.invalidate();
                        }
                    } else if (i12 == 3) {
                        w7.G(i11).f(document);
                        this.f22599o0 = 2;
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
                this.f22600p0 = false;
            }
            return this.f22600p0;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        gj gjVar;
        gj gjVar2 = this.X;
        if (gjVar2 != null) {
            if (i7 == ns.f25506h2) {
                l0(true);
            } else if (i7 != ns.f25494f2 && i7 != ns.f25500g2) {
                if (i7 == ns.f25488e2 && gjVar2.e1() == ((Integer) objArr[0]).intValue() && (gjVar = MediaController.B().f22377v0) != null) {
                    gjVar2.f23777b0 = gjVar.f23777b0;
                    gjVar2.f23809i0 = gjVar.f23809i0;
                    gjVar2.f23814j0 = gjVar.f23814j0;
                    m0();
                }
            } else {
                l0(true);
            }
        }
    }

    @Override
    public final int getObserverTag() {
        return this.f22602r0;
    }

    @Override
    public final void i(long j3, long j10) {
        float f10;
        if (j10 <= 0) {
            f10 = 0.0f;
        } else {
            f10 = ((float) j3) / ((float) j10);
        }
        this.Z.p(true, Math.min(1.0f, f10));
        if (this.f22599o0 != 3) {
            l0(true);
        }
    }

    public final boolean i0() {
        iv ivVar;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Cells.l1 l1Var;
        if (this.Y != null && (q1Var = (ivVar = this.f22933a).E) != null && (l1Var = ivVar.F) != null && l1Var.a0(q1Var)) {
            return true;
        }
        return false;
    }

    public final int j0() {
        int i7 = this.f22599o0;
        if (i7 == 1) {
            return 1;
        }
        if (i7 == 2) {
            return 2;
        }
        if (i7 == 3) {
            return 3;
        }
        return 0;
    }

    public final void k0() {
        float f10;
        String str;
        String str2;
        SpannableStringBuilder spannableStringBuilder;
        iv ivVar = this.f22933a;
        this.f22597l0 = this.f22935c + ivVar.S + ivVar.T;
        this.m0 = i0();
        int L = g0.L(50.0f) + this.f22591f0;
        int i7 = this.f22593h0;
        int i10 = L + i7;
        this.f22594i0 = i10;
        int i11 = this.f22597l0 - i10;
        if (this.m0) {
            f10 = 42.0f;
        } else {
            f10 = 18.0f;
        }
        this.f22596k0 = i5.c.d(f10, i11, 0);
        gj gjVar = this.X;
        if (gjVar != null) {
            str = gjVar.w1(false);
        } else {
            str = null;
        }
        if (gjVar != null) {
            str2 = gjVar.y1(false);
        } else {
            str2 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str2);
        int i12 = this.f22592g0;
        if (isEmpty && TextUtils.isEmpty(str)) {
            this.f22588c0 = null;
            this.f22595j0 = ((i7 - g0.L(30.0f)) / 2) + i12;
        } else {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                spannableStringBuilder = new SpannableStringBuilder(a8.p0.E(str, " - ", str2));
            } else if (!TextUtils.isEmpty(str2)) {
                spannableStringBuilder = new SpannableStringBuilder(str2);
            } else {
                spannableStringBuilder = new SpannableStringBuilder(str);
            }
            if (!TextUtils.isEmpty(str)) {
                spannableStringBuilder.setSpan(new y31(g0.o()), 0, str.length(), 18);
            }
            this.f22587b0.setTextSize(g0.L(16.0f));
            int L2 = g0.L(50.0f) + this.f22596k0;
            this.f22588c0 = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.j6.O2, L2, TextUtils.TruncateAt.END), this.f22587b0, L2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f22595j0 = g0.L(11.0f) + ((i7 - g0.L(30.0f)) / 2) + i12;
        }
        this.f22586a0.i(this.f22596k0, g0.L(30.0f));
    }

    public final void l0(boolean z10) {
        File J;
        boolean z11;
        int i7 = this.f22933a.f24440a;
        TLRPC.Document document = this.Y;
        String r10 = w7.r(null, document);
        int i10 = 1;
        if (document == null) {
            J = null;
        } else {
            w7.G(i7);
            J = w7.J(document, null, true, true);
        }
        if (J != null && J.exists()) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean isEmpty = TextUtils.isEmpty(r10);
        RadialProgress2 radialProgress2 = this.Z;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        gj gjVar = this.X;
        if (z11) {
            z5.q(i7).v(this);
            if (MediaController.B().I(gjVar) && !MediaController.B().H()) {
                this.f22599o0 = 1;
            } else {
                this.f22599o0 = 0;
            }
            radialProgress2.setIcon(j0(), false, z10);
        } else {
            z5.q(i7).a(r10, null, this);
            if (gz.B0 && gjVar != null && gjVar.I3() && !gj.R5(gjVar.f23817k) && !m5.C(gj.B0(gjVar.f23817k))) {
                if (!MediaController.B().I(gjVar) || MediaController.B().H()) {
                    i10 = 0;
                }
                this.f22599o0 = i10;
                radialProgress2.setIcon(j0(), false, z10);
            } else {
                float f10 = 0.0f;
                if (!w7.G(i7).S(r10)) {
                    this.f22599o0 = 2;
                    radialProgress2.p(z10, 0.0f);
                    radialProgress2.setIcon(j0(), false, z10);
                } else {
                    this.f22599o0 = 3;
                    Float w10 = fc.D().w(r10);
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
        gj gjVar;
        int i7;
        int i10;
        TLRPC.Document document = this.Y;
        if (document != null && (gjVar = this.X) != null) {
            nm0 nm0Var = this.f22586a0;
            if (!nm0Var.f37640e) {
                nm0Var.h(gjVar.f23777b0);
            }
            if (MediaController.B().I(gjVar)) {
                i7 = gjVar.f23809i0;
            } else {
                int i11 = 0;
                while (true) {
                    if (i11 < document.attributes.size()) {
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                            i7 = (int) documentAttribute.duration;
                            break;
                        }
                        i11++;
                    } else {
                        i7 = 0;
                        break;
                    }
                }
            }
            String g02 = g0.g0(i7, false, false);
            String str = this.f22590e0;
            TextPaint textPaint = this.f22587b0;
            if (str == null || !str.equals(g02)) {
                this.f22590e0 = g02;
                textPaint.setTextSize(g0.L(16.0f));
                this.f22589d0 = new StaticLayout(g02, textPaint, (int) Math.ceil(textPaint.measureText(g02)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            iv ivVar = this.f22933a;
            if (ivVar.E()) {
                i10 = org.telegram.ui.ActionBar.j6.Wc;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.Vc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(i10, ivVar.D));
            View view = this.W;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
