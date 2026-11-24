package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.ui.ActionBar.d;
public final class bo0 extends ogc {
    public final byte a;
    public final Object b;
    public final Object c;

    public bo0(nxb nxbVar) {
        this.a = (byte) 8;
        this.c = nxbVar;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(new kxb(0));
        kxb kxbVar = new kxb(2);
        kxbVar.b = (byte) 0;
        arrayList.add(kxbVar);
        kxb kxbVar2 = new kxb(2);
        kxbVar2.b = (byte) 1;
        arrayList.add(kxbVar2);
        kxb kxbVar3 = new kxb(2);
        kxbVar3.b = (byte) 2;
        arrayList.add(kxbVar3);
        kxb kxbVar4 = new kxb(2);
        kxbVar4.b = (byte) 3;
        arrayList.add(kxbVar4);
        kxb kxbVar5 = new kxb(2);
        kxbVar5.b = (byte) 4;
        arrayList.add(kxbVar5);
    }

    @Override
    public final void b(View view, int i, int i2) {
        t3b t3bVar;
        ix4 ix4Var;
        d dVar;
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return;
            case 1:
                gs0 gs0Var = (gs0) view;
                kea keaVar = (kea) obj;
                if (i == 0) {
                    t3bVar = keaVar.e;
                } else {
                    t3bVar = (t3b) keaVar.f.get(i - 1);
                }
                t3bVar.H(null);
                gs0Var.setList(t3bVar);
                gs0Var.setVisibleHeight(keaVar.w);
                return;
            case 2:
                if (view instanceof gw1) {
                    ((gw1) view).a.rd(((yv1) obj).J3);
                }
                WeakHashMap weakHashMap = kfc.a;
                afc.c(view);
                return;
            case 3:
                return;
            case 4:
                ((ca9) view).a(i2);
                return;
            case 5:
                sj3 sj3Var = (sj3) obj;
                sj3Var.P(view, i, sj3Var.N0, true);
                return;
            case 6:
                wsa wsaVar = (wsa) obj;
                if (i2 == 0) {
                    wsaVar.r2(false);
                    ix4Var = wsaVar.X1;
                    if (ix4Var == null) {
                        return;
                    }
                } else if (i2 == 2) {
                    wsaVar.r2(true);
                    ix4Var = wsaVar.Y1;
                    if (ix4Var == null) {
                        return;
                    }
                } else {
                    return;
                }
                jp0 jp0Var = ix4Var.T1;
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                gm.B2(jp0Var);
                frameLayout.addView(jp0Var);
                return;
            case 7:
                return;
            case 8:
                nxb nxbVar = (nxb) obj;
                nxbVar.M(view, i, nxbVar.e0, true);
                return;
            case 9:
                jgc jgcVar = (jgc) obj;
                SparseArray sparseArray = jgcVar.a;
                hgc hgcVar = (hgc) sparseArray.get(i);
                if (hgcVar != null) {
                    dVar = hgcVar.a;
                } else {
                    d a0 = jgcVar.a0(i);
                    hgc hgcVar2 = new hgc(a0);
                    sparseArray.put(i, hgcVar2);
                    dVar = a0;
                    hgcVar = hgcVar2;
                }
                if (!hgcVar.b) {
                    dVar.onFragmentCreate();
                    hgcVar.b = true;
                }
                dVar.setParentLayout(jgcVar.getParentLayout());
                dVar.setSimpleMenuOverlayHost(jgcVar);
                if (dVar.getFragmentView() == null) {
                    dVar.performCreateView((Context) this.b);
                    dVar.setTitleOverlayText(jgcVar.n, jgcVar.r, jgcVar.s);
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                View fragmentView = dVar.getFragmentView();
                gm.B2(fragmentView);
                if (!dVar.hasOwnBackground() && fragmentView.getBackground() == null) {
                    anb.h(cmb.c6, null, fragmentView);
                }
                frameLayout2.addView(fragmentView, qoe.c(-1.0f, -1));
                if (dVar.getActionBar() != null && dVar.getActionBar().L) {
                    gm.B2(dVar.getActionBar());
                    frameLayout2.addView(dVar.getActionBar());
                }
                WeakHashMap weakHashMap2 = kfc.a;
                afc.c(frameLayout2);
                jgcVar.checkSystemBarColors();
                jgcVar.Z();
                return;
            default:
                goc.d1((q7c) view, false);
                return;
        }
    }

    @Override
    public final View d(int i) {
        jp0 jp0Var;
        ch4 ch4Var;
        int i2;
        int i3;
        int i4;
        ylb ylbVar;
        int i5;
        sy4 sy4Var;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                if (i == 0) {
                    return ((ap0) obj2).b;
                }
                return ((b1a) obj).b;
            case 1:
                return new gs0((kea) obj, (Context) obj2);
            case 2:
                Context context = (Context) obj2;
                yv1 yv1Var = (yv1) obj;
                if (i == 0) {
                    return new kv1(yv1Var, context);
                }
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 7);
                bundle.putInt("searchType", i);
                bundle.putString("searchHashtag", yv1Var.J3);
                is1 is1Var = new is1(context, yv1Var.getParentLayout(), bundle, (byte) 0);
                is1Var.h = false;
                fw1 fw1Var = is1Var.a;
                fw1Var.N.a = yv1Var.N;
                fw1Var.za = yv1Var.Ba;
                fw1Var.Aa = yv1Var;
                fw1Var.n9 = new nl9(this, (byte) 16);
                return is1Var;
            case 3:
                FrameLayout frameLayout = new FrameLayout((Activity) obj2);
                frameLayout.setOnClickListener(new m67(this, (byte) 24));
                return frameLayout;
            case 4:
                return new ca9((da9) obj, (Context) obj2);
            case 5:
                sj3 sj3Var = (sj3) obj;
                nk3 nk3Var = sj3Var.M0;
                if (i == 1) {
                    return sj3Var.a0;
                }
                if (i == 3) {
                    return sj3Var.i0;
                }
                if (i == 4) {
                    return sj3Var.n0;
                }
                if (i == 5) {
                    return sj3Var.u0;
                }
                if (i == 2) {
                    ju9 ju9Var = new ju9(sj3Var.K0, nk3Var);
                    sj3Var.J0 = ju9Var;
                    ju9Var.b(sj3Var.X0, sj3Var.Y0, false);
                    sj3Var.J0.b.setClipToPadding(false);
                    sj3Var.J0.b.j(new tv9(this, (byte) 0));
                    sj3Var.J0.b.E0(new kf9(sj3Var, (byte) 21));
                    sj3Var.J0.setUiCallback(sj3Var);
                    return sj3Var.J0;
                } else if (i == 6) {
                    return sj3Var.s0;
                } else {
                    ch4 ch4Var2 = new ch4(nk3Var);
                    ch4Var2.setChatPreviewDelegate(sj3Var.S0);
                    ch4Var2.setUiCallback(sj3Var);
                    ch4Var2.j(sj3Var.X0, sj3Var.Y0, false);
                    km0 km0Var = sj3Var.a1;
                    if (km0Var != null) {
                        ch4Var2.setBlurredBackgroundDrawableFactory(km0Var);
                    }
                    fv fvVar = ch4Var2.b;
                    fvVar.setClipToPadding(false);
                    fvVar.j(new tv9(this, (byte) 1));
                    fvVar.E0(new kf9(sj3Var, (byte) 21));
                    return ch4Var2;
                }
            case 6:
                wsa wsaVar = (wsa) obj;
                if (i == 0) {
                    wsaVar.r2(false);
                    ix4 ix4Var = wsaVar.X1;
                    if (ix4Var != null) {
                        jp0Var = ix4Var.T1;
                        gm.B2(jp0Var);
                        FrameLayout frameLayout2 = new FrameLayout((Context) obj2);
                        frameLayout2.addView(jp0Var, qoe.e(-1, -1, 119));
                        return frameLayout2;
                    }
                    return null;
                }
                if (i == 1) {
                    jp0Var = wsaVar.T1;
                } else {
                    if (i == 2) {
                        wsaVar.r2(true);
                        ix4 ix4Var2 = wsaVar.Y1;
                        if (ix4Var2 != null) {
                            jp0Var = ix4Var2.T1;
                        }
                    }
                    return null;
                }
                gm.B2(jp0Var);
                FrameLayout frameLayout22 = new FrameLayout((Context) obj2);
                frameLayout22.addView(jp0Var, qoe.e(-1, -1, 119));
                return frameLayout22;
            case 7:
                FrameLayout frameLayout3 = new FrameLayout((Activity) obj2);
                frameLayout3.setOnClickListener(new oha(this, (byte) 23));
                return frameLayout3;
            case 8:
                nxb nxbVar = (nxb) obj;
                sxb sxbVar = nxbVar.w0;
                if (i == 1) {
                    return nxbVar.W;
                }
                if (i == 2) {
                    i2 = ((d) sxbVar).currentAccount;
                    ju9 ju9Var2 = new ju9(i2, sxbVar);
                    ju9Var2.b.j(new mxb((byte) 0));
                    ju9Var2.setUiCallback(nxbVar);
                    ch4Var = ju9Var2;
                } else {
                    ch4 ch4Var3 = new ch4(sxbVar);
                    ch4Var3.setChatPreviewDelegate(nxbVar.u0);
                    ch4Var3.setUiCallback(nxbVar);
                    ch4Var3.b.j(new mxb((byte) 1));
                    ch4Var = ch4Var3;
                }
                return ch4Var;
            case 9:
                return new ct8((Context) obj2, (byte) 21);
            default:
                goc gocVar = (goc) obj;
                q7c[] q7cVarArr = gocVar.u0;
                q7c q7cVar = q7cVarArr[i];
                if (q7cVar == null) {
                    Context context2 = (Context) obj2;
                    i3 = ((d) gocVar).currentAccount;
                    i4 = ((d) gocVar).classGuid;
                    c0 c0Var = new c0(this, i, (byte) 1);
                    omc omcVar = new omc(gocVar);
                    omc omcVar2 = new omc(gocVar);
                    ylbVar = ((d) gocVar).resourceProvider;
                    if (i == 1) {
                        i5 = 3;
                    } else {
                        i5 = -1;
                    }
                    t34 t34Var = new t34(context2, i3, i4, false, c0Var, omcVar, omcVar2, ylbVar, i5, 1);
                    q7cVarArr[i] = t34Var;
                    gocVar.e1(i);
                    sy4Var = ((d) gocVar).glassEngine;
                    sy4Var.b(t34Var);
                    t34Var.setFocusableInTouchMode(false);
                    t34Var.setClipChildren(false);
                    t34Var.setClipToPadding(false);
                    if (i == 0) {
                        t34Var.r1();
                    } else {
                        t34Var.setSelectorType(9);
                        t34Var.setSelectorDrawableColor(0);
                    }
                    t34Var.g3.r = false;
                    t34Var.j(new m3c(this, i));
                    q7cVarArr[i] = t34Var;
                    return t34Var;
                }
                return q7cVar;
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
                return ((kea) obj2).f.size() + 1;
            case 2:
                return 3;
            case 3:
                return 2;
            case 4:
                return 5;
            case 5:
                return ((ArrayList) obj).size();
            case 6:
                wsa wsaVar = (wsa) obj2;
                return (wsaVar.B1(true) ? 1 : 0) + (wsaVar.B1(false) ? 1 : 0) + 1;
            case 7:
                return 2;
            case 8:
                return ((ArrayList) obj).size();
            case 9:
                return 4;
            default:
                if (!((goc) obj2).g0) {
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
                return ((t3b) ((kea) this.c).f.get(i - 1)).E.hashCode();
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
                    return jb6.M0(2131746443, null);
                }
                return s1c.K0(((t3b) ((kea) this.c).f.get(i - 1)).E);
            case 2:
                if (i != 1) {
                    if (i != 2) {
                        return jb6.M0(2131745443, null);
                    }
                    return jb6.M0(2131745446, null);
                }
                return jb6.M0(2131745472, null);
            case 5:
                ArrayList arrayList = (ArrayList) obj;
                if (((uv9) arrayList.get(i)).a == 0) {
                    return jb6.M0(2131745557, null);
                }
                if (((uv9) arrayList.get(i)).a == 1) {
                    return jb6.M0(2131752195, null);
                }
                if (((uv9) arrayList.get(i)).a == 4) {
                    return jb6.M0(2131754143, null);
                }
                if (((uv9) arrayList.get(i)).a == 6) {
                    return jb6.M0(2131745467, null);
                }
                if (((uv9) arrayList.get(i)).a == 2) {
                    return jb6.M0(2131751280, null);
                }
                if (((uv9) arrayList.get(i)).a == 5) {
                    return jb6.M0(2131746317, null);
                }
                sh4 sh4Var = uh4.k3[((uv9) arrayList.get(i)).b];
                String str = sh4Var.c;
                if (str != null) {
                    return str;
                }
                return jb6.M0(sh4Var.b, null);
            case 8:
                ArrayList arrayList2 = (ArrayList) obj;
                if (((kxb) arrayList2.get(i)).a == 0) {
                    return jb6.M0(2131745490, null);
                }
                if (((kxb) arrayList2.get(i)).a == 1) {
                    return jb6.M0(2131751280, null);
                }
                sh4 sh4Var2 = uh4.k3[((kxb) arrayList2.get(i)).b];
                String str2 = sh4Var2.c;
                if (str2 != null) {
                    return str2;
                }
                return jb6.M0(sh4Var2.b, null);
            case 10:
                if (i == 0) {
                    i2 = 2131742645;
                } else {
                    i2 = 2131742853;
                }
                return jb6.M0(i2, null);
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
                return i;
            case 1:
            case 3:
            case 7:
            case 9:
            default:
                return super.h(i);
            case 4:
                if (i == 0) {
                    return 0;
                }
                return 1;
            case 5:
                ArrayList arrayList = (ArrayList) obj;
                if (((uv9) arrayList.get(i)).a == 0) {
                    return 1;
                }
                if (((uv9) arrayList.get(i)).a == 1) {
                    return 3;
                }
                if (((uv9) arrayList.get(i)).a == 4) {
                    return 4;
                }
                if (((uv9) arrayList.get(i)).a == 2) {
                    return 2;
                }
                if (((uv9) arrayList.get(i)).a == 5) {
                    return 5;
                }
                if (((uv9) arrayList.get(i)).a == 6) {
                    return 6;
                }
                return ((uv9) arrayList.get(i)).a + i;
            case 6:
                return (i - (((wsa) this.c).B1(false) ? 1 : 0)) + 1;
            case 8:
                ArrayList arrayList2 = (ArrayList) obj;
                if (((kxb) arrayList2.get(i)).a == 0) {
                    return 1;
                }
                if (((kxb) arrayList2.get(i)).a == 1) {
                    return 2;
                }
                return ((kxb) arrayList2.get(i)).a + i;
            case 10:
                return i;
        }
    }

    public final void l() {
        ArrayList arrayList = (ArrayList) this.b;
        arrayList.clear();
        arrayList.add(new uv9(0));
        sj3 sj3Var = (sj3) this.c;
        if (sj3Var.W0 == 0) {
            if (sj3Var.t0) {
                arrayList.add(new uv9(5));
            }
            arrayList.add(new uv9(1));
            arrayList.add(new uv9(4));
            arrayList.add(new uv9(6));
            if (!sj3Var.R0) {
                uv9 uv9Var = new uv9(3);
                uv9Var.b = (byte) 0;
                arrayList.add(uv9Var);
                dj3 dj3Var = sj3Var.d1.H3;
                if (dj3Var == null || !dj3Var.c()) {
                    arrayList.add(new uv9(2));
                }
                uv9 uv9Var2 = new uv9(3);
                uv9Var2.b = (byte) 1;
                arrayList.add(uv9Var2);
                uv9 uv9Var3 = new uv9(3);
                uv9Var3.b = (byte) 2;
                arrayList.add(uv9Var3);
                uv9 uv9Var4 = new uv9(3);
                uv9Var4.b = (byte) 3;
                arrayList.add(uv9Var4);
                uv9 uv9Var5 = new uv9(3);
                uv9Var5.b = (byte) 4;
                arrayList.add(uv9Var5);
            }
        }
    }

    private final void i(View view, int i, int i2) {
    }

    private final void j(View view, int i, int i2) {
    }

    private final void k(View view, int i, int i2) {
    }

    public bo0(ap0 ap0Var, b1a b1aVar) {
        this.a = (byte) 0;
        this.b = ap0Var;
        this.c = b1aVar;
    }

    public bo0(sj3 sj3Var) {
        this.a = (byte) 5;
        this.c = sj3Var;
        this.b = new ArrayList();
        l();
    }

    public bo0(byte b, Context context, Object obj) {
        this.a = b;
        this.c = obj;
        this.b = context;
    }
}
