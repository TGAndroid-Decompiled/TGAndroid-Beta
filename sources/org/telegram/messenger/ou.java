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
public final class ou extends fu implements x5 {
    public final TLRPC.Document W;
    public final RadialProgress2 X;
    public final ImageReceiver Y;
    public final Paint Z;
    public final TextPaint f24379a0;
    public final TextPaint f24380b0;
    public StaticLayout f24381c0;
    public StaticLayout f24382d0;
    public final int f24383e0;
    public final int f24384f0;
    public final int f24385g0;
    public final int f24386h0;
    public final RectF f24387i0;
    public final boolean f24388j0;
    public int f24389k0;
    public boolean f24390l0;
    public boolean m0;
    public int f24391n0;
    public final int f24392o0;

    public ou(kv kvVar, Rect rect, int i7, TL_iv.pageBlockDocument pageblockdocument) {
        super(kvVar, rect, i7);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.Y = imageReceiver;
        this.Z = new Paint(1);
        this.f24379a0 = new TextPaint(1);
        this.f24380b0 = new TextPaint(1);
        int L = g0.L(16.0f);
        this.f24383e0 = L;
        int L2 = g0.L(9.0f);
        int L3 = g0.L(42.0f);
        this.f24385g0 = L3;
        this.f24386h0 = g0.L(14.0f);
        this.f24387i0 = new RectF();
        this.f24391n0 = -1;
        TLRPC.Document s5 = kvVar.s(pageblockdocument.document_id);
        this.W = s5;
        int L4 = g0.L(10.0f) + kvVar.S;
        this.f24384f0 = L4;
        boolean X2 = ij.X2(s5);
        this.f24388j0 = X2;
        this.f24392o0 = z5.q(kvVar.f23763a).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.X = radialProgress2;
        radialProgress2.setCircleRadius(L3 / 2);
        L = X2 ? ((g0.L(86.0f) - L3) / 2) + L4 : L;
        L2 = X2 ? g0.L(10.0f) + ((g0.L(86.0f) - L3) / 2) : L2;
        radialProgress2.r(L, L2, L + L3, L3 + L2);
        imageReceiver.J0(g0.L(6.0f));
        imageReceiver.f21233z1 = true;
        if (X2) {
            TLRPC.PhotoSize w10 = w7.w(s5.thumbs, 320, false, null, true);
            imageReceiver.y0(L4, g0.L(10.0f), g0.L(86.0f), g0.L(86.0f));
            imageReceiver.q0(w10 != null ? hc.c(w10, s5) : null, "86_86", gc.m(s5.thumbs), null, kvVar.f23764b, 1);
        }
        k0();
        l0(false);
    }

    @Override
    public final void C(boolean z9) {
        l0(true);
    }

    @Override
    public final int I() {
        float f10;
        Rect rect = this.f22451b;
        int i7 = rect.top;
        if (this.f24388j0) {
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
        boolean z9 = this.f24388j0;
        kv kvVar = this.f22450a;
        if (z9) {
            i10 = g0.L(86.0f) + (this.f24384f0 - kvVar.S);
        } else {
            StaticLayout staticLayout = this.f24382d0;
            if (staticLayout != null && staticLayout.getLineCount() > 0) {
                StaticLayout staticLayout2 = this.f24382d0;
                i7 = (int) Math.ceil(staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1));
            } else {
                i7 = 0;
            }
            i10 = (this.f24383e0 - kvVar.S) + this.f24385g0 + this.f24386h0 + i7;
        }
        Rect rect = this.f22451b;
        return rect.left + i10 + rect.right;
    }

    @Override
    public final int K() {
        String B;
        int i7;
        String str = "";
        TLRPC.Document document = this.W;
        if (document == null) {
            B = "";
        } else {
            B = w7.B(document);
        }
        if (document != null) {
            str = g0.i0(document.size, false, false);
        }
        int ceil = (int) Math.ceil(Math.max(this.f24379a0.measureText(B), this.f24380b0.measureText(str)));
        if (this.f24388j0) {
            i7 = g0.L(107.0f);
        } else {
            i7 = this.f24383e0 + this.f24385g0 + this.f24386h0;
        }
        int min = Math.min(this.f22452c, Math.max(g0.L(220.0f), g0.L(48.0f) + i7 + ceil));
        Rect rect = this.f22451b;
        return rect.left + min + rect.right;
    }

    @Override
    public final void M(String str) {
        this.X.p(true, 1.0f);
        l0(true);
    }

    @Override
    public final void T() {
        View view = this.V;
        ImageReceiver imageReceiver = this.Y;
        if (view != null) {
            this.X.n(view);
            imageReceiver.H0(this.V);
        }
        imageReceiver.P();
        l0(false);
    }

    @Override
    public final void V() {
        this.Y.R();
        z5.q(this.f22450a.f23763a).v(this);
    }

    @Override
    public final void W(Canvas canvas) {
        int i7;
        int i10;
        int i11;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Cells.l1 l1Var;
        int i12;
        TLRPC.Document document = this.W;
        if (document == null) {
            return;
        }
        if (this.f24391n0 != i0()) {
            k0();
        }
        canvas.save();
        kv kvVar = this.f22450a;
        canvas.translate(-kvVar.S, 0.0f);
        Drawable drawable = null;
        boolean z9 = this.f24388j0;
        int i13 = this.f24384f0;
        if (z9 && !this.Y.h(canvas, null)) {
            if (kvVar.E()) {
                i12 = org.telegram.ui.ActionBar.k6.wc;
            } else {
                i12 = org.telegram.ui.ActionBar.k6.f28173ue;
            }
            int w02 = org.telegram.ui.ActionBar.k6.w0(i12, kvVar.D);
            Paint paint = this.Z;
            paint.setColor(w02);
            canvas.drawRoundRect(i13, g0.L(10.0f), g0.L(86.0f) + i13, g0.L(96.0f), g0.L(6.0f), g0.L(6.0f), paint);
        }
        this.X.draw(canvas);
        if (kvVar.E()) {
            i7 = org.telegram.ui.ActionBar.k6.f28151tc;
        } else {
            i7 = org.telegram.ui.ActionBar.k6.f28116re;
        }
        this.f24379a0.setColor(org.telegram.ui.ActionBar.k6.w0(i7, kvVar.D));
        if (kvVar.E()) {
            i10 = org.telegram.ui.ActionBar.k6.f27910gc;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.f27819be;
        }
        this.f24380b0.setColor(org.telegram.ui.ActionBar.k6.w0(i10, kvVar.D));
        if (z9) {
            i11 = g0.L(97.0f) + i13;
        } else {
            i11 = this.f24383e0 + this.f24385g0 + this.f24386h0;
        }
        int L = g0.L(11.0f);
        int L2 = g0.L(2.0f);
        canvas.save();
        float f10 = i11;
        canvas.translate(f10, L);
        this.f24381c0.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(f10, L2 + this.f24381c0.getHeight() + L);
        this.f24382d0.draw(canvas);
        canvas.restore();
        RectF rectF = this.f24387i0;
        if (document != null && (q1Var = kvVar.E) != null && (l1Var = kvVar.F) != null && l1Var.a0(q1Var)) {
            if (kvVar.E()) {
                org.telegram.ui.ActionBar.f6 f6Var = kvVar.D;
                if (f6Var != null) {
                    drawable = f6Var.getDrawable("drawableMsgOutMenu");
                }
                if (drawable == null) {
                    drawable = org.telegram.ui.ActionBar.k6.R0("drawableMsgOutMenu");
                }
            } else {
                drawable = org.telegram.ui.ActionBar.k6.f27829c4;
            }
            int L3 = (this.f24391n0 + this.f22451b.right) - g0.L(32.0f);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ou.Y(android.view.MotionEvent):boolean");
    }

    @Override
    public final int getObserverTag() {
        return this.f24392o0;
    }

    @Override
    public final void i(long j3, long j10) {
        float min;
        if (j10 <= 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j3) / ((float) j10));
        }
        this.X.p(true, min);
        if (this.f24389k0 != 2) {
            l0(true);
        }
    }

    public final int i0() {
        kv kvVar = this.f22450a;
        int i7 = kvVar.C;
        int i10 = this.f22452c;
        if (i7 > 0) {
            Rect rect = this.f22451b;
            i10 = Math.min(i10, Math.max(0, (i7 - rect.left) - rect.right));
        }
        return i10 + kvVar.S + kvVar.T;
    }

    public final File j0() {
        TLRPC.Document document = this.W;
        if (document == null) {
            return null;
        }
        kv kvVar = this.f22450a;
        w7.G(kvVar.f23763a);
        File J = w7.J(document, null, false, true);
        if (J != null && J.exists()) {
            return J;
        }
        w7.G(kvVar.f23763a);
        return w7.J(document, null, true, true);
    }

    public final void k0() {
        int i7;
        int i10;
        String B;
        this.f24391n0 = i0();
        if (this.f24388j0) {
            i7 = g0.L(97.0f);
            i10 = this.f24384f0;
        } else {
            i7 = this.f24383e0 + this.f24385g0;
            i10 = this.f24386h0;
        }
        int i11 = i7 + i10;
        int e10 = jg.g.e(48.0f, this.f24391n0 - i11, g0.L(40.0f));
        kv kvVar = this.f22450a;
        TextPaint textPaint = this.f24379a0;
        textPaint.setTextSize(g0.L(kvVar.M - 1));
        textPaint.setTypeface(g0.o());
        this.f24380b0.setTextSize(g0.L(kvVar.M - 3));
        String str = "";
        TLRPC.Document document = this.W;
        if (document == null) {
            B = "";
        } else {
            B = w7.B(document);
        }
        CharSequence ellipsize = TextUtils.ellipsize(B, textPaint, e10, TextUtils.TruncateAt.END);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f24381c0 = new StaticLayout(ellipsize, this.f24379a0, e10, alignment, 1.0f, 0.0f, false);
        if (document != null) {
            str = g0.i0(document.size, false, false);
        }
        this.f24382d0 = new StaticLayout(str, this.f24380b0, e10, alignment, 1.0f, 0.0f, false);
    }

    public final void l0(boolean z9) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        kv kvVar = this.f22450a;
        RadialProgress2 radialProgress2 = this.X;
        boolean z10 = this.f24388j0;
        if (z10) {
            radialProgress2.g(org.telegram.ui.ActionBar.k6.Ze, org.telegram.ui.ActionBar.k6.f27801af, org.telegram.ui.ActionBar.k6.f27820bf, org.telegram.ui.ActionBar.k6.f27840cf);
            radialProgress2.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Vd, kvVar.D);
        } else {
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
                i11 = org.telegram.ui.ActionBar.k6.f27947id;
            }
            if (kvVar.E()) {
                i12 = org.telegram.ui.ActionBar.k6.Eb;
            } else {
                i12 = org.telegram.ui.ActionBar.k6.f27965jd;
            }
            radialProgress2.g(i7, i10, i11, i12);
            if (kvVar.E()) {
                i13 = org.telegram.ui.ActionBar.k6.f28114rc;
            } else {
                i13 = org.telegram.ui.ActionBar.k6.f28077pe;
            }
            radialProgress2.d = org.telegram.ui.ActionBar.k6.w0(i13, kvVar.D);
        }
        String r10 = w7.r(null, this.W);
        File j02 = j0();
        int i14 = 4;
        if (j02 != null && j02.exists()) {
            z5.q(kvVar.f23763a).v(this);
            this.f24389k0 = 0;
            if (!z10) {
                i14 = 5;
            }
            radialProgress2.setIcon(i14, false, z9);
        } else if (!TextUtils.isEmpty(r10)) {
            z5.q(kvVar.f23763a).a(r10, null, this);
            float f10 = 0.0f;
            if (w7.G(kvVar.f23763a).S(r10)) {
                this.f24389k0 = 2;
                Float w10 = gc.D().w(r10);
                if (w10 != null) {
                    f10 = w10.floatValue();
                }
                radialProgress2.p(z9, f10);
                radialProgress2.setIcon(3, true, z9);
            } else {
                this.f24389k0 = 1;
                radialProgress2.p(z9, 0.0f);
                radialProgress2.setIcon(2, false, z9);
            }
        } else {
            radialProgress2.setIcon(4, false, z9);
        }
        View view = this.V;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
