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
import com.google.android.gms.internal.vision.e2;
import di.ec;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bz;
import org.telegram.messenger.fc;
import org.telegram.messenger.gc;
import org.telegram.messenger.gd;
import org.telegram.messenger.j6;
import org.telegram.messenger.mp;
import org.telegram.messenger.pc;
import org.telegram.messenger.ri;
import org.telegram.messenger.u5;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u4;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.c9;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.pq;
public abstract class n0 {
    public int A;
    public final ImageReceiver B;
    public final o5 C;
    public int D;
    public final pq E;
    public final m6 F;
    public final m6 G;
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
    public c9 S;
    public ArrayList T;
    public final int U;
    public final View V;
    public final i6 W;
    public final lc X;
    public final ec Y;
    public final nh0 Z;
    public final TLRPC.ReactionCount f5422a;
    public int f5424b;
    public int f5426c;
    public int d;
    public boolean f5428d0;
    public int f5429e;
    public ImageReceiver f5430e0;
    public int f5431f;
    public o5 f5432f0;
    public int f5433g;
    public int h;
    public final int f5434i;
    public final int f5435j;
    public final boolean f5437l;
    public boolean f5438m;
    public final String f5439n;
    public boolean f5440o;
    public boolean f5441p;
    public final TLRPC.Reaction f5442q;
    public final p0 f5443r;
    public boolean f5445t;
    public final String f5446u;
    public int v;
    public int f5447w;
    public int f5448x;
    public int f5449y;
    public int f5450z;
    public boolean f5436k = true;
    public final Rect f5444s = new Rect();
    public final RectF f5423a0 = new RectF();
    public final RectF f5425b0 = new RectF();
    public final Path f5427c0 = new Path();

    public n0(n0 n0Var, int i7, View view, TLRPC.ReactionCount reactionCount, boolean z10, i6 i6Var) {
        ec ecVar;
        int i10;
        nh0 nh0Var;
        a5.b bVar = new a5.b(this, 1);
        this.U = i7;
        this.V = view;
        this.X = new lc(view);
        this.W = i6Var;
        this.R = z10;
        if (n0Var != null) {
            this.E = n0Var.E;
        }
        if (this.B == null) {
            this.B = new ImageReceiver(null);
        }
        if (this.E == null) {
            this.E = new pq(view, false, null);
        }
        if (this.F == null) {
            m6 m6Var = new m6(true, true, true);
            this.F = m6Var;
            m6Var.L = true;
            m6Var.n(0.4f, 320L, kr.h);
            m6Var.w(org.telegram.messenger.g0.L(13.0f));
            m6Var.setCallback(bVar);
            m6Var.x(org.telegram.messenger.g0.o());
            m6Var.N = org.telegram.messenger.g0.f24226q.x;
        }
        if (this.G == null) {
            m6 m6Var2 = new m6(false, false, false, true, false);
            this.G = m6Var2;
            m6Var2.w(org.telegram.messenger.g0.L(12.0f));
            m6Var2.setCallback(bVar);
            m6Var2.x(org.telegram.messenger.g0.o());
            m6Var2.N = org.telegram.messenger.g0.f24226q.x;
            m6Var2.B = 0.35f;
        }
        this.f5422a = reactionCount;
        TLRPC.Reaction reaction = reactionCount.reaction;
        this.f5442q = reaction;
        p0 d = p0.d(reaction);
        this.f5443r = d;
        int i11 = reactionCount.count;
        this.v = i11;
        this.f5440o = reactionCount.chosen;
        this.f5434i = i11;
        this.f5435j = reactionCount.chosen_order;
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            this.f5439n = "stars";
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            this.f5439n = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
        } else if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            this.f5439n = Long.toString(((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
        } else {
            throw new RuntimeException("unsupported");
        }
        this.B.I0(view);
        this.P = reactionCount.chosen;
        pq pqVar = this.E;
        pqVar.G = false;
        pqVar.f38541a = true;
        if (reaction != null) {
            if (d.f5466a) {
                this.f5437l = true;
                if (pc.e(8200)) {
                    if (n0Var != null && (nh0Var = n0Var.Z) != null) {
                        this.Z = nh0Var;
                    } else {
                        this.Z = new nh0(2131624219, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
                    }
                    this.B.x0(this.Z);
                } else {
                    this.B.x0(org.telegram.messenger.t0.f27013b.getResources().getDrawable(2131232756).mutate());
                }
                if (n0Var == null || (ecVar = n0Var.Y) == null) {
                    if (bz.o() == 2) {
                        i10 = 18;
                    } else {
                        i10 = 8;
                    }
                    ecVar = new ec(1, i10);
                }
                this.Y = ecVar;
            } else if (d.f5470f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ri.d0(i7).f26734r.get(d.f5470f);
                if (tL_availableReaction != null) {
                    this.B.r0(fc.b(tL_availableReaction.center_icon), "40_40_lastreactframe", u5.f(tL_availableReaction.static_icon, n6.f29394a7, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            } else if (d.f5471g != 0) {
                this.C = new o5(i(), i7, d.f5471g);
            }
        }
        this.E.d(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(100.0f));
        this.E.f38544e = q0.V;
        if (z10) {
            String M1 = mp.u1(i7).M1(reaction);
            this.f5446u = M1;
            this.f5445t = !TextUtils.isEmpty(M1);
        }
        if (this.f5445t) {
            m6 m6Var3 = this.F;
            m6Var3.t(j6.m(this.f5446u, m6Var3.f37392a.getFontMetricsInt(), false, null, 0), !gd.f24314a0, true);
            if (this instanceof cm0) {
                Integer.toString(reactionCount.count);
                this.E.c(this.v, false);
            } else {
                this.E.c(0, false);
            }
        } else {
            m6 m6Var4 = this.F;
            if (m6Var4 != null) {
                m6Var4.t("", false, true);
            }
            Integer.toString(reactionCount.count);
            this.E.c(this.v, false);
        }
        pq pqVar2 = this.E;
        pqVar2.I = 2;
        pqVar2.f38563z = 3;
    }

    public final void a() {
        this.f5428d0 = true;
        ImageReceiver imageReceiver = this.B;
        if (imageReceiver != null) {
            imageReceiver.Q();
        }
        c9 c9Var = this.S;
        if (c9Var != null) {
            c9Var.e();
        }
        o5 o5Var = this.C;
        if (o5Var != null) {
            o5Var.a(this.V);
        }
    }

    public final void b() {
        this.f5428d0 = false;
        ImageReceiver imageReceiver = this.B;
        if (imageReceiver != null) {
            imageReceiver.S();
        }
        c9 c9Var = this.S;
        if (c9Var != null) {
            c9Var.f();
        }
        o5 o5Var = this.C;
        if (o5Var != null) {
            o5Var.n(this.V);
        }
        c();
    }

    public final void c() {
        ImageReceiver imageReceiver = this.f5430e0;
        if (imageReceiver != null || this.f5432f0 != null) {
            if (imageReceiver != null) {
                imageReceiver.S();
                this.f5430e0 = null;
            } else if (this.f5432f0 != null) {
                View view = this.V;
                if (view != null && (view.getParent() instanceof View)) {
                    view = (View) view.getParent();
                }
                this.f5432f0.n(view);
                this.f5432f0 = null;
            }
        }
    }

    public final void d(Canvas canvas, float f10, float f11, float f12, float f13, boolean z10, boolean z11, float f14) {
        ImageReceiver imageReceiver;
        pq pqVar;
        float f15;
        ImageReceiver imageReceiver2;
        m6 m6Var;
        i6 i6Var;
        View view;
        float f16;
        float f17;
        float f18;
        boolean z12;
        float f19;
        float f20;
        m6 m6Var2;
        float f21;
        float f22;
        float f23;
        float f24;
        int L;
        int L2;
        ImageReceiver imageReceiver3;
        gc gcVar;
        Paint paint;
        u4 M1;
        int w02;
        pq pqVar2 = this.E;
        View view2 = this.V;
        boolean z13 = this.f5437l;
        Rect rect = this.f5444s;
        m6 m6Var3 = this.F;
        m6 m6Var4 = this.G;
        i6 i6Var2 = this.W;
        o5 o5Var = this.C;
        if (o5Var != null) {
            imageReceiver = o5Var.f38028k;
        } else {
            imageReceiver = this.B;
        }
        if (this.f5440o) {
            if (z13) {
                this.I = -1529086;
                this.J = -1;
                this.L = -1;
                this.K = -1529086;
            } else {
                this.I = n6.w0(l() ? n6.Jc : n6.tk, i6Var2);
                this.J = n6.w0(l() ? n6.xk : n6.wk, i6Var2);
                if (view2 instanceof v0) {
                    this.L = n6.w0(n6.zk, i6Var2);
                    this.K = n6.w0(n6.yk, i6Var2);
                } else {
                    this.L = n6.w0(l() ? n6.Jc : n6.tk, i6Var2);
                    this.K = n6.w0(l() ? n6.f29715rb : n6.f29714ra, i6Var2);
                }
            }
        } else if (z13) {
            this.J = -1529086;
            this.I = 1088989954;
            this.L = -1;
            this.K = 0;
        } else {
            this.J = n6.w0(l() ? n6.uk : n6.vk, i6Var2);
            int w03 = n6.w0(l() ? n6.Jc : n6.tk, i6Var2);
            this.I = w03;
            this.I = i0.a.o(w03, (int) (Color.alpha(w03) * 0.156f));
            this.L = n6.w0(n6.Zc, i6Var2);
            this.K = 0;
        }
        if (!z13 && (view2 instanceof r1) && ((r1) view2).w2()) {
            if (this.f5440o) {
                this.I = n6.w0(n6.f29565jb, i6Var2);
                this.J = n6.w0(n6.kb, i6Var2);
            } else {
                if (l()) {
                    w02 = i0.a.k(n6.w0(n6.La, i6Var2), n6.w0(n6.f29771ua, i6Var2));
                } else {
                    w02 = n6.w0(n6.f29771ua, i6Var2);
                }
                this.I = i0.a.k(n6.w0(n6.f29529hb, i6Var2), w02);
                this.J = n6.w0(n6.f29547ib, i6Var2);
            }
            this.L = this.J;
            this.K = this.I;
        }
        if (this.f5441p) {
            this.I = 0;
            this.K = 0;
        }
        r(f12);
        TextPaint textPaint = q0.V;
        textPaint.setColor(this.M);
        if (m6Var3 != null) {
            m6Var3.u(this.M);
        }
        Paint paint2 = q0.S;
        paint2.setColor(this.N);
        boolean z14 = this.R && h() && Color.alpha(this.O) == 0;
        if (f13 != 1.0f) {
            textPaint.setAlpha((int) (textPaint.getAlpha() * f13));
            paint2.setAlpha((int) (paint2.getAlpha() * f13));
        }
        if (imageReceiver != null) {
            imageReceiver.setAlpha(f13);
        }
        int i7 = (f14 > 0.0f ? 1 : (f14 == 0.0f ? 0 : -1));
        if (i7 <= 0 || this.H == z11) {
            pqVar = pqVar2;
            f15 = 0.0f;
            imageReceiver2 = imageReceiver;
            m6Var = m6Var4;
            i6Var = i6Var2;
            view = view2;
        } else {
            if (z11) {
                m6Var = m6Var4;
                f15 = 0.0f;
                pqVar = pqVar2;
                i6Var = i6Var2;
                imageReceiver2 = imageReceiver;
                m6Var.m(0.6f, 650L, 1.6f, kr.f36862k);
                m6Var.t(org.telegram.messenger.g0.o0(this.v, 0), false, true);
                view = view2;
                m6Var.t(gd.E(this.v, ','), true, true);
            } else {
                pqVar = pqVar2;
                f15 = 0.0f;
                imageReceiver2 = imageReceiver;
                m6Var = m6Var4;
                i6Var = i6Var2;
                view = view2;
                m6Var.m(0.6f, 320L, 1.6f, kr.h);
                m6Var.t(org.telegram.messenger.g0.o0(this.v, 0), true, true);
            }
            this.H = z11;
        }
        float a10 = this.X.a(0.1f);
        int i10 = this.f5450z;
        if (i7 <= 0 || this.R || m6Var == null || this.S != null) {
            f16 = 1.0f;
            if (f12 != 1.0f) {
                f18 = 6.0f;
                f17 = 8.0f;
                if (this.f5424b == 3) {
                    i10 = (int) e2.z(1.0f, f12, this.f5429e, i10 * f12);
                }
            } else {
                f17 = 8.0f;
                f18 = 6.0f;
            }
        } else {
            i10 = (int) (m6Var.c() + org.telegram.messenger.g0.L(o5Var != null ? 6.0f : 4.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(8.0f));
            m6Var.u(this.M);
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
            z12 = true;
        } else {
            z12 = false;
        }
        float f27 = this.A / 2.0f;
        if (j() <= f15 || this.f5441p) {
            f19 = 2.0f;
            f20 = 4.0f;
        } else {
            i6 i6Var3 = i6Var;
            Paint W0 = n6.W0("paintChatActionBackground", i6Var3);
            f19 = 2.0f;
            Paint W02 = n6.W0("paintChatActionBackgroundDarken", i6Var3);
            f20 = 4.0f;
            int alpha = W0.getAlpha();
            int alpha2 = W02.getAlpha();
            W0.setAlpha((int) (alpha * f13 * j()));
            W02.setAlpha((int) (alpha2 * f13 * j()));
            g(canvas, rectF, f27, W0);
            if (i6Var == null ? n6.d1() : i6Var.h()) {
                g(canvas, rectF, f27, W02);
            }
            W0.setAlpha(alpha);
            W02.setAlpha(alpha2);
        }
        if (z10 && j() < f26) {
            View view3 = view;
            if ((view3 instanceof r1) && (M1 = ((r1) view3).M1(false)) != null && !this.R) {
                canvas.drawRoundRect(rectF, f27, f27, M1.f30142c);
            }
        }
        if (z14) {
            rectF.right += org.telegram.messenger.g0.L(f20);
            canvas.saveLayerAlpha(rectF, 255, 31);
            rectF.right -= org.telegram.messenger.g0.L(f20);
        }
        if (this.Y != null) {
            pc.e(8200);
        }
        g(canvas, rectF, f27, paint2);
        if (this.R && h()) {
            if (z14) {
                paint = q0.U;
            } else {
                paint = q0.T;
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
                L2 = org.telegram.messenger.g0.L(f20);
            } else if (o5Var != null) {
                L = org.telegram.messenger.g0.L(24.0f);
                L2 = org.telegram.messenger.g0.L(f18);
                imageReceiver4.K0(org.telegram.messenger.g0.L(f18));
            } else {
                L = org.telegram.messenger.g0.L(20.0f);
                L2 = org.telegram.messenger.g0.L(f17);
                imageReceiver4.K0(0);
            }
            int i11 = (int) ((this.A - L) / f19);
            if (this.R) {
                L2 -= org.telegram.messenger.g0.L(f19);
            }
            int i12 = ((int) f10) + L2;
            int i13 = ((int) f11) + i11;
            rect.set(i12, i13, i12 + L, L + i13);
            o5 o5Var2 = this.C;
            if (o5Var2 == null || (imageReceiver3 = o5Var2.f38028k) == null) {
                imageReceiver3 = this.B;
            }
            if (imageReceiver3 != null && rect != null) {
                imageReceiver3.A0(rect);
            }
            o5 o5Var3 = this.C;
            if (o5Var3 != null && this.D != this.M) {
                int i14 = this.M;
                this.D = i14;
                o5Var3.setColorFilter(new PorterDuffColorFilter(i14, PorterDuff.Mode.SRC_IN));
            }
            boolean z15 = false;
            if (this.f5436k && (this.f5437l || this.f5434i > 1 || !m() || !this.P)) {
                ImageReceiver k10 = k();
                if (k10 != null) {
                    if (k10.C() == null || !k10.C().u()) {
                        z15 = true;
                    }
                    if (f13 != 1.0f) {
                        k10.setAlpha(f13);
                        if (f13 <= 0.0f) {
                            k10.S();
                            n();
                        }
                    } else if (k10.C() != null && !k10.C().f37814l0) {
                        float alpha3 = k10.getAlpha() - 0.08f;
                        if (alpha3 <= 0.0f) {
                            k10.S();
                            n();
                        } else {
                            k10.setAlpha(alpha3);
                        }
                        this.V.invalidate();
                        z15 = true;
                    }
                    float f28 = imageReceiver3.L0 - (imageReceiver3.N0 / 2.0f);
                    float f29 = imageReceiver3.M0 - (imageReceiver3.O0 / 2.0f);
                    m6Var2 = m6Var3;
                    float floor = (int) Math.floor(f28);
                    float floor2 = (int) Math.floor(f29);
                    k10.z0(floor, floor2, imageReceiver3.N0 * 2.0f, imageReceiver3.O0 * 2.0f);
                    canvas.save();
                    canvas.translate(f28 - floor, f29 - floor2);
                    gcVar = null;
                    k10.h(canvas, null);
                    canvas.restore();
                } else {
                    m6Var2 = m6Var3;
                    gcVar = null;
                    z15 = true;
                }
                if (z15) {
                    imageReceiver3.h(canvas, gcVar);
                }
                this.f5438m = true;
            } else {
                m6Var2 = m6Var3;
                imageReceiver3.setAlpha(0.0f);
                imageReceiver3.h(canvas, null);
                this.f5438m = false;
            }
        } else {
            m6Var2 = m6Var3;
        }
        if (m6Var2 == null || m6Var2.i() <= f15) {
            f21 = f15;
        } else {
            canvas.save();
            if (!this.f5445t || h()) {
                f24 = this.f5445t ? 9 : 8;
            } else {
                f24 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f24) + f10 + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(f19), f11);
            m6Var2.setBounds(0, 0, this.f5450z, this.A);
            m6Var2.draw(canvas);
            m6Var2.C = (int) (f13 * 255.0f);
            canvas.restore();
            f21 = m6Var2.c() + (m6Var2.i() * org.telegram.messenger.g0.L(f20));
        }
        if (i7 > 0 && !this.R && m6Var != null && this.S == null) {
            float max = Math.max(f15, (org.telegram.messenger.g0.L(12.0f) - m6Var.c()) / f19);
            canvas.save();
            if (!this.f5445t || h()) {
                f23 = this.f5445t ? 9 : 8;
            } else {
                f23 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f23) + f10 + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(o5Var == null ? f19 : 5.0f) + max, f11 - org.telegram.messenger.g0.L(f26));
            m6Var.setBounds(0, 0, this.f5450z, this.A);
            m6Var.draw(canvas);
            m6Var.C = (int) (255.0f * f13);
            canvas.restore();
        } else if (pqVar != null && e()) {
            canvas.save();
            if (!this.f5445t || h()) {
                f22 = this.f5445t ? 9 : 8;
            } else {
                f22 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f22) + f10 + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(o5Var == null ? f19 : 5.0f) + f21 + (z13 ? -org.telegram.messenger.g0.L(f26) : 0), f11);
            pqVar.a(canvas);
            canvas.restore();
        }
        if (!this.R && this.S != null) {
            canvas.save();
            canvas.translate(f10 + org.telegram.messenger.g0.L(10.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(f19), f11);
            c9 c9Var = this.S;
            c9Var.f33967u = f13;
            if (c9Var.f33968w && c9Var.f33952e != f12) {
                c9Var.f33952e = f12;
                if (f12 == f26) {
                    c9Var.k();
                    c9Var.f33968w = false;
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
        int i7 = this.v;
        if ((i7 != 0 && (!this.R || this.f5445t || i7 != 1)) || this.E.f38550l != 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean f(Canvas canvas, float f10, float f11) {
        ec ecVar = this.Y;
        if (ecVar != null) {
            RectF rectF = ecVar.f8719c;
            if (pc.e(8200) && pc.e(131072)) {
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(f10, f11, this.f5450z + f10, this.A + f11);
                float f12 = this.A / 2.0f;
                rectF.set(rectF2);
                rectF.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
                ecVar.g(rectF);
                boolean d = ecVar.d();
                ecVar.a(canvas, i0.a.f(j(), i0.a.o(this.I, 255), i0.a.f(0.4f, this.L, i0.a.o(this.I, 255))));
                if (this.P) {
                    Path path = this.f5427c0;
                    path.rewind();
                    path.addRoundRect(rectF2, f12, f12, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    ecVar.a(canvas, this.J);
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
            RectF rectF2 = this.f5423a0;
            int i7 = (rectF2.left > rectF.left ? 1 : (rectF2.left == rectF.left ? 0 : -1));
            Path path = this.f5427c0;
            if (i7 != 0 || rectF2.top != rectF.top || rectF2.right != rectF.right || rectF2.bottom != rectF.bottom) {
                rectF2.set(rectF);
                q0.h(rectF2, this.f5425b0, path);
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
            Collections.sort(arrayList, q0.Z);
            if (this.S == null) {
                c9 c9Var = new c9(this.V, false);
                this.S = c9Var;
                c9Var.v = 250L;
                kr krVar = pi.k.V;
                c9Var.f33965s = org.telegram.messenger.g0.L(20.0f);
                this.S.f33962p = org.telegram.messenger.g0.L(100.0f);
                c9 c9Var2 = this.S;
                c9Var2.f33961o = this.A;
                c9Var2.h(org.telegram.messenger.g0.L(22.0f));
            }
            if (this.f5428d0) {
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
        o5 o5Var = this.C;
        if (o5Var == null || (imageReceiver = o5Var.f38028k) == null) {
            imageReceiver = this.B;
        }
        if (imageReceiver != null) {
            nh0 C = imageReceiver.C();
            if (C != null) {
                C.H(true);
                return;
            }
            b6 m10 = imageReceiver.m();
            if (m10 != null) {
                m10.start();
            }
        }
    }

    public final void q() {
        ImageReceiver imageReceiver;
        o5 o5Var = this.C;
        if (o5Var == null || (imageReceiver = o5Var.f38028k) == null) {
            imageReceiver = this.B;
        }
        if (imageReceiver != null) {
            nh0 C = imageReceiver.C();
            if (C != null) {
                C.stop();
                return;
            }
            b6 m10 = imageReceiver.m();
            if (m10 != null) {
                m10.stop();
            }
        }
    }

    public void r(float f10) {
        int i7;
        this.M = i0.a.f(f10, this.h, i0.a.f(j(), this.J, this.L));
        int f11 = i0.a.f(f10, this.f5431f, i0.a.f(j(), this.I, this.K));
        this.N = f11;
        int i10 = this.f5433g;
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
