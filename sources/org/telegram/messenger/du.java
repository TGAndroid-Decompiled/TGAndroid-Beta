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
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.t31;
public final class du extends fu implements x5, ls {
    public final ij W;
    public final TLRPC.Document X;
    public final RadialProgress2 Y;
    public final jm0 Z;
    public final TextPaint f22078a0;
    public StaticLayout f22079b0;
    public StaticLayout f22080c0;
    public String f22081d0;
    public final int f22082e0;
    public final int f22083f0;
    public final int f22084g0;
    public int f22085h0;
    public int f22086i0;
    public int f22087j0;
    public int f22088k0;
    public boolean f22089l0;
    public final RectF m0;
    public int f22090n0;
    public boolean f22091o0;
    public boolean f22092p0;
    public final int f22093q0;

    public du(kv kvVar, Rect rect, int i7, TL_iv.pageBlockAudio pageblockaudio) {
        super(kvVar, rect, i7);
        TLRPC.Document document;
        this.f22078a0 = new TextPaint(1);
        int L = g0.L(16.0f);
        this.f22082e0 = L;
        int L2 = g0.L(9.0f);
        this.f22083f0 = L2;
        int L3 = g0.L(44.0f);
        this.f22084g0 = L3;
        this.f22088k0 = -1;
        this.m0 = new RectF();
        ij ijVar = (ij) kvVar.f23766m.get(pageblockaudio);
        this.W = ijVar;
        if (ijVar != null) {
            document = ijVar.F0();
        } else {
            document = null;
        }
        this.X = document;
        this.f22093q0 = z5.q(kvVar.f23756a).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.Y = radialProgress2;
        radialProgress2.setCircleRadius(g0.L(24.0f));
        radialProgress2.r(L, L2, L + L3, L3 + L2);
        jm0 jm0Var = new jm0(null);
        this.Z = jm0Var;
        jm0Var.h = new p1(this, 15);
        k0();
        l0(false);
    }

    @Override
    public final void C(boolean z9) {
        l0(true);
    }

    @Override
    public final int I() {
        Rect rect = this.f22444b;
        return g0.L(62.0f) + rect.top + rect.bottom;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final void M(String str) {
        this.Y.p(true, 1.0f);
        l0(true);
    }

    @Override
    public final boolean Q() {
        return this.Z.f34976e;
    }

    @Override
    public final void T() {
        View view = this.V;
        if (view != null) {
            this.Y.n(view);
            this.Z.f34989s = this.V;
        }
        l0(false);
        kv kvVar = this.f22443a;
        int i7 = kvVar.f23756a;
        int i10 = kvVar.f23756a;
        qs.f(i7).c(this, qs.f24993h2);
        qs.f(i10).c(this, qs.f24981f2);
        qs.f(i10).c(this, qs.f24987g2);
        qs.f(i10).c(this, qs.f24975e2);
    }

    @Override
    public final void V() {
        kv kvVar = this.f22443a;
        z5.q(kvVar.f23756a).v(this);
        int i7 = kvVar.f23756a;
        qs.f(i7).n(this, qs.f24993h2);
        qs.f(i7).n(this, qs.f24981f2);
        qs.f(i7).n(this, qs.f24987g2);
        qs.f(i7).n(this, qs.f24975e2);
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
        if (this.W != null && this.X != null) {
            int i19 = this.f22088k0;
            int i20 = this.f22445c;
            kv kvVar = this.f22443a;
            if (i19 != i20 + kvVar.S + kvVar.T || this.f22089l0 != i0()) {
                k0();
            }
            canvas.save();
            canvas.translate(-kvVar.S, 0.0f);
            if (kvVar.E()) {
                i7 = org.telegram.ui.ActionBar.k6.Bc;
            } else {
                i7 = org.telegram.ui.ActionBar.k6.We;
            }
            if (kvVar.E()) {
                i10 = org.telegram.ui.ActionBar.k6.Cc;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.Xe;
            }
            if (kvVar.E()) {
                i11 = org.telegram.ui.ActionBar.k6.Db;
            } else {
                i11 = org.telegram.ui.ActionBar.k6.f27946id;
            }
            if (kvVar.E()) {
                i12 = org.telegram.ui.ActionBar.k6.Eb;
            } else {
                i12 = org.telegram.ui.ActionBar.k6.f27964jd;
            }
            RadialProgress2 radialProgress2 = this.Y;
            radialProgress2.g(i7, i10, i11, i12);
            if (kvVar.E()) {
                i13 = org.telegram.ui.ActionBar.k6.f28113rc;
            } else {
                i13 = org.telegram.ui.ActionBar.k6.f28076pe;
            }
            radialProgress2.d = org.telegram.ui.ActionBar.k6.w0(i13, kvVar.D);
            radialProgress2.draw(canvas);
            if (kvVar.E()) {
                i14 = org.telegram.ui.ActionBar.k6.f27982kc;
            } else {
                i14 = org.telegram.ui.ActionBar.k6.f27947ie;
            }
            int w02 = org.telegram.ui.ActionBar.k6.w0(i14, kvVar.D);
            if (kvVar.E()) {
                i15 = org.telegram.ui.ActionBar.k6.f28001lc;
            } else {
                i15 = org.telegram.ui.ActionBar.k6.f27965je;
            }
            int w03 = org.telegram.ui.ActionBar.k6.w0(i15, kvVar.D);
            if (kvVar.E()) {
                i16 = org.telegram.ui.ActionBar.k6.f28036nc;
            } else {
                i16 = org.telegram.ui.ActionBar.k6.le;
            }
            int w04 = org.telegram.ui.ActionBar.k6.w0(i16, kvVar.D);
            if (kvVar.E()) {
                i17 = org.telegram.ui.ActionBar.k6.f28036nc;
            } else {
                i17 = org.telegram.ui.ActionBar.k6.le;
            }
            int w05 = org.telegram.ui.ActionBar.k6.w0(i17, kvVar.D);
            if (kvVar.E()) {
                i18 = org.telegram.ui.ActionBar.k6.f28017mc;
            } else {
                i18 = org.telegram.ui.ActionBar.k6.f27984ke;
            }
            int w06 = org.telegram.ui.ActionBar.k6.w0(i18, kvVar.D);
            jm0 jm0Var = this.Z;
            jm0Var.g(w02, w03, w04, w05, w06);
            canvas.save();
            canvas.translate(this.f22085h0, this.f22086i0);
            jm0Var.b(canvas);
            canvas.restore();
            StaticLayout staticLayout = this.f22080c0;
            int i21 = this.f22082e0;
            if (staticLayout != null) {
                canvas.save();
                canvas.translate(g0.L(54.0f) + i21, g0.L(6.0f) + this.f22086i0);
                this.f22080c0.draw(canvas);
                canvas.restore();
            }
            if (this.f22079b0 != null) {
                canvas.save();
                canvas.translate(g0.L(54.0f) + i21, this.f22086i0 - g0.L(16.0f));
                this.f22079b0.draw(canvas);
                canvas.restore();
            }
            boolean z9 = this.f22089l0;
            RectF rectF = this.m0;
            if (z9) {
                if (kvVar.E()) {
                    org.telegram.ui.ActionBar.f6 f6Var = kvVar.D;
                    if (f6Var != null) {
                        drawable = f6Var.getDrawable("drawableMsgOutMenu");
                    } else {
                        drawable = null;
                    }
                    if (drawable == null) {
                        drawable = org.telegram.ui.ActionBar.k6.R0("drawableMsgOutMenu");
                    }
                } else {
                    drawable = org.telegram.ui.ActionBar.k6.f27828c4;
                }
                int L = (this.f22088k0 + this.f22444b.right) - g0.L(32.0f);
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
        boolean z9;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        kv kvVar = this.f22443a;
        float f10 = x10 + kvVar.S;
        float y10 = motionEvent.getY();
        boolean contains = this.m0.contains(f10, y10);
        if (actionMasked == 0 && contains) {
            this.f22092p0 = true;
            return true;
        }
        boolean z10 = this.f22092p0;
        TLRPC.Document document = this.X;
        if (z10) {
            if (actionMasked == 2 && !contains) {
                this.f22092p0 = false;
                return true;
            } else if (actionMasked == 1 || actionMasked == 3) {
                if (actionMasked == 1 && contains) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.f22092p0 = false;
                if (z9 && i0()) {
                    View view = this.V;
                    if (view != null) {
                        view.playSoundEffect(0);
                    }
                    kvVar.F.K(kvVar.E, document, F());
                    return true;
                }
                return true;
            }
        }
        if (this.Z.e(f10 - this.f22085h0, y10 - this.f22086i0, actionMasked)) {
            if (actionMasked == 0) {
                a0(true);
            }
            if (actionMasked == 1 || actionMasked == 3) {
                a0(false);
            }
            View view2 = this.V;
            if (view2 != null) {
                view2.invalidate();
                return true;
            }
        } else if (actionMasked == 0) {
            if (this.f22090n0 != -1) {
                if (f10 >= this.f22082e0 && f10 <= g0.L(48.0f) + i7) {
                    if (y10 >= this.f22083f0 && y10 <= g0.L(48.0f) + i10) {
                        this.f22091o0 = true;
                        View view3 = this.V;
                        if (view3 != null) {
                            view3.invalidate();
                            return true;
                        }
                    }
                }
            }
            return this.f22091o0;
        } else {
            if (actionMasked == 1) {
                if (this.f22091o0) {
                    this.f22091o0 = false;
                    View view4 = this.V;
                    if (view4 != null) {
                        view4.playSoundEffect(0);
                    }
                    int i11 = kvVar.f23756a;
                    int i12 = this.f22090n0;
                    RadialProgress2 radialProgress2 = this.Y;
                    if (i12 == 0) {
                        if (MediaController.B().o0(kvVar.f23765l, this.W, 0L, false, null, 0L)) {
                            this.f22090n0 = 1;
                            radialProgress2.setIcon(j0(), false, true);
                            View view5 = this.V;
                            if (view5 != null) {
                                view5.invalidate();
                            }
                        }
                    } else if (i12 == 1) {
                        if (MediaController.B().R(this.W, true)) {
                            this.f22090n0 = 0;
                            radialProgress2.setIcon(j0(), false, true);
                            View view6 = this.V;
                            if (view6 != null) {
                                view6.invalidate();
                            }
                        }
                    } else if (i12 == 2) {
                        radialProgress2.p(false, 0.0f);
                        w7.G(i11).X(document, kvVar.f23757b, 1, 1);
                        this.f22090n0 = 3;
                        radialProgress2.setIcon(j0(), true, true);
                        View view7 = this.V;
                        if (view7 != null) {
                            view7.invalidate();
                        }
                    } else if (i12 == 3) {
                        w7.G(i11).f(document);
                        this.f22090n0 = 2;
                        radialProgress2.setIcon(j0(), false, true);
                        View view8 = this.V;
                        if (view8 != null) {
                            view8.invalidate();
                        }
                    }
                    View view9 = this.V;
                    if (view9 != null) {
                        view9.invalidate();
                    }
                }
            } else if (actionMasked == 3) {
                this.f22091o0 = false;
            }
            return this.f22091o0;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ij ijVar;
        ij ijVar2 = this.W;
        if (ijVar2 != null) {
            if (i7 == qs.f24993h2) {
                l0(true);
            } else if (i7 != qs.f24981f2 && i7 != qs.f24987g2) {
                if (i7 == qs.f24975e2 && ijVar2.f1() == ((Integer) objArr[0]).intValue() && (ijVar = MediaController.B().f21292u0) != null) {
                    ijVar2.f23197b0 = ijVar.f23197b0;
                    ijVar2.f23220g0 = ijVar.f23220g0;
                    ijVar2.f23224h0 = ijVar.f23224h0;
                    m0();
                }
            } else {
                l0(true);
            }
        }
    }

    @Override
    public final int getObserverTag() {
        return this.f22093q0;
    }

    @Override
    public final void i(long j3, long j10) {
        float f10;
        if (j10 <= 0) {
            f10 = 0.0f;
        } else {
            f10 = ((float) j3) / ((float) j10);
        }
        this.Y.p(true, Math.min(1.0f, f10));
        if (this.f22090n0 != 3) {
            l0(true);
        }
    }

    public final boolean i0() {
        kv kvVar;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Cells.l1 l1Var;
        if (this.X != null && (q1Var = (kvVar = this.f22443a).E) != null && (l1Var = kvVar.F) != null && l1Var.a0(q1Var)) {
            return true;
        }
        return false;
    }

    public final int j0() {
        int i7 = this.f22090n0;
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
        kv kvVar = this.f22443a;
        this.f22088k0 = this.f22445c + kvVar.S + kvVar.T;
        this.f22089l0 = i0();
        int L = g0.L(50.0f) + this.f22082e0;
        int i7 = this.f22084g0;
        int i10 = L + i7;
        this.f22085h0 = i10;
        int i11 = this.f22088k0 - i10;
        if (this.f22089l0) {
            f10 = 42.0f;
        } else {
            f10 = 18.0f;
        }
        this.f22087j0 = jg.g.e(f10, i11, 0);
        ij ijVar = this.W;
        if (ijVar != null) {
            str = ijVar.x1(false);
        } else {
            str = null;
        }
        if (ijVar != null) {
            str2 = ijVar.z1(false);
        } else {
            str2 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str2);
        int i12 = this.f22083f0;
        if (isEmpty && TextUtils.isEmpty(str)) {
            this.f22079b0 = null;
            this.f22086i0 = ((i7 - g0.L(30.0f)) / 2) + i12;
        } else {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                spannableStringBuilder = new SpannableStringBuilder(a8.p0.D(str, " - ", str2));
            } else if (!TextUtils.isEmpty(str2)) {
                spannableStringBuilder = new SpannableStringBuilder(str2);
            } else {
                spannableStringBuilder = new SpannableStringBuilder(str);
            }
            if (!TextUtils.isEmpty(str)) {
                spannableStringBuilder.setSpan(new t31(g0.o()), 0, str.length(), 18);
            }
            this.f22078a0.setTextSize(g0.L(16.0f));
            int L2 = g0.L(50.0f) + this.f22087j0;
            this.f22079b0 = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.k6.O2, L2, TextUtils.TruncateAt.END), this.f22078a0, L2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f22086i0 = g0.L(11.0f) + ((i7 - g0.L(30.0f)) / 2) + i12;
        }
        this.Z.i(this.f22087j0, g0.L(30.0f));
    }

    public final void l0(boolean z9) {
        File K;
        boolean z10;
        int i7 = this.f22443a.f23756a;
        TLRPC.Document document = this.X;
        String r10 = w7.r(null, document);
        int i10 = 1;
        if (document == null) {
            K = null;
        } else {
            w7.G(i7);
            K = w7.K(document, null, true, true);
        }
        if (K != null && K.exists()) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean isEmpty = TextUtils.isEmpty(r10);
        RadialProgress2 radialProgress2 = this.Y;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        ij ijVar = this.W;
        if (z10) {
            z5.q(i7).v(this);
            if (MediaController.B().I(ijVar) && !MediaController.B().H()) {
                this.f22090n0 = 1;
            } else {
                this.f22090n0 = 0;
            }
            radialProgress2.setIcon(j0(), false, z9);
        } else {
            z5.q(i7).a(r10, null, this);
            if (iz.B0 && ijVar != null && ijVar.J3() && !ij.S5(ijVar.f23237k) && !m5.C(ij.B0(ijVar.f23237k))) {
                if (!MediaController.B().I(ijVar) || MediaController.B().H()) {
                    i10 = 0;
                }
                this.f22090n0 = i10;
                radialProgress2.setIcon(j0(), false, z9);
            } else {
                float f10 = 0.0f;
                if (!w7.G(i7).T(r10)) {
                    this.f22090n0 = 2;
                    radialProgress2.p(z9, 0.0f);
                    radialProgress2.setIcon(j0(), false, z9);
                } else {
                    this.f22090n0 = 3;
                    Float w10 = gc.D().w(r10);
                    if (w10 != null) {
                        f10 = w10.floatValue();
                    }
                    radialProgress2.p(z9, f10);
                    radialProgress2.setIcon(j0(), true, z9);
                }
            }
        }
        m0();
    }

    public final void m0() {
        ij ijVar;
        int i7;
        int i10;
        TLRPC.Document document = this.X;
        if (document != null && (ijVar = this.W) != null) {
            jm0 jm0Var = this.Z;
            if (!jm0Var.f34976e) {
                jm0Var.h(ijVar.f23197b0);
            }
            if (MediaController.B().I(ijVar)) {
                i7 = ijVar.f23220g0;
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
            String str = this.f22081d0;
            TextPaint textPaint = this.f22078a0;
            if (str == null || !str.equals(g02)) {
                this.f22081d0 = g02;
                textPaint.setTextSize(g0.L(16.0f));
                this.f22080c0 = new StaticLayout(g02, textPaint, (int) Math.ceil(textPaint.measureText(g02)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            kv kvVar = this.f22443a;
            if (kvVar.E()) {
                i10 = org.telegram.ui.ActionBar.k6.Tc;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.Sc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(i10, kvVar.D));
            View view = this.V;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
