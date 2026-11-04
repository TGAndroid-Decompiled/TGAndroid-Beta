package ci;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.xq;
public final class rc {
    public int f5924a;
    public final RectF f5925b;
    public final org.telegram.ui.Components.u5 f5926c;
    public final org.telegram.ui.Components.u5 d;
    public final org.telegram.ui.Components.u5 f5927e;
    public LinearGradient f5928f;
    public final Matrix f5929g;
    public final Paint h;
    public final boolean f5930i;
    public long f5931j;
    public final ImageReceiver f5932k;
    public final org.telegram.ui.Components.u8 f5933l;
    public final org.telegram.ui.Components.u8 f5934m;
    public ly0 f5935n;
    public ly0 f5936o;
    public boolean f5937p;
    public final org.telegram.ui.Components.gc f5938q;
    public int f5939r;
    public Drawable f5940s;
    public Drawable f5941t;
    public ly0 f5942u;
    public int v;
    public final sc f5943w;

    public rc(sc scVar, boolean z10, long j10) {
        String str;
        tc tcVar = scVar.f5991w;
        this.f5943w = scVar;
        this.f5925b = new RectF();
        xq xqVar = xq.h;
        this.f5926c = new org.telegram.ui.Components.u5(scVar, 0L, 600L, xqVar);
        this.d = new org.telegram.ui.Components.u5(scVar, 0L, 200L, xqVar);
        this.f5927e = new org.telegram.ui.Components.u5(scVar, 0L, 350L, xqVar);
        this.f5928f = null;
        this.f5929g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(scVar);
        this.f5932k = imageReceiver;
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        this.f5933l = u8Var;
        org.telegram.ui.Components.u8 u8Var2 = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        this.f5934m = u8Var2;
        this.f5938q = new org.telegram.ui.Components.gc(scVar);
        this.f5930i = z10;
        this.f5931j = j10;
        if (j10 >= 0) {
            TLRPC.User a22 = hp.s1(tcVar.k1).a2(Long.valueOf(j10));
            str = l10.k(a22);
            u8Var.r(a22);
            imageReceiver.i0(a22, u8Var, null);
        } else {
            TLRPC.Chat M0 = hp.s1(tcVar.k1).M0(Long.valueOf(-j10));
            if (M0 == null) {
                str = "";
            } else {
                str = M0.title;
            }
            u8Var.q(M0);
            imageReceiver.i0(M0, u8Var, null);
        }
        imageReceiver.J0(org.telegram.messenger.g0.L(56.0f));
        imageReceiver.P();
        imageReceiver.B0 = true;
        u8Var2.g(21);
        u8Var2.h(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27863c8, tcVar.f6054j1));
        this.f5935n = new ly0(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        boolean z10 = false;
        float e10 = this.f5926c.e(false, this.f5924a);
        int i3 = this.f5924a;
        sc scVar = this.f5943w;
        if (i3 >= 0 && i3 < scVar.d.size()) {
            z10 = true;
        }
        float d = this.d.d(z10);
        canvas.save();
        float width = (scVar.getWidth() - org.telegram.messenger.g0.L(80.0f)) / Math.max(1.0f, scVar.f5988n);
        float L = ((scVar.f5988n - (e10 + 0.5f)) * width) + org.telegram.messenger.g0.L(40.0f);
        float L2 = org.telegram.messenger.g0.L(40.0f);
        float f13 = width / 2.0f;
        this.f5925b.set(L - f13, L2 - org.telegram.messenger.g0.L(50.0f), f13 + L, org.telegram.messenger.g0.L(50.0f) + L2);
        float f14 = (0.3f * d) + 0.7f;
        canvas.scale(f14, f14, L, L2);
        float a10 = this.f5938q.a(0.04f);
        canvas.scale(a10, a10, L, L2);
        if (d > 0.0f) {
            float d10 = this.f5927e.d(this.f5937p);
            if (d10 < 1.0f) {
                f12 = 255.0f;
                f10 = 40.0f;
                f11 = 2.0f;
                ImageReceiver imageReceiver = this.f5932k;
                imageReceiver.y0(L - (org.telegram.messenger.g0.L(56.0f) / 2.0f), L2 - (org.telegram.messenger.g0.L(56.0f) / 2.0f), org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f));
                imageReceiver.setAlpha(d);
                imageReceiver.h(canvas, null);
                imageReceiver.setAlpha(1.0f);
            } else {
                f10 = 40.0f;
                f11 = 2.0f;
                f12 = 255.0f;
            }
            if (d10 > 0.0f) {
                int i10 = (int) L;
                int L3 = i10 - (org.telegram.messenger.g0.L(56.0f) / 2);
                int i11 = (int) L2;
                int L4 = i11 - (org.telegram.messenger.g0.L(56.0f) / 2);
                int L5 = (org.telegram.messenger.g0.L(56.0f) / 2) + i10;
                int L6 = (org.telegram.messenger.g0.L(56.0f) / 2) + i11;
                org.telegram.ui.Components.u8 u8Var = this.f5934m;
                u8Var.setBounds(L3, L4, L5, L6);
                u8Var.f38699y = (int) (d * f12 * d10);
                u8Var.draw(canvas);
                u8Var.f38699y = 255;
            }
        } else {
            f10 = 40.0f;
            f11 = 2.0f;
            f12 = 255.0f;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((L - (this.f5936o.f35918c / f11)) - org.telegram.messenger.g0.L(5.66f), (org.telegram.messenger.g0.L(23.0f) + L2) - (org.telegram.messenger.g0.L(16.0f) / f11), (this.f5936o.f35918c / f11) + L + org.telegram.messenger.g0.L(5.66f), (org.telegram.messenger.g0.L(16.0f) / f11) + org.telegram.messenger.g0.L(23.0f) + L2);
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, scVar.f5987f);
        int i12 = (int) (d * f12);
        Paint paint = this.h;
        paint.setAlpha(i12);
        if (this.f5928f != null) {
            Matrix matrix = this.f5929g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f5928f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, paint);
        ly0 ly0Var = this.f5936o;
        ly0Var.c(L - (ly0Var.f35918c / f11), org.telegram.messenger.g0.L(23.0f) + L2, d, -1, canvas);
        ly0 ly0Var2 = this.f5935n;
        ly0Var2.f35929p = width - org.telegram.messenger.g0.L(4.0f);
        ly0Var2.c(L - (this.f5935n.k() / f11), org.telegram.messenger.g0.L(42.0f) + L2, d, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, scVar.f5991w.f6054j1), canvas);
        if (this.v > 0) {
            int i13 = (int) L;
            int i14 = (int) L2;
            this.f5941t.setBounds(i13 - org.telegram.messenger.g0.L(12.0f), i14 - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(12.0f) + i13, i14 - org.telegram.messenger.g0.L(16.0f));
            this.f5940s.setBounds(i13 - org.telegram.messenger.g0.L(12.0f), i14 - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(12.0f) + i13, i14 - org.telegram.messenger.g0.L(16.0f));
            this.f5941t.setAlpha(i12);
            this.f5940s.setAlpha(i12);
            this.f5941t.draw(canvas);
            this.f5940s.draw(canvas);
            ly0 ly0Var3 = this.f5942u;
            ly0Var3.c(L - (ly0Var3.f35918c / f11), L2 - org.telegram.messenger.g0.L(27.0f), d, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j10) {
        long j11;
        boolean z10;
        String str;
        String str2;
        sc scVar = this.f5943w;
        tc tcVar = scVar.f5991w;
        if (this.f5930i) {
            if (this.f5937p) {
                j11 = 2666000;
            } else if (this.f5931j == h10.i(tcVar.k1).e()) {
                j11 = 0;
            } else {
                j11 = this.f5931j;
            }
            if (j11 != j10) {
                int i3 = (j10 > 2666000L ? 1 : (j10 == 2666000L ? 0 : -1));
                if (i3 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f5937p = z10;
                if (j10 == 0 || i3 == 0) {
                    j10 = h10.i(tcVar.k1).e();
                }
                this.f5931j = j10;
                if (this.f5937p) {
                    str2 = bd.M0(2131745058, null);
                } else {
                    int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                    ImageReceiver imageReceiver = this.f5932k;
                    org.telegram.ui.Components.u8 u8Var = this.f5933l;
                    if (i10 >= 0) {
                        TLRPC.User a22 = hp.s1(tcVar.k1).a2(Long.valueOf(this.f5931j));
                        str = l10.k(a22);
                        u8Var.r(a22);
                        imageReceiver.i0(a22, u8Var, null);
                    } else {
                        TLRPC.Chat M0 = hp.s1(tcVar.k1).M0(Long.valueOf(-this.f5931j));
                        if (M0 == null) {
                            str = "";
                        } else {
                            str = M0.title;
                        }
                        u8Var.q(M0);
                        imageReceiver.i0(M0, u8Var, null);
                    }
                    str2 = str;
                }
                this.f5935n = new ly0(str2, 12.0f, null);
                scVar.invalidate();
            }
        }
    }
}
