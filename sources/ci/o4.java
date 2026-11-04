package ci;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.f21;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.gm0;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.w21;
import org.telegram.ui.b40;
import org.telegram.ui.cw;
import org.telegram.ui.cy0;
import org.telegram.ui.dy0;
import org.telegram.ui.eb1;
import org.telegram.ui.ey0;
import org.telegram.ui.f91;
import org.telegram.ui.gb1;
import org.telegram.ui.h91;
import org.telegram.ui.i91;
import org.telegram.ui.ij;
import org.telegram.ui.jm;
import org.telegram.ui.m91;
import org.telegram.ui.pv;
import org.telegram.ui.uw;
import org.telegram.ui.wm;
import org.telegram.ui.wz;
import org.telegram.ui.xm;
import org.telegram.ui.xs;
import org.telegram.ui.yg0;
import org.telegram.ui.ym;
public final class o4 extends f61 {
    public final int f5681a;
    public final Object f5682b;
    public final Object f5683c;

    public o4(int i3, Context context, Object obj) {
        this.f5681a = i3;
        this.f5683c = obj;
        this.f5682b = context;
    }

    @Override
    public final void b(View view, int i3, int i10) {
        t4 t4Var;
        ei.k6 k6Var;
        org.telegram.ui.ActionBar.d2 d2Var;
        int i11 = this.f5681a;
        Object obj = this.f5683c;
        switch (i11) {
            case 0:
                l6 l6Var = (l6) obj;
                if (i10 == 0) {
                    l6.i1(l6Var, false);
                    ai.j2 j2Var = l6Var.V1;
                    if (j2Var != null) {
                        t4Var = j2Var.R1;
                    } else {
                        return;
                    }
                } else if (i10 == 2) {
                    l6.i1(l6Var, true);
                    ai.j2 j2Var2 = l6Var.W1;
                    if (j2Var2 != null) {
                        t4Var = j2Var2.R1;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                org.telegram.messenger.g0.E2(t4Var);
                frameLayout.addView(t4Var);
                return;
            case 1:
                tp0 tp0Var = (tp0) obj;
                fi.m mVar = (fi.m) view;
                if (i3 == 0) {
                    k6Var = tp0Var.f11634e;
                } else {
                    k6Var = (ei.k6) tp0Var.f11635f.get(i3 - 1);
                }
                k6Var.H(null);
                mVar.setList(k6Var);
                mVar.setVisibleHeight(tp0Var.f11639w);
                return;
            case 2:
                if (view instanceof ym) {
                    ((ym) view).f52363a.nd(((wm) obj).J3);
                }
                WeakHashMap weakHashMap = r0.i0.f54015a;
                r0.y.c(view);
                return;
            case 3:
                cw cwVar = (cw) obj;
                cwVar.P(view, i3, cwVar.N0, true);
                return;
            case 4:
                return;
            case 5:
                ((dy0) view).a(i10);
                return;
            case 6:
                return;
            case 7:
                i91 i91Var = (i91) obj;
                i91Var.M(view, i3, i91Var.f46205e0, true);
                return;
            case 8:
                gb1 gb1Var = (gb1) obj;
                SparseArray sparseArray = gb1Var.f45620a;
                eb1 eb1Var = (eb1) sparseArray.get(i3);
                if (eb1Var != null) {
                    d2Var = eb1Var.f44954a;
                } else {
                    org.telegram.ui.ActionBar.d2 a02 = gb1Var.a0(i3);
                    eb1 eb1Var2 = new eb1(a02);
                    sparseArray.put(i3, eb1Var2);
                    d2Var = a02;
                    eb1Var = eb1Var2;
                }
                if (!eb1Var.f44955b) {
                    d2Var.onFragmentCreate();
                    eb1Var.f44955b = true;
                }
                d2Var.setParentLayout(gb1Var.getParentLayout());
                d2Var.setSimpleMenuOverlayHost(gb1Var);
                if (d2Var.getFragmentView() == null) {
                    d2Var.performCreateView((Context) this.f5682b);
                    d2Var.setTitleOverlayText(gb1Var.f45625n, gb1Var.f45626r, gb1Var.f45627s);
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                View fragmentView = d2Var.getFragmentView();
                org.telegram.messenger.g0.E2(fragmentView);
                if (!d2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, fragmentView, null);
                }
                frameLayout2.addView(fragmentView, mf.c(-1.0f, -1));
                if (d2Var.getActionBar() != null && d2Var.getActionBar().L) {
                    org.telegram.messenger.g0.E2(d2Var.getActionBar());
                    frameLayout2.addView(d2Var.getActionBar());
                }
                WeakHashMap weakHashMap2 = r0.i0.f54015a;
                r0.y.c(frameLayout2);
                gb1Var.checkSystemBarColors();
                gb1Var.Z();
                return;
            case 9:
                org.telegram.ui.Wallet.w5.Y0((l41) view, false);
                return;
            default:
                return;
        }
    }

    @Override
    public final View d(int i3) {
        t4 t4Var;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.e6 e6Var;
        int i12;
        switch (this.f5681a) {
            case 0:
                l6 l6Var = (l6) this.f5683c;
                if (i3 == 0) {
                    l6.i1(l6Var, false);
                    ai.j2 j2Var = l6Var.V1;
                    if (j2Var != null) {
                        t4Var = j2Var.R1;
                        org.telegram.messenger.g0.E2(t4Var);
                        FrameLayout frameLayout = new FrameLayout((Context) this.f5682b);
                        frameLayout.addView(t4Var, mf.e(-1, -1, 119));
                        return frameLayout;
                    }
                    return null;
                }
                if (i3 == 1) {
                    t4Var = l6Var.R1;
                } else {
                    if (i3 == 2) {
                        l6.i1(l6Var, true);
                        ai.j2 j2Var2 = l6Var.W1;
                        if (j2Var2 != null) {
                            t4Var = j2Var2.R1;
                        }
                    }
                    return null;
                }
                org.telegram.messenger.g0.E2(t4Var);
                FrameLayout frameLayout2 = new FrameLayout((Context) this.f5682b);
                frameLayout2.addView(t4Var, mf.e(-1, -1, 119));
                return frameLayout2;
            case 1:
                return new fi.m((tp0) this.f5683c, (Context) this.f5682b);
            case 2:
                Context context = (Context) this.f5682b;
                wm wmVar = (wm) this.f5683c;
                if (i3 == 0) {
                    return new jm(wmVar, context);
                }
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 7);
                bundle.putInt("searchType", i3);
                bundle.putString("searchHashtag", wmVar.J3);
                ij ijVar = new ij(context, wmVar.getParentLayout(), bundle, 0);
                ijVar.h = false;
                xm xmVar = ijVar.f52363a;
                xmVar.N.f54761a = wmVar.N;
                xmVar.f51531wa = wmVar.f51557ya;
                xmVar.xa = wmVar;
                xmVar.f51379k9 = new org.telegram.ui.f(this, 12);
                return ijVar;
            case 3:
                cw cwVar = (cw) this.f5683c;
                uw uwVar = cwVar.M0;
                if (i3 == 1) {
                    return cwVar.f34746a0;
                }
                if (i3 == 3) {
                    return cwVar.f34755i0;
                }
                if (i3 == 4) {
                    return cwVar.f34759n0;
                }
                if (i3 == 5) {
                    return cwVar.f34766u0;
                }
                if (i3 == 2) {
                    hl0 hl0Var = new hl0(cwVar.K0, uwVar);
                    cwVar.J0 = hl0Var;
                    hl0Var.b(cwVar.X0, cwVar.Y0, false);
                    cwVar.J0.f34443b.setClipToPadding(false);
                    cwVar.J0.f34443b.j(new gm0(this, 0));
                    cwVar.J0.f34443b.D0(new jb0(cwVar, 21));
                    cwVar.J0.setUiCallback(cwVar);
                    return cwVar.J0;
                } else if (i3 == 6) {
                    return cwVar.f34764s0;
                } else {
                    wz wzVar = new wz(uwVar);
                    wzVar.setChatPreviewDelegate(cwVar.S0);
                    wzVar.setUiCallback(cwVar);
                    wzVar.j(cwVar.X0, cwVar.Y0, false);
                    eh.c cVar = cwVar.f34747a1;
                    if (cVar != null) {
                        wzVar.setBlurredBackgroundDrawableFactory(cVar);
                    }
                    xs xsVar = wzVar.f51638b;
                    xsVar.setClipToPadding(false);
                    xsVar.j(new gm0(this, 1));
                    xsVar.D0(new jb0(cwVar, 21));
                    return wzVar;
                }
            case 4:
                FrameLayout frameLayout3 = new FrameLayout((Context) this.f5682b);
                frameLayout3.setOnClickListener(new b40(this, 24));
                return frameLayout3;
            case 5:
                return new dy0((ey0) this.f5683c, (Context) this.f5682b);
            case 6:
                FrameLayout frameLayout4 = new FrameLayout((Context) this.f5682b);
                frameLayout4.setOnClickListener(new cy0(this, 9));
                return frameLayout4;
            case 7:
                i91 i91Var = (i91) this.f5683c;
                m91 m91Var = i91Var.f46222w0;
                if (i3 == 1) {
                    return i91Var.W;
                }
                if (i3 == 2) {
                    hl0 hl0Var2 = new hl0(m91.r0(m91Var), m91Var);
                    hl0Var2.f34443b.j(new h91(0));
                    hl0Var2.setUiCallback(i91Var);
                    return hl0Var2;
                }
                wz wzVar2 = new wz(m91Var);
                wzVar2.setChatPreviewDelegate(i91Var.f46220u0);
                wzVar2.setUiCallback(i91Var);
                wzVar2.f51638b.j(new h91(1));
                return wzVar2;
            case 8:
                return new yg0((Context) this.f5682b, 15);
            case 9:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.f5683c;
                l41[] l41VarArr = w5Var.f43341s0;
                l41 l41Var = l41VarArr[i3];
                if (l41Var == null) {
                    Context context2 = (Context) this.f5682b;
                    i10 = ((org.telegram.ui.ActionBar.d2) w5Var).currentAccount;
                    i11 = ((org.telegram.ui.ActionBar.d2) w5Var).classGuid;
                    org.telegram.ui.Components.p pVar = new org.telegram.ui.Components.p(this, i3, 2);
                    org.telegram.ui.Wallet.g4 g4Var = new org.telegram.ui.Wallet.g4(w5Var);
                    org.telegram.ui.Wallet.g4 g4Var2 = new org.telegram.ui.Wallet.g4(w5Var);
                    e6Var = ((org.telegram.ui.ActionBar.d2) w5Var).resourceProvider;
                    if (i3 == 1) {
                        i12 = 3;
                    } else {
                        i12 = -1;
                    }
                    ai.i5 i5Var = new ai.i5(context2, i10, i11, false, pVar, g4Var, g4Var2, e6Var, i12, 1);
                    if (i3 == 1) {
                        i5Var.setPadding(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(12.0f));
                    }
                    i5Var.setFocusableInTouchMode(false);
                    i5Var.setClipChildren(false);
                    i5Var.setClipToPadding(false);
                    if (i3 == 0) {
                        i5Var.r1();
                    } else {
                        i5Var.setSelectorType(9);
                        i5Var.setSelectorDrawableColor(0);
                    }
                    i5Var.f35594g3.f33698r = false;
                    i5Var.j(new w21(this, i3));
                    l41VarArr[i3] = i5Var;
                    return i5Var;
                }
                return l41Var;
            default:
                if (i3 == 0) {
                    return ((xg.a0) this.f5682b).f28586b;
                }
                return ((xg.w0) this.f5683c).f28586b;
        }
    }

    @Override
    public final int e() {
        switch (this.f5681a) {
            case 0:
                l6 l6Var = (l6) this.f5683c;
                return (l6Var.I1(true) ? 1 : 0) + (l6Var.I1(false) ? 1 : 0) + 1;
            case 1:
                return ((tp0) this.f5683c).f11635f.size() + 1;
            case 2:
                return 3;
            case 3:
                return ((ArrayList) this.f5682b).size();
            case 4:
                return 2;
            case 5:
                return 5;
            case 6:
                return 2;
            case 7:
                return ((ArrayList) this.f5682b).size();
            case 8:
                ((gb1) this.f5683c).getClass();
                return 4;
            case 9:
                if (((org.telegram.ui.Wallet.w5) this.f5683c).f43327g0) {
                    return 2;
                }
                return 1;
            default:
                return 2;
        }
    }

    @Override
    public int f(int i3) {
        switch (this.f5681a) {
            case 1:
                if (i3 == 0) {
                    return 0;
                }
                return ((ei.k6) ((tp0) this.f5683c).f11635f.get(i3 - 1)).E.hashCode();
            default:
                return i3;
        }
    }

    @Override
    public CharSequence g(int i3) {
        int i10;
        int i11 = this.f5681a;
        Object obj = this.f5682b;
        switch (i11) {
            case 1:
                if (i3 == 0) {
                    return bd.M0(2131746718, null);
                }
                String O0 = f21.O0(((ei.k6) ((tp0) this.f5683c).f11635f.get(i3 - 1)).E, null, null);
                if (O0 == null) {
                    return null;
                }
                return O0.substring(0, 1).toUpperCase() + O0.substring(1);
            case 2:
                if (i3 != 1) {
                    if (i3 != 2) {
                        return bd.M0(2131745719, null);
                    }
                    return bd.M0(2131745722, null);
                }
                return bd.M0(2131745748, null);
            case 3:
                ArrayList arrayList = (ArrayList) obj;
                if (((hm0) arrayList.get(i3)).f34455a == 0) {
                    return bd.M0(2131745833, null);
                }
                if (((hm0) arrayList.get(i3)).f34455a == 1) {
                    return bd.M0(2131752258, null);
                }
                if (((hm0) arrayList.get(i3)).f34455a == 4) {
                    return bd.M0(2131754178, null);
                }
                if (((hm0) arrayList.get(i3)).f34455a == 6) {
                    return bd.M0(2131745743, null);
                }
                if (((hm0) arrayList.get(i3)).f34455a == 2) {
                    return bd.M0(2131751344, null);
                }
                if (((hm0) arrayList.get(i3)).f34455a == 5) {
                    return bd.M0(2131746592, null);
                }
                kg.l0 l0Var = kg.n0.f17105k3[((hm0) arrayList.get(i3)).f34456b];
                String str = l0Var.f17082c;
                if (str != null) {
                    return str;
                }
                return bd.M0(l0Var.f17081b, null);
            case 4:
            case 5:
            case 6:
            case 8:
            default:
                return super.g(i3);
            case 7:
                ArrayList arrayList2 = (ArrayList) obj;
                if (((f91) arrayList2.get(i3)).f45223a == 0) {
                    return bd.M0(2131745766, null);
                }
                if (((f91) arrayList2.get(i3)).f45223a == 1) {
                    return bd.M0(2131751344, null);
                }
                kg.l0 l0Var2 = kg.n0.f17105k3[((f91) arrayList2.get(i3)).f45224b];
                String str2 = l0Var2.f17082c;
                if (str2 != null) {
                    return str2;
                }
                return bd.M0(l0Var2.f17081b, null);
            case 9:
                if (i3 == 0) {
                    i10 = 2131742992;
                } else {
                    i10 = 2131743180;
                }
                return bd.M0(i10, null);
        }
    }

    @Override
    public int h(int i3) {
        switch (this.f5681a) {
            case 0:
                return (i3 - (((l6) this.f5683c).I1(false) ? 1 : 0)) + 1;
            case 1:
            case 4:
            case 6:
            case 8:
            default:
                return super.h(i3);
            case 2:
                return i3;
            case 3:
                ArrayList arrayList = (ArrayList) this.f5682b;
                if (((hm0) arrayList.get(i3)).f34455a == 0) {
                    return 1;
                }
                if (((hm0) arrayList.get(i3)).f34455a == 1) {
                    return 3;
                }
                if (((hm0) arrayList.get(i3)).f34455a == 4) {
                    return 4;
                }
                if (((hm0) arrayList.get(i3)).f34455a == 2) {
                    return 2;
                }
                if (((hm0) arrayList.get(i3)).f34455a == 5) {
                    return 5;
                }
                if (((hm0) arrayList.get(i3)).f34455a == 6) {
                    return 6;
                }
                return ((hm0) arrayList.get(i3)).f34455a + i3;
            case 5:
                if (i3 == 0) {
                    return 0;
                }
                return 1;
            case 7:
                ArrayList arrayList2 = (ArrayList) this.f5682b;
                if (((f91) arrayList2.get(i3)).f45223a == 0) {
                    return 1;
                }
                if (((f91) arrayList2.get(i3)).f45223a == 1) {
                    return 2;
                }
                return ((f91) arrayList2.get(i3)).f45223a + i3;
            case 9:
            case 10:
                return i3;
        }
    }

    public void l() {
        ArrayList arrayList = (ArrayList) this.f5682b;
        arrayList.clear();
        arrayList.add(new hm0(0));
        cw cwVar = (cw) this.f5683c;
        if (cwVar.W0 == 0) {
            if (cwVar.f34765t0) {
                arrayList.add(new hm0(5));
            }
            arrayList.add(new hm0(1));
            arrayList.add(new hm0(4));
            arrayList.add(new hm0(6));
            if (!cwVar.R0) {
                hm0 hm0Var = new hm0(3);
                hm0Var.f34456b = 0;
                arrayList.add(hm0Var);
                pv pvVar = cwVar.f44443e1.G3;
                if (pvVar == null || !pvVar.c()) {
                    arrayList.add(new hm0(2));
                }
                hm0 hm0Var2 = new hm0(3);
                hm0Var2.f34456b = 1;
                arrayList.add(hm0Var2);
                hm0 hm0Var3 = new hm0(3);
                hm0Var3.f34456b = 2;
                arrayList.add(hm0Var3);
                hm0 hm0Var4 = new hm0(3);
                hm0Var4.f34456b = 3;
                arrayList.add(hm0Var4);
                hm0 hm0Var5 = new hm0(3);
                hm0Var5.f34456b = 4;
                arrayList.add(hm0Var5);
            }
        }
    }

    public o4(cw cwVar) {
        this.f5681a = 3;
        this.f5683c = cwVar;
        this.f5682b = new ArrayList();
        l();
    }

    public o4(i91 i91Var) {
        this.f5681a = 7;
        this.f5683c = i91Var;
        ArrayList arrayList = new ArrayList();
        this.f5682b = arrayList;
        arrayList.add(new f91(0));
        f91 f91Var = new f91(2);
        f91Var.f45224b = 0;
        arrayList.add(f91Var);
        f91 f91Var2 = new f91(2);
        f91Var2.f45224b = 1;
        arrayList.add(f91Var2);
        f91 f91Var3 = new f91(2);
        f91Var3.f45224b = 2;
        arrayList.add(f91Var3);
        f91 f91Var4 = new f91(2);
        f91Var4.f45224b = 3;
        arrayList.add(f91Var4);
        f91 f91Var5 = new f91(2);
        f91Var5.f45224b = 4;
        arrayList.add(f91Var5);
    }

    public o4(xg.a0 a0Var, xg.w0 w0Var) {
        this.f5681a = 10;
        this.f5682b = a0Var;
        this.f5683c = w0Var;
    }

    private final void i(View view, int i3, int i10) {
    }

    private final void j(View view, int i3, int i10) {
    }

    private final void k(View view, int i3, int i10) {
    }
}
