package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class cya {
    public int a;
    public final RectF b = new RectF();
    public final ln c;
    public final ln d;
    public final ln e;
    public LinearGradient f;
    public final Matrix g;
    public final Paint h;
    public final boolean i;
    public long j;
    public final ImageReceiver k;
    public final pc0 l;
    public final pc0 m;
    public uib n;
    public uib o;
    public boolean p;
    public final u51 q;
    public int r;
    public Drawable s;
    public Drawable t;
    public uib u;
    public int v;
    public final dya w;

    public cya(dya dyaVar, boolean z, long j) {
        String str;
        this.w = dyaVar;
        d53 d53Var = d53.h;
        this.c = new ln(dyaVar, 0L, 600L, d53Var);
        this.d = new ln(dyaVar, 0L, 200L, d53Var);
        this.e = new ln(dyaVar, 0L, 350L, d53Var);
        this.f = null;
        this.g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(dyaVar);
        this.k = imageReceiver;
        pc0 pc0Var = new pc0((ylb) null);
        this.l = pc0Var;
        pc0 pc0Var2 = new pc0((ylb) null);
        this.m = pc0Var2;
        this.q = new u51(dyaVar);
        this.i = z;
        this.j = j;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        eya eyaVar = dyaVar.w;
        if (i >= 0) {
            TLRPC.User W1 = oc7.r1(eyaVar.m1).W1(Long.valueOf(j));
            str = m9c.l(W1);
            pc0Var.q(W1);
            imageReceiver.U(W1, pc0Var, null);
        } else {
            TLRPC.Chat L0 = oc7.r1(eyaVar.m1).L0(Long.valueOf(-j));
            if (L0 == null) {
                str = "";
            } else {
                str = L0.title;
            }
            pc0Var.p(L0);
            imageReceiver.U(L0, pc0Var, null);
        }
        imageReceiver.q0(gm.L(56.0f));
        imageReceiver.I();
        imageReceiver.B0 = true;
        pc0Var2.f(21);
        pc0Var2.g(cmb.v0(cmb.b8, eyaVar.l1));
        this.n = new uib(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f;
        float f2;
        float f3;
        boolean z = false;
        float e = this.c.e(false, this.a);
        int i = this.a;
        dya dyaVar = this.w;
        if (i >= 0 && i < dyaVar.d.size()) {
            z = true;
        }
        float d = this.d.d(z);
        canvas.save();
        float width = (dyaVar.getWidth() - gm.L(80.0f)) / Math.max(1.0f, dyaVar.n);
        float L = ((dyaVar.n - (e + 0.5f)) * width) + gm.L(40.0f);
        float L2 = gm.L(40.0f);
        float f4 = width / 2.0f;
        this.b.set(L - f4, L2 - gm.L(50.0f), f4 + L, gm.L(50.0f) + L2);
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
                imageReceiver.i0(L - (gm.L(56.0f) / 2.0f), L2 - (gm.L(56.0f) / 2.0f), gm.L(56.0f), gm.L(56.0f));
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
                int L3 = i2 - (gm.L(56.0f) / 2);
                int i3 = (int) L2;
                int L4 = i3 - (gm.L(56.0f) / 2);
                int L5 = (gm.L(56.0f) / 2) + i2;
                int L6 = (gm.L(56.0f) / 2) + i3;
                pc0 pc0Var = this.m;
                pc0Var.setBounds(L3, L4, L5, L6);
                pc0Var.y = (int) (d * f3 * d2);
                pc0Var.draw(canvas);
                pc0Var.y = 255;
            }
        } else {
            f = 40.0f;
            f2 = 2.0f;
            f3 = 255.0f;
        }
        RectF rectF = gm.P;
        rectF.set((L - (this.o.c / f2)) - gm.L(5.66f), (gm.L(23.0f) + L2) - (gm.L(16.0f) / f2), (this.o.c / f2) + L + gm.L(5.66f), (gm.L(16.0f) / f2) + gm.L(23.0f) + L2);
        canvas.drawRoundRect(rectF, rectF.height() / f2, rectF.height() / f2, dyaVar.f);
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
        uib uibVar = this.o;
        uibVar.c(L - (uibVar.c / f2), gm.L(23.0f) + L2, d, -1, canvas);
        uib uibVar2 = this.n;
        uibVar2.p = width - gm.L(4.0f);
        uibVar2.c(L - (this.n.j() / f2), gm.L(42.0f) + L2, d, cmb.v0(cmb.F6, dyaVar.w.l1), canvas);
        if (this.v > 0) {
            int i5 = (int) L;
            int i6 = (int) L2;
            this.t.setBounds(i5 - gm.L(12.0f), i6 - gm.L(f), gm.L(12.0f) + i5, i6 - gm.L(16.0f));
            this.s.setBounds(i5 - gm.L(12.0f), i6 - gm.L(f), gm.L(12.0f) + i5, i6 - gm.L(16.0f));
            this.t.setAlpha(i4);
            this.s.setAlpha(i4);
            this.t.draw(canvas);
            this.s.draw(canvas);
            uib uibVar3 = this.u;
            uibVar3.c(L - (uibVar3.c / f2), L2 - gm.L(27.0f), d, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j) {
        long j2;
        boolean z;
        String str;
        String str2;
        dya dyaVar = this.w;
        eya eyaVar = dyaVar.w;
        if (this.i) {
            if (this.p) {
                j2 = 2666000;
            } else if (this.j == z8c.h(eyaVar.m1).e()) {
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
                    j = z8c.h(eyaVar.m1).e();
                }
                this.j = j;
                if (this.p) {
                    str2 = jb6.M0(2131744737, null);
                } else {
                    int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                    ImageReceiver imageReceiver = this.k;
                    pc0 pc0Var = this.l;
                    if (i2 >= 0) {
                        TLRPC.User W1 = oc7.r1(eyaVar.m1).W1(Long.valueOf(this.j));
                        str = m9c.l(W1);
                        pc0Var.q(W1);
                        imageReceiver.U(W1, pc0Var, null);
                    } else {
                        TLRPC.Chat L0 = oc7.r1(eyaVar.m1).L0(Long.valueOf(-this.j));
                        if (L0 == null) {
                            str = "";
                        } else {
                            str = L0.title;
                        }
                        pc0Var.p(L0);
                        imageReceiver.U(L0, pc0Var, null);
                    }
                    str2 = str;
                }
                this.n = new uib(str2, 12.0f, null);
                dyaVar.invalidate();
            }
        }
    }
}
