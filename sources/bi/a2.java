package bi;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.ao;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.bk;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.jj;
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.mj;
import org.telegram.ui.Components.mv;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.pn;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.rb0;
import org.telegram.ui.Components.s40;
import org.telegram.ui.Components.sk;
import org.telegram.ui.Components.sp;
import org.telegram.ui.Components.tg0;
import org.telegram.ui.Components.tk;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.uk;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.Components.wv;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.Components.zn;
import org.telegram.ui.ic1;
public final class a2 extends s4.s0 {
    public final int f2302a;
    public final Object f2303b;

    public a2(Object obj, int i10) {
        this.f2302a = i10;
        this.f2303b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        fl0 fl0Var;
        int i11;
        fl0 fl0Var2;
        fl0 fl0Var3;
        int top;
        int i12;
        fl0 fl0Var4;
        fl0 fl0Var5;
        int top2;
        boolean z10;
        switch (this.f2302a) {
            case 1:
                q2 q2Var = (q2) this.f2303b;
                if (i10 == 0 && q2Var.f3445n >= 0.0f && !q2Var.f3442b.canScrollVertically(-1)) {
                    q2Var.f3445n = -1.0f;
                    return;
                }
                return;
            case 5:
                ei.h0 h0Var = (ei.h0) this.f2303b;
                if (i10 == 0) {
                    h0Var.e = !h0Var.d.canScrollVertically(-1);
                    h0Var.d.canScrollVertically(1);
                    return;
                }
                return;
            case 9:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((gg.n2) this.f2303b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.f2303b;
                org.telegram.ui.Components.u7 u7Var = j8Var.f24291n;
                if (i10 == 0) {
                    if (org.telegram.ui.Components.j8.j0(j8Var) + ((j8Var.A0 - org.telegram.ui.Components.j8.i0(j8Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && u7Var.canScrollVertically(1) && (fl0Var = (fl0) u7Var.K(j8Var.f24302v0 ? 1 : 0)) != null) {
                        View view = fl0Var.f41610a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            u7Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(j8Var.getCurrentFocus());
                    return;
                } else {
                    return;
                }
            case 15:
                mj mjVar = (mj) this.f2303b;
                y1 y1Var = mjVar.f25239n;
                yi yiVar = mjVar.f26422b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var = yiVar.f29350a1;
                    if (w0Var != null) {
                        i11 = AndroidUtilities.dp(w0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i13 = dp + i11;
                    int backgroundPaddingTop = yiVar.getBackgroundPaddingTop();
                    if (((yiVar.f29354b2[0] - backgroundPaddingTop) - i13) + backgroundPaddingTop < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (fl0Var2 = (fl0) y1Var.K(0)) != null) {
                        View view2 = fl0Var2.f41610a;
                        if (view2.getTop() > AndroidUtilities.dp(7.0f)) {
                            y1Var.v0(0, view2.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 17:
                tk tkVar = (tk) this.f2303b;
                ik ikVar = tkVar.f27428r;
                yi yiVar2 = tkVar.f26422b;
                boolean z11 = false;
                if (i10 == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop2 = yiVar2.getBackgroundPaddingTop();
                    if (((yiVar2.f29354b2[0] - backgroundPaddingTop2) - dp2) + backgroundPaddingTop2 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (fl0Var3 = (fl0) ikVar.K(0)) != null && (top = (fl0Var3.f41610a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(56.0f)) > 0) {
                        ikVar.v0(0, top, null);
                    }
                }
                if (i10 == 1 && tkVar.f27422b0 && ikVar.getAdapter() == tkVar.f27432y) {
                    AndroidUtilities.hideKeyboard(yiVar2.getCurrentFocus());
                }
                if (i10 != 0) {
                    z11 = true;
                }
                tkVar.U = z11;
                return;
            case 18:
                uk ukVar = (uk) this.f2303b;
                vl0 vl0Var = ukVar.f27687r;
                yi yiVar3 = ukVar.f26422b;
                if (i10 == 0) {
                    int dp3 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var2 = yiVar3.f29350a1;
                    if (w0Var2 != null) {
                        i12 = AndroidUtilities.dp(w0Var2.getAlpha() * 26.0f);
                    } else {
                        i12 = 0;
                    }
                    int i14 = dp3 + i12;
                    int backgroundPaddingTop3 = yiVar3.getBackgroundPaddingTop();
                    if (((yiVar3.f29354b2[0] - backgroundPaddingTop3) - i14) + backgroundPaddingTop3 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (fl0Var4 = (fl0) vl0Var.K(0)) != null) {
                        View view3 = fl0Var4.f41610a;
                        if (view3.getTop() > AndroidUtilities.dp(7.0f)) {
                            vl0Var.v0(0, view3.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 19:
                if (i10 == 1) {
                    ll llVar = (ll) this.f2303b;
                    if (llVar.f25035l0 && llVar.m0) {
                        AndroidUtilities.hideKeyboard(llVar.f26422b.getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 20:
                zn znVar = (zn) this.f2303b;
                ic1 ic1Var = znVar.f29762s;
                yi yiVar4 = znVar.f26422b;
                if (i10 == 0) {
                    int dp4 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop4 = yiVar4.getBackgroundPaddingTop();
                    if (((yiVar4.f29354b2[0] - backgroundPaddingTop4) - dp4) + backgroundPaddingTop4 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (fl0Var5 = (fl0) ic1Var.K(1)) != null && (top2 = (fl0Var5.f41610a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        ic1Var.v0(0, top2, null);
                    }
                    int i15 = znVar.W0;
                    if (i15 >= 0) {
                        zn.K(znVar, i15);
                        znVar.W0 = -1;
                        return;
                    }
                    return;
                }
                return;
            case 26:
                wa0 wa0Var = (wa0) this.f2303b;
                boolean z12 = false;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                wa0Var.X2 = z10;
                if (i10 == 1) {
                    z12 = true;
                }
                wa0Var.Y2 = z12;
                return;
            case 28:
                zg0 zg0Var = (zg0) this.f2303b;
                tg0 tg0Var = zg0Var.f29678b;
                if (i10 == 0) {
                    if (zg0.I(zg0Var) + ((zg0Var.E - zg0.H(zg0Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && tg0Var.canScrollVertically(1)) {
                        tg0Var.getChildAt(0);
                        fl0 fl0Var6 = (fl0) tg0Var.K(0);
                        if (fl0Var6 != null) {
                            View view4 = fl0Var6.f41610a;
                            if (view4.getTop() > AndroidUtilities.dp(7.0f)) {
                                tg0Var.v0(0, view4.getTop() - AndroidUtilities.dp(7.0f), null);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        boolean z10;
        x2 x2Var;
        ViewGroup viewGroup2;
        int i12;
        boolean z11;
        x2 x2Var2;
        float f7;
        ViewGroup viewGroup3;
        fg.q0 q0Var;
        s40 s40Var;
        s4.c1 T;
        int N0;
        int i13;
        String str;
        TLRPC.User user;
        String str2;
        switch (this.f2302a) {
            case 0:
                k2 k2Var = (k2) this.f2303b;
                h2 h2Var = k2Var.f2981c;
                f3 f3Var = k2Var.f2984r;
                viewGroup = ((org.telegram.ui.ActionBar.h3) f3Var).containerView;
                viewGroup.invalidate();
                z10 = ((org.telegram.ui.ActionBar.h3) f3Var).keyboardVisible;
                if (z10 && k2Var.f2980b.K1 && (x2Var = k2Var.d) != null && x2Var.d != null) {
                    f3Var.o0();
                }
                if (k2Var.e.M0() + 7 >= h2Var.h() - 1) {
                    h2Var.G();
                    return;
                }
                return;
            case 1:
                q2 q2Var = (q2) this.f2303b;
                p2 p2Var = q2Var.f3443c;
                w1 w1Var = q2Var.f3442b;
                f3 f3Var2 = q2Var.f3447s;
                viewGroup2 = ((org.telegram.ui.ActionBar.h3) f3Var2).containerView;
                viewGroup2.invalidate();
                int i14 = -1;
                if (q2Var.f3445n < 0.0f) {
                    i12 = q2Var.d.I0();
                } else {
                    int i15 = 0;
                    while (true) {
                        if (i15 < w1Var.getChildCount()) {
                            View childAt = w1Var.getChildAt(i15);
                            if (childAt.getY() + childAt.getHeight() > q2Var.f3445n + w1Var.getPaddingTop()) {
                                w1Var.getClass();
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
                int size = p2Var.f3364y.size() - 1;
                while (true) {
                    if (size >= 0) {
                        int keyAt = p2Var.f3364y.keyAt(size);
                        int valueAt = p2Var.f3364y.valueAt(size);
                        if (i12 >= keyAt) {
                            i14 = valueAt;
                        } else {
                            size--;
                        }
                    }
                }
                if (i14 >= 0) {
                    q2Var.e.j(i14, true);
                }
                z11 = ((org.telegram.ui.ActionBar.h3) f3Var2).keyboardVisible;
                if (z11 && w1Var.K1 && (x2Var2 = q2Var.f3444f) != null && x2Var2.d != null) {
                    f3Var2.o0();
                    return;
                }
                return;
            case 2:
                pf pfVar = (pf) this.f2303b;
                View m10 = pfVar.f6532c.getLayoutManager().m(0);
                float f10 = 0.0f;
                if (m10 != null) {
                    f7 = m10.getY();
                } else {
                    f7 = 0.0f;
                }
                if (f7 >= 0.0f) {
                    f10 = f7;
                }
                pfVar.h = f10;
                pfVar.b();
                return;
            case 3:
                di.h4 h4Var = (di.h4) this.f2303b;
                long j3 = h4Var.P;
                int i16 = 0;
                while (true) {
                    if (i16 < h4Var.f36527c.getChildCount()) {
                        if (!(h4Var.f36527c.getChildAt(i16) instanceof a10)) {
                            i16++;
                        }
                    } else if (recyclerView.canScrollVertically(1)) {
                        return;
                    }
                }
                xh.p.g(di.h4.C0(h4Var)).d(j3).a();
                xh.p.g(di.h4.D0(h4Var)).e(j3).a();
                return;
            case 4:
                ei.s sVar = (ei.s) this.f2303b;
                sVar.v.b(sVar.d);
                return;
            case 5:
                viewGroup3 = ((org.telegram.ui.ActionBar.h3) ((ei.h0) this.f2303b).f7557f).containerView;
                viewGroup3.invalidate();
                return;
            case 6:
                ei.j0 j0Var = (ei.j0) this.f2303b;
                j0Var.h.M.b(j0Var.d);
                return;
            case 7:
                gg.n.b0((gg.n) this.f2303b);
                return;
            case 8:
                gg.n0 n0Var = (gg.n0) this.f2303b;
                n0Var.f26422b.X1(n0Var, i11);
                n0Var.M();
                return;
            case 9:
            case 19:
            default:
                return;
            case 10:
                ((m4.w) this.f2303b).run();
                return;
            case 11:
                ((org.telegram.ui.Components.g0) this.f2303b).r0();
                return;
            case 12:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.f2303b;
                s4.c0 c0Var = j8Var.f24296r;
                org.telegram.ui.Components.j8.P(j8Var);
                j8Var.E0();
                if (!j8Var.f24283f) {
                    int L0 = c0Var.L0();
                    int i17 = 0;
                    if (j8Var.f24302v0) {
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
            case 13:
                ((aw0) this.f2303b).invalidate();
                return;
            case 14:
                jj jjVar = (jj) this.f2303b;
                jjVar.f26422b.X1(jjVar, i11);
                return;
            case 15:
                mj mjVar = (mj) this.f2303b;
                if (mjVar.f25239n.getChildCount() > 0) {
                    mjVar.f26422b.X1(mjVar, i11);
                    return;
                }
                return;
            case 16:
                bk bkVar = (bk) this.f2303b;
                bkVar.f26422b.X1(bkVar, i11);
                bkVar.O();
                return;
            case 17:
                tk tkVar = (tk) this.f2303b;
                gg.j0 j0Var2 = tkVar.E;
                tkVar.f26422b.X1(tkVar, i11);
                tkVar.U();
                s4.h0 adapter = tkVar.f27428r.getAdapter();
                sk skVar = tkVar.f27432y;
                if (adapter == skVar) {
                    int L02 = j0Var2.L0();
                    int N02 = j0Var2.N0();
                    int abs = Math.abs(N02 - L02) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs > 0 && N02 >= h10 - 10) {
                        sk skVar2 = skVar.X.f27432y;
                        if (!skVar2.S && !skVar2.V && (q0Var = skVar.f27090y) != null) {
                            skVar.Z(skVar.f27089x, skVar.E, skVar.F, q0Var, skVar.J, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 18:
                uk ukVar = (uk) this.f2303b;
                ukVar.f26422b.X1(ukVar, i11);
                ukVar.v.setTranslationY(Math.max(0, ukVar.getCurrentItemTop()));
                return;
            case 20:
                zn znVar = (zn) this.f2303b;
                gg.j0 j0Var3 = znVar.f29767w;
                znVar.f26422b.X1(znVar, i11);
                pn pnVar = znVar.f29769x;
                if (pnVar != null && pnVar.f29838s) {
                    xy0 delegate = pnVar.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.e6) {
                        ic1 ic1Var = znVar.f29762s;
                        View F = ic1Var.F((org.telegram.ui.Cells.e6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = ic1Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f41610a;
                            int b10 = T.b();
                            if (pnVar.getDirection() == 0) {
                                pnVar.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                pnVar.setTranslationY(view.getY());
                            }
                            if (b10 < j0Var3.L0() || b10 > j0Var3.N0()) {
                                pnVar.f();
                            }
                        } else {
                            pnVar.f();
                        }
                    } else {
                        pnVar.f();
                    }
                }
                if (i11 != 0 && (s40Var = znVar.f29771y) != null) {
                    s40Var.b(true);
                    return;
                }
                return;
            case 21:
                ao aoVar = (ao) this.f2303b;
                aoVar.f26422b.X1(aoVar, i11);
                return;
            case 22:
                sp spVar = (sp) this.f2303b;
                if (spVar.f27146x.M0() + 10 >= spVar.h.h()) {
                    spVar.w();
                    return;
                }
                return;
            case 23:
                wv wvVar = (wv) this.f2303b;
                mv mvVar = wvVar.f28843f;
                if (mvVar != null && wvVar.h.K1 && mvVar.f25296w) {
                    mvVar.f25296w = false;
                    mvVar.invalidate();
                    return;
                }
                return;
            case 24:
                r00 r00Var = (r00) this.f2303b;
                r00Var.F.invalidate();
                r00Var.invalidate();
                return;
            case 25:
                u00.F((u00) this.f2303b);
                return;
            case 26:
                wa0 wa0Var = (wa0) this.f2303b;
                s4.o0 layoutManager = wa0Var.getLayoutManager();
                xa0 xa0Var = wa0Var.f28745b3;
                qa0 qa0Var = xa0Var.d;
                if (layoutManager == qa0Var) {
                    N0 = qa0Var.N0();
                } else {
                    N0 = xa0Var.f28991c.N0();
                }
                if (N0 == -1) {
                    i13 = 0;
                } else {
                    i13 = N0;
                }
                if (i13 > 0) {
                    fg.l1 l1Var = xa0Var.f28992f;
                    if (N0 > l1Var.L0 - 5 && l1Var.f8126u0 == 0 && (str = l1Var.f8124s0) != null && str.length() != 0 && (user = l1Var.f8129w0) != null && (str2 = l1Var.f8122r0) != null) {
                        l1Var.T(true, user, str2, l1Var.f8124s0);
                    }
                }
                wa0Var.canScrollVertically(1);
                xa0Var.n(!wa0Var.canScrollVertically(-1));
                xa0Var.b();
                return;
            case 27:
                yb0 yb0Var = (yb0) this.f2303b;
                org.telegram.ui.w8 w8Var = yb0Var.f29292b;
                rb0 rb0Var = yb0Var.f29296f;
                for (int i18 = 0; i18 < rb0Var.getChildCount(); i18++) {
                    View childAt2 = rb0Var.getChildAt(i18);
                    if (childAt2 instanceof org.telegram.ui.Cells.t1) {
                        ((org.telegram.ui.Cells.t1) childAt2).Z3(w8Var.getMeasuredWidth(), w8Var.getBackgroundSizeY());
                    }
                }
                qb0 qb0Var = yb0Var.e;
                if (qb0Var != null) {
                    qb0Var.x();
                    return;
                }
                return;
            case 28:
                zg0 zg0Var = (zg0) this.f2303b;
                if (zg0Var.f29678b.getChildCount() > 0) {
                    zg0.t(zg0Var);
                    return;
                }
                return;
            case 29:
                pk0 pk0Var = (pk0) this.f2303b;
                y1 y1Var = pk0Var.f26161b;
                int[] iArr = pk0Var.f26172f0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i19 = iArr[0];
                    View childAt3 = recyclerView.getChildAt(0);
                    childAt3.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i19, 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    pk0.b(pk0Var, childAt3, min);
                    View childAt4 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt4.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i19) - (childAt4.getWidth() + iArr[0]), 0.0f)) / childAt4.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    pk0.b(pk0Var, childAt4, min2);
                }
                for (int i20 = 1; i20 < y1Var.getChildCount() - 1; i20++) {
                    pk0.b(pk0Var, y1Var.getChildAt(i20), 1.0f);
                }
                pk0Var.invalidate();
                return;
        }
    }
}
