package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.ui.ActionBar.e;
public final class bn0 extends nic {
    public final byte a;
    public final Object b;
    public final Object c;

    public bn0(ozb ozbVar) {
        this.a = (byte) 9;
        this.c = ozbVar;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(new lzb(0));
        lzb lzbVar = new lzb(2);
        lzbVar.b = (byte) 0;
        arrayList.add(lzbVar);
        lzb lzbVar2 = new lzb(2);
        lzbVar2.b = (byte) 1;
        arrayList.add(lzbVar2);
        lzb lzbVar3 = new lzb(2);
        lzbVar3.b = (byte) 2;
        arrayList.add(lzbVar3);
        lzb lzbVar4 = new lzb(2);
        lzbVar4.b = (byte) 3;
        arrayList.add(lzbVar4);
        lzb lzbVar5 = new lzb(2);
        lzbVar5.b = (byte) 4;
        arrayList.add(lzbVar5);
    }

    @Override
    public final void b(View view, int i, int i2) {
        p5b p5bVar;
        mx4 mx4Var;
        e eVar;
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return;
            case 1:
                gr0 gr0Var = (gr0) view;
                bga bgaVar = (bga) obj;
                if (i == 0) {
                    p5bVar = bgaVar.e;
                } else {
                    p5bVar = (p5b) bgaVar.f.get(i - 1);
                }
                p5bVar.H(null);
                gr0Var.setList(p5bVar);
                gr0Var.setVisibleHeight(bgaVar.w);
                return;
            case 2:
                if (view instanceof hv1) {
                    ((hv1) view).a.rd(((zu1) obj).J3);
                }
                WeakHashMap weakHashMap = ihc.a;
                ygc.c(view);
                return;
            case 3:
                lm7 lm7Var = (lm7) obj;
                jm7[] jm7VarArr = lm7Var.b;
                jm7VarArr[i].f.g3.O(false);
                if (!jm7VarArr[i].l) {
                    lm7Var.w0(i, false);
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                ((mb9) view).a(i2);
                return;
            case 6:
                bj3 bj3Var = (bj3) obj;
                bj3Var.Q(view, i, bj3Var.N0, true);
                return;
            case 7:
                wua wuaVar = (wua) obj;
                if (i2 == 0) {
                    wuaVar.s2(false);
                    mx4Var = wuaVar.X1;
                    if (mx4Var == null) {
                        return;
                    }
                } else if (i2 == 2) {
                    wuaVar.s2(true);
                    mx4Var = wuaVar.Y1;
                    if (mx4Var == null) {
                        return;
                    }
                } else {
                    return;
                }
                jo0 jo0Var = mx4Var.T1;
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                hl.B2(jo0Var);
                frameLayout.addView(jo0Var);
                return;
            case 8:
                return;
            case 9:
                ozb ozbVar = (ozb) obj;
                ozbVar.N(view, i, ozbVar.e0, true);
                return;
            case 10:
                iic iicVar = (iic) obj;
                SparseArray sparseArray = iicVar.a;
                gic gicVar = (gic) sparseArray.get(i);
                if (gicVar != null) {
                    eVar = gicVar.a;
                } else {
                    e Z = iicVar.Z(i);
                    gic gicVar2 = new gic(Z);
                    sparseArray.put(i, gicVar2);
                    eVar = Z;
                    gicVar = gicVar2;
                }
                if (!gicVar.b) {
                    eVar.onFragmentCreate();
                    gicVar.b = true;
                }
                eVar.setParentLayout(iicVar.getParentLayout());
                eVar.setSimpleMenuOverlayHost(iicVar);
                if (eVar.getFragmentView() == null) {
                    eVar.performCreateView((Context) this.b);
                    eVar.setTitleOverlayText(iicVar.n, iicVar.r, iicVar.s);
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                View fragmentView = eVar.getFragmentView();
                hl.B2(fragmentView);
                if (!eVar.hasOwnBackground() && fragmentView.getBackground() == null) {
                    yob.h(aob.d6, null, fragmentView);
                }
                frameLayout2.addView(fragmentView, tre.c(-1.0f, -1));
                if (eVar.getActionBar() != null && eVar.getActionBar().L) {
                    hl.B2(eVar.getActionBar());
                    frameLayout2.addView(eVar.getActionBar());
                }
                WeakHashMap weakHashMap2 = ihc.a;
                ygc.c(frameLayout2);
                iicVar.checkSystemBarColors();
                iicVar.Y();
                return;
            default:
                uqc.c1((q9c) view, false);
                return;
        }
    }

    @Override
    public final View d(int i) {
        vnb vnbVar;
        vnb vnbVar2;
        jo0 jo0Var;
        yg4 yg4Var;
        int i2;
        int i3;
        int i4;
        vnb vnbVar3;
        int i5;
        vy4 vy4Var;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                if (i == 0) {
                    return ((ao0) obj2).b;
                }
                return ((t2a) obj).b;
            case 1:
                return new gr0((bga) obj, (Context) obj2);
            case 2:
                Context context = (Context) obj2;
                zu1 zu1Var = (zu1) obj;
                if (i == 0) {
                    return new lu1(zu1Var, context);
                }
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 7);
                bundle.putInt("searchType", i);
                bundle.putString("searchHashtag", zu1Var.J3);
                jr1 jr1Var = new jr1(context, zu1Var.getParentLayout(), bundle, (byte) 0);
                jr1Var.h = false;
                gv1 gv1Var = jr1Var.a;
                gv1Var.N.a = zu1Var.N;
                gv1Var.za = zu1Var.Ba;
                gv1Var.Aa = zu1Var;
                gv1Var.n9 = new zm9(this, (byte) 16);
                return jr1Var;
            case 3:
                lm7 lm7Var = (lm7) obj;
                jm7 jm7Var = lm7Var.b[i];
                Context context2 = (Context) obj2;
                jm7Var.f = lm7Var.l0(context2, i);
                jm7Var.g = null;
                im7 im7Var = jm7Var.f;
                vnbVar = ((e) lm7Var).resourceProvider;
                w94 w94Var = new w94(context2, im7Var, vnbVar, new oe7(this, i, (byte) 1));
                jm7Var.h = w94Var;
                ll0 ll0Var = lm7Var.getBaseSimpleGlass().c;
                vnbVar2 = ((e) lm7Var).resourceProvider;
                ol0 r = dtd.r(vnbVar2);
                View view = w94Var.d;
                view.setElevation(0.0f);
                jl0 c = ll0Var.c(view, null, false);
                c.p(r);
                c.r(hl.L(20.0f));
                view.setBackground(c);
                view.setClipToOutline(false);
                w94Var.setClipChildren(false);
                w94Var.setClipToPadding(false);
                return jm7Var.h;
            case 4:
                FrameLayout frameLayout = new FrameLayout((Activity) obj2);
                frameLayout.setOnClickListener(new am7(this, (byte) 23));
                return frameLayout;
            case 5:
                return new mb9((nb9) obj, (Context) obj2);
            case 6:
                bj3 bj3Var = (bj3) obj;
                uj3 uj3Var = bj3Var.M0;
                if (i == 1) {
                    return bj3Var.a0;
                }
                if (i == 3) {
                    return bj3Var.i0;
                }
                if (i == 4) {
                    return bj3Var.n0;
                }
                if (i == 5) {
                    return bj3Var.u0;
                }
                if (i == 2) {
                    aw9 aw9Var = new aw9(bj3Var.K0, uj3Var);
                    bj3Var.J0 = aw9Var;
                    aw9Var.b(bj3Var.X0, bj3Var.Y0, false);
                    bj3Var.J0.b.setClipToPadding(false);
                    bj3Var.J0.b.j(new lx9(this, (byte) 0));
                    bj3Var.J0.b.F0(new v59(bj3Var, (byte) 29));
                    bj3Var.J0.setUiCallback(bj3Var);
                    return bj3Var.J0;
                } else if (i == 6) {
                    return bj3Var.s0;
                } else {
                    yg4 yg4Var2 = new yg4(uj3Var);
                    yg4Var2.setChatPreviewDelegate(bj3Var.S0);
                    yg4Var2.setUiCallback(bj3Var);
                    yg4Var2.j(bj3Var.X0, bj3Var.Y0, false);
                    ll0 ll0Var2 = bj3Var.a1;
                    if (ll0Var2 != null) {
                        yg4Var2.setBlurredBackgroundDrawableFactory(ll0Var2);
                    }
                    gu guVar = yg4Var2.b;
                    guVar.setClipToPadding(false);
                    guVar.j(new lx9(this, (byte) 1));
                    guVar.F0(new v59(bj3Var, (byte) 29));
                    return yg4Var2;
                }
            case 7:
                wua wuaVar = (wua) obj;
                if (i == 0) {
                    wuaVar.s2(false);
                    mx4 mx4Var = wuaVar.X1;
                    if (mx4Var == null) {
                        return null;
                    }
                    jo0Var = mx4Var.T1;
                } else if (i == 1) {
                    jo0Var = wuaVar.T1;
                } else if (i != 2) {
                    return null;
                } else {
                    wuaVar.s2(true);
                    mx4 mx4Var2 = wuaVar.Y1;
                    if (mx4Var2 == null) {
                        return null;
                    }
                    jo0Var = mx4Var2.T1;
                }
                hl.B2(jo0Var);
                FrameLayout frameLayout2 = new FrameLayout((Context) obj2);
                frameLayout2.addView(jo0Var, tre.e(-1, -1, 119));
                return frameLayout2;
            case 8:
                FrameLayout frameLayout3 = new FrameLayout((Activity) obj2);
                frameLayout3.setOnClickListener(new kla(this, (byte) 21));
                return frameLayout3;
            case 9:
                ozb ozbVar = (ozb) obj;
                tzb tzbVar = ozbVar.w0;
                if (i == 1) {
                    return ozbVar.W;
                }
                if (i == 2) {
                    i2 = ((e) tzbVar).currentAccount;
                    aw9 aw9Var2 = new aw9(i2, tzbVar);
                    aw9Var2.b.j(new nzb((byte) 0));
                    aw9Var2.setUiCallback(ozbVar);
                    yg4Var = aw9Var2;
                } else {
                    yg4 yg4Var3 = new yg4(tzbVar);
                    yg4Var3.setChatPreviewDelegate(ozbVar.u0);
                    yg4Var3.setUiCallback(ozbVar);
                    yg4Var3.b.j(new nzb((byte) 1));
                    yg4Var = yg4Var3;
                }
                return yg4Var;
            case 10:
                return new ir8((Context) obj2, (byte) 22);
            default:
                uqc uqcVar = (uqc) obj;
                q9c[] q9cVarArr = uqcVar.u0;
                q9c q9cVar = q9cVarArr[i];
                if (q9cVar == null) {
                    Context context3 = (Context) obj2;
                    i3 = ((e) uqcVar).currentAccount;
                    i4 = ((e) uqcVar).classGuid;
                    d0 d0Var = new d0(this, i, (byte) 1);
                    bpc bpcVar = new bpc(uqcVar);
                    bpc bpcVar2 = new bpc(uqcVar);
                    vnbVar3 = ((e) uqcVar).resourceProvider;
                    if (i == 1) {
                        i5 = 3;
                    } else {
                        i5 = -1;
                    }
                    d34 d34Var = new d34(context3, i3, i4, false, d0Var, bpcVar, bpcVar2, vnbVar3, i5, 1);
                    q9cVarArr[i] = d34Var;
                    uqcVar.d1(i);
                    vy4Var = ((e) uqcVar).glassEngine;
                    vy4Var.b(d34Var);
                    d34Var.setFocusableInTouchMode(false);
                    d34Var.setClipChildren(false);
                    d34Var.setClipToPadding(false);
                    if (i == 0) {
                        d34Var.s1();
                    } else {
                        d34Var.setSelectorType(9);
                        d34Var.setSelectorDrawableColor(0);
                    }
                    d34Var.g3.r = false;
                    d34Var.j(new l5c(this, i));
                    q9cVarArr[i] = d34Var;
                    return d34Var;
                }
                return q9cVar;
        }
    }

    @Override
    public final int e() {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return 2;
            case 1:
                return ((bga) obj2).f.size() + 1;
            case 2:
                return 3;
            case 3:
            case 4:
                return 2;
            case 5:
                return 5;
            case 6:
                return ((ArrayList) obj).size();
            case 7:
                wua wuaVar = (wua) obj2;
                return (wuaVar.C1(true) ? 1 : 0) + (wuaVar.C1(false) ? 1 : 0) + 1;
            case 8:
                return 2;
            case 9:
                return ((ArrayList) obj).size();
            case 10:
                return 4;
            default:
                if (!((uqc) obj2).g0) {
                    return 1;
                }
                return 2;
        }
    }

    @Override
    public final int f(int i) {
        switch (this.a) {
            case 1:
                if (i == 0) {
                    return 0;
                }
                return ((p5b) ((bga) this.c).f.get(i - 1)).E.hashCode();
            default:
                return i;
        }
    }

    @Override
    public final CharSequence g(int i) {
        int i2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                if (i == 0) {
                    return ob6.M0(2131746437, null);
                }
                return r3c.L0(((p5b) ((bga) this.c).f.get(i - 1)).E);
            case 2:
                if (i != 1) {
                    if (i != 2) {
                        return ob6.M0(2131745437, null);
                    }
                    return ob6.M0(2131745440, null);
                }
                return ob6.M0(2131745466, null);
            case 6:
                ArrayList arrayList = (ArrayList) obj;
                if (((mx9) arrayList.get(i)).a == 0) {
                    return ob6.M0(2131745551, null);
                }
                if (((mx9) arrayList.get(i)).a == 1) {
                    return ob6.M0(2131752223, null);
                }
                if (((mx9) arrayList.get(i)).a == 4) {
                    return ob6.M0(2131754171, null);
                }
                if (((mx9) arrayList.get(i)).a == 6) {
                    return ob6.M0(2131745461, null);
                }
                if (((mx9) arrayList.get(i)).a == 2) {
                    return ob6.M0(2131751308, null);
                }
                if (((mx9) arrayList.get(i)).a == 5) {
                    return ob6.M0(2131746311, null);
                }
                ph4 ph4Var = rh4.k3[((mx9) arrayList.get(i)).b];
                String str = ph4Var.c;
                if (str != null) {
                    return str;
                }
                return ob6.M0(ph4Var.b, null);
            case 9:
                ArrayList arrayList2 = (ArrayList) obj;
                if (((lzb) arrayList2.get(i)).a == 0) {
                    return ob6.M0(2131745484, null);
                }
                if (((lzb) arrayList2.get(i)).a == 1) {
                    return ob6.M0(2131751308, null);
                }
                ph4 ph4Var2 = rh4.k3[((lzb) arrayList2.get(i)).b];
                String str2 = ph4Var2.c;
                if (str2 != null) {
                    return str2;
                }
                return ob6.M0(ph4Var2.b, null);
            case 11:
                if (i == 0) {
                    i2 = 2131742613;
                } else {
                    i2 = 2131742821;
                }
                return ob6.M0(i2, null);
            default:
                return super.g(i);
        }
    }

    @Override
    public final int h(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
            case 2:
            case 3:
                return i;
            case 1:
            case 4:
            case 8:
            case 10:
            default:
                return super.h(i);
            case 5:
                if (i == 0) {
                    return 0;
                }
                return 1;
            case 6:
                ArrayList arrayList = (ArrayList) obj;
                if (((mx9) arrayList.get(i)).a == 0) {
                    return 1;
                }
                if (((mx9) arrayList.get(i)).a == 1) {
                    return 3;
                }
                if (((mx9) arrayList.get(i)).a == 4) {
                    return 4;
                }
                if (((mx9) arrayList.get(i)).a == 2) {
                    return 2;
                }
                if (((mx9) arrayList.get(i)).a == 5) {
                    return 5;
                }
                if (((mx9) arrayList.get(i)).a == 6) {
                    return 6;
                }
                return ((mx9) arrayList.get(i)).a + i;
            case 7:
                return (i - (((wua) this.c).C1(false) ? 1 : 0)) + 1;
            case 9:
                ArrayList arrayList2 = (ArrayList) obj;
                if (((lzb) arrayList2.get(i)).a == 0) {
                    return 1;
                }
                if (((lzb) arrayList2.get(i)).a == 1) {
                    return 2;
                }
                return ((lzb) arrayList2.get(i)).a + i;
            case 11:
                return i;
        }
    }

    public final void l() {
        ArrayList arrayList = (ArrayList) this.b;
        arrayList.clear();
        arrayList.add(new mx9(0));
        bj3 bj3Var = (bj3) this.c;
        if (bj3Var.W0 == 0) {
            if (bj3Var.t0) {
                arrayList.add(new mx9(5));
            }
            arrayList.add(new mx9(1));
            arrayList.add(new mx9(4));
            arrayList.add(new mx9(6));
            if (!bj3Var.R0) {
                mx9 mx9Var = new mx9(3);
                mx9Var.b = (byte) 0;
                arrayList.add(mx9Var);
                li3 li3Var = bj3Var.d1.H3;
                if (li3Var == null || !li3Var.c()) {
                    arrayList.add(new mx9(2));
                }
                mx9 mx9Var2 = new mx9(3);
                mx9Var2.b = (byte) 1;
                arrayList.add(mx9Var2);
                mx9 mx9Var3 = new mx9(3);
                mx9Var3.b = (byte) 2;
                arrayList.add(mx9Var3);
                mx9 mx9Var4 = new mx9(3);
                mx9Var4.b = (byte) 3;
                arrayList.add(mx9Var4);
                mx9 mx9Var5 = new mx9(3);
                mx9Var5.b = (byte) 4;
                arrayList.add(mx9Var5);
            }
        }
    }

    private final void i(View view, int i, int i2) {
    }

    private final void j(View view, int i, int i2) {
    }

    private final void k(View view, int i, int i2) {
    }

    public bn0(ao0 ao0Var, t2a t2aVar) {
        this.a = (byte) 0;
        this.b = ao0Var;
        this.c = t2aVar;
    }

    public bn0(bj3 bj3Var) {
        this.a = (byte) 6;
        this.c = bj3Var;
        this.b = new ArrayList();
        l();
    }

    public bn0(byte b, Context context, Object obj) {
        this.a = b;
        this.c = obj;
        this.b = context;
    }
}
