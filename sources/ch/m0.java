package ch;

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
import bi.ud;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.messenger.qp;
import org.telegram.messenger.sc;
import org.telegram.messenger.t0;
import org.telegram.messenger.t5;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.t4;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y8;
public abstract class m0 {
    public int A;
    public final ImageReceiver B;
    public final i5 C;
    public int D;
    public final bq E;
    public final i6 F;
    public final i6 G;
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
    public y8 S;
    public ArrayList T;
    public final int U;
    public final View V;
    public final g6 W;
    public final ic X;
    public final ud Y;
    public final ah0 Z;
    public final TLRPC.ReactionCount f6307a;
    public int f6309b;
    public int f6311c;
    public int d;
    public boolean f6313d0;
    public int f6314e;
    public ImageReceiver f6315e0;
    public int f6316f;
    public i5 f6317f0;
    public int f6318g;
    public int h;
    public final int f6319i;
    public final int f6320j;
    public final boolean f6322l;
    public boolean f6323m;
    public final String f6324n;
    public boolean f6325o;
    public boolean f6326p;
    public final TLRPC.Reaction f6327q;
    public final o0 f6328r;
    public boolean f6330t;
    public final String f6331u;
    public int v;
    public int f6332w;
    public int f6333x;
    public int f6334y;
    public int f6335z;
    public boolean f6321k = true;
    public final Rect f6329s = new Rect();
    public final RectF f6308a0 = new RectF();
    public final RectF f6310b0 = new RectF();
    public final Path f6312c0 = new Path();

    public m0(m0 m0Var, int i7, View view, TLRPC.ReactionCount reactionCount, boolean z9, g6 g6Var) {
        ud udVar;
        int i10;
        ah0 ah0Var;
        a5.b bVar = new a5.b(this, 2);
        this.U = i7;
        this.V = view;
        this.X = new ic(view);
        this.W = g6Var;
        this.R = z9;
        if (m0Var != null) {
            this.E = m0Var.E;
        }
        if (this.B == null) {
            this.B = new ImageReceiver(null);
        }
        if (this.E == null) {
            this.E = new bq(view, false, null);
        }
        if (this.F == null) {
            i6 i6Var = new i6(true, true, true);
            this.F = i6Var;
            i6Var.K = true;
            i6Var.n(0.4f, 320L, xq.h);
            i6Var.w(org.telegram.messenger.g0.L(13.0f));
            i6Var.setCallback(bVar);
            i6Var.x(org.telegram.messenger.g0.o());
            i6Var.M = org.telegram.messenger.g0.f22563q.x;
        }
        if (this.G == null) {
            i6 i6Var2 = new i6(false, false, false, true, false);
            this.G = i6Var2;
            i6Var2.w(org.telegram.messenger.g0.L(12.0f));
            i6Var2.setCallback(bVar);
            i6Var2.x(org.telegram.messenger.g0.o());
            i6Var2.M = org.telegram.messenger.g0.f22563q.x;
            i6Var2.A = 0.35f;
        }
        this.f6307a = reactionCount;
        TLRPC.Reaction reaction = reactionCount.reaction;
        this.f6327q = reaction;
        o0 d = o0.d(reaction);
        this.f6328r = d;
        int i11 = reactionCount.count;
        this.v = i11;
        this.f6325o = reactionCount.chosen;
        this.f6319i = i11;
        this.f6320j = reactionCount.chosen_order;
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            this.f6324n = "stars";
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            this.f6324n = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
        } else if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            this.f6324n = Long.toString(((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
        } else {
            throw new RuntimeException("unsupported");
        }
        this.B.H0(view);
        this.P = reactionCount.chosen;
        bq bqVar = this.E;
        bqVar.G = false;
        bqVar.f32362a = true;
        if (reaction != null) {
            if (d.f6350a) {
                this.f6322l = true;
                if (sc.e(8200)) {
                    if (m0Var != null && (ah0Var = m0Var.Z) != null) {
                        this.Z = ah0Var;
                    } else {
                        this.Z = new ah0(2131624218, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
                    }
                    this.B.w0(this.Z);
                } else {
                    this.B.w0(t0.f25566b.getResources().getDrawable(2131232751).mutate());
                }
                if (m0Var == null || (udVar = m0Var.Y) == null) {
                    if (iz.o() == 2) {
                        i10 = 18;
                    } else {
                        i10 = 8;
                    }
                    udVar = new ud(1, i10);
                }
                this.Y = udVar;
            } else if (d.f6354f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(i7).f25836r.get(d.f6354f);
                if (tL_availableReaction != null) {
                    this.B.q0(hc.b(tL_availableReaction.center_icon), "40_40_lastreactframe", t5.f(tL_availableReaction.static_icon, l6.f27809a7, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            } else if (d.f6355g != 0) {
                this.C = new i5(i(), i7, d.f6355g);
            }
        }
        this.E.d(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(100.0f));
        this.E.f32365e = p0.V;
        if (z9) {
            String K1 = qp.s1(i7).K1(reaction);
            this.f6331u = K1;
            this.f6330t = !TextUtils.isEmpty(K1);
        }
        if (this.f6330t) {
            i6 i6Var3 = this.F;
            i6Var3.t(org.telegram.messenger.i6.m(this.f6331u, i6Var3.f34585a.getFontMetricsInt(), false, null, 0), !id.f23157a0, true);
            if (this instanceof pl0) {
                Integer.toString(reactionCount.count);
                this.E.c(this.v, false);
            } else {
                this.E.c(0, false);
            }
        } else {
            i6 i6Var4 = this.F;
            if (i6Var4 != null) {
                i6Var4.t("", false, true);
            }
            Integer.toString(reactionCount.count);
            this.E.c(this.v, false);
        }
        bq bqVar2 = this.E;
        bqVar2.I = 2;
        bqVar2.f32384z = 3;
    }

    public final void a() {
        this.f6313d0 = true;
        ImageReceiver imageReceiver = this.B;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
        y8 y8Var = this.S;
        if (y8Var != null) {
            y8Var.e();
        }
        i5 i5Var = this.C;
        if (i5Var != null) {
            i5Var.a(this.V);
        }
    }

    public final void b() {
        this.f6313d0 = false;
        ImageReceiver imageReceiver = this.B;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
        y8 y8Var = this.S;
        if (y8Var != null) {
            y8Var.f();
        }
        i5 i5Var = this.C;
        if (i5Var != null) {
            i5Var.n(this.V);
        }
        c();
    }

    public final void c() {
        ImageReceiver imageReceiver = this.f6315e0;
        if (imageReceiver != null || this.f6317f0 != null) {
            if (imageReceiver != null) {
                imageReceiver.R();
                this.f6315e0 = null;
            } else if (this.f6317f0 != null) {
                View view = this.V;
                if (view != null && (view.getParent() instanceof View)) {
                    view = (View) view.getParent();
                }
                this.f6317f0.n(view);
                this.f6317f0 = null;
            }
        }
    }

    public final void d(Canvas canvas, float f10, float f11, float f12, float f13, boolean z9, boolean z10, float f14) {
        ImageReceiver imageReceiver;
        bq bqVar;
        float f15;
        ImageReceiver imageReceiver2;
        i6 i6Var;
        g6 g6Var;
        View view;
        float f16;
        float f17;
        float f18;
        boolean z11;
        float f19;
        float f20;
        i6 i6Var2;
        float f21;
        float f22;
        float f23;
        float f24;
        int L;
        int L2;
        ImageReceiver imageReceiver3;
        org.telegram.messenger.ic icVar;
        Paint paint;
        t4 L1;
        int w02;
        bq bqVar2 = this.E;
        View view2 = this.V;
        boolean z12 = this.f6322l;
        Rect rect = this.f6329s;
        i6 i6Var3 = this.F;
        i6 i6Var4 = this.G;
        g6 g6Var2 = this.W;
        i5 i5Var = this.C;
        if (i5Var != null) {
            imageReceiver = i5Var.f34568k;
        } else {
            imageReceiver = this.B;
        }
        if (this.f6325o) {
            if (z12) {
                this.I = -1529086;
                this.J = -1;
                this.L = -1;
                this.K = -1529086;
            } else {
                this.I = l6.w0(l() ? l6.Gc : l6.qk, g6Var2);
                this.J = l6.w0(l() ? l6.uk : l6.tk, g6Var2);
                if (view2 instanceof org.telegram.ui.Cells.t0) {
                    this.L = l6.w0(l6.wk, g6Var2);
                    this.K = l6.w0(l6.vk, g6Var2);
                } else {
                    this.L = l6.w0(l() ? l6.Gc : l6.qk, g6Var2);
                    this.K = l6.w0(l() ? l6.f28070ob : l6.f28128ra, g6Var2);
                }
            }
        } else if (z12) {
            this.J = -1529086;
            this.I = 1088989954;
            this.L = -1;
            this.K = 0;
        } else {
            this.J = l6.w0(l() ? l6.rk : l6.sk, g6Var2);
            int w03 = l6.w0(l() ? l6.Gc : l6.qk, g6Var2);
            this.I = w03;
            this.I = i0.a.o(w03, (int) (Color.alpha(w03) * 0.156f));
            this.L = l6.w0(l6.Wc, g6Var2);
            this.K = 0;
        }
        if (!z12 && (view2 instanceof q1) && ((q1) view2).v2()) {
            if (this.f6325o) {
                this.I = l6.w0(l6.f27925gb, g6Var2);
                this.J = l6.w0(l6.f27943hb, g6Var2);
            } else {
                if (l()) {
                    w02 = i0.a.k(l6.w0(l6.La, g6Var2), l6.w0(l6.f28185ua, g6Var2));
                } else {
                    w02 = l6.w0(l6.f28185ua, g6Var2);
                }
                this.I = i0.a.k(l6.w0(l6.eb, g6Var2), w02);
                this.J = l6.w0(l6.f27907fb, g6Var2);
            }
            this.L = this.J;
            this.K = this.I;
        }
        if (this.f6326p) {
            this.I = 0;
            this.K = 0;
        }
        r(f12);
        TextPaint textPaint = p0.V;
        textPaint.setColor(this.M);
        if (i6Var3 != null) {
            i6Var3.u(this.M);
        }
        Paint paint2 = p0.S;
        paint2.setColor(this.N);
        boolean z13 = this.R && h() && Color.alpha(this.O) == 0;
        if (f13 != 1.0f) {
            textPaint.setAlpha((int) (textPaint.getAlpha() * f13));
            paint2.setAlpha((int) (paint2.getAlpha() * f13));
        }
        if (imageReceiver != null) {
            imageReceiver.setAlpha(f13);
        }
        int i7 = (f14 > 0.0f ? 1 : (f14 == 0.0f ? 0 : -1));
        if (i7 <= 0 || this.H == z10) {
            bqVar = bqVar2;
            f15 = 0.0f;
            imageReceiver2 = imageReceiver;
            i6Var = i6Var4;
            g6Var = g6Var2;
            view = view2;
        } else {
            if (z10) {
                i6Var = i6Var4;
                f15 = 0.0f;
                bqVar = bqVar2;
                g6Var = g6Var2;
                imageReceiver2 = imageReceiver;
                i6Var.m(0.6f, 650L, 1.6f, xq.f40462k);
                i6Var.t(org.telegram.messenger.g0.o0(this.v, 0), false, true);
                view = view2;
                i6Var.t(id.E(this.v, ','), true, true);
            } else {
                bqVar = bqVar2;
                f15 = 0.0f;
                imageReceiver2 = imageReceiver;
                i6Var = i6Var4;
                g6Var = g6Var2;
                view = view2;
                i6Var.m(0.6f, 320L, 1.6f, xq.h);
                i6Var.t(org.telegram.messenger.g0.o0(this.v, 0), true, true);
            }
            this.H = z10;
        }
        float a10 = this.X.a(0.1f);
        int i10 = this.f6335z;
        if (i7 <= 0 || this.R || i6Var == null || this.S != null) {
            f16 = 1.0f;
            if (f12 != 1.0f) {
                f18 = 6.0f;
                f17 = 8.0f;
                if (this.f6309b == 3) {
                    i10 = (int) com.google.android.recaptcha.internal.a.z(1.0f, f12, this.f6314e, i10 * f12);
                }
            } else {
                f17 = 8.0f;
                f18 = 6.0f;
            }
        } else {
            i10 = (int) (i6Var.c() + org.telegram.messenger.g0.L(i5Var != null ? 6.0f : 4.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(8.0f));
            i6Var.u(this.M);
            f17 = 8.0f;
            f18 = 6.0f;
            f16 = 1.0f;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        float f25 = i10;
        float f26 = f16;
        rectF.set(f10, f11, f10 + f25, this.A + f11);
        if (a10 != f26) {
            canvas.save();
            canvas.scale(a10, a10, (f25 / 2.0f) + f10, (this.A / 2.0f) + f11);
            z11 = true;
        } else {
            z11 = false;
        }
        float f27 = this.A / 2.0f;
        if (j() <= f15 || this.f6326p) {
            f19 = 2.0f;
            f20 = 4.0f;
        } else {
            g6 g6Var3 = g6Var;
            Paint W0 = l6.W0("paintChatActionBackground", g6Var3);
            f19 = 2.0f;
            Paint W02 = l6.W0("paintChatActionBackgroundDarken", g6Var3);
            f20 = 4.0f;
            int alpha = W0.getAlpha();
            int alpha2 = W02.getAlpha();
            W0.setAlpha((int) (alpha * f13 * j()));
            W02.setAlpha((int) (alpha2 * f13 * j()));
            g(canvas, rectF, f27, W0);
            if (g6Var == null ? l6.d1() : g6Var.g()) {
                g(canvas, rectF, f27, W02);
            }
            W0.setAlpha(alpha);
            W02.setAlpha(alpha2);
        }
        if (z9 && j() < f26) {
            View view3 = view;
            if ((view3 instanceof q1) && (L1 = ((q1) view3).L1(false)) != null && !this.R) {
                canvas.drawRoundRect(rectF, f27, f27, L1.f28517c);
            }
        }
        if (z13) {
            rectF.right += org.telegram.messenger.g0.L(f20);
            canvas.saveLayerAlpha(rectF, 255, 31);
            rectF.right -= org.telegram.messenger.g0.L(f20);
        }
        if (this.Y != null) {
            sc.e(8200);
        }
        g(canvas, rectF, f27, paint2);
        if (this.R && h()) {
            if (z13) {
                paint = p0.U;
            } else {
                paint = p0.T;
                paint.setColor(this.O);
                paint.setAlpha((int) (paint.getAlpha() * f13));
            }
            canvas.drawCircle(rectF.right - org.telegram.messenger.g0.L(8.4f), rectF.centerY(), org.telegram.messenger.g0.L(2.66f), paint);
        }
        if (z13) {
            canvas.restore();
        }
        ImageReceiver imageReceiver4 = imageReceiver2;
        if (imageReceiver4 != null) {
            if (z12) {
                L = org.telegram.messenger.g0.L(22.0f);
                L2 = org.telegram.messenger.g0.L(f20);
            } else if (i5Var != null) {
                L = org.telegram.messenger.g0.L(24.0f);
                L2 = org.telegram.messenger.g0.L(f18);
                imageReceiver4.J0(org.telegram.messenger.g0.L(f18));
            } else {
                L = org.telegram.messenger.g0.L(20.0f);
                L2 = org.telegram.messenger.g0.L(f17);
                imageReceiver4.J0(0);
            }
            int i11 = (int) ((this.A - L) / f19);
            if (this.R) {
                L2 -= org.telegram.messenger.g0.L(f19);
            }
            int i12 = ((int) f10) + L2;
            int i13 = ((int) f11) + i11;
            rect.set(i12, i13, i12 + L, L + i13);
            i5 i5Var2 = this.C;
            if (i5Var2 == null || (imageReceiver3 = i5Var2.f34568k) == null) {
                imageReceiver3 = this.B;
            }
            if (imageReceiver3 != null && rect != null) {
                imageReceiver3.z0(rect);
            }
            i5 i5Var3 = this.C;
            if (i5Var3 != null && this.D != this.M) {
                int i14 = this.M;
                this.D = i14;
                i5Var3.setColorFilter(new PorterDuffColorFilter(i14, PorterDuff.Mode.SRC_IN));
            }
            boolean z14 = false;
            if (this.f6321k && (this.f6322l || this.f6319i > 1 || !m() || !this.P)) {
                ImageReceiver k10 = k();
                if (k10 != null) {
                    if (k10.B() == null || !k10.B().u()) {
                        z14 = true;
                    }
                    if (f13 != 1.0f) {
                        k10.setAlpha(f13);
                        if (f13 <= 0.0f) {
                            k10.R();
                            n();
                        }
                    } else if (k10.B() != null && !k10.B().f31834k0) {
                        float alpha3 = k10.getAlpha() - 0.08f;
                        if (alpha3 <= 0.0f) {
                            k10.R();
                            n();
                        } else {
                            k10.setAlpha(alpha3);
                        }
                        this.V.invalidate();
                        z14 = true;
                    }
                    float f28 = imageReceiver3.K0 - (imageReceiver3.M0 / 2.0f);
                    float f29 = imageReceiver3.L0 - (imageReceiver3.N0 / 2.0f);
                    i6Var2 = i6Var3;
                    float floor = (int) Math.floor(f28);
                    float floor2 = (int) Math.floor(f29);
                    k10.y0(floor, floor2, imageReceiver3.M0 * 2.0f, imageReceiver3.N0 * 2.0f);
                    canvas.save();
                    canvas.translate(f28 - floor, f29 - floor2);
                    icVar = null;
                    k10.h(canvas, null);
                    canvas.restore();
                } else {
                    i6Var2 = i6Var3;
                    icVar = null;
                    z14 = true;
                }
                if (z14) {
                    imageReceiver3.h(canvas, icVar);
                }
                this.f6323m = true;
            } else {
                i6Var2 = i6Var3;
                imageReceiver3.setAlpha(0.0f);
                imageReceiver3.h(canvas, null);
                this.f6323m = false;
            }
        } else {
            i6Var2 = i6Var3;
        }
        if (i6Var2 == null || i6Var2.i() <= f15) {
            f21 = f15;
        } else {
            canvas.save();
            if (!this.f6330t || h()) {
                f24 = this.f6330t ? 9 : 8;
            } else {
                f24 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f24) + f10 + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(f19), f11);
            i6Var2.setBounds(0, 0, this.f6335z, this.A);
            i6Var2.draw(canvas);
            i6Var2.B = (int) (f13 * 255.0f);
            canvas.restore();
            f21 = i6Var2.c() + (i6Var2.i() * org.telegram.messenger.g0.L(f20));
        }
        if (i7 > 0 && !this.R && i6Var != null && this.S == null) {
            float max = Math.max(f15, (org.telegram.messenger.g0.L(12.0f) - i6Var.c()) / f19);
            canvas.save();
            if (!this.f6330t || h()) {
                f23 = this.f6330t ? 9 : 8;
            } else {
                f23 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f23) + f10 + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(i5Var == null ? f19 : 5.0f) + max, f11 - org.telegram.messenger.g0.L(f26));
            i6Var.setBounds(0, 0, this.f6335z, this.A);
            i6Var.draw(canvas);
            i6Var.B = (int) (255.0f * f13);
            canvas.restore();
        } else if (bqVar != null && e()) {
            canvas.save();
            if (!this.f6330t || h()) {
                f22 = this.f6330t ? 9 : 8;
            } else {
                f22 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f22) + f10 + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(i5Var == null ? f19 : 5.0f) + f21 + (z12 ? -org.telegram.messenger.g0.L(f26) : 0), f11);
            bqVar.a(canvas);
            canvas.restore();
        }
        if (!this.R && this.S != null) {
            canvas.save();
            canvas.translate(f10 + org.telegram.messenger.g0.L(10.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(f19), f11);
            y8 y8Var = this.S;
            y8Var.f40662u = f13;
            if (y8Var.f40663w && y8Var.f40647e != f12) {
                y8Var.f40647e = f12;
                if (f12 == f26) {
                    y8Var.k();
                    y8Var.f40663w = false;
                }
            }
            this.S.g(canvas);
            canvas.restore();
        }
        if (z11) {
            canvas.restore();
        }
    }

    public boolean e() {
        int i7 = this.v;
        if ((i7 != 0 && (!this.R || this.f6330t || i7 != 1)) || this.E.f32371l != 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean f(Canvas canvas, float f10, float f11) {
        ud udVar = this.Y;
        if (udVar != null) {
            RectF rectF = udVar.f4843c;
            if (sc.e(8200) && sc.e(131072)) {
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(f10, f11, this.f6335z + f10, this.A + f11);
                float f12 = this.A / 2.0f;
                rectF.set(rectF2);
                rectF.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
                udVar.g(rectF);
                boolean d = udVar.d();
                udVar.a(canvas, i0.a.f(j(), i0.a.o(this.I, 255), i0.a.f(0.4f, this.L, i0.a.o(this.I, 255))));
                if (this.P) {
                    Path path = this.f6312c0;
                    path.rewind();
                    path.addRoundRect(rectF2, f12, f12, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    udVar.a(canvas, this.J);
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
            RectF rectF2 = this.f6308a0;
            int i7 = (rectF2.left > rectF.left ? 1 : (rectF2.left == rectF.left ? 0 : -1));
            Path path = this.f6312c0;
            if (i7 != 0 || rectF2.top != rectF.top || rectF2.right != rectF.right || rectF2.bottom != rectF.bottom) {
                rectF2.set(rectF);
                p0.h(rectF2, this.f6310b0, path);
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
            Collections.sort(arrayList, p0.Z);
            if (this.S == null) {
                y8 y8Var = new y8(this.V, false);
                this.S = y8Var;
                y8Var.v = 250L;
                xq xqVar = mi.l.V;
                y8Var.f40660s = org.telegram.messenger.g0.L(20.0f);
                this.S.f40657p = org.telegram.messenger.g0.L(100.0f);
                y8 y8Var2 = this.S;
                y8Var2.f40656o = this.A;
                y8Var2.h(org.telegram.messenger.g0.L(22.0f));
            }
            if (this.f6313d0) {
                this.S.e();
            }
            for (int i7 = 0; i7 < arrayList.size() && i7 != 3; i7++) {
                this.S.j(i7, this.U, (TLObject) arrayList.get(i7));
            }
            this.S.a(false, true);
        }
    }

    public final void p() {
        ImageReceiver imageReceiver;
        i5 i5Var = this.C;
        if (i5Var == null || (imageReceiver = i5Var.f34568k) == null) {
            imageReceiver = this.B;
        }
        if (imageReceiver != null) {
            ah0 B = imageReceiver.B();
            if (B != null) {
                B.H(true);
                return;
            }
            v5 m10 = imageReceiver.m();
            if (m10 != null) {
                m10.start();
            }
        }
    }

    public final void q() {
        ImageReceiver imageReceiver;
        i5 i5Var = this.C;
        if (i5Var == null || (imageReceiver = i5Var.f34568k) == null) {
            imageReceiver = this.B;
        }
        if (imageReceiver != null) {
            ah0 B = imageReceiver.B();
            if (B != null) {
                B.stop();
                return;
            }
            v5 m10 = imageReceiver.m();
            if (m10 != null) {
                m10.stop();
            }
        }
    }

    public void r(float f10) {
        int i7;
        this.M = i0.a.f(f10, this.h, i0.a.f(j(), this.J, this.L));
        int f11 = i0.a.f(f10, this.f6316f, i0.a.f(j(), this.I, this.K));
        this.N = f11;
        int i10 = this.f6318g;
        if (org.telegram.messenger.g0.B(f11) > 0.8f) {
            i7 = 0;
        } else {
            i7 = 1526726655;
        }
        this.O = i0.a.f(f10, i10, i7);
    }

    public void n() {
    }
}
