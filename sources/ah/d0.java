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
import org.telegram.ui.Components.iz0;
import org.telegram.ui.Components.jo;
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
import org.telegram.ui.Components.ul;
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
    public final int f682a;
    public final Object f683b;

    public d0(Object obj, int i10) {
        this.f682a = i10;
        this.f683b = obj;
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
        switch (this.f682a) {
            case 3:
                d2 d2Var = (d2) this.f683b;
                if (i10 == 0 && d2Var.f6783n >= 0.0f && !d2Var.f6780b.canScrollVertically(-1)) {
                    d2Var.f6783n = -1.0f;
                    return;
                }
                return;
            case 7:
                gi.h0 h0Var = (gi.h0) this.f683b;
                if (i10 == 0) {
                    h0Var.e = !h0Var.d.canScrollVertically(-1);
                    h0Var.d.canScrollVertically(1);
                    return;
                }
                return;
            case 11:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((e2) this.f683b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 12:
                ((ni.e) this.f683b).f16394f++;
                return;
            case 15:
                m8 m8Var = (m8) this.f683b;
                x7 x7Var = m8Var.f27248n;
                if (i10 == 0) {
                    if (m8.k0(m8Var) + ((m8Var.A0 - m8.j0(m8Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && x7Var.canScrollVertically(1) && (wl0Var = (wl0) x7Var.K(m8Var.f27259v0 ? 1 : 0)) != null) {
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
                kj kjVar = (kj) this.f683b;
                bi.o0 o0Var = kjVar.f26708n;
                vi viVar = kjVar.f27671b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.u0 u0Var = viVar.f29995d1;
                    if (u0Var != null) {
                        i11 = AndroidUtilities.dp(u0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i13 = dp + i11;
                    int backgroundPaddingTop = viVar.getBackgroundPaddingTop();
                    if (((viVar.f29999e2[0] - backgroundPaddingTop) - i13) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (wl0Var2 = (wl0) o0Var.K(0)) != null) {
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
                pk pkVar = (pk) this.f683b;
                ek ekVar = pkVar.f28354r;
                vi viVar2 = pkVar.f27671b;
                boolean z11 = false;
                if (i10 == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop2 = viVar2.getBackgroundPaddingTop();
                    if (((viVar2.f29999e2[0] - backgroundPaddingTop2) - dp2) + backgroundPaddingTop2 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (wl0Var3 = (wl0) ekVar.K(0)) != null && (top = (wl0Var3.f44838a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(56.0f)) > 0) {
                        ekVar.v0(0, top, null);
                    }
                }
                if (i10 == 1 && pkVar.f28348b0 && ekVar.getAdapter() == pkVar.f28358y) {
                    AndroidUtilities.hideKeyboard(viVar2.getCurrentFocus());
                }
                if (i10 != 0) {
                    z11 = true;
                }
                pkVar.U = z11;
                return;
            case 21:
                qk qkVar = (qk) this.f683b;
                mm0 mm0Var = qkVar.f28625r;
                vi viVar3 = qkVar.f27671b;
                if (i10 == 0) {
                    int dp3 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.u0 u0Var2 = viVar3.f29995d1;
                    if (u0Var2 != null) {
                        i12 = AndroidUtilities.dp(u0Var2.getAlpha() * 26.0f);
                    } else {
                        i12 = 0;
                    }
                    int i14 = dp3 + i12;
                    int backgroundPaddingTop3 = viVar3.getBackgroundPaddingTop();
                    if (((viVar3.f29999e2[0] - backgroundPaddingTop3) - i14) + backgroundPaddingTop3 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (wl0Var4 = (wl0) mm0Var.K(0)) != null) {
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
                    ul ulVar = (ul) this.f683b;
                    if (ulVar.f29717l0 && ulVar.m0) {
                        AndroidUtilities.hideKeyboard(ulVar.f27671b.getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 23:
                io ioVar = (io) this.f683b;
                kc1 kc1Var = ioVar.f26031s;
                vi viVar4 = ioVar.f27671b;
                if (i10 == 0) {
                    int dp4 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop4 = viVar4.getBackgroundPaddingTop();
                    if (((viVar4.f29999e2[0] - backgroundPaddingTop4) - dp4) + backgroundPaddingTop4 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (wl0Var5 = (wl0) kc1Var.K(1)) != null && (top2 = (wl0Var5.f44838a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
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
                nb0 nb0Var = (nb0) this.f683b;
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
        switch (this.f682a) {
            case 0:
                ((f0) this.f683b).c(true);
                return;
            case 1:
                px pxVar = (px) this.f683b;
                pxVar.invalidate();
                pxVar.c();
                d4 d4Var = pxVar.J;
                if (d4Var != null) {
                    d4Var.e(true);
                    return;
                }
                return;
            case 2:
                y1 y1Var = (y1) this.f683b;
                v1 v1Var = y1Var.f8120c;
                r2 r2Var = y1Var.f8123r;
                viewGroup = ((e3) r2Var).containerView;
                viewGroup.invalidate();
                z10 = ((e3) r2Var).keyboardVisible;
                if (z10 && y1Var.f8119b.I1 && (k2Var = y1Var.d) != null && k2Var.d != null) {
                    r2Var.p0();
                }
                if (y1Var.e.M0() + 7 >= v1Var.h() - 1) {
                    v1Var.G();
                    return;
                }
                return;
            case 3:
                d2 d2Var = (d2) this.f683b;
                c2 c2Var = d2Var.f6781c;
                o1 o1Var = d2Var.f6780b;
                r2 r2Var2 = d2Var.f6785s;
                viewGroup2 = ((e3) r2Var2).containerView;
                viewGroup2.invalidate();
                int i14 = -1;
                if (d2Var.f6783n < 0.0f) {
                    i12 = d2Var.d.I0();
                } else {
                    int i15 = 0;
                    while (true) {
                        if (i15 < o1Var.getChildCount()) {
                            View childAt = o1Var.getChildAt(i15);
                            if (childAt.getY() + childAt.getHeight() > d2Var.f6783n + o1Var.getPaddingTop()) {
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
                int size = c2Var.f6700y.size() - 1;
                while (true) {
                    if (size >= 0) {
                        int keyAt = c2Var.f6700y.keyAt(size);
                        int valueAt = c2Var.f6700y.valueAt(size);
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
                if (z11 && o1Var.I1 && (k2Var2 = d2Var.f6782f) != null && k2Var2.d != null) {
                    r2Var2.p0();
                    return;
                }
                return;
            case 4:
                pf pfVar = (pf) this.f683b;
                View m10 = pfVar.f9652c.getLayoutManager().m(0);
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
                f4 f4Var = (f4) this.f683b;
                long j10 = f4Var.P;
                int i16 = 0;
                while (true) {
                    if (i16 < f4Var.f40861c.getChildCount()) {
                        if (!(f4Var.f40861c.getChildAt(i16) instanceof f10)) {
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
                gi.s sVar = (gi.s) this.f683b;
                sVar.v.b(sVar.d);
                return;
            case 7:
                gi.k0.N(((gi.h0) this.f683b).f10188f).invalidate();
                return;
            case 8:
                gi.j0 j0Var = (gi.j0) this.f683b;
                j0Var.h.M.b(j0Var.d);
                return;
            case 9:
                ig.m.b0((ig.m) this.f683b);
                return;
            case 10:
                ig.i0 i0Var = (ig.i0) this.f683b;
                i0Var.f27671b.b2(i0Var, i11);
                i0Var.P();
                return;
            case 11:
            case 22:
            default:
                return;
            case 12:
                ((ni.e) this.f683b).f16394f++;
                return;
            case 13:
                ((org.telegram.messenger.voip.j) this.f683b).run();
                return;
            case 14:
                ((org.telegram.ui.Components.e0) this.f683b).s0();
                return;
            case 15:
                m8 m8Var = (m8) this.f683b;
                s4.b0 b0Var = m8Var.f27253r;
                m8.Q(m8Var);
                m8Var.E0();
                if (!m8Var.f27240f) {
                    int L0 = b0Var.L0();
                    int i17 = 0;
                    if (m8Var.f27259v0) {
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
                ((ow0) this.f683b).invalidate();
                return;
            case 17:
                hj hjVar = (hj) this.f683b;
                hjVar.f27671b.b2(hjVar, i11);
                return;
            case 18:
                kj kjVar = (kj) this.f683b;
                if (kjVar.f26708n.getChildCount() > 0) {
                    kjVar.f27671b.b2(kjVar, i11);
                    return;
                }
                return;
            case 19:
                zj zjVar = (zj) this.f683b;
                zjVar.f27671b.b2(zjVar, i11);
                zjVar.R();
                return;
            case 20:
                pk pkVar = (pk) this.f683b;
                ig.e0 e0Var = pkVar.E;
                pkVar.f27671b.b2(pkVar, i11);
                pkVar.X();
                s4.g0 adapter = pkVar.f28354r.getAdapter();
                ok okVar = pkVar.f28358y;
                if (adapter == okVar) {
                    int L02 = e0Var.L0();
                    int N02 = e0Var.N0();
                    int abs = Math.abs(N02 - L02) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs > 0 && N02 >= h10 - 10) {
                        ok okVar2 = okVar.X.f28358y;
                        if (!okVar2.S && !okVar2.V && (p0Var = okVar.f27986y) != null) {
                            okVar.Z(okVar.f27985x, okVar.E, okVar.F, p0Var, okVar.J, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 21:
                qk qkVar = (qk) this.f683b;
                qkVar.f27671b.b2(qkVar, i11);
                qkVar.v.setTranslationY(Math.max(0, qkVar.getCurrentItemTop()));
                return;
            case 23:
                io ioVar = (io) this.f683b;
                ig.e0 e0Var2 = ioVar.f26036w;
                ioVar.f27671b.b2(ioVar, i11);
                wn wnVar = ioVar.f26038x;
                if (wnVar != null && wnVar.f26837s) {
                    iz0 delegate = wnVar.getDelegate();
                    if (delegate instanceof d6) {
                        kc1 kc1Var = ioVar.f26031s;
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
                if (i11 != 0 && (v40Var = ioVar.f26040y) != null) {
                    v40Var.b(true);
                    return;
                }
                return;
            case 24:
                jo joVar = (jo) this.f683b;
                joVar.f27671b.b2(joVar, i11);
                return;
            case 25:
                zp zpVar = (zp) this.f683b;
                if (zpVar.f31955x.M0() + 10 >= zpVar.h.h()) {
                    zpVar.y();
                    return;
                }
                return;
            case 26:
                ew ewVar = (ew) this.f683b;
                uv uvVar = ewVar.f24804f;
                if (uvVar != null && ewVar.h.I1 && uvVar.f29779w) {
                    uvVar.f29779w = false;
                    uvVar.invalidate();
                    return;
                }
                return;
            case 27:
                w00 w00Var = (w00) this.f683b;
                w00Var.F.invalidate();
                w00Var.invalidate();
                return;
            case 28:
                z00.H((z00) this.f683b);
                return;
            case 29:
                nb0 nb0Var = (nb0) this.f683b;
                s4.n0 layoutManager = nb0Var.getLayoutManager();
                ob0 ob0Var = nb0Var.Z2;
                hb0 hb0Var = ob0Var.d;
                if (layoutManager == hb0Var) {
                    N0 = hb0Var.N0();
                } else {
                    N0 = ob0Var.f27928c.N0();
                }
                if (N0 == -1) {
                    i13 = 0;
                } else {
                    i13 = N0;
                }
                if (i13 > 0) {
                    hg.j1 j1Var = ob0Var.f27929f;
                    if (N0 > j1Var.M0 - 5 && j1Var.f10635u0 == 0 && (str = j1Var.f10633s0) != null && str.length() != 0 && (user = j1Var.f10638w0) != null && (str2 = j1Var.f10631r0) != null) {
                        j1Var.T(true, user, str2, j1Var.f10633s0);
                    }
                }
                nb0Var.canScrollVertically(1);
                ob0Var.n(!nb0Var.canScrollVertically(-1));
                ob0Var.b();
                return;
        }
    }
}
