package di;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.wy0;
public final class kc {
    public int f9206a;
    public final RectF f9207b;
    public final org.telegram.ui.Components.c6 f9208c;
    public final org.telegram.ui.Components.c6 d;
    public final org.telegram.ui.Components.c6 f9209e;
    public LinearGradient f9210f;
    public final Matrix f9211g;
    public final Paint h;
    public final boolean f9212i;
    public long f9213j;
    public final ImageReceiver f9214k;
    public final org.telegram.ui.Components.a9 f9215l;
    public final org.telegram.ui.Components.a9 f9216m;
    public wy0 f9217n;
    public wy0 f9218o;
    public boolean f9219p;
    public final org.telegram.ui.Components.lc f9220q;
    public int f9221r;
    public Drawable f9222s;
    public Drawable f9223t;
    public wy0 f9224u;
    public int v;
    public final lc f9225w;

    public kc(lc lcVar, boolean z10, long j3) {
        String str;
        mc mcVar = lcVar.f9276w;
        this.f9225w = lcVar;
        this.f9207b = new RectF();
        kr krVar = kr.h;
        this.f9208c = new org.telegram.ui.Components.c6(lcVar, 0L, 600L, krVar);
        this.d = new org.telegram.ui.Components.c6(lcVar, 0L, 200L, krVar);
        this.f9209e = new org.telegram.ui.Components.c6(lcVar, 0L, 350L, krVar);
        this.f9210f = null;
        this.f9211g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(lcVar);
        this.f9214k = imageReceiver;
        org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        this.f9215l = a9Var;
        org.telegram.ui.Components.a9 a9Var2 = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        this.f9216m = a9Var2;
        this.f9220q = new org.telegram.ui.Components.lc(lcVar);
        this.f9212i = z10;
        this.f9213j = j3;
        if (j3 >= 0) {
            TLRPC.User c22 = mp.u1(mcVar.n1).c2(Long.valueOf(j3));
            str = n10.l(c22);
            a9Var.r(c22);
            imageReceiver.j0(c22, a9Var, null);
        } else {
            TLRPC.Chat O0 = mp.u1(mcVar.n1).O0(Long.valueOf(-j3));
            if (O0 == null) {
                str = "";
            } else {
                str = O0.title;
            }
            a9Var.q(O0);
            imageReceiver.j0(O0, a9Var, null);
        }
        imageReceiver.K0(org.telegram.messenger.g0.L(56.0f));
        imageReceiver.Q();
        imageReceiver.B0 = true;
        a9Var2.g(21);
        a9Var2.h(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29435c8, mcVar.f9329m1));
        this.f9217n = new wy0(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        boolean z10 = false;
        float e10 = this.f9208c.e(false, this.f9206a);
        int i7 = this.f9206a;
        lc lcVar = this.f9225w;
        if (i7 >= 0 && i7 < lcVar.d.size()) {
            z10 = true;
        }
        float d = this.d.d(z10);
        canvas.save();
        float width = (lcVar.getWidth() - org.telegram.messenger.g0.L(80.0f)) / Math.max(1.0f, lcVar.f9273n);
        float L = ((lcVar.f9273n - (e10 + 0.5f)) * width) + org.telegram.messenger.g0.L(40.0f);
        float L2 = org.telegram.messenger.g0.L(40.0f);
        float f13 = width / 2.0f;
        this.f9207b.set(L - f13, L2 - org.telegram.messenger.g0.L(50.0f), f13 + L, org.telegram.messenger.g0.L(50.0f) + L2);
        float f14 = (0.3f * d) + 0.7f;
        canvas.scale(f14, f14, L, L2);
        float a10 = this.f9220q.a(0.04f);
        canvas.scale(a10, a10, L, L2);
        if (d > 0.0f) {
            float d2 = this.f9209e.d(this.f9219p);
            if (d2 < 1.0f) {
                f12 = 255.0f;
                f10 = 40.0f;
                f11 = 2.0f;
                ImageReceiver imageReceiver = this.f9214k;
                imageReceiver.z0(L - (org.telegram.messenger.g0.L(56.0f) / 2.0f), L2 - (org.telegram.messenger.g0.L(56.0f) / 2.0f), org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f));
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
                org.telegram.ui.Components.a9 a9Var = this.f9216m;
                a9Var.setBounds(L3, L4, L5, L6);
                a9Var.f33441y = (int) (d * f12 * d2);
                a9Var.draw(canvas);
                a9Var.f33441y = 255;
            }
        } else {
            f10 = 40.0f;
            f11 = 2.0f;
            f12 = 255.0f;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((L - (this.f9218o.f41763c / f11)) - org.telegram.messenger.g0.L(5.66f), (org.telegram.messenger.g0.L(23.0f) + L2) - (org.telegram.messenger.g0.L(16.0f) / f11), (this.f9218o.f41763c / f11) + L + org.telegram.messenger.g0.L(5.66f), (org.telegram.messenger.g0.L(16.0f) / f11) + org.telegram.messenger.g0.L(23.0f) + L2);
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, lcVar.f9272f);
        int i12 = (int) (d * f12);
        Paint paint = this.h;
        paint.setAlpha(i12);
        if (this.f9210f != null) {
            Matrix matrix = this.f9211g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f9210f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, paint);
        wy0 wy0Var = this.f9218o;
        wy0Var.c(L - (wy0Var.f41763c / f11), org.telegram.messenger.g0.L(23.0f) + L2, d, -1, canvas);
        wy0 wy0Var2 = this.f9217n;
        wy0Var2.f41774p = width - org.telegram.messenger.g0.L(4.0f);
        wy0Var2.c(L - (this.f9217n.k() / f11), org.telegram.messenger.g0.L(42.0f) + L2, d, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, lcVar.f9276w.f9329m1), canvas);
        if (this.v > 0) {
            int i13 = (int) L;
            int i14 = (int) L2;
            this.f9223t.setBounds(i13 - org.telegram.messenger.g0.L(12.0f), i14 - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(12.0f) + i13, i14 - org.telegram.messenger.g0.L(16.0f));
            this.f9222s.setBounds(i13 - org.telegram.messenger.g0.L(12.0f), i14 - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(12.0f) + i13, i14 - org.telegram.messenger.g0.L(16.0f));
            this.f9223t.setAlpha(i12);
            this.f9222s.setAlpha(i12);
            this.f9223t.draw(canvas);
            this.f9222s.draw(canvas);
            wy0 wy0Var3 = this.f9224u;
            wy0Var3.c(L - (wy0Var3.f41763c / f11), L2 - org.telegram.messenger.g0.L(27.0f), d, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j3) {
        long j10;
        boolean z10;
        String str;
        String str2;
        lc lcVar = this.f9225w;
        mc mcVar = lcVar.f9276w;
        if (this.f9212i) {
            if (this.f9219p) {
                j10 = 2666000;
            } else if (this.f9213j == i10.i(mcVar.n1).e()) {
                j10 = 0;
            } else {
                j10 = this.f9213j;
            }
            if (j10 != j3) {
                int i7 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
                if (i7 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f9219p = z10;
                if (j3 == 0 || i7 == 0) {
                    j3 = i10.i(mcVar.n1).e();
                }
                this.f9213j = j3;
                if (this.f9219p) {
                    str2 = gd.N0(2131744807, null);
                } else {
                    int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                    ImageReceiver imageReceiver = this.f9214k;
                    org.telegram.ui.Components.a9 a9Var = this.f9215l;
                    if (i10 >= 0) {
                        TLRPC.User c22 = mp.u1(mcVar.n1).c2(Long.valueOf(this.f9213j));
                        str = n10.l(c22);
                        a9Var.r(c22);
                        imageReceiver.j0(c22, a9Var, null);
                    } else {
                        TLRPC.Chat O0 = mp.u1(mcVar.n1).O0(Long.valueOf(-this.f9213j));
                        if (O0 == null) {
                            str = "";
                        } else {
                            str = O0.title;
                        }
                        a9Var.q(O0);
                        imageReceiver.j0(O0, a9Var, null);
                    }
                    str2 = str;
                }
                this.f9217n = new wy0(str2, 12.0f, null);
                lcVar.invalidate();
            }
        }
    }
}
