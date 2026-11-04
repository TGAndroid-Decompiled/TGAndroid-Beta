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
public final class gu extends xt implements x5 {
    public final TLRPC.Document X;
    public final RadialProgress2 Y;
    public final ImageReceiver Z;
    public final Paint f22764a0;
    public final TextPaint f22765b0;
    public final TextPaint f22766c0;
    public StaticLayout f22767d0;
    public StaticLayout f22768e0;
    public final int f22769f0;
    public final int f22770g0;
    public final int f22771h0;
    public final int f22772i0;
    public final RectF f22773j0;
    public final boolean f22774k0;
    public int f22775l0;
    public boolean m0;
    public boolean f22776n0;
    public int f22777o0;
    public final int f22778p0;

    public gu(cv cvVar, Rect rect, int i3, TL_iv.pageBlockDocument pageblockdocument) {
        super(cvVar, rect, i3);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.Z = imageReceiver;
        this.f22764a0 = new Paint(1);
        this.f22765b0 = new TextPaint(1);
        this.f22766c0 = new TextPaint(1);
        int L = g0.L(16.0f);
        this.f22769f0 = L;
        int L2 = g0.L(9.0f);
        int L3 = g0.L(42.0f);
        this.f22771h0 = L3;
        this.f22772i0 = g0.L(14.0f);
        this.f22773j0 = new RectF();
        this.f22777o0 = -1;
        TLRPC.Document s6 = cvVar.s(pageblockdocument.document_id);
        this.X = s6;
        int L4 = g0.L(10.0f) + cvVar.S;
        this.f22770g0 = L4;
        boolean X2 = zi.X2(s6);
        this.f22774k0 = X2;
        this.f22778p0 = z5.q(cvVar.f22065a).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.Y = radialProgress2;
        radialProgress2.setCircleRadius(L3 / 2);
        L = X2 ? ((g0.L(86.0f) - L3) / 2) + L4 : L;
        L2 = X2 ? g0.L(10.0f) + ((g0.L(86.0f) - L3) / 2) : L2;
        radialProgress2.r(L, L2, L + L3, L3 + L2);
        imageReceiver.J0(g0.L(6.0f));
        imageReceiver.A1 = true;
        if (X2) {
            TLRPC.PhotoSize w10 = w7.w(s6.thumbs, 320, false, null, true);
            imageReceiver.y0(L4, g0.L(10.0f), g0.L(86.0f), g0.L(86.0f));
            imageReceiver.q0(w10 != null ? ac.c(w10, s6) : null, "86_86", zb.m(s6.thumbs), null, cvVar.f22066b, 1);
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
        Rect rect = this.f26435b;
        int i3 = rect.top;
        if (this.f22774k0) {
            f10 = 106.0f;
        } else {
            f10 = 60.0f;
        }
        return g0.L(f10) + i3 + rect.bottom;
    }

    @Override
    public final int J() {
        int i3;
        int i10;
        boolean z10 = this.f22774k0;
        cv cvVar = this.f26434a;
        if (z10) {
            i10 = g0.L(86.0f) + (this.f22770g0 - cvVar.S);
        } else {
            StaticLayout staticLayout = this.f22768e0;
            if (staticLayout != null && staticLayout.getLineCount() > 0) {
                StaticLayout staticLayout2 = this.f22768e0;
                i3 = (int) Math.ceil(staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1));
            } else {
                i3 = 0;
            }
            i10 = (this.f22769f0 - cvVar.S) + this.f22771h0 + this.f22772i0 + i3;
        }
        Rect rect = this.f26435b;
        return rect.left + i10 + rect.right;
    }

    @Override
    public final int K() {
        String B;
        int i3;
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
        int ceil = (int) Math.ceil(Math.max(this.f22765b0.measureText(B), this.f22766c0.measureText(str)));
        if (this.f22774k0) {
            i3 = g0.L(107.0f);
        } else {
            i3 = this.f22769f0 + this.f22771h0 + this.f22772i0;
        }
        int min = Math.min(this.f26436c, Math.max(g0.L(220.0f), g0.L(48.0f) + i3 + ceil));
        Rect rect = this.f26435b;
        return rect.left + min + rect.right;
    }

    @Override
    public final void M(String str) {
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
        z5.q(this.f26434a.f22065a).v(this);
    }

    @Override
    public final void W(Canvas canvas) {
        int i3;
        int i10;
        int i11;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Cells.l1 l1Var;
        int i12;
        TLRPC.Document document = this.X;
        if (document == null) {
            return;
        }
        if (this.f22777o0 != i0()) {
            k0();
        }
        canvas.save();
        cv cvVar = this.f26434a;
        canvas.translate(-cvVar.S, 0.0f);
        Drawable drawable = null;
        boolean z10 = this.f22774k0;
        int i13 = this.f22770g0;
        if (z10 && !this.Z.h(canvas, null)) {
            if (cvVar.E()) {
                i12 = org.telegram.ui.ActionBar.k6.f28240wc;
            } else {
                i12 = org.telegram.ui.ActionBar.k6.f28203ue;
            }
            int w02 = org.telegram.ui.ActionBar.k6.w0(i12, cvVar.D);
            Paint paint = this.f22764a0;
            paint.setColor(w02);
            canvas.drawRoundRect(i13, g0.L(10.0f), g0.L(86.0f) + i13, g0.L(96.0f), g0.L(6.0f), g0.L(6.0f), paint);
        }
        this.Y.draw(canvas);
        if (cvVar.E()) {
            i3 = org.telegram.ui.ActionBar.k6.tc;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.f28147re;
        }
        this.f22765b0.setColor(org.telegram.ui.ActionBar.k6.w0(i3, cvVar.D));
        if (cvVar.E()) {
            i10 = org.telegram.ui.ActionBar.k6.f27942gc;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.f27850be;
        }
        this.f22766c0.setColor(org.telegram.ui.ActionBar.k6.w0(i10, cvVar.D));
        if (z10) {
            i11 = g0.L(97.0f) + i13;
        } else {
            i11 = this.f22769f0 + this.f22771h0 + this.f22772i0;
        }
        int L = g0.L(11.0f);
        int L2 = g0.L(2.0f);
        canvas.save();
        float f10 = i11;
        canvas.translate(f10, L);
        this.f22767d0.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(f10, L2 + this.f22767d0.getHeight() + L);
        this.f22768e0.draw(canvas);
        canvas.restore();
        RectF rectF = this.f22773j0;
        if (document != null && (q1Var = cvVar.E) != null && (l1Var = cvVar.F) != null && l1Var.b0(q1Var)) {
            if (cvVar.E()) {
                org.telegram.ui.ActionBar.e6 e6Var = cvVar.D;
                if (e6Var != null) {
                    drawable = e6Var.getDrawable("drawableMsgOutMenu");
                }
                if (drawable == null) {
                    drawable = org.telegram.ui.ActionBar.k6.R0("drawableMsgOutMenu");
                }
            } else {
                drawable = org.telegram.ui.ActionBar.k6.f27859c4;
            }
            int L3 = (this.f22777o0 + this.f26435b.right) - g0.L(32.0f);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gu.Y(android.view.MotionEvent):boolean");
    }

    @Override
    public final int getObserverTag() {
        return this.f22778p0;
    }

    @Override
    public final void i(long j10, long j11) {
        float min;
        if (j11 <= 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.Y.p(true, min);
        if (this.f22775l0 != 2) {
            l0(true);
        }
    }

    public final int i0() {
        cv cvVar = this.f26434a;
        int i3 = cvVar.C;
        int i10 = this.f26436c;
        if (i3 > 0) {
            Rect rect = this.f26435b;
            i10 = Math.min(i10, Math.max(0, (i3 - rect.left) - rect.right));
        }
        return i10 + cvVar.S + cvVar.T;
    }

    public final File j0() {
        TLRPC.Document document = this.X;
        if (document == null) {
            return null;
        }
        cv cvVar = this.f26434a;
        w7.G(cvVar.f22065a);
        File K = w7.K(document, null, false, true);
        if (K != null && K.exists()) {
            return K;
        }
        w7.G(cvVar.f22065a);
        return w7.K(document, null, true, true);
    }

    public final void k0() {
        int i3;
        int i10;
        String B;
        this.f22777o0 = i0();
        if (this.f22774k0) {
            i3 = g0.L(97.0f);
            i10 = this.f22770g0;
        } else {
            i3 = this.f22769f0 + this.f22771h0;
            i10 = this.f22772i0;
        }
        int i11 = i3 + i10;
        int d = k2.p1.d(48.0f, this.f22777o0 - i11, g0.L(40.0f));
        cv cvVar = this.f26434a;
        TextPaint textPaint = this.f22765b0;
        textPaint.setTextSize(g0.L(cvVar.M - 1));
        textPaint.setTypeface(g0.o());
        this.f22766c0.setTextSize(g0.L(cvVar.M - 3));
        String str = "";
        TLRPC.Document document = this.X;
        if (document == null) {
            B = "";
        } else {
            B = w7.B(document);
        }
        CharSequence ellipsize = TextUtils.ellipsize(B, textPaint, d, TextUtils.TruncateAt.END);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f22767d0 = new StaticLayout(ellipsize, this.f22765b0, d, alignment, 1.0f, 0.0f, false);
        if (document != null) {
            str = g0.i0(document.size, false, false);
        }
        this.f22768e0 = new StaticLayout(str, this.f22766c0, d, alignment, 1.0f, 0.0f, false);
    }

    public final void l0(boolean z10) {
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        cv cvVar = this.f26434a;
        RadialProgress2 radialProgress2 = this.Y;
        boolean z11 = this.f22774k0;
        if (z11) {
            radialProgress2.g(org.telegram.ui.ActionBar.k6.Ze, org.telegram.ui.ActionBar.k6.f27831af, org.telegram.ui.ActionBar.k6.f27851bf, org.telegram.ui.ActionBar.k6.f27868cf);
            radialProgress2.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Vd, cvVar.D);
        } else {
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
            radialProgress2.g(i3, i10, i11, i12);
            if (cvVar.E()) {
                i13 = org.telegram.ui.ActionBar.k6.f28145rc;
            } else {
                i13 = org.telegram.ui.ActionBar.k6.f28109pe;
            }
            radialProgress2.d = org.telegram.ui.ActionBar.k6.w0(i13, cvVar.D);
        }
        String r5 = w7.r(null, this.X);
        File j02 = j0();
        int i14 = 4;
        if (j02 != null && j02.exists()) {
            z5.q(cvVar.f22065a).v(this);
            this.f22775l0 = 0;
            if (!z11) {
                i14 = 5;
            }
            radialProgress2.setIcon(i14, false, z10);
        } else if (!TextUtils.isEmpty(r5)) {
            z5.q(cvVar.f22065a).a(r5, null, this);
            float f10 = 0.0f;
            if (w7.G(cvVar.f22065a).T(r5)) {
                this.f22775l0 = 2;
                Float w10 = zb.D().w(r5);
                if (w10 != null) {
                    f10 = w10.floatValue();
                }
                radialProgress2.p(z10, f10);
                radialProgress2.setIcon(3, true, z10);
            } else {
                this.f22775l0 = 1;
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
    public final void o(long j10, long j11) {
    }
}
