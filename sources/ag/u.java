package ag;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.at;
import org.telegram.messenger.f8;
import org.telegram.messenger.uz;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.e6;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.j7;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.kn;
import org.telegram.ui.Components.lj;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.uu;
import org.telegram.ui.Components.vu0;
import org.telegram.ui.Components.w7;
import org.telegram.ui.Components.wj;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xj;
import org.telegram.ui.Components.y90;
import org.telegram.ui.Components.yj;
import org.telegram.ui.u71;
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
        dk0 dk0Var;
        int i11;
        dk0 dk0Var2;
        dk0 dk0Var3;
        int top;
        int i12;
        dk0 dk0Var4;
        dk0 dk0Var5;
        int top2;
        boolean z10;
        dk0 dk0Var6;
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
                ((ei.r) obj).f6675g++;
                return;
            case 4:
                kg.b1 b1Var = (kg.b1) obj;
                if (i10 == 1) {
                    b1Var.f11359k3 = true;
                }
                if (i10 == 0) {
                    for (int i14 = 0; i14 < recyclerView.getChildCount(); i14++) {
                        kg.y1 y1Var2 = (kg.y1) b1Var.getChildAt(i14);
                        if (y1Var == null || y1Var2.f11340a > y1Var.f11340a) {
                            y1Var = y1Var2;
                        }
                    }
                    if (y1Var != null) {
                        b1Var.z1(y1Var, true);
                        b1Var.f11359k3 = false;
                        b1Var.w0(0, y1Var.getTop() - ((b1Var.getMeasuredHeight() - y1Var.getMeasuredHeight()) / 2), org.telegram.messenger.i0.H);
                    }
                    b1Var.A1();
                    return;
                }
                org.telegram.messenger.i0.r(b1Var.f11360l3);
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
                j7 j7Var = w7Var.f32110o1;
                if (i10 == 0) {
                    int L = org.telegram.messenger.i0.L(13.0f);
                    int i15 = w7Var.f32115q2;
                    int i16 = w7Var.f21615s0;
                    if (((i15 - i16) - L) + i16 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && j7Var.canScrollVertically(1) && (dk0Var = (dk0) j7Var.K(w7Var.f32105l2 ? 1 : 0)) != null) {
                        View view = dk0Var.f47909a;
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
                b1 b1Var2 = qiVar.f29733n;
                bi biVar = qiVar.f30964b;
                if (i10 == 0) {
                    int L2 = org.telegram.messenger.i0.L(13.0f);
                    org.telegram.ui.ActionBar.t0 t0Var = biVar.U2;
                    if (t0Var != null) {
                        i11 = org.telegram.messenger.i0.L(t0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i17 = L2 + i11;
                    int i18 = biVar.f21615s0;
                    if (((biVar.V3[0] - i18) - i17) + i18 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (dk0Var2 = (dk0) b1Var2.K(0)) != null) {
                        View view2 = dk0Var2.f47909a;
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
                bi biVar2 = xjVar.f30964b;
                lj ljVar = xjVar.f32587r;
                if (i10 == 0) {
                    int L3 = org.telegram.messenger.i0.L(13.0f);
                    int i19 = biVar2.f21615s0;
                    if (((biVar2.V3[0] - i19) - L3) + i19 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (dk0Var3 = (dk0) ljVar.K(0)) != null && (top = (dk0Var3.f47909a.getTop() - org.telegram.messenger.i0.f16166m) - org.telegram.messenger.i0.L(56.0f)) > 0) {
                        ljVar.w0(0, top, null);
                    }
                }
                if (i10 == 1 && xjVar.f32581b0 && ljVar.getAdapter() == xjVar.D) {
                    org.telegram.messenger.i0.v1(biVar2.getCurrentFocus());
                }
                if (i10 != 0) {
                    z11 = true;
                }
                xjVar.U = z11;
                return;
            case 17:
                yj yjVar = (yj) obj;
                uk0 uk0Var = yjVar.f32856r;
                bi biVar3 = yjVar.f30964b;
                if (i10 == 0) {
                    int L4 = org.telegram.messenger.i0.L(13.0f);
                    org.telegram.ui.ActionBar.t0 t0Var2 = biVar3.U2;
                    if (t0Var2 != null) {
                        i12 = org.telegram.messenger.i0.L(t0Var2.getAlpha() * 26.0f);
                    } else {
                        i12 = 0;
                    }
                    int i20 = L4 + i12;
                    int i21 = biVar3.f21615s0;
                    if (((biVar3.V3[0] - i21) - i20) + i21 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (dk0Var4 = (dk0) uk0Var.K(0)) != null) {
                        View view3 = dk0Var4.f47909a;
                        if (view3.getTop() > org.telegram.messenger.i0.L(7.0f)) {
                            uk0Var.w0(0, view3.getTop() - org.telegram.messenger.i0.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 18:
                jn jnVar = (jn) obj;
                u71 u71Var = jnVar.f27511s;
                if (i10 == 0) {
                    int L5 = org.telegram.messenger.i0.L(13.0f);
                    bi biVar4 = jnVar.f30964b;
                    int i22 = biVar4.f21615s0;
                    if (((biVar4.V3[0] - i22) - L5) + i22 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (dk0Var5 = (dk0) u71Var.K(1)) != null && (top2 = (dk0Var5.f47909a.getTop() - org.telegram.messenger.i0.f16166m) - org.telegram.messenger.i0.L(65.0f)) > 0) {
                        u71Var.w0(0, top2, null);
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
                x90Var.f32526e3 = z10;
                if (i10 == 1) {
                    z11 = true;
                }
                x90Var.f32527f3 = z11;
                return;
            case 26:
                tf0 tf0Var = (tf0) obj;
                nf0 nf0Var = tf0Var.f30635i1;
                if (i10 == 0) {
                    int L6 = org.telegram.messenger.i0.L(13.0f);
                    int i24 = tf0Var.f30647v1;
                    int i25 = tf0Var.f21615s0;
                    if (((i24 - i25) - L6) + i25 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && nf0Var.canScrollVertically(1) && (dk0Var6 = (dk0) nf0Var.K(0)) != null) {
                        View view4 = dk0Var6.f47909a;
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
                uk0 uk0Var2 = (uk0) obj;
                if (i10 == 0) {
                    if (uk0Var2.f31020t2) {
                        uk0Var2.f31020t2 = false;
                        at.e().k(99, 512);
                    }
                } else if (!uk0Var2.f31020t2 && uk0Var2.f31023v1) {
                    uk0Var2.f31020t2 = true;
                    at.e().k(98, 512);
                }
                if (i10 != 0 && uk0Var2.L1 != null) {
                    lg.k kVar = uk0Var2.f30986c1;
                    if (kVar != null) {
                        org.telegram.messenger.i0.r(kVar);
                        uk0Var2.f30986c1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        uk0Var2.K1.I(obtain);
                    } catch (Exception e) {
                        f8.g(e, true);
                    }
                    uk0Var2.L1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view5 = uk0Var2.L1;
                    uk0Var2.j1(view5, 0.0f, 0.0f, false);
                    uk0Var2.L1 = null;
                    uk0Var2.m1(view5, null);
                    uk0Var2.N1 = false;
                }
                s4.s0 s0Var = uk0Var2.Y0;
                if (s0Var != null) {
                    s0Var.a(recyclerView, i10);
                }
                z11 = (i10 == 1 || i10 == 2) ? true : true;
                uk0Var2.I1 = z11;
                if (z11) {
                    uk0Var2.J1 = true;
                    return;
                }
                return;
            case 29:
                hm0 hm0Var = (hm0) obj;
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(hm0Var.F.getCurrentFocus());
                }
                hm0Var.a();
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
        ak0 ak0Var;
        switch (this.f738a) {
            case 0:
                w.g0((w) this.f739b);
                return;
            case 1:
                h1 h1Var = (h1) this.f739b;
                h1Var.f30964b.L1(h1Var, i11);
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
                if (qVar.f14312x && !qVar.f14311w && a0Var != null) {
                    if (qVar.f14296f.b() - a0Var.N0() < 10) {
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
                s4.a0 a0Var2 = w7Var.f32112p1;
                w7.I0(w7Var);
                w7Var.Z0();
                if (!w7Var.f32106m1) {
                    int L0 = a0Var2.L0();
                    int i13 = 0;
                    if (w7Var.f32105l2) {
                        L0 = Math.max(0, L0 - 1);
                    }
                    if (L0 != -1) {
                        i13 = Math.abs(a0Var2.N0() - L0) + 1;
                    }
                    int b10 = recyclerView.getAdapter().b();
                    MediaController.B();
                    if (uz.O0) {
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
                ((vu0) this.f739b).invalidate();
                return;
            case 13:
                mi miVar = (mi) this.f739b;
                miVar.f30964b.L1(miVar, i11);
                return;
            case 14:
                qi qiVar = (qi) this.f739b;
                if (qiVar.f29733n.getChildCount() > 0) {
                    qiVar.f30964b.L1(qiVar, i11);
                    return;
                }
                return;
            case 15:
                ej ejVar = (ej) this.f739b;
                ejVar.f30964b.L1(ejVar, i11);
                ejVar.R();
                return;
            case 16:
                xj xjVar = (xj) this.f739b;
                d1 d1Var = xjVar.E;
                xjVar.f30964b.L1(xjVar, i11);
                xjVar.X();
                s4.g0 adapter = xjVar.f32587r.getAdapter();
                wj wjVar = xjVar.D;
                if (adapter == wjVar) {
                    int L02 = d1Var.L0();
                    int N02 = d1Var.N0();
                    int abs = Math.abs(N02 - L02) + 1;
                    int b11 = recyclerView.getAdapter().b();
                    if (abs > 0 && N02 >= b11 - 10) {
                        wj wjVar2 = wjVar.X.D;
                        if (!wjVar2.S && !wjVar2.V && (e0Var = wjVar.D) != null) {
                            wjVar.Z(wjVar.f32265y, wjVar.E, wjVar.F, e0Var, wjVar.J, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 17:
                yj yjVar = (yj) this.f739b;
                yjVar.f30964b.L1(yjVar, i11);
                yjVar.f32858w.setTranslationY(Math.max(0, yjVar.getCurrentItemTop()));
                return;
            case 18:
                jn jnVar = (jn) this.f739b;
                d1 d1Var2 = jnVar.f27518x;
                jnVar.f30964b.L1(jnVar, i11);
                an anVar = jnVar.f27520y;
                if (anVar != null && anVar.f30740s) {
                    rx0 delegate = anVar.getDelegate();
                    if (delegate instanceof e6) {
                        u71 u71Var = jnVar.f27511s;
                        View F = u71Var.F((e6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = u71Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f47909a;
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
                knVar.f30964b.L1(knVar, i11);
                return;
            case 20:
                dp dpVar = (dp) this.f739b;
                if (dpVar.f25549t1.M0() + 10 >= dpVar.f25543n1.b()) {
                    dpVar.Q0();
                    return;
                }
                return;
            case 21:
                cv cvVar = (cv) this.f739b;
                uu uuVar = cvVar.f25245m1;
                if (uuVar != null && cvVar.f25246n1.I1 && uuVar.f31094x) {
                    uuVar.f31094x = false;
                    uuVar.invalidate();
                    return;
                }
                return;
            case 22:
                tz tzVar = (tz) this.f739b;
                tzVar.F.invalidate();
                tzVar.invalidate();
                return;
            case 23:
                org.telegram.ui.Components.uz.I0((org.telegram.ui.Components.uz) this.f739b);
                return;
            case 24:
                x90 x90Var = (x90) this.f739b;
                s4.n0 layoutManager = x90Var.getLayoutManager();
                y90 y90Var = x90Var.f32530i3;
                r90 r90Var = y90Var.d;
                if (layoutManager == r90Var) {
                    N0 = r90Var.N0();
                } else {
                    N0 = y90Var.f32782c.N0();
                }
                if (N0 == -1) {
                    i12 = 0;
                } else {
                    i12 = N0;
                }
                if (i12 > 0) {
                    zf.x0 x0Var = y90Var.f32783f;
                    if (N0 > x0Var.M0 - 5 && x0Var.f55687u0 == 0 && (str = x0Var.f55685s0) != null && str.length() != 0 && (user = x0Var.f55690w0) != null && (str2 = x0Var.f55683r0) != null) {
                        x0Var.T(true, user, str2, x0Var.f55685s0);
                    }
                }
                x90Var.canScrollVertically(1);
                y90Var.n(!x90Var.canScrollVertically(-1));
                y90Var.b();
                return;
            case 25:
                ua0 ua0Var = (ua0) this.f739b;
                w8 w8Var = ua0Var.f30912b;
                b1 b1Var2 = ua0Var.f30916f;
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
                if (tf0Var.f30635i1.getChildCount() > 0) {
                    tf0.I0(tf0Var);
                    return;
                }
                return;
            case 27:
                nj0 nj0Var = (nj0) this.f739b;
                b1 b1Var3 = nj0Var.f28861b;
                int[] iArr = nj0Var.f28872f0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i15 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i15, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    nj0.b(nj0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i15) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    nj0.b(nj0Var, childAt3, min2);
                }
                for (int i16 = 1; i16 < b1Var3.getChildCount() - 1; i16++) {
                    nj0.b(nj0Var, b1Var3.getChildAt(i16), 1.0f);
                }
                nj0Var.invalidate();
                return;
            case 28:
                uk0 uk0Var = (uk0) this.f739b;
                Rect rect = uk0Var.E1;
                s4.s0 s0Var = uk0Var.Y0;
                if (s0Var != null) {
                    s0Var.b(recyclerView, i10, i11);
                }
                if (uk0Var.C1 != -1) {
                    rect.offset(-i10, -i11);
                    org.telegram.ui.Cells.y yVar = uk0Var.B1;
                    if (yVar != null) {
                        yVar.setBounds(rect);
                    }
                    uk0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                uk0Var.L0(false);
                if (i11 != 0 && (ak0Var = uk0Var.f30988d1) != null) {
                    ak0Var.c();
                }
                ek0 ek0Var = uk0Var.S1;
                if (ek0Var != null) {
                    uk0Var.e1(ek0Var, 700, false);
                    return;
                }
                return;
        }
    }
}
