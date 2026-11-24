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
public abstract class i39 {
    public int A;
    public final ImageReceiver B;
    public final vm C;
    public int D;
    public final ty2 E;
    public final ho F;
    public final ho G;
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
    public gd0 S;
    public ArrayList T;
    public final int U;
    public final View V;
    public final ylb W;
    public final u51 X;
    public final yxa Y;
    public final p09 Z;
    public final TLRPC.ReactionCount a;
    public byte b;
    public int c;
    public int d;
    public boolean d0;
    public int e;
    public ImageReceiver e0;
    public int f;
    public vm f0;
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
    public final k39 r;
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

    public i39(i39 i39Var, int i, View view, TLRPC.ReactionCount reactionCount, boolean z, ylb ylbVar) {
        yxa yxaVar;
        p09 p09Var;
        jo joVar = new jo(this, (byte) 8);
        this.U = i;
        this.V = view;
        this.X = new u51(view);
        this.W = ylbVar;
        this.R = z;
        if (i39Var != null) {
            this.E = i39Var.E;
        }
        if (this.B == null) {
            this.B = new ImageReceiver(null);
        }
        if (this.E == null) {
            this.E = new ty2(view, false, null);
        }
        if (this.F == null) {
            ho hoVar = new ho(true, true, true);
            this.F = hoVar;
            hoVar.L = true;
            hoVar.n(0.4f, 320L, d53.h);
            hoVar.w(gm.L(13.0f));
            hoVar.setCallback(joVar);
            hoVar.x(gm.o());
            hoVar.N = gm.q.x;
        }
        if (this.G == null) {
            ho hoVar2 = new ho(false, false, false, true, false);
            this.G = hoVar2;
            hoVar2.w(gm.L(12.0f));
            hoVar2.setCallback(joVar);
            hoVar2.x(gm.o());
            hoVar2.N = gm.q.x;
            hoVar2.B = 0.35f;
        }
        this.a = reactionCount;
        TLRPC.Reaction reaction = reactionCount.reaction;
        this.q = reaction;
        k39 d = k39.d(reaction);
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
            zo4.k("unsupported");
            throw null;
        }
        this.B.p0(view);
        this.P = reactionCount.chosen;
        ty2 ty2Var = this.E;
        ty2Var.F = false;
        ty2Var.a = true;
        if (reaction != null) {
            if (d.a) {
                this.l = true;
                if (e86.e(8200)) {
                    if (i39Var != null && (p09Var = i39Var.Z) != null) {
                        this.Z = p09Var;
                    } else {
                        p09Var = new p09(2131624213, gm.L(40.0f), gm.L(40.0f));
                        this.Z = p09Var;
                    }
                    this.B.g0(p09Var);
                } else {
                    this.B.g0(a.b.getResources().getDrawable(2131232768).mutate());
                }
                if (i39Var == null || (yxaVar = i39Var.Y) == null) {
                    yxaVar = new yxa(1, gda.o() == 2 ? 18 : 8);
                }
                this.Y = yxaVar;
            } else if (d.f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hs6.d0(i).r.get(d.f);
                if (tL_availableReaction != null) {
                    this.B.d0(gn5.b(tL_availableReaction.center_icon), "40_40_lastreactframe", eq3.f(tL_availableReaction.static_icon, cmb.Z6, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            } else if (d.g != 0) {
                this.C = new vm(i(), i, d.g);
            }
        }
        this.E.d(gm.L(26.0f), gm.L(100.0f));
        this.E.e = l39.V;
        if (z) {
            String I1 = oc7.r1(i).I1(reaction);
            this.u = I1;
            this.t = !TextUtils.isEmpty(I1);
        }
        boolean z2 = this.t;
        ho hoVar3 = this.F;
        if (z2) {
            hoVar3.t(gw3.m(this.u, hoVar3.a.getFontMetricsInt(), false, null, 0), !jb6.a0, true);
            boolean z3 = this instanceof vu9;
            ty2 ty2Var2 = this.E;
            if (z3) {
                ty2Var2.c(this.v, false);
            } else {
                ty2Var2.c(0, false);
            }
        } else {
            if (hoVar3 != null) {
                hoVar3.t("", false, true);
            }
            this.E.c(this.v, false);
        }
        ty2 ty2Var3 = this.E;
        ty2Var3.H = (byte) 2;
        ty2Var3.z = 3;
    }

    public final void a() {
        this.d0 = true;
        ImageReceiver imageReceiver = this.B;
        if (imageReceiver != null) {
            imageReceiver.I();
        }
        gd0 gd0Var = this.S;
        if (gd0Var != null) {
            gd0Var.e();
        }
        vm vmVar = this.C;
        if (vmVar != null) {
            vmVar.b(this.V);
        }
    }

    public final void b() {
        this.d0 = false;
        ImageReceiver imageReceiver = this.B;
        if (imageReceiver != null) {
            imageReceiver.K();
        }
        gd0 gd0Var = this.S;
        if (gd0Var != null) {
            gd0Var.f();
        }
        vm vmVar = this.C;
        if (vmVar != null) {
            vmVar.o(this.V);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i39.d(android.graphics.Canvas, float, float, float, float, boolean, boolean, float):void");
    }

    public boolean e() {
        int i = this.v;
        if ((i != 0 && (!this.R || this.t || i != 1)) || this.E.l != 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean f(Canvas canvas, float f, float f2) {
        yxa yxaVar = this.Y;
        if (yxaVar != null) {
            RectF rectF = yxaVar.c;
            if (e86.e(8200) && e86.e(131072)) {
                RectF rectF2 = gm.P;
                rectF2.set(f, f2, this.z + f, this.A + f2);
                float f3 = this.A / 2.0f;
                rectF.set(rectF2);
                rectF.inset(-gm.L(4.0f), -gm.L(4.0f));
                yxaVar.g(rectF);
                boolean d = yxaVar.d();
                yxaVar.a(canvas, on2.f(j(), on2.p(this.I, 255), on2.f(0.4f, this.L, on2.p(this.I, 255))));
                if (this.P) {
                    Path path = this.c0;
                    path.rewind();
                    path.addRoundRect(rectF2, f3, f3, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    yxaVar.a(canvas, this.J);
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
                l39.h(rectF2, this.b0, path);
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
            Collections.sort(arrayList, l39.Z);
            if (this.S == null) {
                gd0 gd0Var = new gd0(this.V, false);
                this.S = gd0Var;
                gd0Var.v = (short) 250;
                d53 d53Var = wb2.V;
                gd0Var.s = gm.L(20.0f);
                this.S.p = gm.L(100.0f);
                gd0 gd0Var2 = this.S;
                gd0Var2.o = this.A;
                gd0Var2.h(gm.L(22.0f));
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
        vm vmVar = this.C;
        if (vmVar == null || (imageReceiver = vmVar.k) == null) {
            imageReceiver = this.B;
        }
        if (imageReceiver != null) {
            p09 y = imageReceiver.y();
            if (y != null) {
                y.C(true);
                return;
            }
            kn m = imageReceiver.m();
            if (m != null) {
                m.start();
            }
        }
    }

    public final void q() {
        ImageReceiver imageReceiver;
        vm vmVar = this.C;
        if (vmVar == null || (imageReceiver = vmVar.k) == null) {
            imageReceiver = this.B;
        }
        if (imageReceiver != null) {
            p09 y = imageReceiver.y();
            if (y != null) {
                y.stop();
                return;
            }
            kn m = imageReceiver.m();
            if (m != null) {
                m.stop();
            }
        }
    }

    public void r(float f) {
        int i;
        this.M = on2.f(f, this.h, on2.f(j(), this.J, this.L));
        int f2 = on2.f(f, this.f, on2.f(j(), this.I, this.K));
        this.N = f2;
        int i2 = this.g;
        if (gm.B(f2) > 0.8f) {
            i = 0;
        } else {
            i = 1526726655;
        }
        this.O = on2.f(f, i2, i);
    }

    public void n() {
    }
}
