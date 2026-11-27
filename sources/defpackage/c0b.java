package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class c0b {
    public int a;
    public final RectF b = new RectF();
    public final mm c;
    public final mm d;
    public final mm e;
    public LinearGradient f;
    public final Matrix g;
    public final Paint h;
    public final boolean i;
    public long j;
    public final ImageReceiver k;
    public final rb0 l;
    public final rb0 m;
    public pkb n;
    public pkb o;
    public boolean p;
    public final v41 q;
    public int r;
    public Drawable s;
    public Drawable t;
    public pkb u;
    public int v;
    public final d0b w;

    public c0b(d0b d0bVar, boolean z, long j) {
        String str;
        this.w = d0bVar;
        k43 k43Var = k43.h;
        this.c = new mm(d0bVar, 0L, 600L, k43Var);
        this.d = new mm(d0bVar, 0L, 200L, k43Var);
        this.e = new mm(d0bVar, 0L, 350L, k43Var);
        this.f = null;
        this.g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(d0bVar);
        this.k = imageReceiver;
        rb0 rb0Var = new rb0((vnb) null);
        this.l = rb0Var;
        rb0 rb0Var2 = new rb0((vnb) null);
        this.m = rb0Var2;
        this.q = new v41(d0bVar);
        this.i = z;
        this.j = j;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        e0b e0bVar = d0bVar.w;
        if (i >= 0) {
            TLRPC.User X1 = uc7.s1(e0bVar.m1).X1(Long.valueOf(j));
            str = lbc.l(X1);
            rb0Var.q(X1);
            imageReceiver.U(X1, rb0Var, null);
        } else {
            TLRPC.Chat M0 = uc7.s1(e0bVar.m1).M0(Long.valueOf(-j));
            if (M0 == null) {
                str = "";
            } else {
                str = M0.title;
            }
            rb0Var.p(M0);
            imageReceiver.U(M0, rb0Var, null);
        }
        imageReceiver.q0(hl.L(56.0f));
        imageReceiver.I();
        imageReceiver.B0 = true;
        rb0Var2.f(21);
        rb0Var2.g(aob.v0(aob.c8, e0bVar.l1));
        this.n = new pkb(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f;
        float f2;
        float f3;
        boolean z = false;
        float e = this.c.e(false, this.a);
        int i = this.a;
        d0b d0bVar = this.w;
        if (i >= 0 && i < d0bVar.d.size()) {
            z = true;
        }
        float d = this.d.d(z);
        canvas.save();
        float width = (d0bVar.getWidth() - hl.L(80.0f)) / Math.max(1.0f, d0bVar.n);
        float L = ((d0bVar.n - (e + 0.5f)) * width) + hl.L(40.0f);
        float L2 = hl.L(40.0f);
        float f4 = width / 2.0f;
        this.b.set(L - f4, L2 - hl.L(50.0f), f4 + L, hl.L(50.0f) + L2);
        float f5 = (0.3f * d) + 0.7f;
        canvas.scale(f5, f5, L, L2);
        float a = this.q.a(0.04f);
        canvas.scale(a, a, L, L2);
        if (d > 0.0f) {
            float d2 = this.e.d(this.p);
            if (d2 < 1.0f) {
                f3 = 255.0f;
                f = 40.0f;
                f2 = 2.0f;
                ImageReceiver imageReceiver = this.k;
                imageReceiver.i0(L - (hl.L(56.0f) / 2.0f), L2 - (hl.L(56.0f) / 2.0f), hl.L(56.0f), hl.L(56.0f));
                imageReceiver.setAlpha(d);
                imageReceiver.h(canvas, null);
                imageReceiver.setAlpha(1.0f);
            } else {
                f = 40.0f;
                f2 = 2.0f;
                f3 = 255.0f;
            }
            if (d2 > 0.0f) {
                int i2 = (int) L;
                int L3 = i2 - (hl.L(56.0f) / 2);
                int i3 = (int) L2;
                int L4 = i3 - (hl.L(56.0f) / 2);
                int L5 = (hl.L(56.0f) / 2) + i2;
                int L6 = (hl.L(56.0f) / 2) + i3;
                rb0 rb0Var = this.m;
                rb0Var.setBounds(L3, L4, L5, L6);
                rb0Var.y = (int) (d * f3 * d2);
                rb0Var.draw(canvas);
                rb0Var.y = 255;
            }
        } else {
            f = 40.0f;
            f2 = 2.0f;
            f3 = 255.0f;
        }
        RectF rectF = hl.P;
        rectF.set((L - (this.o.c / f2)) - hl.L(5.66f), (hl.L(23.0f) + L2) - (hl.L(16.0f) / f2), (this.o.c / f2) + L + hl.L(5.66f), (hl.L(16.0f) / f2) + hl.L(23.0f) + L2);
        canvas.drawRoundRect(rectF, rectF.height() / f2, rectF.height() / f2, d0bVar.f);
        int i4 = (int) (d * f3);
        Paint paint = this.h;
        paint.setAlpha(i4);
        if (this.f != null) {
            Matrix matrix = this.g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f2, rectF.height() / f2, paint);
        pkb pkbVar = this.o;
        pkbVar.c(L - (pkbVar.c / f2), hl.L(23.0f) + L2, d, -1, canvas);
        pkb pkbVar2 = this.n;
        pkbVar2.p = width - hl.L(4.0f);
        pkbVar2.c(L - (this.n.j() / f2), hl.L(42.0f) + L2, d, aob.v0(aob.G6, d0bVar.w.l1), canvas);
        if (this.v > 0) {
            int i5 = (int) L;
            int i6 = (int) L2;
            this.t.setBounds(i5 - hl.L(12.0f), i6 - hl.L(f), hl.L(12.0f) + i5, i6 - hl.L(16.0f));
            this.s.setBounds(i5 - hl.L(12.0f), i6 - hl.L(f), hl.L(12.0f) + i5, i6 - hl.L(16.0f));
            this.t.setAlpha(i4);
            this.s.setAlpha(i4);
            this.t.draw(canvas);
            this.s.draw(canvas);
            pkb pkbVar3 = this.u;
            pkbVar3.c(L - (pkbVar3.c / f2), L2 - hl.L(27.0f), d, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j) {
        long j2;
        boolean z;
        String str;
        String str2;
        d0b d0bVar = this.w;
        e0b e0bVar = d0bVar.w;
        if (this.i) {
            if (this.p) {
                j2 = 2666000;
            } else if (this.j == yac.h(e0bVar.m1).e()) {
                j2 = 0;
            } else {
                j2 = this.j;
            }
            if (j2 != j) {
                int i = (j > 2666000L ? 1 : (j == 2666000L ? 0 : -1));
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.p = z;
                if (j == 0 || i == 0) {
                    j = yac.h(e0bVar.m1).e();
                }
                this.j = j;
                if (this.p) {
                    str2 = ob6.M0(2131744705, null);
                } else {
                    int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                    ImageReceiver imageReceiver = this.k;
                    rb0 rb0Var = this.l;
                    if (i2 >= 0) {
                        TLRPC.User X1 = uc7.s1(e0bVar.m1).X1(Long.valueOf(this.j));
                        str = lbc.l(X1);
                        rb0Var.q(X1);
                        imageReceiver.U(X1, rb0Var, null);
                    } else {
                        TLRPC.Chat M0 = uc7.s1(e0bVar.m1).M0(Long.valueOf(-this.j));
                        if (M0 == null) {
                            str = "";
                        } else {
                            str = M0.title;
                        }
                        rb0Var.p(M0);
                        imageReceiver.U(M0, rb0Var, null);
                    }
                    str2 = str;
                }
                this.n = new pkb(str2, 12.0f, null);
                d0bVar.invalidate();
            }
        }
    }
}
