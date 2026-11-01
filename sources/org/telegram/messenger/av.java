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
public final class av extends ru implements z5 {
    public final TLRPC.Document W;
    public final RadialProgress2 X;
    public final ImageReceiver Y;
    public final Paint Z;
    public final TextPaint f14848a0;
    public final TextPaint f14849b0;
    public StaticLayout f14850c0;
    public StaticLayout f14851d0;
    public final int f14852e0;
    public final int f14853f0;
    public final int f14854g0;
    public final int f14855h0;
    public final RectF f14856i0;
    public final boolean f14857j0;
    public int f14858k0;
    public boolean f14859l0;
    public boolean m0;
    public int f14860n0;
    public final int f14861o0;

    public av(wv wvVar, Rect rect, int i10, TL_iv.pageBlockDocument pageblockdocument) {
        super(wvVar, rect, i10);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.Y = imageReceiver;
        this.Z = new Paint(1);
        this.f14848a0 = new TextPaint(1);
        this.f14849b0 = new TextPaint(1);
        int L = i0.L(16.0f);
        this.f14852e0 = L;
        int L2 = i0.L(9.0f);
        int L3 = i0.L(42.0f);
        this.f14854g0 = L3;
        this.f14855h0 = i0.L(14.0f);
        this.f14856i0 = new RectF();
        this.f14860n0 = -1;
        TLRPC.Document s10 = wvVar.s(pageblockdocument.document_id);
        this.W = s10;
        int L4 = i0.L(10.0f) + wvVar.S;
        this.f14853f0 = L4;
        boolean W2 = kj.W2(s10);
        this.f14857j0 = W2;
        this.f14861o0 = b6.q(wvVar.f19329a).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.X = radialProgress2;
        radialProgress2.setCircleRadius(L3 / 2);
        L = W2 ? ((i0.L(86.0f) - L3) / 2) + L4 : L;
        L2 = W2 ? i0.L(10.0f) + ((i0.L(86.0f) - L3) / 2) : L2;
        radialProgress2.r(L, L2, L + L3, L3 + L2);
        imageReceiver.J0(i0.L(6.0f));
        imageReceiver.f14425z1 = true;
        if (W2) {
            TLRPC.PhotoSize w9 = b8.w(s10.thumbs, 320, false, null, true);
            imageReceiver.y0(L4, i0.L(10.0f), i0.L(86.0f), i0.L(86.0f));
            imageReceiver.q0(w9 != null ? jc.c(w9, s10) : null, "86_86", ic.m(s10.thumbs), null, wvVar.f19330b, 1);
        }
        j0();
        k0(false);
    }

    @Override
    public final void D(boolean z10) {
        k0(true);
    }

    @Override
    public final int H() {
        float f7;
        Rect rect = this.f17968b;
        int i10 = rect.top;
        if (this.f14857j0) {
            f7 = 106.0f;
        } else {
            f7 = 60.0f;
        }
        return i0.L(f7) + i10 + rect.bottom;
    }

    @Override
    public final int I() {
        int i10;
        int i11;
        boolean z10 = this.f14857j0;
        wv wvVar = this.f17967a;
        if (z10) {
            i11 = i0.L(86.0f) + (this.f14853f0 - wvVar.S);
        } else {
            StaticLayout staticLayout = this.f14851d0;
            if (staticLayout != null && staticLayout.getLineCount() > 0) {
                StaticLayout staticLayout2 = this.f14851d0;
                i10 = (int) Math.ceil(staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1));
            } else {
                i10 = 0;
            }
            i11 = (this.f14852e0 - wvVar.S) + this.f14854g0 + this.f14855h0 + i10;
        }
        Rect rect = this.f17968b;
        return rect.left + i11 + rect.right;
    }

    @Override
    public final int J() {
        String B;
        int i10;
        String str = "";
        TLRPC.Document document = this.W;
        if (document == null) {
            B = "";
        } else {
            B = b8.B(document);
        }
        if (document != null) {
            str = i0.i0(document.size, false, false);
        }
        int ceil = (int) Math.ceil(Math.max(this.f14848a0.measureText(B), this.f14849b0.measureText(str)));
        if (this.f14857j0) {
            i10 = i0.L(107.0f);
        } else {
            i10 = this.f14852e0 + this.f14854g0 + this.f14855h0;
        }
        int min = Math.min(this.f17969c, Math.max(i0.L(220.0f), i0.L(48.0f) + i10 + ceil));
        Rect rect = this.f17968b;
        return rect.left + min + rect.right;
    }

    @Override
    public final void N(String str) {
        this.X.p(true, 1.0f);
        k0(true);
    }

    @Override
    public final void S() {
        View view = this.V;
        ImageReceiver imageReceiver = this.Y;
        if (view != null) {
            this.X.n(view);
            imageReceiver.H0(this.V);
        }
        imageReceiver.P();
        k0(false);
    }

    @Override
    public final void U() {
        this.Y.R();
        b6.q(this.f17967a.f19329a).v(this);
    }

    @Override
    public final void V(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Cells.l1 l1Var;
        int i13;
        TLRPC.Document document = this.W;
        if (document == null) {
            return;
        }
        if (this.f14860n0 != h0()) {
            j0();
        }
        canvas.save();
        wv wvVar = this.f17967a;
        canvas.translate(-wvVar.S, 0.0f);
        Drawable drawable = null;
        boolean z10 = this.f14857j0;
        int i14 = this.f14853f0;
        if (z10 && !this.Y.h(canvas, null)) {
            if (wvVar.E()) {
                i13 = org.telegram.ui.ActionBar.t6.f21283wc;
            } else {
                i13 = org.telegram.ui.ActionBar.t6.f21250ue;
            }
            int w02 = org.telegram.ui.ActionBar.t6.w0(i13, wvVar.D);
            Paint paint = this.Z;
            paint.setColor(w02);
            canvas.drawRoundRect(i14, i0.L(10.0f), i0.L(86.0f) + i14, i0.L(96.0f), i0.L(6.0f), i0.L(6.0f), paint);
        }
        this.X.draw(canvas);
        if (wvVar.E()) {
            i10 = org.telegram.ui.ActionBar.t6.f21230tc;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.f21194re;
        }
        this.f14848a0.setColor(org.telegram.ui.ActionBar.t6.w0(i10, wvVar.D));
        if (wvVar.E()) {
            i11 = org.telegram.ui.ActionBar.t6.gc;
        } else {
            i11 = org.telegram.ui.ActionBar.t6.f20900be;
        }
        this.f14849b0.setColor(org.telegram.ui.ActionBar.t6.w0(i11, wvVar.D));
        if (z10) {
            i12 = i0.L(97.0f) + i14;
        } else {
            i12 = this.f14852e0 + this.f14854g0 + this.f14855h0;
        }
        int L = i0.L(11.0f);
        int L2 = i0.L(2.0f);
        canvas.save();
        float f7 = i12;
        canvas.translate(f7, L);
        this.f14850c0.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(f7, L2 + this.f14850c0.getHeight() + L);
        this.f14851d0.draw(canvas);
        canvas.restore();
        RectF rectF = this.f14856i0;
        if (document != null && (q1Var = wvVar.E) != null && (l1Var = wvVar.F) != null && l1Var.Z(q1Var)) {
            if (wvVar.E()) {
                org.telegram.ui.ActionBar.p6 p6Var = wvVar.D;
                if (p6Var != null) {
                    drawable = p6Var.getDrawable("drawableMsgOutMenu");
                }
                if (drawable == null) {
                    drawable = org.telegram.ui.ActionBar.t6.R0("drawableMsgOutMenu");
                }
            } else {
                drawable = org.telegram.ui.ActionBar.t6.f20909c4;
            }
            int L3 = (this.f14860n0 + this.f17968b.right) - i0.L(32.0f);
            int L4 = i0.L(7.0f);
            drawable.setBounds(L3, L4, drawable.getIntrinsicWidth() + L3, drawable.getIntrinsicHeight() + L4);
            drawable.draw(canvas);
            rectF.set(L3 - i0.L(8.0f), 0.0f, i0.L(8.0f) + drawable.getIntrinsicWidth() + L3, i0.L(54.0f));
        } else {
            rectF.setEmpty();
        }
        canvas.restore();
    }

    @Override
    public final boolean X(android.view.MotionEvent r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.av.X(android.view.MotionEvent):boolean");
    }

    @Override
    public final int getObserverTag() {
        return this.f14861o0;
    }

    public final int h0() {
        wv wvVar = this.f17967a;
        int i10 = wvVar.C;
        int i11 = this.f17969c;
        if (i10 > 0) {
            Rect rect = this.f17968b;
            i11 = Math.min(i11, Math.max(0, (i10 - rect.left) - rect.right));
        }
        return i11 + wvVar.S + wvVar.T;
    }

    @Override
    public final void i(long j10, long j11) {
        float min;
        if (j11 <= 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.X.p(true, min);
        if (this.f14858k0 != 2) {
            k0(true);
        }
    }

    public final File i0() {
        TLRPC.Document document = this.W;
        if (document == null) {
            return null;
        }
        wv wvVar = this.f17967a;
        b8.G(wvVar.f19329a);
        File K = b8.K(document, null, false, true);
        if (K != null && K.exists()) {
            return K;
        }
        b8.G(wvVar.f19329a);
        return b8.K(document, null, true, true);
    }

    public final void j0() {
        int i10;
        int i11;
        String B;
        this.f14860n0 = h0();
        if (this.f14857j0) {
            i10 = i0.L(97.0f);
            i11 = this.f14853f0;
        } else {
            i10 = this.f14852e0 + this.f14854g0;
            i11 = this.f14855h0;
        }
        int i12 = i10 + i11;
        int d = i0.a.d(48.0f, this.f14860n0 - i12, i0.L(40.0f));
        wv wvVar = this.f17967a;
        TextPaint textPaint = this.f14848a0;
        textPaint.setTextSize(i0.L(wvVar.M - 1));
        textPaint.setTypeface(i0.o());
        this.f14849b0.setTextSize(i0.L(wvVar.M - 3));
        String str = "";
        TLRPC.Document document = this.W;
        if (document == null) {
            B = "";
        } else {
            B = b8.B(document);
        }
        CharSequence ellipsize = TextUtils.ellipsize(B, textPaint, d, TextUtils.TruncateAt.END);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f14850c0 = new StaticLayout(ellipsize, this.f14848a0, d, alignment, 1.0f, 0.0f, false);
        if (document != null) {
            str = i0.i0(document.size, false, false);
        }
        this.f14851d0 = new StaticLayout(str, this.f14849b0, d, alignment, 1.0f, 0.0f, false);
    }

    public final void k0(boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        wv wvVar = this.f17967a;
        RadialProgress2 radialProgress2 = this.X;
        boolean z11 = this.f14857j0;
        if (z11) {
            radialProgress2.g(org.telegram.ui.ActionBar.t6.Ze, org.telegram.ui.ActionBar.t6.f20881af, org.telegram.ui.ActionBar.t6.bf, org.telegram.ui.ActionBar.t6.f20920cf);
            radialProgress2.d = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Vd, wvVar.D);
        } else {
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
            radialProgress2.g(i10, i11, i12, i13);
            if (wvVar.E()) {
                i14 = org.telegram.ui.ActionBar.t6.rc;
            } else {
                i14 = org.telegram.ui.ActionBar.t6.f21160pe;
            }
            radialProgress2.d = org.telegram.ui.ActionBar.t6.w0(i14, wvVar.D);
        }
        String r10 = b8.r(null, this.W);
        File i02 = i0();
        int i15 = 4;
        if (i02 != null && i02.exists()) {
            b6.q(wvVar.f19329a).v(this);
            this.f14858k0 = 0;
            if (!z11) {
                i15 = 5;
            }
            radialProgress2.setIcon(i15, false, z10);
        } else if (!TextUtils.isEmpty(r10)) {
            b6.q(wvVar.f19329a).a(r10, null, this);
            float f7 = 0.0f;
            if (b8.G(wvVar.f19329a).T(r10)) {
                this.f14858k0 = 2;
                Float w9 = ic.D().w(r10);
                if (w9 != null) {
                    f7 = w9.floatValue();
                }
                radialProgress2.p(z10, f7);
                radialProgress2.setIcon(3, true, z10);
            } else {
                this.f14858k0 = 1;
                radialProgress2.p(z10, 0.0f);
                radialProgress2.setIcon(2, false, z10);
            }
        } else {
            radialProgress2.setIcon(4, false, z10);
        }
        View view = this.V;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final void o(long j10, long j11) {
    }
}
