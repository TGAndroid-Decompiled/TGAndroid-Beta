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
public final class gc {
    public int f8654a;
    public final RectF f8655b;
    public final org.telegram.ui.Components.u5 f8656c;
    public final org.telegram.ui.Components.u5 d;
    public final org.telegram.ui.Components.u5 f8657e;
    public LinearGradient f8658f;
    public final Matrix f8659g;
    public final Paint h;
    public final boolean f8660i;
    public long f8661j;
    public final ImageReceiver f8662k;
    public final org.telegram.ui.Components.t8 f8663l;
    public final org.telegram.ui.Components.t8 f8664m;
    public oy0 f8665n;
    public oy0 f8666o;
    public boolean f8667p;
    public final org.telegram.ui.Components.dc f8668q;
    public int f8669r;
    public Drawable f8670s;
    public Drawable f8671t;
    public oy0 f8672u;
    public int v;
    public final hc f8673w;

    public gc(hc hcVar, boolean z10, long j3) {
        String str;
        ic icVar = hcVar.f8753w;
        this.f8673w = hcVar;
        this.f8655b = new RectF();
        er erVar = er.h;
        this.f8656c = new org.telegram.ui.Components.u5(hcVar, 0L, 600L, erVar);
        this.d = new org.telegram.ui.Components.u5(hcVar, 0L, 200L, erVar);
        this.f8657e = new org.telegram.ui.Components.u5(hcVar, 0L, 350L, erVar);
        this.f8658f = null;
        this.f8659g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(hcVar);
        this.f8662k = imageReceiver;
        org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        this.f8663l = t8Var;
        org.telegram.ui.Components.t8 t8Var2 = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        this.f8664m = t8Var2;
        this.f8668q = new org.telegram.ui.Components.dc(hcVar);
        this.f8660i = z10;
        this.f8661j = j3;
        if (j3 >= 0) {
            TLRPC.User a22 = np.s1(icVar.n1).a2(Long.valueOf(j3));
            str = q10.k(a22);
            t8Var.r(a22);
            imageReceiver.i0(a22, t8Var, null);
        } else {
            TLRPC.Chat M0 = np.s1(icVar.n1).M0(Long.valueOf(-j3));
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
        t8Var2.h(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28833c8, icVar.f8821m1));
        this.f8665n = new oy0(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        boolean z10 = false;
        float e10 = this.f8656c.e(false, this.f8654a);
        int i7 = this.f8654a;
        hc hcVar = this.f8673w;
        if (i7 >= 0 && i7 < hcVar.d.size()) {
            z10 = true;
        }
        float d = this.d.d(z10);
        canvas.save();
        float width = (hcVar.getWidth() - org.telegram.messenger.g0.L(80.0f)) / Math.max(1.0f, hcVar.f8750n);
        float L = ((hcVar.f8750n - (e10 + 0.5f)) * width) + org.telegram.messenger.g0.L(40.0f);
        float L2 = org.telegram.messenger.g0.L(40.0f);
        float f13 = width / 2.0f;
        this.f8655b.set(L - f13, L2 - org.telegram.messenger.g0.L(50.0f), f13 + L, org.telegram.messenger.g0.L(50.0f) + L2);
        float f14 = (0.3f * d) + 0.7f;
        canvas.scale(f14, f14, L, L2);
        float a10 = this.f8668q.a(0.04f);
        canvas.scale(a10, a10, L, L2);
        if (d > 0.0f) {
            float d2 = this.f8657e.d(this.f8667p);
            if (d2 < 1.0f) {
                f12 = 255.0f;
                f10 = 40.0f;
                f11 = 2.0f;
                ImageReceiver imageReceiver = this.f8662k;
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
                org.telegram.ui.Components.t8 t8Var = this.f8664m;
                t8Var.setBounds(L3, L4, L5, L6);
                t8Var.f39606y = (int) (d * f12 * d2);
                t8Var.draw(canvas);
                t8Var.f39606y = 255;
            }
        } else {
            f10 = 40.0f;
            f11 = 2.0f;
            f12 = 255.0f;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((L - (this.f8666o.f38103c / f11)) - org.telegram.messenger.g0.L(5.66f), (org.telegram.messenger.g0.L(23.0f) + L2) - (org.telegram.messenger.g0.L(16.0f) / f11), (this.f8666o.f38103c / f11) + L + org.telegram.messenger.g0.L(5.66f), (org.telegram.messenger.g0.L(16.0f) / f11) + org.telegram.messenger.g0.L(23.0f) + L2);
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, hcVar.f8749f);
        int i12 = (int) (d * f12);
        Paint paint = this.h;
        paint.setAlpha(i12);
        if (this.f8658f != null) {
            Matrix matrix = this.f8659g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f8658f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, paint);
        oy0 oy0Var = this.f8666o;
        oy0Var.c(L - (oy0Var.f38103c / f11), org.telegram.messenger.g0.L(23.0f) + L2, d, -1, canvas);
        oy0 oy0Var2 = this.f8665n;
        oy0Var2.f38114p = width - org.telegram.messenger.g0.L(4.0f);
        oy0Var2.c(L - (this.f8665n.k() / f11), org.telegram.messenger.g0.L(42.0f) + L2, d, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, hcVar.f8753w.f8821m1), canvas);
        if (this.v > 0) {
            int i13 = (int) L;
            int i14 = (int) L2;
            this.f8671t.setBounds(i13 - org.telegram.messenger.g0.L(12.0f), i14 - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(12.0f) + i13, i14 - org.telegram.messenger.g0.L(16.0f));
            this.f8670s.setBounds(i13 - org.telegram.messenger.g0.L(12.0f), i14 - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(12.0f) + i13, i14 - org.telegram.messenger.g0.L(16.0f));
            this.f8671t.setAlpha(i12);
            this.f8670s.setAlpha(i12);
            this.f8671t.draw(canvas);
            this.f8670s.draw(canvas);
            oy0 oy0Var3 = this.f8672u;
            oy0Var3.c(L - (oy0Var3.f38103c / f11), L2 - org.telegram.messenger.g0.L(27.0f), d, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j3) {
        long j10;
        boolean z10;
        String str;
        String str2;
        hc hcVar = this.f8673w;
        ic icVar = hcVar.f8753w;
        if (this.f8660i) {
            if (this.f8667p) {
                j10 = 2666000;
            } else if (this.f8661j == m10.i(icVar.n1).e()) {
                j10 = 0;
            } else {
                j10 = this.f8661j;
            }
            if (j10 != j3) {
                int i7 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
                if (i7 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f8667p = z10;
                if (j3 == 0 || i7 == 0) {
                    j3 = m10.i(icVar.n1).e();
                }
                this.f8661j = j3;
                if (this.f8667p) {
                    str2 = hd.M0(2131745048, null);
                } else {
                    int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                    ImageReceiver imageReceiver = this.f8662k;
                    org.telegram.ui.Components.t8 t8Var = this.f8663l;
                    if (i10 >= 0) {
                        TLRPC.User a22 = np.s1(icVar.n1).a2(Long.valueOf(this.f8661j));
                        str = q10.k(a22);
                        t8Var.r(a22);
                        imageReceiver.i0(a22, t8Var, null);
                    } else {
                        TLRPC.Chat M0 = np.s1(icVar.n1).M0(Long.valueOf(-this.f8661j));
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
                this.f8665n = new oy0(str2, 12.0f, null);
                hcVar.invalidate();
            }
        }
    }
}
