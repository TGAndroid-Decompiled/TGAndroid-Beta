package mg;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.cd;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.e41;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.fn0;
import org.telegram.ui.Components.gm0;
import org.telegram.ui.Components.m31;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.Wallet.i4;
import org.telegram.ui.a01;
import org.telegram.ui.ay;
import org.telegram.ui.b01;
import org.telegram.ui.c01;
import org.telegram.ui.dg0;
import org.telegram.ui.f50;
import org.telegram.ui.hd1;
import org.telegram.ui.hn;
import org.telegram.ui.ib1;
import org.telegram.ui.ik;
import org.telegram.ui.jd1;
import org.telegram.ui.kb1;
import org.telegram.ui.kx;
import org.telegram.ui.lb1;
import org.telegram.ui.ny;
import org.telegram.ui.pb1;
import org.telegram.ui.un;
import org.telegram.ui.vn;
import org.telegram.ui.wn;
import org.telegram.ui.xw;
import org.telegram.ui.z00;
import rh.e4;
import th.q4;
import w7.b6;
public final class s extends o71 {
    public final int f13225a;
    public final Object f13226b;
    public final Object f13227c;

    public s(Object obj, Context context, int i10) {
        this.f13225a = i10;
        this.f13227c = obj;
        this.f13226b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        k2 k2Var;
        jg.b1 b1Var;
        q4 q4Var;
        int i12 = this.f13225a;
        Object obj = this.f13227c;
        switch (i12) {
            case 0:
                return;
            case 1:
                if (view instanceof wn) {
                    ((wn) view).f43336a.dd(((un) obj).I3);
                }
                WeakHashMap weakHashMap = r0.h0.f46123a;
                r0.x.c(view);
                return;
            case 2:
                kx kxVar = (kx) obj;
                kxVar.P(view, i10, kxVar.M0, true);
                return;
            case 3:
                return;
            case 4:
                ((b01) view).a(i11);
                return;
            case 5:
                return;
            case 6:
                lb1 lb1Var = (lb1) obj;
                lb1Var.M(view, i10, lb1Var.f39152d0, true);
                return;
            case 7:
                jd1 jd1Var = (jd1) obj;
                SparseArray sparseArray = jd1Var.f38497a;
                hd1 hd1Var = (hd1) sparseArray.get(i10);
                if (hd1Var != null) {
                    k2Var = hd1Var.f37897a;
                } else {
                    k2 Z = jd1Var.Z(i10);
                    hd1 hd1Var2 = new hd1(Z);
                    sparseArray.put(i10, hd1Var2);
                    k2Var = Z;
                    hd1Var = hd1Var2;
                }
                if (!hd1Var.f37898b) {
                    k2Var.onFragmentCreate();
                    hd1Var.f37898b = true;
                }
                k2Var.setParentLayout(jd1Var.getParentLayout());
                k2Var.setSimpleMenuOverlayHost(jd1Var);
                if (k2Var.getFragmentView() == null) {
                    k2Var.performCreateView((Context) this.f13226b);
                    k2Var.setTitleOverlayText(jd1Var.f38501n, jd1Var.f38502r, jd1Var.f38503s);
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                View fragmentView = k2Var.getFragmentView();
                org.telegram.messenger.i0.E2(fragmentView);
                if (!k2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    a7.i(t6.f20929d6, fragmentView, null);
                }
                frameLayout.addView(fragmentView, b6.c(-1.0f, -1));
                if (k2Var.getActionBar() != null && k2Var.getActionBar().K) {
                    org.telegram.messenger.i0.E2(k2Var.getActionBar());
                    frameLayout.addView(k2Var.getActionBar());
                }
                WeakHashMap weakHashMap2 = r0.h0.f46123a;
                r0.x.c(frameLayout);
                jd1Var.checkSystemBarColors();
                jd1Var.Y();
                return;
            case 8:
                org.telegram.ui.Wallet.b6.X0((u51) view, false);
                return;
            case 9:
                e4 e4Var = (e4) obj;
                if (i11 == 0) {
                    e4.i1(e4Var, false);
                    ph.w0 w0Var = e4Var.U1;
                    if (w0Var != null) {
                        b1Var = w0Var.Q1;
                    } else {
                        return;
                    }
                } else if (i11 == 2) {
                    e4.i1(e4Var, true);
                    ph.w0 w0Var2 = e4Var.V1;
                    if (w0Var2 != null) {
                        b1Var = w0Var2.Q1;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                org.telegram.messenger.i0.E2(b1Var);
                frameLayout2.addView(b1Var);
                return;
            default:
                uq0 uq0Var = (uq0) obj;
                uh.i iVar = (uh.i) view;
                if (i10 == 0) {
                    q4Var = uq0Var.e;
                } else {
                    q4Var = (q4) uq0Var.f50262f.get(i10 - 1);
                }
                q4Var.H(null);
                iVar.setList(q4Var);
                iVar.setVisibleHeight(uq0Var.f50266w);
                return;
        }
    }

    @Override
    public final View d(int i10) {
        int i11;
        int i12;
        p6 p6Var;
        int i13;
        jg.b1 b1Var;
        switch (this.f13225a) {
            case 0:
                if (i10 == 0) {
                    return ((w0) this.f13226b).f21586b;
                }
                return ((v1) this.f13227c).f21586b;
            case 1:
                Context context = (Context) this.f13226b;
                un unVar = (un) this.f13227c;
                if (i10 == 0) {
                    return new hn(unVar, context);
                }
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 7);
                bundle.putInt("searchType", i10);
                bundle.putString("searchHashtag", unVar.I3);
                ik ikVar = new ik(context, unVar.getParentLayout(), bundle, 0);
                ikVar.h = false;
                vn vnVar = ikVar.f43336a;
                vnVar.M.f7724a = unVar.M;
                vnVar.f42451va = unVar.f42477xa;
                vnVar.f42463wa = unVar;
                vnVar.f42300j9 = new org.telegram.ui.e(this, 12);
                return ikVar;
            case 2:
                kx kxVar = (kx) this.f13227c;
                ay ayVar = kxVar.L0;
                if (i10 == 1) {
                    return kxVar.W;
                }
                if (i10 == 3) {
                    return kxVar.f26455h0;
                }
                if (i10 == 4) {
                    return kxVar.m0;
                }
                if (i10 == 5) {
                    return kxVar.f26466t0;
                }
                if (i10 == 2) {
                    gm0 gm0Var = new gm0(kxVar.J0, ayVar);
                    kxVar.I0 = gm0Var;
                    gm0Var.b(kxVar.W0, kxVar.X0, false);
                    kxVar.I0.f26438b.setClipToPadding(false);
                    kxVar.I0.f26438b.j(new en0(this, 0));
                    kxVar.I0.f26438b.D0(new eb0(kxVar, 24));
                    kxVar.I0.setUiCallback(kxVar);
                    return kxVar.I0;
                } else if (i10 == 6) {
                    return kxVar.f26464r0;
                } else {
                    z00 z00Var = new z00(ayVar);
                    z00Var.setChatPreviewDelegate(kxVar.R0);
                    z00Var.setUiCallback(kxVar);
                    z00Var.j(kxVar.W0, kxVar.X0, false);
                    tg.b bVar = kxVar.Z0;
                    if (bVar != null) {
                        z00Var.setBlurredBackgroundDrawableFactory(bVar);
                    }
                    ag.b1 b1Var2 = z00Var.f43941b;
                    b1Var2.setClipToPadding(false);
                    b1Var2.j(new en0(this, 1));
                    b1Var2.D0(new eb0(kxVar, 24));
                    return z00Var;
                }
            case 3:
                FrameLayout frameLayout = new FrameLayout((Context) this.f13226b);
                frameLayout.setOnClickListener(new f50(this, 24));
                return frameLayout;
            case 4:
                return new b01((c01) this.f13227c, (Context) this.f13226b);
            case 5:
                FrameLayout frameLayout2 = new FrameLayout((Context) this.f13226b);
                frameLayout2.setOnClickListener(new a01(this, 9));
                return frameLayout2;
            case 6:
                lb1 lb1Var = (lb1) this.f13227c;
                pb1 pb1Var = lb1Var.f39169v0;
                if (i10 == 1) {
                    return lb1Var.V;
                }
                if (i10 == 2) {
                    gm0 gm0Var2 = new gm0(pb1.q0(pb1Var), pb1Var);
                    gm0Var2.f26438b.j(new kb1(0));
                    gm0Var2.setUiCallback(lb1Var);
                    return gm0Var2;
                }
                z00 z00Var2 = new z00(pb1Var);
                z00Var2.setChatPreviewDelegate(lb1Var.f39167t0);
                z00Var2.setUiCallback(lb1Var);
                z00Var2.f43941b.j(new kb1(1));
                return z00Var2;
            case 7:
                return new dg0((Context) this.f13226b, 16);
            case 8:
                org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) this.f13227c;
                u51[] u51VarArr = b6Var.f34260r0;
                u51 u51Var = u51VarArr[i10];
                if (u51Var == null) {
                    Context context2 = (Context) this.f13226b;
                    i11 = ((k2) b6Var).currentAccount;
                    i12 = ((k2) b6Var).classGuid;
                    org.telegram.ui.Components.p pVar = new org.telegram.ui.Components.p(this, i10, 2);
                    i4 i4Var = new i4(b6Var);
                    i4 i4Var2 = new i4(b6Var);
                    p6Var = ((k2) b6Var).resourceProvider;
                    if (i10 == 1) {
                        i13 = 3;
                    } else {
                        i13 = -1;
                    }
                    ny nyVar = new ny(context2, i11, i12, false, pVar, i4Var, i4Var2, p6Var, i13, 1);
                    if (i10 == 1) {
                        nyVar.setPadding(org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(12.0f));
                    }
                    nyVar.setFocusableInTouchMode(false);
                    nyVar.setClipChildren(false);
                    nyVar.setClipToPadding(false);
                    if (i10 == 0) {
                        nyVar.r1();
                    } else {
                        nyVar.setSelectorType(9);
                        nyVar.setSelectorDrawableColor(0);
                    }
                    nyVar.f30819f3.f29295r = false;
                    nyVar.j(new e41(this, i10));
                    u51VarArr[i10] = nyVar;
                    return nyVar;
                }
                return u51Var;
            case 9:
                e4 e4Var = (e4) this.f13227c;
                if (i10 == 0) {
                    e4.i1(e4Var, false);
                    ph.w0 w0Var = e4Var.U1;
                    if (w0Var != null) {
                        b1Var = w0Var.Q1;
                        org.telegram.messenger.i0.E2(b1Var);
                        FrameLayout frameLayout3 = new FrameLayout((Context) this.f13226b);
                        frameLayout3.addView(b1Var, b6.e(-1, -1, 119));
                        return frameLayout3;
                    }
                    return null;
                }
                if (i10 == 1) {
                    b1Var = e4Var.Q1;
                } else {
                    if (i10 == 2) {
                        e4.i1(e4Var, true);
                        ph.w0 w0Var2 = e4Var.V1;
                        if (w0Var2 != null) {
                            b1Var = w0Var2.Q1;
                        }
                    }
                    return null;
                }
                org.telegram.messenger.i0.E2(b1Var);
                FrameLayout frameLayout32 = new FrameLayout((Context) this.f13226b);
                frameLayout32.addView(b1Var, b6.e(-1, -1, 119));
                return frameLayout32;
            default:
                return new uh.i((uq0) this.f13227c, (Context) this.f13226b);
        }
    }

    @Override
    public final int e() {
        switch (this.f13225a) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return ((ArrayList) this.f13226b).size();
            case 3:
                return 2;
            case 4:
                return 5;
            case 5:
                return 2;
            case 6:
                return ((ArrayList) this.f13226b).size();
            case 7:
                ((jd1) this.f13227c).getClass();
                return 4;
            case 8:
                if (((org.telegram.ui.Wallet.b6) this.f13227c).f34247f0) {
                    return 2;
                }
                return 1;
            case 9:
                e4 e4Var = (e4) this.f13227c;
                return (e4Var.I1(true) ? 1 : 0) + (e4Var.I1(false) ? 1 : 0) + 1;
            default:
                return ((uq0) this.f13227c).f50262f.size() + 1;
        }
    }

    @Override
    public int f(int i10) {
        switch (this.f13225a) {
            case 10:
                if (i10 == 0) {
                    return 0;
                }
                return ((q4) ((uq0) this.f13227c).f50262f.get(i10 - 1)).E.hashCode();
            default:
                return i10;
        }
    }

    @Override
    public CharSequence g(int i10) {
        int i11;
        int i12 = this.f13225a;
        Object obj = this.f13226b;
        switch (i12) {
            case 1:
                if (i10 != 1) {
                    if (i10 != 2) {
                        return cd.L0(2131745726, null);
                    }
                    return cd.L0(2131745729, null);
                }
                return cd.L0(2131745755, null);
            case 2:
                ArrayList arrayList = (ArrayList) obj;
                if (((fn0) arrayList.get(i10)).f26109a == 0) {
                    return cd.L0(2131745840, null);
                }
                if (((fn0) arrayList.get(i10)).f26109a == 1) {
                    return cd.L0(2131752258, null);
                }
                if (((fn0) arrayList.get(i10)).f26109a == 4) {
                    return cd.L0(2131754178, null);
                }
                if (((fn0) arrayList.get(i10)).f26109a == 6) {
                    return cd.L0(2131745750, null);
                }
                if (((fn0) arrayList.get(i10)).f26109a == 2) {
                    return cd.L0(2131751344, null);
                }
                if (((fn0) arrayList.get(i10)).f26109a == 5) {
                    return cd.L0(2131746599, null);
                }
                zf.e0 e0Var = zf.g0.f55493j3[((fn0) arrayList.get(i10)).f26110b];
                String str = e0Var.f55477c;
                if (str != null) {
                    return str;
                }
                return cd.L0(e0Var.f55476b, null);
            case 6:
                ArrayList arrayList2 = (ArrayList) obj;
                if (((ib1) arrayList2.get(i10)).f38227a == 0) {
                    return cd.L0(2131745773, null);
                }
                if (((ib1) arrayList2.get(i10)).f38227a == 1) {
                    return cd.L0(2131751344, null);
                }
                zf.e0 e0Var2 = zf.g0.f55493j3[((ib1) arrayList2.get(i10)).f38228b];
                String str2 = e0Var2.f55477c;
                if (str2 != null) {
                    return str2;
                }
                return cd.L0(e0Var2.f55476b, null);
            case 8:
                if (i10 == 0) {
                    i11 = 2131743008;
                } else {
                    i11 = 2131743196;
                }
                return cd.L0(i11, null);
            case 10:
                if (i10 == 0) {
                    return cd.L0(2131746725, null);
                }
                String O0 = m31.O0(((q4) ((uq0) this.f13227c).f50262f.get(i10 - 1)).E, null, null);
                if (O0 == null) {
                    return null;
                }
                return O0.substring(0, 1).toUpperCase() + O0.substring(1);
            default:
                return super.g(i10);
        }
    }

    @Override
    public int h(int i10) {
        switch (this.f13225a) {
            case 0:
            case 1:
                return i10;
            case 2:
                ArrayList arrayList = (ArrayList) this.f13226b;
                if (((fn0) arrayList.get(i10)).f26109a == 0) {
                    return 1;
                }
                if (((fn0) arrayList.get(i10)).f26109a == 1) {
                    return 3;
                }
                if (((fn0) arrayList.get(i10)).f26109a == 4) {
                    return 4;
                }
                if (((fn0) arrayList.get(i10)).f26109a == 2) {
                    return 2;
                }
                if (((fn0) arrayList.get(i10)).f26109a == 5) {
                    return 5;
                }
                if (((fn0) arrayList.get(i10)).f26109a == 6) {
                    return 6;
                }
                return ((fn0) arrayList.get(i10)).f26109a + i10;
            case 3:
            case 5:
            case 7:
            default:
                return super.h(i10);
            case 4:
                if (i10 == 0) {
                    return 0;
                }
                return 1;
            case 6:
                ArrayList arrayList2 = (ArrayList) this.f13226b;
                if (((ib1) arrayList2.get(i10)).f38227a == 0) {
                    return 1;
                }
                if (((ib1) arrayList2.get(i10)).f38227a == 1) {
                    return 2;
                }
                return ((ib1) arrayList2.get(i10)).f38227a + i10;
            case 8:
                return i10;
            case 9:
                return (i10 - (((e4) this.f13227c).I1(false) ? 1 : 0)) + 1;
        }
    }

    public void l() {
        ArrayList arrayList = (ArrayList) this.f13226b;
        arrayList.clear();
        arrayList.add(new fn0(0));
        kx kxVar = (kx) this.f13227c;
        if (kxVar.V0 == 0) {
            if (kxVar.f26465s0) {
                arrayList.add(new fn0(5));
            }
            arrayList.add(new fn0(1));
            arrayList.add(new fn0(4));
            arrayList.add(new fn0(6));
            if (!kxVar.Q0) {
                fn0 fn0Var = new fn0(3);
                fn0Var.f26110b = 0;
                arrayList.add(fn0Var);
                xw xwVar = kxVar.f38966d1.F3;
                if (xwVar == null || !xwVar.c()) {
                    arrayList.add(new fn0(2));
                }
                fn0 fn0Var2 = new fn0(3);
                fn0Var2.f26110b = 1;
                arrayList.add(fn0Var2);
                fn0 fn0Var3 = new fn0(3);
                fn0Var3.f26110b = 2;
                arrayList.add(fn0Var3);
                fn0 fn0Var4 = new fn0(3);
                fn0Var4.f26110b = 3;
                arrayList.add(fn0Var4);
                fn0 fn0Var5 = new fn0(3);
                fn0Var5.f26110b = 4;
                arrayList.add(fn0Var5);
            }
        }
    }

    public s(w0 w0Var, v1 v1Var) {
        this.f13225a = 0;
        this.f13226b = w0Var;
        this.f13227c = v1Var;
    }

    public s(kx kxVar) {
        this.f13225a = 2;
        this.f13227c = kxVar;
        this.f13226b = new ArrayList();
        l();
    }

    public s(lb1 lb1Var) {
        this.f13225a = 6;
        this.f13227c = lb1Var;
        ArrayList arrayList = new ArrayList();
        this.f13226b = arrayList;
        arrayList.add(new ib1(0));
        ib1 ib1Var = new ib1(2);
        ib1Var.f38228b = 0;
        arrayList.add(ib1Var);
        ib1 ib1Var2 = new ib1(2);
        ib1Var2.f38228b = 1;
        arrayList.add(ib1Var2);
        ib1 ib1Var3 = new ib1(2);
        ib1Var3.f38228b = 2;
        arrayList.add(ib1Var3);
        ib1 ib1Var4 = new ib1(2);
        ib1Var4.f38228b = 3;
        arrayList.add(ib1Var4);
        ib1 ib1Var5 = new ib1(2);
        ib1Var5.f38228b = 4;
        arrayList.add(ib1Var5);
    }

    private final void i(View view, int i10, int i11) {
    }

    private final void j(View view, int i10, int i11) {
    }

    private final void k(View view, int i10, int i11) {
    }
}
