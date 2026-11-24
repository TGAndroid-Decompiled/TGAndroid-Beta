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
public abstract class f19 {
    public int A;
    public final ImageReceiver B;
    public final vl C;
    public int D;
    public final jx2 E;
    public final gn F;
    public final gn G;
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
    public gc0 S;
    public ArrayList T;
    public final int U;
    public final View V;
    public final wjb W;
    public final n41 X;
    public final vva Y;
    public final oy8 Z;
    public final TLRPC.ReactionCount a;
    public byte b;
    public int c;
    public int d;
    public boolean d0;
    public int e;
    public ImageReceiver e0;
    public int f;
    public vl f0;
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
    public final h19 r;
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

    public f19(f19 f19Var, int i, View view, TLRPC.ReactionCount reactionCount, boolean z, wjb wjbVar) {
        vva vvaVar;
        oy8 oy8Var;
        in inVar = new in(this, (byte) 8);
        this.U = i;
        this.V = view;
        this.X = new n41(view);
        this.W = wjbVar;
        this.R = z;
        if (f19Var != null) {
            this.E = f19Var.E;
        }
        if (this.B == null) {
            this.B = new ImageReceiver(null);
        }
        if (this.E == null) {
            this.E = new jx2(view, false, null);
        }
        if (this.F == null) {
            gn gnVar = new gn(true, true, true);
            this.F = gnVar;
            gnVar.L = true;
            gnVar.n(0.4f, 320L, s33.h);
            gnVar.w(gl.L(13.0f));
            gnVar.setCallback(inVar);
            gnVar.x(gl.o());
            gnVar.N = gl.q.x;
        }
        if (this.G == null) {
            gn gnVar2 = new gn(false, false, false, true, false);
            this.G = gnVar2;
            gnVar2.w(gl.L(12.0f));
            gnVar2.setCallback(inVar);
            gnVar2.x(gl.o());
            gnVar2.N = gl.q.x;
            gnVar2.B = 0.35f;
        }
        this.a = reactionCount;
        TLRPC.Reaction reaction = reactionCount.reaction;
        this.q = reaction;
        h19 d = h19.d(reaction);
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
            wn4.j("unsupported");
            throw null;
        }
        this.B.p0(view);
        this.P = reactionCount.chosen;
        jx2 jx2Var = this.E;
        jx2Var.F = false;
        jx2Var.a = true;
        if (reaction != null) {
            if (d.a) {
                this.l = true;
                if (e66.e(8200)) {
                    if (f19Var != null && (oy8Var = f19Var.Z) != null) {
                        this.Z = oy8Var;
                    } else {
                        oy8Var = new oy8(2131624214, gl.L(40.0f), gl.L(40.0f));
                        this.Z = oy8Var;
                    }
                    this.B.g0(oy8Var);
                } else {
                    this.B.g0(a.b.getResources().getDrawable(2131232756).mutate());
                }
                if (f19Var == null || (vvaVar = f19Var.Y) == null) {
                    vvaVar = new vva(1, gba.o() == 2 ? 18 : 8);
                }
                this.Y = vvaVar;
            } else if (d.f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hq6.d0(i).r.get(d.f);
                if (tL_availableReaction != null) {
                    this.B.d0(gl5.b(tL_availableReaction.center_icon), "40_40_lastreactframe", uo3.f(tL_availableReaction.static_icon, bkb.Z6, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            } else if (d.g != 0) {
                this.C = new vl(i(), i, d.g);
            }
        }
        this.E.d(gl.L(26.0f), gl.L(100.0f));
        this.E.e = i19.V;
        if (z) {
            String H1 = na7.q1(i).H1(reaction);
            this.u = H1;
            this.t = !TextUtils.isEmpty(H1);
        }
        boolean z2 = this.t;
        gn gnVar3 = this.F;
        if (z2) {
            gnVar3.t(vu3.m(this.u, gnVar3.a.getFontMetricsInt(), false, null, 0), !k96.a0, true);
            boolean z3 = this instanceof ts9;
            jx2 jx2Var2 = this.E;
            if (z3) {
                jx2Var2.c(this.v, false);
            } else {
                jx2Var2.c(0, false);
            }
        } else {
            if (gnVar3 != null) {
                gnVar3.t("", false, true);
            }
            this.E.c(this.v, false);
        }
        jx2 jx2Var3 = this.E;
        jx2Var3.H = (byte) 2;
        jx2Var3.z = 3;
    }

    public final void a() {
        this.d0 = true;
        ImageReceiver imageReceiver = this.B;
        if (imageReceiver != null) {
            imageReceiver.I();
        }
        gc0 gc0Var = this.S;
        if (gc0Var != null) {
            gc0Var.e();
        }
        vl vlVar = this.C;
        if (vlVar != null) {
            vlVar.b(this.V);
        }
    }

    public final void b() {
        this.d0 = false;
        ImageReceiver imageReceiver = this.B;
        if (imageReceiver != null) {
            imageReceiver.K();
        }
        gc0 gc0Var = this.S;
        if (gc0Var != null) {
            gc0Var.f();
        }
        vl vlVar = this.C;
        if (vlVar != null) {
            vlVar.o(this.V);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f19.d(android.graphics.Canvas, float, float, float, float, boolean, boolean, float):void");
    }

    public boolean e() {
        int i = this.v;
        if ((i != 0 && (!this.R || this.t || i != 1)) || this.E.l != 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean f(Canvas canvas, float f, float f2) {
        vva vvaVar = this.Y;
        if (vvaVar != null) {
            RectF rectF = vvaVar.c;
            if (e66.e(8200) && e66.e(131072)) {
                RectF rectF2 = gl.P;
                rectF2.set(f, f2, this.z + f, this.A + f2);
                float f3 = this.A / 2.0f;
                rectF.set(rectF2);
                rectF.inset(-gl.L(4.0f), -gl.L(4.0f));
                vvaVar.g(rectF);
                boolean d = vvaVar.d();
                vvaVar.a(canvas, bm2.f(j(), bm2.o(this.I, 255), bm2.f(0.4f, this.L, bm2.o(this.I, 255))));
                if (this.P) {
                    Path path = this.c0;
                    path.rewind();
                    path.addRoundRect(rectF2, f3, f3, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    vvaVar.a(canvas, this.J);
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
                i19.h(rectF2, this.b0, path);
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
            Collections.sort(arrayList, i19.Z);
            if (this.S == null) {
                gc0 gc0Var = new gc0(this.V, false);
                this.S = gc0Var;
                gc0Var.v = (short) 250;
                s33 s33Var = la2.V;
                gc0Var.s = gl.L(20.0f);
                this.S.p = gl.L(100.0f);
                gc0 gc0Var2 = this.S;
                gc0Var2.o = this.A;
                gc0Var2.h(gl.L(22.0f));
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
        vl vlVar = this.C;
        if (vlVar == null || (imageReceiver = vlVar.k) == null) {
            imageReceiver = this.B;
        }
        if (imageReceiver != null) {
            oy8 y = imageReceiver.y();
            if (y != null) {
                y.C(true);
                return;
            }
            km m = imageReceiver.m();
            if (m != null) {
                m.start();
            }
        }
    }

    public final void q() {
        ImageReceiver imageReceiver;
        vl vlVar = this.C;
        if (vlVar == null || (imageReceiver = vlVar.k) == null) {
            imageReceiver = this.B;
        }
        if (imageReceiver != null) {
            oy8 y = imageReceiver.y();
            if (y != null) {
                y.stop();
                return;
            }
            km m = imageReceiver.m();
            if (m != null) {
                m.stop();
            }
        }
    }

    public void r(float f) {
        int i;
        this.M = bm2.f(f, this.h, bm2.f(j(), this.J, this.L));
        int f2 = bm2.f(f, this.f, bm2.f(j(), this.I, this.K));
        this.N = f2;
        int i2 = this.g;
        if (gl.B(f2) > 0.8f) {
            i = 0;
        } else {
            i = 1526726655;
        }
        this.O = bm2.f(f, i2, i);
    }

    public void n() {
    }
}
