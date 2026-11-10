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
import org.telegram.ui.Components.wq;
public final class ae {
    public int f3476a;
    public final RectF f3477b;
    public final org.telegram.ui.Components.v5 f3478c;
    public final org.telegram.ui.Components.v5 d;
    public final org.telegram.ui.Components.v5 f3479e;
    public LinearGradient f3480f;
    public final Matrix f3481g;
    public final Paint h;
    public final boolean f3482i;
    public long f3483j;
    public final ImageReceiver f3484k;
    public final org.telegram.ui.Components.v8 f3485l;
    public final org.telegram.ui.Components.v8 f3486m;
    public my0 f3487n;
    public my0 f3488o;
    public boolean f3489p;
    public final org.telegram.ui.Components.hc f3490q;
    public int f3491r;
    public Drawable f3492s;
    public Drawable f3493t;
    public my0 f3494u;
    public int v;
    public final be f3495w;

    public ae(be beVar, boolean z9, long j3) {
        String str;
        ce ceVar = beVar.f3546w;
        this.f3495w = beVar;
        this.f3477b = new RectF();
        wq wqVar = wq.h;
        this.f3478c = new org.telegram.ui.Components.v5(beVar, 0L, 600L, wqVar);
        this.d = new org.telegram.ui.Components.v5(beVar, 0L, 200L, wqVar);
        this.f3479e = new org.telegram.ui.Components.v5(beVar, 0L, 350L, wqVar);
        this.f3480f = null;
        this.f3481g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(beVar);
        this.f3484k = imageReceiver;
        org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        this.f3485l = v8Var;
        org.telegram.ui.Components.v8 v8Var2 = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        this.f3486m = v8Var2;
        this.f3490q = new org.telegram.ui.Components.hc(beVar);
        this.f3482i = z9;
        this.f3483j = j3;
        if (j3 >= 0) {
            TLRPC.User a22 = qp.s1(ceVar.f3617m1).a2(Long.valueOf(j3));
            str = t10.k(a22);
            v8Var.r(a22);
            imageReceiver.i0(a22, v8Var, null);
        } else {
            TLRPC.Chat M0 = qp.s1(ceVar.f3617m1).M0(Long.valueOf(-j3));
            if (M0 == null) {
                str = "";
            } else {
                str = M0.title;
            }
            v8Var.q(M0);
            imageReceiver.i0(M0, v8Var, null);
        }
        imageReceiver.J0(org.telegram.messenger.g0.L(56.0f));
        imageReceiver.P();
        imageReceiver.A0 = true;
        v8Var2.g(21);
        v8Var2.h(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27874c8, ceVar.l1));
        this.f3487n = new my0(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        boolean z9 = false;
        float e10 = this.f3478c.e(false, this.f3476a);
        int i7 = this.f3476a;
        be beVar = this.f3495w;
        if (i7 >= 0 && i7 < beVar.d.size()) {
            z9 = true;
        }
        float d = this.d.d(z9);
        canvas.save();
        float width = (beVar.getWidth() - org.telegram.messenger.g0.L(80.0f)) / Math.max(1.0f, beVar.f3543n);
        float L = ((beVar.f3543n - (e10 + 0.5f)) * width) + org.telegram.messenger.g0.L(40.0f);
        float L2 = org.telegram.messenger.g0.L(40.0f);
        float f13 = width / 2.0f;
        this.f3477b.set(L - f13, L2 - org.telegram.messenger.g0.L(50.0f), f13 + L, org.telegram.messenger.g0.L(50.0f) + L2);
        float f14 = (0.3f * d) + 0.7f;
        canvas.scale(f14, f14, L, L2);
        float a10 = this.f3490q.a(0.04f);
        canvas.scale(a10, a10, L, L2);
        if (d > 0.0f) {
            float d2 = this.f3479e.d(this.f3489p);
            if (d2 < 1.0f) {
                f12 = 255.0f;
                f10 = 40.0f;
                f11 = 2.0f;
                ImageReceiver imageReceiver = this.f3484k;
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
                org.telegram.ui.Components.v8 v8Var = this.f3486m;
                v8Var.setBounds(L3, L4, L5, L6);
                v8Var.f38933y = (int) (d * f12 * d2);
                v8Var.draw(canvas);
                v8Var.f38933y = 255;
            }
        } else {
            f10 = 40.0f;
            f11 = 2.0f;
            f12 = 255.0f;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((L - (this.f3488o.f36133c / f11)) - org.telegram.messenger.g0.L(5.66f), (org.telegram.messenger.g0.L(23.0f) + L2) - (org.telegram.messenger.g0.L(16.0f) / f11), (this.f3488o.f36133c / f11) + L + org.telegram.messenger.g0.L(5.66f), (org.telegram.messenger.g0.L(16.0f) / f11) + org.telegram.messenger.g0.L(23.0f) + L2);
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, beVar.f3542f);
        int i12 = (int) (d * f12);
        Paint paint = this.h;
        paint.setAlpha(i12);
        if (this.f3480f != null) {
            Matrix matrix = this.f3481g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f3480f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, paint);
        my0 my0Var = this.f3488o;
        my0Var.c(L - (my0Var.f36133c / f11), org.telegram.messenger.g0.L(23.0f) + L2, d, -1, canvas);
        my0 my0Var2 = this.f3487n;
        my0Var2.f36144p = width - org.telegram.messenger.g0.L(4.0f);
        my0Var2.c(L - (this.f3487n.k() / f11), org.telegram.messenger.g0.L(42.0f) + L2, d, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, beVar.f3546w.l1), canvas);
        if (this.v > 0) {
            int i13 = (int) L;
            int i14 = (int) L2;
            this.f3493t.setBounds(i13 - org.telegram.messenger.g0.L(12.0f), i14 - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(12.0f) + i13, i14 - org.telegram.messenger.g0.L(16.0f));
            this.f3492s.setBounds(i13 - org.telegram.messenger.g0.L(12.0f), i14 - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(12.0f) + i13, i14 - org.telegram.messenger.g0.L(16.0f));
            this.f3493t.setAlpha(i12);
            this.f3492s.setAlpha(i12);
            this.f3493t.draw(canvas);
            this.f3492s.draw(canvas);
            my0 my0Var3 = this.f3494u;
            my0Var3.c(L - (my0Var3.f36133c / f11), L2 - org.telegram.messenger.g0.L(27.0f), d, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j3) {
        long j10;
        boolean z9;
        String str;
        String str2;
        be beVar = this.f3495w;
        ce ceVar = beVar.f3546w;
        if (this.f3482i) {
            if (this.f3489p) {
                j10 = 2666000;
            } else if (this.f3483j == p10.i(ceVar.f3617m1).e()) {
                j10 = 0;
            } else {
                j10 = this.f3483j;
            }
            if (j10 != j3) {
                int i7 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
                if (i7 == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.f3489p = z9;
                if (j3 == 0 || i7 == 0) {
                    j3 = p10.i(ceVar.f3617m1).e();
                }
                this.f3483j = j3;
                if (this.f3489p) {
                    str2 = org.telegram.messenger.id.M0(2131745048, null);
                } else {
                    int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                    ImageReceiver imageReceiver = this.f3484k;
                    org.telegram.ui.Components.v8 v8Var = this.f3485l;
                    if (i10 >= 0) {
                        TLRPC.User a22 = qp.s1(ceVar.f3617m1).a2(Long.valueOf(this.f3483j));
                        str = t10.k(a22);
                        v8Var.r(a22);
                        imageReceiver.i0(a22, v8Var, null);
                    } else {
                        TLRPC.Chat M0 = qp.s1(ceVar.f3617m1).M0(Long.valueOf(-this.f3483j));
                        if (M0 == null) {
                            str = "";
                        } else {
                            str = M0.title;
                        }
                        v8Var.q(M0);
                        imageReceiver.i0(M0, v8Var, null);
                    }
                    str2 = str;
                }
                this.f3487n = new my0(str2, 12.0f, null);
                beVar.invalidate();
            }
        }
    }
}
