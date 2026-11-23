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
import org.telegram.messenger.cz;
import org.telegram.messenger.gc;
import org.telegram.messenger.hc;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.messenger.np;
import org.telegram.messenger.qc;
import org.telegram.messenger.si;
import org.telegram.messenger.u5;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.u4;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.d9;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.sq;
public abstract class n0 {
    public int A;
    public final ImageReceiver B;
    public final p5 C;
    public int D;
    public final sq E;
    public final n6 F;
    public final n6 G;
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
    public d9 S;
    public ArrayList T;
    public final int U;
    public final View V;
    public final h6 W;
    public final mc X;
    public final ec Y;
    public final oh0 Z;
    public final TLRPC.ReactionCount f5459a;
    public int f5461b;
    public int f5463c;
    public int d;
    public boolean f5465d0;
    public int f5466e;
    public ImageReceiver f5467e0;
    public int f5468f;
    public p5 f5469f0;
    public int f5470g;
    public int h;
    public final int f5471i;
    public final int f5472j;
    public final boolean f5474l;
    public boolean f5475m;
    public final String f5476n;
    public boolean f5477o;
    public boolean f5478p;
    public final TLRPC.Reaction f5479q;
    public final p0 f5480r;
    public boolean f5482t;
    public final String f5483u;
    public int v;
    public int f5484w;
    public int f5485x;
    public int f5486y;
    public int f5487z;
    public boolean f5473k = true;
    public final Rect f5481s = new Rect();
    public final RectF f5460a0 = new RectF();
    public final RectF f5462b0 = new RectF();
    public final Path f5464c0 = new Path();

    public n0(n0 n0Var, int i7, View view, TLRPC.ReactionCount reactionCount, boolean z10, h6 h6Var) {
        ec ecVar;
        int i10;
        oh0 oh0Var;
        a5.b bVar = new a5.b(this, 1);
        this.U = i7;
        this.V = view;
        this.X = new mc(view);
        this.W = h6Var;
        this.R = z10;
        if (n0Var != null) {
            this.E = n0Var.E;
        }
        if (this.B == null) {
            this.B = new ImageReceiver(null);
        }
        if (this.E == null) {
            this.E = new sq(view, false, null);
        }
        if (this.F == null) {
            n6 n6Var = new n6(true, true, true);
            this.F = n6Var;
            n6Var.L = true;
            n6Var.n(0.4f, 320L, nr.h);
            n6Var.w(org.telegram.messenger.g0.L(13.0f));
            n6Var.setCallback(bVar);
            n6Var.x(org.telegram.messenger.g0.o());
            n6Var.N = org.telegram.messenger.g0.f24046q.x;
        }
        if (this.G == null) {
            n6 n6Var2 = new n6(false, false, false, true, false);
            this.G = n6Var2;
            n6Var2.w(org.telegram.messenger.g0.L(12.0f));
            n6Var2.setCallback(bVar);
            n6Var2.x(org.telegram.messenger.g0.o());
            n6Var2.N = org.telegram.messenger.g0.f24046q.x;
            n6Var2.B = 0.35f;
        }
        this.f5459a = reactionCount;
        TLRPC.Reaction reaction = reactionCount.reaction;
        this.f5479q = reaction;
        p0 d = p0.d(reaction);
        this.f5480r = d;
        int i11 = reactionCount.count;
        this.v = i11;
        this.f5477o = reactionCount.chosen;
        this.f5471i = i11;
        this.f5472j = reactionCount.chosen_order;
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            this.f5476n = "stars";
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            this.f5476n = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
        } else if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            this.f5476n = Long.toString(((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
        } else {
            throw new RuntimeException("unsupported");
        }
        this.B.H0(view);
        this.P = reactionCount.chosen;
        sq sqVar = this.E;
        sqVar.G = false;
        sqVar.f39651a = true;
        if (reaction != null) {
            if (d.f5503a) {
                this.f5474l = true;
                if (qc.e(8200)) {
                    if (n0Var != null && (oh0Var = n0Var.Z) != null) {
                        this.Z = oh0Var;
                    } else {
                        this.Z = new oh0(2131624219, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
                    }
                    this.B.w0(this.Z);
                } else {
                    this.B.w0(org.telegram.messenger.t0.f26931b.getResources().getDrawable(2131232753).mutate());
                }
                if (n0Var == null || (ecVar = n0Var.Y) == null) {
                    if (cz.o() == 2) {
                        i10 = 18;
                    } else {
                        i10 = 8;
                    }
                    ecVar = new ec(1, i10);
                }
                this.Y = ecVar;
            } else if (d.f5507f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) si.d0(i7).f26847r.get(d.f5507f);
                if (tL_availableReaction != null) {
                    this.B.q0(gc.b(tL_availableReaction.center_icon), "40_40_lastreactframe", u5.f(tL_availableReaction.static_icon, m6.f29324a7, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            } else if (d.f5508g != 0) {
                this.C = new p5(i(), i7, d.f5508g);
            }
        }
        this.E.d(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(100.0f));
        this.E.f39654e = q0.V;
        if (z10) {
            String M1 = np.u1(i7).M1(reaction);
            this.f5483u = M1;
            this.f5482t = !TextUtils.isEmpty(M1);
        }
        if (this.f5482t) {
            n6 n6Var3 = this.F;
            n6Var3.t(j6.m(this.f5483u, n6Var3.f37793a.getFontMetricsInt(), false, null, 0), !hd.f24444a0, true);
            if (this instanceof cm0) {
                Integer.toString(reactionCount.count);
                this.E.c(this.v, false);
            } else {
                this.E.c(0, false);
            }
        } else {
            n6 n6Var4 = this.F;
            if (n6Var4 != null) {
                n6Var4.t("", false, true);
            }
            Integer.toString(reactionCount.count);
            this.E.c(this.v, false);
        }
        sq sqVar2 = this.E;
        sqVar2.I = 2;
        sqVar2.f39673z = 3;
    }

    public final void a() {
        this.f5465d0 = true;
        ImageReceiver imageReceiver = this.B;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
        d9 d9Var = this.S;
        if (d9Var != null) {
            d9Var.e();
        }
        p5 p5Var = this.C;
        if (p5Var != null) {
            p5Var.a(this.V);
        }
    }

    public final void b() {
        this.f5465d0 = false;
        ImageReceiver imageReceiver = this.B;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
        d9 d9Var = this.S;
        if (d9Var != null) {
            d9Var.f();
        }
        p5 p5Var = this.C;
        if (p5Var != null) {
            p5Var.n(this.V);
        }
        c();
    }

    public final void c() {
        ImageReceiver imageReceiver = this.f5467e0;
        if (imageReceiver != null || this.f5469f0 != null) {
            if (imageReceiver != null) {
                imageReceiver.R();
                this.f5467e0 = null;
            } else if (this.f5469f0 != null) {
                View view = this.V;
                if (view != null && (view.getParent() instanceof View)) {
                    view = (View) view.getParent();
                }
                this.f5469f0.n(view);
                this.f5469f0 = null;
            }
        }
    }

    public final void d(Canvas canvas, float f10, float f11, float f12, float f13, boolean z10, boolean z11, float f14) {
        ImageReceiver imageReceiver;
        sq sqVar;
        float f15;
        ImageReceiver imageReceiver2;
        n6 n6Var;
        h6 h6Var;
        View view;
        float f16;
        float f17;
        float f18;
        boolean z12;
        float f19;
        float f20;
        n6 n6Var2;
        float f21;
        float f22;
        float f23;
        float f24;
        int L;
        int L2;
        ImageReceiver imageReceiver3;
        hc hcVar;
        Paint paint;
        u4 M1;
        int w02;
        sq sqVar2 = this.E;
        View view2 = this.V;
        boolean z13 = this.f5474l;
        Rect rect = this.f5481s;
        n6 n6Var3 = this.F;
        n6 n6Var4 = this.G;
        h6 h6Var2 = this.W;
        p5 p5Var = this.C;
        if (p5Var != null) {
            imageReceiver = p5Var.f38499k;
        } else {
            imageReceiver = this.B;
        }
        if (this.f5477o) {
            if (z13) {
                this.I = -1529086;
                this.J = -1;
                this.L = -1;
                this.K = -1529086;
            } else {
                this.I = m6.w0(l() ? m6.Jc : m6.tk, h6Var2);
                this.J = m6.w0(l() ? m6.xk : m6.wk, h6Var2);
                if (view2 instanceof v0) {
                    this.L = m6.w0(m6.zk, h6Var2);
                    this.K = m6.w0(m6.yk, h6Var2);
                } else {
                    this.L = m6.w0(l() ? m6.Jc : m6.tk, h6Var2);
                    this.K = m6.w0(l() ? m6.f29645rb : m6.f29644ra, h6Var2);
                }
            }
        } else if (z13) {
            this.J = -1529086;
            this.I = 1088989954;
            this.L = -1;
            this.K = 0;
        } else {
            this.J = m6.w0(l() ? m6.uk : m6.vk, h6Var2);
            int w03 = m6.w0(l() ? m6.Jc : m6.tk, h6Var2);
            this.I = w03;
            this.I = i0.a.o(w03, (int) (Color.alpha(w03) * 0.156f));
            this.L = m6.w0(m6.Zc, h6Var2);
            this.K = 0;
        }
        if (!z13 && (view2 instanceof r1) && ((r1) view2).w2()) {
            if (this.f5477o) {
                this.I = m6.w0(m6.f29495jb, h6Var2);
                this.J = m6.w0(m6.kb, h6Var2);
            } else {
                if (l()) {
                    w02 = i0.a.k(m6.w0(m6.La, h6Var2), m6.w0(m6.f29701ua, h6Var2));
                } else {
                    w02 = m6.w0(m6.f29701ua, h6Var2);
                }
                this.I = i0.a.k(m6.w0(m6.f29459hb, h6Var2), w02);
                this.J = m6.w0(m6.f29477ib, h6Var2);
            }
            this.L = this.J;
            this.K = this.I;
        }
        if (this.f5478p) {
            this.I = 0;
            this.K = 0;
        }
        r(f12);
        TextPaint textPaint = q0.V;
        textPaint.setColor(this.M);
        if (n6Var3 != null) {
            n6Var3.u(this.M);
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
            sqVar = sqVar2;
            f15 = 0.0f;
            imageReceiver2 = imageReceiver;
            n6Var = n6Var4;
            h6Var = h6Var2;
            view = view2;
        } else {
            if (z11) {
                n6Var = n6Var4;
                f15 = 0.0f;
                sqVar = sqVar2;
                h6Var = h6Var2;
                imageReceiver2 = imageReceiver;
                n6Var.m(0.6f, 650L, 1.6f, nr.f37964k);
                n6Var.t(org.telegram.messenger.g0.o0(this.v, 0), false, true);
                view = view2;
                n6Var.t(hd.E(this.v, ','), true, true);
            } else {
                sqVar = sqVar2;
                f15 = 0.0f;
                imageReceiver2 = imageReceiver;
                n6Var = n6Var4;
                h6Var = h6Var2;
                view = view2;
                n6Var.m(0.6f, 320L, 1.6f, nr.h);
                n6Var.t(org.telegram.messenger.g0.o0(this.v, 0), true, true);
            }
            this.H = z11;
        }
        float a10 = this.X.a(0.1f);
        int i10 = this.f5487z;
        if (i7 <= 0 || this.R || n6Var == null || this.S != null) {
            f16 = 1.0f;
            if (f12 != 1.0f) {
                f18 = 6.0f;
                f17 = 8.0f;
                if (this.f5461b == 3) {
                    i10 = (int) e2.z(1.0f, f12, this.f5466e, i10 * f12);
                }
            } else {
                f17 = 8.0f;
                f18 = 6.0f;
            }
        } else {
            i10 = (int) (n6Var.c() + org.telegram.messenger.g0.L(p5Var != null ? 6.0f : 4.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(8.0f));
            n6Var.u(this.M);
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
        if (j() <= f15 || this.f5478p) {
            f19 = 2.0f;
            f20 = 4.0f;
        } else {
            h6 h6Var3 = h6Var;
            Paint W0 = m6.W0("paintChatActionBackground", h6Var3);
            f19 = 2.0f;
            Paint W02 = m6.W0("paintChatActionBackgroundDarken", h6Var3);
            f20 = 4.0f;
            int alpha = W0.getAlpha();
            int alpha2 = W02.getAlpha();
            W0.setAlpha((int) (alpha * f13 * j()));
            W02.setAlpha((int) (alpha2 * f13 * j()));
            g(canvas, rectF, f27, W0);
            if (h6Var == null ? m6.d1() : h6Var.j()) {
                g(canvas, rectF, f27, W02);
            }
            W0.setAlpha(alpha);
            W02.setAlpha(alpha2);
        }
        if (z10 && j() < f26) {
            View view3 = view;
            if ((view3 instanceof r1) && (M1 = ((r1) view3).M1(false)) != null && !this.R) {
                canvas.drawRoundRect(rectF, f27, f27, M1.f30083c);
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
            } else if (p5Var != null) {
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
            p5 p5Var2 = this.C;
            if (p5Var2 == null || (imageReceiver3 = p5Var2.f38499k) == null) {
                imageReceiver3 = this.B;
            }
            if (imageReceiver3 != null && rect != null) {
                imageReceiver3.z0(rect);
            }
            p5 p5Var3 = this.C;
            if (p5Var3 != null && this.D != this.M) {
                int i14 = this.M;
                this.D = i14;
                p5Var3.setColorFilter(new PorterDuffColorFilter(i14, PorterDuff.Mode.SRC_IN));
            }
            boolean z15 = false;
            if (this.f5473k && (this.f5474l || this.f5471i > 1 || !m() || !this.P)) {
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
                    } else if (k10.B() != null && !k10.B().f38219l0) {
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
                    n6Var2 = n6Var3;
                    float floor = (int) Math.floor(f28);
                    float floor2 = (int) Math.floor(f29);
                    k10.y0(floor, floor2, imageReceiver3.N0 * 2.0f, imageReceiver3.O0 * 2.0f);
                    canvas.save();
                    canvas.translate(f28 - floor, f29 - floor2);
                    hcVar = null;
                    k10.h(canvas, null);
                    canvas.restore();
                } else {
                    n6Var2 = n6Var3;
                    hcVar = null;
                    z15 = true;
                }
                if (z15) {
                    imageReceiver3.h(canvas, hcVar);
                }
                this.f5475m = true;
            } else {
                n6Var2 = n6Var3;
                imageReceiver3.setAlpha(0.0f);
                imageReceiver3.h(canvas, null);
                this.f5475m = false;
            }
        } else {
            n6Var2 = n6Var3;
        }
        if (n6Var2 == null || n6Var2.i() <= f15) {
            f21 = f15;
        } else {
            canvas.save();
            if (!this.f5482t || h()) {
                f24 = this.f5482t ? 9 : 8;
            } else {
                f24 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f24) + f10 + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(f19), f11);
            n6Var2.setBounds(0, 0, this.f5487z, this.A);
            n6Var2.draw(canvas);
            n6Var2.C = (int) (f13 * 255.0f);
            canvas.restore();
            f21 = n6Var2.c() + (n6Var2.i() * org.telegram.messenger.g0.L(f20));
        }
        if (i7 > 0 && !this.R && n6Var != null && this.S == null) {
            float max = Math.max(f15, (org.telegram.messenger.g0.L(12.0f) - n6Var.c()) / f19);
            canvas.save();
            if (!this.f5482t || h()) {
                f23 = this.f5482t ? 9 : 8;
            } else {
                f23 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f23) + f10 + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(p5Var == null ? f19 : 5.0f) + max, f11 - org.telegram.messenger.g0.L(f26));
            n6Var.setBounds(0, 0, this.f5487z, this.A);
            n6Var.draw(canvas);
            n6Var.C = (int) (255.0f * f13);
            canvas.restore();
        } else if (sqVar != null && e()) {
            canvas.save();
            if (!this.f5482t || h()) {
                f22 = this.f5482t ? 9 : 8;
            } else {
                f22 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f22) + f10 + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(p5Var == null ? f19 : 5.0f) + f21 + (z13 ? -org.telegram.messenger.g0.L(f26) : 0), f11);
            sqVar.a(canvas);
            canvas.restore();
        }
        if (!this.R && this.S != null) {
            canvas.save();
            canvas.translate(f10 + org.telegram.messenger.g0.L(10.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(f19), f11);
            d9 d9Var = this.S;
            d9Var.f34442u = f13;
            if (d9Var.f34443w && d9Var.f34427e != f12) {
                d9Var.f34427e = f12;
                if (f12 == f26) {
                    d9Var.k();
                    d9Var.f34443w = false;
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
        if ((i7 != 0 && (!this.R || this.f5482t || i7 != 1)) || this.E.f39660l != 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean f(Canvas canvas, float f10, float f11) {
        ec ecVar = this.Y;
        if (ecVar != null) {
            RectF rectF = ecVar.f8758c;
            if (qc.e(8200) && qc.e(131072)) {
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(f10, f11, this.f5487z + f10, this.A + f11);
                float f12 = this.A / 2.0f;
                rectF.set(rectF2);
                rectF.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
                ecVar.g(rectF);
                boolean d = ecVar.d();
                ecVar.a(canvas, i0.a.f(j(), i0.a.o(this.I, 255), i0.a.f(0.4f, this.L, i0.a.o(this.I, 255))));
                if (this.P) {
                    Path path = this.f5464c0;
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
            RectF rectF2 = this.f5460a0;
            int i7 = (rectF2.left > rectF.left ? 1 : (rectF2.left == rectF.left ? 0 : -1));
            Path path = this.f5464c0;
            if (i7 != 0 || rectF2.top != rectF.top || rectF2.right != rectF.right || rectF2.bottom != rectF.bottom) {
                rectF2.set(rectF);
                q0.h(rectF2, this.f5462b0, path);
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
                d9 d9Var = new d9(this.V, false);
                this.S = d9Var;
                d9Var.v = 250L;
                nr nrVar = pi.k.V;
                d9Var.f34440s = org.telegram.messenger.g0.L(20.0f);
                this.S.f34437p = org.telegram.messenger.g0.L(100.0f);
                d9 d9Var2 = this.S;
                d9Var2.f34436o = this.A;
                d9Var2.h(org.telegram.messenger.g0.L(22.0f));
            }
            if (this.f5465d0) {
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
        p5 p5Var = this.C;
        if (p5Var == null || (imageReceiver = p5Var.f38499k) == null) {
            imageReceiver = this.B;
        }
        if (imageReceiver != null) {
            oh0 B = imageReceiver.B();
            if (B != null) {
                B.H(true);
                return;
            }
            c6 m10 = imageReceiver.m();
            if (m10 != null) {
                m10.start();
            }
        }
    }

    public final void q() {
        ImageReceiver imageReceiver;
        p5 p5Var = this.C;
        if (p5Var == null || (imageReceiver = p5Var.f38499k) == null) {
            imageReceiver = this.B;
        }
        if (imageReceiver != null) {
            oh0 B = imageReceiver.B();
            if (B != null) {
                B.stop();
                return;
            }
            c6 m10 = imageReceiver.m();
            if (m10 != null) {
                m10.stop();
            }
        }
    }

    public void r(float f10) {
        int i7;
        this.M = i0.a.f(f10, this.h, i0.a.f(j(), this.J, this.L));
        int f11 = i0.a.f(f10, this.f5468f, i0.a.f(j(), this.I, this.K));
        this.N = f11;
        int i10 = this.f5470g;
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
