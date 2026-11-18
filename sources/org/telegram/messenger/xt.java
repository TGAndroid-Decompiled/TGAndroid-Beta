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
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.vm0;
public final class xt extends zt implements y5, fs {
    public final fj X;
    public final TLRPC.Document Y;
    public final RadialProgress2 Z;
    public final vm0 f27985a0;
    public final TextPaint f27986b0;
    public StaticLayout f27987c0;
    public StaticLayout f27988d0;
    public String f27989e0;
    public final int f27990f0;
    public final int f27991g0;
    public final int f27992h0;
    public int f27993i0;
    public int f27994j0;
    public int f27995k0;
    public int f27996l0;
    public boolean m0;
    public final RectF f27997n0;
    public int f27998o0;
    public boolean f27999p0;
    public boolean f28000q0;
    public final int f28001r0;

    public xt(ev evVar, Rect rect, int i7, TL_iv.pageBlockAudio pageblockaudio) {
        super(evVar, rect, i7);
        TLRPC.Document document;
        this.f27986b0 = new TextPaint(1);
        int L = g0.L(16.0f);
        this.f27990f0 = L;
        int L2 = g0.L(9.0f);
        this.f27991g0 = L2;
        int L3 = g0.L(44.0f);
        this.f27992h0 = L3;
        this.f27996l0 = -1;
        this.f27997n0 = new RectF();
        fj fjVar = (fj) evVar.f23777m.get(pageblockaudio);
        this.X = fjVar;
        if (fjVar != null) {
            document = fjVar.F0();
        } else {
            document = null;
        }
        this.Y = document;
        this.f28001r0 = a6.q(evVar.f23767a).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.Z = radialProgress2;
        radialProgress2.setCircleRadius(g0.L(24.0f));
        radialProgress2.r(L, L2, L + L3, L3 + L2);
        vm0 vm0Var = new vm0(null);
        this.f27985a0 = vm0Var;
        vm0Var.h = new j1(this, 16);
        k0();
        l0(false);
    }

    @Override
    public final void C(boolean z10) {
        l0(true);
    }

    @Override
    public final int I() {
        Rect rect = this.f28350b;
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
        return this.f27985a0.f40710e;
    }

    @Override
    public final void T() {
        View view = this.W;
        if (view != null) {
            this.Z.n(view);
            this.f27985a0.f40723s = this.W;
        }
        l0(false);
        ev evVar = this.f28349a;
        int i7 = evVar.f23767a;
        int i10 = evVar.f23767a;
        ks.f(i7).c(this, ks.f25124h2);
        ks.f(i10).c(this, ks.f25112f2);
        ks.f(i10).c(this, ks.f25118g2);
        ks.f(i10).c(this, ks.f25106e2);
    }

    @Override
    public final void V() {
        ev evVar = this.f28349a;
        a6.q(evVar.f23767a).v(this);
        int i7 = evVar.f23767a;
        ks.f(i7).n(this, ks.f25124h2);
        ks.f(i7).n(this, ks.f25112f2);
        ks.f(i7).n(this, ks.f25118g2);
        ks.f(i7).n(this, ks.f25106e2);
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
            int i19 = this.f27996l0;
            int i20 = this.f28351c;
            ev evVar = this.f28349a;
            if (i19 != i20 + evVar.S + evVar.T || this.m0 != i0()) {
                k0();
            }
            canvas.save();
            canvas.translate(-evVar.S, 0.0f);
            if (evVar.E()) {
                i7 = org.telegram.ui.ActionBar.n6.Ec;
            } else {
                i7 = org.telegram.ui.ActionBar.n6.Ze;
            }
            if (evVar.E()) {
                i10 = org.telegram.ui.ActionBar.n6.Fc;
            } else {
                i10 = org.telegram.ui.ActionBar.n6.f29345af;
            }
            if (evVar.E()) {
                i11 = org.telegram.ui.ActionBar.n6.Gb;
            } else {
                i11 = org.telegram.ui.ActionBar.n6.f29548ld;
            }
            if (evVar.E()) {
                i12 = org.telegram.ui.ActionBar.n6.Hb;
            } else {
                i12 = org.telegram.ui.ActionBar.n6.f29564md;
            }
            RadialProgress2 radialProgress2 = this.Z;
            radialProgress2.g(i7, i10, i11, i12);
            if (evVar.E()) {
                i13 = org.telegram.ui.ActionBar.n6.f29716uc;
            } else {
                i13 = org.telegram.ui.ActionBar.n6.f29679se;
            }
            radialProgress2.d = org.telegram.ui.ActionBar.n6.w0(i13, evVar.D);
            radialProgress2.draw(canvas);
            if (evVar.E()) {
                i14 = org.telegram.ui.ActionBar.n6.f29582nc;
            } else {
                i14 = org.telegram.ui.ActionBar.n6.le;
            }
            int w02 = org.telegram.ui.ActionBar.n6.w0(i14, evVar.D);
            if (evVar.E()) {
                i15 = org.telegram.ui.ActionBar.n6.f29600oc;
            } else {
                i15 = org.telegram.ui.ActionBar.n6.f29565me;
            }
            int w03 = org.telegram.ui.ActionBar.n6.w0(i15, evVar.D);
            if (evVar.E()) {
                i16 = org.telegram.ui.ActionBar.n6.f29640qc;
            } else {
                i16 = org.telegram.ui.ActionBar.n6.f29602oe;
            }
            int w04 = org.telegram.ui.ActionBar.n6.w0(i16, evVar.D);
            if (evVar.E()) {
                i17 = org.telegram.ui.ActionBar.n6.f29640qc;
            } else {
                i17 = org.telegram.ui.ActionBar.n6.f29602oe;
            }
            int w05 = org.telegram.ui.ActionBar.n6.w0(i17, evVar.D);
            if (evVar.E()) {
                i18 = org.telegram.ui.ActionBar.n6.f29620pc;
            } else {
                i18 = org.telegram.ui.ActionBar.n6.ne;
            }
            int w06 = org.telegram.ui.ActionBar.n6.w0(i18, evVar.D);
            vm0 vm0Var = this.f27985a0;
            vm0Var.g(w02, w03, w04, w05, w06);
            canvas.save();
            canvas.translate(this.f27993i0, this.f27994j0);
            vm0Var.b(canvas);
            canvas.restore();
            StaticLayout staticLayout = this.f27988d0;
            int i21 = this.f27990f0;
            if (staticLayout != null) {
                canvas.save();
                canvas.translate(g0.L(54.0f) + i21, g0.L(6.0f) + this.f27994j0);
                this.f27988d0.draw(canvas);
                canvas.restore();
            }
            if (this.f27987c0 != null) {
                canvas.save();
                canvas.translate(g0.L(54.0f) + i21, this.f27994j0 - g0.L(16.0f));
                this.f27987c0.draw(canvas);
                canvas.restore();
            }
            boolean z10 = this.m0;
            RectF rectF = this.f27997n0;
            if (z10) {
                if (evVar.E()) {
                    org.telegram.ui.ActionBar.i6 i6Var = evVar.D;
                    if (i6Var != null) {
                        drawable = i6Var.getDrawable("drawableMsgOutMenu");
                    } else {
                        drawable = null;
                    }
                    if (drawable == null) {
                        drawable = org.telegram.ui.ActionBar.n6.R0("drawableMsgOutMenu");
                    }
                } else {
                    drawable = org.telegram.ui.ActionBar.n6.f29374c4;
                }
                int L = (this.f27996l0 + this.f28350b.right) - g0.L(32.0f);
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
        ev evVar = this.f28349a;
        float f10 = x10 + evVar.S;
        float y10 = motionEvent.getY();
        boolean contains = this.f27997n0.contains(f10, y10);
        if (actionMasked == 0 && contains) {
            this.f28000q0 = true;
            return true;
        }
        boolean z11 = this.f28000q0;
        TLRPC.Document document = this.Y;
        if (z11) {
            if (actionMasked == 2 && !contains) {
                this.f28000q0 = false;
                return true;
            } else if (actionMasked == 1 || actionMasked == 3) {
                if (actionMasked == 1 && contains) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f28000q0 = false;
                if (z10 && i0()) {
                    View view = this.W;
                    if (view != null) {
                        view.playSoundEffect(0);
                    }
                    evVar.F.N(evVar.E, document, F());
                    return true;
                }
                return true;
            }
        }
        if (this.f27985a0.e(f10 - this.f27993i0, y10 - this.f27994j0, actionMasked)) {
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
            if (this.f27998o0 != -1) {
                if (f10 >= this.f27990f0 && f10 <= g0.L(48.0f) + i7) {
                    if (y10 >= this.f27991g0 && y10 <= g0.L(48.0f) + i10) {
                        this.f27999p0 = true;
                        View view3 = this.W;
                        if (view3 != null) {
                            view3.invalidate();
                            return true;
                        }
                    }
                }
            }
            return this.f27999p0;
        } else {
            if (actionMasked == 1) {
                if (this.f27999p0) {
                    this.f27999p0 = false;
                    View view4 = this.W;
                    if (view4 != null) {
                        view4.playSoundEffect(0);
                    }
                    int i11 = evVar.f23767a;
                    int i12 = this.f27998o0;
                    RadialProgress2 radialProgress2 = this.Z;
                    if (i12 == 0) {
                        if (MediaController.B().o0(evVar.f23776l, this.X, 0L, false, null, 0L)) {
                            this.f27998o0 = 1;
                            radialProgress2.setIcon(j0(), false, true);
                            View view5 = this.W;
                            if (view5 != null) {
                                view5.invalidate();
                            }
                        }
                    } else if (i12 == 1) {
                        if (MediaController.B().R(this.X, true)) {
                            this.f27998o0 = 0;
                            radialProgress2.setIcon(j0(), false, true);
                            View view6 = this.W;
                            if (view6 != null) {
                                view6.invalidate();
                            }
                        }
                    } else if (i12 == 2) {
                        radialProgress2.p(false, 0.0f);
                        w7.G(i11).W(document, evVar.f23768b, 1, 1);
                        this.f27998o0 = 3;
                        radialProgress2.setIcon(j0(), true, true);
                        View view7 = this.W;
                        if (view7 != null) {
                            view7.invalidate();
                        }
                    } else if (i12 == 3) {
                        w7.G(i11).f(document);
                        this.f27998o0 = 2;
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
                this.f27999p0 = false;
            }
            return this.f27999p0;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        fj fjVar;
        fj fjVar2 = this.X;
        if (fjVar2 != null) {
            if (i7 == ks.f25124h2) {
                l0(true);
            } else if (i7 != ks.f25112f2 && i7 != ks.f25118g2) {
                if (i7 == ks.f25106e2 && fjVar2.e1() == ((Integer) objArr[0]).intValue() && (fjVar = MediaController.B().f22740v0) != null) {
                    fjVar2.f23925b0 = fjVar.f23925b0;
                    fjVar2.f23957i0 = fjVar.f23957i0;
                    fjVar2.f23962j0 = fjVar.f23962j0;
                    m0();
                }
            } else {
                l0(true);
            }
        }
    }

    @Override
    public final int getObserverTag() {
        return this.f28001r0;
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
        if (this.f27998o0 != 3) {
            l0(true);
        }
    }

    public final boolean i0() {
        ev evVar;
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.ui.Cells.m1 m1Var;
        if (this.Y != null && (r1Var = (evVar = this.f28349a).E) != null && (m1Var = evVar.F) != null && m1Var.d0(r1Var)) {
            return true;
        }
        return false;
    }

    public final int j0() {
        int i7 = this.f27998o0;
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
        ev evVar = this.f28349a;
        this.f27996l0 = this.f28351c + evVar.S + evVar.T;
        this.m0 = i0();
        int L = g0.L(50.0f) + this.f27990f0;
        int i7 = this.f27992h0;
        int i10 = L + i7;
        this.f27993i0 = i10;
        int i11 = this.f27996l0 - i10;
        if (this.m0) {
            f10 = 42.0f;
        } else {
            f10 = 18.0f;
        }
        this.f27995k0 = i5.c.d(f10, i11, 0);
        fj fjVar = this.X;
        if (fjVar != null) {
            str = fjVar.w1(false);
        } else {
            str = null;
        }
        if (fjVar != null) {
            str2 = fjVar.y1(false);
        } else {
            str2 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str2);
        int i12 = this.f27991g0;
        if (isEmpty && TextUtils.isEmpty(str)) {
            this.f27987c0 = null;
            this.f27994j0 = ((i7 - g0.L(30.0f)) / 2) + i12;
        } else {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                spannableStringBuilder = new SpannableStringBuilder(a8.p0.E(str, " - ", str2));
            } else if (!TextUtils.isEmpty(str2)) {
                spannableStringBuilder = new SpannableStringBuilder(str2);
            } else {
                spannableStringBuilder = new SpannableStringBuilder(str);
            }
            if (!TextUtils.isEmpty(str)) {
                spannableStringBuilder.setSpan(new i41(g0.o()), 0, str.length(), 18);
            }
            this.f27986b0.setTextSize(g0.L(16.0f));
            int L2 = g0.L(50.0f) + this.f27995k0;
            this.f27987c0 = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.n6.O2, L2, TextUtils.TruncateAt.END), this.f27986b0, L2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f27994j0 = g0.L(11.0f) + ((i7 - g0.L(30.0f)) / 2) + i12;
        }
        this.f27985a0.i(this.f27995k0, g0.L(30.0f));
    }

    public final void l0(boolean z10) {
        File J;
        boolean z11;
        int i7 = this.f28349a.f23767a;
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
        fj fjVar = this.X;
        if (z11) {
            a6.q(i7).v(this);
            if (MediaController.B().I(fjVar) && !MediaController.B().H()) {
                this.f27998o0 = 1;
            } else {
                this.f27998o0 = 0;
            }
            radialProgress2.setIcon(j0(), false, z10);
        } else {
            a6.q(i7).a(r10, null, this);
            if (bz.B0 && fjVar != null && fjVar.I3() && !fj.R5(fjVar.f23965k) && !n5.C(fj.B0(fjVar.f23965k))) {
                if (!MediaController.B().I(fjVar) || MediaController.B().H()) {
                    i10 = 0;
                }
                this.f27998o0 = i10;
                radialProgress2.setIcon(j0(), false, z10);
            } else {
                float f10 = 0.0f;
                if (!w7.G(i7).S(r10)) {
                    this.f27998o0 = 2;
                    radialProgress2.p(z10, 0.0f);
                    radialProgress2.setIcon(j0(), false, z10);
                } else {
                    this.f27998o0 = 3;
                    Float w10 = ec.D().w(r10);
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
        fj fjVar;
        int i7;
        int i10;
        TLRPC.Document document = this.Y;
        if (document != null && (fjVar = this.X) != null) {
            vm0 vm0Var = this.f27985a0;
            if (!vm0Var.f40710e) {
                vm0Var.h(fjVar.f23925b0);
            }
            if (MediaController.B().I(fjVar)) {
                i7 = fjVar.f23957i0;
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
            String str = this.f27989e0;
            TextPaint textPaint = this.f27986b0;
            if (str == null || !str.equals(g02)) {
                this.f27989e0 = g02;
                textPaint.setTextSize(g0.L(16.0f));
                this.f27988d0 = new StaticLayout(g02, textPaint, (int) Math.ceil(textPaint.measureText(g02)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            ev evVar = this.f28349a;
            if (evVar.E()) {
                i10 = org.telegram.ui.ActionBar.n6.Wc;
            } else {
                i10 = org.telegram.ui.ActionBar.n6.Vc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(i10, evVar.D));
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
