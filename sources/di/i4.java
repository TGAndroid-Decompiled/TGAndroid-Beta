package di;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.b31;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.t31;
import org.telegram.ui.bn;
import org.telegram.ui.c00;
import org.telegram.ui.cn;
import org.telegram.ui.cx;
import org.telegram.ui.dn;
import org.telegram.ui.et;
import org.telegram.ui.ih0;
import org.telegram.ui.j40;
import org.telegram.ui.kw;
import org.telegram.ui.nj;
import org.telegram.ui.ob1;
import org.telegram.ui.om;
import org.telegram.ui.oy0;
import org.telegram.ui.py0;
import org.telegram.ui.qb1;
import org.telegram.ui.qy0;
import org.telegram.ui.r91;
import org.telegram.ui.t91;
import org.telegram.ui.u91;
import org.telegram.ui.xv;
import org.telegram.ui.y91;
public final class i4 extends b71 {
    public final int f9000a;
    public final Object f9001b;
    public final Object f9002c;

    public i4(int i7, Context context, Object obj) {
        this.f9000a = i7;
        this.f9002c = obj;
        this.f9001b = context;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        n4 n4Var;
        fi.z5 z5Var;
        org.telegram.ui.ActionBar.g2 g2Var;
        int i11 = this.f9000a;
        Object obj = this.f9002c;
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
                fq0 fq0Var = (fq0) obj;
                gi.m mVar = (gi.m) view;
                if (i7 == 0) {
                    z5Var = fq0Var.f13662e;
                } else {
                    z5Var = (fi.z5) fq0Var.f13663f.get(i7 - 1);
                }
                z5Var.H(null);
                mVar.setList(z5Var);
                mVar.setVisibleHeight(fq0Var.f13667w);
                return;
            case 2:
                if (view instanceof dn) {
                    ((dn) view).f46973a.rd(((bn) obj).J3);
                }
                WeakHashMap weakHashMap = r0.i0.f56254a;
                r0.y.c(view);
                return;
            case 3:
                kw kwVar = (kw) obj;
                kwVar.L(view, i7, kwVar.N0, true);
                return;
            case 4:
                return;
            case 5:
                ((py0) view).a(i10);
                return;
            case 6:
                return;
            case 7:
                u91 u91Var = (u91) obj;
                u91Var.I(view, i7, u91Var.f52478e0, true);
                return;
            case 8:
                qb1 qb1Var = (qb1) obj;
                SparseArray sparseArray = qb1Var.f51132a;
                ob1 ob1Var = (ob1) sparseArray.get(i7);
                if (ob1Var != null) {
                    g2Var = ob1Var.f50523a;
                } else {
                    org.telegram.ui.ActionBar.g2 a02 = qb1Var.a0(i7);
                    ob1 ob1Var2 = new ob1(a02);
                    sparseArray.put(i7, ob1Var2);
                    g2Var = a02;
                    ob1Var = ob1Var2;
                }
                if (!ob1Var.f50524b) {
                    g2Var.onFragmentCreate();
                    ob1Var.f50524b = true;
                }
                g2Var.setParentLayout(qb1Var.getParentLayout());
                g2Var.setSimpleMenuOverlayHost(qb1Var);
                if (g2Var.getFragmentView() == null) {
                    g2Var.performCreateView((Context) this.f9001b);
                    g2Var.setTitleOverlayText(qb1Var.f51137n, qb1Var.f51138r, qb1Var.f51139s);
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                View fragmentView = g2Var.getFragmentView();
                org.telegram.messenger.g0.E2(fragmentView);
                if (!g2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29347d6, fragmentView, null);
                }
                frameLayout2.addView(fragmentView, c8.na.c(-1.0f, -1));
                if (g2Var.getActionBar() != null && g2Var.getActionBar().L) {
                    org.telegram.messenger.g0.E2(g2Var.getActionBar());
                    frameLayout2.addView(g2Var.getActionBar());
                }
                WeakHashMap weakHashMap2 = r0.i0.f56254a;
                r0.y.c(frameLayout2);
                qb1Var.checkSystemBarColors();
                qb1Var.Z();
                return;
            case 9:
                org.telegram.ui.Wallet.n6.d1((h51) view, false);
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
        org.telegram.ui.ActionBar.h6 h6Var;
        int i13;
        ri.q qVar;
        switch (this.f9000a) {
            case 0:
                f6 f6Var = (f6) this.f9002c;
                if (i7 == 0) {
                    f6.j1(f6Var, false);
                    bi.b3 b3Var = f6Var.Y1;
                    if (b3Var != null) {
                        n4Var = b3Var.U1;
                        org.telegram.messenger.g0.E2(n4Var);
                        FrameLayout frameLayout = new FrameLayout((Context) this.f9001b);
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
                FrameLayout frameLayout2 = new FrameLayout((Context) this.f9001b);
                frameLayout2.addView(n4Var, c8.na.e(-1, -1, 119));
                return frameLayout2;
            case 1:
                return new gi.m((fq0) this.f9002c, (Context) this.f9001b);
            case 2:
                Context context = (Context) this.f9001b;
                bn bnVar = (bn) this.f9002c;
                if (i7 == 0) {
                    return new om(bnVar, context);
                }
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 7);
                bundle.putInt("searchType", i7);
                bundle.putString("searchHashtag", bnVar.J3);
                nj njVar = new nj(context, bnVar.getParentLayout(), bundle, 0);
                njVar.h = false;
                cn cnVar = njVar.f46973a;
                cnVar.N.f59020a = bnVar.N;
                cnVar.f46238za = bnVar.Ba;
                cnVar.Aa = bnVar;
                cnVar.f46083n9 = new org.telegram.ui.f(this, 12);
                return njVar;
            case 3:
                kw kwVar = (kw) this.f9002c;
                cx cxVar = kwVar.M0;
                if (i7 == 1) {
                    return kwVar.f39900a0;
                }
                if (i7 == 3) {
                    return kwVar.f39909i0;
                }
                if (i7 == 4) {
                    return kwVar.f39913n0;
                }
                if (i7 == 5) {
                    return kwVar.f39920u0;
                }
                if (i7 == 2) {
                    sl0 sl0Var = new sl0(kwVar.K0, cxVar);
                    kwVar.J0 = sl0Var;
                    sl0Var.b(kwVar.X0, kwVar.Y0, false);
                    kwVar.J0.f39572b.setClipToPadding(false);
                    kwVar.J0.f39572b.j(new rm0(this, 0));
                    kwVar.J0.f39572b.D0(new hb0(kwVar, 22));
                    kwVar.J0.setUiCallback(kwVar);
                    return kwVar.J0;
                } else if (i7 == 6) {
                    return kwVar.f39918s0;
                } else {
                    c00 c00Var = new c00(cxVar);
                    c00Var.setChatPreviewDelegate(kwVar.S0);
                    c00Var.setUiCallback(kwVar);
                    c00Var.j(kwVar.X0, kwVar.Y0, false);
                    dh.c cVar = kwVar.f39901a1;
                    if (cVar != null) {
                        c00Var.setBlurredBackgroundDrawableFactory(cVar);
                    }
                    et etVar = c00Var.f46341b;
                    etVar.setClipToPadding(false);
                    etVar.j(new rm0(this, 1));
                    etVar.D0(new hb0(kwVar, 22));
                    return c00Var;
                }
            case 4:
                FrameLayout frameLayout3 = new FrameLayout((Context) this.f9001b);
                frameLayout3.setOnClickListener(new j40(this, 24));
                return frameLayout3;
            case 5:
                return new py0((qy0) this.f9002c, (Context) this.f9001b);
            case 6:
                FrameLayout frameLayout4 = new FrameLayout((Context) this.f9001b);
                frameLayout4.setOnClickListener(new oy0(this, 9));
                return frameLayout4;
            case 7:
                u91 u91Var = (u91) this.f9002c;
                y91 y91Var = u91Var.f52495w0;
                if (i7 == 1) {
                    return u91Var.W;
                }
                if (i7 == 2) {
                    i10 = ((org.telegram.ui.ActionBar.g2) y91Var).currentAccount;
                    sl0 sl0Var2 = new sl0(i10, y91Var);
                    sl0Var2.f39572b.j(new t91(0));
                    sl0Var2.setUiCallback(u91Var);
                    return sl0Var2;
                }
                c00 c00Var2 = new c00(y91Var);
                c00Var2.setChatPreviewDelegate(u91Var.f52493u0);
                c00Var2.setUiCallback(u91Var);
                c00Var2.f46341b.j(new t91(1));
                return c00Var2;
            case 8:
                return new ih0((Context) this.f9001b, 15);
            case 9:
                org.telegram.ui.Wallet.n6 n6Var = (org.telegram.ui.Wallet.n6) this.f9002c;
                h51[] h51VarArr = n6Var.f44655u0;
                h51 h51Var = h51VarArr[i7];
                if (h51Var == null) {
                    Context context2 = (Context) this.f9001b;
                    i11 = ((org.telegram.ui.ActionBar.g2) n6Var).currentAccount;
                    i12 = ((org.telegram.ui.ActionBar.g2) n6Var).classGuid;
                    org.telegram.ui.Components.u uVar = new org.telegram.ui.Components.u(this, i7, 1);
                    org.telegram.ui.Wallet.o4 o4Var = new org.telegram.ui.Wallet.o4(n6Var);
                    org.telegram.ui.Wallet.o4 o4Var2 = new org.telegram.ui.Wallet.o4(n6Var);
                    h6Var = ((org.telegram.ui.ActionBar.g2) n6Var).resourceProvider;
                    if (i7 == 1) {
                        i13 = 3;
                    } else {
                        i13 = -1;
                    }
                    bi.l7 l7Var = new bi.l7(context2, i11, i12, false, uVar, o4Var, o4Var2, h6Var, i13, 1);
                    h51VarArr[i7] = l7Var;
                    n6Var.e1(i7);
                    qVar = ((org.telegram.ui.ActionBar.g2) n6Var).glassEngine;
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
                    l7Var.f35742g3.f34026r = false;
                    l7Var.j(new t31(this, i7));
                    h51VarArr[i7] = l7Var;
                    return l7Var;
                }
                return h51Var;
            default:
                if (i7 == 0) {
                    return ((wg.a0) this.f9001b).f30142b;
                }
                return ((wg.w0) this.f9002c).f30142b;
        }
    }

    @Override
    public final int e() {
        switch (this.f9000a) {
            case 0:
                f6 f6Var = (f6) this.f9002c;
                return (f6Var.N1(true) ? 1 : 0) + (f6Var.N1(false) ? 1 : 0) + 1;
            case 1:
                return ((fq0) this.f9002c).f13663f.size() + 1;
            case 2:
                return 3;
            case 3:
                return ((ArrayList) this.f9001b).size();
            case 4:
                return 2;
            case 5:
                return 5;
            case 6:
                return 2;
            case 7:
                return ((ArrayList) this.f9001b).size();
            case 8:
                ((qb1) this.f9002c).getClass();
                return 4;
            case 9:
                if (((org.telegram.ui.Wallet.n6) this.f9002c).f44639g0) {
                    return 2;
                }
                return 1;
            default:
                return 2;
        }
    }

    @Override
    public int f(int i7) {
        switch (this.f9000a) {
            case 1:
                if (i7 == 0) {
                    return 0;
                }
                return ((fi.z5) ((fq0) this.f9002c).f13663f.get(i7 - 1)).E.hashCode();
            default:
                return i7;
        }
    }

    @Override
    public CharSequence g(int i7) {
        int i10;
        int i11 = this.f9000a;
        Object obj = this.f9001b;
        switch (i11) {
            case 1:
                if (i7 == 0) {
                    return hd.N0(2131746514, null);
                }
                return b31.Q0(((fi.z5) ((fq0) this.f9002c).f13663f.get(i7 - 1)).E);
            case 2:
                if (i7 != 1) {
                    if (i7 != 2) {
                        return hd.N0(2131745513, null);
                    }
                    return hd.N0(2131745516, null);
                }
                return hd.N0(2131745542, null);
            case 3:
                ArrayList arrayList = (ArrayList) obj;
                if (((sm0) arrayList.get(i7)).f39585a == 0) {
                    return hd.N0(2131745627, null);
                }
                if (((sm0) arrayList.get(i7)).f39585a == 1) {
                    return hd.N0(2131752246, null);
                }
                if (((sm0) arrayList.get(i7)).f39585a == 4) {
                    return hd.N0(2131754175, null);
                }
                if (((sm0) arrayList.get(i7)).f39585a == 6) {
                    return hd.N0(2131745537, null);
                }
                if (((sm0) arrayList.get(i7)).f39585a == 2) {
                    return hd.N0(2131751331, null);
                }
                if (((sm0) arrayList.get(i7)).f39585a == 5) {
                    return hd.N0(2131746388, null);
                }
                jg.o0 o0Var = jg.q0.f17614k3[((sm0) arrayList.get(i7)).f39586b];
                String str = o0Var.f17598c;
                if (str != null) {
                    return str;
                }
                return hd.N0(o0Var.f17597b, null);
            case 4:
            case 5:
            case 6:
            case 8:
            default:
                return super.g(i7);
            case 7:
                ArrayList arrayList2 = (ArrayList) obj;
                if (((r91) arrayList2.get(i7)).f51557a == 0) {
                    return hd.N0(2131745560, null);
                }
                if (((r91) arrayList2.get(i7)).f51557a == 1) {
                    return hd.N0(2131751331, null);
                }
                jg.o0 o0Var2 = jg.q0.f17614k3[((r91) arrayList2.get(i7)).f51558b];
                String str2 = o0Var2.f17598c;
                if (str2 != null) {
                    return str2;
                }
                return hd.N0(o0Var2.f17597b, null);
            case 9:
                if (i7 == 0) {
                    i10 = 2131742718;
                } else {
                    i10 = 2131742926;
                }
                return hd.N0(i10, null);
        }
    }

    @Override
    public int h(int i7) {
        switch (this.f9000a) {
            case 0:
                return (i7 - (((f6) this.f9002c).N1(false) ? 1 : 0)) + 1;
            case 1:
            case 4:
            case 6:
            case 8:
            default:
                return super.h(i7);
            case 2:
                return i7;
            case 3:
                ArrayList arrayList = (ArrayList) this.f9001b;
                if (((sm0) arrayList.get(i7)).f39585a == 0) {
                    return 1;
                }
                if (((sm0) arrayList.get(i7)).f39585a == 1) {
                    return 3;
                }
                if (((sm0) arrayList.get(i7)).f39585a == 4) {
                    return 4;
                }
                if (((sm0) arrayList.get(i7)).f39585a == 2) {
                    return 2;
                }
                if (((sm0) arrayList.get(i7)).f39585a == 5) {
                    return 5;
                }
                if (((sm0) arrayList.get(i7)).f39585a == 6) {
                    return 6;
                }
                return ((sm0) arrayList.get(i7)).f39585a + i7;
            case 5:
                if (i7 == 0) {
                    return 0;
                }
                return 1;
            case 7:
                ArrayList arrayList2 = (ArrayList) this.f9001b;
                if (((r91) arrayList2.get(i7)).f51557a == 0) {
                    return 1;
                }
                if (((r91) arrayList2.get(i7)).f51557a == 1) {
                    return 2;
                }
                return ((r91) arrayList2.get(i7)).f51557a + i7;
            case 9:
            case 10:
                return i7;
        }
    }

    public void l() {
        ArrayList arrayList = (ArrayList) this.f9001b;
        arrayList.clear();
        arrayList.add(new sm0(0));
        kw kwVar = (kw) this.f9002c;
        if (kwVar.W0 == 0) {
            if (kwVar.f39919t0) {
                arrayList.add(new sm0(5));
            }
            arrayList.add(new sm0(1));
            arrayList.add(new sm0(4));
            arrayList.add(new sm0(6));
            if (!kwVar.R0) {
                sm0 sm0Var = new sm0(3);
                sm0Var.f39586b = 0;
                arrayList.add(sm0Var);
                xv xvVar = kwVar.f49371e1.H3;
                if (xvVar == null || !xvVar.c()) {
                    arrayList.add(new sm0(2));
                }
                sm0 sm0Var2 = new sm0(3);
                sm0Var2.f39586b = 1;
                arrayList.add(sm0Var2);
                sm0 sm0Var3 = new sm0(3);
                sm0Var3.f39586b = 2;
                arrayList.add(sm0Var3);
                sm0 sm0Var4 = new sm0(3);
                sm0Var4.f39586b = 3;
                arrayList.add(sm0Var4);
                sm0 sm0Var5 = new sm0(3);
                sm0Var5.f39586b = 4;
                arrayList.add(sm0Var5);
            }
        }
    }

    public i4(kw kwVar) {
        this.f9000a = 3;
        this.f9002c = kwVar;
        this.f9001b = new ArrayList();
        l();
    }

    public i4(u91 u91Var) {
        this.f9000a = 7;
        this.f9002c = u91Var;
        ArrayList arrayList = new ArrayList();
        this.f9001b = arrayList;
        arrayList.add(new r91(0));
        r91 r91Var = new r91(2);
        r91Var.f51558b = 0;
        arrayList.add(r91Var);
        r91 r91Var2 = new r91(2);
        r91Var2.f51558b = 1;
        arrayList.add(r91Var2);
        r91 r91Var3 = new r91(2);
        r91Var3.f51558b = 2;
        arrayList.add(r91Var3);
        r91 r91Var4 = new r91(2);
        r91Var4.f51558b = 3;
        arrayList.add(r91Var4);
        r91 r91Var5 = new r91(2);
        r91Var5.f51558b = 4;
        arrayList.add(r91Var5);
    }

    public i4(wg.a0 a0Var, wg.w0 w0Var) {
        this.f9000a = 10;
        this.f9001b = a0Var;
        this.f9002c = w0Var;
    }

    private final void i(View view, int i7, int i10) {
    }

    private final void j(View view, int i7, int i10) {
    }

    private final void k(View view, int i7, int i10) {
    }
}
