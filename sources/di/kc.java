package di;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.vy0;
public final class kc {
    public int f9214a;
    public final RectF f9215b;
    public final org.telegram.ui.Components.c6 f9216c;
    public final org.telegram.ui.Components.c6 d;
    public final org.telegram.ui.Components.c6 f9217e;
    public LinearGradient f9218f;
    public final Matrix f9219g;
    public final Paint h;
    public final boolean f9220i;
    public long f9221j;
    public final ImageReceiver f9222k;
    public final org.telegram.ui.Components.b9 f9223l;
    public final org.telegram.ui.Components.b9 f9224m;
    public vy0 f9225n;
    public vy0 f9226o;
    public boolean f9227p;
    public final org.telegram.ui.Components.mc f9228q;
    public int f9229r;
    public Drawable f9230s;
    public Drawable f9231t;
    public vy0 f9232u;
    public int v;
    public final lc f9233w;

    public kc(lc lcVar, boolean z10, long j3) {
        String str;
        mc mcVar = lcVar.f9285w;
        this.f9233w = lcVar;
        this.f9215b = new RectF();
        lr lrVar = lr.h;
        this.f9216c = new org.telegram.ui.Components.c6(lcVar, 0L, 600L, lrVar);
        this.d = new org.telegram.ui.Components.c6(lcVar, 0L, 200L, lrVar);
        this.f9217e = new org.telegram.ui.Components.c6(lcVar, 0L, 350L, lrVar);
        this.f9218f = null;
        this.f9219g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(lcVar);
        this.f9222k = imageReceiver;
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        this.f9223l = b9Var;
        org.telegram.ui.Components.b9 b9Var2 = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        this.f9224m = b9Var2;
        this.f9228q = new org.telegram.ui.Components.mc(lcVar);
        this.f9220i = z10;
        this.f9221j = j3;
        if (j3 >= 0) {
            TLRPC.User c22 = mp.u1(mcVar.n1).c2(Long.valueOf(j3));
            str = o10.l(c22);
            b9Var.r(c22);
            imageReceiver.i0(c22, b9Var, null);
        } else {
            TLRPC.Chat O0 = mp.u1(mcVar.n1).O0(Long.valueOf(-j3));
            if (O0 == null) {
                str = "";
            } else {
                str = O0.title;
            }
            b9Var.q(O0);
            imageReceiver.i0(O0, b9Var, null);
        }
        imageReceiver.J0(org.telegram.messenger.g0.L(56.0f));
        imageReceiver.P();
        imageReceiver.B0 = true;
        b9Var2.g(21);
        b9Var2.h(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29380c8, mcVar.f9344m1));
        this.f9225n = new vy0(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        boolean z10 = false;
        float e10 = this.f9216c.e(false, this.f9214a);
        int i7 = this.f9214a;
        lc lcVar = this.f9233w;
        if (i7 >= 0 && i7 < lcVar.d.size()) {
            z10 = true;
        }
        float d = this.d.d(z10);
        canvas.save();
        float width = (lcVar.getWidth() - org.telegram.messenger.g0.L(80.0f)) / Math.max(1.0f, lcVar.f9282n);
        float L = ((lcVar.f9282n - (e10 + 0.5f)) * width) + org.telegram.messenger.g0.L(40.0f);
        float L2 = org.telegram.messenger.g0.L(40.0f);
        float f13 = width / 2.0f;
        this.f9215b.set(L - f13, L2 - org.telegram.messenger.g0.L(50.0f), f13 + L, org.telegram.messenger.g0.L(50.0f) + L2);
        float f14 = (0.3f * d) + 0.7f;
        canvas.scale(f14, f14, L, L2);
        float a10 = this.f9228q.a(0.04f);
        canvas.scale(a10, a10, L, L2);
        if (d > 0.0f) {
            float d2 = this.f9217e.d(this.f9227p);
            if (d2 < 1.0f) {
                f12 = 255.0f;
                f10 = 40.0f;
                f11 = 2.0f;
                ImageReceiver imageReceiver = this.f9222k;
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
                org.telegram.ui.Components.b9 b9Var = this.f9224m;
                b9Var.setBounds(L3, L4, L5, L6);
                b9Var.f33609y = (int) (d * f12 * d2);
                b9Var.draw(canvas);
                b9Var.f33609y = 255;
            }
        } else {
            f10 = 40.0f;
            f11 = 2.0f;
            f12 = 255.0f;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((L - (this.f9226o.f41482c / f11)) - org.telegram.messenger.g0.L(5.66f), (org.telegram.messenger.g0.L(23.0f) + L2) - (org.telegram.messenger.g0.L(16.0f) / f11), (this.f9226o.f41482c / f11) + L + org.telegram.messenger.g0.L(5.66f), (org.telegram.messenger.g0.L(16.0f) / f11) + org.telegram.messenger.g0.L(23.0f) + L2);
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, lcVar.f9281f);
        int i12 = (int) (d * f12);
        Paint paint = this.h;
        paint.setAlpha(i12);
        if (this.f9218f != null) {
            Matrix matrix = this.f9219g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f9218f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, paint);
        vy0 vy0Var = this.f9226o;
        vy0Var.c(L - (vy0Var.f41482c / f11), org.telegram.messenger.g0.L(23.0f) + L2, d, -1, canvas);
        vy0 vy0Var2 = this.f9225n;
        vy0Var2.f41493p = width - org.telegram.messenger.g0.L(4.0f);
        vy0Var2.c(L - (this.f9225n.k() / f11), org.telegram.messenger.g0.L(42.0f) + L2, d, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, lcVar.f9285w.f9344m1), canvas);
        if (this.v > 0) {
            int i13 = (int) L;
            int i14 = (int) L2;
            this.f9231t.setBounds(i13 - org.telegram.messenger.g0.L(12.0f), i14 - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(12.0f) + i13, i14 - org.telegram.messenger.g0.L(16.0f));
            this.f9230s.setBounds(i13 - org.telegram.messenger.g0.L(12.0f), i14 - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(12.0f) + i13, i14 - org.telegram.messenger.g0.L(16.0f));
            this.f9231t.setAlpha(i12);
            this.f9230s.setAlpha(i12);
            this.f9231t.draw(canvas);
            this.f9230s.draw(canvas);
            vy0 vy0Var3 = this.f9232u;
            vy0Var3.c(L - (vy0Var3.f41482c / f11), L2 - org.telegram.messenger.g0.L(27.0f), d, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j3) {
        long j10;
        boolean z10;
        String str;
        String str2;
        lc lcVar = this.f9233w;
        mc mcVar = lcVar.f9285w;
        if (this.f9220i) {
            if (this.f9227p) {
                j10 = 2666000;
            } else if (this.f9221j == j10.i(mcVar.n1).e()) {
                j10 = 0;
            } else {
                j10 = this.f9221j;
            }
            if (j10 != j3) {
                int i7 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
                if (i7 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f9227p = z10;
                if (j3 == 0 || i7 == 0) {
                    j3 = j10.i(mcVar.n1).e();
                }
                this.f9221j = j3;
                if (this.f9227p) {
                    str2 = gd.M0(2131744813, null);
                } else {
                    int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                    ImageReceiver imageReceiver = this.f9222k;
                    org.telegram.ui.Components.b9 b9Var = this.f9223l;
                    if (i10 >= 0) {
                        TLRPC.User c22 = mp.u1(mcVar.n1).c2(Long.valueOf(this.f9221j));
                        str = o10.l(c22);
                        b9Var.r(c22);
                        imageReceiver.i0(c22, b9Var, null);
                    } else {
                        TLRPC.Chat O0 = mp.u1(mcVar.n1).O0(Long.valueOf(-this.f9221j));
                        if (O0 == null) {
                            str = "";
                        } else {
                            str = O0.title;
                        }
                        b9Var.q(O0);
                        imageReceiver.i0(O0, b9Var, null);
                    }
                    str2 = str;
                }
                this.f9225n = new vy0(str2, 12.0f, null);
                lcVar.invalidate();
            }
        }
    }
}
