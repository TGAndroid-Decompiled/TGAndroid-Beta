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
public final class byb {
    public final int a;
    public final View b;
    public final vnb c;
    public final boolean d;
    public pkb e;
    public final ImageReceiver g;
    public wl h;
    public qo4 i;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public final Paint o;
    public final Path p;
    public final RectF q;
    public final v41 r;
    public Runnable s;
    public long t;
    public final rb0 f = new rb0((vnb) null);
    public final Path j = new Path();

    public byb(int i, View view, vnb vnbVar, boolean z) {
        Paint paint = new Paint(1);
        this.o = paint;
        Path path = new Path();
        this.p = path;
        this.q = new RectF();
        this.a = i;
        this.b = view;
        this.c = vnbVar;
        this.d = z;
        this.r = new v41(view);
        this.g = new ImageReceiver(view);
        path.rewind();
        path.moveTo(-hl.L(1.75f), -hl.L(4.0f));
        path.lineTo(hl.L(1.75f), 0.0f);
        path.lineTo(-hl.L(1.75f), hl.L(4.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a() {
        this.g.I();
        wl wlVar = this.h;
        if (wlVar != null) {
            wlVar.b(this.b);
        }
    }

    public final void b() {
        this.g.K();
        wl wlVar = this.h;
        if (wlVar != null) {
            wlVar.o(this.b);
        }
    }

    public final void c(Canvas canvas, int i, float f, float f2, float f3, float f4, boolean z) {
        float f5;
        float f6;
        int i2;
        pkb pkbVar = this.e;
        if (pkbVar != null) {
            pkbVar.p = i - hl.L(144.66f);
            float j = this.e.j() + hl.L(48.66f);
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
                RectF rectF = hl.P;
                f5 = 2.0f;
                rectF.set(f8, hl.L(4.5f), f8 + j, hl.L(28.5f));
                if (z) {
                    path.addRoundRect(rectF, hl.L(12.0f), hl.L(12.0f), Path.Direction.CW);
                }
                if (z2) {
                    float f9 = f7 / 2.0f;
                    float f10 = 1.833f;
                    float L = f9 - hl.L(1.833f);
                    while (L > 0.0f) {
                        RectF rectF2 = hl.P;
                        rectF2.set(L - hl.L(3.66f), hl.L(15.5f), L, hl.L(17.5f));
                        path.addRoundRect(rectF2, hl.L(1.0f), hl.L(1.0f), Path.Direction.CW);
                        L -= hl.L(8.33f);
                        f10 = f10;
                        f7 = f7;
                        j = j;
                    }
                    float f11 = f7;
                    f6 = j;
                    int L2 = hl.L(f10);
                    while (true) {
                        f9 += L2;
                        if (f9 >= f11) {
                            break;
                        }
                        RectF rectF3 = hl.P;
                        rectF3.set(f9, hl.L(15.5f), hl.L(3.66f) + f9, hl.L(17.5f));
                        path.addRoundRect(rectF3, hl.L(1.0f), hl.L(1.0f), Path.Direction.CW);
                        L2 = hl.L(8.33f);
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
            vnb vnbVar = this.c;
            Paint U0 = aob.U0("paintChatActionBackground", vnbVar);
            int alpha = U0.getAlpha();
            U0.setAlpha((int) (alpha * f4 * f3));
            canvas.drawPath(path, U0);
            U0.setAlpha(alpha);
            if (vnbVar != null ? vnbVar.g() : aob.b1()) {
                Paint U02 = aob.U0("paintChatActionBackgroundDarken", vnbVar);
                int alpha2 = U02.getAlpha();
                U02.setAlpha((int) (alpha2 * f4 * f3));
                canvas.drawPath(path, U02);
                U02.setAlpha(alpha2);
            }
            canvas.restore();
            float f13 = f12 + f8;
            float f14 = f13 + f6;
            this.q.set(f13 - hl.L(4.0f), f2 - hl.L(4.0f), hl.L(4.0f) + f14, hl.L(32.0f) + f2);
            if (z) {
                wl wlVar = this.h;
                if (wlVar != null) {
                    wlVar.setBounds((int) (hl.L(2.66f) + f13), (int) (hl.L(6.5f) + f2), (int) (hl.L(22.66f) + f13), (int) (hl.L(26.5f) + f2));
                    this.h.setAlpha((int) (255.0f * f4));
                    this.h.draw(canvas);
                } else {
                    qo4 qo4Var = this.i;
                    if (qo4Var != null) {
                        qo4Var.a(aob.v0(aob.v8, vnbVar));
                    }
                    ImageReceiver imageReceiver = this.g;
                    imageReceiver.i0(hl.L(2.66f) + f13, hl.L(6.5f) + f2, hl.L(20.0f), hl.L(20.0f));
                    imageReceiver.setAlpha(f4);
                    imageReceiver.h(canvas, null);
                }
                if (aob.g1(vnbVar)) {
                    i2 = aob.za;
                } else {
                    i2 = aob.Zc;
                }
                int v0 = aob.v0(i2, vnbVar);
                this.e.c(f13 + hl.L(27.66f), hl.L(16.5f) + f2, f4, v0, canvas);
                canvas.save();
                canvas.translate(f14 - hl.L(11.25f), hl.L(16.5f) + f2);
                int p1 = aob.p1(0.75f * f4, v0);
                Paint paint = this.o;
                paint.setColor(p1);
                paint.setStrokeWidth(hl.L(1.66f));
                canvas.drawPath(this.p, paint);
                canvas.restore();
            }
        }
    }

    public final boolean d(android.view.MotionEvent r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byb.d(android.view.MotionEvent, boolean):boolean");
    }

    public final boolean e(r47 r47Var) {
        wl wlVar = this.h;
        View view = this.b;
        pkb pkbVar = null;
        if (wlVar != null) {
            wlVar.o(view);
            this.h = null;
        }
        this.l = 0;
        this.t = 0L;
        this.i = null;
        if (r47Var == null) {
            this.e = null;
            this.t = 0L;
        } else {
            int i = this.a;
            boolean p0 = xc2.p0(uc7.s1(i).M0(Long.valueOf(-r47.B0(r47Var.k))));
            ImageReceiver imageReceiver = this.g;
            if (p0) {
                imageReceiver.q0(hl.L(10.0f));
                long u1 = r47.u1(r47Var.k);
                TLObject b2 = uc7.s1(i).b2(u1);
                this.t = u1;
                if (b2 == null) {
                    this.e = null;
                    return false;
                }
                rb0 rb0Var = this.f;
                rb0Var.k(b2);
                imageReceiver.U(b2, rb0Var, null);
                pkbVar = new pkb(wf3.l(b2), 14.0f, hl.o());
                this.e = pkbVar;
            } else {
                imageReceiver.q0(0);
                long Y1 = r47Var.Y1();
                this.t = Y1;
                TLRPC.TL_forumTopic f = uc7.s1(i).g4.f(-r47.B0(r47Var.k), Y1);
                if (f == null) {
                    this.e = null;
                    return false;
                }
                if (Y1 == 1) {
                    qo4 d = ro4.d(view.getContext(), 0.75f, aob.v0(aob.v8, this.c), false);
                    this.i = d;
                    imageReceiver.g0(d);
                } else if (f.icon_emoji_id != 0) {
                    this.h = new wl(0, i, f.icon_emoji_id);
                    imageReceiver.K();
                    this.h.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                } else {
                    imageReceiver.g0(ro4.f(f));
                }
                pkbVar = new pkb(f.title, 14.0f, hl.o());
                this.e = pkbVar;
            }
        }
        if (pkbVar == null) {
            return false;
        }
        return true;
    }
}
