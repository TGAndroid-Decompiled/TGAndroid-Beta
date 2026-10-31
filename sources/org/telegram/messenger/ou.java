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
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.x41;
public final class ou extends qu implements z5, us {
    public final jj W;
    public final TLRPC.Document X;
    public final RadialProgress2 Y;
    public final kn0 Z;
    public final TextPaint f17330a0;
    public StaticLayout f17331b0;
    public StaticLayout f17332c0;
    public String f17333d0;
    public final int f17334e0;
    public final int f17335f0;
    public final int f17336g0;
    public int f17337h0;
    public int f17338i0;
    public int f17339j0;
    public int f17340k0;
    public int f17341l0;
    public boolean m0;
    public final int f17342n0;

    public ou(vv vvVar, Rect rect, int i10, TL_iv.pageBlockAudio pageblockaudio) {
        super(vvVar, rect, i10);
        TLRPC.Document document;
        this.f17330a0 = new TextPaint(1);
        int L = i0.L(16.0f);
        this.f17334e0 = L;
        int L2 = i0.L(9.0f);
        this.f17335f0 = L2;
        int L3 = i0.L(44.0f);
        this.f17336g0 = L3;
        this.f17340k0 = -1;
        jj jjVar = (jj) vvVar.f18995m.get(pageblockaudio);
        this.W = jjVar;
        if (jjVar != null) {
            document = jjVar.F0();
        } else {
            document = null;
        }
        this.X = document;
        this.f17342n0 = b6.q(vvVar.f18986a).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.Y = radialProgress2;
        radialProgress2.setCircleRadius(i0.L(24.0f));
        radialProgress2.r(L, L2, L + L3, L3 + L2);
        kn0 kn0Var = new kn0(null);
        this.Z = kn0Var;
        kn0Var.h = new s1(this, 14);
        i0();
        j0(false);
    }

    @Override
    public final void C(boolean z10) {
        j0(true);
    }

    @Override
    public final int H() {
        Rect rect = this.f17622b;
        return i0.L(62.0f) + rect.top + rect.bottom;
    }

    @Override
    public final int I() {
        return J();
    }

    @Override
    public final void M(String str) {
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
            this.Z.f27846s = this.V;
        }
        j0(false);
        vv vvVar = this.f17621a;
        int i10 = vvVar.f18986a;
        int i11 = vvVar.f18986a;
        zs.f(i10).c(this, zs.f19622h2);
        zs.f(i11).c(this, zs.f19610f2);
        zs.f(i11).c(this, zs.f19616g2);
        zs.f(i11).c(this, zs.f19604e2);
    }

    @Override
    public final void U() {
        vv vvVar = this.f17621a;
        b6.q(vvVar.f18986a).v(this);
        int i10 = vvVar.f18986a;
        zs.f(i10).n(this, zs.f19622h2);
        zs.f(i10).n(this, zs.f19610f2);
        zs.f(i10).n(this, zs.f19616g2);
        zs.f(i10).n(this, zs.f19604e2);
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
            int i20 = this.f17340k0;
            int i21 = this.f17623c;
            vv vvVar = this.f17621a;
            if (i20 != i21 + vvVar.S + vvVar.T) {
                i0();
            }
            canvas.save();
            canvas.translate(-vvVar.S, 0.0f);
            if (vvVar.E()) {
                i10 = org.telegram.ui.ActionBar.t6.Bc;
            } else {
                i10 = org.telegram.ui.ActionBar.t6.We;
            }
            if (vvVar.E()) {
                i11 = org.telegram.ui.ActionBar.t6.Cc;
            } else {
                i11 = org.telegram.ui.ActionBar.t6.Xe;
            }
            if (vvVar.E()) {
                i12 = org.telegram.ui.ActionBar.t6.Db;
            } else {
                i12 = org.telegram.ui.ActionBar.t6.f21026id;
            }
            if (vvVar.E()) {
                i13 = org.telegram.ui.ActionBar.t6.Eb;
            } else {
                i13 = org.telegram.ui.ActionBar.t6.f21045jd;
            }
            RadialProgress2 radialProgress2 = this.Y;
            radialProgress2.g(i10, i11, i12, i13);
            if (vvVar.E()) {
                i14 = org.telegram.ui.ActionBar.t6.rc;
            } else {
                i14 = org.telegram.ui.ActionBar.t6.f21159pe;
            }
            radialProgress2.d = org.telegram.ui.ActionBar.t6.w0(i14, vvVar.D);
            radialProgress2.draw(canvas);
            if (vvVar.E()) {
                i15 = org.telegram.ui.ActionBar.t6.f21064kc;
            } else {
                i15 = org.telegram.ui.ActionBar.t6.f21027ie;
            }
            int w02 = org.telegram.ui.ActionBar.t6.w0(i15, vvVar.D);
            if (vvVar.E()) {
                i16 = org.telegram.ui.ActionBar.t6.f21082lc;
            } else {
                i16 = org.telegram.ui.ActionBar.t6.f21046je;
            }
            int w03 = org.telegram.ui.ActionBar.t6.w0(i16, vvVar.D);
            if (vvVar.E()) {
                i17 = org.telegram.ui.ActionBar.t6.f21121nc;
            } else {
                i17 = org.telegram.ui.ActionBar.t6.f21084le;
            }
            int w04 = org.telegram.ui.ActionBar.t6.w0(i17, vvVar.D);
            if (vvVar.E()) {
                i18 = org.telegram.ui.ActionBar.t6.f21121nc;
            } else {
                i18 = org.telegram.ui.ActionBar.t6.f21084le;
            }
            int w05 = org.telegram.ui.ActionBar.t6.w0(i18, vvVar.D);
            if (vvVar.E()) {
                i19 = org.telegram.ui.ActionBar.t6.f21101mc;
            } else {
                i19 = org.telegram.ui.ActionBar.t6.f21066ke;
            }
            int w06 = org.telegram.ui.ActionBar.t6.w0(i19, vvVar.D);
            kn0 kn0Var = this.Z;
            kn0Var.g(w02, w03, w04, w05, w06);
            canvas.save();
            canvas.translate(this.f17337h0, this.f17338i0);
            kn0Var.b(canvas);
            canvas.restore();
            StaticLayout staticLayout = this.f17332c0;
            int i22 = this.f17334e0;
            if (staticLayout != null) {
                canvas.save();
                canvas.translate(i0.L(54.0f) + i22, i0.L(6.0f) + this.f17338i0);
                this.f17332c0.draw(canvas);
                canvas.restore();
            }
            if (this.f17331b0 != null) {
                canvas.save();
                canvas.translate(i0.L(54.0f) + i22, this.f17338i0 - i0.L(16.0f));
                this.f17331b0.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    @Override
    public final boolean X(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        vv vvVar = this.f17621a;
        float f7 = x10 + vvVar.S;
        float y3 = motionEvent.getY();
        if (this.Z.e(f7 - this.f17337h0, y3 - this.f17338i0, actionMasked)) {
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
            if (this.f17341l0 != -1) {
                int i10 = this.f17334e0;
                if (f7 >= i10 && f7 <= i0.L(48.0f) + i10) {
                    int i11 = this.f17335f0;
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
                    int i12 = vvVar.f18986a;
                    int i13 = this.f17341l0;
                    RadialProgress2 radialProgress2 = this.Y;
                    if (i13 == 0) {
                        if (MediaController.B().o0(vvVar.f18994l, this.W, 0L, false, null)) {
                            this.f17341l0 = 1;
                            radialProgress2.setIcon(h0(), false, true);
                            View view4 = this.V;
                            if (view4 != null) {
                                view4.invalidate();
                            }
                        }
                    } else if (i13 == 1) {
                        if (MediaController.B().R(this.W, true)) {
                            this.f17341l0 = 0;
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
                            b8.G(i12).X(document, vvVar.f18987b, 1, 1);
                            this.f17341l0 = 3;
                            radialProgress2.setIcon(h0(), true, true);
                            View view6 = this.V;
                            if (view6 != null) {
                                view6.invalidate();
                            }
                        } else if (i13 == 3) {
                            b8.G(i12).f(document);
                            this.f17341l0 = 2;
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
        jj jjVar;
        jj jjVar2 = this.W;
        if (jjVar2 != null) {
            if (i10 == zs.f19622h2) {
                j0(true);
            } else if (i10 != zs.f19610f2 && i10 != zs.f19616g2) {
                if (i10 == zs.f19604e2 && jjVar2.f1() == ((Integer) objArr[0]).intValue() && (jjVar = MediaController.B().f14482u0) != null) {
                    jjVar2.f16299b0 = jjVar.f16299b0;
                    jjVar2.f16322g0 = jjVar.f16322g0;
                    jjVar2.f16326h0 = jjVar.f16326h0;
                    k0();
                }
            } else {
                j0(true);
            }
        }
    }

    @Override
    public final int getObserverTag() {
        return this.f17342n0;
    }

    public final int h0() {
        int i10 = this.f17341l0;
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
        if (this.f17341l0 != 3) {
            j0(true);
        }
    }

    public final void i0() {
        String str;
        String str2;
        SpannableStringBuilder spannableStringBuilder;
        vv vvVar = this.f17621a;
        this.f17340k0 = this.f17623c + vvVar.S + vvVar.T;
        int L = i0.L(50.0f) + this.f17334e0;
        int i10 = this.f17336g0;
        int i11 = L + i10;
        this.f17337h0 = i11;
        this.f17339j0 = i0.a.d(18.0f, this.f17340k0 - i11, 0);
        jj jjVar = this.W;
        if (jjVar != null) {
            str = jjVar.x1(false);
        } else {
            str = null;
        }
        if (jjVar != null) {
            str2 = jjVar.z1(false);
        } else {
            str2 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str2);
        int i12 = this.f17335f0;
        if (isEmpty && TextUtils.isEmpty(str)) {
            this.f17331b0 = null;
            this.f17338i0 = ((i10 - i0.L(30.0f)) / 2) + i12;
        } else {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                spannableStringBuilder = new SpannableStringBuilder(a1.g.C(str, " - ", str2));
            } else if (!TextUtils.isEmpty(str2)) {
                spannableStringBuilder = new SpannableStringBuilder(str2);
            } else {
                spannableStringBuilder = new SpannableStringBuilder(str);
            }
            if (!TextUtils.isEmpty(str)) {
                spannableStringBuilder.setSpan(new x41(i0.o()), 0, str.length(), 18);
            }
            this.f17330a0.setTextSize(i0.L(16.0f));
            int L2 = i0.L(50.0f) + this.f17339j0;
            this.f17331b0 = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.t6.O2, L2, TextUtils.TruncateAt.END), this.f17330a0, L2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f17338i0 = i0.L(11.0f) + ((i10 - i0.L(30.0f)) / 2) + i12;
        }
        this.Z.i(this.f17339j0, i0.L(30.0f));
    }

    public final void j0(boolean z10) {
        File K;
        boolean z11;
        int i10 = this.f17621a.f18986a;
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
        jj jjVar = this.W;
        if (z11) {
            b6.q(i10).v(this);
            if (MediaController.B().I(jjVar) && !MediaController.B().H()) {
                this.f17341l0 = 1;
            } else {
                this.f17341l0 = 0;
            }
            radialProgress2.setIcon(h0(), false, z10);
        } else {
            b6.q(i10).a(r10, null, this);
            if (tz.B0 && jjVar != null && jjVar.I3() && !jj.Q5(jjVar.f16337k) && !o5.C(jj.B0(jjVar.f16337k))) {
                if (!MediaController.B().I(jjVar) || MediaController.B().H()) {
                    i11 = 0;
                }
                this.f17341l0 = i11;
                radialProgress2.setIcon(h0(), false, z10);
            } else {
                float f7 = 0.0f;
                if (!b8.G(i10).T(r10)) {
                    this.f17341l0 = 2;
                    radialProgress2.p(z10, 0.0f);
                    radialProgress2.setIcon(h0(), false, z10);
                } else {
                    this.f17341l0 = 3;
                    Float w9 = hc.D().w(r10);
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
        jj jjVar;
        int i10;
        int i11;
        TLRPC.Document document = this.X;
        if (document != null && (jjVar = this.W) != null) {
            kn0 kn0Var = this.Z;
            if (!kn0Var.e) {
                kn0Var.h(jjVar.f16299b0);
            }
            if (MediaController.B().I(jjVar)) {
                i10 = jjVar.f16322g0;
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
            String str = this.f17333d0;
            TextPaint textPaint = this.f17330a0;
            if (str == null || !str.equals(g02)) {
                this.f17333d0 = g02;
                textPaint.setTextSize(i0.L(16.0f));
                this.f17332c0 = new StaticLayout(g02, textPaint, (int) Math.ceil(textPaint.measureText(g02)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            vv vvVar = this.f17621a;
            if (vvVar.E()) {
                i11 = org.telegram.ui.ActionBar.t6.Tc;
            } else {
                i11 = org.telegram.ui.ActionBar.t6.Sc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(i11, vvVar.D));
            View view = this.V;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    @Override
    public final void n(long j10, long j11) {
    }
}
