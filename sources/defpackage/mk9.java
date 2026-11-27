package defpackage;

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
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;
public final class mk9 extends dk9 implements jq3 {
    public final TLRPC.Document X;
    public final RadialProgress2 Y;
    public final ImageReceiver Z;
    public final Paint a0;
    public final TextPaint b0;
    public final TextPaint c0;
    public StaticLayout d0;
    public StaticLayout e0;
    public final int f0;
    public final int g0;
    public final int h0;
    public final int i0;
    public final RectF j0;
    public final boolean k0;
    public byte l0;
    public boolean m0;
    public boolean n0;
    public int o0;
    public final int p0;

    public mk9(hl9 hl9Var, Rect rect, int i, TL_iv.pageBlockDocument pageblockdocument) {
        super(hl9Var, rect, i);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.Z = imageReceiver;
        this.a0 = new Paint(1);
        this.b0 = new TextPaint(1);
        this.c0 = new TextPaint(1);
        int L = hl.L(16.0f);
        this.f0 = L;
        int L2 = hl.L(9.0f);
        int L3 = hl.L(42.0f);
        this.h0 = L3;
        this.i0 = hl.L(14.0f);
        this.j0 = new RectF();
        this.o0 = -1;
        TLRPC.Document s = hl9Var.s(pageblockdocument.document_id);
        this.X = s;
        int L4 = hl.L(10.0f) + hl9Var.S;
        this.g0 = L4;
        boolean W2 = r47.W2(s);
        this.k0 = W2;
        this.p0 = lq3.q(hl9Var.a).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.Y = radialProgress2;
        radialProgress2.setCircleRadius(L3 / 2);
        if (W2) {
            L = ((hl.L(86.0f) - L3) / 2) + L4;
            L2 = hl.L(10.0f) + ((hl.L(86.0f) - L3) / 2);
        }
        radialProgress2.p(L, L2, L + L3, L3 + L2);
        imageReceiver.q0(hl.L(6.0f));
        imageReceiver.A1 = true;
        if (W2) {
            TLRPC.PhotoSize w = xb4.w(s.thumbs, 320, false, null, true);
            imageReceiver.i0(L4, hl.L(10.0f), hl.L(86.0f), hl.L(86.0f));
            imageReceiver.d0(w != null ? jn5.c(w, s) : null, "86_86", in5.i(s.thumbs), null, hl9Var.b, 1);
        }
        j0();
        k0(false);
    }

    @Override
    public final void B(boolean z) {
        k0(true);
    }

    @Override
    public final int H() {
        float f;
        Rect rect = this.b;
        int i = rect.top;
        if (this.k0) {
            f = 106.0f;
        } else {
            f = 60.0f;
        }
        return hl.L(f) + i + rect.bottom;
    }

    @Override
    public final int I() {
        int i;
        int i2;
        boolean z = this.k0;
        hl9 hl9Var = this.a;
        if (z) {
            i2 = hl.L(86.0f) + (this.g0 - hl9Var.S);
        } else {
            StaticLayout staticLayout = this.e0;
            if (staticLayout != null && staticLayout.getLineCount() > 0) {
                StaticLayout staticLayout2 = this.e0;
                i = (int) Math.ceil(staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1));
            } else {
                i = 0;
            }
            i2 = (this.f0 - hl9Var.S) + this.h0 + this.i0 + i;
        }
        Rect rect = this.b;
        return rect.left + i2 + rect.right;
    }

    @Override
    public final int J() {
        String B;
        String i0;
        int i;
        TLRPC.Document document = this.X;
        if (document == null) {
            i0 = "";
            B = "";
        } else {
            B = xb4.B(document);
            i0 = hl.i0(document.size, false, false);
        }
        int ceil = (int) Math.ceil(Math.max(this.b0.measureText(B), this.c0.measureText(i0)));
        if (this.k0) {
            i = hl.L(107.0f);
        } else {
            i = this.f0 + this.h0 + this.i0;
        }
        int min = Math.min(this.c, Math.max(hl.L(220.0f), hl.L(48.0f) + i + ceil));
        Rect rect = this.b;
        return rect.left + min + rect.right;
    }

    @Override
    public final void N(String str) {
        this.Y.o(true, 1.0f);
        k0(true);
    }

    @Override
    public final void S() {
        View view = this.W;
        ImageReceiver imageReceiver = this.Z;
        if (view != null) {
            this.Y.m(view);
            imageReceiver.p0(this.W);
        }
        imageReceiver.I();
        k0(false);
    }

    @Override
    public final void U() {
        this.Z.K();
        lq3.q(this.a.a).v(this);
    }

    @Override
    public final void V(Canvas canvas) {
        int i;
        int i2;
        int i3;
        wb2 wb2Var;
        rb2 rb2Var;
        int i4;
        TLRPC.Document document = this.X;
        if (document == null) {
            return;
        }
        if (this.o0 != h0()) {
            j0();
        }
        canvas.save();
        hl9 hl9Var = this.a;
        canvas.translate(-hl9Var.S, 0.0f);
        Drawable drawable = null;
        boolean z = this.k0;
        int i5 = this.g0;
        if (z && !this.Z.h(canvas, null)) {
            if (hl9Var.D()) {
                i4 = aob.zc;
            } else {
                i4 = aob.xe;
            }
            int v0 = aob.v0(i4, hl9Var.D);
            Paint paint = this.a0;
            paint.setColor(v0);
            canvas.drawRoundRect(i5, hl.L(10.0f), hl.L(86.0f) + i5, hl.L(96.0f), hl.L(6.0f), hl.L(6.0f), paint);
        }
        this.Y.draw(canvas);
        if (hl9Var.D()) {
            i = aob.wc;
        } else {
            i = aob.ue;
        }
        this.b0.setColor(aob.v0(i, hl9Var.D));
        if (hl9Var.D()) {
            i2 = aob.jc;
        } else {
            i2 = aob.ee;
        }
        this.c0.setColor(aob.v0(i2, hl9Var.D));
        if (z) {
            i3 = hl.L(97.0f) + i5;
        } else {
            i3 = this.f0 + this.h0 + this.i0;
        }
        int L = hl.L(11.0f);
        int L2 = hl.L(2.0f);
        canvas.save();
        float f = i3;
        canvas.translate(f, L);
        this.d0.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(f, L2 + this.d0.getHeight() + L);
        this.e0.draw(canvas);
        canvas.restore();
        RectF rectF = this.j0;
        if (document != null && (wb2Var = hl9Var.E) != null && (rb2Var = hl9Var.F) != null && rb2Var.W1(wb2Var)) {
            if (hl9Var.D()) {
                vnb vnbVar = hl9Var.D;
                if (vnbVar != null) {
                    drawable = vnbVar.getDrawable("drawableMsgOutMenu");
                }
                if (drawable == null) {
                    drawable = aob.P0("drawableMsgOutMenu");
                }
            } else {
                drawable = aob.c4;
            }
            int L3 = (this.o0 + this.b.right) - hl.L(32.0f);
            int L4 = hl.L(7.0f);
            drawable.setBounds(L3, L4, drawable.getIntrinsicWidth() + L3, drawable.getIntrinsicHeight() + L4);
            drawable.draw(canvas);
            rectF.set(L3 - hl.L(8.0f), 0.0f, hl.L(8.0f) + drawable.getIntrinsicWidth() + L3, hl.L(54.0f));
        } else {
            rectF.setEmpty();
        }
        canvas.restore();
    }

    @Override
    public final boolean X(android.view.MotionEvent r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mk9.X(android.view.MotionEvent):boolean");
    }

    @Override
    public final int getObserverTag() {
        return this.p0;
    }

    public final int h0() {
        hl9 hl9Var = this.a;
        int i = hl9Var.C;
        int i2 = this.c;
        if (i > 0) {
            Rect rect = this.b;
            i2 = Math.min(i2, Math.max(0, (i - rect.left) - rect.right));
        }
        return i2 + hl9Var.S + hl9Var.T;
    }

    @Override
    public final void i(long j, long j2) {
        float min;
        if (j2 <= 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j) / ((float) j2));
        }
        this.Y.o(true, min);
        if (this.l0 != 2) {
            k0(true);
        }
    }

    public final File i0() {
        TLRPC.Document document = this.X;
        if (document == null) {
            return null;
        }
        hl9 hl9Var = this.a;
        xb4.G(hl9Var.a);
        File J = xb4.J(document, null, false, true);
        if (J != null && J.exists()) {
            return J;
        }
        xb4.G(hl9Var.a);
        return xb4.J(document, null, true, true);
    }

    public final void j0() {
        int i;
        int i2;
        String B;
        this.o0 = h0();
        if (this.k0) {
            i = hl.L(97.0f);
            i2 = this.g0;
        } else {
            i = this.f0 + this.h0;
            i2 = this.i0;
        }
        int i3 = i + i2;
        int d = c00.d(48.0f, this.o0 - i3, hl.L(40.0f));
        hl9 hl9Var = this.a;
        TextPaint textPaint = this.b0;
        uh9.p(textPaint, hl.L(hl9Var.M - 1));
        this.c0.setTextSize(hl.L(hl9Var.M - 3));
        String str = "";
        TLRPC.Document document = this.X;
        if (document == null) {
            B = "";
        } else {
            B = xb4.B(document);
        }
        CharSequence ellipsize = TextUtils.ellipsize(B, textPaint, d, TextUtils.TruncateAt.END);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.d0 = new StaticLayout(ellipsize, this.b0, d, alignment, 1.0f, 0.0f, false);
        if (document != null) {
            str = hl.i0(document.size, false, false);
        }
        this.e0 = new StaticLayout(str, this.c0, d, alignment, 1.0f, 0.0f, false);
    }

    public final void k0(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        hl9 hl9Var = this.a;
        boolean z2 = this.k0;
        RadialProgress2 radialProgress2 = this.Y;
        if (z2) {
            radialProgress2.g(aob.cf, aob.df, aob.ef, aob.ff);
            radialProgress2.d = aob.v0(aob.Yd, hl9Var.D);
        } else {
            if (hl9Var.D()) {
                i = aob.Ec;
            } else {
                i = aob.Ze;
            }
            if (hl9Var.D()) {
                i2 = aob.Fc;
            } else {
                i2 = aob.af;
            }
            if (hl9Var.D()) {
                i3 = aob.Gb;
            } else {
                i3 = aob.ld;
            }
            if (hl9Var.D()) {
                i4 = aob.Hb;
            } else {
                i4 = aob.md;
            }
            radialProgress2.g(i, i2, i3, i4);
            if (hl9Var.D()) {
                i5 = aob.uc;
            } else {
                i5 = aob.se;
            }
            radialProgress2.d = aob.v0(i5, hl9Var.D);
        }
        String r = xb4.r(null, this.X);
        File i0 = i0();
        int i6 = 4;
        if (i0 != null && i0.exists()) {
            lq3.q(hl9Var.a).v(this);
            this.l0 = (byte) 0;
            if (!z2) {
                i6 = 5;
            }
            radialProgress2.setIcon(i6, false, z);
        } else if (!TextUtils.isEmpty(r)) {
            lq3.q(hl9Var.a).a(r, null, this);
            float f = 0.0f;
            if (xb4.G(hl9Var.a).S(r)) {
                this.l0 = (byte) 2;
                Float s = in5.z().s(r);
                if (s != null) {
                    f = s.floatValue();
                }
                radialProgress2.o(z, f);
                radialProgress2.setIcon(3, true, z);
            } else {
                this.l0 = (byte) 1;
                radialProgress2.o(z, 0.0f);
                radialProgress2.setIcon(2, false, z);
            }
        } else {
            radialProgress2.setIcon(4, false, z);
        }
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final void l(long j, long j2) {
    }
}
