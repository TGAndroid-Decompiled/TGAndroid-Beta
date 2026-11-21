package di;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.b31;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.t31;
import org.telegram.ui.Components.tm0;
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
    public final int f9033a;
    public final Object f9034b;
    public final Object f9035c;

    public i4(int i7, Context context, Object obj) {
        this.f9033a = i7;
        this.f9035c = obj;
        this.f9034b = context;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        n4 n4Var;
        fi.a6 a6Var;
        org.telegram.ui.ActionBar.g2 g2Var;
        int i11 = this.f9033a;
        Object obj = this.f9035c;
        switch (i11) {
            case 0:
                f6 f6Var = (f6) obj;
                if (i10 == 0) {
                    f6.j1(f6Var, false);
                    bi.z2 z2Var = f6Var.Y1;
                    if (z2Var != null) {
                        n4Var = z2Var.U1;
                    } else {
                        return;
                    }
                } else if (i10 == 2) {
                    f6.j1(f6Var, true);
                    bi.z2 z2Var2 = f6Var.Z1;
                    if (z2Var2 != null) {
                        n4Var = z2Var2.U1;
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
                    a6Var = fq0Var.f13696e;
                } else {
                    a6Var = (fi.a6) fq0Var.f13697f.get(i7 - 1);
                }
                a6Var.H(null);
                mVar.setList(a6Var);
                mVar.setVisibleHeight(fq0Var.f13701w);
                return;
            case 2:
                if (view instanceof dn) {
                    ((dn) view).f47010a.rd(((bn) obj).J3);
                }
                WeakHashMap weakHashMap = r0.i0.f56285a;
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
                u91Var.I(view, i7, u91Var.f52486e0, true);
                return;
            case 8:
                qb1 qb1Var = (qb1) obj;
                SparseArray sparseArray = qb1Var.f51197a;
                ob1 ob1Var = (ob1) sparseArray.get(i7);
                if (ob1Var != null) {
                    g2Var = ob1Var.f50534a;
                } else {
                    org.telegram.ui.ActionBar.g2 a02 = qb1Var.a0(i7);
                    ob1 ob1Var2 = new ob1(a02);
                    sparseArray.put(i7, ob1Var2);
                    g2Var = a02;
                    ob1Var = ob1Var2;
                }
                if (!ob1Var.f50535b) {
                    g2Var.onFragmentCreate();
                    ob1Var.f50535b = true;
                }
                g2Var.setParentLayout(qb1Var.getParentLayout());
                g2Var.setSimpleMenuOverlayHost(qb1Var);
                if (g2Var.getFragmentView() == null) {
                    g2Var.performCreateView((Context) this.f9034b);
                    g2Var.setTitleOverlayText(qb1Var.f51202n, qb1Var.f51203r, qb1Var.f51204s);
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                View fragmentView = g2Var.getFragmentView();
                org.telegram.messenger.g0.E2(fragmentView);
                if (!g2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29378d6, fragmentView, null);
                }
                frameLayout2.addView(fragmentView, c8.ma.c(-1.0f, -1));
                if (g2Var.getActionBar() != null && g2Var.getActionBar().L) {
                    org.telegram.messenger.g0.E2(g2Var.getActionBar());
                    frameLayout2.addView(g2Var.getActionBar());
                }
                WeakHashMap weakHashMap2 = r0.i0.f56285a;
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
        switch (this.f9033a) {
            case 0:
                f6 f6Var = (f6) this.f9035c;
                if (i7 == 0) {
                    f6.j1(f6Var, false);
                    bi.z2 z2Var = f6Var.Y1;
                    if (z2Var != null) {
                        n4Var = z2Var.U1;
                        org.telegram.messenger.g0.E2(n4Var);
                        FrameLayout frameLayout = new FrameLayout((Context) this.f9034b);
                        frameLayout.addView(n4Var, c8.ma.e(-1, -1, 119));
                        return frameLayout;
                    }
                    return null;
                }
                if (i7 == 1) {
                    n4Var = f6Var.U1;
                } else {
                    if (i7 == 2) {
                        f6.j1(f6Var, true);
                        bi.z2 z2Var2 = f6Var.Z1;
                        if (z2Var2 != null) {
                            n4Var = z2Var2.U1;
                        }
                    }
                    return null;
                }
                org.telegram.messenger.g0.E2(n4Var);
                FrameLayout frameLayout2 = new FrameLayout((Context) this.f9034b);
                frameLayout2.addView(n4Var, c8.ma.e(-1, -1, 119));
                return frameLayout2;
            case 1:
                return new gi.m((fq0) this.f9035c, (Context) this.f9034b);
            case 2:
                Context context = (Context) this.f9034b;
                bn bnVar = (bn) this.f9035c;
                if (i7 == 0) {
                    return new om(bnVar, context);
                }
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 7);
                bundle.putInt("searchType", i7);
                bundle.putString("searchHashtag", bnVar.J3);
                nj njVar = new nj(context, bnVar.getParentLayout(), bundle, 0);
                njVar.h = false;
                cn cnVar = njVar.f47010a;
                cnVar.N.f59051a = bnVar.N;
                cnVar.f46281za = bnVar.Ba;
                cnVar.Aa = bnVar;
                cnVar.f46126n9 = new org.telegram.ui.f(this, 12);
                return njVar;
            case 3:
                kw kwVar = (kw) this.f9035c;
                cx cxVar = kwVar.M0;
                if (i7 == 1) {
                    return kwVar.f40505a0;
                }
                if (i7 == 3) {
                    return kwVar.f40514i0;
                }
                if (i7 == 4) {
                    return kwVar.f40518n0;
                }
                if (i7 == 5) {
                    return kwVar.f40525u0;
                }
                if (i7 == 2) {
                    sl0 sl0Var = new sl0(kwVar.K0, cxVar);
                    kwVar.J0 = sl0Var;
                    sl0Var.b(kwVar.X0, kwVar.Y0, false);
                    kwVar.J0.f39624b.setClipToPadding(false);
                    kwVar.J0.f39624b.j(new sm0(this, 0));
                    kwVar.J0.f39624b.D0(new hb0(kwVar, 22));
                    kwVar.J0.setUiCallback(kwVar);
                    return kwVar.J0;
                } else if (i7 == 6) {
                    return kwVar.f40523s0;
                } else {
                    c00 c00Var = new c00(cxVar);
                    c00Var.setChatPreviewDelegate(kwVar.S0);
                    c00Var.setUiCallback(kwVar);
                    c00Var.j(kwVar.X0, kwVar.Y0, false);
                    dh.c cVar = kwVar.f40506a1;
                    if (cVar != null) {
                        c00Var.setBlurredBackgroundDrawableFactory(cVar);
                    }
                    et etVar = c00Var.f46345b;
                    etVar.setClipToPadding(false);
                    etVar.j(new sm0(this, 1));
                    etVar.D0(new hb0(kwVar, 22));
                    return c00Var;
                }
            case 4:
                FrameLayout frameLayout3 = new FrameLayout((Context) this.f9034b);
                frameLayout3.setOnClickListener(new j40(this, 24));
                return frameLayout3;
            case 5:
                return new py0((qy0) this.f9035c, (Context) this.f9034b);
            case 6:
                FrameLayout frameLayout4 = new FrameLayout((Context) this.f9034b);
                frameLayout4.setOnClickListener(new oy0(this, 9));
                return frameLayout4;
            case 7:
                u91 u91Var = (u91) this.f9035c;
                y91 y91Var = u91Var.f52503w0;
                if (i7 == 1) {
                    return u91Var.W;
                }
                if (i7 == 2) {
                    i10 = ((org.telegram.ui.ActionBar.g2) y91Var).currentAccount;
                    sl0 sl0Var2 = new sl0(i10, y91Var);
                    sl0Var2.f39624b.j(new t91(0));
                    sl0Var2.setUiCallback(u91Var);
                    return sl0Var2;
                }
                c00 c00Var2 = new c00(y91Var);
                c00Var2.setChatPreviewDelegate(u91Var.f52501u0);
                c00Var2.setUiCallback(u91Var);
                c00Var2.f46345b.j(new t91(1));
                return c00Var2;
            case 8:
                return new ih0((Context) this.f9034b, 15);
            case 9:
                org.telegram.ui.Wallet.n6 n6Var = (org.telegram.ui.Wallet.n6) this.f9035c;
                h51[] h51VarArr = n6Var.f44685u0;
                h51 h51Var = h51VarArr[i7];
                if (h51Var == null) {
                    Context context2 = (Context) this.f9034b;
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
                    bi.j7 j7Var = new bi.j7(context2, i11, i12, false, uVar, o4Var, o4Var2, h6Var, i13, 1);
                    h51VarArr[i7] = j7Var;
                    n6Var.e1(i7);
                    qVar = ((org.telegram.ui.ActionBar.g2) n6Var).glassEngine;
                    qVar.b(j7Var);
                    j7Var.setFocusableInTouchMode(false);
                    j7Var.setClipChildren(false);
                    j7Var.setClipToPadding(false);
                    if (i7 == 0) {
                        j7Var.r1();
                    } else {
                        j7Var.setSelectorType(9);
                        j7Var.setSelectorDrawableColor(0);
                    }
                    j7Var.f35796g3.f34068r = false;
                    j7Var.j(new t31(this, i7));
                    h51VarArr[i7] = j7Var;
                    return j7Var;
                }
                return h51Var;
            default:
                if (i7 == 0) {
                    return ((wg.a0) this.f9034b).f30173b;
                }
                return ((wg.w0) this.f9035c).f30173b;
        }
    }

    @Override
    public final int e() {
        switch (this.f9033a) {
            case 0:
                f6 f6Var = (f6) this.f9035c;
                return (f6Var.N1(true) ? 1 : 0) + (f6Var.N1(false) ? 1 : 0) + 1;
            case 1:
                return ((fq0) this.f9035c).f13697f.size() + 1;
            case 2:
                return 3;
            case 3:
                return ((ArrayList) this.f9034b).size();
            case 4:
                return 2;
            case 5:
                return 5;
            case 6:
                return 2;
            case 7:
                return ((ArrayList) this.f9034b).size();
            case 8:
                ((qb1) this.f9035c).getClass();
                return 4;
            case 9:
                if (((org.telegram.ui.Wallet.n6) this.f9035c).f44669g0) {
                    return 2;
                }
                return 1;
            default:
                return 2;
        }
    }

    @Override
    public int f(int i7) {
        switch (this.f9033a) {
            case 1:
                if (i7 == 0) {
                    return 0;
                }
                return ((fi.a6) ((fq0) this.f9035c).f13697f.get(i7 - 1)).E.hashCode();
            default:
                return i7;
        }
    }

    @Override
    public CharSequence g(int i7) {
        int i10;
        int i11 = this.f9033a;
        Object obj = this.f9034b;
        switch (i11) {
            case 1:
                if (i7 == 0) {
                    return gd.N0(2131746514, null);
                }
                return b31.Q0(((fi.a6) ((fq0) this.f9035c).f13697f.get(i7 - 1)).E);
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
                if (((tm0) arrayList.get(i7)).f39953a == 0) {
                    return gd.N0(2131745627, null);
                }
                if (((tm0) arrayList.get(i7)).f39953a == 1) {
                    return gd.N0(2131752246, null);
                }
                if (((tm0) arrayList.get(i7)).f39953a == 4) {
                    return gd.N0(2131754175, null);
                }
                if (((tm0) arrayList.get(i7)).f39953a == 6) {
                    return gd.N0(2131745537, null);
                }
                if (((tm0) arrayList.get(i7)).f39953a == 2) {
                    return gd.N0(2131751331, null);
                }
                if (((tm0) arrayList.get(i7)).f39953a == 5) {
                    return gd.N0(2131746388, null);
                }
                jg.o0 o0Var = jg.q0.f17645k3[((tm0) arrayList.get(i7)).f39954b];
                String str = o0Var.f17629c;
                if (str != null) {
                    return str;
                }
                return gd.N0(o0Var.f17628b, null);
            case 4:
            case 5:
            case 6:
            case 8:
            default:
                return super.g(i7);
            case 7:
                ArrayList arrayList2 = (ArrayList) obj;
                if (((r91) arrayList2.get(i7)).f51522a == 0) {
                    return gd.N0(2131745560, null);
                }
                if (((r91) arrayList2.get(i7)).f51522a == 1) {
                    return gd.N0(2131751331, null);
                }
                jg.o0 o0Var2 = jg.q0.f17645k3[((r91) arrayList2.get(i7)).f51523b];
                String str2 = o0Var2.f17629c;
                if (str2 != null) {
                    return str2;
                }
                return gd.N0(o0Var2.f17628b, null);
            case 9:
                if (i7 == 0) {
                    i10 = 2131742718;
                } else {
                    i10 = 2131742926;
                }
                return gd.N0(i10, null);
        }
    }

    @Override
    public int h(int i7) {
        switch (this.f9033a) {
            case 0:
                return (i7 - (((f6) this.f9035c).N1(false) ? 1 : 0)) + 1;
            case 1:
            case 4:
            case 6:
            case 8:
            default:
                return super.h(i7);
            case 2:
                return i7;
            case 3:
                ArrayList arrayList = (ArrayList) this.f9034b;
                if (((tm0) arrayList.get(i7)).f39953a == 0) {
                    return 1;
                }
                if (((tm0) arrayList.get(i7)).f39953a == 1) {
                    return 3;
                }
                if (((tm0) arrayList.get(i7)).f39953a == 4) {
                    return 4;
                }
                if (((tm0) arrayList.get(i7)).f39953a == 2) {
                    return 2;
                }
                if (((tm0) arrayList.get(i7)).f39953a == 5) {
                    return 5;
                }
                if (((tm0) arrayList.get(i7)).f39953a == 6) {
                    return 6;
                }
                return ((tm0) arrayList.get(i7)).f39953a + i7;
            case 5:
                if (i7 == 0) {
                    return 0;
                }
                return 1;
            case 7:
                ArrayList arrayList2 = (ArrayList) this.f9034b;
                if (((r91) arrayList2.get(i7)).f51522a == 0) {
                    return 1;
                }
                if (((r91) arrayList2.get(i7)).f51522a == 1) {
                    return 2;
                }
                return ((r91) arrayList2.get(i7)).f51522a + i7;
            case 9:
            case 10:
                return i7;
        }
    }

    public void l() {
        ArrayList arrayList = (ArrayList) this.f9034b;
        arrayList.clear();
        arrayList.add(new tm0(0));
        kw kwVar = (kw) this.f9035c;
        if (kwVar.W0 == 0) {
            if (kwVar.f40524t0) {
                arrayList.add(new tm0(5));
            }
            arrayList.add(new tm0(1));
            arrayList.add(new tm0(4));
            arrayList.add(new tm0(6));
            if (!kwVar.R0) {
                tm0 tm0Var = new tm0(3);
                tm0Var.f39954b = 0;
                arrayList.add(tm0Var);
                xv xvVar = kwVar.f49392e1.H3;
                if (xvVar == null || !xvVar.c()) {
                    arrayList.add(new tm0(2));
                }
                tm0 tm0Var2 = new tm0(3);
                tm0Var2.f39954b = 1;
                arrayList.add(tm0Var2);
                tm0 tm0Var3 = new tm0(3);
                tm0Var3.f39954b = 2;
                arrayList.add(tm0Var3);
                tm0 tm0Var4 = new tm0(3);
                tm0Var4.f39954b = 3;
                arrayList.add(tm0Var4);
                tm0 tm0Var5 = new tm0(3);
                tm0Var5.f39954b = 4;
                arrayList.add(tm0Var5);
            }
        }
    }

    public i4(kw kwVar) {
        this.f9033a = 3;
        this.f9035c = kwVar;
        this.f9034b = new ArrayList();
        l();
    }

    public i4(u91 u91Var) {
        this.f9033a = 7;
        this.f9035c = u91Var;
        ArrayList arrayList = new ArrayList();
        this.f9034b = arrayList;
        arrayList.add(new r91(0));
        r91 r91Var = new r91(2);
        r91Var.f51523b = 0;
        arrayList.add(r91Var);
        r91 r91Var2 = new r91(2);
        r91Var2.f51523b = 1;
        arrayList.add(r91Var2);
        r91 r91Var3 = new r91(2);
        r91Var3.f51523b = 2;
        arrayList.add(r91Var3);
        r91 r91Var4 = new r91(2);
        r91Var4.f51523b = 3;
        arrayList.add(r91Var4);
        r91 r91Var5 = new r91(2);
        r91Var5.f51523b = 4;
        arrayList.add(r91Var5);
    }

    public i4(wg.a0 a0Var, wg.w0 w0Var) {
        this.f9033a = 10;
        this.f9034b = a0Var;
        this.f9035c = w0Var;
    }

    private final void i(View view, int i7, int i10) {
    }

    private final void j(View view, int i7, int i10) {
    }

    private final void k(View view, int i7, int i10) {
    }
}
