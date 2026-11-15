package di;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oy0;
public final class hc {
    public int f8736a;
    public final RectF f8737b;
    public final org.telegram.ui.Components.u5 f8738c;
    public final org.telegram.ui.Components.u5 d;
    public final org.telegram.ui.Components.u5 f8739e;
    public LinearGradient f8740f;
    public final Matrix f8741g;
    public final Paint h;
    public final boolean f8742i;
    public long f8743j;
    public final ImageReceiver f8744k;
    public final org.telegram.ui.Components.t8 f8745l;
    public final org.telegram.ui.Components.t8 f8746m;
    public oy0 f8747n;
    public oy0 f8748o;
    public boolean f8749p;
    public final org.telegram.ui.Components.dc f8750q;
    public int f8751r;
    public Drawable f8752s;
    public Drawable f8753t;
    public oy0 f8754u;
    public int v;
    public final ic f8755w;

    public hc(ic icVar, boolean z10, long j3) {
        String str;
        jc jcVar = icVar.f8828w;
        this.f8755w = icVar;
        this.f8737b = new RectF();
        er erVar = er.h;
        this.f8738c = new org.telegram.ui.Components.u5(icVar, 0L, 600L, erVar);
        this.d = new org.telegram.ui.Components.u5(icVar, 0L, 200L, erVar);
        this.f8739e = new org.telegram.ui.Components.u5(icVar, 0L, 350L, erVar);
        this.f8740f = null;
        this.f8741g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(icVar);
        this.f8744k = imageReceiver;
        org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        this.f8745l = t8Var;
        org.telegram.ui.Components.t8 t8Var2 = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        this.f8746m = t8Var2;
        this.f8750q = new org.telegram.ui.Components.dc(icVar);
        this.f8742i = z10;
        this.f8743j = j3;
        if (j3 >= 0) {
            TLRPC.User a22 = np.s1(jcVar.n1).a2(Long.valueOf(j3));
            str = q10.k(a22);
            t8Var.r(a22);
            imageReceiver.i0(a22, t8Var, null);
        } else {
            TLRPC.Chat M0 = np.s1(jcVar.n1).M0(Long.valueOf(-j3));
            if (M0 == null) {
                str = "";
            } else {
                str = M0.title;
            }
            t8Var.q(M0);
            imageReceiver.i0(M0, t8Var, null);
        }
        imageReceiver.J0(org.telegram.messenger.g0.L(56.0f));
        imageReceiver.P();
        imageReceiver.B0 = true;
        t8Var2.g(21);
        t8Var2.h(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28833c8, jcVar.f8874m1));
        this.f8747n = new oy0(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        boolean z10 = false;
        float e10 = this.f8738c.e(false, this.f8736a);
        int i7 = this.f8736a;
        ic icVar = this.f8755w;
        if (i7 >= 0 && i7 < icVar.d.size()) {
            z10 = true;
        }
        float d = this.d.d(z10);
        canvas.save();
        float width = (icVar.getWidth() - org.telegram.messenger.g0.L(80.0f)) / Math.max(1.0f, icVar.f8825n);
        float L = ((icVar.f8825n - (e10 + 0.5f)) * width) + org.telegram.messenger.g0.L(40.0f);
        float L2 = org.telegram.messenger.g0.L(40.0f);
        float f13 = width / 2.0f;
        this.f8737b.set(L - f13, L2 - org.telegram.messenger.g0.L(50.0f), f13 + L, org.telegram.messenger.g0.L(50.0f) + L2);
        float f14 = (0.3f * d) + 0.7f;
        canvas.scale(f14, f14, L, L2);
        float a10 = this.f8750q.a(0.04f);
        canvas.scale(a10, a10, L, L2);
        if (d > 0.0f) {
            float d2 = this.f8739e.d(this.f8749p);
            if (d2 < 1.0f) {
                f12 = 255.0f;
                f10 = 40.0f;
                f11 = 2.0f;
                ImageReceiver imageReceiver = this.f8744k;
                imageReceiver.y0(L - (org.telegram.messenger.g0.L(56.0f) / 2.0f), L2 - (org.telegram.messenger.g0.L(56.0f) / 2.0f), org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f));
                imageReceiver.setAlpha(d);
                imageReceiver.h(canvas, null);
                imageReceiver.setAlpha(1.0f);
            } else {
                f10 = 40.0f;
                f11 = 2.0f;
                f12 = 255.0f;
            }
            if (d2 > 0.0f) {
                int i10 = (int) L;
                int L3 = i10 - (org.telegram.messenger.g0.L(56.0f) / 2);
                int i11 = (int) L2;
                int L4 = i11 - (org.telegram.messenger.g0.L(56.0f) / 2);
                int L5 = (org.telegram.messenger.g0.L(56.0f) / 2) + i10;
                int L6 = (org.telegram.messenger.g0.L(56.0f) / 2) + i11;
                org.telegram.ui.Components.t8 t8Var = this.f8746m;
                t8Var.setBounds(L3, L4, L5, L6);
                t8Var.f39608y = (int) (d * f12 * d2);
                t8Var.draw(canvas);
                t8Var.f39608y = 255;
            }
        } else {
            f10 = 40.0f;
            f11 = 2.0f;
            f12 = 255.0f;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((L - (this.f8748o.f38105c / f11)) - org.telegram.messenger.g0.L(5.66f), (org.telegram.messenger.g0.L(23.0f) + L2) - (org.telegram.messenger.g0.L(16.0f) / f11), (this.f8748o.f38105c / f11) + L + org.telegram.messenger.g0.L(5.66f), (org.telegram.messenger.g0.L(16.0f) / f11) + org.telegram.messenger.g0.L(23.0f) + L2);
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, icVar.f8824f);
        int i12 = (int) (d * f12);
        Paint paint = this.h;
        paint.setAlpha(i12);
        if (this.f8740f != null) {
            Matrix matrix = this.f8741g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f8740f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, paint);
        oy0 oy0Var = this.f8748o;
        oy0Var.c(L - (oy0Var.f38105c / f11), org.telegram.messenger.g0.L(23.0f) + L2, d, -1, canvas);
        oy0 oy0Var2 = this.f8747n;
        oy0Var2.f38116p = width - org.telegram.messenger.g0.L(4.0f);
        oy0Var2.c(L - (this.f8747n.k() / f11), org.telegram.messenger.g0.L(42.0f) + L2, d, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, icVar.f8828w.f8874m1), canvas);
        if (this.v > 0) {
            int i13 = (int) L;
            int i14 = (int) L2;
            this.f8753t.setBounds(i13 - org.telegram.messenger.g0.L(12.0f), i14 - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(12.0f) + i13, i14 - org.telegram.messenger.g0.L(16.0f));
            this.f8752s.setBounds(i13 - org.telegram.messenger.g0.L(12.0f), i14 - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(12.0f) + i13, i14 - org.telegram.messenger.g0.L(16.0f));
            this.f8753t.setAlpha(i12);
            this.f8752s.setAlpha(i12);
            this.f8753t.draw(canvas);
            this.f8752s.draw(canvas);
            oy0 oy0Var3 = this.f8754u;
            oy0Var3.c(L - (oy0Var3.f38105c / f11), L2 - org.telegram.messenger.g0.L(27.0f), d, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j3) {
        long j10;
        boolean z10;
        String str;
        String str2;
        ic icVar = this.f8755w;
        jc jcVar = icVar.f8828w;
        if (this.f8742i) {
            if (this.f8749p) {
                j10 = 2666000;
            } else if (this.f8743j == m10.i(jcVar.n1).e()) {
                j10 = 0;
            } else {
                j10 = this.f8743j;
            }
            if (j10 != j3) {
                int i7 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
                if (i7 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f8749p = z10;
                if (j3 == 0 || i7 == 0) {
                    j3 = m10.i(jcVar.n1).e();
                }
                this.f8743j = j3;
                if (this.f8749p) {
                    str2 = hd.M0(2131745048, null);
                } else {
                    int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                    ImageReceiver imageReceiver = this.f8744k;
                    org.telegram.ui.Components.t8 t8Var = this.f8745l;
                    if (i10 >= 0) {
                        TLRPC.User a22 = np.s1(jcVar.n1).a2(Long.valueOf(this.f8743j));
                        str = q10.k(a22);
                        t8Var.r(a22);
                        imageReceiver.i0(a22, t8Var, null);
                    } else {
                        TLRPC.Chat M0 = np.s1(jcVar.n1).M0(Long.valueOf(-this.f8743j));
                        if (M0 == null) {
                            str = "";
                        } else {
                            str = M0.title;
                        }
                        t8Var.q(M0);
                        imageReceiver.i0(M0, t8Var, null);
                    }
                    str2 = str;
                }
                this.f8747n = new oy0(str2, 12.0f, null);
                icVar.invalidate();
            }
        }
    }
}
