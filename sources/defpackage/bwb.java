package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bwb {
    public final int a;
    public final View b;
    public final ylb c;
    public final boolean d;
    public uib e;
    public final ImageReceiver g;
    public vm h;
    public mo4 i;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public final Paint o;
    public final Path p;
    public final RectF q;
    public final u51 r;
    public Runnable s;
    public long t;
    public final pc0 f = new pc0((ylb) null);
    public final Path j = new Path();

    public bwb(int i, View view, ylb ylbVar, boolean z) {
        Paint paint = new Paint(1);
        this.o = paint;
        Path path = new Path();
        this.p = path;
        this.q = new RectF();
        this.a = i;
        this.b = view;
        this.c = ylbVar;
        this.d = z;
        this.r = new u51(view);
        this.g = new ImageReceiver(view);
        path.rewind();
        path.moveTo(-gm.L(1.75f), -gm.L(4.0f));
        path.lineTo(gm.L(1.75f), 0.0f);
        path.lineTo(-gm.L(1.75f), gm.L(4.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a() {
        this.g.I();
        vm vmVar = this.h;
        if (vmVar != null) {
            vmVar.b(this.b);
        }
    }

    public final void b() {
        this.g.K();
        vm vmVar = this.h;
        if (vmVar != null) {
            vmVar.o(this.b);
        }
    }

    public final void c(Canvas canvas, int i, float f, float f2, float f3, float f4, boolean z) {
        float f5;
        float f6;
        int i2;
        uib uibVar = this.e;
        if (uibVar != null) {
            uibVar.p = i - gm.L(144.66f);
            float j = this.e.j() + gm.L(48.66f);
            float f7 = i;
            float f8 = (f7 - j) / 2.0f;
            int i3 = this.l;
            int i4 = (int) j;
            boolean z2 = this.d;
            Path path = this.j;
            if (i3 == i4 && this.k == i && this.n == z && this.m == z2) {
                f6 = j;
                f5 = 2.0f;
            } else {
                path.rewind();
                RectF rectF = gm.P;
                f5 = 2.0f;
                rectF.set(f8, gm.L(4.5f), f8 + j, gm.L(28.5f));
                if (z) {
                    path.addRoundRect(rectF, gm.L(12.0f), gm.L(12.0f), Path.Direction.CW);
                }
                if (z2) {
                    float f9 = f7 / 2.0f;
                    float f10 = 1.833f;
                    float L = f9 - gm.L(1.833f);
                    while (L > 0.0f) {
                        RectF rectF2 = gm.P;
                        rectF2.set(L - gm.L(3.66f), gm.L(15.5f), L, gm.L(17.5f));
                        path.addRoundRect(rectF2, gm.L(1.0f), gm.L(1.0f), Path.Direction.CW);
                        L -= gm.L(8.33f);
                        f10 = f10;
                        f7 = f7;
                        j = j;
                    }
                    float f11 = f7;
                    f6 = j;
                    int L2 = gm.L(f10);
                    while (true) {
                        f9 += L2;
                        if (f9 >= f11) {
                            break;
                        }
                        RectF rectF3 = gm.P;
                        rectF3.set(f9, gm.L(15.5f), gm.L(3.66f) + f9, gm.L(17.5f));
                        path.addRoundRect(rectF3, gm.L(1.0f), gm.L(1.0f), Path.Direction.CW);
                        L2 = gm.L(8.33f);
                    }
                } else {
                    f6 = j;
                }
                this.l = i4;
                this.k = i;
                this.m = z2;
                this.n = z;
            }
            canvas.save();
            float f12 = f / f5;
            canvas.translate(f12, f2);
            ylb ylbVar = this.c;
            Paint U0 = cmb.U0("paintChatActionBackground", ylbVar);
            int alpha = U0.getAlpha();
            U0.setAlpha((int) (alpha * f4 * f3));
            canvas.drawPath(path, U0);
            U0.setAlpha(alpha);
            if (ylbVar != null ? ylbVar.g() : cmb.b1()) {
                Paint U02 = cmb.U0("paintChatActionBackgroundDarken", ylbVar);
                int alpha2 = U02.getAlpha();
                U02.setAlpha((int) (alpha2 * f4 * f3));
                canvas.drawPath(path, U02);
                U02.setAlpha(alpha2);
            }
            canvas.restore();
            float f13 = f12 + f8;
            float f14 = f13 + f6;
            this.q.set(f13 - gm.L(4.0f), f2 - gm.L(4.0f), gm.L(4.0f) + f14, gm.L(32.0f) + f2);
            if (z) {
                vm vmVar = this.h;
                if (vmVar != null) {
                    vmVar.setBounds((int) (gm.L(2.66f) + f13), (int) (gm.L(6.5f) + f2), (int) (gm.L(22.66f) + f13), (int) (gm.L(26.5f) + f2));
                    this.h.setAlpha((int) (255.0f * f4));
                    this.h.draw(canvas);
                } else {
                    mo4 mo4Var = this.i;
                    if (mo4Var != null) {
                        mo4Var.a(cmb.v0(cmb.u8, ylbVar));
                    }
                    ImageReceiver imageReceiver = this.g;
                    imageReceiver.i0(gm.L(2.66f) + f13, gm.L(6.5f) + f2, gm.L(20.0f), gm.L(20.0f));
                    imageReceiver.setAlpha(f4);
                    imageReceiver.h(canvas, null);
                }
                if (cmb.g1(ylbVar)) {
                    i2 = cmb.ya;
                } else {
                    i2 = cmb.Yc;
                }
                int v0 = cmb.v0(i2, ylbVar);
                this.e.c(f13 + gm.L(27.66f), gm.L(16.5f) + f2, f4, v0, canvas);
                canvas.save();
                canvas.translate(f14 - gm.L(11.25f), gm.L(16.5f) + f2);
                int p1 = cmb.p1(0.75f * f4, v0);
                Paint paint = this.o;
                paint.setColor(p1);
                paint.setStrokeWidth(gm.L(1.66f));
                canvas.drawPath(this.p, paint);
                canvas.restore();
            }
        }
    }

    public final boolean d(android.view.MotionEvent r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwb.d(android.view.MotionEvent, boolean):boolean");
    }

    public final boolean e(k47 k47Var) {
        vm vmVar = this.h;
        View view = this.b;
        uib uibVar = null;
        if (vmVar != null) {
            vmVar.o(view);
            this.h = null;
        }
        this.l = 0;
        this.t = 0L;
        this.i = null;
        if (k47Var == null) {
            this.e = null;
            this.t = 0L;
        } else {
            int i = this.a;
            boolean p0 = sd2.p0(oc7.r1(i).L0(Long.valueOf(-k47.B0(k47Var.k))));
            ImageReceiver imageReceiver = this.g;
            if (p0) {
                imageReceiver.q0(gm.L(10.0f));
                long u1 = k47.u1(k47Var.k);
                TLObject a2 = oc7.r1(i).a2(u1);
                this.t = u1;
                if (a2 == null) {
                    this.e = null;
                    return false;
                }
                pc0 pc0Var = this.f;
                pc0Var.k(a2);
                imageReceiver.U(a2, pc0Var, null);
                uibVar = new uib(pg3.l(a2), 14.0f, gm.o());
                this.e = uibVar;
            } else {
                imageReceiver.q0(0);
                long Y1 = k47Var.Y1();
                this.t = Y1;
                TLRPC.TL_forumTopic f = oc7.r1(i).g4.f(-k47.B0(k47Var.k), Y1);
                if (f == null) {
                    this.e = null;
                    return false;
                }
                if (Y1 == 1) {
                    mo4 d = no4.d(view.getContext(), 0.75f, cmb.v0(cmb.u8, this.c), false);
                    this.i = d;
                    imageReceiver.g0(d);
                } else if (f.icon_emoji_id != 0) {
                    this.h = new vm(0, i, f.icon_emoji_id);
                    imageReceiver.K();
                    this.h.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                } else {
                    imageReceiver.g0(no4.f(f));
                }
                uibVar = new uib(f.title, 14.0f, gm.o());
                this.e = uibVar;
            }
        }
        if (uibVar == null) {
            return false;
        }
        return true;
    }
}
