package di;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.dq0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.y21;
import org.telegram.ui.Components.y61;
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
public final class i4 extends y61 {
    public final int f9006a;
    public final Object f9007b;
    public final Object f9008c;

    public i4(int i7, Context context, Object obj) {
        this.f9006a = i7;
        this.f9008c = obj;
        this.f9007b = context;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        n4 n4Var;
        fi.z5 z5Var;
        org.telegram.ui.ActionBar.h2 h2Var;
        int i11 = this.f9006a;
        Object obj = this.f9008c;
        switch (i11) {
            case 0:
                f6 f6Var = (f6) obj;
                if (i10 == 0) {
                    f6.j1(f6Var, false);
                    bi.v2 v2Var = f6Var.Y1;
                    if (v2Var != null) {
                        n4Var = v2Var.U1;
                    } else {
                        return;
                    }
                } else if (i10 == 2) {
                    f6.j1(f6Var, true);
                    bi.v2 v2Var2 = f6Var.Z1;
                    if (v2Var2 != null) {
                        n4Var = v2Var2.U1;
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
                dq0 dq0Var = (dq0) obj;
                gi.m mVar = (gi.m) view;
                if (i7 == 0) {
                    z5Var = dq0Var.f13667e;
                } else {
                    z5Var = (fi.z5) dq0Var.f13668f.get(i7 - 1);
                }
                z5Var.H(null);
                mVar.setList(z5Var);
                mVar.setVisibleHeight(dq0Var.f13672w);
                return;
            case 2:
                if (view instanceof dn) {
                    ((dn) view).f46944a.rd(((bn) obj).J3);
                }
                WeakHashMap weakHashMap = r0.i0.f56244a;
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
                u91Var.I(view, i7, u91Var.f52472e0, true);
                return;
            case 8:
                qb1 qb1Var = (qb1) obj;
                SparseArray sparseArray = qb1Var.f51151a;
                ob1 ob1Var = (ob1) sparseArray.get(i7);
                if (ob1Var != null) {
                    h2Var = ob1Var.f50509a;
                } else {
                    org.telegram.ui.ActionBar.h2 a02 = qb1Var.a0(i7);
                    ob1 ob1Var2 = new ob1(a02);
                    sparseArray.put(i7, ob1Var2);
                    h2Var = a02;
                    ob1Var = ob1Var2;
                }
                if (!ob1Var.f50510b) {
                    h2Var.onFragmentCreate();
                    ob1Var.f50510b = true;
                }
                h2Var.setParentLayout(qb1Var.getParentLayout());
                h2Var.setSimpleMenuOverlayHost(qb1Var);
                if (h2Var.getFragmentView() == null) {
                    h2Var.performCreateView((Context) this.f9007b);
                    h2Var.setTitleOverlayText(qb1Var.f51156n, qb1Var.f51157r, qb1Var.f51158s);
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                View fragmentView = h2Var.getFragmentView();
                org.telegram.messenger.g0.E2(fragmentView);
                if (!h2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, fragmentView, null);
                }
                frameLayout2.addView(fragmentView, c8.ma.c(-1.0f, -1));
                if (h2Var.getActionBar() != null && h2Var.getActionBar().L) {
                    org.telegram.messenger.g0.E2(h2Var.getActionBar());
                    frameLayout2.addView(h2Var.getActionBar());
                }
                WeakHashMap weakHashMap2 = r0.i0.f56244a;
                r0.y.c(frameLayout2);
                qb1Var.checkSystemBarColors();
                qb1Var.Z();
                return;
            case 9:
                org.telegram.ui.Wallet.n6.d1((e51) view, false);
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
        switch (this.f9006a) {
            case 0:
                f6 f6Var = (f6) this.f9008c;
                if (i7 == 0) {
                    f6.j1(f6Var, false);
                    bi.v2 v2Var = f6Var.Y1;
                    if (v2Var != null) {
                        n4Var = v2Var.U1;
                        org.telegram.messenger.g0.E2(n4Var);
                        FrameLayout frameLayout = new FrameLayout((Context) this.f9007b);
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
                        bi.v2 v2Var2 = f6Var.Z1;
                        if (v2Var2 != null) {
                            n4Var = v2Var2.U1;
                        }
                    }
                    return null;
                }
                org.telegram.messenger.g0.E2(n4Var);
                FrameLayout frameLayout2 = new FrameLayout((Context) this.f9007b);
                frameLayout2.addView(n4Var, c8.ma.e(-1, -1, 119));
                return frameLayout2;
            case 1:
                return new gi.m((dq0) this.f9008c, (Context) this.f9007b);
            case 2:
                Context context = (Context) this.f9007b;
                bn bnVar = (bn) this.f9008c;
                if (i7 == 0) {
                    return new om(bnVar, context);
                }
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 7);
                bundle.putInt("searchType", i7);
                bundle.putString("searchHashtag", bnVar.J3);
                nj njVar = new nj(context, bnVar.getParentLayout(), bundle, 0);
                njVar.h = false;
                cn cnVar = njVar.f46944a;
                cnVar.N.f59013a = bnVar.N;
                cnVar.f46258za = bnVar.Ba;
                cnVar.Aa = bnVar;
                cnVar.f46103n9 = new org.telegram.ui.f(this, 12);
                return njVar;
            case 3:
                kw kwVar = (kw) this.f9008c;
                cx cxVar = kwVar.M0;
                if (i7 == 1) {
                    return kwVar.f39180a0;
                }
                if (i7 == 3) {
                    return kwVar.f39189i0;
                }
                if (i7 == 4) {
                    return kwVar.f39193n0;
                }
                if (i7 == 5) {
                    return kwVar.f39200u0;
                }
                if (i7 == 2) {
                    ql0 ql0Var = new ql0(kwVar.K0, cxVar);
                    kwVar.J0 = ql0Var;
                    ql0Var.b(kwVar.X0, kwVar.Y0, false);
                    kwVar.J0.f38828b.setClipToPadding(false);
                    kwVar.J0.f38828b.j(new pm0(this, 0));
                    kwVar.J0.f38828b.D0(new gb0(kwVar, 22));
                    kwVar.J0.setUiCallback(kwVar);
                    return kwVar.J0;
                } else if (i7 == 6) {
                    return kwVar.f39198s0;
                } else {
                    c00 c00Var = new c00(cxVar);
                    c00Var.setChatPreviewDelegate(kwVar.S0);
                    c00Var.setUiCallback(kwVar);
                    c00Var.j(kwVar.X0, kwVar.Y0, false);
                    dh.c cVar = kwVar.f39181a1;
                    if (cVar != null) {
                        c00Var.setBlurredBackgroundDrawableFactory(cVar);
                    }
                    et etVar = c00Var.f46322b;
                    etVar.setClipToPadding(false);
                    etVar.j(new pm0(this, 1));
                    etVar.D0(new gb0(kwVar, 22));
                    return c00Var;
                }
            case 4:
                FrameLayout frameLayout3 = new FrameLayout((Context) this.f9007b);
                frameLayout3.setOnClickListener(new j40(this, 24));
                return frameLayout3;
            case 5:
                return new py0((qy0) this.f9008c, (Context) this.f9007b);
            case 6:
                FrameLayout frameLayout4 = new FrameLayout((Context) this.f9007b);
                frameLayout4.setOnClickListener(new oy0(this, 9));
                return frameLayout4;
            case 7:
                u91 u91Var = (u91) this.f9008c;
                y91 y91Var = u91Var.f52489w0;
                if (i7 == 1) {
                    return u91Var.W;
                }
                if (i7 == 2) {
                    i10 = ((org.telegram.ui.ActionBar.h2) y91Var).currentAccount;
                    ql0 ql0Var2 = new ql0(i10, y91Var);
                    ql0Var2.f38828b.j(new t91(0));
                    ql0Var2.setUiCallback(u91Var);
                    return ql0Var2;
                }
                c00 c00Var2 = new c00(y91Var);
                c00Var2.setChatPreviewDelegate(u91Var.f52487u0);
                c00Var2.setUiCallback(u91Var);
                c00Var2.f46322b.j(new t91(1));
                return c00Var2;
            case 8:
                return new ih0((Context) this.f9007b, 15);
            case 9:
                org.telegram.ui.Wallet.n6 n6Var = (org.telegram.ui.Wallet.n6) this.f9008c;
                e51[] e51VarArr = n6Var.f44645u0;
                e51 e51Var = e51VarArr[i7];
                if (e51Var == null) {
                    Context context2 = (Context) this.f9007b;
                    i11 = ((org.telegram.ui.ActionBar.h2) n6Var).currentAccount;
                    i12 = ((org.telegram.ui.ActionBar.h2) n6Var).classGuid;
                    org.telegram.ui.Components.t tVar = new org.telegram.ui.Components.t(this, i7, 1);
                    org.telegram.ui.Wallet.o4 o4Var = new org.telegram.ui.Wallet.o4(n6Var);
                    org.telegram.ui.Wallet.o4 o4Var2 = new org.telegram.ui.Wallet.o4(n6Var);
                    i6Var = ((org.telegram.ui.ActionBar.h2) n6Var).resourceProvider;
                    if (i7 == 1) {
                        i13 = 3;
                    } else {
                        i13 = -1;
                    }
                    bi.f7 f7Var = new bi.f7(context2, i11, i12, false, tVar, o4Var, o4Var2, i6Var, i13, 1);
                    e51VarArr[i7] = f7Var;
                    n6Var.e1(i7);
                    qVar = ((org.telegram.ui.ActionBar.h2) n6Var).glassEngine;
                    qVar.b(f7Var);
                    f7Var.setFocusableInTouchMode(false);
                    f7Var.setClipChildren(false);
                    f7Var.setClipToPadding(false);
                    if (i7 == 0) {
                        f7Var.r1();
                    } else {
                        f7Var.setSelectorType(9);
                        f7Var.setSelectorDrawableColor(0);
                    }
                    f7Var.f34607g3.f42809r = false;
                    f7Var.j(new q31(this, i7));
                    e51VarArr[i7] = f7Var;
                    return f7Var;
                }
                return e51Var;
            default:
                if (i7 == 0) {
                    return ((wg.a0) this.f9007b).f30190b;
                }
                return ((wg.w0) this.f9008c).f30190b;
        }
    }

    @Override
    public final int e() {
        switch (this.f9006a) {
            case 0:
                f6 f6Var = (f6) this.f9008c;
                return (f6Var.N1(true) ? 1 : 0) + (f6Var.N1(false) ? 1 : 0) + 1;
            case 1:
                return ((dq0) this.f9008c).f13668f.size() + 1;
            case 2:
                return 3;
            case 3:
                return ((ArrayList) this.f9007b).size();
            case 4:
                return 2;
            case 5:
                return 5;
            case 6:
                return 2;
            case 7:
                return ((ArrayList) this.f9007b).size();
            case 8:
                ((qb1) this.f9008c).getClass();
                return 4;
            case 9:
                if (((org.telegram.ui.Wallet.n6) this.f9008c).f44629g0) {
                    return 2;
                }
                return 1;
            default:
                return 2;
        }
    }

    @Override
    public int f(int i7) {
        switch (this.f9006a) {
            case 1:
                if (i7 == 0) {
                    return 0;
                }
                return ((fi.z5) ((dq0) this.f9008c).f13668f.get(i7 - 1)).E.hashCode();
            default:
                return i7;
        }
    }

    @Override
    public CharSequence g(int i7) {
        int i10;
        int i11 = this.f9006a;
        Object obj = this.f9007b;
        switch (i11) {
            case 1:
                if (i7 == 0) {
                    return gd.M0(2131746515, null);
                }
                return y21.Q0(((fi.z5) ((dq0) this.f9008c).f13668f.get(i7 - 1)).E);
            case 2:
                if (i7 != 1) {
                    if (i7 != 2) {
                        return gd.M0(2131745514, null);
                    }
                    return gd.M0(2131745517, null);
                }
                return gd.M0(2131745543, null);
            case 3:
                ArrayList arrayList = (ArrayList) obj;
                if (((qm0) arrayList.get(i7)).f38841a == 0) {
                    return gd.M0(2131745628, null);
                }
                if (((qm0) arrayList.get(i7)).f38841a == 1) {
                    return gd.M0(2131752247, null);
                }
                if (((qm0) arrayList.get(i7)).f38841a == 4) {
                    return gd.M0(2131754176, null);
                }
                if (((qm0) arrayList.get(i7)).f38841a == 6) {
                    return gd.M0(2131745538, null);
                }
                if (((qm0) arrayList.get(i7)).f38841a == 2) {
                    return gd.M0(2131751332, null);
                }
                if (((qm0) arrayList.get(i7)).f38841a == 5) {
                    return gd.M0(2131746389, null);
                }
                jg.o0 o0Var = jg.q0.f17620k3[((qm0) arrayList.get(i7)).f38842b];
                String str = o0Var.f17604c;
                if (str != null) {
                    return str;
                }
                return gd.M0(o0Var.f17603b, null);
            case 4:
            case 5:
            case 6:
            case 8:
            default:
                return super.g(i7);
            case 7:
                ArrayList arrayList2 = (ArrayList) obj;
                if (((r91) arrayList2.get(i7)).f51533a == 0) {
                    return gd.M0(2131745561, null);
                }
                if (((r91) arrayList2.get(i7)).f51533a == 1) {
                    return gd.M0(2131751332, null);
                }
                jg.o0 o0Var2 = jg.q0.f17620k3[((r91) arrayList2.get(i7)).f51534b];
                String str2 = o0Var2.f17604c;
                if (str2 != null) {
                    return str2;
                }
                return gd.M0(o0Var2.f17603b, null);
            case 9:
                if (i7 == 0) {
                    i10 = 2131742724;
                } else {
                    i10 = 2131742932;
                }
                return gd.M0(i10, null);
        }
    }

    @Override
    public int h(int i7) {
        switch (this.f9006a) {
            case 0:
                return (i7 - (((f6) this.f9008c).N1(false) ? 1 : 0)) + 1;
            case 1:
            case 4:
            case 6:
            case 8:
            default:
                return super.h(i7);
            case 2:
                return i7;
            case 3:
                ArrayList arrayList = (ArrayList) this.f9007b;
                if (((qm0) arrayList.get(i7)).f38841a == 0) {
                    return 1;
                }
                if (((qm0) arrayList.get(i7)).f38841a == 1) {
                    return 3;
                }
                if (((qm0) arrayList.get(i7)).f38841a == 4) {
                    return 4;
                }
                if (((qm0) arrayList.get(i7)).f38841a == 2) {
                    return 2;
                }
                if (((qm0) arrayList.get(i7)).f38841a == 5) {
                    return 5;
                }
                if (((qm0) arrayList.get(i7)).f38841a == 6) {
                    return 6;
                }
                return ((qm0) arrayList.get(i7)).f38841a + i7;
            case 5:
                if (i7 == 0) {
                    return 0;
                }
                return 1;
            case 7:
                ArrayList arrayList2 = (ArrayList) this.f9007b;
                if (((r91) arrayList2.get(i7)).f51533a == 0) {
                    return 1;
                }
                if (((r91) arrayList2.get(i7)).f51533a == 1) {
                    return 2;
                }
                return ((r91) arrayList2.get(i7)).f51533a + i7;
            case 9:
            case 10:
                return i7;
        }
    }

    public void l() {
        ArrayList arrayList = (ArrayList) this.f9007b;
        arrayList.clear();
        arrayList.add(new qm0(0));
        kw kwVar = (kw) this.f9008c;
        if (kwVar.W0 == 0) {
            if (kwVar.f39199t0) {
                arrayList.add(new qm0(5));
            }
            arrayList.add(new qm0(1));
            arrayList.add(new qm0(4));
            arrayList.add(new qm0(6));
            if (!kwVar.R0) {
                qm0 qm0Var = new qm0(3);
                qm0Var.f38842b = 0;
                arrayList.add(qm0Var);
                xv xvVar = kwVar.f49351e1.H3;
                if (xvVar == null || !xvVar.c()) {
                    arrayList.add(new qm0(2));
                }
                qm0 qm0Var2 = new qm0(3);
                qm0Var2.f38842b = 1;
                arrayList.add(qm0Var2);
                qm0 qm0Var3 = new qm0(3);
                qm0Var3.f38842b = 2;
                arrayList.add(qm0Var3);
                qm0 qm0Var4 = new qm0(3);
                qm0Var4.f38842b = 3;
                arrayList.add(qm0Var4);
                qm0 qm0Var5 = new qm0(3);
                qm0Var5.f38842b = 4;
                arrayList.add(qm0Var5);
            }
        }
    }

    public i4(kw kwVar) {
        this.f9006a = 3;
        this.f9008c = kwVar;
        this.f9007b = new ArrayList();
        l();
    }

    public i4(u91 u91Var) {
        this.f9006a = 7;
        this.f9008c = u91Var;
        ArrayList arrayList = new ArrayList();
        this.f9007b = arrayList;
        arrayList.add(new r91(0));
        r91 r91Var = new r91(2);
        r91Var.f51534b = 0;
        arrayList.add(r91Var);
        r91 r91Var2 = new r91(2);
        r91Var2.f51534b = 1;
        arrayList.add(r91Var2);
        r91 r91Var3 = new r91(2);
        r91Var3.f51534b = 2;
        arrayList.add(r91Var3);
        r91 r91Var4 = new r91(2);
        r91Var4.f51534b = 3;
        arrayList.add(r91Var4);
        r91 r91Var5 = new r91(2);
        r91Var5.f51534b = 4;
        arrayList.add(r91Var5);
    }

    public i4(wg.a0 a0Var, wg.w0 w0Var) {
        this.f9006a = 10;
        this.f9007b = a0Var;
        this.f9008c = w0Var;
    }

    private final void i(View view, int i7, int i10) {
    }

    private final void j(View view, int i7, int i10) {
    }

    private final void k(View view, int i7, int i10) {
    }
}
