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
import org.telegram.messenger.i6;
import org.telegram.messenger.ic;
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.messenger.qp;
import org.telegram.messenger.sc;
import org.telegram.messenger.t0;
import org.telegram.messenger.t5;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.u4;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.x8;
import org.telegram.ui.Components.zg0;
public abstract class m0 {
    public int A;
    public final ImageReceiver B;
    public final h5 C;
    public int D;
    public final bq E;
    public final h6 F;
    public final h6 G;
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
    public x8 S;
    public ArrayList T;
    public final int U;
    public final View V;
    public final org.telegram.ui.ActionBar.h6 W;
    public final hc X;
    public final ud Y;
    public final zg0 Z;
    public final TLRPC.ReactionCount f6312a;
    public int f6314b;
    public int f6316c;
    public int d;
    public boolean f6318d0;
    public int f6319e;
    public ImageReceiver f6320e0;
    public int f6321f;
    public h5 f6322f0;
    public int f6323g;
    public int h;
    public final int f6324i;
    public final int f6325j;
    public final boolean f6327l;
    public boolean f6328m;
    public final String f6329n;
    public boolean f6330o;
    public boolean f6331p;
    public final TLRPC.Reaction f6332q;
    public final o0 f6333r;
    public boolean f6335t;
    public final String f6336u;
    public int v;
    public int f6337w;
    public int f6338x;
    public int f6339y;
    public int f6340z;
    public boolean f6326k = true;
    public final Rect f6334s = new Rect();
    public final RectF f6313a0 = new RectF();
    public final RectF f6315b0 = new RectF();
    public final Path f6317c0 = new Path();

    public m0(m0 m0Var, int i7, View view, TLRPC.ReactionCount reactionCount, boolean z9, org.telegram.ui.ActionBar.h6 h6Var) {
        ud udVar;
        int i10;
        zg0 zg0Var;
        a5.b bVar = new a5.b(this, 2);
        this.U = i7;
        this.V = view;
        this.X = new hc(view);
        this.W = h6Var;
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
            h6 h6Var2 = new h6(true, true, true);
            this.F = h6Var2;
            h6Var2.K = true;
            h6Var2.n(0.4f, 320L, wq.h);
            h6Var2.w(org.telegram.messenger.g0.L(13.0f));
            h6Var2.setCallback(bVar);
            h6Var2.x(org.telegram.messenger.g0.o());
            h6Var2.M = org.telegram.messenger.g0.f22567q.x;
        }
        if (this.G == null) {
            h6 h6Var3 = new h6(false, false, false, true, false);
            this.G = h6Var3;
            h6Var3.w(org.telegram.messenger.g0.L(12.0f));
            h6Var3.setCallback(bVar);
            h6Var3.x(org.telegram.messenger.g0.o());
            h6Var3.M = org.telegram.messenger.g0.f22567q.x;
            h6Var3.A = 0.35f;
        }
        this.f6312a = reactionCount;
        TLRPC.Reaction reaction = reactionCount.reaction;
        this.f6332q = reaction;
        o0 d = o0.d(reaction);
        this.f6333r = d;
        int i11 = reactionCount.count;
        this.v = i11;
        this.f6330o = reactionCount.chosen;
        this.f6324i = i11;
        this.f6325j = reactionCount.chosen_order;
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            this.f6329n = "stars";
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            this.f6329n = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
        } else if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            this.f6329n = Long.toString(((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
        } else {
            throw new RuntimeException("unsupported");
        }
        this.B.H0(view);
        this.P = reactionCount.chosen;
        bq bqVar = this.E;
        bqVar.G = false;
        bqVar.f32321a = true;
        if (reaction != null) {
            if (d.f6355a) {
                this.f6327l = true;
                if (sc.e(8200)) {
                    if (m0Var != null && (zg0Var = m0Var.Z) != null) {
                        this.Z = zg0Var;
                    } else {
                        this.Z = new zg0(2131624218, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
                    }
                    this.B.w0(this.Z);
                } else {
                    this.B.w0(t0.f25570b.getResources().getDrawable(2131232751).mutate());
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
            } else if (d.f6359f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(i7).f25840r.get(d.f6359f);
                if (tL_availableReaction != null) {
                    this.B.q0(org.telegram.messenger.hc.b(tL_availableReaction.center_icon), "40_40_lastreactframe", t5.f(tL_availableReaction.static_icon, m6.f27834a7, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            } else if (d.f6360g != 0) {
                this.C = new h5(i(), i7, d.f6360g);
            }
        }
        this.E.d(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(100.0f));
        this.E.f32324e = p0.V;
        if (z9) {
            String K1 = qp.s1(i7).K1(reaction);
            this.f6336u = K1;
            this.f6335t = !TextUtils.isEmpty(K1);
        }
        if (this.f6335t) {
            h6 h6Var4 = this.F;
            h6Var4.t(i6.m(this.f6336u, h6Var4.f34185a.getFontMetricsInt(), false, null, 0), !id.f23161a0, true);
            if (this instanceof ol0) {
                Integer.toString(reactionCount.count);
                this.E.c(this.v, false);
            } else {
                this.E.c(0, false);
            }
        } else {
            h6 h6Var5 = this.F;
            if (h6Var5 != null) {
                h6Var5.t("", false, true);
            }
            Integer.toString(reactionCount.count);
            this.E.c(this.v, false);
        }
        bq bqVar2 = this.E;
        bqVar2.I = 2;
        bqVar2.f32343z = 3;
    }

    public final void a() {
        this.f6318d0 = true;
        ImageReceiver imageReceiver = this.B;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
        x8 x8Var = this.S;
        if (x8Var != null) {
            x8Var.e();
        }
        h5 h5Var = this.C;
        if (h5Var != null) {
            h5Var.a(this.V);
        }
    }

    public final void b() {
        this.f6318d0 = false;
        ImageReceiver imageReceiver = this.B;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
        x8 x8Var = this.S;
        if (x8Var != null) {
            x8Var.f();
        }
        h5 h5Var = this.C;
        if (h5Var != null) {
            h5Var.n(this.V);
        }
        c();
    }

    public final void c() {
        ImageReceiver imageReceiver = this.f6320e0;
        if (imageReceiver != null || this.f6322f0 != null) {
            if (imageReceiver != null) {
                imageReceiver.R();
                this.f6320e0 = null;
            } else if (this.f6322f0 != null) {
                View view = this.V;
                if (view != null && (view.getParent() instanceof View)) {
                    view = (View) view.getParent();
                }
                this.f6322f0.n(view);
                this.f6322f0 = null;
            }
        }
    }

    public final void d(Canvas canvas, float f10, float f11, float f12, float f13, boolean z9, boolean z10, float f14) {
        ImageReceiver imageReceiver;
        bq bqVar;
        float f15;
        ImageReceiver imageReceiver2;
        h6 h6Var;
        org.telegram.ui.ActionBar.h6 h6Var2;
        View view;
        float f16;
        float f17;
        float f18;
        boolean z11;
        float f19;
        float f20;
        h6 h6Var3;
        float f21;
        float f22;
        float f23;
        float f24;
        int L;
        int L2;
        ImageReceiver imageReceiver3;
        ic icVar;
        Paint paint;
        u4 L1;
        int w02;
        bq bqVar2 = this.E;
        View view2 = this.V;
        boolean z12 = this.f6327l;
        Rect rect = this.f6334s;
        h6 h6Var4 = this.F;
        h6 h6Var5 = this.G;
        org.telegram.ui.ActionBar.h6 h6Var6 = this.W;
        h5 h5Var = this.C;
        if (h5Var != null) {
            imageReceiver = h5Var.f34176k;
        } else {
            imageReceiver = this.B;
        }
        if (this.f6330o) {
            if (z12) {
                this.I = -1529086;
                this.J = -1;
                this.L = -1;
                this.K = -1529086;
            } else {
                this.I = m6.w0(l() ? m6.Gc : m6.qk, h6Var6);
                this.J = m6.w0(l() ? m6.uk : m6.tk, h6Var6);
                if (view2 instanceof org.telegram.ui.Cells.t0) {
                    this.L = m6.w0(m6.wk, h6Var6);
                    this.K = m6.w0(m6.vk, h6Var6);
                } else {
                    this.L = m6.w0(l() ? m6.Gc : m6.qk, h6Var6);
                    this.K = m6.w0(l() ? m6.f28095ob : m6.f28153ra, h6Var6);
                }
            }
        } else if (z12) {
            this.J = -1529086;
            this.I = 1088989954;
            this.L = -1;
            this.K = 0;
        } else {
            this.J = m6.w0(l() ? m6.rk : m6.sk, h6Var6);
            int w03 = m6.w0(l() ? m6.Gc : m6.qk, h6Var6);
            this.I = w03;
            this.I = i0.a.o(w03, (int) (Color.alpha(w03) * 0.156f));
            this.L = m6.w0(m6.Wc, h6Var6);
            this.K = 0;
        }
        if (!z12 && (view2 instanceof q1) && ((q1) view2).v2()) {
            if (this.f6330o) {
                this.I = m6.w0(m6.f27950gb, h6Var6);
                this.J = m6.w0(m6.f27968hb, h6Var6);
            } else {
                if (l()) {
                    w02 = i0.a.k(m6.w0(m6.La, h6Var6), m6.w0(m6.f28210ua, h6Var6));
                } else {
                    w02 = m6.w0(m6.f28210ua, h6Var6);
                }
                this.I = i0.a.k(m6.w0(m6.eb, h6Var6), w02);
                this.J = m6.w0(m6.f27932fb, h6Var6);
            }
            this.L = this.J;
            this.K = this.I;
        }
        if (this.f6331p) {
            this.I = 0;
            this.K = 0;
        }
        r(f12);
        TextPaint textPaint = p0.V;
        textPaint.setColor(this.M);
        if (h6Var4 != null) {
            h6Var4.u(this.M);
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
            h6Var = h6Var5;
            h6Var2 = h6Var6;
            view = view2;
        } else {
            if (z10) {
                h6Var = h6Var5;
                f15 = 0.0f;
                bqVar = bqVar2;
                h6Var2 = h6Var6;
                imageReceiver2 = imageReceiver;
                h6Var.m(0.6f, 650L, 1.6f, wq.f40050k);
                h6Var.t(org.telegram.messenger.g0.o0(this.v, 0), false, true);
                view = view2;
                h6Var.t(id.E(this.v, ','), true, true);
            } else {
                bqVar = bqVar2;
                f15 = 0.0f;
                imageReceiver2 = imageReceiver;
                h6Var = h6Var5;
                h6Var2 = h6Var6;
                view = view2;
                h6Var.m(0.6f, 320L, 1.6f, wq.h);
                h6Var.t(org.telegram.messenger.g0.o0(this.v, 0), true, true);
            }
            this.H = z10;
        }
        float a10 = this.X.a(0.1f);
        int i10 = this.f6340z;
        if (i7 <= 0 || this.R || h6Var == null || this.S != null) {
            f16 = 1.0f;
            if (f12 != 1.0f) {
                f18 = 6.0f;
                f17 = 8.0f;
                if (this.f6314b == 3) {
                    i10 = (int) com.google.android.recaptcha.internal.a.z(1.0f, f12, this.f6319e, i10 * f12);
                }
            } else {
                f17 = 8.0f;
                f18 = 6.0f;
            }
        } else {
            i10 = (int) (h6Var.c() + org.telegram.messenger.g0.L(h5Var != null ? 6.0f : 4.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(8.0f));
            h6Var.u(this.M);
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
        if (j() <= f15 || this.f6331p) {
            f19 = 2.0f;
            f20 = 4.0f;
        } else {
            org.telegram.ui.ActionBar.h6 h6Var7 = h6Var2;
            Paint W0 = m6.W0("paintChatActionBackground", h6Var7);
            f19 = 2.0f;
            Paint W02 = m6.W0("paintChatActionBackgroundDarken", h6Var7);
            f20 = 4.0f;
            int alpha = W0.getAlpha();
            int alpha2 = W02.getAlpha();
            W0.setAlpha((int) (alpha * f13 * j()));
            W02.setAlpha((int) (alpha2 * f13 * j()));
            g(canvas, rectF, f27, W0);
            if (h6Var2 == null ? m6.d1() : h6Var2.g()) {
                g(canvas, rectF, f27, W02);
            }
            W0.setAlpha(alpha);
            W02.setAlpha(alpha2);
        }
        if (z9 && j() < f26) {
            View view3 = view;
            if ((view3 instanceof q1) && (L1 = ((q1) view3).L1(false)) != null && !this.R) {
                canvas.drawRoundRect(rectF, f27, f27, L1.f28586c);
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
            } else if (h5Var != null) {
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
            h5 h5Var2 = this.C;
            if (h5Var2 == null || (imageReceiver3 = h5Var2.f34176k) == null) {
                imageReceiver3 = this.B;
            }
            if (imageReceiver3 != null && rect != null) {
                imageReceiver3.z0(rect);
            }
            h5 h5Var3 = this.C;
            if (h5Var3 != null && this.D != this.M) {
                int i14 = this.M;
                this.D = i14;
                h5Var3.setColorFilter(new PorterDuffColorFilter(i14, PorterDuff.Mode.SRC_IN));
            }
            boolean z14 = false;
            if (this.f6326k && (this.f6327l || this.f6324i > 1 || !m() || !this.P)) {
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
                    } else if (k10.B() != null && !k10.B().f40976k0) {
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
                    h6Var3 = h6Var4;
                    float floor = (int) Math.floor(f28);
                    float floor2 = (int) Math.floor(f29);
                    k10.y0(floor, floor2, imageReceiver3.M0 * 2.0f, imageReceiver3.N0 * 2.0f);
                    canvas.save();
                    canvas.translate(f28 - floor, f29 - floor2);
                    icVar = null;
                    k10.h(canvas, null);
                    canvas.restore();
                } else {
                    h6Var3 = h6Var4;
                    icVar = null;
                    z14 = true;
                }
                if (z14) {
                    imageReceiver3.h(canvas, icVar);
                }
                this.f6328m = true;
            } else {
                h6Var3 = h6Var4;
                imageReceiver3.setAlpha(0.0f);
                imageReceiver3.h(canvas, null);
                this.f6328m = false;
            }
        } else {
            h6Var3 = h6Var4;
        }
        if (h6Var3 == null || h6Var3.i() <= f15) {
            f21 = f15;
        } else {
            canvas.save();
            if (!this.f6335t || h()) {
                f24 = this.f6335t ? 9 : 8;
            } else {
                f24 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f24) + f10 + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(f19), f11);
            h6Var3.setBounds(0, 0, this.f6340z, this.A);
            h6Var3.draw(canvas);
            h6Var3.B = (int) (f13 * 255.0f);
            canvas.restore();
            f21 = h6Var3.c() + (h6Var3.i() * org.telegram.messenger.g0.L(f20));
        }
        if (i7 > 0 && !this.R && h6Var != null && this.S == null) {
            float max = Math.max(f15, (org.telegram.messenger.g0.L(12.0f) - h6Var.c()) / f19);
            canvas.save();
            if (!this.f6335t || h()) {
                f23 = this.f6335t ? 9 : 8;
            } else {
                f23 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f23) + f10 + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(h5Var == null ? f19 : 5.0f) + max, f11 - org.telegram.messenger.g0.L(f26));
            h6Var.setBounds(0, 0, this.f6340z, this.A);
            h6Var.draw(canvas);
            h6Var.B = (int) (255.0f * f13);
            canvas.restore();
        } else if (bqVar != null && e()) {
            canvas.save();
            if (!this.f6335t || h()) {
                f22 = this.f6335t ? 9 : 8;
            } else {
                f22 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f22) + f10 + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(h5Var == null ? f19 : 5.0f) + f21 + (z12 ? -org.telegram.messenger.g0.L(f26) : 0), f11);
            bqVar.a(canvas);
            canvas.restore();
        }
        if (!this.R && this.S != null) {
            canvas.save();
            canvas.translate(f10 + org.telegram.messenger.g0.L(10.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(f19), f11);
            x8 x8Var = this.S;
            x8Var.f40249u = f13;
            if (x8Var.f40250w && x8Var.f40234e != f12) {
                x8Var.f40234e = f12;
                if (f12 == f26) {
                    x8Var.k();
                    x8Var.f40250w = false;
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
        if ((i7 != 0 && (!this.R || this.f6335t || i7 != 1)) || this.E.f32330l != 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean f(Canvas canvas, float f10, float f11) {
        ud udVar = this.Y;
        if (udVar != null) {
            RectF rectF = udVar.f4844c;
            if (sc.e(8200) && sc.e(131072)) {
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(f10, f11, this.f6340z + f10, this.A + f11);
                float f12 = this.A / 2.0f;
                rectF.set(rectF2);
                rectF.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
                udVar.g(rectF);
                boolean d = udVar.d();
                udVar.a(canvas, i0.a.f(j(), i0.a.o(this.I, 255), i0.a.f(0.4f, this.L, i0.a.o(this.I, 255))));
                if (this.P) {
                    Path path = this.f6317c0;
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
            RectF rectF2 = this.f6313a0;
            int i7 = (rectF2.left > rectF.left ? 1 : (rectF2.left == rectF.left ? 0 : -1));
            Path path = this.f6317c0;
            if (i7 != 0 || rectF2.top != rectF.top || rectF2.right != rectF.right || rectF2.bottom != rectF.bottom) {
                rectF2.set(rectF);
                p0.h(rectF2, this.f6315b0, path);
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
                x8 x8Var = new x8(this.V, false);
                this.S = x8Var;
                x8Var.v = 250L;
                wq wqVar = mi.l.V;
                x8Var.f40247s = org.telegram.messenger.g0.L(20.0f);
                this.S.f40244p = org.telegram.messenger.g0.L(100.0f);
                x8 x8Var2 = this.S;
                x8Var2.f40243o = this.A;
                x8Var2.h(org.telegram.messenger.g0.L(22.0f));
            }
            if (this.f6318d0) {
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
        h5 h5Var = this.C;
        if (h5Var == null || (imageReceiver = h5Var.f34176k) == null) {
            imageReceiver = this.B;
        }
        if (imageReceiver != null) {
            zg0 B = imageReceiver.B();
            if (B != null) {
                B.H(true);
                return;
            }
            u5 m10 = imageReceiver.m();
            if (m10 != null) {
                m10.start();
            }
        }
    }

    public final void q() {
        ImageReceiver imageReceiver;
        h5 h5Var = this.C;
        if (h5Var == null || (imageReceiver = h5Var.f34176k) == null) {
            imageReceiver = this.B;
        }
        if (imageReceiver != null) {
            zg0 B = imageReceiver.B();
            if (B != null) {
                B.stop();
                return;
            }
            u5 m10 = imageReceiver.m();
            if (m10 != null) {
                m10.stop();
            }
        }
    }

    public void r(float f10) {
        int i7;
        this.M = i0.a.f(f10, this.h, i0.a.f(j(), this.J, this.L));
        int f11 = i0.a.f(f10, this.f6321f, i0.a.f(j(), this.I, this.K));
        this.N = f11;
        int i10 = this.f6323g;
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
