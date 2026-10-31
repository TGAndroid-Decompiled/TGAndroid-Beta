package ag;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.f8;
import org.telegram.messenger.tz;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.e6;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.gm0;
import org.telegram.ui.Components.j7;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.kn;
import org.telegram.ui.Components.lj;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.qx0;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.uu;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.w7;
import org.telegram.ui.Components.wj;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xj;
import org.telegram.ui.Components.y90;
import org.telegram.ui.Components.yj;
import org.telegram.ui.Components.zj0;
import org.telegram.ui.w71;
import org.telegram.ui.w8;
public final class u extends s4.s0 {
    public final int f738a;
    public final Object f739b;

    public u(Object obj, int i10) {
        this.f738a = i10;
        this.f739b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        ck0 ck0Var;
        int i11;
        ck0 ck0Var2;
        ck0 ck0Var3;
        int top;
        int i12;
        ck0 ck0Var4;
        ck0 ck0Var5;
        int top2;
        boolean z10;
        ck0 ck0Var6;
        int i13 = this.f738a;
        kg.y1 y1Var = null;
        boolean z11 = false;
        Object obj = this.f739b;
        switch (i13) {
            case 2:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((m3) obj).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 3:
                ((ei.r) obj).f6674g++;
                return;
            case 4:
                kg.b1 b1Var = (kg.b1) obj;
                if (i10 == 1) {
                    b1Var.f11358k3 = true;
                }
                if (i10 == 0) {
                    for (int i14 = 0; i14 < recyclerView.getChildCount(); i14++) {
                        kg.y1 y1Var2 = (kg.y1) b1Var.getChildAt(i14);
                        if (y1Var == null || y1Var2.f11339a > y1Var.f11339a) {
                            y1Var = y1Var2;
                        }
                    }
                    if (y1Var != null) {
                        b1Var.z1(y1Var, true);
                        b1Var.f11358k3 = false;
                        b1Var.w0(0, y1Var.getTop() - ((b1Var.getMeasuredHeight() - y1Var.getMeasuredHeight()) / 2), org.telegram.messenger.i0.H);
                    }
                    b1Var.A1();
                    return;
                }
                org.telegram.messenger.i0.r(b1Var.f11359l3);
                return;
            case 6:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((mg.v1) obj).Q1.getEditText());
                    return;
                }
                return;
            case 7:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((mg.i2) obj).R1.getEditText());
                    return;
                }
                return;
            case 11:
                w7 w7Var = (w7) obj;
                j7 j7Var = w7Var.f32062o1;
                if (i10 == 0) {
                    int L = org.telegram.messenger.i0.L(13.0f);
                    int i15 = w7Var.f32067q2;
                    int i16 = w7Var.f21614s0;
                    if (((i15 - i16) - L) + i16 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && j7Var.canScrollVertically(1) && (ck0Var = (ck0) j7Var.K(w7Var.f32057l2 ? 1 : 0)) != null) {
                        View view = ck0Var.f47898a;
                        if (view.getTop() > org.telegram.messenger.i0.L(7.0f)) {
                            j7Var.w0(0, view.getTop() - org.telegram.messenger.i0.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    org.telegram.messenger.i0.v1(w7Var.getCurrentFocus());
                    return;
                } else {
                    return;
                }
            case 14:
                qi qiVar = (qi) obj;
                b1 b1Var2 = qiVar.f29659n;
                bi biVar = qiVar.f30947b;
                if (i10 == 0) {
                    int L2 = org.telegram.messenger.i0.L(13.0f);
                    org.telegram.ui.ActionBar.t0 t0Var = biVar.U2;
                    if (t0Var != null) {
                        i11 = org.telegram.messenger.i0.L(t0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i17 = L2 + i11;
                    int i18 = biVar.f21614s0;
                    if (((biVar.V3[0] - i18) - i17) + i18 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (ck0Var2 = (ck0) b1Var2.K(0)) != null) {
                        View view2 = ck0Var2.f47898a;
                        if (view2.getTop() > org.telegram.messenger.i0.L(7.0f)) {
                            b1Var2.w0(0, view2.getTop() - org.telegram.messenger.i0.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                xj xjVar = (xj) obj;
                bi biVar2 = xjVar.f30947b;
                lj ljVar = xjVar.f32487r;
                if (i10 == 0) {
                    int L3 = org.telegram.messenger.i0.L(13.0f);
                    int i19 = biVar2.f21614s0;
                    if (((biVar2.V3[0] - i19) - L3) + i19 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (ck0Var3 = (ck0) ljVar.K(0)) != null && (top = (ck0Var3.f47898a.getTop() - org.telegram.messenger.i0.f16020m) - org.telegram.messenger.i0.L(56.0f)) > 0) {
                        ljVar.w0(0, top, null);
                    }
                }
                if (i10 == 1 && xjVar.f32481b0 && ljVar.getAdapter() == xjVar.D) {
                    org.telegram.messenger.i0.v1(biVar2.getCurrentFocus());
                }
                if (i10 != 0) {
                    z11 = true;
                }
                xjVar.U = z11;
                return;
            case 17:
                yj yjVar = (yj) obj;
                tk0 tk0Var = yjVar.f32744r;
                bi biVar3 = yjVar.f30947b;
                if (i10 == 0) {
                    int L4 = org.telegram.messenger.i0.L(13.0f);
                    org.telegram.ui.ActionBar.t0 t0Var2 = biVar3.U2;
                    if (t0Var2 != null) {
                        i12 = org.telegram.messenger.i0.L(t0Var2.getAlpha() * 26.0f);
                    } else {
                        i12 = 0;
                    }
                    int i20 = L4 + i12;
                    int i21 = biVar3.f21614s0;
                    if (((biVar3.V3[0] - i21) - i20) + i21 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (ck0Var4 = (ck0) tk0Var.K(0)) != null) {
                        View view3 = ck0Var4.f47898a;
                        if (view3.getTop() > org.telegram.messenger.i0.L(7.0f)) {
                            tk0Var.w0(0, view3.getTop() - org.telegram.messenger.i0.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 18:
                jn jnVar = (jn) obj;
                w71 w71Var = jnVar.f27445s;
                if (i10 == 0) {
                    int L5 = org.telegram.messenger.i0.L(13.0f);
                    bi biVar4 = jnVar.f30947b;
                    int i22 = biVar4.f21614s0;
                    if (((biVar4.V3[0] - i22) - L5) + i22 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (ck0Var5 = (ck0) w71Var.K(1)) != null && (top2 = (ck0Var5.f47898a.getTop() - org.telegram.messenger.i0.f16020m) - org.telegram.messenger.i0.L(65.0f)) > 0) {
                        w71Var.w0(0, top2, null);
                    }
                    int i23 = jnVar.W0;
                    if (i23 >= 0) {
                        jn.N(jnVar, i23);
                        jnVar.W0 = -1;
                        return;
                    }
                    return;
                }
                return;
            case 24:
                x90 x90Var = (x90) obj;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                x90Var.f32447e3 = z10;
                if (i10 == 1) {
                    z11 = true;
                }
                x90Var.f32448f3 = z11;
                return;
            case 26:
                tf0 tf0Var = (tf0) obj;
                nf0 nf0Var = tf0Var.f30553i1;
                if (i10 == 0) {
                    int L6 = org.telegram.messenger.i0.L(13.0f);
                    int i24 = tf0Var.f30565v1;
                    int i25 = tf0Var.f21614s0;
                    if (((i24 - i25) - L6) + i25 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && nf0Var.canScrollVertically(1) && (ck0Var6 = (ck0) nf0Var.K(0)) != null) {
                        View view4 = ck0Var6.f47898a;
                        if (view4.getTop() > org.telegram.messenger.i0.L(7.0f)) {
                            nf0Var.w0(0, view4.getTop() - org.telegram.messenger.i0.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 28:
                tk0 tk0Var2 = (tk0) obj;
                if (i10 == 0) {
                    if (tk0Var2.f30637t2) {
                        tk0Var2.f30637t2 = false;
                        zs.e().k(99, 512);
                    }
                } else if (!tk0Var2.f30637t2 && tk0Var2.f30640v1) {
                    tk0Var2.f30637t2 = true;
                    zs.e().k(98, 512);
                }
                if (i10 != 0 && tk0Var2.L1 != null) {
                    lg.k kVar = tk0Var2.f30603c1;
                    if (kVar != null) {
                        org.telegram.messenger.i0.r(kVar);
                        tk0Var2.f30603c1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        tk0Var2.K1.I(obtain);
                    } catch (Exception e) {
                        f8.g(e, true);
                    }
                    tk0Var2.L1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view5 = tk0Var2.L1;
                    tk0Var2.j1(view5, 0.0f, 0.0f, false);
                    tk0Var2.L1 = null;
                    tk0Var2.m1(view5, null);
                    tk0Var2.N1 = false;
                }
                s4.s0 s0Var = tk0Var2.Y0;
                if (s0Var != null) {
                    s0Var.a(recyclerView, i10);
                }
                z11 = (i10 == 1 || i10 == 2) ? true : true;
                tk0Var2.I1 = z11;
                if (z11) {
                    tk0Var2.J1 = true;
                    return;
                }
                return;
            case 29:
                gm0 gm0Var = (gm0) obj;
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(gm0Var.F.getCurrentFocus());
                }
                gm0Var.a();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        zf.e0 e0Var;
        q30 q30Var;
        s4.c1 T;
        int N0;
        int i12;
        String str;
        TLRPC.User user;
        String str2;
        zj0 zj0Var;
        switch (this.f738a) {
            case 0:
                w.f0((w) this.f739b);
                return;
            case 1:
                h1 h1Var = (h1) this.f739b;
                h1Var.f30947b.L1(h1Var, i11);
                h1Var.P();
                return;
            case 2:
            case 6:
            case 7:
            default:
                return;
            case 3:
                ((ei.r) this.f739b).h(i10, i11);
                return;
            case 4:
                kg.b1 b1Var = (kg.b1) this.f739b;
                if (recyclerView.getScrollState() == 1) {
                    b1Var.z1(null, true);
                }
                b1Var.invalidate();
                return;
            case 5:
                ((lh.g) this.f739b).f1();
                return;
            case 8:
                s4.a0 a0Var = (s4.a0) recyclerView.getLayoutManager();
                oh.q qVar = (oh.q) this.f739b;
                oh.f fVar = qVar.C;
                if (qVar.f14311x && !qVar.f14310w && a0Var != null) {
                    if (qVar.f14295f.b() - a0Var.N0() < 10) {
                        org.telegram.messenger.i0.r(fVar);
                        org.telegram.messenger.i0.g3(fVar);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((mh.k) this.f739b).run();
                return;
            case 10:
                ((org.telegram.ui.Components.g0) this.f739b).w1();
                return;
            case 11:
                w7 w7Var = (w7) this.f739b;
                s4.a0 a0Var2 = w7Var.f32064p1;
                w7.I0(w7Var);
                w7Var.Z0();
                if (!w7Var.f32058m1) {
                    int L0 = a0Var2.L0();
                    int i13 = 0;
                    if (w7Var.f32057l2) {
                        L0 = Math.max(0, L0 - 1);
                    }
                    if (L0 != -1) {
                        i13 = Math.abs(a0Var2.N0() - L0) + 1;
                    }
                    int b10 = recyclerView.getAdapter().b();
                    MediaController.B();
                    if (tz.O0) {
                        if (L0 < 10) {
                            MediaController.B().P();
                            return;
                        }
                        return;
                    } else if (L0 + i13 > b10 - 10) {
                        MediaController.B().P();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 12:
                ((uu0) this.f739b).invalidate();
                return;
            case 13:
                mi miVar = (mi) this.f739b;
                miVar.f30947b.L1(miVar, i11);
                return;
            case 14:
                qi qiVar = (qi) this.f739b;
                if (qiVar.f29659n.getChildCount() > 0) {
                    qiVar.f30947b.L1(qiVar, i11);
                    return;
                }
                return;
            case 15:
                ej ejVar = (ej) this.f739b;
                ejVar.f30947b.L1(ejVar, i11);
                ejVar.R();
                return;
            case 16:
                xj xjVar = (xj) this.f739b;
                d1 d1Var = xjVar.E;
                xjVar.f30947b.L1(xjVar, i11);
                xjVar.X();
                s4.g0 adapter = xjVar.f32487r.getAdapter();
                wj wjVar = xjVar.D;
                if (adapter == wjVar) {
                    int L02 = d1Var.L0();
                    int N02 = d1Var.N0();
                    int abs = Math.abs(N02 - L02) + 1;
                    int b11 = recyclerView.getAdapter().b();
                    if (abs > 0 && N02 >= b11 - 10) {
                        wj wjVar2 = wjVar.X.D;
                        if (!wjVar2.S && !wjVar2.V && (e0Var = wjVar.D) != null) {
                            wjVar.Z(wjVar.f32208y, wjVar.E, wjVar.F, e0Var, wjVar.J, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 17:
                yj yjVar = (yj) this.f739b;
                yjVar.f30947b.L1(yjVar, i11);
                yjVar.f32746w.setTranslationY(Math.max(0, yjVar.getCurrentItemTop()));
                return;
            case 18:
                jn jnVar = (jn) this.f739b;
                d1 d1Var2 = jnVar.f27452x;
                jnVar.f30947b.L1(jnVar, i11);
                an anVar = jnVar.f27454y;
                if (anVar != null && anVar.f30380s) {
                    qx0 delegate = anVar.getDelegate();
                    if (delegate instanceof e6) {
                        w71 w71Var = jnVar.f27445s;
                        View F = w71Var.F((e6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = w71Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f47898a;
                            int b12 = T.b();
                            if (anVar.getDirection() == 0) {
                                anVar.setTranslationY((view.getY() - org.telegram.messenger.i0.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                anVar.setTranslationY(view.getY());
                            }
                            if (b12 < d1Var2.L0() || b12 > d1Var2.N0()) {
                                anVar.f();
                            }
                        } else {
                            anVar.f();
                        }
                    } else {
                        anVar.f();
                    }
                }
                if (i11 != 0 && (q30Var = jnVar.D) != null) {
                    q30Var.b(true);
                    return;
                }
                return;
            case 19:
                kn knVar = (kn) this.f739b;
                knVar.f30947b.L1(knVar, i11);
                return;
            case 20:
                dp dpVar = (dp) this.f739b;
                if (dpVar.f25493t1.M0() + 10 >= dpVar.f25487n1.b()) {
                    dpVar.Q0();
                    return;
                }
                return;
            case 21:
                cv cvVar = (cv) this.f739b;
                uu uuVar = cvVar.f25164m1;
                if (uuVar != null && cvVar.f25165n1.I1 && uuVar.f31046x) {
                    uuVar.f31046x = false;
                    uuVar.invalidate();
                    return;
                }
                return;
            case 22:
                org.telegram.ui.Components.tz tzVar = (org.telegram.ui.Components.tz) this.f739b;
                tzVar.F.invalidate();
                tzVar.invalidate();
                return;
            case 23:
                uz.I0((uz) this.f739b);
                return;
            case 24:
                x90 x90Var = (x90) this.f739b;
                s4.n0 layoutManager = x90Var.getLayoutManager();
                y90 y90Var = x90Var.f32451i3;
                r90 r90Var = y90Var.d;
                if (layoutManager == r90Var) {
                    N0 = r90Var.N0();
                } else {
                    N0 = y90Var.f32666c.N0();
                }
                if (N0 == -1) {
                    i12 = 0;
                } else {
                    i12 = N0;
                }
                if (i12 > 0) {
                    zf.x0 x0Var = y90Var.f32667f;
                    if (N0 > x0Var.M0 - 5 && x0Var.f55669u0 == 0 && (str = x0Var.f55667s0) != null && str.length() != 0 && (user = x0Var.f55672w0) != null && (str2 = x0Var.f55665r0) != null) {
                        x0Var.T(true, user, str2, x0Var.f55667s0);
                    }
                }
                x90Var.canScrollVertically(1);
                y90Var.n(!x90Var.canScrollVertically(-1));
                y90Var.b();
                return;
            case 25:
                ua0 ua0Var = (ua0) this.f739b;
                w8 w8Var = ua0Var.f30878b;
                b1 b1Var2 = ua0Var.f30882f;
                for (int i14 = 0; i14 < b1Var2.getChildCount(); i14++) {
                    View childAt = b1Var2.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        ((org.telegram.ui.Cells.q1) childAt).u3(w8Var.getMeasuredWidth(), w8Var.getBackgroundSizeY());
                    }
                }
                oa0 oa0Var = ua0Var.e;
                if (oa0Var != null) {
                    oa0Var.w();
                    return;
                }
                return;
            case 26:
                tf0 tf0Var = (tf0) this.f739b;
                if (tf0Var.f30553i1.getChildCount() > 0) {
                    tf0.I0(tf0Var);
                    return;
                }
                return;
            case 27:
                mj0 mj0Var = (mj0) this.f739b;
                b1 b1Var3 = mj0Var.f28500b;
                int[] iArr = mj0Var.f28511f0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i15 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i15, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    mj0.b(mj0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i15) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    mj0.b(mj0Var, childAt3, min2);
                }
                for (int i16 = 1; i16 < b1Var3.getChildCount() - 1; i16++) {
                    mj0.b(mj0Var, b1Var3.getChildAt(i16), 1.0f);
                }
                mj0Var.invalidate();
                return;
            case 28:
                tk0 tk0Var = (tk0) this.f739b;
                Rect rect = tk0Var.E1;
                s4.s0 s0Var = tk0Var.Y0;
                if (s0Var != null) {
                    s0Var.b(recyclerView, i10, i11);
                }
                if (tk0Var.C1 != -1) {
                    rect.offset(-i10, -i11);
                    org.telegram.ui.Cells.y yVar = tk0Var.B1;
                    if (yVar != null) {
                        yVar.setBounds(rect);
                    }
                    tk0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                tk0Var.L0(false);
                if (i11 != 0 && (zj0Var = tk0Var.f30605d1) != null) {
                    zj0Var.b();
                }
                dk0 dk0Var = tk0Var.S1;
                if (dk0Var != null) {
                    tk0Var.e1(dk0Var, 700, false);
                    return;
                }
                return;
        }
    }
}
