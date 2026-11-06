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
import org.telegram.messenger.hd;
import org.telegram.messenger.iz;
import org.telegram.messenger.qp;
import org.telegram.messenger.rc;
import org.telegram.messenger.t0;
import org.telegram.messenger.t5;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.t4;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y8;
import org.telegram.ui.Components.zg0;
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
    public final f6 W;
    public final ic X;
    public final ud Y;
    public final zg0 Z;
    public final TLRPC.ReactionCount f6309a;
    public int f6311b;
    public int f6313c;
    public int d;
    public boolean f6315d0;
    public int f6316e;
    public ImageReceiver f6317e0;
    public int f6318f;
    public i5 f6319f0;
    public int f6320g;
    public int h;
    public final int f6321i;
    public final int f6322j;
    public final boolean f6324l;
    public boolean f6325m;
    public final String f6326n;
    public boolean f6327o;
    public boolean f6328p;
    public final TLRPC.Reaction f6329q;
    public final o0 f6330r;
    public boolean f6332t;
    public final String f6333u;
    public int v;
    public int f6334w;
    public int f6335x;
    public int f6336y;
    public int f6337z;
    public boolean f6323k = true;
    public final Rect f6331s = new Rect();
    public final RectF f6310a0 = new RectF();
    public final RectF f6312b0 = new RectF();
    public final Path f6314c0 = new Path();

    public m0(m0 m0Var, int i7, View view, TLRPC.ReactionCount reactionCount, boolean z9, f6 f6Var) {
        ud udVar;
        int i10;
        zg0 zg0Var;
        a5.b bVar = new a5.b(this, 2);
        this.U = i7;
        this.V = view;
        this.X = new ic(view);
        this.W = f6Var;
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
            i6Var.M = org.telegram.messenger.g0.f22537q.x;
        }
        if (this.G == null) {
            i6 i6Var2 = new i6(false, false, false, true, false);
            this.G = i6Var2;
            i6Var2.w(org.telegram.messenger.g0.L(12.0f));
            i6Var2.setCallback(bVar);
            i6Var2.x(org.telegram.messenger.g0.o());
            i6Var2.M = org.telegram.messenger.g0.f22537q.x;
            i6Var2.A = 0.35f;
        }
        this.f6309a = reactionCount;
        TLRPC.Reaction reaction = reactionCount.reaction;
        this.f6329q = reaction;
        o0 d = o0.d(reaction);
        this.f6330r = d;
        int i11 = reactionCount.count;
        this.v = i11;
        this.f6327o = reactionCount.chosen;
        this.f6321i = i11;
        this.f6322j = reactionCount.chosen_order;
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            this.f6326n = "stars";
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            this.f6326n = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
        } else if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            this.f6326n = Long.toString(((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
        } else {
            throw new RuntimeException("unsupported");
        }
        this.B.H0(view);
        this.P = reactionCount.chosen;
        bq bqVar = this.E;
        bqVar.G = false;
        bqVar.f32256a = true;
        if (reaction != null) {
            if (d.f6352a) {
                this.f6324l = true;
                if (rc.e(8200)) {
                    if (m0Var != null && (zg0Var = m0Var.Z) != null) {
                        this.Z = zg0Var;
                    } else {
                        this.Z = new zg0(2131624218, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
                    }
                    this.B.w0(this.Z);
                } else {
                    this.B.w0(t0.f25555b.getResources().getDrawable(2131232751).mutate());
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
            } else if (d.f6356f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(i7).f25825r.get(d.f6356f);
                if (tL_availableReaction != null) {
                    this.B.q0(hc.b(tL_availableReaction.center_icon), "40_40_lastreactframe", t5.f(tL_availableReaction.static_icon, k6.f27792a7, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            } else if (d.f6357g != 0) {
                this.C = new i5(i(), i7, d.f6357g);
            }
        }
        this.E.d(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(100.0f));
        this.E.f32259e = p0.V;
        if (z9) {
            String K1 = qp.s1(i7).K1(reaction);
            this.f6333u = K1;
            this.f6332t = !TextUtils.isEmpty(K1);
        }
        if (this.f6332t) {
            i6 i6Var3 = this.F;
            i6Var3.t(org.telegram.messenger.i6.m(this.f6333u, i6Var3.f34514a.getFontMetricsInt(), false, null, 0), !hd.f22871a0, true);
            if (this instanceof ol0) {
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
        bqVar2.f32278z = 3;
    }

    public final void a() {
        this.f6315d0 = true;
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
        this.f6315d0 = false;
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
        ImageReceiver imageReceiver = this.f6317e0;
        if (imageReceiver != null || this.f6319f0 != null) {
            if (imageReceiver != null) {
                imageReceiver.R();
                this.f6317e0 = null;
            } else if (this.f6319f0 != null) {
                View view = this.V;
                if (view != null && (view.getParent() instanceof View)) {
                    view = (View) view.getParent();
                }
                this.f6319f0.n(view);
                this.f6319f0 = null;
            }
        }
    }

    public final void d(Canvas canvas, float f10, float f11, float f12, float f13, boolean z9, boolean z10, float f14) {
        ImageReceiver imageReceiver;
        bq bqVar;
        ImageReceiver imageReceiver2;
        i6 i6Var;
        f6 f6Var;
        View view;
        float f15;
        float f16;
        float f17;
        boolean z11;
        float f18;
        float f19;
        i6 i6Var2;
        float f20;
        float f21;
        float f22;
        int L;
        int L2;
        ImageReceiver imageReceiver3;
        org.telegram.messenger.ic icVar;
        Paint paint;
        t4 L1;
        int w02;
        bq bqVar2 = this.E;
        View view2 = this.V;
        boolean z12 = this.f6324l;
        Rect rect = this.f6331s;
        i6 i6Var3 = this.F;
        i6 i6Var4 = this.G;
        f6 f6Var2 = this.W;
        i5 i5Var = this.C;
        if (i5Var != null) {
            imageReceiver = i5Var.f34505k;
        } else {
            imageReceiver = this.B;
        }
        if (this.f6327o) {
            if (z12) {
                this.I = -1529086;
                this.J = -1;
                this.L = -1;
                this.K = -1529086;
            } else {
                this.I = k6.w0(l() ? k6.Gc : k6.qk, f6Var2);
                this.J = k6.w0(l() ? k6.uk : k6.tk, f6Var2);
                if (view2 instanceof org.telegram.ui.Cells.t0) {
                    this.L = k6.w0(k6.wk, f6Var2);
                    this.K = k6.w0(k6.vk, f6Var2);
                } else {
                    this.L = k6.w0(l() ? k6.Gc : k6.qk, f6Var2);
                    this.K = k6.w0(l() ? k6.f28053ob : k6.f28111ra, f6Var2);
                }
            }
        } else if (z12) {
            this.J = -1529086;
            this.I = 1088989954;
            this.L = -1;
            this.K = 0;
        } else {
            this.J = k6.w0(l() ? k6.rk : k6.sk, f6Var2);
            int w03 = k6.w0(l() ? k6.Gc : k6.qk, f6Var2);
            this.I = w03;
            this.I = i0.a.o(w03, (int) (Color.alpha(w03) * 0.156f));
            this.L = k6.w0(k6.Wc, f6Var2);
            this.K = 0;
        }
        if (!z12 && (view2 instanceof q1) && ((q1) view2).v2()) {
            if (this.f6327o) {
                this.I = k6.w0(k6.f27908gb, f6Var2);
                this.J = k6.w0(k6.f27926hb, f6Var2);
            } else {
                if (l()) {
                    w02 = i0.a.k(k6.w0(k6.La, f6Var2), k6.w0(k6.f28168ua, f6Var2));
                } else {
                    w02 = k6.w0(k6.f28168ua, f6Var2);
                }
                this.I = i0.a.k(k6.w0(k6.eb, f6Var2), w02);
                this.J = k6.w0(k6.f27890fb, f6Var2);
            }
            this.L = this.J;
            this.K = this.I;
        }
        if (this.f6328p) {
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
        float f23 = 0.0f;
        int i7 = (f14 > 0.0f ? 1 : (f14 == 0.0f ? 0 : -1));
        if (i7 <= 0 || this.H == z10) {
            bqVar = bqVar2;
            imageReceiver2 = imageReceiver;
            i6Var = i6Var4;
            f6Var = f6Var2;
            view = view2;
        } else {
            if (z10) {
                i6Var = i6Var4;
                bqVar = bqVar2;
                f6Var = f6Var2;
                imageReceiver2 = imageReceiver;
                i6Var.m(0.6f, 650L, 1.6f, xq.f40314k);
                i6Var.t(org.telegram.messenger.g0.o0(this.v, 0), false, true);
                view = view2;
                i6Var.t(hd.E(this.v, ','), true, true);
            } else {
                bqVar = bqVar2;
                imageReceiver2 = imageReceiver;
                i6Var = i6Var4;
                f6Var = f6Var2;
                view = view2;
                i6Var.m(0.6f, 320L, 1.6f, xq.h);
                i6Var.t(org.telegram.messenger.g0.o0(this.v, 0), true, true);
            }
            this.H = z10;
        }
        float a10 = this.X.a(0.1f);
        int i10 = this.f6337z;
        if (i7 <= 0 || this.R || i6Var == null || this.S != null) {
            f15 = 1.0f;
            if (f12 != 1.0f) {
                f17 = 6.0f;
                f16 = 8.0f;
                if (this.f6311b == 3) {
                    i10 = (int) com.google.android.recaptcha.internal.a.z(1.0f, f12, this.f6316e, i10 * f12);
                }
            } else {
                f16 = 8.0f;
                f17 = 6.0f;
            }
        } else {
            i10 = (int) (i6Var.c() + org.telegram.messenger.g0.L(i5Var != null ? 6.0f : 4.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(8.0f));
            i6Var.u(this.M);
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
            z11 = true;
        } else {
            z11 = false;
        }
        float f26 = this.A / 2.0f;
        if (j() <= 0.0f || this.f6328p) {
            f18 = 2.0f;
            f19 = 4.0f;
        } else {
            f6 f6Var3 = f6Var;
            Paint W0 = k6.W0("paintChatActionBackground", f6Var3);
            f18 = 2.0f;
            Paint W02 = k6.W0("paintChatActionBackgroundDarken", f6Var3);
            f19 = 4.0f;
            int alpha = W0.getAlpha();
            int alpha2 = W02.getAlpha();
            W0.setAlpha((int) (alpha * f13 * j()));
            W02.setAlpha((int) (alpha2 * f13 * j()));
            g(canvas, rectF, f26, W0);
            if (f6Var == null ? k6.d1() : f6Var.g()) {
                g(canvas, rectF, f26, W02);
            }
            W0.setAlpha(alpha);
            W02.setAlpha(alpha2);
        }
        if (z9 && j() < f25) {
            View view3 = view;
            if ((view3 instanceof q1) && (L1 = ((q1) view3).L1(false)) != null && !this.R) {
                canvas.drawRoundRect(rectF, f26, f26, L1.f28508c);
            }
        }
        if (z13) {
            rectF.right += org.telegram.messenger.g0.L(f19);
            canvas.saveLayerAlpha(rectF, 255, 31);
            rectF.right -= org.telegram.messenger.g0.L(f19);
        }
        if (this.Y != null) {
            rc.e(8200);
        }
        g(canvas, rectF, f26, paint2);
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
                L2 = org.telegram.messenger.g0.L(f19);
            } else if (i5Var != null) {
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
            i5 i5Var2 = this.C;
            if (i5Var2 == null || (imageReceiver3 = i5Var2.f34505k) == null) {
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
            if (this.f6323k && (this.f6324l || this.f6321i > 1 || !m() || !this.P)) {
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
                    } else if (k10.B() != null && !k10.B().f40939k0) {
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
                    float f27 = imageReceiver3.K0 - (imageReceiver3.M0 / 2.0f);
                    float f28 = imageReceiver3.L0 - (imageReceiver3.N0 / 2.0f);
                    i6Var2 = i6Var3;
                    float floor = (int) Math.floor(f27);
                    float floor2 = (int) Math.floor(f28);
                    k10.y0(floor, floor2, imageReceiver3.M0 * 2.0f, imageReceiver3.N0 * 2.0f);
                    canvas.save();
                    canvas.translate(f27 - floor, f28 - floor2);
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
                this.f6325m = true;
            } else {
                i6Var2 = i6Var3;
                imageReceiver3.setAlpha(0.0f);
                imageReceiver3.h(canvas, null);
                this.f6325m = false;
            }
        } else {
            i6Var2 = i6Var3;
        }
        if (i6Var2 != null && i6Var2.i() > 0.0f) {
            canvas.save();
            if (!this.f6332t || h()) {
                f22 = this.f6332t ? 9 : 8;
            } else {
                f22 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f22) + f10 + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(f18), f11);
            i6Var2.setBounds(0, 0, this.f6337z, this.A);
            i6Var2.draw(canvas);
            i6Var2.B = (int) (f13 * 255.0f);
            canvas.restore();
            f23 = (i6Var2.i() * org.telegram.messenger.g0.L(f19)) + i6Var2.c();
        }
        if (i7 > 0 && !this.R && i6Var != null && this.S == null) {
            canvas.save();
            if (!this.f6332t || h()) {
                f21 = this.f6332t ? 9 : 8;
            } else {
                f21 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f21) + f10 + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(i5Var == null ? f18 : 5.0f), f11 - org.telegram.messenger.g0.L(f25));
            i6Var.setBounds(0, 0, this.f6337z, this.A);
            i6Var.draw(canvas);
            i6Var.B = (int) (255.0f * f13);
            canvas.restore();
        } else if (bqVar != null && e()) {
            canvas.save();
            if (!this.f6332t || h()) {
                f20 = this.f6332t ? 9 : 8;
            } else {
                f20 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f20) + f10 + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(i5Var == null ? f18 : 5.0f) + f23 + (z12 ? -org.telegram.messenger.g0.L(f25) : 0), f11);
            bqVar.a(canvas);
            canvas.restore();
        }
        if (!this.R && this.S != null) {
            canvas.save();
            canvas.translate(f10 + org.telegram.messenger.g0.L(10.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(f18), f11);
            y8 y8Var = this.S;
            y8Var.f40563u = f13;
            if (y8Var.f40564w && y8Var.f40548e != f12) {
                y8Var.f40548e = f12;
                if (f12 == f25) {
                    y8Var.k();
                    y8Var.f40564w = false;
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
        if ((i7 != 0 && (!this.R || this.f6332t || i7 != 1)) || this.E.f32265l != 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean f(Canvas canvas, float f10, float f11) {
        ud udVar = this.Y;
        if (udVar != null) {
            RectF rectF = udVar.f4845c;
            if (rc.e(8200) && rc.e(131072)) {
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(f10, f11, this.f6337z + f10, this.A + f11);
                float f12 = this.A / 2.0f;
                rectF.set(rectF2);
                rectF.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
                udVar.g(rectF);
                boolean d = udVar.d();
                udVar.a(canvas, i0.a.f(j(), i0.a.o(this.I, 255), i0.a.f(0.4f, this.L, i0.a.o(this.I, 255))));
                if (this.P) {
                    Path path = this.f6314c0;
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
            RectF rectF2 = this.f6310a0;
            int i7 = (rectF2.left > rectF.left ? 1 : (rectF2.left == rectF.left ? 0 : -1));
            Path path = this.f6314c0;
            if (i7 != 0 || rectF2.top != rectF.top || rectF2.right != rectF.right || rectF2.bottom != rectF.bottom) {
                rectF2.set(rectF);
                p0.h(rectF2, this.f6312b0, path);
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
                y8Var.f40561s = org.telegram.messenger.g0.L(20.0f);
                this.S.f40558p = org.telegram.messenger.g0.L(100.0f);
                y8 y8Var2 = this.S;
                y8Var2.f40557o = this.A;
                y8Var2.h(org.telegram.messenger.g0.L(22.0f));
            }
            if (this.f6315d0) {
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
        if (i5Var == null || (imageReceiver = i5Var.f34505k) == null) {
            imageReceiver = this.B;
        }
        if (imageReceiver != null) {
            zg0 B = imageReceiver.B();
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
        if (i5Var == null || (imageReceiver = i5Var.f34505k) == null) {
            imageReceiver = this.B;
        }
        if (imageReceiver != null) {
            zg0 B = imageReceiver.B();
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
        int f11 = i0.a.f(f10, this.f6318f, i0.a.f(j(), this.I, this.K));
        this.N = f11;
        int i10 = this.f6320g;
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
