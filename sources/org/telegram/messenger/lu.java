package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;
public final class lu extends cu implements x5 {
    public final TLRPC.Document X;
    public final RadialProgress2 Y;
    public final ImageReceiver Z;
    public final Paint f24877a0;
    public final TextPaint f24878b0;
    public final TextPaint f24879c0;
    public StaticLayout f24880d0;
    public StaticLayout f24881e0;
    public final int f24882f0;
    public final int f24883g0;
    public final int f24884h0;
    public final int f24885i0;
    public final RectF f24886j0;
    public final boolean f24887k0;
    public int f24888l0;
    public boolean m0;
    public boolean f24889n0;
    public int f24890o0;
    public final int f24891p0;

    public lu(iv ivVar, Rect rect, int i7, TL_iv.pageBlockDocument pageblockdocument) {
        super(ivVar, rect, i7);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.Z = imageReceiver;
        this.f24877a0 = new Paint(1);
        this.f24878b0 = new TextPaint(1);
        this.f24879c0 = new TextPaint(1);
        int L = g0.L(16.0f);
        this.f24882f0 = L;
        int L2 = g0.L(9.0f);
        int L3 = g0.L(42.0f);
        this.f24884h0 = L3;
        this.f24885i0 = g0.L(14.0f);
        this.f24886j0 = new RectF();
        this.f24890o0 = -1;
        TLRPC.Document s5 = ivVar.s(pageblockdocument.document_id);
        this.X = s5;
        int L4 = g0.L(10.0f) + ivVar.S;
        this.f24883g0 = L4;
        boolean W2 = gj.W2(s5);
        this.f24887k0 = W2;
        this.f24891p0 = z5.q(ivVar.f24440a).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.Y = radialProgress2;
        radialProgress2.setCircleRadius(L3 / 2);
        L = W2 ? ((g0.L(86.0f) - L3) / 2) + L4 : L;
        L2 = W2 ? g0.L(10.0f) + ((g0.L(86.0f) - L3) / 2) : L2;
        radialProgress2.r(L, L2, L + L3, L3 + L2);
        imageReceiver.J0(g0.L(6.0f));
        imageReceiver.A1 = true;
        if (W2) {
            TLRPC.PhotoSize w10 = w7.w(s5.thumbs, 320, false, null, true);
            imageReceiver.y0(L4, g0.L(10.0f), g0.L(86.0f), g0.L(86.0f));
            imageReceiver.q0(w10 != null ? gc.c(w10, s5) : null, "86_86", fc.m(s5.thumbs), null, ivVar.f24441b, 1);
        }
        k0();
        l0(false);
    }

    @Override
    public final void C(boolean z10) {
        l0(true);
    }

    @Override
    public final int I() {
        float f10;
        Rect rect = this.f22934b;
        int i7 = rect.top;
        if (this.f24887k0) {
            f10 = 106.0f;
        } else {
            f10 = 60.0f;
        }
        return g0.L(f10) + i7 + rect.bottom;
    }

    @Override
    public final int J() {
        int i7;
        int i10;
        boolean z10 = this.f24887k0;
        iv ivVar = this.f22933a;
        if (z10) {
            i10 = g0.L(86.0f) + (this.f24883g0 - ivVar.S);
        } else {
            StaticLayout staticLayout = this.f24881e0;
            if (staticLayout != null && staticLayout.getLineCount() > 0) {
                StaticLayout staticLayout2 = this.f24881e0;
                i7 = (int) Math.ceil(staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1));
            } else {
                i7 = 0;
            }
            i10 = (this.f24882f0 - ivVar.S) + this.f24884h0 + this.f24885i0 + i7;
        }
        Rect rect = this.f22934b;
        return rect.left + i10 + rect.right;
    }

    @Override
    public final int K() {
        String B;
        int i7;
        String str = "";
        TLRPC.Document document = this.X;
        if (document == null) {
            B = "";
        } else {
            B = w7.B(document);
        }
        if (document != null) {
            str = g0.i0(document.size, false, false);
        }
        int ceil = (int) Math.ceil(Math.max(this.f24878b0.measureText(B), this.f24879c0.measureText(str)));
        if (this.f24887k0) {
            i7 = g0.L(107.0f);
        } else {
            i7 = this.f24882f0 + this.f24884h0 + this.f24885i0;
        }
        int min = Math.min(this.f22935c, Math.max(g0.L(220.0f), g0.L(48.0f) + i7 + ceil));
        Rect rect = this.f22934b;
        return rect.left + min + rect.right;
    }

    @Override
    public final void N(String str) {
        this.Y.p(true, 1.0f);
        l0(true);
    }

    @Override
    public final void T() {
        View view = this.W;
        ImageReceiver imageReceiver = this.Z;
        if (view != null) {
            this.Y.n(view);
            imageReceiver.H0(this.W);
        }
        imageReceiver.P();
        l0(false);
    }

    @Override
    public final void V() {
        this.Z.R();
        z5.q(this.f22933a.f24440a).v(this);
    }

    @Override
    public final void W(Canvas canvas) {
        int i7;
        int i10;
        int i11;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Cells.l1 l1Var;
        int i12;
        TLRPC.Document document = this.X;
        if (document == null) {
            return;
        }
        if (this.f24890o0 != i0()) {
            k0();
        }
        canvas.save();
        iv ivVar = this.f22933a;
        canvas.translate(-ivVar.S, 0.0f);
        Drawable drawable = null;
        boolean z10 = this.f24887k0;
        int i13 = this.f24883g0;
        if (z10 && !this.Z.h(canvas, null)) {
            if (ivVar.E()) {
                i12 = org.telegram.ui.ActionBar.j6.f29266zc;
            } else {
                i12 = org.telegram.ui.ActionBar.j6.f29229xe;
            }
            int w02 = org.telegram.ui.ActionBar.j6.w0(i12, ivVar.D);
            Paint paint = this.f24877a0;
            paint.setColor(w02);
            canvas.drawRoundRect(i13, g0.L(10.0f), g0.L(86.0f) + i13, g0.L(96.0f), g0.L(6.0f), g0.L(6.0f), paint);
        }
        this.Y.draw(canvas);
        if (ivVar.E()) {
            i7 = org.telegram.ui.ActionBar.j6.wc;
        } else {
            i7 = org.telegram.ui.ActionBar.j6.f29173ue;
        }
        this.f24878b0.setColor(org.telegram.ui.ActionBar.j6.w0(i7, ivVar.D));
        if (ivVar.E()) {
            i10 = org.telegram.ui.ActionBar.j6.f28964jc;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f28875ee;
        }
        this.f24879c0.setColor(org.telegram.ui.ActionBar.j6.w0(i10, ivVar.D));
        if (z10) {
            i11 = g0.L(97.0f) + i13;
        } else {
            i11 = this.f24882f0 + this.f24884h0 + this.f24885i0;
        }
        int L = g0.L(11.0f);
        int L2 = g0.L(2.0f);
        canvas.save();
        float f10 = i11;
        canvas.translate(f10, L);
        this.f24880d0.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(f10, L2 + this.f24880d0.getHeight() + L);
        this.f24881e0.draw(canvas);
        canvas.restore();
        RectF rectF = this.f24886j0;
        if (document != null && (q1Var = ivVar.E) != null && (l1Var = ivVar.F) != null && l1Var.a0(q1Var)) {
            if (ivVar.E()) {
                org.telegram.ui.ActionBar.e6 e6Var = ivVar.D;
                if (e6Var != null) {
                    drawable = e6Var.getDrawable("drawableMsgOutMenu");
                }
                if (drawable == null) {
                    drawable = org.telegram.ui.ActionBar.j6.R0("drawableMsgOutMenu");
                }
            } else {
                drawable = org.telegram.ui.ActionBar.j6.f28829c4;
            }
            int L3 = (this.f24890o0 + this.f22934b.right) - g0.L(32.0f);
            int L4 = g0.L(7.0f);
            drawable.setBounds(L3, L4, drawable.getIntrinsicWidth() + L3, drawable.getIntrinsicHeight() + L4);
            drawable.draw(canvas);
            rectF.set(L3 - g0.L(8.0f), 0.0f, g0.L(8.0f) + drawable.getIntrinsicWidth() + L3, g0.L(54.0f));
        } else {
            rectF.setEmpty();
        }
        canvas.restore();
    }

    @Override
    public final boolean Y(android.view.MotionEvent r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.lu.Y(android.view.MotionEvent):boolean");
    }

    @Override
    public final int getObserverTag() {
        return this.f24891p0;
    }

    @Override
    public final void i(long j3, long j10) {
        float min;
        if (j10 <= 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j3) / ((float) j10));
        }
        this.Y.p(true, min);
        if (this.f24888l0 != 2) {
            l0(true);
        }
    }

    public final int i0() {
        iv ivVar = this.f22933a;
        int i7 = ivVar.C;
        int i10 = this.f22935c;
        if (i7 > 0) {
            Rect rect = this.f22934b;
            i10 = Math.min(i10, Math.max(0, (i7 - rect.left) - rect.right));
        }
        return i10 + ivVar.S + ivVar.T;
    }

    public final File j0() {
        TLRPC.Document document = this.X;
        if (document == null) {
            return null;
        }
        iv ivVar = this.f22933a;
        w7.G(ivVar.f24440a);
        File J = w7.J(document, null, false, true);
        if (J != null && J.exists()) {
            return J;
        }
        w7.G(ivVar.f24440a);
        return w7.J(document, null, true, true);
    }

    public final void k0() {
        int i7;
        int i10;
        String B;
        this.f24890o0 = i0();
        if (this.f24887k0) {
            i7 = g0.L(97.0f);
            i10 = this.f24883g0;
        } else {
            i7 = this.f24882f0 + this.f24884h0;
            i10 = this.f24885i0;
        }
        int i11 = i7 + i10;
        int d = i5.c.d(48.0f, this.f24890o0 - i11, g0.L(40.0f));
        iv ivVar = this.f22933a;
        TextPaint textPaint = this.f24878b0;
        textPaint.setTextSize(g0.L(ivVar.M - 1));
        textPaint.setTypeface(g0.o());
        this.f24879c0.setTextSize(g0.L(ivVar.M - 3));
        String str = "";
        TLRPC.Document document = this.X;
        if (document == null) {
            B = "";
        } else {
            B = w7.B(document);
        }
        CharSequence ellipsize = TextUtils.ellipsize(B, textPaint, d, TextUtils.TruncateAt.END);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f24880d0 = new StaticLayout(ellipsize, this.f24878b0, d, alignment, 1.0f, 0.0f, false);
        if (document != null) {
            str = g0.i0(document.size, false, false);
        }
        this.f24881e0 = new StaticLayout(str, this.f24879c0, d, alignment, 1.0f, 0.0f, false);
    }

    public final void l0(boolean z10) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        iv ivVar = this.f22933a;
        RadialProgress2 radialProgress2 = this.Y;
        boolean z11 = this.f24887k0;
        if (z11) {
            radialProgress2.g(org.telegram.ui.ActionBar.j6.f28840cf, org.telegram.ui.ActionBar.j6.f28857df, org.telegram.ui.ActionBar.j6.f28876ef, org.telegram.ui.ActionBar.j6.f28893ff);
            radialProgress2.d = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Yd, ivVar.D);
        } else {
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
            radialProgress2.g(i7, i10, i11, i12);
            if (ivVar.E()) {
                i13 = org.telegram.ui.ActionBar.j6.f29171uc;
            } else {
                i13 = org.telegram.ui.ActionBar.j6.f29134se;
            }
            radialProgress2.d = org.telegram.ui.ActionBar.j6.w0(i13, ivVar.D);
        }
        String r10 = w7.r(null, this.X);
        File j02 = j0();
        int i14 = 4;
        if (j02 != null && j02.exists()) {
            z5.q(ivVar.f24440a).v(this);
            this.f24888l0 = 0;
            if (!z11) {
                i14 = 5;
            }
            radialProgress2.setIcon(i14, false, z10);
        } else if (!TextUtils.isEmpty(r10)) {
            z5.q(ivVar.f24440a).a(r10, null, this);
            float f10 = 0.0f;
            if (w7.G(ivVar.f24440a).S(r10)) {
                this.f24888l0 = 2;
                Float w10 = fc.D().w(r10);
                if (w10 != null) {
                    f10 = w10.floatValue();
                }
                radialProgress2.p(z10, f10);
                radialProgress2.setIcon(3, true, z10);
            } else {
                this.f24888l0 = 1;
                radialProgress2.p(z10, 0.0f);
                radialProgress2.setIcon(2, false, z10);
            }
        } else {
            radialProgress2.setIcon(4, false, z10);
        }
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
