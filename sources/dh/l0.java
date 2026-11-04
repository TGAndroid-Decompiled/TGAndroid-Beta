package dh;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import ci.lc;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.az;
import org.telegram.messenger.bc;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.i6;
import org.telegram.messenger.li;
import org.telegram.messenger.t0;
import org.telegram.messenger.t5;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.t4;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.xq;
public abstract class l0 {
    public int A;
    public final ImageReceiver B;
    public final g5 C;
    public int D;
    public final cq E;
    public final g6 F;
    public final g6 G;
    public boolean H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public final boolean P;
    public boolean Q;
    public boolean R;
    public w8 S;
    public ArrayList T;
    public final int U;
    public final View V;
    public final e6 W;
    public final gc X;
    public final lc Y;
    public final ch0 Z;
    public final TLRPC.ReactionCount f9060a;
    public int f9062b;
    public int f9064c;
    public int d;
    public boolean f9066d0;
    public int f9067e;
    public ImageReceiver f9068e0;
    public int f9069f;
    public g5 f9070f0;
    public int f9071g;
    public int h;
    public final int f9072i;
    public final int f9073j;
    public final boolean f9075l;
    public boolean f9076m;
    public final String f9077n;
    public boolean f9078o;
    public boolean f9079p;
    public final TLRPC.Reaction f9080q;
    public final n0 f9081r;
    public boolean f9083t;
    public final String f9084u;
    public int v;
    public int f9085w;
    public int f9086x;
    public int f9087y;
    public int f9088z;
    public boolean f9074k = true;
    public final Rect f9082s = new Rect();
    public final RectF f9061a0 = new RectF();
    public final RectF f9063b0 = new RectF();
    public final Path f9065c0 = new Path();

    public l0(l0 l0Var, int i3, View view, TLRPC.ReactionCount reactionCount, boolean z10, e6 e6Var) {
        lc lcVar;
        int i10;
        ch0 ch0Var;
        ah.a aVar = new ah.a(this, 3);
        this.U = i3;
        this.V = view;
        this.X = new gc(view);
        this.W = e6Var;
        this.R = z10;
        if (l0Var != null) {
            this.E = l0Var.E;
        }
        if (this.B == null) {
            this.B = new ImageReceiver(null);
        }
        if (this.E == null) {
            this.E = new cq(view, false, null);
        }
        if (this.F == null) {
            g6 g6Var = new g6(true, true, true);
            this.F = g6Var;
            g6Var.K = true;
            g6Var.n(0.4f, 320L, xq.h);
            g6Var.w(org.telegram.messenger.g0.L(13.0f));
            g6Var.setCallback(aVar);
            g6Var.x(org.telegram.messenger.g0.o());
            g6Var.M = org.telegram.messenger.g0.f22608q.x;
        }
        if (this.G == null) {
            g6 g6Var2 = new g6(false, false, false, true, false);
            this.G = g6Var2;
            g6Var2.w(org.telegram.messenger.g0.L(12.0f));
            g6Var2.setCallback(aVar);
            g6Var2.x(org.telegram.messenger.g0.o());
            g6Var2.M = org.telegram.messenger.g0.f22608q.x;
            g6Var2.A = 0.35f;
        }
        this.f9060a = reactionCount;
        TLRPC.Reaction reaction = reactionCount.reaction;
        this.f9080q = reaction;
        n0 d = n0.d(reaction);
        this.f9081r = d;
        int i11 = reactionCount.count;
        this.v = i11;
        this.f9078o = reactionCount.chosen;
        this.f9072i = i11;
        this.f9073j = reactionCount.chosen_order;
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            this.f9077n = "stars";
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            this.f9077n = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
        } else if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            this.f9077n = Long.toString(((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
        } else {
            throw new RuntimeException("unsupported");
        }
        this.B.H0(view);
        this.P = reactionCount.chosen;
        cq cqVar = this.E;
        cqVar.G = false;
        cqVar.f32796a = true;
        if (reaction != null) {
            if (d.f9093a) {
                this.f9075l = true;
                if (org.telegram.messenger.lc.e(8200)) {
                    if (l0Var != null && (ch0Var = l0Var.Z) != null) {
                        this.Z = ch0Var;
                    } else {
                        this.Z = new ch0(2131624218, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
                    }
                    this.B.w0(this.Z);
                } else {
                    this.B.w0(t0.f25457b.getResources().getDrawable(2131232749).mutate());
                }
                if (l0Var == null || (lcVar = l0Var.Y) == null) {
                    if (az.o() == 2) {
                        i10 = 18;
                    } else {
                        i10 = 8;
                    }
                    lcVar = new lc(1, i10);
                }
                this.Y = lcVar;
            } else if (d.f9097f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) li.b0(i3).f24045r.get(d.f9097f);
                if (tL_availableReaction != null) {
                    this.B.q0(ac.b(tL_availableReaction.center_icon), "40_40_lastreactframe", t5.f(tL_availableReaction.static_icon, k6.f27824a7, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            } else if (d.f9098g != 0) {
                this.C = new g5(i(), i3, d.f9098g);
            }
        }
        this.E.d(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(100.0f));
        this.E.f32799e = o0.V;
        if (z10) {
            String K1 = hp.s1(i3).K1(reaction);
            this.f9084u = K1;
            this.f9083t = !TextUtils.isEmpty(K1);
        }
        if (this.f9083t) {
            g6 g6Var3 = this.F;
            g6Var3.t(i6.m(this.f9084u, g6Var3.f33981a.getFontMetricsInt(), false, null, 0), !bd.f21784a0, true);
            if (this instanceof rl0) {
                Integer.toString(reactionCount.count);
                this.E.c(this.v, false);
            } else {
                this.E.c(0, false);
            }
        } else {
            g6 g6Var4 = this.F;
            if (g6Var4 != null) {
                g6Var4.t("", false, true);
            }
            Integer.toString(reactionCount.count);
            this.E.c(this.v, false);
        }
        cq cqVar2 = this.E;
        cqVar2.I = 2;
        cqVar2.f32818z = 3;
    }

    public final void a() {
        this.f9066d0 = true;
        ImageReceiver imageReceiver = this.B;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
        w8 w8Var = this.S;
        if (w8Var != null) {
            w8Var.e();
        }
        g5 g5Var = this.C;
        if (g5Var != null) {
            g5Var.a(this.V);
        }
    }

    public final void b() {
        this.f9066d0 = false;
        ImageReceiver imageReceiver = this.B;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
        w8 w8Var = this.S;
        if (w8Var != null) {
            w8Var.f();
        }
        g5 g5Var = this.C;
        if (g5Var != null) {
            g5Var.n(this.V);
        }
        c();
    }

    public final void c() {
        ImageReceiver imageReceiver = this.f9068e0;
        if (imageReceiver != null || this.f9070f0 != null) {
            if (imageReceiver != null) {
                imageReceiver.R();
                this.f9068e0 = null;
            } else if (this.f9070f0 != null) {
                View view = this.V;
                if (view != null && (view.getParent() instanceof View)) {
                    view = (View) view.getParent();
                }
                this.f9070f0.n(view);
                this.f9070f0 = null;
            }
        }
    }

    public final void d(Canvas canvas, float f10, float f11, float f12, float f13, boolean z10, boolean z11, float f14) {
        ImageReceiver imageReceiver;
        cq cqVar;
        ImageReceiver imageReceiver2;
        g6 g6Var;
        e6 e6Var;
        View view;
        float f15;
        float f16;
        float f17;
        boolean z12;
        float f18;
        float f19;
        g6 g6Var2;
        float f20;
        float f21;
        float f22;
        int L;
        int L2;
        ImageReceiver imageReceiver3;
        bc bcVar;
        Paint paint;
        t4 L1;
        int w02;
        cq cqVar2 = this.E;
        View view2 = this.V;
        boolean z13 = this.f9075l;
        Rect rect = this.f9082s;
        g6 g6Var3 = this.F;
        g6 g6Var4 = this.G;
        e6 e6Var2 = this.W;
        g5 g5Var = this.C;
        if (g5Var != null) {
            imageReceiver = g5Var.f33971k;
        } else {
            imageReceiver = this.B;
        }
        if (this.f9078o) {
            if (z13) {
                this.I = -1529086;
                this.J = -1;
                this.L = -1;
                this.K = -1529086;
            } else {
                this.I = k6.w0(l() ? k6.Gc : k6.qk, e6Var2);
                this.J = k6.w0(l() ? k6.uk : k6.tk, e6Var2);
                if (view2 instanceof org.telegram.ui.Cells.t0) {
                    this.L = k6.w0(k6.wk, e6Var2);
                    this.K = k6.w0(k6.vk, e6Var2);
                } else {
                    this.L = k6.w0(l() ? k6.Gc : k6.qk, e6Var2);
                    this.K = k6.w0(l() ? k6.f28086ob : k6.f28143ra, e6Var2);
                }
            }
        } else if (z13) {
            this.J = -1529086;
            this.I = 1088989954;
            this.L = -1;
            this.K = 0;
        } else {
            this.J = k6.w0(l() ? k6.rk : k6.sk, e6Var2);
            int w03 = k6.w0(l() ? k6.Gc : k6.qk, e6Var2);
            this.I = w03;
            this.I = i0.a.o(w03, (int) (Color.alpha(w03) * 0.156f));
            this.L = k6.w0(k6.Wc, e6Var2);
            this.K = 0;
        }
        if (!z13 && (view2 instanceof q1) && ((q1) view2).v2()) {
            if (this.f9078o) {
                this.I = k6.w0(k6.f27941gb, e6Var2);
                this.J = k6.w0(k6.hb, e6Var2);
            } else {
                if (l()) {
                    w02 = i0.a.k(k6.w0(k6.La, e6Var2), k6.w0(k6.f28200ua, e6Var2));
                } else {
                    w02 = k6.w0(k6.f28200ua, e6Var2);
                }
                this.I = i0.a.k(k6.w0(k6.f27902eb, e6Var2), w02);
                this.J = k6.w0(k6.f27922fb, e6Var2);
            }
            this.L = this.J;
            this.K = this.I;
        }
        if (this.f9079p) {
            this.I = 0;
            this.K = 0;
        }
        r(f12);
        TextPaint textPaint = o0.V;
        textPaint.setColor(this.M);
        if (g6Var3 != null) {
            g6Var3.u(this.M);
        }
        Paint paint2 = o0.S;
        paint2.setColor(this.N);
        boolean z14 = this.R && h() && Color.alpha(this.O) == 0;
        if (f13 != 1.0f) {
            textPaint.setAlpha((int) (textPaint.getAlpha() * f13));
            paint2.setAlpha((int) (paint2.getAlpha() * f13));
        }
        if (imageReceiver != null) {
            imageReceiver.setAlpha(f13);
        }
        float f23 = 0.0f;
        int i3 = (f14 > 0.0f ? 1 : (f14 == 0.0f ? 0 : -1));
        if (i3 <= 0 || this.H == z11) {
            cqVar = cqVar2;
            imageReceiver2 = imageReceiver;
            g6Var = g6Var4;
            e6Var = e6Var2;
            view = view2;
        } else {
            if (z11) {
                g6Var = g6Var4;
                cqVar = cqVar2;
                e6Var = e6Var2;
                imageReceiver2 = imageReceiver;
                g6Var.m(0.6f, 650L, 1.6f, xq.f40456k);
                g6Var.t(org.telegram.messenger.g0.o0(this.v, 0), false, true);
                view = view2;
                g6Var.t(bd.E(this.v, ','), true, true);
            } else {
                cqVar = cqVar2;
                imageReceiver2 = imageReceiver;
                g6Var = g6Var4;
                e6Var = e6Var2;
                view = view2;
                g6Var.m(0.6f, 320L, 1.6f, xq.h);
                g6Var.t(org.telegram.messenger.g0.o0(this.v, 0), true, true);
            }
            this.H = z11;
        }
        float a10 = this.X.a(0.1f);
        int i10 = this.f9088z;
        if (i3 <= 0 || this.R || g6Var == null || this.S != null) {
            f15 = 1.0f;
            if (f12 != 1.0f) {
                f17 = 6.0f;
                f16 = 8.0f;
                if (this.f9062b == 3) {
                    i10 = (int) com.google.android.recaptcha.internal.a.y(1.0f, f12, this.f9067e, i10 * f12);
                }
            } else {
                f16 = 8.0f;
                f17 = 6.0f;
            }
        } else {
            i10 = (int) (g6Var.c() + org.telegram.messenger.g0.L(g5Var != null ? 6.0f : 4.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(8.0f));
            g6Var.u(this.M);
            f16 = 8.0f;
            f17 = 6.0f;
            f15 = 1.0f;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        float f24 = i10;
        float f25 = f15;
        rectF.set(f10, f11, f10 + f24, this.A + f11);
        if (a10 != f25) {
            canvas.save();
            canvas.scale(a10, a10, (f24 / 2.0f) + f10, (this.A / 2.0f) + f11);
            z12 = true;
        } else {
            z12 = false;
        }
        float f26 = this.A / 2.0f;
        if (j() <= 0.0f || this.f9079p) {
            f18 = 2.0f;
            f19 = 4.0f;
        } else {
            e6 e6Var3 = e6Var;
            Paint W0 = k6.W0("paintChatActionBackground", e6Var3);
            f18 = 2.0f;
            Paint W02 = k6.W0("paintChatActionBackgroundDarken", e6Var3);
            f19 = 4.0f;
            int alpha = W0.getAlpha();
            int alpha2 = W02.getAlpha();
            W0.setAlpha((int) (alpha * f13 * j()));
            W02.setAlpha((int) (alpha2 * f13 * j()));
            g(canvas, rectF, f26, W0);
            if (e6Var == null ? k6.d1() : e6Var.g()) {
                g(canvas, rectF, f26, W02);
            }
            W0.setAlpha(alpha);
            W02.setAlpha(alpha2);
        }
        if (z10 && j() < f25) {
            View view3 = view;
            if ((view3 instanceof q1) && (L1 = ((q1) view3).L1(false)) != null && !this.R) {
                canvas.drawRoundRect(rectF, f26, f26, L1.f28635c);
            }
        }
        if (z14) {
            rectF.right += org.telegram.messenger.g0.L(f19);
            canvas.saveLayerAlpha(rectF, 255, 31);
            rectF.right -= org.telegram.messenger.g0.L(f19);
        }
        if (this.Y != null) {
            org.telegram.messenger.lc.e(8200);
        }
        g(canvas, rectF, f26, paint2);
        if (this.R && h()) {
            if (z14) {
                paint = o0.U;
            } else {
                paint = o0.T;
                paint.setColor(this.O);
                paint.setAlpha((int) (paint.getAlpha() * f13));
            }
            canvas.drawCircle(rectF.right - org.telegram.messenger.g0.L(8.4f), rectF.centerY(), org.telegram.messenger.g0.L(2.66f), paint);
        }
        if (z14) {
            canvas.restore();
        }
        ImageReceiver imageReceiver4 = imageReceiver2;
        if (imageReceiver4 != null) {
            if (z13) {
                L = org.telegram.messenger.g0.L(22.0f);
                L2 = org.telegram.messenger.g0.L(f19);
            } else if (g5Var != null) {
                L = org.telegram.messenger.g0.L(24.0f);
                L2 = org.telegram.messenger.g0.L(f17);
                imageReceiver4.J0(org.telegram.messenger.g0.L(f17));
            } else {
                L = org.telegram.messenger.g0.L(20.0f);
                L2 = org.telegram.messenger.g0.L(f16);
                imageReceiver4.J0(0);
            }
            int i11 = (int) ((this.A - L) / f18);
            if (this.R) {
                L2 -= org.telegram.messenger.g0.L(f18);
            }
            int i12 = ((int) f10) + L2;
            int i13 = ((int) f11) + i11;
            rect.set(i12, i13, i12 + L, L + i13);
            g5 g5Var2 = this.C;
            if (g5Var2 == null || (imageReceiver3 = g5Var2.f33971k) == null) {
                imageReceiver3 = this.B;
            }
            if (imageReceiver3 != null && rect != null) {
                imageReceiver3.z0(rect);
            }
            g5 g5Var3 = this.C;
            if (g5Var3 != null && this.D != this.M) {
                int i14 = this.M;
                this.D = i14;
                g5Var3.setColorFilter(new PorterDuffColorFilter(i14, PorterDuff.Mode.SRC_IN));
            }
            boolean z15 = false;
            if (this.f9074k && (this.f9075l || this.f9072i > 1 || !m() || !this.P)) {
                ImageReceiver k10 = k();
                if (k10 != null) {
                    if (k10.B() == null || !k10.B().u()) {
                        z15 = true;
                    }
                    if (f13 != 1.0f) {
                        k10.setAlpha(f13);
                        if (f13 <= 0.0f) {
                            k10.R();
                            n();
                        }
                    } else if (k10.B() != null && !k10.B().f32734l0) {
                        float alpha3 = k10.getAlpha() - 0.08f;
                        if (alpha3 <= 0.0f) {
                            k10.R();
                            n();
                        } else {
                            k10.setAlpha(alpha3);
                        }
                        this.V.invalidate();
                        z15 = true;
                    }
                    float f27 = imageReceiver3.L0 - (imageReceiver3.N0 / 2.0f);
                    float f28 = imageReceiver3.M0 - (imageReceiver3.O0 / 2.0f);
                    g6Var2 = g6Var3;
                    float floor = (int) Math.floor(f27);
                    float floor2 = (int) Math.floor(f28);
                    k10.y0(floor, floor2, imageReceiver3.N0 * 2.0f, imageReceiver3.O0 * 2.0f);
                    canvas.save();
                    canvas.translate(f27 - floor, f28 - floor2);
                    bcVar = null;
                    k10.h(canvas, null);
                    canvas.restore();
                } else {
                    g6Var2 = g6Var3;
                    bcVar = null;
                    z15 = true;
                }
                if (z15) {
                    imageReceiver3.h(canvas, bcVar);
                }
                this.f9076m = true;
            } else {
                g6Var2 = g6Var3;
                imageReceiver3.setAlpha(0.0f);
                imageReceiver3.h(canvas, null);
                this.f9076m = false;
            }
        } else {
            g6Var2 = g6Var3;
        }
        if (g6Var2 != null && g6Var2.i() > 0.0f) {
            canvas.save();
            if (!this.f9083t || h()) {
                f22 = this.f9083t ? 9 : 8;
            } else {
                f22 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f22) + f10 + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(f18), f11);
            g6Var2.setBounds(0, 0, this.f9088z, this.A);
            g6Var2.draw(canvas);
            g6Var2.B = (int) (f13 * 255.0f);
            canvas.restore();
            f23 = (g6Var2.i() * org.telegram.messenger.g0.L(f19)) + g6Var2.c();
        }
        if (i3 > 0 && !this.R && g6Var != null && this.S == null) {
            canvas.save();
            if (!this.f9083t || h()) {
                f21 = this.f9083t ? 9 : 8;
            } else {
                f21 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f21) + f10 + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(g5Var == null ? f18 : 5.0f), f11 - org.telegram.messenger.g0.L(f25));
            g6Var.setBounds(0, 0, this.f9088z, this.A);
            g6Var.draw(canvas);
            g6Var.B = (int) (255.0f * f13);
            canvas.restore();
        } else if (cqVar != null && e()) {
            canvas.save();
            if (!this.f9083t || h()) {
                f20 = this.f9083t ? 9 : 8;
            } else {
                f20 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f20) + f10 + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(g5Var == null ? f18 : 5.0f) + f23 + (z13 ? -org.telegram.messenger.g0.L(f25) : 0), f11);
            cqVar.a(canvas);
            canvas.restore();
        }
        if (!this.R && this.S != null) {
            canvas.save();
            canvas.translate(f10 + org.telegram.messenger.g0.L(10.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(f18), f11);
            w8 w8Var = this.S;
            w8Var.f39965u = f13;
            if (w8Var.f39966w && w8Var.f39950e != f12) {
                w8Var.f39950e = f12;
                if (f12 == f25) {
                    w8Var.k();
                    w8Var.f39966w = false;
                }
            }
            this.S.g(canvas);
            canvas.restore();
        }
        if (z12) {
            canvas.restore();
        }
    }

    public boolean e() {
        int i3 = this.v;
        if ((i3 != 0 && (!this.R || this.f9083t || i3 != 1)) || this.E.f32805l != 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean f(Canvas canvas, float f10, float f11) {
        lc lcVar = this.Y;
        if (lcVar != null) {
            RectF rectF = lcVar.f5515c;
            if (org.telegram.messenger.lc.e(8200) && org.telegram.messenger.lc.e(131072)) {
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(f10, f11, this.f9088z + f10, this.A + f11);
                float f12 = this.A / 2.0f;
                rectF.set(rectF2);
                rectF.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
                lcVar.g(rectF);
                boolean d = lcVar.d();
                lcVar.a(canvas, i0.a.f(j(), i0.a.o(this.I, 255), i0.a.f(0.4f, this.L, i0.a.o(this.I, 255))));
                if (this.P) {
                    Path path = this.f9065c0;
                    path.rewind();
                    path.addRoundRect(rectF2, f12, f12, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    lcVar.a(canvas, this.J);
                    canvas.restore();
                }
                return d;
            }
            return false;
        }
        return false;
    }

    public final void g(Canvas canvas, RectF rectF, float f10, Paint paint) {
        if (this.R) {
            RectF rectF2 = this.f9061a0;
            int i3 = (rectF2.left > rectF.left ? 1 : (rectF2.left == rectF.left ? 0 : -1));
            Path path = this.f9065c0;
            if (i3 != 0 || rectF2.top != rectF.top || rectF2.right != rectF.right || rectF2.bottom != rectF.bottom) {
                rectF2.set(rectF);
                o0.h(rectF2, this.f9063b0, path);
            }
            canvas.drawPath(path, paint);
            return;
        }
        canvas.drawRoundRect(rectF, f10, f10, paint);
    }

    public boolean h() {
        return true;
    }

    public int i() {
        if (this.R) {
            return 18;
        }
        return 3;
    }

    public float j() {
        return 0.0f;
    }

    public ImageReceiver k() {
        return null;
    }

    public boolean l() {
        return false;
    }

    public boolean m() {
        return false;
    }

    public final void o(ArrayList arrayList) {
        this.T = arrayList;
        if (arrayList != null) {
            Collections.sort(arrayList, o0.Z);
            if (this.S == null) {
                w8 w8Var = new w8(this.V, false);
                this.S = w8Var;
                w8Var.v = 250L;
                xq xqVar = ni.l.V;
                w8Var.f39963s = org.telegram.messenger.g0.L(20.0f);
                this.S.f39960p = org.telegram.messenger.g0.L(100.0f);
                w8 w8Var2 = this.S;
                w8Var2.f39959o = this.A;
                w8Var2.h(org.telegram.messenger.g0.L(22.0f));
            }
            if (this.f9066d0) {
                this.S.e();
            }
            for (int i3 = 0; i3 < arrayList.size() && i3 != 3; i3++) {
                this.S.j(i3, this.U, (TLObject) arrayList.get(i3));
            }
            this.S.a(false, true);
        }
    }

    public final void p() {
        ImageReceiver imageReceiver;
        g5 g5Var = this.C;
        if (g5Var == null || (imageReceiver = g5Var.f33971k) == null) {
            imageReceiver = this.B;
        }
        if (imageReceiver != null) {
            ch0 B = imageReceiver.B();
            if (B != null) {
                B.H(true);
                return;
            }
            org.telegram.ui.Components.t5 m10 = imageReceiver.m();
            if (m10 != null) {
                m10.start();
            }
        }
    }

    public final void q() {
        ImageReceiver imageReceiver;
        g5 g5Var = this.C;
        if (g5Var == null || (imageReceiver = g5Var.f33971k) == null) {
            imageReceiver = this.B;
        }
        if (imageReceiver != null) {
            ch0 B = imageReceiver.B();
            if (B != null) {
                B.stop();
                return;
            }
            org.telegram.ui.Components.t5 m10 = imageReceiver.m();
            if (m10 != null) {
                m10.stop();
            }
        }
    }

    public void r(float f10) {
        int i3;
        this.M = i0.a.f(f10, this.h, i0.a.f(j(), this.J, this.L));
        int f11 = i0.a.f(f10, this.f9069f, i0.a.f(j(), this.I, this.K));
        this.N = f11;
        int i10 = this.f9071g;
        if (org.telegram.messenger.g0.B(f11) > 0.8f) {
            i3 = 0;
        } else {
            i3 = 1526726655;
        }
        this.O = i0.a.f(f10, i10, i3);
    }

    public void n() {
    }
}
