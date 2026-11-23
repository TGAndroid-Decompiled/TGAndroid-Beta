package di;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.a31;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.s31;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.b00;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.cn;
import org.telegram.ui.dn;
import org.telegram.ui.dt;
import org.telegram.ui.gh0;
import org.telegram.ui.i40;
import org.telegram.ui.jw;
import org.telegram.ui.mb1;
import org.telegram.ui.nj;
import org.telegram.ui.ny0;
import org.telegram.ui.ob1;
import org.telegram.ui.om;
import org.telegram.ui.oy0;
import org.telegram.ui.p91;
import org.telegram.ui.py0;
import org.telegram.ui.r91;
import org.telegram.ui.s91;
import org.telegram.ui.w91;
import org.telegram.ui.wv;
public final class i4 extends c71 {
    public final int f8997a;
    public final Object f8998b;
    public final Object f8999c;

    public i4(int i7, Context context, Object obj) {
        this.f8997a = i7;
        this.f8999c = obj;
        this.f8998b = context;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        n4 n4Var;
        fi.a6 a6Var;
        org.telegram.ui.ActionBar.g2 g2Var;
        int i11 = this.f8997a;
        Object obj = this.f8999c;
        switch (i11) {
            case 0:
                f6 f6Var = (f6) obj;
                if (i10 == 0) {
                    f6.j1(f6Var, false);
                    bi.b3 b3Var = f6Var.Y1;
                    if (b3Var != null) {
                        n4Var = b3Var.U1;
                    } else {
                        return;
                    }
                } else if (i10 == 2) {
                    f6.j1(f6Var, true);
                    bi.b3 b3Var2 = f6Var.Z1;
                    if (b3Var2 != null) {
                        n4Var = b3Var2.U1;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                org.telegram.messenger.g0.E2(n4Var);
                frameLayout.addView(n4Var);
                return;
            case 1:
                eq0 eq0Var = (eq0) obj;
                gi.m mVar = (gi.m) view;
                if (i7 == 0) {
                    a6Var = eq0Var.f13662e;
                } else {
                    a6Var = (fi.a6) eq0Var.f13663f.get(i7 - 1);
                }
                a6Var.H(null);
                mVar.setList(a6Var);
                mVar.setVisibleHeight(eq0Var.f13667w);
                return;
            case 2:
                if (view instanceof dn) {
                    ((dn) view).f47191a.rd(((bn) obj).J3);
                }
                WeakHashMap weakHashMap = r0.i0.f56367a;
                r0.y.c(view);
                return;
            case 3:
                jw jwVar = (jw) obj;
                jwVar.N(view, i7, jwVar.N0, true);
                return;
            case 4:
                return;
            case 5:
                ((oy0) view).a(i10);
                return;
            case 6:
                return;
            case 7:
                s91 s91Var = (s91) obj;
                s91Var.K(view, i7, s91Var.f52010e0, true);
                return;
            case 8:
                ob1 ob1Var = (ob1) obj;
                SparseArray sparseArray = ob1Var.f50632a;
                mb1 mb1Var = (mb1) sparseArray.get(i7);
                if (mb1Var != null) {
                    g2Var = mb1Var.f50028a;
                } else {
                    org.telegram.ui.ActionBar.g2 a02 = ob1Var.a0(i7);
                    mb1 mb1Var2 = new mb1(a02);
                    sparseArray.put(i7, mb1Var2);
                    g2Var = a02;
                    mb1Var = mb1Var2;
                }
                if (!mb1Var.f50029b) {
                    g2Var.onFragmentCreate();
                    mb1Var.f50029b = true;
                }
                g2Var.setParentLayout(ob1Var.getParentLayout());
                g2Var.setSimpleMenuOverlayHost(ob1Var);
                if (g2Var.getFragmentView() == null) {
                    g2Var.performCreateView((Context) this.f8998b);
                    g2Var.setTitleOverlayText(ob1Var.f50637n, ob1Var.f50638r, ob1Var.f50639s);
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                View fragmentView = g2Var.getFragmentView();
                org.telegram.messenger.g0.E2(fragmentView);
                if (!g2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, fragmentView, null);
                }
                frameLayout2.addView(fragmentView, c8.na.c(-1.0f, -1));
                if (g2Var.getActionBar() != null && g2Var.getActionBar().L) {
                    org.telegram.messenger.g0.E2(g2Var.getActionBar());
                    frameLayout2.addView(g2Var.getActionBar());
                }
                WeakHashMap weakHashMap2 = r0.i0.f56367a;
                r0.y.c(frameLayout2);
                ob1Var.checkSystemBarColors();
                ob1Var.Z();
                return;
            case 9:
                org.telegram.ui.Wallet.o6.d1((g51) view, false);
                return;
            default:
                return;
        }
    }

    @Override
    public final View d(int i7) {
        n4 n4Var;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.i6 i6Var;
        int i13;
        ri.q qVar;
        switch (this.f8997a) {
            case 0:
                f6 f6Var = (f6) this.f8999c;
                if (i7 == 0) {
                    f6.j1(f6Var, false);
                    bi.b3 b3Var = f6Var.Y1;
                    if (b3Var != null) {
                        n4Var = b3Var.U1;
                        org.telegram.messenger.g0.E2(n4Var);
                        FrameLayout frameLayout = new FrameLayout((Context) this.f8998b);
                        frameLayout.addView(n4Var, c8.na.e(-1, -1, 119));
                        return frameLayout;
                    }
                    return null;
                }
                if (i7 == 1) {
                    n4Var = f6Var.U1;
                } else {
                    if (i7 == 2) {
                        f6.j1(f6Var, true);
                        bi.b3 b3Var2 = f6Var.Z1;
                        if (b3Var2 != null) {
                            n4Var = b3Var2.U1;
                        }
                    }
                    return null;
                }
                org.telegram.messenger.g0.E2(n4Var);
                FrameLayout frameLayout2 = new FrameLayout((Context) this.f8998b);
                frameLayout2.addView(n4Var, c8.na.e(-1, -1, 119));
                return frameLayout2;
            case 1:
                return new gi.m((eq0) this.f8999c, (Context) this.f8998b);
            case 2:
                Context context = (Context) this.f8998b;
                bn bnVar = (bn) this.f8999c;
                if (i7 == 0) {
                    return new om(bnVar, context);
                }
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 7);
                bundle.putInt("searchType", i7);
                bundle.putString("searchHashtag", bnVar.J3);
                nj njVar = new nj(context, bnVar.getParentLayout(), bundle, 0);
                njVar.h = false;
                cn cnVar = njVar.f47191a;
                cnVar.N.f59137a = bnVar.N;
                cnVar.f46453za = bnVar.Ba;
                cnVar.Aa = bnVar;
                cnVar.f46298n9 = new org.telegram.ui.f(this, 12);
                return njVar;
            case 3:
                jw jwVar = (jw) this.f8999c;
                bx bxVar = jwVar.M0;
                if (i7 == 1) {
                    return jwVar.f40080a0;
                }
                if (i7 == 3) {
                    return jwVar.f40089i0;
                }
                if (i7 == 4) {
                    return jwVar.f40093n0;
                }
                if (i7 == 5) {
                    return jwVar.f40100u0;
                }
                if (i7 == 2) {
                    sl0 sl0Var = new sl0(jwVar.K0, bxVar);
                    jwVar.J0 = sl0Var;
                    sl0Var.b(jwVar.X0, jwVar.Y0, false);
                    jwVar.J0.f39639b.setClipToPadding(false);
                    jwVar.J0.f39639b.j(new rm0(this, 0));
                    jwVar.J0.f39639b.D0(new eb0(jwVar, 22));
                    jwVar.J0.setUiCallback(jwVar);
                    return jwVar.J0;
                } else if (i7 == 6) {
                    return jwVar.f40098s0;
                } else {
                    b00 b00Var = new b00(bxVar);
                    b00Var.setChatPreviewDelegate(jwVar.S0);
                    b00Var.setUiCallback(jwVar);
                    b00Var.j(jwVar.X0, jwVar.Y0, false);
                    dh.c cVar = jwVar.f40081a1;
                    if (cVar != null) {
                        b00Var.setBlurredBackgroundDrawableFactory(cVar);
                    }
                    dt dtVar = b00Var.f45845b;
                    dtVar.setClipToPadding(false);
                    dtVar.j(new rm0(this, 1));
                    dtVar.D0(new eb0(jwVar, 22));
                    return b00Var;
                }
            case 4:
                FrameLayout frameLayout3 = new FrameLayout((Context) this.f8998b);
                frameLayout3.setOnClickListener(new i40(this, 24));
                return frameLayout3;
            case 5:
                return new oy0((py0) this.f8999c, (Context) this.f8998b);
            case 6:
                FrameLayout frameLayout4 = new FrameLayout((Context) this.f8998b);
                frameLayout4.setOnClickListener(new ny0(this, 9));
                return frameLayout4;
            case 7:
                s91 s91Var = (s91) this.f8999c;
                w91 w91Var = s91Var.f52027w0;
                if (i7 == 1) {
                    return s91Var.W;
                }
                if (i7 == 2) {
                    i10 = ((org.telegram.ui.ActionBar.g2) w91Var).currentAccount;
                    sl0 sl0Var2 = new sl0(i10, w91Var);
                    sl0Var2.f39639b.j(new r91(0));
                    sl0Var2.setUiCallback(s91Var);
                    return sl0Var2;
                }
                b00 b00Var2 = new b00(w91Var);
                b00Var2.setChatPreviewDelegate(s91Var.f52025u0);
                b00Var2.setUiCallback(s91Var);
                b00Var2.f45845b.j(new r91(1));
                return b00Var2;
            case 8:
                return new gh0((Context) this.f8998b, 15);
            case 9:
                org.telegram.ui.Wallet.o6 o6Var = (org.telegram.ui.Wallet.o6) this.f8999c;
                g51[] g51VarArr = o6Var.f44817u0;
                g51 g51Var = g51VarArr[i7];
                if (g51Var == null) {
                    Context context2 = (Context) this.f8998b;
                    i11 = ((org.telegram.ui.ActionBar.g2) o6Var).currentAccount;
                    i12 = ((org.telegram.ui.ActionBar.g2) o6Var).classGuid;
                    org.telegram.ui.Components.t tVar = new org.telegram.ui.Components.t(this, i7, 1);
                    org.telegram.ui.Wallet.p4 p4Var = new org.telegram.ui.Wallet.p4(o6Var);
                    org.telegram.ui.Wallet.p4 p4Var2 = new org.telegram.ui.Wallet.p4(o6Var);
                    i6Var = ((org.telegram.ui.ActionBar.g2) o6Var).resourceProvider;
                    if (i7 == 1) {
                        i13 = 3;
                    } else {
                        i13 = -1;
                    }
                    bi.l7 l7Var = new bi.l7(context2, i11, i12, false, tVar, p4Var, p4Var2, i6Var, i13, 1);
                    g51VarArr[i7] = l7Var;
                    o6Var.e1(i7);
                    qVar = ((org.telegram.ui.ActionBar.g2) o6Var).glassEngine;
                    qVar.b(l7Var);
                    l7Var.setFocusableInTouchMode(false);
                    l7Var.setClipChildren(false);
                    l7Var.setClipToPadding(false);
                    if (i7 == 0) {
                        l7Var.r1();
                    } else {
                        l7Var.setSelectorType(9);
                        l7Var.setSelectorDrawableColor(0);
                    }
                    l7Var.f35323g3.f33631r = false;
                    l7Var.j(new s31(this, i7));
                    g51VarArr[i7] = l7Var;
                    return l7Var;
                }
                return g51Var;
            default:
                if (i7 == 0) {
                    return ((wg.z) this.f8998b).f30226b;
                }
                return ((wg.v0) this.f8999c).f30226b;
        }
    }

    @Override
    public final int e() {
        switch (this.f8997a) {
            case 0:
                f6 f6Var = (f6) this.f8999c;
                return (f6Var.N1(true) ? 1 : 0) + (f6Var.N1(false) ? 1 : 0) + 1;
            case 1:
                return ((eq0) this.f8999c).f13663f.size() + 1;
            case 2:
                return 3;
            case 3:
                return ((ArrayList) this.f8998b).size();
            case 4:
                return 2;
            case 5:
                return 5;
            case 6:
                return 2;
            case 7:
                return ((ArrayList) this.f8998b).size();
            case 8:
                ((ob1) this.f8999c).getClass();
                return 4;
            case 9:
                if (((org.telegram.ui.Wallet.o6) this.f8999c).f44801g0) {
                    return 2;
                }
                return 1;
            default:
                return 2;
        }
    }

    @Override
    public int f(int i7) {
        switch (this.f8997a) {
            case 1:
                if (i7 == 0) {
                    return 0;
                }
                return ((fi.a6) ((eq0) this.f8999c).f13663f.get(i7 - 1)).E.hashCode();
            default:
                return i7;
        }
    }

    @Override
    public CharSequence g(int i7) {
        int i10;
        int i11 = this.f8997a;
        Object obj = this.f8998b;
        switch (i11) {
            case 1:
                if (i7 == 0) {
                    return gd.N0(2131746514, null);
                }
                return a31.Q0(((fi.a6) ((eq0) this.f8999c).f13663f.get(i7 - 1)).E);
            case 2:
                if (i7 != 1) {
                    if (i7 != 2) {
                        return gd.N0(2131745513, null);
                    }
                    return gd.N0(2131745516, null);
                }
                return gd.N0(2131745542, null);
            case 3:
                ArrayList arrayList = (ArrayList) obj;
                if (((sm0) arrayList.get(i7)).f39652a == 0) {
                    return gd.N0(2131745627, null);
                }
                if (((sm0) arrayList.get(i7)).f39652a == 1) {
                    return gd.N0(2131752246, null);
                }
                if (((sm0) arrayList.get(i7)).f39652a == 4) {
                    return gd.N0(2131754175, null);
                }
                if (((sm0) arrayList.get(i7)).f39652a == 6) {
                    return gd.N0(2131745537, null);
                }
                if (((sm0) arrayList.get(i7)).f39652a == 2) {
                    return gd.N0(2131751331, null);
                }
                if (((sm0) arrayList.get(i7)).f39652a == 5) {
                    return gd.N0(2131746388, null);
                }
                jg.o0 o0Var = jg.q0.f17716k3[((sm0) arrayList.get(i7)).f39653b];
                String str = o0Var.f17700c;
                if (str != null) {
                    return str;
                }
                return gd.N0(o0Var.f17699b, null);
            case 4:
            case 5:
            case 6:
            case 8:
            default:
                return super.g(i7);
            case 7:
                ArrayList arrayList2 = (ArrayList) obj;
                if (((p91) arrayList2.get(i7)).f50914a == 0) {
                    return gd.N0(2131745560, null);
                }
                if (((p91) arrayList2.get(i7)).f50914a == 1) {
                    return gd.N0(2131751331, null);
                }
                jg.o0 o0Var2 = jg.q0.f17716k3[((p91) arrayList2.get(i7)).f50915b];
                String str2 = o0Var2.f17700c;
                if (str2 != null) {
                    return str2;
                }
                return gd.N0(o0Var2.f17699b, null);
            case 9:
                if (i7 == 0) {
                    i10 = 2131742711;
                } else {
                    i10 = 2131742919;
                }
                return gd.N0(i10, null);
        }
    }

    @Override
    public int h(int i7) {
        switch (this.f8997a) {
            case 0:
                return (i7 - (((f6) this.f8999c).N1(false) ? 1 : 0)) + 1;
            case 1:
            case 4:
            case 6:
            case 8:
            default:
                return super.h(i7);
            case 2:
                return i7;
            case 3:
                ArrayList arrayList = (ArrayList) this.f8998b;
                if (((sm0) arrayList.get(i7)).f39652a == 0) {
                    return 1;
                }
                if (((sm0) arrayList.get(i7)).f39652a == 1) {
                    return 3;
                }
                if (((sm0) arrayList.get(i7)).f39652a == 4) {
                    return 4;
                }
                if (((sm0) arrayList.get(i7)).f39652a == 2) {
                    return 2;
                }
                if (((sm0) arrayList.get(i7)).f39652a == 5) {
                    return 5;
                }
                if (((sm0) arrayList.get(i7)).f39652a == 6) {
                    return 6;
                }
                return ((sm0) arrayList.get(i7)).f39652a + i7;
            case 5:
                if (i7 == 0) {
                    return 0;
                }
                return 1;
            case 7:
                ArrayList arrayList2 = (ArrayList) this.f8998b;
                if (((p91) arrayList2.get(i7)).f50914a == 0) {
                    return 1;
                }
                if (((p91) arrayList2.get(i7)).f50914a == 1) {
                    return 2;
                }
                return ((p91) arrayList2.get(i7)).f50914a + i7;
            case 9:
            case 10:
                return i7;
        }
    }

    public void l() {
        ArrayList arrayList = (ArrayList) this.f8998b;
        arrayList.clear();
        arrayList.add(new sm0(0));
        jw jwVar = (jw) this.f8999c;
        if (jwVar.W0 == 0) {
            if (jwVar.f40099t0) {
                arrayList.add(new sm0(5));
            }
            arrayList.add(new sm0(1));
            arrayList.add(new sm0(4));
            arrayList.add(new sm0(6));
            if (!jwVar.R0) {
                sm0 sm0Var = new sm0(3);
                sm0Var.f39653b = 0;
                arrayList.add(sm0Var);
                wv wvVar = jwVar.f49216e1.H3;
                if (wvVar == null || !wvVar.c()) {
                    arrayList.add(new sm0(2));
                }
                sm0 sm0Var2 = new sm0(3);
                sm0Var2.f39653b = 1;
                arrayList.add(sm0Var2);
                sm0 sm0Var3 = new sm0(3);
                sm0Var3.f39653b = 2;
                arrayList.add(sm0Var3);
                sm0 sm0Var4 = new sm0(3);
                sm0Var4.f39653b = 3;
                arrayList.add(sm0Var4);
                sm0 sm0Var5 = new sm0(3);
                sm0Var5.f39653b = 4;
                arrayList.add(sm0Var5);
            }
        }
    }

    public i4(jw jwVar) {
        this.f8997a = 3;
        this.f8999c = jwVar;
        this.f8998b = new ArrayList();
        l();
    }

    public i4(s91 s91Var) {
        this.f8997a = 7;
        this.f8999c = s91Var;
        ArrayList arrayList = new ArrayList();
        this.f8998b = arrayList;
        arrayList.add(new p91(0));
        p91 p91Var = new p91(2);
        p91Var.f50915b = 0;
        arrayList.add(p91Var);
        p91 p91Var2 = new p91(2);
        p91Var2.f50915b = 1;
        arrayList.add(p91Var2);
        p91 p91Var3 = new p91(2);
        p91Var3.f50915b = 2;
        arrayList.add(p91Var3);
        p91 p91Var4 = new p91(2);
        p91Var4.f50915b = 3;
        arrayList.add(p91Var4);
        p91 p91Var5 = new p91(2);
        p91Var5.f50915b = 4;
        arrayList.add(p91Var5);
    }

    public i4(wg.z zVar, wg.v0 v0Var) {
        this.f8997a = 10;
        this.f8998b = zVar;
        this.f8999c = v0Var;
    }

    private final void i(View view, int i7, int i10) {
    }

    private final void j(View view, int i7, int i10) {
    }

    private final void k(View view, int i7, int i10) {
    }
}
