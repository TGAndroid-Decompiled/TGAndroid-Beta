package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public abstract class u49 {
    public int A;
    public final ImageReceiver B;
    public final wl C;
    public int D;
    public final dy2 E;
    public final hn F;
    public final hn G;
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
    public ic0 S;
    public ArrayList T;
    public final int U;
    public final View V;
    public final vnb W;
    public final v41 X;
    public final yza Y;
    public final b29 Z;
    public final TLRPC.ReactionCount a;
    public byte b;
    public int c;
    public int d;
    public boolean d0;
    public int e;
    public ImageReceiver e0;
    public int f;
    public wl f0;
    public int g;
    public int h;
    public final int i;
    public final int j;
    public final boolean l;
    public boolean m;
    public final String n;
    public boolean o;
    public boolean p;
    public final TLRPC.Reaction q;
    public final w49 r;
    public boolean t;
    public final String u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;
    public boolean k = true;
    public final Rect s = new Rect();
    public final RectF a0 = new RectF();
    public final RectF b0 = new RectF();
    public final Path c0 = new Path();

    public u49(u49 u49Var, int i, View view, TLRPC.ReactionCount reactionCount, boolean z, vnb vnbVar) {
        yza yzaVar;
        b29 b29Var;
        jn jnVar = new jn(this, (byte) 8);
        this.U = i;
        this.V = view;
        this.X = new v41(view);
        this.W = vnbVar;
        this.R = z;
        if (u49Var != null) {
            this.E = u49Var.E;
        }
        if (this.B == null) {
            this.B = new ImageReceiver(null);
        }
        if (this.E == null) {
            this.E = new dy2(view, false, null);
        }
        if (this.F == null) {
            hn hnVar = new hn(true, true, true);
            this.F = hnVar;
            hnVar.L = true;
            hnVar.n(0.4f, 320L, k43.h);
            hnVar.w(hl.L(13.0f));
            hnVar.setCallback(jnVar);
            hnVar.x(hl.o());
            hnVar.N = hl.q.x;
        }
        if (this.G == null) {
            hn hnVar2 = new hn(false, false, false, true, false);
            this.G = hnVar2;
            hnVar2.w(hl.L(12.0f));
            hnVar2.setCallback(jnVar);
            hnVar2.x(hl.o());
            hnVar2.N = hl.q.x;
            hnVar2.B = 0.35f;
        }
        this.a = reactionCount;
        TLRPC.Reaction reaction = reactionCount.reaction;
        this.q = reaction;
        w49 d = w49.d(reaction);
        this.r = d;
        int i2 = reactionCount.count;
        this.v = i2;
        this.o = reactionCount.chosen;
        this.i = i2;
        this.j = reactionCount.chosen_order;
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            this.n = "stars";
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            this.n = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
        } else if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            this.n = Long.toString(((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
        } else {
            xi4.l("unsupported");
            throw null;
        }
        this.B.p0(view);
        this.P = reactionCount.chosen;
        dy2 dy2Var = this.E;
        dy2Var.F = false;
        dy2Var.a = true;
        if (reaction != null) {
            if (d.a) {
                this.l = true;
                if (i86.e(8200)) {
                    if (u49Var != null && (b29Var = u49Var.Z) != null) {
                        this.Z = b29Var;
                    } else {
                        b29Var = new b29(2131624213, hl.L(40.0f), hl.L(40.0f));
                        this.Z = b29Var;
                    }
                    this.B.g0(b29Var);
                } else {
                    this.B.g0(a.b.getResources().getDrawable(2131232774).mutate());
                }
                if (u49Var == null || (yzaVar = u49Var.Y) == null) {
                    yzaVar = new yza(1, xea.o() == 2 ? 18 : 8);
                }
                this.Y = yzaVar;
            } else if (d.f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ls6.d0(i).r.get(d.f);
                if (tL_availableReaction != null) {
                    this.B.d0(jn5.b(tL_availableReaction.center_icon), "40_40_lastreactframe", lp3.f(tL_availableReaction.static_icon, aob.a7, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            } else if (d.g != 0) {
                this.C = new wl(i(), i, d.g);
            }
        }
        this.E.d(hl.L(26.0f), hl.L(100.0f));
        this.E.e = x49.V;
        if (z) {
            String J1 = uc7.s1(i).J1(reaction);
            this.u = J1;
            this.t = !TextUtils.isEmpty(J1);
        }
        boolean z2 = this.t;
        hn hnVar3 = this.F;
        if (z2) {
            hnVar3.t(pv3.m(this.u, hnVar3.a.getFontMetricsInt(), false, null, 0), !ob6.a0, true);
            boolean z3 = this instanceof mw9;
            dy2 dy2Var2 = this.E;
            if (z3) {
                dy2Var2.c(this.v, false);
            } else {
                dy2Var2.c(0, false);
            }
        } else {
            if (hnVar3 != null) {
                hnVar3.t("", false, true);
            }
            this.E.c(this.v, false);
        }
        dy2 dy2Var3 = this.E;
        dy2Var3.H = (byte) 2;
        dy2Var3.z = 3;
    }

    public final void a() {
        this.d0 = true;
        ImageReceiver imageReceiver = this.B;
        if (imageReceiver != null) {
            imageReceiver.I();
        }
        ic0 ic0Var = this.S;
        if (ic0Var != null) {
            ic0Var.e();
        }
        wl wlVar = this.C;
        if (wlVar != null) {
            wlVar.b(this.V);
        }
    }

    public final void b() {
        this.d0 = false;
        ImageReceiver imageReceiver = this.B;
        if (imageReceiver != null) {
            imageReceiver.K();
        }
        ic0 ic0Var = this.S;
        if (ic0Var != null) {
            ic0Var.f();
        }
        wl wlVar = this.C;
        if (wlVar != null) {
            wlVar.o(this.V);
        }
        c();
    }

    public final void c() {
        ImageReceiver imageReceiver = this.e0;
        if (imageReceiver != null || this.f0 != null) {
            if (imageReceiver != null) {
                imageReceiver.K();
                this.e0 = null;
            } else if (this.f0 != null) {
                View view = this.V;
                if (view != null && (view.getParent() instanceof View)) {
                    view = (View) view.getParent();
                }
                this.f0.o(view);
                this.f0 = null;
            }
        }
    }

    public final void d(android.graphics.Canvas r34, float r35, float r36, float r37, float r38, boolean r39, boolean r40, float r41) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u49.d(android.graphics.Canvas, float, float, float, float, boolean, boolean, float):void");
    }

    public boolean e() {
        int i = this.v;
        if ((i != 0 && (!this.R || this.t || i != 1)) || this.E.l != 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean f(Canvas canvas, float f, float f2) {
        yza yzaVar = this.Y;
        if (yzaVar != null) {
            RectF rectF = yzaVar.c;
            if (i86.e(8200) && i86.e(131072)) {
                RectF rectF2 = hl.P;
                rectF2.set(f, f2, this.z + f, this.A + f2);
                float f3 = this.A / 2.0f;
                rectF.set(rectF2);
                rectF.inset(-hl.L(4.0f), -hl.L(4.0f));
                yzaVar.g(rectF);
                boolean d = yzaVar.d();
                yzaVar.a(canvas, vm2.f(j(), vm2.o(this.I, 255), vm2.f(0.4f, this.L, vm2.o(this.I, 255))));
                if (this.P) {
                    Path path = this.c0;
                    path.rewind();
                    path.addRoundRect(rectF2, f3, f3, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    yzaVar.a(canvas, this.J);
                    canvas.restore();
                }
                return d;
            }
            return false;
        }
        return false;
    }

    public final void g(Canvas canvas, RectF rectF, float f, Paint paint) {
        if (this.R) {
            RectF rectF2 = this.a0;
            int i = (rectF2.left > rectF.left ? 1 : (rectF2.left == rectF.left ? 0 : -1));
            Path path = this.c0;
            if (i != 0 || rectF2.top != rectF.top || rectF2.right != rectF.right || rectF2.bottom != rectF.bottom) {
                rectF2.set(rectF);
                x49.h(rectF2, this.b0, path);
            }
            canvas.drawPath(path, paint);
            return;
        }
        canvas.drawRoundRect(rectF, f, f, paint);
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
            Collections.sort(arrayList, x49.Z);
            if (this.S == null) {
                ic0 ic0Var = new ic0(this.V, false);
                this.S = ic0Var;
                ic0Var.v = (short) 250;
                k43 k43Var = bb2.V;
                ic0Var.s = hl.L(20.0f);
                this.S.p = hl.L(100.0f);
                ic0 ic0Var2 = this.S;
                ic0Var2.o = this.A;
                ic0Var2.h(hl.L(22.0f));
            }
            if (this.d0) {
                this.S.e();
            }
            for (int i = 0; i < arrayList.size() && i != 3; i++) {
                this.S.j(i, this.U, (TLObject) arrayList.get(i));
            }
            this.S.a(false, true);
        }
    }

    public final void p() {
        ImageReceiver imageReceiver;
        wl wlVar = this.C;
        if (wlVar == null || (imageReceiver = wlVar.k) == null) {
            imageReceiver = this.B;
        }
        if (imageReceiver != null) {
            b29 y = imageReceiver.y();
            if (y != null) {
                y.C(true);
                return;
            }
            lm m = imageReceiver.m();
            if (m != null) {
                m.start();
            }
        }
    }

    public final void q() {
        ImageReceiver imageReceiver;
        wl wlVar = this.C;
        if (wlVar == null || (imageReceiver = wlVar.k) == null) {
            imageReceiver = this.B;
        }
        if (imageReceiver != null) {
            b29 y = imageReceiver.y();
            if (y != null) {
                y.stop();
                return;
            }
            lm m = imageReceiver.m();
            if (m != null) {
                m.stop();
            }
        }
    }

    public void r(float f) {
        int i;
        this.M = vm2.f(f, this.h, vm2.f(j(), this.J, this.L));
        int f2 = vm2.f(f, this.f, vm2.f(j(), this.I, this.K));
        this.N = f2;
        int i2 = this.g;
        if (hl.B(f2) > 0.8f) {
            i = 0;
        } else {
            i = 1526726655;
        }
        this.O = vm2.f(f, i2, i);
    }

    public void n() {
    }
}
