package bi;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.ui.Components.c31;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.fm0;
import org.telegram.ui.Components.l21;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.pb0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.a00;
import org.telegram.ui.bt;
import org.telegram.ui.cn;
import org.telegram.ui.dn;
import org.telegram.ui.en;
import org.telegram.ui.hw;
import org.telegram.ui.i40;
import org.telegram.ui.mx;
import org.telegram.ui.ob1;
import org.telegram.ui.oj;
import org.telegram.ui.pm;
import org.telegram.ui.py0;
import org.telegram.ui.qb1;
import org.telegram.ui.qy0;
import org.telegram.ui.r91;
import org.telegram.ui.ry0;
import org.telegram.ui.t91;
import org.telegram.ui.u91;
import org.telegram.ui.uq0;
import org.telegram.ui.uv;
import org.telegram.ui.y91;
import org.telegram.ui.yw;
public final class g5 extends n61 {
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
        di.k6 k6Var;
        org.telegram.ui.ActionBar.f2 f2Var;
        int i11 = this.f3939a;
        Object obj = this.f3941c;
        switch (i11) {
            case 0:
                k7 k7Var = (k7) obj;
                if (i10 == 0) {
                    k7Var.m2(false);
                    i5 i5Var = k7Var.U1;
                    if (i5Var != null) {
                        m5Var = i5Var.Q1;
                    } else {
                        return;
                    }
                } else if (i10 == 2) {
                    k7Var.m2(true);
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
                tp0 tp0Var = (tp0) obj;
                ei.n nVar = (ei.n) view;
                if (i7 == 0) {
                    k6Var = tp0Var.f10847e;
                } else {
                    k6Var = (di.k6) tp0Var.f10848f.get(i7 - 1);
                }
                k6Var.H(null);
                nVar.setList(k6Var);
                nVar.setVisibleHeight(tp0Var.f10852w);
                return;
            case 2:
                if (view instanceof en) {
                    ((en) view).f45471a.qd(((cn) obj).I3);
                }
                WeakHashMap weakHashMap = r0.i0.f54203a;
                r0.y.c(view);
                return;
            case 3:
                hw hwVar = (hw) obj;
                hwVar.P(view, i7, hwVar.M0, true);
                return;
            case 4:
                return;
            case 5:
                ((qy0) view).a(i10);
                return;
            case 6:
                return;
            case 7:
                u91 u91Var = (u91) obj;
                u91Var.M(view, i7, u91Var.f50327d0, true);
                return;
            case 8:
                qb1 qb1Var = (qb1) obj;
                SparseArray sparseArray = qb1Var.f49012a;
                ob1 ob1Var = (ob1) sparseArray.get(i7);
                if (ob1Var != null) {
                    f2Var = ob1Var.f48422a;
                } else {
                    org.telegram.ui.ActionBar.f2 a02 = qb1Var.a0(i7);
                    ob1 ob1Var2 = new ob1(a02);
                    sparseArray.put(i7, ob1Var2);
                    f2Var = a02;
                    ob1Var = ob1Var2;
                }
                if (!ob1Var.f48423b) {
                    f2Var.onFragmentCreate();
                    ob1Var.f48423b = true;
                }
                f2Var.setParentLayout(qb1Var.getParentLayout());
                f2Var.setSimpleMenuOverlayHost(qb1Var);
                if (f2Var.getFragmentView() == null) {
                    f2Var.performCreateView((Context) this.f3940b);
                    f2Var.setTitleOverlayText(qb1Var.f49017n, qb1Var.f49018r, qb1Var.f49019s);
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                View fragmentView = f2Var.getFragmentView();
                org.telegram.messenger.g0.E2(fragmentView);
                if (!f2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, fragmentView, null);
                }
                frameLayout2.addView(fragmentView, c8.ha.c(-1.0f, -1));
                if (f2Var.getActionBar() != null && f2Var.getActionBar().K) {
                    org.telegram.messenger.g0.E2(f2Var.getActionBar());
                    frameLayout2.addView(f2Var.getActionBar());
                }
                WeakHashMap weakHashMap2 = r0.i0.f54203a;
                r0.y.c(frameLayout2);
                qb1Var.checkSystemBarColors();
                qb1Var.Z();
                return;
            case 9:
                org.telegram.ui.Wallet.w5.Y0((r41) view, false);
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
        org.telegram.ui.ActionBar.g6 g6Var;
        int i13;
        switch (this.f3939a) {
            case 0:
                k7 k7Var = (k7) this.f3941c;
                if (i7 == 0) {
                    k7Var.m2(false);
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
                        k7Var.m2(true);
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
                return new ei.n((tp0) this.f3941c, (Context) this.f3940b);
            case 2:
                Context context = (Context) this.f3940b;
                cn cnVar = (cn) this.f3941c;
                if (i7 == 0) {
                    return new pm(cnVar, context);
                }
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 7);
                bundle.putInt("searchType", i7);
                bundle.putString("searchHashtag", cnVar.I3);
                oj ojVar = new oj(context, cnVar.getParentLayout(), bundle, 0);
                ojVar.h = false;
                dn dnVar = ojVar.f45471a;
                dnVar.M.f54590a = cnVar.M;
                dnVar.f44685xa = cnVar.f44709za;
                dnVar.ya = cnVar;
                dnVar.f44532l9 = new org.telegram.ui.f(this, 12);
                return ojVar;
            case 3:
                hw hwVar = (hw) this.f3941c;
                yw ywVar = hwVar.L0;
                if (i7 == 1) {
                    return hwVar.W;
                }
                if (i7 == 3) {
                    return hwVar.f33999h0;
                }
                if (i7 == 4) {
                    return hwVar.m0;
                }
                if (i7 == 5) {
                    return hwVar.f34010t0;
                }
                if (i7 == 2) {
                    el0 el0Var = new el0(hwVar.J0, ywVar);
                    hwVar.I0 = el0Var;
                    el0Var.b(hwVar.W0, hwVar.X0, false);
                    hwVar.I0.f33438b.setClipToPadding(false);
                    hwVar.I0.f33438b.j(new em0(this, 0));
                    hwVar.I0.f33438b.D0(new pb0(hwVar, 19));
                    hwVar.I0.setUiCallback(hwVar);
                    return hwVar.I0;
                } else if (i7 == 6) {
                    return hwVar.f34008r0;
                } else {
                    a00 a00Var = new a00(ywVar);
                    a00Var.setChatPreviewDelegate(hwVar.R0);
                    a00Var.setUiCallback(hwVar);
                    a00Var.j(hwVar.W0, hwVar.X0, false);
                    dh.c cVar = hwVar.Z0;
                    if (cVar != null) {
                        a00Var.setBlurredBackgroundDrawableFactory(cVar);
                    }
                    bt btVar = a00Var.f43512b;
                    btVar.setClipToPadding(false);
                    btVar.j(new em0(this, 1));
                    btVar.D0(new pb0(hwVar, 19));
                    return a00Var;
                }
            case 4:
                FrameLayout frameLayout3 = new FrameLayout((Context) this.f3940b);
                frameLayout3.setOnClickListener(new i40(this, 24));
                return frameLayout3;
            case 5:
                return new qy0((ry0) this.f3941c, (Context) this.f3940b);
            case 6:
                FrameLayout frameLayout4 = new FrameLayout((Context) this.f3940b);
                frameLayout4.setOnClickListener(new py0(this, 9));
                return frameLayout4;
            case 7:
                u91 u91Var = (u91) this.f3941c;
                y91 y91Var = u91Var.f50344v0;
                if (i7 == 1) {
                    return u91Var.V;
                }
                if (i7 == 2) {
                    i10 = ((org.telegram.ui.ActionBar.f2) y91Var).currentAccount;
                    el0 el0Var2 = new el0(i10, y91Var);
                    el0Var2.f33438b.j(new t91(0));
                    el0Var2.setUiCallback(u91Var);
                    return el0Var2;
                }
                a00 a00Var2 = new a00(y91Var);
                a00Var2.setChatPreviewDelegate(u91Var.f50342t0);
                a00Var2.setUiCallback(u91Var);
                a00Var2.f43512b.j(new t91(1));
                return a00Var2;
            case 8:
                return new uq0((Context) this.f3940b, 13);
            case 9:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.f3941c;
                r41[] r41VarArr = w5Var.f43269r0;
                r41 r41Var = r41VarArr[i7];
                if (r41Var == null) {
                    Context context2 = (Context) this.f3940b;
                    i11 = ((org.telegram.ui.ActionBar.f2) w5Var).currentAccount;
                    i12 = ((org.telegram.ui.ActionBar.f2) w5Var).classGuid;
                    org.telegram.ui.Components.q qVar = new org.telegram.ui.Components.q(this, i7, 2);
                    org.telegram.ui.Wallet.g4 g4Var = new org.telegram.ui.Wallet.g4(w5Var);
                    org.telegram.ui.Wallet.g4 g4Var2 = new org.telegram.ui.Wallet.g4(w5Var);
                    g6Var = ((org.telegram.ui.ActionBar.f2) w5Var).resourceProvider;
                    if (i7 == 1) {
                        i13 = 3;
                    } else {
                        i13 = -1;
                    }
                    mx mxVar = new mx(context2, i11, i12, false, qVar, g4Var, g4Var2, g6Var, i13, 1);
                    if (i7 == 1) {
                        mxVar.setPadding(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(12.0f));
                    }
                    mxVar.setFocusableInTouchMode(false);
                    mxVar.setClipChildren(false);
                    mxVar.setClipToPadding(false);
                    if (i7 == 0) {
                        mxVar.r1();
                    } else {
                        mxVar.setSelectorType(9);
                        mxVar.setSelectorDrawableColor(0);
                    }
                    mxVar.f37556f3.f35945r = false;
                    mxVar.j(new c31(this, i7));
                    r41VarArr[i7] = mxVar;
                    return mxVar;
                }
                return r41Var;
            default:
                if (i7 == 0) {
                    return ((wg.z) this.f3940b).f28624b;
                }
                return ((wg.w0) this.f3941c).f28624b;
        }
    }

    @Override
    public final int e() {
        switch (this.f3939a) {
            case 0:
                k7 k7Var = (k7) this.f3941c;
                return (k7Var.H1(true) ? 1 : 0) + (k7Var.H1(false) ? 1 : 0) + 1;
            case 1:
                return ((tp0) this.f3941c).f10848f.size() + 1;
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
                ((qb1) this.f3941c).getClass();
                return 4;
            case 9:
                if (((org.telegram.ui.Wallet.w5) this.f3941c).f43256f0) {
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
                return ((di.k6) ((tp0) this.f3941c).f10848f.get(i7 - 1)).E.hashCode();
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
                    return org.telegram.messenger.id.M0(2131746710, null);
                }
                String O0 = l21.O0(((di.k6) ((tp0) this.f3941c).f10848f.get(i7 - 1)).E, null, null);
                if (O0 == null) {
                    return null;
                }
                return O0.substring(0, 1).toUpperCase() + O0.substring(1);
            case 2:
                if (i7 != 1) {
                    if (i7 != 2) {
                        return org.telegram.messenger.id.M0(2131745709, null);
                    }
                    return org.telegram.messenger.id.M0(2131745712, null);
                }
                return org.telegram.messenger.id.M0(2131745738, null);
            case 3:
                ArrayList arrayList = (ArrayList) obj;
                if (((fm0) arrayList.get(i7)).f33710a == 0) {
                    return org.telegram.messenger.id.M0(2131745823, null);
                }
                if (((fm0) arrayList.get(i7)).f33710a == 1) {
                    return org.telegram.messenger.id.M0(2131752258, null);
                }
                if (((fm0) arrayList.get(i7)).f33710a == 4) {
                    return org.telegram.messenger.id.M0(2131754178, null);
                }
                if (((fm0) arrayList.get(i7)).f33710a == 6) {
                    return org.telegram.messenger.id.M0(2131745733, null);
                }
                if (((fm0) arrayList.get(i7)).f33710a == 2) {
                    return org.telegram.messenger.id.M0(2131751343, null);
                }
                if (((fm0) arrayList.get(i7)).f33710a == 5) {
                    return org.telegram.messenger.id.M0(2131746584, null);
                }
                jg.o0 o0Var = jg.q0.j3[((fm0) arrayList.get(i7)).f33711b];
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
                if (((r91) arrayList2.get(i7)).f49355a == 0) {
                    return org.telegram.messenger.id.M0(2131745756, null);
                }
                if (((r91) arrayList2.get(i7)).f49355a == 1) {
                    return org.telegram.messenger.id.M0(2131751343, null);
                }
                jg.o0 o0Var2 = jg.q0.j3[((r91) arrayList2.get(i7)).f49356b];
                String str2 = o0Var2.f16872c;
                if (str2 != null) {
                    return str2;
                }
                return org.telegram.messenger.id.M0(o0Var2.f16871b, null);
            case 9:
                if (i7 == 0) {
                    i10 = 2131742982;
                } else {
                    i10 = 2131743170;
                }
                return org.telegram.messenger.id.M0(i10, null);
        }
    }

    @Override
    public int h(int i7) {
        switch (this.f3939a) {
            case 0:
                return (i7 - (((k7) this.f3941c).H1(false) ? 1 : 0)) + 1;
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
                if (((fm0) arrayList.get(i7)).f33710a == 0) {
                    return 1;
                }
                if (((fm0) arrayList.get(i7)).f33710a == 1) {
                    return 3;
                }
                if (((fm0) arrayList.get(i7)).f33710a == 4) {
                    return 4;
                }
                if (((fm0) arrayList.get(i7)).f33710a == 2) {
                    return 2;
                }
                if (((fm0) arrayList.get(i7)).f33710a == 5) {
                    return 5;
                }
                if (((fm0) arrayList.get(i7)).f33710a == 6) {
                    return 6;
                }
                return ((fm0) arrayList.get(i7)).f33710a + i7;
            case 5:
                if (i7 == 0) {
                    return 0;
                }
                return 1;
            case 7:
                ArrayList arrayList2 = (ArrayList) this.f3940b;
                if (((r91) arrayList2.get(i7)).f49355a == 0) {
                    return 1;
                }
                if (((r91) arrayList2.get(i7)).f49355a == 1) {
                    return 2;
                }
                return ((r91) arrayList2.get(i7)).f49355a + i7;
            case 9:
            case 10:
                return i7;
        }
    }

    public void l() {
        ArrayList arrayList = (ArrayList) this.f3940b;
        arrayList.clear();
        arrayList.add(new fm0(0));
        hw hwVar = (hw) this.f3941c;
        if (hwVar.V0 == 0) {
            if (hwVar.f34009s0) {
                arrayList.add(new fm0(5));
            }
            arrayList.add(new fm0(1));
            arrayList.add(new fm0(4));
            arrayList.add(new fm0(6));
            if (!hwVar.Q0) {
                fm0 fm0Var = new fm0(3);
                fm0Var.f33711b = 0;
                arrayList.add(fm0Var);
                uv uvVar = hwVar.f46418d1.G3;
                if (uvVar == null || !uvVar.c()) {
                    arrayList.add(new fm0(2));
                }
                fm0 fm0Var2 = new fm0(3);
                fm0Var2.f33711b = 1;
                arrayList.add(fm0Var2);
                fm0 fm0Var3 = new fm0(3);
                fm0Var3.f33711b = 2;
                arrayList.add(fm0Var3);
                fm0 fm0Var4 = new fm0(3);
                fm0Var4.f33711b = 3;
                arrayList.add(fm0Var4);
                fm0 fm0Var5 = new fm0(3);
                fm0Var5.f33711b = 4;
                arrayList.add(fm0Var5);
            }
        }
    }

    public g5(hw hwVar) {
        this.f3939a = 3;
        this.f3941c = hwVar;
        this.f3940b = new ArrayList();
        l();
    }

    public g5(u91 u91Var) {
        this.f3939a = 7;
        this.f3941c = u91Var;
        ArrayList arrayList = new ArrayList();
        this.f3940b = arrayList;
        arrayList.add(new r91(0));
        r91 r91Var = new r91(2);
        r91Var.f49356b = 0;
        arrayList.add(r91Var);
        r91 r91Var2 = new r91(2);
        r91Var2.f49356b = 1;
        arrayList.add(r91Var2);
        r91 r91Var3 = new r91(2);
        r91Var3.f49356b = 2;
        arrayList.add(r91Var3);
        r91 r91Var4 = new r91(2);
        r91Var4.f49356b = 3;
        arrayList.add(r91Var4);
        r91 r91Var5 = new r91(2);
        r91Var5.f49356b = 4;
        arrayList.add(r91Var5);
    }

    public g5(wg.z zVar, wg.w0 w0Var) {
        this.f3939a = 10;
        this.f3940b = zVar;
        this.f3941c = w0Var;
    }

    private final void i(View view, int i7, int i10) {
    }

    private final void j(View view, int i7, int i10) {
    }

    private final void k(View view, int i7, int i10) {
    }
}
