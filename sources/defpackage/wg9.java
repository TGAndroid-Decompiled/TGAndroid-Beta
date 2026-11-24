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
public final class wg9 extends mg9 implements sp3 {
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

    public wg9(rh9 rh9Var, Rect rect, int i, TL_iv.pageBlockDocument pageblockdocument) {
        super(rh9Var, rect, i);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.Z = imageReceiver;
        this.a0 = new Paint(1);
        this.b0 = new TextPaint(1);
        this.c0 = new TextPaint(1);
        int L = gl.L(16.0f);
        this.f0 = L;
        int L2 = gl.L(9.0f);
        int L3 = gl.L(42.0f);
        this.h0 = L3;
        this.i0 = gl.L(14.0f);
        this.j0 = new RectF();
        this.o0 = -1;
        TLRPC.Document s = rh9Var.s(pageblockdocument.document_id);
        this.X = s;
        int L4 = gl.L(10.0f) + rh9Var.S;
        this.g0 = L4;
        boolean W2 = k27.W2(s);
        this.k0 = W2;
        this.p0 = up3.q(rh9Var.a).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.Y = radialProgress2;
        radialProgress2.setCircleRadius(L3 / 2);
        if (W2) {
            L = ((gl.L(86.0f) - L3) / 2) + L4;
            L2 = gl.L(10.0f) + ((gl.L(86.0f) - L3) / 2);
        }
        radialProgress2.p(L, L2, L + L3, L3 + L2);
        imageReceiver.q0(gl.L(6.0f));
        imageReceiver.A1 = true;
        if (W2) {
            TLRPC.PhotoSize w = ba4.w(s.thumbs, 320, false, null, true);
            imageReceiver.i0(L4, gl.L(10.0f), gl.L(86.0f), gl.L(86.0f));
            imageReceiver.d0(w != null ? gl5.c(w, s) : null, "86_86", fl5.i(s.thumbs), null, rh9Var.b, 1);
        }
        k0();
        l0(false);
    }

    @Override
    public final void B(boolean z) {
        l0(true);
    }

    @Override
    public final int I() {
        float f;
        Rect rect = this.b;
        int i = rect.top;
        if (this.k0) {
            f = 106.0f;
        } else {
            f = 60.0f;
        }
        return gl.L(f) + i + rect.bottom;
    }

    @Override
    public final int J() {
        int i;
        int i2;
        boolean z = this.k0;
        rh9 rh9Var = this.a;
        if (z) {
            i2 = gl.L(86.0f) + (this.g0 - rh9Var.S);
        } else {
            StaticLayout staticLayout = this.e0;
            if (staticLayout != null && staticLayout.getLineCount() > 0) {
                StaticLayout staticLayout2 = this.e0;
                i = (int) Math.ceil(staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1));
            } else {
                i = 0;
            }
            i2 = (this.f0 - rh9Var.S) + this.h0 + this.i0 + i;
        }
        Rect rect = this.b;
        return rect.left + i2 + rect.right;
    }

    @Override
    public final int K() {
        String B;
        String i0;
        int i;
        TLRPC.Document document = this.X;
        if (document == null) {
            i0 = "";
            B = "";
        } else {
            B = ba4.B(document);
            i0 = gl.i0(document.size, false, false);
        }
        int ceil = (int) Math.ceil(Math.max(this.b0.measureText(B), this.c0.measureText(i0)));
        if (this.k0) {
            i = gl.L(107.0f);
        } else {
            i = this.f0 + this.h0 + this.i0;
        }
        int min = Math.min(this.c, Math.max(gl.L(220.0f), gl.L(48.0f) + i + ceil));
        Rect rect = this.b;
        return rect.left + min + rect.right;
    }

    @Override
    public final void N(String str) {
        this.Y.o(true, 1.0f);
        l0(true);
    }

    @Override
    public final void T() {
        View view = this.W;
        ImageReceiver imageReceiver = this.Z;
        if (view != null) {
            this.Y.m(view);
            imageReceiver.p0(this.W);
        }
        imageReceiver.I();
        l0(false);
    }

    @Override
    public final void V() {
        this.Z.K();
        up3.q(this.a.a).v(this);
    }

    @Override
    public final void W(Canvas canvas) {
        int i;
        int i2;
        int i3;
        gb2 gb2Var;
        bb2 bb2Var;
        int i4;
        TLRPC.Document document = this.X;
        if (document == null) {
            return;
        }
        if (this.o0 != i0()) {
            k0();
        }
        canvas.save();
        rh9 rh9Var = this.a;
        canvas.translate(-rh9Var.S, 0.0f);
        Drawable drawable = null;
        boolean z = this.k0;
        int i5 = this.g0;
        if (z && !this.Z.h(canvas, null)) {
            if (rh9Var.D()) {
                i4 = bkb.yc;
            } else {
                i4 = bkb.we;
            }
            int v0 = bkb.v0(i4, rh9Var.D);
            Paint paint = this.a0;
            paint.setColor(v0);
            canvas.drawRoundRect(i5, gl.L(10.0f), gl.L(86.0f) + i5, gl.L(96.0f), gl.L(6.0f), gl.L(6.0f), paint);
        }
        this.Y.draw(canvas);
        if (rh9Var.D()) {
            i = bkb.vc;
        } else {
            i = bkb.te;
        }
        this.b0.setColor(bkb.v0(i, rh9Var.D));
        if (rh9Var.D()) {
            i2 = bkb.ic;
        } else {
            i2 = bkb.de;
        }
        this.c0.setColor(bkb.v0(i2, rh9Var.D));
        if (z) {
            i3 = gl.L(97.0f) + i5;
        } else {
            i3 = this.f0 + this.h0 + this.i0;
        }
        int L = gl.L(11.0f);
        int L2 = gl.L(2.0f);
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
        if (document != null && (gb2Var = rh9Var.E) != null && (bb2Var = rh9Var.F) != null && bb2Var.l2(gb2Var)) {
            if (rh9Var.D()) {
                wjb wjbVar = rh9Var.D;
                if (wjbVar != null) {
                    drawable = wjbVar.getDrawable("drawableMsgOutMenu");
                }
                if (drawable == null) {
                    drawable = bkb.P0("drawableMsgOutMenu");
                }
            } else {
                drawable = bkb.b4;
            }
            int L3 = (this.o0 + this.b.right) - gl.L(32.0f);
            int L4 = gl.L(7.0f);
            drawable.setBounds(L3, L4, drawable.getIntrinsicWidth() + L3, drawable.getIntrinsicHeight() + L4);
            drawable.draw(canvas);
            rectF.set(L3 - gl.L(8.0f), 0.0f, gl.L(8.0f) + drawable.getIntrinsicWidth() + L3, gl.L(54.0f));
        } else {
            rectF.setEmpty();
        }
        canvas.restore();
    }

    @Override
    public final boolean Y(android.view.MotionEvent r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg9.Y(android.view.MotionEvent):boolean");
    }

    @Override
    public final int getObserverTag() {
        return this.p0;
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
            l0(true);
        }
    }

    public final int i0() {
        rh9 rh9Var = this.a;
        int i = rh9Var.C;
        int i2 = this.c;
        if (i > 0) {
            Rect rect = this.b;
            i2 = Math.min(i2, Math.max(0, (i - rect.left) - rect.right));
        }
        return i2 + rh9Var.S + rh9Var.T;
    }

    public final File j0() {
        TLRPC.Document document = this.X;
        if (document == null) {
            return null;
        }
        rh9 rh9Var = this.a;
        ba4.G(rh9Var.a);
        File J = ba4.J(document, null, false, true);
        if (J != null && J.exists()) {
            return J;
        }
        ba4.G(rh9Var.a);
        return ba4.J(document, null, true, true);
    }

    public final void k0() {
        int i;
        int i2;
        String B;
        this.o0 = i0();
        if (this.k0) {
            i = gl.L(97.0f);
            i2 = this.g0;
        } else {
            i = this.f0 + this.h0;
            i2 = this.i0;
        }
        int i3 = i + i2;
        int c = b00.c(48.0f, this.o0 - i3, gl.L(40.0f));
        rh9 rh9Var = this.a;
        TextPaint textPaint = this.b0;
        de9.p(textPaint, gl.L(rh9Var.M - 1));
        this.c0.setTextSize(gl.L(rh9Var.M - 3));
        String str = "";
        TLRPC.Document document = this.X;
        if (document == null) {
            B = "";
        } else {
            B = ba4.B(document);
        }
        CharSequence ellipsize = TextUtils.ellipsize(B, textPaint, c, TextUtils.TruncateAt.END);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.d0 = new StaticLayout(ellipsize, this.b0, c, alignment, 1.0f, 0.0f, false);
        if (document != null) {
            str = gl.i0(document.size, false, false);
        }
        this.e0 = new StaticLayout(str, this.c0, c, alignment, 1.0f, 0.0f, false);
    }

    public final void l0(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        rh9 rh9Var = this.a;
        boolean z2 = this.k0;
        RadialProgress2 radialProgress2 = this.Y;
        if (z2) {
            radialProgress2.g(bkb.bf, bkb.cf, bkb.df, bkb.ef);
            radialProgress2.d = bkb.v0(bkb.Xd, rh9Var.D);
        } else {
            if (rh9Var.D()) {
                i = bkb.Dc;
            } else {
                i = bkb.Ye;
            }
            if (rh9Var.D()) {
                i2 = bkb.Ec;
            } else {
                i2 = bkb.Ze;
            }
            if (rh9Var.D()) {
                i3 = bkb.Fb;
            } else {
                i3 = bkb.kd;
            }
            if (rh9Var.D()) {
                i4 = bkb.Gb;
            } else {
                i4 = bkb.ld;
            }
            radialProgress2.g(i, i2, i3, i4);
            if (rh9Var.D()) {
                i5 = bkb.tc;
            } else {
                i5 = bkb.re;
            }
            radialProgress2.d = bkb.v0(i5, rh9Var.D);
        }
        String r = ba4.r(null, this.X);
        File j0 = j0();
        int i6 = 4;
        if (j0 != null && j0.exists()) {
            up3.q(rh9Var.a).v(this);
            this.l0 = (byte) 0;
            if (!z2) {
                i6 = 5;
            }
            radialProgress2.setIcon(i6, false, z);
        } else if (!TextUtils.isEmpty(r)) {
            up3.q(rh9Var.a).a(r, null, this);
            float f = 0.0f;
            if (ba4.G(rh9Var.a).S(r)) {
                this.l0 = (byte) 2;
                Float s = fl5.z().s(r);
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
