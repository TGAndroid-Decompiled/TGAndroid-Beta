package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class zva {
    public int a;
    public final RectF b = new RectF();
    public final lm c;
    public final lm d;
    public final lm e;
    public LinearGradient f;
    public final Matrix g;
    public final Paint h;
    public final boolean i;
    public long j;
    public final ImageReceiver k;
    public final pb0 l;
    public final pb0 m;
    public tgb n;
    public tgb o;
    public boolean p;
    public final n41 q;
    public int r;
    public Drawable s;
    public Drawable t;
    public tgb u;
    public int v;
    public final awa w;

    public zva(awa awaVar, boolean z, long j) {
        String str;
        this.w = awaVar;
        s33 s33Var = s33.h;
        this.c = new lm(awaVar, 0L, 600L, s33Var);
        this.d = new lm(awaVar, 0L, 200L, s33Var);
        this.e = new lm(awaVar, 0L, 350L, s33Var);
        this.f = null;
        this.g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(awaVar);
        this.k = imageReceiver;
        pb0 pb0Var = new pb0((wjb) null);
        this.l = pb0Var;
        pb0 pb0Var2 = new pb0((wjb) null);
        this.m = pb0Var2;
        this.q = new n41(awaVar);
        this.i = z;
        this.j = j;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        bwa bwaVar = awaVar.w;
        if (i >= 0) {
            TLRPC.User V1 = na7.q1(bwaVar.m1).V1(Long.valueOf(j));
            str = l7c.l(V1);
            pb0Var.q(V1);
            imageReceiver.U(V1, pb0Var, null);
        } else {
            TLRPC.Chat K0 = na7.q1(bwaVar.m1).K0(Long.valueOf(-j));
            if (K0 == null) {
                str = "";
            } else {
                str = K0.title;
            }
            pb0Var.p(K0);
            imageReceiver.U(K0, pb0Var, null);
        }
        imageReceiver.q0(gl.L(56.0f));
        imageReceiver.I();
        imageReceiver.B0 = true;
        pb0Var2.f(21);
        pb0Var2.g(bkb.v0(bkb.b8, bwaVar.l1));
        this.n = new tgb(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f;
        float f2;
        float f3;
        boolean z = false;
        float e = this.c.e(false, this.a);
        int i = this.a;
        awa awaVar = this.w;
        if (i >= 0 && i < awaVar.d.size()) {
            z = true;
        }
        float d = this.d.d(z);
        canvas.save();
        float width = (awaVar.getWidth() - gl.L(80.0f)) / Math.max(1.0f, awaVar.n);
        float L = ((awaVar.n - (e + 0.5f)) * width) + gl.L(40.0f);
        float L2 = gl.L(40.0f);
        float f4 = width / 2.0f;
        this.b.set(L - f4, L2 - gl.L(50.0f), f4 + L, gl.L(50.0f) + L2);
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
                imageReceiver.i0(L - (gl.L(56.0f) / 2.0f), L2 - (gl.L(56.0f) / 2.0f), gl.L(56.0f), gl.L(56.0f));
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
                int L3 = i2 - (gl.L(56.0f) / 2);
                int i3 = (int) L2;
                int L4 = i3 - (gl.L(56.0f) / 2);
                int L5 = (gl.L(56.0f) / 2) + i2;
                int L6 = (gl.L(56.0f) / 2) + i3;
                pb0 pb0Var = this.m;
                pb0Var.setBounds(L3, L4, L5, L6);
                pb0Var.y = (int) (d * f3 * d2);
                pb0Var.draw(canvas);
                pb0Var.y = 255;
            }
        } else {
            f = 40.0f;
            f2 = 2.0f;
            f3 = 255.0f;
        }
        RectF rectF = gl.P;
        rectF.set((L - (this.o.c / f2)) - gl.L(5.66f), (gl.L(23.0f) + L2) - (gl.L(16.0f) / f2), (this.o.c / f2) + L + gl.L(5.66f), (gl.L(16.0f) / f2) + gl.L(23.0f) + L2);
        canvas.drawRoundRect(rectF, rectF.height() / f2, rectF.height() / f2, awaVar.f);
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
        tgb tgbVar = this.o;
        tgbVar.c(L - (tgbVar.c / f2), gl.L(23.0f) + L2, d, -1, canvas);
        tgb tgbVar2 = this.n;
        tgbVar2.p = width - gl.L(4.0f);
        tgbVar2.c(L - (this.n.j() / f2), gl.L(42.0f) + L2, d, bkb.v0(bkb.F6, awaVar.w.l1), canvas);
        if (this.v > 0) {
            int i5 = (int) L;
            int i6 = (int) L2;
            this.t.setBounds(i5 - gl.L(12.0f), i6 - gl.L(f), gl.L(12.0f) + i5, i6 - gl.L(16.0f));
            this.s.setBounds(i5 - gl.L(12.0f), i6 - gl.L(f), gl.L(12.0f) + i5, i6 - gl.L(16.0f));
            this.t.setAlpha(i4);
            this.s.setAlpha(i4);
            this.t.draw(canvas);
            this.s.draw(canvas);
            tgb tgbVar3 = this.u;
            tgbVar3.c(L - (tgbVar3.c / f2), L2 - gl.L(27.0f), d, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j) {
        long j2;
        boolean z;
        String str;
        String str2;
        awa awaVar = this.w;
        bwa bwaVar = awaVar.w;
        if (this.i) {
            if (this.p) {
                j2 = 2666000;
            } else if (this.j == y6c.h(bwaVar.m1).e()) {
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
                    j = y6c.h(bwaVar.m1).e();
                }
                this.j = j;
                if (this.p) {
                    str2 = k96.M0(2131744811, null);
                } else {
                    int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                    ImageReceiver imageReceiver = this.k;
                    pb0 pb0Var = this.l;
                    if (i2 >= 0) {
                        TLRPC.User V1 = na7.q1(bwaVar.m1).V1(Long.valueOf(this.j));
                        str = l7c.l(V1);
                        pb0Var.q(V1);
                        imageReceiver.U(V1, pb0Var, null);
                    } else {
                        TLRPC.Chat K0 = na7.q1(bwaVar.m1).K0(Long.valueOf(-this.j));
                        if (K0 == null) {
                            str = "";
                        } else {
                            str = K0.title;
                        }
                        pb0Var.p(K0);
                        imageReceiver.U(K0, pb0Var, null);
                    }
                    str2 = str;
                }
                this.n = new tgb(str2, 12.0f, null);
                awaVar.invalidate();
            }
        }
    }
}
