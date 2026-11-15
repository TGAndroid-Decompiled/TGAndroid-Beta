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
import di.bc;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gc;
import org.telegram.messenger.gz;
import org.telegram.messenger.hc;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.qc;
import org.telegram.messenger.si;
import org.telegram.messenger.t5;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.v8;
public abstract class n0 {
    public int A;
    public final ImageReceiver B;
    public final g5 C;
    public int D;
    public final jq E;
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
    public v8 S;
    public ArrayList T;
    public final int U;
    public final View V;
    public final e6 W;
    public final dc X;
    public final bc Y;
    public final ch0 Z;
    public final TLRPC.ReactionCount f5139a;
    public int f5141b;
    public int f5143c;
    public int d;
    public boolean f5145d0;
    public int f5146e;
    public ImageReceiver f5147e0;
    public int f5148f;
    public g5 f5149f0;
    public int f5150g;
    public int h;
    public final int f5151i;
    public final int f5152j;
    public final boolean f5154l;
    public boolean f5155m;
    public final String f5156n;
    public boolean f5157o;
    public boolean f5158p;
    public final TLRPC.Reaction f5159q;
    public final p0 f5160r;
    public boolean f5162t;
    public final String f5163u;
    public int v;
    public int f5164w;
    public int f5165x;
    public int f5166y;
    public int f5167z;
    public boolean f5153k = true;
    public final Rect f5161s = new Rect();
    public final RectF f5140a0 = new RectF();
    public final RectF f5142b0 = new RectF();
    public final Path f5144c0 = new Path();

    public n0(n0 n0Var, int i7, View view, TLRPC.ReactionCount reactionCount, boolean z10, e6 e6Var) {
        bc bcVar;
        int i10;
        ch0 ch0Var;
        a5.b bVar = new a5.b(this, 1);
        this.U = i7;
        this.V = view;
        this.X = new dc(view);
        this.W = e6Var;
        this.R = z10;
        if (n0Var != null) {
            this.E = n0Var.E;
        }
        if (this.B == null) {
            this.B = new ImageReceiver(null);
        }
        if (this.E == null) {
            this.E = new jq(view, false, null);
        }
        if (this.F == null) {
            g6 g6Var = new g6(true, true, true);
            this.F = g6Var;
            g6Var.L = true;
            g6Var.n(0.4f, 320L, er.h);
            g6Var.w(org.telegram.messenger.g0.L(13.0f));
            g6Var.setCallback(bVar);
            g6Var.x(org.telegram.messenger.g0.o());
            g6Var.N = org.telegram.messenger.g0.f23609q.x;
        }
        if (this.G == null) {
            g6 g6Var2 = new g6(false, false, false, true, false);
            this.G = g6Var2;
            g6Var2.w(org.telegram.messenger.g0.L(12.0f));
            g6Var2.setCallback(bVar);
            g6Var2.x(org.telegram.messenger.g0.o());
            g6Var2.N = org.telegram.messenger.g0.f23609q.x;
            g6Var2.B = 0.35f;
        }
        this.f5139a = reactionCount;
        TLRPC.Reaction reaction = reactionCount.reaction;
        this.f5159q = reaction;
        p0 d = p0.d(reaction);
        this.f5160r = d;
        int i11 = reactionCount.count;
        this.v = i11;
        this.f5157o = reactionCount.chosen;
        this.f5151i = i11;
        this.f5152j = reactionCount.chosen_order;
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            this.f5156n = "stars";
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            this.f5156n = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
        } else if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            this.f5156n = Long.toString(((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
        } else {
            throw new RuntimeException("unsupported");
        }
        this.B.H0(view);
        this.P = reactionCount.chosen;
        jq jqVar = this.E;
        jqVar.G = false;
        jqVar.f36139a = true;
        if (reaction != null) {
            if (d.f5184a) {
                this.f5154l = true;
                if (qc.e(8200)) {
                    if (n0Var != null && (ch0Var = n0Var.Z) != null) {
                        this.Z = ch0Var;
                    } else {
                        this.Z = new ch0(2131624219, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
                    }
                    this.B.w0(this.Z);
                } else {
                    this.B.w0(org.telegram.messenger.t0.f26600b.getResources().getDrawable(2131232752).mutate());
                }
                if (n0Var == null || (bcVar = n0Var.Y) == null) {
                    if (gz.o() == 2) {
                        i10 = 18;
                    } else {
                        i10 = 8;
                    }
                    bcVar = new bc(1, i10);
                }
                this.Y = bcVar;
            } else if (d.f5188f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) si.b0(i7).f26495r.get(d.f5188f);
                if (tL_availableReaction != null) {
                    this.B.q0(gc.b(tL_availableReaction.center_icon), "40_40_lastreactframe", t5.f(tL_availableReaction.static_icon, j6.f28792a7, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            } else if (d.f5189g != 0) {
                this.C = new g5(i(), i7, d.f5189g);
            }
        }
        this.E.d(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(100.0f));
        this.E.f36142e = q0.V;
        if (z10) {
            String K1 = np.s1(i7).K1(reaction);
            this.f5163u = K1;
            this.f5162t = !TextUtils.isEmpty(K1);
        }
        if (this.f5162t) {
            g6 g6Var3 = this.F;
            g6Var3.t(org.telegram.messenger.j6.m(this.f5163u, g6Var3.f34827a.getFontMetricsInt(), false, null, 0), !hd.f24101a0, true);
            if (this instanceof sl0) {
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
        jq jqVar2 = this.E;
        jqVar2.I = 2;
        jqVar2.f36161z = 3;
    }

    public final void a() {
        this.f5145d0 = true;
        ImageReceiver imageReceiver = this.B;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
        v8 v8Var = this.S;
        if (v8Var != null) {
            v8Var.e();
        }
        g5 g5Var = this.C;
        if (g5Var != null) {
            g5Var.a(this.V);
        }
    }

    public final void b() {
        this.f5145d0 = false;
        ImageReceiver imageReceiver = this.B;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
        v8 v8Var = this.S;
        if (v8Var != null) {
            v8Var.f();
        }
        g5 g5Var = this.C;
        if (g5Var != null) {
            g5Var.n(this.V);
        }
        c();
    }

    public final void c() {
        ImageReceiver imageReceiver = this.f5147e0;
        if (imageReceiver != null || this.f5149f0 != null) {
            if (imageReceiver != null) {
                imageReceiver.R();
                this.f5147e0 = null;
            } else if (this.f5149f0 != null) {
                View view = this.V;
                if (view != null && (view.getParent() instanceof View)) {
                    view = (View) view.getParent();
                }
                this.f5149f0.n(view);
                this.f5149f0 = null;
            }
        }
    }

    public final void d(Canvas canvas, float f10, float f11, float f12, float f13, boolean z10, boolean z11, float f14) {
        ImageReceiver imageReceiver;
        jq jqVar;
        float f15;
        ImageReceiver imageReceiver2;
        g6 g6Var;
        e6 e6Var;
        View view;
        float f16;
        float f17;
        float f18;
        boolean z12;
        float f19;
        float f20;
        g6 g6Var2;
        float f21;
        float f22;
        float f23;
        float f24;
        int L;
        int L2;
        ImageReceiver imageReceiver3;
        hc hcVar;
        Paint paint;
        r4 M1;
        int w02;
        jq jqVar2 = this.E;
        View view2 = this.V;
        boolean z13 = this.f5154l;
        Rect rect = this.f5161s;
        g6 g6Var3 = this.F;
        g6 g6Var4 = this.G;
        e6 e6Var2 = this.W;
        g5 g5Var = this.C;
        if (g5Var != null) {
            imageReceiver = g5Var.f34809k;
        } else {
            imageReceiver = this.B;
        }
        if (this.f5157o) {
            if (z13) {
                this.I = -1529086;
                this.J = -1;
                this.L = -1;
                this.K = -1529086;
            } else {
                this.I = j6.w0(l() ? j6.Jc : j6.tk, e6Var2);
                this.J = j6.w0(l() ? j6.xk : j6.wk, e6Var2);
                if (view2 instanceof org.telegram.ui.Cells.t0) {
                    this.L = j6.w0(j6.zk, e6Var2);
                    this.K = j6.w0(j6.yk, e6Var2);
                } else {
                    this.L = j6.w0(l() ? j6.Jc : j6.tk, e6Var2);
                    this.K = j6.w0(l() ? j6.f29113rb : j6.f29112ra, e6Var2);
                }
            }
        } else if (z13) {
            this.J = -1529086;
            this.I = 1088989954;
            this.L = -1;
            this.K = 0;
        } else {
            this.J = j6.w0(l() ? j6.uk : j6.vk, e6Var2);
            int w03 = j6.w0(l() ? j6.Jc : j6.tk, e6Var2);
            this.I = w03;
            this.I = i0.a.o(w03, (int) (Color.alpha(w03) * 0.156f));
            this.L = j6.w0(j6.Zc, e6Var2);
            this.K = 0;
        }
        if (!z13 && (view2 instanceof q1) && ((q1) view2).w2()) {
            if (this.f5157o) {
                this.I = j6.w0(j6.f28963jb, e6Var2);
                this.J = j6.w0(j6.kb, e6Var2);
            } else {
                if (l()) {
                    w02 = i0.a.k(j6.w0(j6.La, e6Var2), j6.w0(j6.f29169ua, e6Var2));
                } else {
                    w02 = j6.w0(j6.f29169ua, e6Var2);
                }
                this.I = i0.a.k(j6.w0(j6.f28927hb, e6Var2), w02);
                this.J = j6.w0(j6.f28945ib, e6Var2);
            }
            this.L = this.J;
            this.K = this.I;
        }
        if (this.f5158p) {
            this.I = 0;
            this.K = 0;
        }
        r(f12);
        TextPaint textPaint = q0.V;
        textPaint.setColor(this.M);
        if (g6Var3 != null) {
            g6Var3.u(this.M);
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
            jqVar = jqVar2;
            f15 = 0.0f;
            imageReceiver2 = imageReceiver;
            g6Var = g6Var4;
            e6Var = e6Var2;
            view = view2;
        } else {
            if (z11) {
                g6Var = g6Var4;
                f15 = 0.0f;
                jqVar = jqVar2;
                e6Var = e6Var2;
                imageReceiver2 = imageReceiver;
                g6Var.m(0.6f, 650L, 1.6f, er.f34424k);
                g6Var.t(org.telegram.messenger.g0.o0(this.v, 0), false, true);
                view = view2;
                g6Var.t(hd.E(this.v, ','), true, true);
            } else {
                jqVar = jqVar2;
                f15 = 0.0f;
                imageReceiver2 = imageReceiver;
                g6Var = g6Var4;
                e6Var = e6Var2;
                view = view2;
                g6Var.m(0.6f, 320L, 1.6f, er.h);
                g6Var.t(org.telegram.messenger.g0.o0(this.v, 0), true, true);
            }
            this.H = z11;
        }
        float a10 = this.X.a(0.1f);
        int i10 = this.f5167z;
        if (i7 <= 0 || this.R || g6Var == null || this.S != null) {
            f16 = 1.0f;
            if (f12 != 1.0f) {
                f18 = 6.0f;
                f17 = 8.0f;
                if (this.f5141b == 3) {
                    i10 = (int) e2.z(1.0f, f12, this.f5146e, i10 * f12);
                }
            } else {
                f17 = 8.0f;
                f18 = 6.0f;
            }
        } else {
            i10 = (int) (g6Var.c() + org.telegram.messenger.g0.L(g5Var != null ? 6.0f : 4.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(8.0f));
            g6Var.u(this.M);
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
        if (j() <= f15 || this.f5158p) {
            f19 = 2.0f;
            f20 = 4.0f;
        } else {
            e6 e6Var3 = e6Var;
            Paint W0 = j6.W0("paintChatActionBackground", e6Var3);
            f19 = 2.0f;
            Paint W02 = j6.W0("paintChatActionBackgroundDarken", e6Var3);
            f20 = 4.0f;
            int alpha = W0.getAlpha();
            int alpha2 = W02.getAlpha();
            W0.setAlpha((int) (alpha * f13 * j()));
            W02.setAlpha((int) (alpha2 * f13 * j()));
            g(canvas, rectF, f27, W0);
            if (e6Var == null ? j6.d1() : e6Var.g()) {
                g(canvas, rectF, f27, W02);
            }
            W0.setAlpha(alpha);
            W02.setAlpha(alpha2);
        }
        if (z10 && j() < f26) {
            View view3 = view;
            if ((view3 instanceof q1) && (M1 = ((q1) view3).M1(false)) != null && !this.R) {
                canvas.drawRoundRect(rectF, f27, f27, M1.f29556c);
            }
        }
        if (z14) {
            rectF.right += org.telegram.messenger.g0.L(f20);
            canvas.saveLayerAlpha(rectF, 255, 31);
            rectF.right -= org.telegram.messenger.g0.L(f20);
        }
        if (this.Y != null) {
            qc.e(8200);
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
            } else if (g5Var != null) {
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
            g5 g5Var2 = this.C;
            if (g5Var2 == null || (imageReceiver3 = g5Var2.f34809k) == null) {
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
            if (this.f5153k && (this.f5154l || this.f5151i > 1 || !m() || !this.P)) {
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
                    } else if (k10.B() != null && !k10.B().f33586l0) {
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
                    float f28 = imageReceiver3.L0 - (imageReceiver3.N0 / 2.0f);
                    float f29 = imageReceiver3.M0 - (imageReceiver3.O0 / 2.0f);
                    g6Var2 = g6Var3;
                    float floor = (int) Math.floor(f28);
                    float floor2 = (int) Math.floor(f29);
                    k10.y0(floor, floor2, imageReceiver3.N0 * 2.0f, imageReceiver3.O0 * 2.0f);
                    canvas.save();
                    canvas.translate(f28 - floor, f29 - floor2);
                    hcVar = null;
                    k10.h(canvas, null);
                    canvas.restore();
                } else {
                    g6Var2 = g6Var3;
                    hcVar = null;
                    z15 = true;
                }
                if (z15) {
                    imageReceiver3.h(canvas, hcVar);
                }
                this.f5155m = true;
            } else {
                g6Var2 = g6Var3;
                imageReceiver3.setAlpha(0.0f);
                imageReceiver3.h(canvas, null);
                this.f5155m = false;
            }
        } else {
            g6Var2 = g6Var3;
        }
        if (g6Var2 == null || g6Var2.i() <= f15) {
            f21 = f15;
        } else {
            canvas.save();
            if (!this.f5162t || h()) {
                f24 = this.f5162t ? 9 : 8;
            } else {
                f24 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f24) + f10 + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(f19), f11);
            g6Var2.setBounds(0, 0, this.f5167z, this.A);
            g6Var2.draw(canvas);
            g6Var2.C = (int) (f13 * 255.0f);
            canvas.restore();
            f21 = g6Var2.c() + (g6Var2.i() * org.telegram.messenger.g0.L(f20));
        }
        if (i7 > 0 && !this.R && g6Var != null && this.S == null) {
            float max = Math.max(f15, (org.telegram.messenger.g0.L(12.0f) - g6Var.c()) / f19);
            canvas.save();
            if (!this.f5162t || h()) {
                f23 = this.f5162t ? 9 : 8;
            } else {
                f23 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f23) + f10 + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(g5Var == null ? f19 : 5.0f) + max, f11 - org.telegram.messenger.g0.L(f26));
            g6Var.setBounds(0, 0, this.f5167z, this.A);
            g6Var.draw(canvas);
            g6Var.C = (int) (255.0f * f13);
            canvas.restore();
        } else if (jqVar != null && e()) {
            canvas.save();
            if (!this.f5162t || h()) {
                f22 = this.f5162t ? 9 : 8;
            } else {
                f22 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f22) + f10 + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(g5Var == null ? f19 : 5.0f) + f21 + (z13 ? -org.telegram.messenger.g0.L(f26) : 0), f11);
            jqVar.a(canvas);
            canvas.restore();
        }
        if (!this.R && this.S != null) {
            canvas.save();
            canvas.translate(f10 + org.telegram.messenger.g0.L(10.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(f19), f11);
            v8 v8Var = this.S;
            v8Var.f40341u = f13;
            if (v8Var.f40342w && v8Var.f40326e != f12) {
                v8Var.f40326e = f12;
                if (f12 == f26) {
                    v8Var.k();
                    v8Var.f40342w = false;
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
        if ((i7 != 0 && (!this.R || this.f5162t || i7 != 1)) || this.E.f36148l != 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean f(Canvas canvas, float f10, float f11) {
        bc bcVar = this.Y;
        if (bcVar != null) {
            RectF rectF = bcVar.f8268c;
            if (qc.e(8200) && qc.e(131072)) {
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(f10, f11, this.f5167z + f10, this.A + f11);
                float f12 = this.A / 2.0f;
                rectF.set(rectF2);
                rectF.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
                bcVar.g(rectF);
                boolean d = bcVar.d();
                bcVar.a(canvas, i0.a.f(j(), i0.a.o(this.I, 255), i0.a.f(0.4f, this.L, i0.a.o(this.I, 255))));
                if (this.P) {
                    Path path = this.f5144c0;
                    path.rewind();
                    path.addRoundRect(rectF2, f12, f12, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    bcVar.a(canvas, this.J);
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
            RectF rectF2 = this.f5140a0;
            int i7 = (rectF2.left > rectF.left ? 1 : (rectF2.left == rectF.left ? 0 : -1));
            Path path = this.f5144c0;
            if (i7 != 0 || rectF2.top != rectF.top || rectF2.right != rectF.right || rectF2.bottom != rectF.bottom) {
                rectF2.set(rectF);
                q0.h(rectF2, this.f5142b0, path);
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
                v8 v8Var = new v8(this.V, false);
                this.S = v8Var;
                v8Var.v = 250L;
                er erVar = pi.k.V;
                v8Var.f40339s = org.telegram.messenger.g0.L(20.0f);
                this.S.f40336p = org.telegram.messenger.g0.L(100.0f);
                v8 v8Var2 = this.S;
                v8Var2.f40335o = this.A;
                v8Var2.h(org.telegram.messenger.g0.L(22.0f));
            }
            if (this.f5145d0) {
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
        g5 g5Var = this.C;
        if (g5Var == null || (imageReceiver = g5Var.f34809k) == null) {
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
        if (g5Var == null || (imageReceiver = g5Var.f34809k) == null) {
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
        int i7;
        this.M = i0.a.f(f10, this.h, i0.a.f(j(), this.J, this.L));
        int f11 = i0.a.f(f10, this.f5148f, i0.a.f(j(), this.I, this.K));
        this.N = f11;
        int i10 = this.f5150g;
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
