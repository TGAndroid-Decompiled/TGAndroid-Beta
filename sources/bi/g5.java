package bi;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.ui.Components.b31;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.dm0;
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.k21;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.an;
import org.telegram.ui.bn;
import org.telegram.ui.cn;
import org.telegram.ui.fw;
import org.telegram.ui.g40;
import org.telegram.ui.kx;
import org.telegram.ui.mb1;
import org.telegram.ui.mj;
import org.telegram.ui.my0;
import org.telegram.ui.nm;
import org.telegram.ui.ny0;
import org.telegram.ui.ob1;
import org.telegram.ui.oy0;
import org.telegram.ui.p91;
import org.telegram.ui.r91;
import org.telegram.ui.s91;
import org.telegram.ui.sq0;
import org.telegram.ui.sv;
import org.telegram.ui.w91;
import org.telegram.ui.ww;
import org.telegram.ui.yz;
import org.telegram.ui.zs;
public final class g5 extends m61 {
    public final int f3939a;
    public final Object f3940b;
    public final Object f3941c;

    public g5(int i7, Context context, Object obj) {
        this.f3939a = i7;
        this.f3941c = obj;
        this.f3940b = context;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        m5 m5Var;
        di.j6 j6Var;
        org.telegram.ui.ActionBar.f2 f2Var;
        int i11 = this.f3939a;
        Object obj = this.f3941c;
        switch (i11) {
            case 0:
                k7 k7Var = (k7) obj;
                if (i10 == 0) {
                    k7.i1(k7Var, false);
                    i5 i5Var = k7Var.U1;
                    if (i5Var != null) {
                        m5Var = i5Var.Q1;
                    } else {
                        return;
                    }
                } else if (i10 == 2) {
                    k7.i1(k7Var, true);
                    i5 i5Var2 = k7Var.V1;
                    if (i5Var2 != null) {
                        m5Var = i5Var2.Q1;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                org.telegram.messenger.g0.E2(m5Var);
                frameLayout.addView(m5Var);
                return;
            case 1:
                sp0 sp0Var = (sp0) obj;
                ei.n nVar = (ei.n) view;
                if (i7 == 0) {
                    j6Var = sp0Var.f10847e;
                } else {
                    j6Var = (di.j6) sp0Var.f10848f.get(i7 - 1);
                }
                j6Var.H(null);
                nVar.setList(j6Var);
                nVar.setVisibleHeight(sp0Var.f10852w);
                return;
            case 2:
                if (view instanceof cn) {
                    ((cn) view).f44862a.nd(((an) obj).I3);
                }
                WeakHashMap weakHashMap = r0.i0.f54190a;
                r0.y.c(view);
                return;
            case 3:
                fw fwVar = (fw) obj;
                fwVar.P(view, i7, fwVar.M0, true);
                return;
            case 4:
                return;
            case 5:
                ((ny0) view).a(i10);
                return;
            case 6:
                return;
            case 7:
                s91 s91Var = (s91) obj;
                s91Var.M(view, i7, s91Var.f49685d0, true);
                return;
            case 8:
                ob1 ob1Var = (ob1) obj;
                SparseArray sparseArray = ob1Var.f48361a;
                mb1 mb1Var = (mb1) sparseArray.get(i7);
                if (mb1Var != null) {
                    f2Var = mb1Var.f47776a;
                } else {
                    org.telegram.ui.ActionBar.f2 a02 = ob1Var.a0(i7);
                    mb1 mb1Var2 = new mb1(a02);
                    sparseArray.put(i7, mb1Var2);
                    f2Var = a02;
                    mb1Var = mb1Var2;
                }
                if (!mb1Var.f47777b) {
                    f2Var.onFragmentCreate();
                    mb1Var.f47777b = true;
                }
                f2Var.setParentLayout(ob1Var.getParentLayout());
                f2Var.setSimpleMenuOverlayHost(ob1Var);
                if (f2Var.getFragmentView() == null) {
                    f2Var.performCreateView((Context) this.f3940b);
                    f2Var.setTitleOverlayText(ob1Var.f48366n, ob1Var.f48367r, ob1Var.f48368s);
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                View fragmentView = f2Var.getFragmentView();
                org.telegram.messenger.g0.E2(fragmentView);
                if (!f2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, fragmentView, null);
                }
                frameLayout2.addView(fragmentView, c8.ha.c(-1.0f, -1));
                if (f2Var.getActionBar() != null && f2Var.getActionBar().K) {
                    org.telegram.messenger.g0.E2(f2Var.getActionBar());
                    frameLayout2.addView(f2Var.getActionBar());
                }
                WeakHashMap weakHashMap2 = r0.i0.f54190a;
                r0.y.c(frameLayout2);
                ob1Var.checkSystemBarColors();
                ob1Var.Z();
                return;
            case 9:
                org.telegram.ui.Wallet.x5.Y0((q41) view, false);
                return;
            default:
                return;
        }
    }

    @Override
    public final View d(int i7) {
        m5 m5Var;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i13;
        switch (this.f3939a) {
            case 0:
                k7 k7Var = (k7) this.f3941c;
                if (i7 == 0) {
                    k7.i1(k7Var, false);
                    i5 i5Var = k7Var.U1;
                    if (i5Var != null) {
                        m5Var = i5Var.Q1;
                        org.telegram.messenger.g0.E2(m5Var);
                        FrameLayout frameLayout = new FrameLayout((Context) this.f3940b);
                        frameLayout.addView(m5Var, c8.ha.e(-1, -1, 119));
                        return frameLayout;
                    }
                    return null;
                }
                if (i7 == 1) {
                    m5Var = k7Var.Q1;
                } else {
                    if (i7 == 2) {
                        k7.i1(k7Var, true);
                        i5 i5Var2 = k7Var.V1;
                        if (i5Var2 != null) {
                            m5Var = i5Var2.Q1;
                        }
                    }
                    return null;
                }
                org.telegram.messenger.g0.E2(m5Var);
                FrameLayout frameLayout2 = new FrameLayout((Context) this.f3940b);
                frameLayout2.addView(m5Var, c8.ha.e(-1, -1, 119));
                return frameLayout2;
            case 1:
                return new ei.n((sp0) this.f3941c, (Context) this.f3940b);
            case 2:
                Context context = (Context) this.f3940b;
                an anVar = (an) this.f3941c;
                if (i7 == 0) {
                    return new nm(anVar, context);
                }
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 7);
                bundle.putInt("searchType", i7);
                bundle.putString("searchHashtag", anVar.I3);
                mj mjVar = new mj(context, anVar.getParentLayout(), bundle, 0);
                mjVar.h = false;
                bn bnVar = mjVar.f44862a;
                bnVar.M.f54577a = anVar.M;
                bnVar.f44001va = anVar.f44028xa;
                bnVar.f44015wa = anVar;
                bnVar.f43851j9 = new org.telegram.ui.f(this, 12);
                return mjVar;
            case 3:
                fw fwVar = (fw) this.f3941c;
                ww wwVar = fwVar.L0;
                if (i7 == 1) {
                    return fwVar.W;
                }
                if (i7 == 3) {
                    return fwVar.f33602h0;
                }
                if (i7 == 4) {
                    return fwVar.m0;
                }
                if (i7 == 5) {
                    return fwVar.f33613t0;
                }
                if (i7 == 2) {
                    dl0 dl0Var = new dl0(fwVar.J0, wwVar);
                    fwVar.I0 = dl0Var;
                    dl0Var.b(fwVar.W0, fwVar.X0, false);
                    fwVar.I0.f33036b.setClipToPadding(false);
                    fwVar.I0.f33036b.j(new dm0(this, 0));
                    fwVar.I0.f33036b.D0(new ob0(fwVar, 19));
                    fwVar.I0.setUiCallback(fwVar);
                    return fwVar.I0;
                } else if (i7 == 6) {
                    return fwVar.f33611r0;
                } else {
                    yz yzVar = new yz(wwVar);
                    yzVar.setChatPreviewDelegate(fwVar.R0);
                    yzVar.setUiCallback(fwVar);
                    yzVar.j(fwVar.W0, fwVar.X0, false);
                    dh.c cVar = fwVar.Z0;
                    if (cVar != null) {
                        yzVar.setBlurredBackgroundDrawableFactory(cVar);
                    }
                    zs zsVar = yzVar.f52360b;
                    zsVar.setClipToPadding(false);
                    zsVar.j(new dm0(this, 1));
                    zsVar.D0(new ob0(fwVar, 19));
                    return yzVar;
                }
            case 4:
                FrameLayout frameLayout3 = new FrameLayout((Context) this.f3940b);
                frameLayout3.setOnClickListener(new g40(this, 24));
                return frameLayout3;
            case 5:
                return new ny0((oy0) this.f3941c, (Context) this.f3940b);
            case 6:
                FrameLayout frameLayout4 = new FrameLayout((Context) this.f3940b);
                frameLayout4.setOnClickListener(new my0(this, 9));
                return frameLayout4;
            case 7:
                s91 s91Var = (s91) this.f3941c;
                w91 w91Var = s91Var.f49702v0;
                if (i7 == 1) {
                    return s91Var.V;
                }
                if (i7 == 2) {
                    i10 = ((org.telegram.ui.ActionBar.f2) w91Var).currentAccount;
                    dl0 dl0Var2 = new dl0(i10, w91Var);
                    dl0Var2.f33036b.j(new r91(0));
                    dl0Var2.setUiCallback(s91Var);
                    return dl0Var2;
                }
                yz yzVar2 = new yz(w91Var);
                yzVar2.setChatPreviewDelegate(s91Var.f49700t0);
                yzVar2.setUiCallback(s91Var);
                yzVar2.f52360b.j(new r91(1));
                return yzVar2;
            case 8:
                return new sq0((Context) this.f3940b, 13);
            case 9:
                org.telegram.ui.Wallet.x5 x5Var = (org.telegram.ui.Wallet.x5) this.f3941c;
                q41[] q41VarArr = x5Var.f43351r0;
                q41 q41Var = q41VarArr[i7];
                if (q41Var == null) {
                    Context context2 = (Context) this.f3940b;
                    i11 = ((org.telegram.ui.ActionBar.f2) x5Var).currentAccount;
                    i12 = ((org.telegram.ui.ActionBar.f2) x5Var).classGuid;
                    org.telegram.ui.Components.q qVar = new org.telegram.ui.Components.q(this, i7, 2);
                    org.telegram.ui.Wallet.h4 h4Var = new org.telegram.ui.Wallet.h4(x5Var);
                    org.telegram.ui.Wallet.h4 h4Var2 = new org.telegram.ui.Wallet.h4(x5Var);
                    f6Var = ((org.telegram.ui.ActionBar.f2) x5Var).resourceProvider;
                    if (i7 == 1) {
                        i13 = 3;
                    } else {
                        i13 = -1;
                    }
                    kx kxVar = new kx(context2, i11, i12, false, qVar, h4Var, h4Var2, f6Var, i13, 1);
                    if (i7 == 1) {
                        kxVar.setPadding(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(12.0f));
                    }
                    kxVar.setFocusableInTouchMode(false);
                    kxVar.setClipChildren(false);
                    kxVar.setClipToPadding(false);
                    if (i7 == 0) {
                        kxVar.r1();
                    } else {
                        kxVar.setSelectorType(9);
                        kxVar.setSelectorDrawableColor(0);
                    }
                    kxVar.f37190f3.f35528r = false;
                    kxVar.j(new b31(this, i7));
                    q41VarArr[i7] = kxVar;
                    return kxVar;
                }
                return q41Var;
            default:
                if (i7 == 0) {
                    return ((wg.a0) this.f3940b).f28619b;
                }
                return ((wg.w0) this.f3941c).f28619b;
        }
    }

    @Override
    public final int e() {
        switch (this.f3939a) {
            case 0:
                k7 k7Var = (k7) this.f3941c;
                return (k7Var.I1(true) ? 1 : 0) + (k7Var.I1(false) ? 1 : 0) + 1;
            case 1:
                return ((sp0) this.f3941c).f10848f.size() + 1;
            case 2:
                return 3;
            case 3:
                return ((ArrayList) this.f3940b).size();
            case 4:
                return 2;
            case 5:
                return 5;
            case 6:
                return 2;
            case 7:
                return ((ArrayList) this.f3940b).size();
            case 8:
                ((ob1) this.f3941c).getClass();
                return 4;
            case 9:
                if (((org.telegram.ui.Wallet.x5) this.f3941c).f43338f0) {
                    return 2;
                }
                return 1;
            default:
                return 2;
        }
    }

    @Override
    public int f(int i7) {
        switch (this.f3939a) {
            case 1:
                if (i7 == 0) {
                    return 0;
                }
                return ((di.j6) ((sp0) this.f3941c).f10848f.get(i7 - 1)).E.hashCode();
            default:
                return i7;
        }
    }

    @Override
    public CharSequence g(int i7) {
        int i10;
        int i11 = this.f3939a;
        Object obj = this.f3940b;
        switch (i11) {
            case 1:
                if (i7 == 0) {
                    return org.telegram.messenger.id.M0(2131746711, null);
                }
                String O0 = k21.O0(((di.j6) ((sp0) this.f3941c).f10848f.get(i7 - 1)).E, null, null);
                if (O0 == null) {
                    return null;
                }
                return O0.substring(0, 1).toUpperCase() + O0.substring(1);
            case 2:
                if (i7 != 1) {
                    if (i7 != 2) {
                        return org.telegram.messenger.id.M0(2131745712, null);
                    }
                    return org.telegram.messenger.id.M0(2131745715, null);
                }
                return org.telegram.messenger.id.M0(2131745741, null);
            case 3:
                ArrayList arrayList = (ArrayList) obj;
                if (((em0) arrayList.get(i7)).f33332a == 0) {
                    return org.telegram.messenger.id.M0(2131745826, null);
                }
                if (((em0) arrayList.get(i7)).f33332a == 1) {
                    return org.telegram.messenger.id.M0(2131752258, null);
                }
                if (((em0) arrayList.get(i7)).f33332a == 4) {
                    return org.telegram.messenger.id.M0(2131754178, null);
                }
                if (((em0) arrayList.get(i7)).f33332a == 6) {
                    return org.telegram.messenger.id.M0(2131745736, null);
                }
                if (((em0) arrayList.get(i7)).f33332a == 2) {
                    return org.telegram.messenger.id.M0(2131751344, null);
                }
                if (((em0) arrayList.get(i7)).f33332a == 5) {
                    return org.telegram.messenger.id.M0(2131746585, null);
                }
                jg.o0 o0Var = jg.q0.j3[((em0) arrayList.get(i7)).f33333b];
                String str = o0Var.f16872c;
                if (str != null) {
                    return str;
                }
                return org.telegram.messenger.id.M0(o0Var.f16871b, null);
            case 4:
            case 5:
            case 6:
            case 8:
            default:
                return super.g(i7);
            case 7:
                ArrayList arrayList2 = (ArrayList) obj;
                if (((p91) arrayList2.get(i7)).f48719a == 0) {
                    return org.telegram.messenger.id.M0(2131745759, null);
                }
                if (((p91) arrayList2.get(i7)).f48719a == 1) {
                    return org.telegram.messenger.id.M0(2131751344, null);
                }
                jg.o0 o0Var2 = jg.q0.j3[((p91) arrayList2.get(i7)).f48720b];
                String str2 = o0Var2.f16872c;
                if (str2 != null) {
                    return str2;
                }
                return org.telegram.messenger.id.M0(o0Var2.f16871b, null);
            case 9:
                if (i7 == 0) {
                    i10 = 2131742985;
                } else {
                    i10 = 2131743173;
                }
                return org.telegram.messenger.id.M0(i10, null);
        }
    }

    @Override
    public int h(int i7) {
        switch (this.f3939a) {
            case 0:
                return (i7 - (((k7) this.f3941c).I1(false) ? 1 : 0)) + 1;
            case 1:
            case 4:
            case 6:
            case 8:
            default:
                return super.h(i7);
            case 2:
                return i7;
            case 3:
                ArrayList arrayList = (ArrayList) this.f3940b;
                if (((em0) arrayList.get(i7)).f33332a == 0) {
                    return 1;
                }
                if (((em0) arrayList.get(i7)).f33332a == 1) {
                    return 3;
                }
                if (((em0) arrayList.get(i7)).f33332a == 4) {
                    return 4;
                }
                if (((em0) arrayList.get(i7)).f33332a == 2) {
                    return 2;
                }
                if (((em0) arrayList.get(i7)).f33332a == 5) {
                    return 5;
                }
                if (((em0) arrayList.get(i7)).f33332a == 6) {
                    return 6;
                }
                return ((em0) arrayList.get(i7)).f33332a + i7;
            case 5:
                if (i7 == 0) {
                    return 0;
                }
                return 1;
            case 7:
                ArrayList arrayList2 = (ArrayList) this.f3940b;
                if (((p91) arrayList2.get(i7)).f48719a == 0) {
                    return 1;
                }
                if (((p91) arrayList2.get(i7)).f48719a == 1) {
                    return 2;
                }
                return ((p91) arrayList2.get(i7)).f48719a + i7;
            case 9:
            case 10:
                return i7;
        }
    }

    public void l() {
        ArrayList arrayList = (ArrayList) this.f3940b;
        arrayList.clear();
        arrayList.add(new em0(0));
        fw fwVar = (fw) this.f3941c;
        if (fwVar.V0 == 0) {
            if (fwVar.f33612s0) {
                arrayList.add(new em0(5));
            }
            arrayList.add(new em0(1));
            arrayList.add(new em0(4));
            arrayList.add(new em0(6));
            if (!fwVar.Q0) {
                em0 em0Var = new em0(3);
                em0Var.f33333b = 0;
                arrayList.add(em0Var);
                sv svVar = fwVar.f45715d1.F3;
                if (svVar == null || !svVar.c()) {
                    arrayList.add(new em0(2));
                }
                em0 em0Var2 = new em0(3);
                em0Var2.f33333b = 1;
                arrayList.add(em0Var2);
                em0 em0Var3 = new em0(3);
                em0Var3.f33333b = 2;
                arrayList.add(em0Var3);
                em0 em0Var4 = new em0(3);
                em0Var4.f33333b = 3;
                arrayList.add(em0Var4);
                em0 em0Var5 = new em0(3);
                em0Var5.f33333b = 4;
                arrayList.add(em0Var5);
            }
        }
    }

    public g5(fw fwVar) {
        this.f3939a = 3;
        this.f3941c = fwVar;
        this.f3940b = new ArrayList();
        l();
    }

    public g5(s91 s91Var) {
        this.f3939a = 7;
        this.f3941c = s91Var;
        ArrayList arrayList = new ArrayList();
        this.f3940b = arrayList;
        arrayList.add(new p91(0));
        p91 p91Var = new p91(2);
        p91Var.f48720b = 0;
        arrayList.add(p91Var);
        p91 p91Var2 = new p91(2);
        p91Var2.f48720b = 1;
        arrayList.add(p91Var2);
        p91 p91Var3 = new p91(2);
        p91Var3.f48720b = 2;
        arrayList.add(p91Var3);
        p91 p91Var4 = new p91(2);
        p91Var4.f48720b = 3;
        arrayList.add(p91Var4);
        p91 p91Var5 = new p91(2);
        p91Var5.f48720b = 4;
        arrayList.add(p91Var5);
    }

    public g5(wg.a0 a0Var, wg.w0 w0Var) {
        this.f3939a = 10;
        this.f3940b = a0Var;
        this.f3941c = w0Var;
    }

    private final void i(View view, int i7, int i10) {
    }

    private final void j(View view, int i7, int i10) {
    }

    private final void k(View view, int i7, int i10) {
    }
}
