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
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.xy0;
public final class kc {
    public int f9242a;
    public final RectF f9243b;
    public final org.telegram.ui.Components.d6 f9244c;
    public final org.telegram.ui.Components.d6 d;
    public final org.telegram.ui.Components.d6 f9245e;
    public LinearGradient f9246f;
    public final Matrix f9247g;
    public final Paint h;
    public final boolean f9248i;
    public long f9249j;
    public final ImageReceiver f9250k;
    public final org.telegram.ui.Components.b9 f9251l;
    public final org.telegram.ui.Components.b9 f9252m;
    public xy0 f9253n;
    public xy0 f9254o;
    public boolean f9255p;
    public final org.telegram.ui.Components.mc f9256q;
    public int f9257r;
    public Drawable f9258s;
    public Drawable f9259t;
    public xy0 f9260u;
    public int v;
    public final lc f9261w;

    public kc(lc lcVar, boolean z10, long j3) {
        String str;
        mc mcVar = lcVar.f9312w;
        this.f9261w = lcVar;
        this.f9243b = new RectF();
        nr nrVar = nr.h;
        this.f9244c = new org.telegram.ui.Components.d6(lcVar, 0L, 600L, nrVar);
        this.d = new org.telegram.ui.Components.d6(lcVar, 0L, 200L, nrVar);
        this.f9245e = new org.telegram.ui.Components.d6(lcVar, 0L, 350L, nrVar);
        this.f9246f = null;
        this.f9247g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(lcVar);
        this.f9250k = imageReceiver;
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        this.f9251l = b9Var;
        org.telegram.ui.Components.b9 b9Var2 = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        this.f9252m = b9Var2;
        this.f9256q = new org.telegram.ui.Components.mc(lcVar);
        this.f9248i = z10;
        this.f9249j = j3;
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
        b9Var2.h(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29362c8, mcVar.f9365m1));
        this.f9253n = new xy0(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        boolean z10 = false;
        float e10 = this.f9244c.e(false, this.f9242a);
        int i7 = this.f9242a;
        lc lcVar = this.f9261w;
        if (i7 >= 0 && i7 < lcVar.d.size()) {
            z10 = true;
        }
        float d = this.d.d(z10);
        canvas.save();
        float width = (lcVar.getWidth() - org.telegram.messenger.g0.L(80.0f)) / Math.max(1.0f, lcVar.f9309n);
        float L = ((lcVar.f9309n - (e10 + 0.5f)) * width) + org.telegram.messenger.g0.L(40.0f);
        float L2 = org.telegram.messenger.g0.L(40.0f);
        float f13 = width / 2.0f;
        this.f9243b.set(L - f13, L2 - org.telegram.messenger.g0.L(50.0f), f13 + L, org.telegram.messenger.g0.L(50.0f) + L2);
        float f14 = (0.3f * d) + 0.7f;
        canvas.scale(f14, f14, L, L2);
        float a10 = this.f9256q.a(0.04f);
        canvas.scale(a10, a10, L, L2);
        if (d > 0.0f) {
            float d2 = this.f9245e.d(this.f9255p);
            if (d2 < 1.0f) {
                f12 = 255.0f;
                f10 = 40.0f;
                f11 = 2.0f;
                ImageReceiver imageReceiver = this.f9250k;
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
                org.telegram.ui.Components.b9 b9Var = this.f9252m;
                b9Var.setBounds(L3, L4, L5, L6);
                b9Var.f33817y = (int) (d * f12 * d2);
                b9Var.draw(canvas);
                b9Var.f33817y = 255;
            }
        } else {
            f10 = 40.0f;
            f11 = 2.0f;
            f12 = 255.0f;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((L - (this.f9254o.f42254c / f11)) - org.telegram.messenger.g0.L(5.66f), (org.telegram.messenger.g0.L(23.0f) + L2) - (org.telegram.messenger.g0.L(16.0f) / f11), (this.f9254o.f42254c / f11) + L + org.telegram.messenger.g0.L(5.66f), (org.telegram.messenger.g0.L(16.0f) / f11) + org.telegram.messenger.g0.L(23.0f) + L2);
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, lcVar.f9308f);
        int i12 = (int) (d * f12);
        Paint paint = this.h;
        paint.setAlpha(i12);
        if (this.f9246f != null) {
            Matrix matrix = this.f9247g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f9246f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, paint);
        xy0 xy0Var = this.f9254o;
        xy0Var.c(L - (xy0Var.f42254c / f11), org.telegram.messenger.g0.L(23.0f) + L2, d, -1, canvas);
        xy0 xy0Var2 = this.f9253n;
        xy0Var2.f42265p = width - org.telegram.messenger.g0.L(4.0f);
        xy0Var2.c(L - (this.f9253n.k() / f11), org.telegram.messenger.g0.L(42.0f) + L2, d, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, lcVar.f9312w.f9365m1), canvas);
        if (this.v > 0) {
            int i13 = (int) L;
            int i14 = (int) L2;
            this.f9259t.setBounds(i13 - org.telegram.messenger.g0.L(12.0f), i14 - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(12.0f) + i13, i14 - org.telegram.messenger.g0.L(16.0f));
            this.f9258s.setBounds(i13 - org.telegram.messenger.g0.L(12.0f), i14 - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(12.0f) + i13, i14 - org.telegram.messenger.g0.L(16.0f));
            this.f9259t.setAlpha(i12);
            this.f9258s.setAlpha(i12);
            this.f9259t.draw(canvas);
            this.f9258s.draw(canvas);
            xy0 xy0Var3 = this.f9260u;
            xy0Var3.c(L - (xy0Var3.f42254c / f11), L2 - org.telegram.messenger.g0.L(27.0f), d, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j3) {
        long j10;
        boolean z10;
        String str;
        String str2;
        lc lcVar = this.f9261w;
        mc mcVar = lcVar.f9312w;
        if (this.f9248i) {
            if (this.f9255p) {
                j10 = 2666000;
            } else if (this.f9249j == j10.i(mcVar.n1).e()) {
                j10 = 0;
            } else {
                j10 = this.f9249j;
            }
            if (j10 != j3) {
                int i7 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
                if (i7 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f9255p = z10;
                if (j3 == 0 || i7 == 0) {
                    j3 = j10.i(mcVar.n1).e();
                }
                this.f9249j = j3;
                if (this.f9255p) {
                    str2 = gd.N0(2131744807, null);
                } else {
                    int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                    ImageReceiver imageReceiver = this.f9250k;
                    org.telegram.ui.Components.b9 b9Var = this.f9251l;
                    if (i10 >= 0) {
                        TLRPC.User c22 = mp.u1(mcVar.n1).c2(Long.valueOf(this.f9249j));
                        str = o10.l(c22);
                        b9Var.r(c22);
                        imageReceiver.i0(c22, b9Var, null);
                    } else {
                        TLRPC.Chat O0 = mp.u1(mcVar.n1).O0(Long.valueOf(-this.f9249j));
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
                this.f9253n = new xy0(str2, 12.0f, null);
                lcVar.invalidate();
            }
        }
    }
}
