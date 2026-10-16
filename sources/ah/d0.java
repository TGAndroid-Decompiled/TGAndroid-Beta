package ah;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import di.c2;
import di.d2;
import di.d4;
import di.k2;
import di.o1;
import di.r2;
import di.v1;
import di.y1;
import fi.f4;
import ig.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Cells.d6;
import org.telegram.ui.Components.ek;
import org.telegram.ui.Components.ew;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.hj;
import org.telegram.ui.Components.io;
import org.telegram.ui.Components.jo;
import org.telegram.ui.Components.jz0;
import org.telegram.ui.Components.kj;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.pk;
import org.telegram.ui.Components.qk;
import org.telegram.ui.Components.tl;
import org.telegram.ui.Components.uv;
import org.telegram.ui.Components.v40;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.w00;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.wn;
import org.telegram.ui.Components.x7;
import org.telegram.ui.Components.z00;
import org.telegram.ui.Components.zj;
import org.telegram.ui.Components.zp;
import org.telegram.ui.kc1;
import org.telegram.ui.px;
public final class d0 extends s4.r0 {
    public final int f686a;
    public final Object f687b;

    public d0(Object obj, int i10) {
        this.f686a = i10;
        this.f687b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        wl0 wl0Var;
        int i11;
        wl0 wl0Var2;
        wl0 wl0Var3;
        int top;
        int i12;
        wl0 wl0Var4;
        wl0 wl0Var5;
        int top2;
        boolean z10;
        switch (this.f686a) {
            case 3:
                d2 d2Var = (d2) this.f687b;
                if (i10 == 0 && d2Var.f6786n >= 0.0f && !d2Var.f6783b.canScrollVertically(-1)) {
                    d2Var.f6786n = -1.0f;
                    return;
                }
                return;
            case 7:
                gi.h0 h0Var = (gi.h0) this.f687b;
                if (i10 == 0) {
                    h0Var.e = !h0Var.d.canScrollVertically(-1);
                    h0Var.d.canScrollVertically(1);
                    return;
                }
                return;
            case 11:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((e2) this.f687b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 12:
                ((mi.e) this.f687b).f15593f++;
                return;
            case 15:
                m8 m8Var = (m8) this.f687b;
                x7 x7Var = m8Var.f26982n;
                if (i10 == 0) {
                    if (m8.k0(m8Var) + ((m8Var.A0 - m8.j0(m8Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && x7Var.canScrollVertically(1) && (wl0Var = (wl0) x7Var.K(m8Var.f26993v0 ? 1 : 0)) != null) {
                        View view = wl0Var.f44838a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            x7Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(m8Var.getCurrentFocus());
                    return;
                } else {
                    return;
                }
            case 18:
                kj kjVar = (kj) this.f687b;
                bi.o0 o0Var = kjVar.f26394n;
                vi viVar = kjVar.f27360b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.u0 u0Var = viVar.f29666d1;
                    if (u0Var != null) {
                        i11 = AndroidUtilities.dp(u0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i13 = dp + i11;
                    int backgroundPaddingTop = viVar.getBackgroundPaddingTop();
                    if (((viVar.f29670e2[0] - backgroundPaddingTop) - i13) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (wl0Var2 = (wl0) o0Var.K(0)) != null) {
                        View view2 = wl0Var2.f44838a;
                        if (view2.getTop() > AndroidUtilities.dp(7.0f)) {
                            o0Var.v0(0, view2.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 20:
                pk pkVar = (pk) this.f687b;
                ek ekVar = pkVar.f28042r;
                vi viVar2 = pkVar.f27360b;
                boolean z11 = false;
                if (i10 == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop2 = viVar2.getBackgroundPaddingTop();
                    if (((viVar2.f29670e2[0] - backgroundPaddingTop2) - dp2) + backgroundPaddingTop2 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (wl0Var3 = (wl0) ekVar.K(0)) != null && (top = (wl0Var3.f44838a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(56.0f)) > 0) {
                        ekVar.v0(0, top, null);
                    }
                }
                if (i10 == 1 && pkVar.f28036b0 && ekVar.getAdapter() == pkVar.f28046y) {
                    AndroidUtilities.hideKeyboard(viVar2.getCurrentFocus());
                }
                if (i10 != 0) {
                    z11 = true;
                }
                pkVar.U = z11;
                return;
            case 21:
                qk qkVar = (qk) this.f687b;
                mm0 mm0Var = qkVar.f28307r;
                vi viVar3 = qkVar.f27360b;
                if (i10 == 0) {
                    int dp3 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.u0 u0Var2 = viVar3.f29666d1;
                    if (u0Var2 != null) {
                        i12 = AndroidUtilities.dp(u0Var2.getAlpha() * 26.0f);
                    } else {
                        i12 = 0;
                    }
                    int i14 = dp3 + i12;
                    int backgroundPaddingTop3 = viVar3.getBackgroundPaddingTop();
                    if (((viVar3.f29670e2[0] - backgroundPaddingTop3) - i14) + backgroundPaddingTop3 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (wl0Var4 = (wl0) mm0Var.K(0)) != null) {
                        View view3 = wl0Var4.f44838a;
                        if (view3.getTop() > AndroidUtilities.dp(7.0f)) {
                            mm0Var.v0(0, view3.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 22:
                if (i10 == 1) {
                    tl tlVar = (tl) this.f687b;
                    if (tlVar.f29103l0 && tlVar.m0) {
                        AndroidUtilities.hideKeyboard(tlVar.f27360b.getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 23:
                io ioVar = (io) this.f687b;
                kc1 kc1Var = ioVar.f25694s;
                vi viVar4 = ioVar.f27360b;
                if (i10 == 0) {
                    int dp4 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop4 = viVar4.getBackgroundPaddingTop();
                    if (((viVar4.f29670e2[0] - backgroundPaddingTop4) - dp4) + backgroundPaddingTop4 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (wl0Var5 = (wl0) kc1Var.K(1)) != null && (top2 = (wl0Var5.f44838a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        kc1Var.v0(0, top2, null);
                    }
                    int i15 = ioVar.W0;
                    if (i15 >= 0) {
                        io.N(ioVar, i15);
                        ioVar.W0 = -1;
                        return;
                    }
                    return;
                }
                return;
            case 29:
                nb0 nb0Var = (nb0) this.f687b;
                boolean z12 = false;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                nb0Var.V2 = z10;
                if (i10 == 1) {
                    z12 = true;
                }
                nb0Var.W2 = z12;
                return;
            default:
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        boolean z10;
        k2 k2Var;
        ViewGroup viewGroup2;
        int i12;
        boolean z11;
        k2 k2Var2;
        float f7;
        hg.p0 p0Var;
        v40 v40Var;
        s4.b1 T;
        int N0;
        int i13;
        String str;
        TLRPC.User user;
        String str2;
        switch (this.f686a) {
            case 0:
                ((f0) this.f687b).c(true);
                return;
            case 1:
                px pxVar = (px) this.f687b;
                pxVar.invalidate();
                pxVar.c();
                d4 d4Var = pxVar.J;
                if (d4Var != null) {
                    d4Var.e(true);
                    return;
                }
                return;
            case 2:
                y1 y1Var = (y1) this.f687b;
                v1 v1Var = y1Var.f8122c;
                r2 r2Var = y1Var.f8125r;
                viewGroup = ((e3) r2Var).containerView;
                viewGroup.invalidate();
                z10 = ((e3) r2Var).keyboardVisible;
                if (z10 && y1Var.f8121b.I1 && (k2Var = y1Var.d) != null && k2Var.d != null) {
                    r2Var.p0();
                }
                if (y1Var.e.M0() + 7 >= v1Var.h() - 1) {
                    v1Var.G();
                    return;
                }
                return;
            case 3:
                d2 d2Var = (d2) this.f687b;
                c2 c2Var = d2Var.f6784c;
                o1 o1Var = d2Var.f6783b;
                r2 r2Var2 = d2Var.f6788s;
                viewGroup2 = ((e3) r2Var2).containerView;
                viewGroup2.invalidate();
                int i14 = -1;
                if (d2Var.f6786n < 0.0f) {
                    i12 = d2Var.d.I0();
                } else {
                    int i15 = 0;
                    while (true) {
                        if (i15 < o1Var.getChildCount()) {
                            View childAt = o1Var.getChildAt(i15);
                            if (childAt.getY() + childAt.getHeight() > d2Var.f6786n + o1Var.getPaddingTop()) {
                                o1Var.getClass();
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
                int size = c2Var.f6703y.size() - 1;
                while (true) {
                    if (size >= 0) {
                        int keyAt = c2Var.f6703y.keyAt(size);
                        int valueAt = c2Var.f6703y.valueAt(size);
                        if (i12 >= keyAt) {
                            i14 = valueAt;
                        } else {
                            size--;
                        }
                    }
                }
                if (i14 >= 0) {
                    d2Var.e.j(i14, true);
                }
                z11 = ((e3) r2Var2).keyboardVisible;
                if (z11 && o1Var.I1 && (k2Var2 = d2Var.f6785f) != null && k2Var2.d != null) {
                    r2Var2.p0();
                    return;
                }
                return;
            case 4:
                pf pfVar = (pf) this.f687b;
                View m10 = pfVar.f9655c.getLayoutManager().m(0);
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
            case 5:
                f4 f4Var = (f4) this.f687b;
                long j10 = f4Var.P;
                int i16 = 0;
                while (true) {
                    if (i16 < f4Var.f40548c.getChildCount()) {
                        if (!(f4Var.f40548c.getChildAt(i16) instanceof f10)) {
                            i16++;
                        }
                    } else if (recyclerView.canScrollVertically(1)) {
                        return;
                    }
                }
                zh.p.g(f4.D0(f4Var)).d(j10).a();
                zh.p.g(f4.E0(f4Var)).e(j10).a();
                return;
            case 6:
                gi.s sVar = (gi.s) this.f687b;
                sVar.v.b(sVar.d);
                return;
            case 7:
                gi.k0.N(((gi.h0) this.f687b).f10192f).invalidate();
                return;
            case 8:
                gi.j0 j0Var = (gi.j0) this.f687b;
                j0Var.h.M.b(j0Var.d);
                return;
            case 9:
                ig.m.b0((ig.m) this.f687b);
                return;
            case 10:
                ig.i0 i0Var = (ig.i0) this.f687b;
                i0Var.f27360b.b2(i0Var, i11);
                i0Var.P();
                return;
            case 11:
            case 22:
            default:
                return;
            case 12:
                ((mi.e) this.f687b).f15593f++;
                return;
            case 13:
                ((org.telegram.messenger.voip.p0) this.f687b).run();
                return;
            case 14:
                ((org.telegram.ui.Components.e0) this.f687b).s0();
                return;
            case 15:
                m8 m8Var = (m8) this.f687b;
                s4.b0 b0Var = m8Var.f26987r;
                m8.Q(m8Var);
                m8Var.E0();
                if (!m8Var.f26974f) {
                    int L0 = b0Var.L0();
                    int i17 = 0;
                    if (m8Var.f26993v0) {
                        L0 = Math.max(0, L0 - 1);
                    }
                    if (L0 != -1) {
                        i17 = Math.abs(b0Var.N0() - L0) + 1;
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
                ((ow0) this.f687b).invalidate();
                return;
            case 17:
                hj hjVar = (hj) this.f687b;
                hjVar.f27360b.b2(hjVar, i11);
                return;
            case 18:
                kj kjVar = (kj) this.f687b;
                if (kjVar.f26394n.getChildCount() > 0) {
                    kjVar.f27360b.b2(kjVar, i11);
                    return;
                }
                return;
            case 19:
                zj zjVar = (zj) this.f687b;
                zjVar.f27360b.b2(zjVar, i11);
                zjVar.R();
                return;
            case 20:
                pk pkVar = (pk) this.f687b;
                ig.e0 e0Var = pkVar.E;
                pkVar.f27360b.b2(pkVar, i11);
                pkVar.X();
                s4.g0 adapter = pkVar.f28042r.getAdapter();
                ok okVar = pkVar.f28046y;
                if (adapter == okVar) {
                    int L02 = e0Var.L0();
                    int N02 = e0Var.N0();
                    int abs = Math.abs(N02 - L02) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs > 0 && N02 >= h10 - 10) {
                        ok okVar2 = okVar.X.f28046y;
                        if (!okVar2.S && !okVar2.V && (p0Var = okVar.f27675y) != null) {
                            okVar.Z(okVar.f27674x, okVar.E, okVar.F, p0Var, okVar.J, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 21:
                qk qkVar = (qk) this.f687b;
                qkVar.f27360b.b2(qkVar, i11);
                qkVar.v.setTranslationY(Math.max(0, qkVar.getCurrentItemTop()));
                return;
            case 23:
                io ioVar = (io) this.f687b;
                ig.e0 e0Var2 = ioVar.f25699w;
                ioVar.f27360b.b2(ioVar, i11);
                wn wnVar = ioVar.f25701x;
                if (wnVar != null && wnVar.f26857s) {
                    jz0 delegate = wnVar.getDelegate();
                    if (delegate instanceof d6) {
                        kc1 kc1Var = ioVar.f25694s;
                        View F = kc1Var.F((d6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = kc1Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f44838a;
                            int b10 = T.b();
                            if (wnVar.getDirection() == 0) {
                                wnVar.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                wnVar.setTranslationY(view.getY());
                            }
                            if (b10 < e0Var2.L0() || b10 > e0Var2.N0()) {
                                wnVar.f();
                            }
                        } else {
                            wnVar.f();
                        }
                    } else {
                        wnVar.f();
                    }
                }
                if (i11 != 0 && (v40Var = ioVar.f25703y) != null) {
                    v40Var.b(true);
                    return;
                }
                return;
            case 24:
                jo joVar = (jo) this.f687b;
                joVar.f27360b.b2(joVar, i11);
                return;
            case 25:
                zp zpVar = (zp) this.f687b;
                if (zpVar.f31658x.M0() + 10 >= zpVar.h.h()) {
                    zpVar.y();
                    return;
                }
                return;
            case 26:
                ew ewVar = (ew) this.f687b;
                uv uvVar = ewVar.f24498f;
                if (uvVar != null && ewVar.h.I1 && uvVar.f29447w) {
                    uvVar.f29447w = false;
                    uvVar.invalidate();
                    return;
                }
                return;
            case 27:
                w00 w00Var = (w00) this.f687b;
                w00Var.F.invalidate();
                w00Var.invalidate();
                return;
            case 28:
                z00.H((z00) this.f687b);
                return;
            case 29:
                nb0 nb0Var = (nb0) this.f687b;
                s4.n0 layoutManager = nb0Var.getLayoutManager();
                ob0 ob0Var = nb0Var.Z2;
                hb0 hb0Var = ob0Var.d;
                if (layoutManager == hb0Var) {
                    N0 = hb0Var.N0();
                } else {
                    N0 = ob0Var.f27626c.N0();
                }
                if (N0 == -1) {
                    i13 = 0;
                } else {
                    i13 = N0;
                }
                if (i13 > 0) {
                    hg.j1 j1Var = ob0Var.f27627f;
                    if (N0 > j1Var.M0 - 5 && j1Var.f10639u0 == 0 && (str = j1Var.f10637s0) != null && str.length() != 0 && (user = j1Var.f10642w0) != null && (str2 = j1Var.f10635r0) != null) {
                        j1Var.T(true, user, str2, j1Var.f10637s0);
                    }
                }
                nb0Var.canScrollVertically(1);
                ob0Var.n(!nb0Var.canScrollVertically(-1));
                ob0Var.b();
                return;
        }
    }
}
