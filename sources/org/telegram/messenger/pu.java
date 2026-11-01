package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
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
import org.telegram.ui.Components.ln0;
import org.telegram.ui.Components.y41;
public final class pu extends ru implements z5, vs {
    public final kj W;
    public final TLRPC.Document X;
    public final RadialProgress2 Y;
    public final ln0 Z;
    public final TextPaint f17663a0;
    public StaticLayout f17664b0;
    public StaticLayout f17665c0;
    public String f17666d0;
    public final int f17667e0;
    public final int f17668f0;
    public final int f17669g0;
    public int f17670h0;
    public int f17671i0;
    public int f17672j0;
    public int f17673k0;
    public int f17674l0;
    public boolean m0;
    public final int f17675n0;

    public pu(wv wvVar, Rect rect, int i10, TL_iv.pageBlockAudio pageblockaudio) {
        super(wvVar, rect, i10);
        TLRPC.Document document;
        this.f17663a0 = new TextPaint(1);
        int L = i0.L(16.0f);
        this.f17667e0 = L;
        int L2 = i0.L(9.0f);
        this.f17668f0 = L2;
        int L3 = i0.L(44.0f);
        this.f17669g0 = L3;
        this.f17673k0 = -1;
        kj kjVar = (kj) wvVar.f19338m.get(pageblockaudio);
        this.W = kjVar;
        if (kjVar != null) {
            document = kjVar.F0();
        } else {
            document = null;
        }
        this.X = document;
        this.f17675n0 = b6.q(wvVar.f19329a).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.Y = radialProgress2;
        radialProgress2.setCircleRadius(i0.L(24.0f));
        radialProgress2.r(L, L2, L + L3, L3 + L2);
        ln0 ln0Var = new ln0(null);
        this.Z = ln0Var;
        ln0Var.h = new s1(this, 14);
        i0();
        j0(false);
    }

    @Override
    public final void D(boolean z10) {
        j0(true);
    }

    @Override
    public final int H() {
        Rect rect = this.f17968b;
        return i0.L(62.0f) + rect.top + rect.bottom;
    }

    @Override
    public final int I() {
        return J();
    }

    @Override
    public final void N(String str) {
        this.Y.p(true, 1.0f);
        j0(true);
    }

    @Override
    public final boolean P() {
        return this.Z.e;
    }

    @Override
    public final void S() {
        View view = this.V;
        if (view != null) {
            this.Y.n(view);
            this.Z.f28225s = this.V;
        }
        j0(false);
        wv wvVar = this.f17967a;
        int i10 = wvVar.f19329a;
        int i11 = wvVar.f19329a;
        at.f(i10).c(this, at.f14718h2);
        at.f(i11).c(this, at.f14706f2);
        at.f(i11).c(this, at.f14712g2);
        at.f(i11).c(this, at.f14700e2);
    }

    @Override
    public final void U() {
        wv wvVar = this.f17967a;
        b6.q(wvVar.f19329a).v(this);
        int i10 = wvVar.f19329a;
        at.f(i10).n(this, at.f14718h2);
        at.f(i10).n(this, at.f14706f2);
        at.f(i10).n(this, at.f14712g2);
        at.f(i10).n(this, at.f14700e2);
    }

    @Override
    public final void V(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        if (this.W != null && this.X != null) {
            int i20 = this.f17673k0;
            int i21 = this.f17969c;
            wv wvVar = this.f17967a;
            if (i20 != i21 + wvVar.S + wvVar.T) {
                i0();
            }
            canvas.save();
            canvas.translate(-wvVar.S, 0.0f);
            if (wvVar.E()) {
                i10 = org.telegram.ui.ActionBar.t6.Bc;
            } else {
                i10 = org.telegram.ui.ActionBar.t6.We;
            }
            if (wvVar.E()) {
                i11 = org.telegram.ui.ActionBar.t6.Cc;
            } else {
                i11 = org.telegram.ui.ActionBar.t6.Xe;
            }
            if (wvVar.E()) {
                i12 = org.telegram.ui.ActionBar.t6.Db;
            } else {
                i12 = org.telegram.ui.ActionBar.t6.f21027id;
            }
            if (wvVar.E()) {
                i13 = org.telegram.ui.ActionBar.t6.Eb;
            } else {
                i13 = org.telegram.ui.ActionBar.t6.f21046jd;
            }
            RadialProgress2 radialProgress2 = this.Y;
            radialProgress2.g(i10, i11, i12, i13);
            if (wvVar.E()) {
                i14 = org.telegram.ui.ActionBar.t6.rc;
            } else {
                i14 = org.telegram.ui.ActionBar.t6.f21160pe;
            }
            radialProgress2.d = org.telegram.ui.ActionBar.t6.w0(i14, wvVar.D);
            radialProgress2.draw(canvas);
            if (wvVar.E()) {
                i15 = org.telegram.ui.ActionBar.t6.f21065kc;
            } else {
                i15 = org.telegram.ui.ActionBar.t6.f21028ie;
            }
            int w02 = org.telegram.ui.ActionBar.t6.w0(i15, wvVar.D);
            if (wvVar.E()) {
                i16 = org.telegram.ui.ActionBar.t6.f21083lc;
            } else {
                i16 = org.telegram.ui.ActionBar.t6.f21047je;
            }
            int w03 = org.telegram.ui.ActionBar.t6.w0(i16, wvVar.D);
            if (wvVar.E()) {
                i17 = org.telegram.ui.ActionBar.t6.f21122nc;
            } else {
                i17 = org.telegram.ui.ActionBar.t6.f21085le;
            }
            int w04 = org.telegram.ui.ActionBar.t6.w0(i17, wvVar.D);
            if (wvVar.E()) {
                i18 = org.telegram.ui.ActionBar.t6.f21122nc;
            } else {
                i18 = org.telegram.ui.ActionBar.t6.f21085le;
            }
            int w05 = org.telegram.ui.ActionBar.t6.w0(i18, wvVar.D);
            if (wvVar.E()) {
                i19 = org.telegram.ui.ActionBar.t6.f21102mc;
            } else {
                i19 = org.telegram.ui.ActionBar.t6.f21067ke;
            }
            int w06 = org.telegram.ui.ActionBar.t6.w0(i19, wvVar.D);
            ln0 ln0Var = this.Z;
            ln0Var.g(w02, w03, w04, w05, w06);
            canvas.save();
            canvas.translate(this.f17670h0, this.f17671i0);
            ln0Var.b(canvas);
            canvas.restore();
            StaticLayout staticLayout = this.f17665c0;
            int i22 = this.f17667e0;
            if (staticLayout != null) {
                canvas.save();
                canvas.translate(i0.L(54.0f) + i22, i0.L(6.0f) + this.f17671i0);
                this.f17665c0.draw(canvas);
                canvas.restore();
            }
            if (this.f17664b0 != null) {
                canvas.save();
                canvas.translate(i0.L(54.0f) + i22, this.f17671i0 - i0.L(16.0f));
                this.f17664b0.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    @Override
    public final boolean X(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        wv wvVar = this.f17967a;
        float f7 = x10 + wvVar.S;
        float y3 = motionEvent.getY();
        if (this.Z.e(f7 - this.f17670h0, y3 - this.f17671i0, actionMasked)) {
            if (actionMasked == 0) {
                Z(true);
            }
            if (actionMasked == 1 || actionMasked == 3) {
                Z(false);
            }
            View view = this.V;
            if (view != null) {
                view.invalidate();
                return true;
            }
        } else if (actionMasked == 0) {
            if (this.f17674l0 != -1) {
                int i10 = this.f17667e0;
                if (f7 >= i10 && f7 <= i0.L(48.0f) + i10) {
                    int i11 = this.f17668f0;
                    if (y3 >= i11 && y3 <= i0.L(48.0f) + i11) {
                        this.m0 = true;
                        View view2 = this.V;
                        if (view2 != null) {
                            view2.invalidate();
                            return true;
                        }
                    }
                }
            }
            return this.m0;
        } else {
            if (actionMasked == 1) {
                if (this.m0) {
                    this.m0 = false;
                    View view3 = this.V;
                    if (view3 != null) {
                        view3.playSoundEffect(0);
                    }
                    int i12 = wvVar.f19329a;
                    int i13 = this.f17674l0;
                    RadialProgress2 radialProgress2 = this.Y;
                    if (i13 == 0) {
                        if (MediaController.B().o0(wvVar.f19337l, this.W, 0L, false, null)) {
                            this.f17674l0 = 1;
                            radialProgress2.setIcon(h0(), false, true);
                            View view4 = this.V;
                            if (view4 != null) {
                                view4.invalidate();
                            }
                        }
                    } else if (i13 == 1) {
                        if (MediaController.B().R(this.W, true)) {
                            this.f17674l0 = 0;
                            radialProgress2.setIcon(h0(), false, true);
                            View view5 = this.V;
                            if (view5 != null) {
                                view5.invalidate();
                            }
                        }
                    } else {
                        TLRPC.Document document = this.X;
                        if (i13 == 2) {
                            radialProgress2.p(false, 0.0f);
                            b8.G(i12).X(document, wvVar.f19330b, 1, 1);
                            this.f17674l0 = 3;
                            radialProgress2.setIcon(h0(), true, true);
                            View view6 = this.V;
                            if (view6 != null) {
                                view6.invalidate();
                            }
                        } else if (i13 == 3) {
                            b8.G(i12).f(document);
                            this.f17674l0 = 2;
                            radialProgress2.setIcon(h0(), false, true);
                            View view7 = this.V;
                            if (view7 != null) {
                                view7.invalidate();
                            }
                        }
                    }
                    View view8 = this.V;
                    if (view8 != null) {
                        view8.invalidate();
                    }
                }
            } else if (actionMasked == 3) {
                this.m0 = false;
            }
            return this.m0;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        kj kjVar;
        kj kjVar2 = this.W;
        if (kjVar2 != null) {
            if (i10 == at.f14718h2) {
                j0(true);
            } else if (i10 != at.f14706f2 && i10 != at.f14712g2) {
                if (i10 == at.f14700e2 && kjVar2.f1() == ((Integer) objArr[0]).intValue() && (kjVar = MediaController.B().f14483u0) != null) {
                    kjVar2.f16652b0 = kjVar.f16652b0;
                    kjVar2.f16675g0 = kjVar.f16675g0;
                    kjVar2.f16679h0 = kjVar.f16679h0;
                    k0();
                }
            } else {
                j0(true);
            }
        }
    }

    @Override
    public final int getObserverTag() {
        return this.f17675n0;
    }

    public final int h0() {
        int i10 = this.f17674l0;
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        if (i10 == 3) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void i(long j10, long j11) {
        float f7;
        if (j11 <= 0) {
            f7 = 0.0f;
        } else {
            f7 = ((float) j10) / ((float) j11);
        }
        this.Y.p(true, Math.min(1.0f, f7));
        if (this.f17674l0 != 3) {
            j0(true);
        }
    }

    public final void i0() {
        String str;
        String str2;
        SpannableStringBuilder spannableStringBuilder;
        wv wvVar = this.f17967a;
        this.f17673k0 = this.f17969c + wvVar.S + wvVar.T;
        int L = i0.L(50.0f) + this.f17667e0;
        int i10 = this.f17669g0;
        int i11 = L + i10;
        this.f17670h0 = i11;
        this.f17672j0 = i0.a.d(18.0f, this.f17673k0 - i11, 0);
        kj kjVar = this.W;
        if (kjVar != null) {
            str = kjVar.x1(false);
        } else {
            str = null;
        }
        if (kjVar != null) {
            str2 = kjVar.z1(false);
        } else {
            str2 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str2);
        int i12 = this.f17668f0;
        if (isEmpty && TextUtils.isEmpty(str)) {
            this.f17664b0 = null;
            this.f17671i0 = ((i10 - i0.L(30.0f)) / 2) + i12;
        } else {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                spannableStringBuilder = new SpannableStringBuilder(a1.g.C(str, " - ", str2));
            } else if (!TextUtils.isEmpty(str2)) {
                spannableStringBuilder = new SpannableStringBuilder(str2);
            } else {
                spannableStringBuilder = new SpannableStringBuilder(str);
            }
            if (!TextUtils.isEmpty(str)) {
                spannableStringBuilder.setSpan(new y41(i0.o()), 0, str.length(), 18);
            }
            this.f17663a0.setTextSize(i0.L(16.0f));
            int L2 = i0.L(50.0f) + this.f17672j0;
            this.f17664b0 = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.t6.O2, L2, TextUtils.TruncateAt.END), this.f17663a0, L2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f17671i0 = i0.L(11.0f) + ((i10 - i0.L(30.0f)) / 2) + i12;
        }
        this.Z.i(this.f17672j0, i0.L(30.0f));
    }

    public final void j0(boolean z10) {
        File K;
        boolean z11;
        int i10 = this.f17967a.f19329a;
        TLRPC.Document document = this.X;
        String r10 = b8.r(null, document);
        int i11 = 1;
        if (document == null) {
            K = null;
        } else {
            b8.G(i10);
            K = b8.K(document, null, true, true);
        }
        if (K != null && K.exists()) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean isEmpty = TextUtils.isEmpty(r10);
        RadialProgress2 radialProgress2 = this.Y;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        kj kjVar = this.W;
        if (z11) {
            b6.q(i10).v(this);
            if (MediaController.B().I(kjVar) && !MediaController.B().H()) {
                this.f17674l0 = 1;
            } else {
                this.f17674l0 = 0;
            }
            radialProgress2.setIcon(h0(), false, z10);
        } else {
            b6.q(i10).a(r10, null, this);
            if (uz.B0 && kjVar != null && kjVar.I3() && !kj.Q5(kjVar.f16690k) && !o5.C(kj.B0(kjVar.f16690k))) {
                if (!MediaController.B().I(kjVar) || MediaController.B().H()) {
                    i11 = 0;
                }
                this.f17674l0 = i11;
                radialProgress2.setIcon(h0(), false, z10);
            } else {
                float f7 = 0.0f;
                if (!b8.G(i10).T(r10)) {
                    this.f17674l0 = 2;
                    radialProgress2.p(z10, 0.0f);
                    radialProgress2.setIcon(h0(), false, z10);
                } else {
                    this.f17674l0 = 3;
                    Float w9 = ic.D().w(r10);
                    if (w9 != null) {
                        f7 = w9.floatValue();
                    }
                    radialProgress2.p(z10, f7);
                    radialProgress2.setIcon(h0(), true, z10);
                }
            }
        }
        k0();
    }

    public final void k0() {
        kj kjVar;
        int i10;
        int i11;
        TLRPC.Document document = this.X;
        if (document != null && (kjVar = this.W) != null) {
            ln0 ln0Var = this.Z;
            if (!ln0Var.e) {
                ln0Var.h(kjVar.f16652b0);
            }
            if (MediaController.B().I(kjVar)) {
                i10 = kjVar.f16675g0;
            } else {
                int i12 = 0;
                while (true) {
                    if (i12 < document.attributes.size()) {
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i12);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                            i10 = (int) documentAttribute.duration;
                            break;
                        }
                        i12++;
                    } else {
                        i10 = 0;
                        break;
                    }
                }
            }
            String g02 = i0.g0(i10, false, false);
            String str = this.f17666d0;
            TextPaint textPaint = this.f17663a0;
            if (str == null || !str.equals(g02)) {
                this.f17666d0 = g02;
                textPaint.setTextSize(i0.L(16.0f));
                this.f17665c0 = new StaticLayout(g02, textPaint, (int) Math.ceil(textPaint.measureText(g02)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            wv wvVar = this.f17967a;
            if (wvVar.E()) {
                i11 = org.telegram.ui.ActionBar.t6.Tc;
            } else {
                i11 = org.telegram.ui.ActionBar.t6.Sc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(i11, wvVar.D));
            View view = this.V;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    @Override
    public final void o(long j10, long j11) {
    }
}
