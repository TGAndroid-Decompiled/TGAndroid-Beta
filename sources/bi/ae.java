package bi;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.xq;
public final class ae {
    public int f3473a;
    public final RectF f3474b;
    public final org.telegram.ui.Components.w5 f3475c;
    public final org.telegram.ui.Components.w5 d;
    public final org.telegram.ui.Components.w5 f3476e;
    public LinearGradient f3477f;
    public final Matrix f3478g;
    public final Paint h;
    public final boolean f3479i;
    public long f3480j;
    public final ImageReceiver f3481k;
    public final org.telegram.ui.Components.w8 f3482l;
    public final org.telegram.ui.Components.w8 f3483m;
    public my0 f3484n;
    public my0 f3485o;
    public boolean f3486p;
    public final org.telegram.ui.Components.ic f3487q;
    public int f3488r;
    public Drawable f3489s;
    public Drawable f3490t;
    public my0 f3491u;
    public int v;
    public final be f3492w;

    public ae(be beVar, boolean z9, long j3) {
        String str;
        ce ceVar = beVar.f3543w;
        this.f3492w = beVar;
        this.f3474b = new RectF();
        xq xqVar = xq.h;
        this.f3475c = new org.telegram.ui.Components.w5(beVar, 0L, 600L, xqVar);
        this.d = new org.telegram.ui.Components.w5(beVar, 0L, 200L, xqVar);
        this.f3476e = new org.telegram.ui.Components.w5(beVar, 0L, 350L, xqVar);
        this.f3477f = null;
        this.f3478g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(beVar);
        this.f3481k = imageReceiver;
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        this.f3482l = w8Var;
        org.telegram.ui.Components.w8 w8Var2 = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        this.f3483m = w8Var2;
        this.f3487q = new org.telegram.ui.Components.ic(beVar);
        this.f3479i = z9;
        this.f3480j = j3;
        if (j3 >= 0) {
            TLRPC.User a22 = qp.s1(ceVar.f3615j1).a2(Long.valueOf(j3));
            str = t10.k(a22);
            w8Var.r(a22);
            imageReceiver.i0(a22, w8Var, null);
        } else {
            TLRPC.Chat M0 = qp.s1(ceVar.f3615j1).M0(Long.valueOf(-j3));
            if (M0 == null) {
                str = "";
            } else {
                str = M0.title;
            }
            w8Var.q(M0);
            imageReceiver.i0(M0, w8Var, null);
        }
        imageReceiver.J0(org.telegram.messenger.g0.L(56.0f));
        imageReceiver.P();
        imageReceiver.A0 = true;
        w8Var2.g(21);
        w8Var2.h(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27833c8, ceVar.f3614i1));
        this.f3484n = new my0(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        boolean z9 = false;
        float e10 = this.f3475c.e(false, this.f3473a);
        int i7 = this.f3473a;
        be beVar = this.f3492w;
        if (i7 >= 0 && i7 < beVar.d.size()) {
            z9 = true;
        }
        float d = this.d.d(z9);
        canvas.save();
        float width = (beVar.getWidth() - org.telegram.messenger.g0.L(80.0f)) / Math.max(1.0f, beVar.f3540n);
        float L = ((beVar.f3540n - (e10 + 0.5f)) * width) + org.telegram.messenger.g0.L(40.0f);
        float L2 = org.telegram.messenger.g0.L(40.0f);
        float f13 = width / 2.0f;
        this.f3474b.set(L - f13, L2 - org.telegram.messenger.g0.L(50.0f), f13 + L, org.telegram.messenger.g0.L(50.0f) + L2);
        float f14 = (0.3f * d) + 0.7f;
        canvas.scale(f14, f14, L, L2);
        float a10 = this.f3487q.a(0.04f);
        canvas.scale(a10, a10, L, L2);
        if (d > 0.0f) {
            float d2 = this.f3476e.d(this.f3486p);
            if (d2 < 1.0f) {
                f12 = 255.0f;
                f10 = 40.0f;
                f11 = 2.0f;
                ImageReceiver imageReceiver = this.f3481k;
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
                org.telegram.ui.Components.w8 w8Var = this.f3483m;
                w8Var.setBounds(L3, L4, L5, L6);
                w8Var.f39928y = (int) (d * f12 * d2);
                w8Var.draw(canvas);
                w8Var.f39928y = 255;
            }
        } else {
            f10 = 40.0f;
            f11 = 2.0f;
            f12 = 255.0f;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((L - (this.f3485o.f36125c / f11)) - org.telegram.messenger.g0.L(5.66f), (org.telegram.messenger.g0.L(23.0f) + L2) - (org.telegram.messenger.g0.L(16.0f) / f11), (this.f3485o.f36125c / f11) + L + org.telegram.messenger.g0.L(5.66f), (org.telegram.messenger.g0.L(16.0f) / f11) + org.telegram.messenger.g0.L(23.0f) + L2);
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, beVar.f3539f);
        int i12 = (int) (d * f12);
        Paint paint = this.h;
        paint.setAlpha(i12);
        if (this.f3477f != null) {
            Matrix matrix = this.f3478g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f3477f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, paint);
        my0 my0Var = this.f3485o;
        my0Var.c(L - (my0Var.f36125c / f11), org.telegram.messenger.g0.L(23.0f) + L2, d, -1, canvas);
        my0 my0Var2 = this.f3484n;
        my0Var2.f36136p = width - org.telegram.messenger.g0.L(4.0f);
        my0Var2.c(L - (this.f3484n.k() / f11), org.telegram.messenger.g0.L(42.0f) + L2, d, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, beVar.f3543w.f3614i1), canvas);
        if (this.v > 0) {
            int i13 = (int) L;
            int i14 = (int) L2;
            this.f3490t.setBounds(i13 - org.telegram.messenger.g0.L(12.0f), i14 - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(12.0f) + i13, i14 - org.telegram.messenger.g0.L(16.0f));
            this.f3489s.setBounds(i13 - org.telegram.messenger.g0.L(12.0f), i14 - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(12.0f) + i13, i14 - org.telegram.messenger.g0.L(16.0f));
            this.f3490t.setAlpha(i12);
            this.f3489s.setAlpha(i12);
            this.f3490t.draw(canvas);
            this.f3489s.draw(canvas);
            my0 my0Var3 = this.f3491u;
            my0Var3.c(L - (my0Var3.f36125c / f11), L2 - org.telegram.messenger.g0.L(27.0f), d, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j3) {
        long j10;
        boolean z9;
        String str;
        String str2;
        be beVar = this.f3492w;
        ce ceVar = beVar.f3543w;
        if (this.f3479i) {
            if (this.f3486p) {
                j10 = 2666000;
            } else if (this.f3480j == p10.i(ceVar.f3615j1).e()) {
                j10 = 0;
            } else {
                j10 = this.f3480j;
            }
            if (j10 != j3) {
                int i7 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
                if (i7 == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.f3486p = z9;
                if (j3 == 0 || i7 == 0) {
                    j3 = p10.i(ceVar.f3615j1).e();
                }
                this.f3480j = j3;
                if (this.f3486p) {
                    str2 = org.telegram.messenger.hd.M0(2131745049, null);
                } else {
                    int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                    ImageReceiver imageReceiver = this.f3481k;
                    org.telegram.ui.Components.w8 w8Var = this.f3482l;
                    if (i10 >= 0) {
                        TLRPC.User a22 = qp.s1(ceVar.f3615j1).a2(Long.valueOf(this.f3480j));
                        str = t10.k(a22);
                        w8Var.r(a22);
                        imageReceiver.i0(a22, w8Var, null);
                    } else {
                        TLRPC.Chat M0 = qp.s1(ceVar.f3615j1).M0(Long.valueOf(-this.f3480j));
                        if (M0 == null) {
                            str = "";
                        } else {
                            str = M0.title;
                        }
                        w8Var.q(M0);
                        imageReceiver.i0(M0, w8Var, null);
                    }
                    str2 = str;
                }
                this.f3484n = new my0(str2, 12.0f, null);
                beVar.invalidate();
            }
        }
    }
}
