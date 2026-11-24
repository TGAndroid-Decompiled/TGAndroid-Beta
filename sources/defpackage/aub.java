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
public final class aub {
    public final int a;
    public final View b;
    public final wjb c;
    public final boolean d;
    public tgb e;
    public final ImageReceiver g;
    public vl h;
    public lm4 i;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public final Paint o;
    public final Path p;
    public final RectF q;
    public final n41 r;
    public Runnable s;
    public long t;
    public final pb0 f = new pb0((wjb) null);
    public final Path j = new Path();

    public aub(int i, View view, wjb wjbVar, boolean z) {
        Paint paint = new Paint(1);
        this.o = paint;
        Path path = new Path();
        this.p = path;
        this.q = new RectF();
        this.a = i;
        this.b = view;
        this.c = wjbVar;
        this.d = z;
        this.r = new n41(view);
        this.g = new ImageReceiver(view);
        path.rewind();
        path.moveTo(-gl.L(1.75f), -gl.L(4.0f));
        path.lineTo(gl.L(1.75f), 0.0f);
        path.lineTo(-gl.L(1.75f), gl.L(4.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a() {
        this.g.I();
        vl vlVar = this.h;
        if (vlVar != null) {
            vlVar.b(this.b);
        }
    }

    public final void b() {
        this.g.K();
        vl vlVar = this.h;
        if (vlVar != null) {
            vlVar.o(this.b);
        }
    }

    public final void c(Canvas canvas, int i, float f, float f2, float f3, float f4, boolean z) {
        float f5;
        float f6;
        int i2;
        tgb tgbVar = this.e;
        if (tgbVar != null) {
            tgbVar.p = i - gl.L(144.66f);
            float j = this.e.j() + gl.L(48.66f);
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
                RectF rectF = gl.P;
                f5 = 2.0f;
                rectF.set(f8, gl.L(4.5f), f8 + j, gl.L(28.5f));
                if (z) {
                    path.addRoundRect(rectF, gl.L(12.0f), gl.L(12.0f), Path.Direction.CW);
                }
                if (z2) {
                    float f9 = f7 / 2.0f;
                    float f10 = 1.833f;
                    float L = f9 - gl.L(1.833f);
                    while (L > 0.0f) {
                        RectF rectF2 = gl.P;
                        rectF2.set(L - gl.L(3.66f), gl.L(15.5f), L, gl.L(17.5f));
                        path.addRoundRect(rectF2, gl.L(1.0f), gl.L(1.0f), Path.Direction.CW);
                        L -= gl.L(8.33f);
                        f10 = f10;
                        f7 = f7;
                        j = j;
                    }
                    float f11 = f7;
                    f6 = j;
                    int L2 = gl.L(f10);
                    while (true) {
                        f9 += L2;
                        if (f9 >= f11) {
                            break;
                        }
                        RectF rectF3 = gl.P;
                        rectF3.set(f9, gl.L(15.5f), gl.L(3.66f) + f9, gl.L(17.5f));
                        path.addRoundRect(rectF3, gl.L(1.0f), gl.L(1.0f), Path.Direction.CW);
                        L2 = gl.L(8.33f);
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
            wjb wjbVar = this.c;
            Paint U0 = bkb.U0("paintChatActionBackground", wjbVar);
            int alpha = U0.getAlpha();
            U0.setAlpha((int) (alpha * f4 * f3));
            canvas.drawPath(path, U0);
            U0.setAlpha(alpha);
            if (wjbVar != null ? wjbVar.g() : bkb.b1()) {
                Paint U02 = bkb.U0("paintChatActionBackgroundDarken", wjbVar);
                int alpha2 = U02.getAlpha();
                U02.setAlpha((int) (alpha2 * f4 * f3));
                canvas.drawPath(path, U02);
                U02.setAlpha(alpha2);
            }
            canvas.restore();
            float f13 = f12 + f8;
            float f14 = f13 + f6;
            this.q.set(f13 - gl.L(4.0f), f2 - gl.L(4.0f), gl.L(4.0f) + f14, gl.L(32.0f) + f2);
            if (z) {
                vl vlVar = this.h;
                if (vlVar != null) {
                    vlVar.setBounds((int) (gl.L(2.66f) + f13), (int) (gl.L(6.5f) + f2), (int) (gl.L(22.66f) + f13), (int) (gl.L(26.5f) + f2));
                    this.h.setAlpha((int) (255.0f * f4));
                    this.h.draw(canvas);
                } else {
                    lm4 lm4Var = this.i;
                    if (lm4Var != null) {
                        lm4Var.a(bkb.v0(bkb.u8, wjbVar));
                    }
                    ImageReceiver imageReceiver = this.g;
                    imageReceiver.i0(gl.L(2.66f) + f13, gl.L(6.5f) + f2, gl.L(20.0f), gl.L(20.0f));
                    imageReceiver.setAlpha(f4);
                    imageReceiver.h(canvas, null);
                }
                if (bkb.g1(wjbVar)) {
                    i2 = bkb.ya;
                } else {
                    i2 = bkb.Yc;
                }
                int v0 = bkb.v0(i2, wjbVar);
                this.e.c(f13 + gl.L(27.66f), gl.L(16.5f) + f2, f4, v0, canvas);
                canvas.save();
                canvas.translate(f14 - gl.L(11.25f), gl.L(16.5f) + f2);
                int p1 = bkb.p1(0.75f * f4, v0);
                Paint paint = this.o;
                paint.setColor(p1);
                paint.setStrokeWidth(gl.L(1.66f));
                canvas.drawPath(this.p, paint);
                canvas.restore();
            }
        }
    }

    public final boolean d(android.view.MotionEvent r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aub.d(android.view.MotionEvent, boolean):boolean");
    }

    public final boolean e(k27 k27Var) {
        vl vlVar = this.h;
        View view = this.b;
        tgb tgbVar = null;
        if (vlVar != null) {
            vlVar.o(view);
            this.h = null;
        }
        this.l = 0;
        this.t = 0L;
        this.i = null;
        if (k27Var == null) {
            this.e = null;
            this.t = 0L;
        } else {
            int i = this.a;
            boolean p0 = hc2.p0(na7.q1(i).K0(Long.valueOf(-k27.B0(k27Var.k))));
            ImageReceiver imageReceiver = this.g;
            if (p0) {
                imageReceiver.q0(gl.L(10.0f));
                long u1 = k27.u1(k27Var.k);
                TLObject Z1 = na7.q1(i).Z1(u1);
                this.t = u1;
                if (Z1 == null) {
                    this.e = null;
                    return false;
                }
                pb0 pb0Var = this.f;
                pb0Var.k(Z1);
                imageReceiver.U(Z1, pb0Var, null);
                tgbVar = new tgb(cf3.l(Z1), 14.0f, gl.o());
                this.e = tgbVar;
            } else {
                imageReceiver.q0(0);
                long Y1 = k27Var.Y1();
                this.t = Y1;
                TLRPC.TL_forumTopic f = na7.q1(i).g4.f(-k27.B0(k27Var.k), Y1);
                if (f == null) {
                    this.e = null;
                    return false;
                }
                if (Y1 == 1) {
                    lm4 d = mm4.d(view.getContext(), 0.75f, bkb.v0(bkb.u8, this.c), false);
                    this.i = d;
                    imageReceiver.g0(d);
                } else if (f.icon_emoji_id != 0) {
                    this.h = new vl(0, i, f.icon_emoji_id);
                    imageReceiver.K();
                    this.h.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                } else {
                    imageReceiver.g0(mm4.f(f));
                }
                tgbVar = new tgb(f.title, 14.0f, gl.o());
                this.e = tgbVar;
            }
        }
        if (tgbVar == null) {
            return false;
        }
        return true;
    }
}
