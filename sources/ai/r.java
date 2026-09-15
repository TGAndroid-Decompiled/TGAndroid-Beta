package ai;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dk;
import org.telegram.ui.Components.ga0;
import org.telegram.ui.Components.gj;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.i40;
import org.telegram.ui.Components.iv;
import org.telegram.ui.Components.jj;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.lf;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.ma0;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.na0;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.pk;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.sv;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.yj;
import org.telegram.ui.dc1;
import org.telegram.ui.lx;
public final class r extends s4.s0 {
    public final int f1442a;
    public final Object f1443b;

    public r(Object obj, int i10) {
        this.f1442a = i10;
        this.f1443b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        vk0 vk0Var;
        int i11;
        vk0 vk0Var2;
        vk0 vk0Var3;
        int top;
        int i12;
        vk0 vk0Var4;
        vk0 vk0Var5;
        int top2;
        boolean z10;
        switch (this.f1442a) {
            case 1:
                j7 j7Var = (j7) this.f1443b;
                if (i10 == 0) {
                    j7Var.V = true;
                    j7Var.invalidate();
                }
                if (i10 == 1) {
                    j7Var.V = false;
                    a5.a aVar = j7Var.d;
                    ValueAnimator valueAnimator = (ValueAnimator) aVar.f276c;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) aVar.f276c).cancel();
                        aVar.f276c = null;
                    }
                    AndroidUtilities.hideKeyboard(j7Var);
                    return;
                }
                return;
            case 3:
                ci.e2 e2Var = (ci.e2) this.f1443b;
                if (i10 == 0 && e2Var.f4586n >= 0.0f && !e2Var.f4583b.canScrollVertically(-1)) {
                    e2Var.f4586n = -1.0f;
                    return;
                }
                return;
            case 7:
                fi.h0 h0Var = (fi.h0) this.f1443b;
                if (i10 == 0) {
                    h0Var.e = !h0Var.d.canScrollVertically(-1);
                    h0Var.d.canScrollVertically(1);
                    return;
                }
                return;
            case 11:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((hg.e2) this.f1443b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 12:
                ((ki.h) this.f1443b).e++;
                return;
            case 15:
                org.telegram.ui.Components.h8 h8Var = (org.telegram.ui.Components.h8) this.f1443b;
                org.telegram.ui.Components.s7 s7Var = h8Var.f24566n;
                if (i10 == 0) {
                    if (org.telegram.ui.Components.h8.j0(h8Var) + ((h8Var.A0 - org.telegram.ui.Components.h8.i0(h8Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && s7Var.canScrollVertically(1) && (vk0Var = (vk0) s7Var.K(h8Var.f24577v0 ? 1 : 0)) != null) {
                        View view = vk0Var.f42675a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            s7Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(h8Var.getCurrentFocus());
                    return;
                } else {
                    return;
                }
            case 18:
                jj jjVar = (jj) this.f1443b;
                w0 w0Var = jjVar.f25354n;
                vi viVar = jjVar.f26462b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.v0 v0Var = viVar.f28734a1;
                    if (v0Var != null) {
                        i11 = AndroidUtilities.dp(v0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i13 = dp + i11;
                    int backgroundPaddingTop = viVar.getBackgroundPaddingTop();
                    if (((viVar.f28738b2[0] - backgroundPaddingTop) - i13) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (vk0Var2 = (vk0) w0Var.K(0)) != null) {
                        View view2 = vk0Var2.f42675a;
                        if (view2.getTop() > AndroidUtilities.dp(7.0f)) {
                            w0Var.v0(0, view2.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 20:
                ok okVar = (ok) this.f1443b;
                dk dkVar = okVar.f26824r;
                vi viVar2 = okVar.f26462b;
                boolean z11 = false;
                if (i10 == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop2 = viVar2.getBackgroundPaddingTop();
                    if (((viVar2.f28738b2[0] - backgroundPaddingTop2) - dp2) + backgroundPaddingTop2 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (vk0Var3 = (vk0) dkVar.K(0)) != null && (top = (vk0Var3.f42675a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(56.0f)) > 0) {
                        dkVar.v0(0, top, null);
                    }
                }
                if (i10 == 1 && okVar.f26818b0 && dkVar.getAdapter() == okVar.f26828y) {
                    AndroidUtilities.hideKeyboard(viVar2.getCurrentFocus());
                }
                if (i10 != 0) {
                    z11 = true;
                }
                okVar.U = z11;
                return;
            case 21:
                pk pkVar = (pk) this.f1443b;
                ll0 ll0Var = pkVar.f27070r;
                vi viVar3 = pkVar.f26462b;
                if (i10 == 0) {
                    int dp3 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.v0 v0Var2 = viVar3.f28734a1;
                    if (v0Var2 != null) {
                        i12 = AndroidUtilities.dp(v0Var2.getAlpha() * 26.0f);
                    } else {
                        i12 = 0;
                    }
                    int i14 = dp3 + i12;
                    int backgroundPaddingTop3 = viVar3.getBackgroundPaddingTop();
                    if (((viVar3.f28738b2[0] - backgroundPaddingTop3) - i14) + backgroundPaddingTop3 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (vk0Var4 = (vk0) ll0Var.K(0)) != null) {
                        View view3 = vk0Var4.f42675a;
                        if (view3.getTop() > AndroidUtilities.dp(7.0f)) {
                            ll0Var.v0(0, view3.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 22:
                if (i10 == 1) {
                    gl glVar = (gl) this.f1443b;
                    if (glVar.f24399l0 && glVar.m0) {
                        AndroidUtilities.hideKeyboard(glVar.f26462b.getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 23:
                un unVar = (un) this.f1443b;
                dc1 dc1Var = unVar.f28463s;
                vi viVar4 = unVar.f26462b;
                if (i10 == 0) {
                    int dp4 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop4 = viVar4.getBackgroundPaddingTop();
                    if (((viVar4.f28738b2[0] - backgroundPaddingTop4) - dp4) + backgroundPaddingTop4 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (vk0Var5 = (vk0) dc1Var.K(1)) != null && (top2 = (vk0Var5.f42675a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        dc1Var.v0(0, top2, null);
                    }
                    int i15 = unVar.W0;
                    if (i15 >= 0) {
                        un.K(unVar, i15);
                        unVar.W0 = -1;
                        return;
                    }
                    return;
                }
                return;
            case 29:
                ma0 ma0Var = (ma0) this.f1443b;
                boolean z12 = false;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ma0Var.X2 = z10;
                if (i10 == 1) {
                    z12 = true;
                }
                ma0Var.Y2 = z12;
                return;
            default:
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        boolean z10;
        ci.l2 l2Var;
        ViewGroup viewGroup2;
        int i12;
        boolean z11;
        ci.l2 l2Var2;
        float f7;
        ViewGroup viewGroup3;
        gg.q0 q0Var;
        i40 i40Var;
        s4.c1 T;
        int N0;
        int i13;
        String str;
        TLRPC.User user;
        String str2;
        switch (this.f1442a) {
            case 0:
                lx lxVar = (lx) this.f1443b;
                lxVar.invalidate();
                lxVar.c();
                ci.f4 f4Var = lxVar.J;
                if (f4Var != null) {
                    f4Var.e(true);
                    return;
                }
                return;
            case 1:
                j7 j7Var = (j7) this.f1443b;
                j7Var.c();
                j7Var.invalidate();
                return;
            case 2:
                ci.z1 z1Var = (ci.z1) this.f1443b;
                ci.w1 w1Var = z1Var.f5852c;
                ci.t2 t2Var = z1Var.f5855r;
                viewGroup = ((org.telegram.ui.ActionBar.f3) t2Var).containerView;
                viewGroup.invalidate();
                z10 = ((org.telegram.ui.ActionBar.f3) t2Var).keyboardVisible;
                if (z10 && z1Var.f5851b.K1 && (l2Var = z1Var.d) != null && l2Var.d != null) {
                    t2Var.o0();
                }
                if (z1Var.e.M0() + 7 >= w1Var.h() - 1) {
                    w1Var.G();
                    return;
                }
                return;
            case 3:
                ci.e2 e2Var = (ci.e2) this.f1443b;
                ci.d2 d2Var = e2Var.f4584c;
                ci.p1 p1Var = e2Var.f4583b;
                ci.t2 t2Var2 = e2Var.f4588s;
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) t2Var2).containerView;
                viewGroup2.invalidate();
                int i14 = -1;
                if (e2Var.f4586n < 0.0f) {
                    i12 = e2Var.d.I0();
                } else {
                    int i15 = 0;
                    while (true) {
                        if (i15 < p1Var.getChildCount()) {
                            View childAt = p1Var.getChildAt(i15);
                            if (childAt.getY() + childAt.getHeight() > e2Var.f4586n + p1Var.getPaddingTop()) {
                                p1Var.getClass();
                                i12 = RecyclerView.R(childAt);
                            } else {
                                i15++;
                            }
                        } else {
                            i12 = -1;
                        }
                    }
                    if (i12 == -1) {
                        return;
                    }
                }
                int size = d2Var.f4490y.size() - 1;
                while (true) {
                    if (size >= 0) {
                        int keyAt = d2Var.f4490y.keyAt(size);
                        int valueAt = d2Var.f4490y.valueAt(size);
                        if (i12 >= keyAt) {
                            i14 = valueAt;
                        } else {
                            size--;
                        }
                    }
                }
                if (i14 >= 0) {
                    e2Var.e.j(i14, true);
                }
                z11 = ((org.telegram.ui.ActionBar.f3) t2Var2).keyboardVisible;
                if (z11 && p1Var.K1 && (l2Var2 = e2Var.f4585f) != null && l2Var2.d != null) {
                    t2Var2.o0();
                    return;
                }
                return;
            case 4:
                lf lfVar = (lf) this.f1443b;
                View m10 = lfVar.f8735c.getLayoutManager().m(0);
                float f10 = 0.0f;
                if (m10 != null) {
                    f7 = m10.getY();
                } else {
                    f7 = 0.0f;
                }
                if (f7 >= 0.0f) {
                    f10 = f7;
                }
                lfVar.h = f10;
                lfVar.b();
                return;
            case 5:
                ei.e4 e4Var = (ei.e4) this.f1443b;
                long j3 = e4Var.P;
                int i16 = 0;
                while (true) {
                    if (i16 < e4Var.f36998c.getChildCount()) {
                        if (!(e4Var.f36998c.getChildAt(i16) instanceof t00)) {
                            i16++;
                        }
                    } else if (recyclerView.canScrollVertically(1)) {
                        return;
                    }
                }
                yh.o.g(ei.e4.C0(e4Var)).d(j3).a();
                yh.o.g(ei.e4.D0(e4Var)).e(j3).a();
                return;
            case 6:
                fi.s sVar = (fi.s) this.f1443b;
                sVar.v.b(sVar.d);
                return;
            case 7:
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) ((fi.h0) this.f1443b).f9108f).containerView;
                viewGroup3.invalidate();
                return;
            case 8:
                fi.j0 j0Var = (fi.j0) this.f1443b;
                j0Var.h.M.b(j0Var.d);
                return;
            case 9:
                hg.m.b0((hg.m) this.f1443b);
                return;
            case 10:
                hg.i0 i0Var = (hg.i0) this.f1443b;
                i0Var.f26462b.X1(i0Var, i11);
                i0Var.M();
                return;
            case 11:
            case 22:
            default:
                return;
            case 12:
                ((ki.h) this.f1443b).e++;
                return;
            case 13:
                ((m4.g0) this.f1443b).run();
                return;
            case 14:
                ((org.telegram.ui.Components.e0) this.f1443b).r0();
                return;
            case 15:
                org.telegram.ui.Components.h8 h8Var = (org.telegram.ui.Components.h8) this.f1443b;
                s4.c0 c0Var = h8Var.f24571r;
                org.telegram.ui.Components.h8.P(h8Var);
                h8Var.E0();
                if (!h8Var.f24558f) {
                    int L0 = c0Var.L0();
                    int i17 = 0;
                    if (h8Var.f24577v0) {
                        L0 = Math.max(0, L0 - 1);
                    }
                    if (L0 != -1) {
                        i17 = Math.abs(c0Var.N0() - L0) + 1;
                    }
                    int h = recyclerView.getAdapter().h();
                    MediaController.getInstance().getPlayingMessageObject();
                    if (SharedConfig.playOrderReversed) {
                        if (L0 < 10) {
                            MediaController.getInstance().loadMoreMusic();
                            return;
                        }
                        return;
                    } else if (L0 + i17 > h - 10) {
                        MediaController.getInstance().loadMoreMusic();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 16:
                ((pv0) this.f1443b).invalidate();
                return;
            case 17:
                gj gjVar = (gj) this.f1443b;
                gjVar.f26462b.X1(gjVar, i11);
                return;
            case 18:
                jj jjVar = (jj) this.f1443b;
                if (jjVar.f25354n.getChildCount() > 0) {
                    jjVar.f26462b.X1(jjVar, i11);
                    return;
                }
                return;
            case 19:
                yj yjVar = (yj) this.f1443b;
                yjVar.f26462b.X1(yjVar, i11);
                yjVar.O();
                return;
            case 20:
                ok okVar = (ok) this.f1443b;
                hg.e0 e0Var = okVar.E;
                okVar.f26462b.X1(okVar, i11);
                okVar.U();
                s4.h0 adapter = okVar.f26824r.getAdapter();
                nk nkVar = okVar.f26828y;
                if (adapter == nkVar) {
                    int L02 = e0Var.L0();
                    int N02 = e0Var.N0();
                    int abs = Math.abs(N02 - L02) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs > 0 && N02 >= h10 - 10) {
                        nk nkVar2 = nkVar.X.f26828y;
                        if (!nkVar2.S && !nkVar2.V && (q0Var = nkVar.f26484y) != null) {
                            nkVar.Z(nkVar.f26483x, nkVar.E, nkVar.F, q0Var, nkVar.J, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 21:
                pk pkVar = (pk) this.f1443b;
                pkVar.f26462b.X1(pkVar, i11);
                pkVar.v.setTranslationY(Math.max(0, pkVar.getCurrentItemTop()));
                return;
            case 23:
                un unVar = (un) this.f1443b;
                hg.e0 e0Var2 = unVar.f28468w;
                unVar.f26462b.X1(unVar, i11);
                jn jnVar = unVar.f28470x;
                if (jnVar != null && jnVar.f26624s) {
                    ly0 delegate = jnVar.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.c6) {
                        dc1 dc1Var = unVar.f28463s;
                        View F = dc1Var.F((org.telegram.ui.Cells.c6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = dc1Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f42675a;
                            int b10 = T.b();
                            if (jnVar.getDirection() == 0) {
                                jnVar.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                jnVar.setTranslationY(view.getY());
                            }
                            if (b10 < e0Var2.L0() || b10 > e0Var2.N0()) {
                                jnVar.f();
                            }
                        } else {
                            jnVar.f();
                        }
                    } else {
                        jnVar.f();
                    }
                }
                if (i11 != 0 && (i40Var = unVar.f28472y) != null) {
                    i40Var.b(true);
                    return;
                }
                return;
            case 24:
                vn vnVar = (vn) this.f1443b;
                vnVar.f26462b.X1(vnVar, i11);
                return;
            case 25:
                mp mpVar = (mp) this.f1443b;
                if (mpVar.f26208x.M0() + 10 >= mpVar.h.h()) {
                    mpVar.w();
                    return;
                }
                return;
            case 26:
                sv svVar = (sv) this.f1443b;
                iv ivVar = svVar.f27976f;
                if (ivVar != null && svVar.h.K1 && ivVar.f25151w) {
                    ivVar.f25151w = false;
                    ivVar.invalidate();
                    return;
                }
                return;
            case 27:
                k00 k00Var = (k00) this.f1443b;
                k00Var.F.invalidate();
                k00Var.invalidate();
                return;
            case 28:
                n00.G((n00) this.f1443b);
                return;
            case 29:
                ma0 ma0Var = (ma0) this.f1443b;
                s4.o0 layoutManager = ma0Var.getLayoutManager();
                na0 na0Var = ma0Var.f26136b3;
                ga0 ga0Var = na0Var.d;
                if (layoutManager == ga0Var) {
                    N0 = ga0Var.N0();
                } else {
                    N0 = na0Var.f26424c.N0();
                }
                if (N0 == -1) {
                    i13 = 0;
                } else {
                    i13 = N0;
                }
                if (i13 > 0) {
                    gg.k1 k1Var = na0Var.f26425f;
                    if (N0 > k1Var.L0 - 5 && k1Var.f9834u0 == 0 && (str = k1Var.f9832s0) != null && str.length() != 0 && (user = k1Var.f9837w0) != null && (str2 = k1Var.f9830r0) != null) {
                        k1Var.T(true, user, str2, k1Var.f9832s0);
                    }
                }
                ma0Var.canScrollVertically(1);
                na0Var.n(!ma0Var.canScrollVertically(-1));
                na0Var.b();
                return;
        }
    }
}
